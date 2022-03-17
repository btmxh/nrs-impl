// Change this to change the CSV format
const labels = [
    "ID",
    "Title",
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

const output = entry => {
    return [
        entry.id,
        entry.title,
        entry.overall,
        entry.overallVector[0],
        entry.overallVector[1],
        entry.overallVector[2],
        entry.overallVector[3],
        entry.overallVector[4],
        entry.overallVector[5],
        entry.overallVector[6],
        entry.overallVector[7],
        entry.overallVector[8],
        entry.overallVector[9],
        entry.overallVector[10],
        entry.overallVector[11],
        entry.overallVector[12]
    ];
};

// Script content
const fs = require("fs");
const csv = require("csv");
const data = JSON.parse(fs.readFileSync("../scores.json"));
let output_data = [labels];
for(const id in data) {
    data[id].id = id
    output_data.push(output(data[id]));
}
csv.stringify(output_data, (_, out) => {
    fs.writeFileSync("nrs.csv", out);
})
function subscore(entry, sub, factor) {
    return entry.score.impact.subscores.split(";")[sub].split(":")[factor + 1];
}
