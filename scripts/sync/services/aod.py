import functools
import json
from typing import Dict
from .service import AniListService, MALService, Service
from .user_secrets import AOD_PATH


def load_aod() -> dict:
    with open(AOD_PATH, 'r', encoding='utf-8') as f:
        return json.load(f)


def load_aod_minified(service: Service) -> Dict[str, dict]:
    aod = load_aod()
    id_map = {}
    for anime in aod["data"]:
        sources = anime["sources"]
        mal_id = None
        al_id = None
        anidb_id = None
        kitsu_id = None
        for source in sources:
            if source.startswith("https://myanimelist.net/anime/"):
                mal_id = int(source[len("https://myanimelist.net/anime/"):])
            elif source.startswith("https://anilist.co/anime/"):
                al_id = int(source[len("https://anilist.co/anime/"):])
            elif source.startswith("https://anidb.net/anime/"):
                anidb_id = int(source[len("https://anidb.net/anime/"):])
            elif source.startswith("https://kitsu.io/anime/"):
                kitsu_id = int(source[len("https://kitsu.io/anime/"):])
        if service == MALService:
            service_id = mal_id
        elif service == AniListService:
            service_id = al_id
        else:
            service_id = None
        if service_id is not None:
            id_map[str(service_id)] = {
                'id_mal': mal_id,
                'id_anilist': al_id,
                'id_anidb': anidb_id,
                'id_kitsu': kitsu_id,
                'episodes': anime['episodes']
            }
    return id_map


@functools.cache
def load_aod_minified_memoize(service: Service) -> Dict[str, dict]:
    return load_aod_minified(service)
