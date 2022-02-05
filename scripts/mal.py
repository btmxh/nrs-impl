import math
import os
import json
import csv
from datetime import datetime
# import matplotlib.pyplot as plt
from xml.dom.minidom import parse
import xml.dom.minidom

from score_normalizer import get_normalized_entries


map = get_normalized_entries()
for e in map.values():
    print(e["id"], e["title"], e["score"],
          e["placement_score"], e["nrs_score"])

tree = xml.dom.minidom.parse("animelist.xml")
nodes = tree.getElementsByTagName("anime")
for anime in nodes:
    id = anime.getElementsByTagName('series_animedb_id')[0].childNodes[0].data
    anime.getElementsByTagName('update_on_import')[0].childNodes[0].data = 1
    try:
        print(id, map[id]["title"])
        anime.getElementsByTagName('my_score')[
            0].childNodes[0].data = math.ceil(map[id]["score"])
    except:
        print(id, "not found")
        anime.getElementsByTagName('my_score')[0].childNodes[0].data = 1

f = open("animelist.out.xml", "w", encoding="utf-8")
out = tree.toprettyxml()
f.write(out)
