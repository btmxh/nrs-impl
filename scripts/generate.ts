import { ensureDir } from "fs";
import { writableStreamFromWriter } from "streams";
import { newContext, processContext } from "nrslib";
import { FileResolver, processNRSXML } from "nrsml";

await ensureDir("output");

function newWriteFileStream(path: string): WritableStream<Uint8Array> {
  return writableStreamFromWriter(
    Deno.openSync(path, {
      create: true,
      write: true,
      truncate: true,
    }),
  );
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
    DAH_validator_suppress: {},
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
const mainDocumentContent = await Deno.readTextFile(mainDocumentPath);
const { nrsData } = processNRSXML(
  context,
  mainDocumentContent,
  fileResolver.getProcessOptions(mainDocumentPath),
);

processContext(context, nrsData);
