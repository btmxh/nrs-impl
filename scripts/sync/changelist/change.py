from typing import Callable, Dict, List, Union

from .entries import AnimeListEntry


class ScoreChange:
    def __init__(self, new_score: float) -> None:
        self.new_score = new_score

    def to_string(self) -> str:
        return f"score {self.new_score}"


class ProgressChange:
    def __init__(self) -> None:
        pass


Change = ScoreChange | ProgressChange
Changelist = Dict[str, List[Change]]


def create_changelist(old_entries: Dict[str, AnimeListEntry], new_entries: Dict[str, AnimeListEntry]) -> Changelist:
    result = {}
    for id, new_entry in new_entries.items():
        old_entry = old_entries[id] if id in old_entries else None
        changes = []
        if old_entry is None or old_entry.score != new_entry.score:
            changes.append(ScoreChange(new_entry.score))
        if len(changes) > 0:
            result[id] = changes
    return result


def write_changelist(file, changelist: Changelist):
    with open(file, 'w', encoding="utf-8") as f:
        for id, changes in changelist.items():
            f.write("id " + id + "\n")
            for change in changes:
                f.write(change.to_string() + "\n")


def read_changelist(file):
    current_id = None
    current_changes = []
    result: Changelist = {}
    try:
        with open(file, 'r', encoding="utf-8") as f:
            lines = f.readlines()
            for line in lines:
                line = line.strip()
                if line.startswith("id "):
                    if current_id is not None and len(current_changes) > 0:
                        result[current_id] = current_changes
                        current_id = None
                        current_changes = []
                    current_id = line[len("id "):]
                elif line.startswith("score "):
                    score = float(line[len("score "):])
                    current_changes.append(ScoreChange(score))
                else:
                    print(f"invalid line in changelist file: '{line}'")
        if current_id is not None and len(current_changes) > 0:
            result[current_id] = current_changes
    except OSError:
        print(f"unable to open changelist file '{file}'")
    return result
