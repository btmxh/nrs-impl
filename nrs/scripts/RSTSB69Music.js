const allEras = [
  "arc1", // idol renaissance arc
  "arc2", // rst-sb69 duopoly arc
  "arc3", // idol dystopia arc
  "akm1", // akm arcs
  "akm2",
  "akm3",
  "pme", // (nozs) post-modern era
  "nee", // neo-eroge era
  "remod", // remodernization era
  "ac", // anxiety crisis era
];

function args() {
  return [
    local.base,
    local.eras.length == 0
      ? []
      : local.eras
          .split(":")
          .map((tok) => tok.split("="))
          .map(([era, factor]) => [era, parseFloat(factor)]),
    local.from,
  ];
}

global.rstTracks ??= new Map();
global.sb69Tracks ??= new Map();
// deno-lint-ignore no-this-alias
const self = this;

function common(map) {
  const [base, eras, from] = args();
  if (base < 0.0 || base > 1.0) {
    throw new Error("base must be between 0.0 and 1.0");
  }
  for (const [era, multiplier] of eras) {
    if (allEras.indexOf(era) < 0) {
      throw new Error(`unknown era ${era}`);
    }
    if (multiplier < 0.0) {
      throw new Error(`negative era multiplier ${multiplier}`);
    }
  }
  if (allEras.indexOf(from) < 0) {
    throw new Error(`unknown era ${from}`);
  }

  const eraIndexed = eras.map(([era, multiplier]) => [
    allEras.indexOf(era),
    multiplier,
  ]);
  const fromIndex = allEras.indexOf(from);

  const multipliers = allEras.map((_, i) => (i >= fromIndex ? 1.0 : 0.0));
  for (const [eraIndex, multiplier] of eraIndexed) {
    multipliers[eraIndex] = multiplier;
  }

  map.set(self.entry.value.id, multipliers);
}

local.rst = () => {
  common(global.rstTracks);
};

local.sb69 = () => {
  common(global.sb69Tracks);
};

function trackMemeImpact(map) {
  const base = local.base;
  const era = local.era;
  if (base < 0.0 || base > 1.0) {
    throw new Error("base must be between 0.0 and 1.0");
  }
  const eraIndex = allEras.indexOf(era);
  if (eraIndex < 0) {
    throw new Error(`unknown era ${era}`);
  }

  const sum = [...map.values()]
    .map((arr) => arr[eraIndex])
    .reduce((a, b) => a + b);
  for (const [id, multipliers] of map) {
    const factor = (multipliers[eraIndex] * base) / sum;
    if (factor > 0) {
      self.value[0].contributors.set(
        id,
        self.root.context.api.newScalarMatrix(factor),
      );
    }
  }
}

local.rstTrackMemeImpact = () => {
  trackMemeImpact(global.rstTracks);
};

local.sb69TrackMemeImpact = () => {
  trackMemeImpact(global.sb69Tracks);
};
