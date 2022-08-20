from typing import List
from sync.services.service import AniListService, MALService, Service
from sync.changelist.change import create_changelist, write_changelist
from sync.changelist.entries import load_entries, load_entries_from_cache, save_entries_to_cache

services: List[Service] = [MALService, AniListService]
for service in services:
    entries = load_entries(service)
    cached_entries = load_entries_from_cache(service.cached_entries_path())
    cl = create_changelist(cached_entries, entries)
    write_changelist(service.changelist_path(), cl)
    save_entries_to_cache(service.cached_entries_path(), entries)
