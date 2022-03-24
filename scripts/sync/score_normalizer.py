import json

factor = 0.35
offset = 0.0


def get_normalized_entries():
    data = json.load(open("../scores.json", encoding="utf-8"))

    important = [{"id": id[6:], "title": data[id]["title"], "nrs_score": float(
        data[id]["overall"]), "meta": data[id]} for id in data if id.startswith("A-MAL")]
    important = sorted(important, key=lambda student: student["nrs_score"])
    epsilon = 1e-5
    max_score = max(important, key=lambda e: e["nrs_score"])["nrs_score"]
    min_score = min(important, key=lambda e: e["nrs_score"])["nrs_score"]
    for i in range(len(important)):
        important[i]["nrs_score"] = (
            important[i]["nrs_score"] - min_score) / (max_score - min_score)
        if i > 0:
            if abs(important[i - 1]["nrs_score"] - important[i]["nrs_score"]) < epsilon:
                important[i]["placement_score"] = important[i -
                                                            1]["placement_score"]
                continue

        important[i]["placement_score"] = float(i) / (len(important) - 1)

    map = {}
    for e in important:
        e["score"] = offset + (10 - offset) * (e["placement_score"]
                                               * (1 - factor) + e["nrs_score"] * factor)
        map[e["id"]] = e

    return map
