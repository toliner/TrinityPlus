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

package toliner.trinityplus.view

import kfoenix.jfxtabpane
import tornadofx.*

class MainView : View("Trinity+") {

    override val root = jfxtabpane {
        prefWidth = 840.0
        prefHeight = 640.0
        importStylesheet(resources["/MainViewStyle.css"])
        tab(find<ProfileListView>())
        tab(find<SearchModpackView>())
        tab(find<SearchFTBPackView>())
        tab(find<CreateNewProfileFragment>())
    }
}
