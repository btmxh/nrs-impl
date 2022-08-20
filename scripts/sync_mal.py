from sync.services.user_secrets import MAL_ACCESS_TOKEN
from sync.changelist.change import ScoreChange, read_changelist
import requests
import os

print("MyAnimeList sync:")
mal_changelist = read_changelist('temp/mal_changelist.txt')
for id, changes in mal_changelist.items():
    print(id)
    if len(changes) == 0:
        continue
    data = {}
    for change in changes:
        if isinstance(change, ScoreChange):
            data['score'] = change.new_score
    response = requests.put(f"https://api.myanimelist.net/v2/anime/{id}/my_list_status",
                            data,
                            headers={
                                "Authorization": f"Bearer {MAL_ACCESS_TOKEN}"
                            })
    response.raise_for_status()
    # time.sleep(1)
os.remove('temp/mal_changelist.txt')
