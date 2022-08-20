import glob
import json
import re

anime_id_regex = re.compile(r'id = "A-MAL-[0-9]+"')
with open('../anime-offline-database/anime-offline-database-minified.json', encoding='utf-8') as f:
    aod = json.load(f)
id_map = {}
for anime in aod["data"]:
    sources = anime["sources"]
    mal_id = None
    al_id = None
    anidb_id = None
    kitsu_id = None
    for source in sources:
        if source.startswith("https://myanimelist.net/anime/"):
            mal_id = int(source[len("https://myanimelist.net/anime/"):])
        elif source.startswith("https://anilist.co/anime/"):
            al_id = int(source[len("https://anilist.co/anime/"):])
        elif source.startswith("https://anidb.net/anime/"):
            anidb_id = int(source[len("https://anidb.net/anime/"):])
        elif source.startswith("https://kitsu.io/anime/"):
            kitsu_id = int(source[len("https://kitsu.io/anime/"):])
    if mal_id is not None:
        id_map[mal_id] = [mal_id, al_id, anidb_id, kitsu_id]

files = glob.glob('impl/src/main/kotlin/com/dah/nrs/**/*.kt', recursive=True)
for file in files:
    with open(file, 'r+', encoding='utf-8') as f:
        lines = f.readlines()
        lines_out = lines
        for idx, line in enumerate(lines):
            indent = ''
            for c in line:
                if c.isspace():
                    indent += c
                else:
                    break
            find_result = anime_id_regex.findall(line)
            if len(find_result) == 0:
                continue
            elif len(find_result) > 1:
                print("WARN: Multiple anime ID in one line")
                print(f"File: '{file}', line {idx + 1}")
            elif "generated" in line:
                print(f"Skipping generated line: '{line.strip()}'")
                print(f"File: '{file}', line {idx + 1}")
            else:
                print(find_result[0])
                mal_id = int(find_result[0][len('id = "A-MAL-'):-len('"')])
                print(mal_id)
                if mal_id in id_map:
                    print(id_map[mal_id])
                    zip_ids = zip(
                        ["id_mal", "id_anilist", "id_anidb", "id_kitsu"], id_map[mal_id])
                    add_lines = [f'{indent}{name} = {value}\n' for (name, value) in zip_ids if value is not None]
                    lines_out[idx] = lines_out[idx].strip('\r\n') + '    // generated\n'
                    lines_out[idx+1:idx+1] = add_lines
        f.seek(0)
        f.truncate(0)
        f.writelines(lines_out)