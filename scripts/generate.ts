import {
  newContext,
  processContext,
} from "https://raw.githubusercontent.com/ngoduyanh/nrs-lib-ts/v0.1.1/mod.ts";
import {
  FileResolver,
  processNRSXML,
} from "https://raw.githubusercontent.com/ngoduyanh/nrsml/v0.1.1/mod.ts";
import { writableStreamFromWriter } from "https://deno.land/std@0.181.0/streams/mod.ts";
import * as fs from "https://deno.land/std@0.182.0/fs/mod.ts";

fs.ensureDirSync("output");

const fileHandles = [];

function newWriteFileStream(path: string): WritableStream<Uint8Array> {
  const file = Deno.openSync(path, { create: true, write: true });
  fileHandles.push(file);
  return writableStreamFromWriter(file);
}

const baseAnimeContextConfig = {
  extensions: {
    DAH_combine_pow: {},
    DAH_entry_progress: {},
    DAH_factors: {},
    DAH_overall_score: {},
    DAH_serialize: {},
    DAH_serialize_json: {},
    DAH_standards: {},
  },
};

const context = newContext({
  ...baseAnimeContextConfig,
  extensions: {
    ...baseAnimeContextConfig.extensions,
    DAH_anime_normalize: {
      baseAnimeContextConfig,
    },
    DAH_serialize_json: {
      entries: newWriteFileStream("output/entries.json"),
      impacts: newWriteFileStream("output/impacts.json"),
      relations: newWriteFileStream("output/relations.json"),
      scores: newWriteFileStream("output/scores.json"),
      bulk: newWriteFileStream("output/bulk.json"),
    },
  },
});

const fileResolver = new FileResolver();
const mainDocumentPath = "nrs/NRSImplMain.xml";
const mainDocumentContent = Deno.readTextFileSync(mainDocumentPath);
const { nrsData } = processNRSXML(
  context,
  mainDocumentContent,
  fileResolver.getParseOptions(mainDocumentPath)
);

processContext(context, nrsData);
