package toliner.trinityplus.model

import toliner.trinityplus.data.Profile
import tornadofx.*

object ProfileManagementModel {
    val profiles = listOf<Profile>().observable()
}