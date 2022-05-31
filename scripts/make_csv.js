// Change this to change the CSV format
const labels = [
    "ID",
    "Title",
    "MAL normalized score",
    "Overall",
    "AU",
    "AP",
    "MU",
    "MP",
    "CU",
    "CP",
    "AL",
    "AI",
    "AM",
    "IP",
    "IG",
    "B",
    "A"
];

const output = (id, entry, score) => {
    return [
        id,
        entry.DAH_meta.DAH_entry_title,
        score.DAH_meta.DAH_anime_normalize.score,
        score.DAH_meta.DAH_overall_score,
        ...score.overallVector
    ];
};

// Script content
const fs = require("fs");
const csv = require("csv");
const entries = JSON.parse(fs.readFileSync("output/entries.json"));
const scores = JSON.parse(fs.readFileSync("output/scores.json"));

let output_data = [labels];
for(const id in entries) {
    output_data.push(output(id, entries[id], scores[id]));
}
csv.stringify(output_data, (_, out) => {
    fs.writeFileSync("output/nrs.csv", out);
})