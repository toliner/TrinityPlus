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