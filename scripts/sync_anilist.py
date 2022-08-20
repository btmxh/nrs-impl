import os
import time
import requests
from sync.changelist.change import ScoreChange, read_changelist
from sync.services.user_secrets import ANILIST_TOKEN

print("AniList sync:")
anilist_changelist = read_changelist('temp/al_changelist.txt')
for id, changes in anilist_changelist.items():
    print(id)
    if len(changes) == 0:
        continue
    mutation_args = "$mediaId: Int"
    smle_args = "mediaId: $mediaId"
    vars = {
        "mediaId": id
    }
    for change in changes:
        if isinstance(change, ScoreChange):
            mutation_args += ", $score: Int"
            smle_args += ", scoreRaw: $score"
            vars["score"] = round(change.new_score * 10)
    query = f"mutation({mutation_args}) {{ SaveMediaListEntry({smle_args}) {{id}} }}"
    print(f"GraphQL Query: {query}")
    response = requests.post('https://graphql.anilist.co',
                             json={
                                 'query': query,
                                 'variables': vars
                             },
                             headers={
                                 'Authorization': 'Bearer ' + ANILIST_TOKEN,
                                 'Content-Type': 'application/json',
                                 'Accept': 'application/json',
                             })
    # print(response.json())
    response.raise_for_status()
    time.sleep(1)
os.remove('temp/al_changelist.txt')