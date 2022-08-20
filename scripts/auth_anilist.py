import webbrowser

# to get access token follow the link (or execute the script, basically the same thing)
# TheAnimeDatabase is safe (source: trust me bro), it will redirect to localhost, 
# where you'll need to copy the code
# save the key part in the file scripts/sync/user_secret.py
webbrowser.open("https://anilist.co/api/v2/oauth/authorize?client_id=2222&response_type=token")