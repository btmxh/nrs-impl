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

  const eraIndexed = eras.map(([era, multiplier]) => [allEras.indexOf(era), multiplier]);
  const fromIndex = allEras.indexOf(from);

  const multipliers = allEras.map((_, i) => i >= fromIndex? 1.0 : 0.0);
  for(const [eraIndex, multiplier] of eraIndexed) {
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

// TODO
local.rstTrackMemeImpact = () => {};
local.sb69TrackMemeImpact = () => {};
