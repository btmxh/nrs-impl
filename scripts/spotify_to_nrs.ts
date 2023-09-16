import { readCSVObjects } from "csv";

if (Deno.args.length == 0) {
  console.log(
    "Usage: [deno run --allow-all] spotify_to_nrs.ts [path to playlist.csv]",
  );
  Deno.exit(1);
}

const path = Deno.args[0];
const tracks = [];
const artists = [];
for await (const obj of readCSVObjects(
  await Deno.open(path, {
    read: true,
  }),
)) {
  tracks.push(obj);
}

console.log(JSON.stringify(tracks));
