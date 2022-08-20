from sync.services.user_secrets import CLIENT_ID, CLIENT_SECRET, MAL_REFRESH_TOKEN
import requests

response = requests.post('https://myanimelist.net/v1/oauth2/token', {
    'client_id': CLIENT_ID,
    'client_secret': CLIENT_SECRET,
    'grant_type': 'refresh_token',
    'refresh_token': MAL_REFRESH_TOKEN
})

response.raise_for_status()
token = response.json()
with open("temp/mal_auth.json", encoding="utf-8") as f:
    f.write(response.json())