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

package toliner.trinityplus.model

import javafx.collections.FXCollections
import toliner.trinityplus.controller.ProfileListController
import toliner.trinityplus.data.Profile
import tornadofx.*

object ProfileManagementModel {
    var profileListController by singleAssign<ProfileListController>()
    val profiles = FXCollections.synchronizedObservableList(listOf<Profile>().observable())

    fun onProfileListControllerAssigned() {

    }

    fun loadProfileList() {

    }
}