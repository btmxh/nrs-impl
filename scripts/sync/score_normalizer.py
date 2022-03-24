import json

def get_normalized_entries():
    entries = json.load(open("output/entries.json", encoding="utf-8"))
    scores = json.load(open("output/scores.json", encoding="utf-8"))
    def get(id):
        return {
             "id": id[6:],
             "title": entries[id]["DAH_meta_meta"]["DAH_entry_title_title"],
             "score": scores[id]["DAH_anime_normalize_score"]
        }

    return {id: get(id) for id in entries if id.startswith("A-MAL")}
