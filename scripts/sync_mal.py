from typing import Optional
from sync.services.service import MALService
from sync.changelist.entries import Status, load_entries
from sync.services.user_secrets import MAL_ACCESS_TOKEN
from sync.changelist.change import read_changelist
import requests
import os


def to_mal_status(status: Optional[Status]):
    if status == Status.Completed:
        return 'completed'
    elif status == Status.Watching:
        return 'watching'
    elif status == Status.OnHold:
        return 'on_hold'
    elif status == Status.Dropped:
        return 'dropped'
    else:
        return 'plan_to_watch'


print("MyAnimeList sync:")
mal_changelist = read_changelist('temp/mal_changelist.txt')
mal_entries = load_entries(MALService)
for id in mal_changelist:
    print(id)
    entry = mal_entries[id]
    response = requests.put(f"https://api.myanimelist.net/v2/anime/{id}/my_list_status",
                            {
                                'score': entry.score,
                                'status': to_mal_status(entry.status),
                                'num_watched_episodes': entry.episodes or 0
                            },
                            headers={
                                "Authorization": f"Bearer {MAL_ACCESS_TOKEN}"
                            })
    response.raise_for_status()
    # time.sleep(1)
os.remove('temp/mal_changelist.txt')
