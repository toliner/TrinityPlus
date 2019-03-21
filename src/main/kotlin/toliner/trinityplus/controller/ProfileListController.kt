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

package toliner.trinityplus.controller

import javafx.collections.ObservableList
import toliner.trinityplus.data.Profile
import toliner.trinityplus.model.ProfileManagementModel
import tornadofx.*

class ProfileListController : Controller() {

    init {
        ProfileManagementModel.profileListController = this
    }

    fun getProfileList(): ObservableList<Profile> = ProfileManagementModel.profiles

    fun hasUpdate(profile: Profile): Boolean {
        //ToDo
        return false
    }
}