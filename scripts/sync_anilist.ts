import {
  AnimeData,
  diffAnimeList,
  loadAnimeData,
} from "./anime_sync_common.ts";
import { open } from "open";
import { load } from "dotenv";
import { join, fromFileUrl } from "path";
import { EntryStatus } from "nrslib/exts/DAH_entry_progress.ts";
await load({ export: true });

function getRedirectPort(): number | undefined {
  const env = Deno.env.get("ANILIST_REDIRECT_PORT");
  if (env !== undefined) {
    try {
      return parseInt(env);
    } catch (e) {
      console.error(e);
    }
  }

  return undefined;
}

const AUTH_PATH = join(
  fromFileUrl(import.meta.url),
  "../../output/anilist_auth.json",
);

async function authenciate(): Promise<string> {
  const port = getRedirectPort() ?? 7272;
  const id = Deno.env.get("ANILIST_API_ID");
  const secret = Deno.env.get("ANILIST_API_SECRET");

  const url = `https://anilist.co/api/v2/oauth/authorize?response_type=code&client_id=${id}`;
  open(url);
  const controller = new AbortController();
  const signal = controller.signal;

  let code: string | undefined = undefined;
  await Deno.serve(
    {
      port,
      signal,
    },
    (req) => {
      const data = Object.fromEntries(new URL(req.url).searchParams.entries());
      if(data.code) {
        code = data.code;
      }
      setTimeout(() => controller.abort(), 1000);
      return new Response("<script>window.close()</script>", {
        status: 200,
        headers: {
          "Content-Type": "text/html",
        },
      });
    },
  ).finished;

  if (code === undefined) {
    throw new Error("unable to authenciate to AniList");
  }

  const response = await fetch("https://anilist.co/api/v2/oauth/token", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      Accept: "application/json",
    },
    body: JSON.stringify({
      grant_type: "authorization_code",
      client_id: id,
      client_secret: secret,
      redirect_uri: `http://localhost:${port}/auth`,
      code, // The Authorization Code received previously
    }),
  });

  if (response.status !== 200) {
    console.debug(await response.text());
    throw new Error("unable to authenciate to AniList");
  }

  const data = await response.json();
  await Deno.writeTextFile(AUTH_PATH, JSON.stringify(data));
  return data.access_token as string;
}

async function delay(ms: number): Promise<void> {
  return new Promise<void>((r) => setTimeout(r, ms));
}

let cachedCode: string | undefined = undefined;
async function loadCode(): Promise<string | undefined> {
  if (cachedCode !== undefined) {
    return cachedCode;
  }
  try {
    return (cachedCode = JSON.parse(
      await Deno.readTextFile(AUTH_PATH),
    ).access_token) as string;
  } catch {
    return undefined;
  }
}

async function fetchAuth(
  input: string | URL | Request,
  init?: RequestInit | undefined,
): Promise<Response> {
  let code = await loadCode();
  if (code !== undefined) {
    const reqInit = init ?? {};
    reqInit.headers = {
      ...(reqInit?.headers ?? {}),
      Authorization: "Bearer " + code,
    };

    await delay(3000);

    const response = await fetch(input, init);
    if (response.status < 400) {
      return response;
    } else {
      console.error(await response.text());
    }
  }

  code = await authenciate();
  cachedCode = code;
  const reqInit = init ?? {};
  reqInit.headers = {
    ...(reqInit?.headers ?? {}),
    Authorization: "Bearer " + code,
  };

  await delay(3000);
  return await fetch(input, init);
}

async function updateEntry(id: string, data: AnimeData) {
  const query = `
  mutation main($id: Int, $scoreRaw: Int, $episodes: Int, $status: MediaListStatus) {
    SaveMediaListEntry(mediaId: $id, scoreRaw: $scoreRaw, progress: $episodes, status: $status) {
      id
    }
  }
  `;

  const request = await fetchAuth("https://graphql.anilist.co", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      Accept: "application/json",
    },
    body: JSON.stringify({
      query,
      variables: {
        id: parseInt(id),
        scoreRaw: data.roundedScore,
        episodes: data.episodes,
        status: {
          Watching: "CURRENT",
          Unwatched: "PLANNING",
          Completed: "COMPLETED",
          Dropped: "DROPPED",
          "Temporarily On-Hold": "PAUSED",
        }[data.progress as string],
      },
    }),
  });

  if (request.status >= 400) {
    console.error(await request.text());
  }
}

async function getAnimeList() {
  const query = `
  query main($page: Int, $username: String) {
    Page(page: $page) {
      pageInfo {
        total
        perPage
        currentPage
        lastPage
        hasNextPage
      }
      mediaList(userName: $username) {
        media {
          id,
          episodes,
        },
        score(format:POINT_100),
        progress,
        status
      }
    }
  }`;

  let data;
  let pageNum = 1;
  const map = new Map<string, AnimeData>();
  do {
    const request = await fetchAuth("https://graphql.anilist.co", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        Accept: "application/json",
      },
      body: JSON.stringify({
        query,
        variables: {
          page: pageNum++,
          username: Deno.env.get("ANILIST_USERNAME"),
        },
      }),
    });

    data = await request.json();
    for (const media of data.data.Page.mediaList) {
      const id = media.media.id.toString();
      const totalEpisodes = media.media.episodes;
      const score = media.score;
      const episodes = media.progress;
      const status = (
        {
          CURRENT: EntryStatus.Watching,
          PLANNING: EntryStatus.Unwatched,
          COMPLETED: EntryStatus.Completed,
          DROPPED: EntryStatus.Dropped,
          PAUSED: EntryStatus.OnHold,
          REPEATING: EntryStatus.Completed,
          // deno-lint-ignore no-explicit-any
        } as any
      )[media.status];

      map.set(id, {
        roundedScore: score,
        totalEpisodes,
        episodes,
        progress: status,
      });
    }
  } while (data.data.Page.pageInfo.hasNextPage);

  return map;
}

async function main() {
  const local = await loadAnimeData(
    (e) => e.DAH_meta.DAH_additional_sources?.id_AniList?.toString(),
    (s) => Math.round(s * 10),
  );

  const remote = await getAnimeList();

  const diff = diffAnimeList(remote, local);

  for (const [id, data] of diff) {
    console.log(id);
    await updateEntry(id, data);
  }
}

await main();
