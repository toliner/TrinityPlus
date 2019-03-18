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
