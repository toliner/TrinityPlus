/*
 * Copyright (c) 2019. toliner.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 *   License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is "Incompatible With Secondary Licenses", as
 * defined by the Mozilla Public License, v. 2.0.
 */

package toliner.trinityplus.app

import toliner.trinityplus.view.MainView
import tornadofx.*
import java.io.File
import java.nio.file.Paths

class TrinityPlusApp : App(MainView::class) {

    override val configBasePath = Paths.get(System.getProperty("user.home"), "Trinity+")!!.also {
        it.toFile().apply {
            if (!exists()) {
                mkdirs()
            }
        }
    }

    init {
        File(config.string("game_directory", configBasePath.toAbsolutePath().toString())).mkdirs()
    }
}