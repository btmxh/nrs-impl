import { writeCSV } from "csv";
import { Id, Entry, Result } from "nrslib/mod.ts";
import { deserializeBulk } from "nrslib/exts/DAH_serialize_json.ts";

// Change this to change the CSV format
const labels = [
  "ID",
  "Type",
  "Title",
  "Status",
  "MAL normalized score",
  "Overall",
  "AU",
  "AP",
  "MU",
  "MP",
  "CU",
  "CP",
  "AL",
  "AV",
  "AM",
  "B",
  "A",
];

function output(id: Id, entry: Entry, score: Result) {
  // deno-lint-ignore no-explicit-any
  const emeta = entry["DAH_meta"] as any;
  // deno-lint-ignore no-explicit-any
  const smeta = score["DAH_meta"] as any;
  return [
    id,
    emeta["DAH_entry_type"],
    emeta["DAH_entry_title"],
    (emeta?.["DAH_entry_progress"] ?? {})?.["status"] ?? "Unknown",
    smeta["DAH_anime_normalize"]["score"],
    smeta["DAH_overall_score"],
    ...score.overallVector.data,
  ];
}

// Main script part
const f = await Deno.open("output/nrs.csv", {
  write: true,
  create: true,
  truncate: true,
});

const [data, results] = deserializeBulk(
  await Deno.readTextFile("output/bulk.json"),
);

await writeCSV(
  f,
  (async function* () {
    yield labels;
    for (const [id, entry] of data.entries) {
      const result = results.get(id);
      if (result === undefined) {
        throw new Error(`entry result not found for ${id}`);
      }

      yield output(id, entry, result);
    }
  })(),
);

f.close();
