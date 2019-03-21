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