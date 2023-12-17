import { fromFileUrl, join } from "path";
import { EntryStatus } from "nrslib/exts/DAH_entry_progress.ts";
import { deserializeBulk } from "nrslib/exts/DAH_serialize_json.ts";
import { Entry } from "nrslib/mod.ts";

export type AnimeData = {
  progress: EntryStatus | undefined;
  episodes: number;
  totalEpisodes: number | undefined;
  roundedScore: number;
};

export type AnimeList = Map<string, AnimeData>;

export async function loadAnimeData(
  idExtractor: (e: Entry) => string | undefined,
  roundScore: (s: number) => number,
): Promise<AnimeList> {
  const path = join(fromFileUrl(import.meta.url), "../../output/bulk.json");
  const [data, result] = deserializeBulk(await Deno.readTextFile(path));

  const map = new Map<string, AnimeData>();
  for (const entry of data.entries.values()) {
    const id = idExtractor(entry);
    if (id === undefined) {
      continue;
    }

    const data: AnimeData = {
      episodes: entry.DAH_meta.DAH_entry_progress?.episodes ?? NaN,
      roundedScore:
        result.get(entry.id)!.DAH_meta.DAH_anime_normalize?.score ?? NaN,
      progress: entry.DAH_meta.DAH_entry_progress?.status,
      totalEpisodes: undefined,
    };

    if (
      data.progress === undefined ||
      isNaN(data.episodes) ||
      isNaN(data.roundedScore)
    ) {
      continue;
    }

    data.roundedScore = roundScore(data.roundedScore);

    if (data.progress === EntryStatus.Completed) {
      data.totalEpisodes = data.episodes;
    }

    map.set(id, data);
  }

  return map;
}

function compareAnimeData(remote: AnimeData, local: AnimeData): boolean {
  remote.progress ??= local.progress;
  remote.episodes ??= local.episodes;

  return (
    Math.abs(remote.roundedScore - local.roundedScore) < 1e-3 &&
    remote.progress === local.progress &&
    remote.episodes === local.episodes
  );
}

function conformToRemote(remote: AnimeData, local: AnimeData): AnimeData {
  const data = { ...local };
  if (
    remote.totalEpisodes !== undefined &&
    (data.progress === EntryStatus.Completed ||
      data.episodes > remote.totalEpisodes)
  ) {
    data.episodes = remote.totalEpisodes;
  }

  return data;
}

export function diffAnimeList(remote: AnimeList, local: AnimeList): AnimeList {
  const diff = new Map<string, AnimeData>();
  for (const [id, localEntry] of local) {
    const remoteEntry = remote.get(id);
    if (remoteEntry === undefined) {
      diff.set(id, localEntry);
      continue;
    }

    const conformedEntry = conformToRemote(remoteEntry, localEntry);

    if (!compareAnimeData(remoteEntry, conformedEntry)) {
      diff.set(id, conformedEntry);
    }
  }

  return diff;
}
