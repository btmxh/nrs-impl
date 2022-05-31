import json
import os.path

def get_new_normalized_entries():
    if os.path.exists("temp/score_sync_cache.json"):
        cache = json.load(open("temp/score_sync_cache.json", encoding="utf-8"))
    else:
        cache = {}

    entries = json.load(open("output/entries.json", encoding="utf-8"))
    scores = json.load(open("output/scores.json", encoding="utf-8"))

    def get(id):
        return {
             "id": id[6:],
             "title": entries[id]["DAH_meta"]["DAH_entry_title"],
             "score": round(scores[id]["DAH_meta"]["DAH_anime_normalize"]["score"], 1)
        }
    def was_updated(id):
        try:
            return cache[id]["score"] == score_dict[id]["score"]
        except Exception:
            return False
    score_dict = {id: get(id) for id in entries if id.startswith("A-MAL")}
    json.dump(score_dict, open("temp/score_sync_cache.json", "w", encoding="utf-8"))
    filtered_score_dict = { id: score_dict[id] for id in score_dict if not was_updated(id) }

    return filtered_score_dict

normalized_entries = get_new_normalized_entries()
