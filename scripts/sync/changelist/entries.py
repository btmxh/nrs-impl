import json
from typing import Any, Dict, List, Optional

from ..services.service import Service


class AnimeListEntry:
    @classmethod
    def new(cls, id: str, score: float):
        self = cls()
        self.id = id
        self.score = score
        return self

    @classmethod
    def from_json(cls, d):
        self = cls()
        self.id = d["id"]
        self.score = d["score"]
        return self


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
        result[service_id] = AnimeListEntry.new(service_id, score)
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
