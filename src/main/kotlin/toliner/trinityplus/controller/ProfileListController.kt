package toliner.trinityplus.controller

import javafx.collections.ObservableList
import toliner.trinityplus.data.Profile
import toliner.trinityplus.model.ProfileManagementModel
import tornadofx.*

class ProfileListController : Controller() {


    fun getProfileList(): ObservableList<Profile> = ProfileManagementModel.profiles
}