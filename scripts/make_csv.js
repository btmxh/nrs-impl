// Change this to change the CSV format
const labels = [
    "ID",
    "Title",
    "Overall",
    "Art-Music"
];

const output = entry => {
    return [
        entry.id,
        entry.title,
        entry.score.overall,
        subscore(entry, 1, 2)
    ];
};

// Script content
const fs = require("fs");
const csv = require("csv");
const data = JSON.parse(fs.readFileSync("../nrs.json"));
let output_data = [labels];
for(const entry of data.entries) {
    output_data.push(output(entry));
}
csv.stringify(output_data, (_, out) => {
    fs.writeFileSync("nrs.csv", out);
})
function subscore(entry, sub, factor) {
    return entry.score.impact.subscores.split(";")[sub].split(":")[factor + 1];
}
