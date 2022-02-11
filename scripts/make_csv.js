// Change this to change the CSV format
const labels = [
    "ID",
    "Title",
    "Overall"
];

const output = entry => {
    return [
        entry.id,
        entry.title,
        entry.overall
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
