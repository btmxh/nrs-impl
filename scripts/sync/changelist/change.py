from typing import Dict, List
from .entries import AnimeListEntry


def create_changelist(old_entries: Dict[str, AnimeListEntry], new_entries: Dict[str, AnimeListEntry]) -> List[str]:
    result = []
    for id, new_entry in new_entries.items():
        old_entry = old_entries.get(id, None)
        if old_entry is None or \
                old_entry.score != new_entry.score or \
                old_entry.status != new_entry.status or \
                old_entry.episodes != new_entry.episodes:
            result.append(id)
    return result


def write_changelist(file, changelist: List[str]):
    with open(file, 'w', encoding="utf-8") as f:
        f.writelines([f"{line}\n" for line in changelist])


def read_changelist(file) -> List[str]:
    try:
        with open(file, 'r', encoding="utf-8") as f:
            return [line for line in [line.strip() for line in f.readlines()] if len(line) > 0 and not line.startswith('#')]
    except OSError:
        print(f"unable to open changelist file '{file}'")
        return []
