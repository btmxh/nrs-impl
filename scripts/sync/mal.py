import math
import os
import json
import csv
from datetime import datetime
from xml.dom.minidom import parse
import xml.dom.minidom

from sync.score_normalizer import normalized_entries

map = normalized_entries
tree = xml.dom.minidom.parse("animelist.xml")
nodes = tree.getElementsByTagName("anime")
for anime in nodes:
    id = "A-MAL-" + anime.getElementsByTagName('series_animedb_id')[0].childNodes[0].data
    try:
        print(id, round(map[id]["score"]))
        anime.getElementsByTagName('my_score')[0].childNodes[0].data = round(map[id]["score"])
        anime.getElementsByTagName('update_on_import')[0].childNodes[0].data = 1
    except:
        anime.getElementsByTagName('my_score')[0].childNodes[0].data = 1

f = open("animelist.out.xml", "w", encoding="utf-8")
out = tree.toprettyxml()
f.write(out)
