import os
import time
from typing import Optional
import requests

from sync.services.service import AniListService
from sync.changelist.entries import load_entries, Status
from sync.changelist.change import read_changelist
from sync.services.user_secrets import ANILIST_TOKEN


def to_anilist_status(status: Optional[Status]):
    if status == Status.Completed:
        return 'COMPLETED'
    elif status == Status.Watching:
        return 'CURRENT'
    elif status == Status.OnHold:
        return 'PAUSED'
    elif status == Status.Dropped:
        return 'DROPPED'
    else:
        return 'PLANNING'


print("AniList sync:")
anilist_changelist = read_changelist('temp/al_changelist.txt')
anilist_entries = load_entries(AniListService)
for id in anilist_changelist:
    print(id)
    entry = anilist_entries[id]
    query = """
        mutation($mediaId: Int, $score: Int, $episodes: Int, $status: MediaListStatus) {
            SaveMediaListEntry(mediaId: $mediaId, scoreRaw: $score, progress: $episodes, status: $status) {
                id
            }
        }
    """
    # print(f"GraphQL Query: {query}")
    response = requests.post('https://graphql.anilist.co',
                             json={
                                 'query': query,
                                 'variables': {
                                     'mediaId': id,
                                     'score': round(entry.score * 10),
                                     'episodes': entry.episodes,
                                     'status': to_anilist_status(entry.status)
                                 }
                             },
                             headers={
                                 'Authorization': 'Bearer ' + ANILIST_TOKEN,
                                 'Content-Type': 'application/json',
                                 'Accept': 'application/json',
                             })
    print(response.json())
    response.raise_for_status()
    time.sleep(1)
os.remove('temp/al_changelist.txt')
