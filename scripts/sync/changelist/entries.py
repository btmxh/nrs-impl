import json
from enum import Enum
from typing import Dict, Optional
from ..services.aod import load_aod_minified_memoize
from ..services.service import Service


class Status(str, Enum):
    Completed = 'Completed',
    Watching = 'Watching',
    OnHold = 'OnHold',
    Dropped = 'Dropped',
    PTW = 'PTW',


def __get_default_status_episode_count(status: Optional[Status], total_eps: int) -> int:
    return total_eps if status == Status.Completed else 0


class AnimeListEntry:
    @classmethod
    def new(cls, id: str, score: float, status: Optional[Status], episodes: int):
        self = cls()
        self.id = id
        self.score = score
        self.status = status
        self.episodes = episodes
        return self

    @classmethod
    def from_json(cls, d):
        self = cls()
        self.id = d["id"]
        self.score = d["score"]
        self.episodes = d["episodes"]
        self.status = d.get('status', None)
        return self


def nrs_boredom_to_status(boredom_name: Optional[str]) -> Optional[Status]:
    if boredom_name is None:
        return None
    boredom_name = boredom_name.lower()
    if boredom_name.startswith('completed') or boredom_name == 'partially dropped':
        return Status.Completed
    elif boredom_name == 'watching':
        return Status.Watching
    elif boredom_name == 'temporarily on-hold':
        return Status.OnHold
    elif boredom_name == 'dropped':
        return Status.Dropped
    else:
        return Status.PTW


def load_entries(service: Service) -> Dict[str, AnimeListEntry]:
    with open('output/entries.json', 'r', encoding='utf-8') as entries_file:
        entries = json.load(entries_file)
    with open('output/scores.json', 'r', encoding='utf-8') as score_file:
        scores = json.load(score_file)

    result = {}
    for id in entries:
        if not id.startswith('A'):
            continue
        entry = entries[id]
        service_id = service.get_entry_id(id, entry)
        if service_id is None:
            continue
        score = service.round_score(
            scores[id]["DAH_meta"]["DAH_anime_normalize"]["score"])
        status = nrs_boredom_to_status(
            entry["DAH_meta"]["DAH_entry_progress"].get("status", None))
        episodes = entry["DAH_meta"]["DAH_entry_progress"].get(
            "episode", None)
        if episodes is None:
            total_eps = load_aod_minified_memoize(
                service)[service_id]["episodes"]
            episodes = __get_default_status_episode_count(status, total_eps)
        result[service_id] = AnimeListEntry.new(
            service_id, score, status, episodes)
    return result


def load_entries_from_cache(file) -> Dict[str, AnimeListEntry]:
    try:
        with open(file, 'r', encoding="utf-8") as f:
            data = json.load(f)
            return {id: AnimeListEntry.from_json(json) for id, json in data.items()}
    except OSError:
        print("Unable to load cached entries")
        return {}


def save_entries_to_cache(file, entries: Dict[str, AnimeListEntry]):
    with open(file, 'w', encoding="utf-8") as f:
        data = {id: vars(entry) for id, entry in entries.items()}
        json.dump(data, f)
