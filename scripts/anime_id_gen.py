import glob
import re
from sync.services.service import MALService
from sync.services.aod import load_aod_minified

anime_id_regex = re.compile(r'id = "A-MAL-[0-9]+"')
aod_minified = load_aod_minified(MALService)
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
                mal_id = find_result[0][len('id = "A-MAL-'):-len('"')]
                print(mal_id)
                if mal_id in aod_minified:
                    anime = aod_minified[mal_id]
                    print(anime)
                    data = {
                        'idMAL': anime['id_mal'],
                        'idAniList': anime['id_anilist'],
                        'idKitsu': anime['id_kitsu'],
                        'idAniDB': anime['id_anidb']
                    }
                    add_lines = [
                        f'{indent}{key} = {value}\n' for key, value in data.items() if value is not None]
                    lines_out[idx] = lines_out[idx].strip(
                        '\r\n') + '    // generated\n'
                    lines_out[idx+1:idx+1] = add_lines
        f.seek(0)
        f.truncate(0)
        f.writelines(lines_out)
