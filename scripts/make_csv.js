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
        entry.score.overall,
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

