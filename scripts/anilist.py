import requests
import json
import time

from score_normalizer import get_normalized_entries

# to get access token go here: https://anilist.co/api/v2/oauth/authorize?client_id=2222&response_type=token
# save the key part in file token.txt (in nrs-impl-kt/scripts/token.txt)


# requests code from https://github.com/shamsow/anilist-updater
def get_mediaId(idMal):
    query = """
        query ($id: Int, $type: MediaType) {
            Media (idMal: $id, type: $type) {
                id
                title {
                    english
                    romaji
                }
            }
        }
    """
    # Define our query variables and values that will be used in the query request
    variables = {
        "id": idMal,
        "type": "ANIME"
    }

    url = 'https://graphql.anilist.co'
    response = requests.post(
        url, json={'query': query, 'variables': variables}).json()
    return (response["data"]["Media"]["id"], response["data"]["Media"]["title"]["english"])


def add_anime(id, score):
    if access_token == 'null':
        return False

    mediaID, title = get_mediaId(id)
    print(f"Adding ID:{mediaID} [{title}] with a score of {score}")
    query = """
        mutation ($mediaId: Int, $score: Float) {
        SaveMediaListEntry (mediaId: $mediaId, score: $score) {
            id
        }
    }
    """
    # Define our query variables and values that will be used in the query request
    variables = {
        "mediaId": mediaID,
        "score": score
    }

    url = 'https://graphql.anilist.co'

    headers = {
        'Authorization': 'Bearer ' + access_token,
        'Content-Type': 'application/json',
        'Accept': 'application/json',
    }
    response = requests.post(
        url, json={'query': query, 'variables': variables}, headers=headers).json()
    print(f"Succesfully Added: ID:{mediaID}", "cyan")

    return True


access_token = open("token.txt", "r").readlines()[0]
map = get_normalized_entries()

for e in map.values():
    print(e["id"], e["title"], e["score"],
          e["placement_score"], e["nrs_score"])

    # rate-limit thingy idk
    if add_anime(e["id"], e["score"]):
        time.sleep(1)
