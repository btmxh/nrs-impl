import {
  AnimeData,
  diffAnimeList,
  loadAnimeData,
} from "./anime_sync_common.ts";
import { open } from "open";
import { load } from "dotenv";
import { join, fromFileUrl } from "path";
import { create } from "pkce";
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
  "../../output/mal_auth.json",
);

async function authenciate(): Promise<string> {
  const port = getRedirectPort() ?? 7272;
  const id = Deno.env.get("MAL_API_ID");
  const secret = Deno.env.get("MAL_API_SECRET");
  const codePair = create(64);

  const url = `https://myanimelist.net/v1/oauth2/authorize?response_type=code&client_id=${id}&code_challenge=${codePair.codeChallenge}`;
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
    throw new Error("unable to authenciate to MyAnimeList");
  }

  const response = await fetch("https://myanimelist.net/v1/oauth2/token", {
    method: "POST",
    headers: {
      "Content-Type": "application/x-www-form-urlencoded",
      Accept: "application/json",
    },
    body: `grant_type=authorization_code&client_id=${id}&client_secret=${secret}&code=${code}&code_verifier=${codePair.codeChallenge}`,
  });

  if (response.status !== 200) {
    console.debug(await response.text());
    throw new Error("unable to authenciate to MyAnimeList");
  }

  const data = await response.json();
  await Deno.writeTextFile(AUTH_PATH, JSON.stringify(data));
  return data.access_token as string;
}

function delay(ms: number): Promise<void> {
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

    await delay(1000);
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

  await delay(1000);
  return await fetch(input, init);
}

async function updateEntry(id: string, data: AnimeData) {
  const request = await fetchAuth(
    `https://api.myanimelist.net/v2/anime/${id}/my_list_status`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/x-www-form-urlencoded",
      },
      body: `status=${
        {
          Watching: "watching",
          Unwatched: "plan_to_watch",
          Completed: "completed",
          Dropped: "dropped",
          "Temporarily On-Hold": "on_hold",
        }[data.progress as string]
      }&score=${data.roundedScore}&num_watched_episodes=${data.episodes}`,
    },
  );

  // if (request.status >= 400) {
  console.error(await request.text());
  // }
}

async function getAnimeList() {
  let data;
  let pageNum = 1;
  const map = new Map<string, AnimeData>();
  do {
    const request = await fetchAuth(
      `https://api.myanimelist.net/v2/users/@me/animelist?fields=list_status&limit=100&offset=${
        (pageNum - 1) * 100
      }`,
      {
        method: "GET",
        headers: {
          Accept: "application/json",
        },
      },
    );

    data = await request.json();
    for (const media of data.data) {
      const id = media.node.id.toString();
      const score = media.list_status.score;
      const episodes = media.list_status.num_watched_episodes;
      const status = (
        {
          watching: EntryStatus.Watching,
          plan_to_watch: EntryStatus.Unwatched,
          completed: EntryStatus.Completed,
          dropped: EntryStatus.Dropped,
          on_hold: EntryStatus.OnHold,
          // deno-lint-ignore no-explicit-any
        } as any
      )[media.list_status.status];

      map.set(id, {
        roundedScore: score,
        totalEpisodes: undefined,
        episodes,
        progress: status,
      });
    }
    pageNum++;
  } while (data.paging.next !== undefined);

  return map;
}

async function main() {
  const local = await loadAnimeData(
    (e) => e.DAH_meta.DAH_additional_sources?.id_MyAnimeList?.toString(),
    (s) => Math.round(s),
  );

  const remote = await getAnimeList();

  const diff = diffAnimeList(remote, local);

  for (const [id, data] of diff) {
    console.log(id);
    await updateEntry(id, data);
  }
}

await main();
