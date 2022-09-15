# nrs-impl-kt
nrs-impl but kotlin because fuck js/ts

NOTE: Since this repo directly relates to my culture and shit, offensive language is inevitable. Most of the slurs here don't carry the same meaning as in popular culture, and therefore not aiming to offense anyone. Please ignore them if you can, or if you are unable to cope with them, please ignore this shitty repo and have a good day.

(pls don't cancel me because of the autism shit that I put here)

## Overview

The implementation of [nrs](https://github.com/ngoduyanh/nrs).

nrs-impl-kt is an rating system for things like Anime, Manga, Novels, etc.

This implementation also provides multiple utilities like progress tracking and syncing
to MyAnimeList/AniList.

## Structure

nrs-impl-kt is divided into three modules.

* `core`: This is where all of the calculation, JSON export, and NRS extensions are defined.
* `impl`: The DSL code for this implementation. If you want to make your own NRS rankings, this is the place to do it.
* `validator`: A program that will analyze the output JSON files, and make sure that they're all valid. This is used to detect any implementation errors.

Some scripts are also provided, and they're in the `scripts/` directory.
