from sync.services.user_secrets import CLIENT_ID, CLIENT_SECRET
import secrets
import requests
import webbrowser
import json

code_verifier = code_challenge = secrets.token_urlsafe(100)[:128]
url = f"https://myanimelist.net/v1/oauth2/authorize?response_type=code&client_id={CLIENT_ID}&code_challenge={code_challenge}&state=NRSRequest"
webbrowser.open(url)
code = input("Copy-paste the code here: ").strip()
response = requests.post('https://myanimelist.net/v1/oauth2/token', {
    'client_id': CLIENT_ID,
    'client_secret': CLIENT_SECRET,
    'code': code,
    'code_verifier': code_verifier,
    'grant_type': 'authorization_code'
})
response.raise_for_status()
with open("temp/mal_auth.json", 'w', encoding="utf-8") as f:
    f.write(json.dumps(response.json()))
