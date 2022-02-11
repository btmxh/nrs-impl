package com.dah.nrs

fun GenerateBlock.CommonArtists() {
    Entry {
        id = "M-1"
        title = "Asterisk"

        Contains("M-35", 1.0 / 3)
    }

    Entry {
        id = "M-34"
        title = "Rakakun"

        Contains("M-35", 1.0 / 3)
    }

    Entry {
        id = "M-VGMDB-AR-15361"
        title = "Minase Inori"

        Contains("M-9", 1.0 / 5)
        Contains("M-44", 1.0 / 4)

        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-54418-1")
            Contains("M-VGMDB-AL-55364-3")
        }
    }

    Entry {
        id = "M-VGMDB-AR-15350"
        title = "M·A·O"

        Contains("M-44", 1.0 / 4)
    }

    Entry {
        id = "M-VGMDB-AR-15380"
        title = "Takahashi Rie"

        Contains("M-44", 1.0 / 4)

        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-53719-1")
        }
    }

    Entry {
        id = "M-VGMDB-AR-15998"
        title = "Ozawa Ari"

        Contains("M-13", 1.0 / 2)
        Contains("M-44", 1.0 / 4)

        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-53719-2")
        }
    }

    Entry {
        id = "M-VGMDB-AR-12726"
        title = "Sakura Ayane"

        Contains(ImageVocalContainFactor) {
            Contains("M-9", 1.0 / 5)
        }
    }

    Entry {
        id = "M-VGMDB-AR-13211"
        title = "Taneda Risa"

        Contains(ImageVocalContainFactor) {
            Contains("M-9", 1.0 / 5)
        }
    }

    Entry {
        id = "M-VGMDB-AR-8874"
        title = "Sato Satomi"

        Contains(ImageVocalContainFactor) {
            Contains("M-9", 1.0 / 5)
        }
    }

    Entry {
        id = "M-VGMDB-AR-13289"
        title = "Uchida Maaya"

        Contains(ImageVocalContainFactor) {
            Contains("M-9", 1.0 / 5)
        }
    }

    Entry {
        id = "M-VGMDB-AR-13857"
        title = "fhána"

        // band, so no Contains(ImageVocalContainFactor) block
        Contains("M-VGMDB-AL-62516")
        Contains("M-VGMDB-AL-110219")
    }

    Entry {
        id = "M-VGMDB-AR-25289"
        title = "Koyama Hidekazu"
        // aka the god nanou

        Contains("M-VGMDB-AL-37130-1", 0.1)
        Contains("M-VGMDB-AL-37130-2", 0.1)
        Contains("M-VGMDB-AL-37130-3", 0.05)
        Contains("M-VGMDB-AL-37130-4", 0.1)
        Contains("M-VGMDB-AL-37130-5", 0.1)
        Contains("M-VGMDB-AL-37130-6", 0.1)

        Contains("M-VGMDB-AL-49423-1", 0.2)
    }

    Entry {
        id = "M-VGMDB-AR-15119"
        title = "Scop"

        Contains("M-VGMDB-AL-37130-1", 0.2)
        Contains("M-VGMDB-AL-37130-2", 0.1)
        Contains("M-VGMDB-AL-37130-3", 0.05)

        Contains("M-VGMDB-AL-34411-11", 0.2)
    }

    Entry {
        id = "M-VGMDB-AR-15120"
        title = "keeno"

        Contains("M-VGMDB-AL-37130-4", 0.1)
        Contains("M-VGMDB-AL-37130-5", 0.1)
        Contains("M-VGMDB-AL-37130-6", 0.1)

        Contains("M-VGMDB-AL-49423-8", 0.2)
    }
}