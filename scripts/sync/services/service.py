from abc import ABC, abstractmethod
from typing import Optional


class Service(ABC):
    @abstractmethod
    def round_score(self, s: float) -> float:
        pass

    @abstractmethod
    def get_entry_id(self, id: str, entry: dict) -> str:
        pass

    @abstractmethod
    def cached_entries_path(self) -> str:
        pass

    @abstractmethod
    def changelist_path(self) -> str:
        pass


class MAL(Service):
    def __init__(self) -> None:
        super().__init__()

    def round_score(self, s: float) -> float:
        return round(s)

    def get_entry_id(self, id: str, entry: dict) -> Optional[str]:
        return id[len("A-MAL-"):] if id.startswith("A-MAL-") else None

    def cached_entries_path(self) -> str:
        return "temp/mal_cached_entries.json"

    def changelist_path(self) -> str:
        return "temp/mal_changelist.txt"


class AniList(Service):
    def __init__(self) -> None:
        super().__init__()

    def round_score(self, s: float) -> float:
        return round(s, 1)

    def get_entry_id(self, id: str, entry: dict) -> str:
        try:
            return str(entry["DAH_meta"]["DAH_additional_sources"]["id_AniList"])
        except KeyError:
            pass
        return None

    def cached_entries_path(self) -> str:
        return "temp/al_cached_entries.json"

    def changelist_path(self) -> str:
        return "temp/al_changelist.txt"

MALService = MAL()
AniListService = AniList()