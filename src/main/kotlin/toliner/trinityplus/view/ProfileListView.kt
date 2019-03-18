package toliner.trinityplus.view

import toliner.trinityplus.controller.ProfileListController
import tornadofx.*

// Profileの一覧
class ProfileListView : View() {

    val controller: ProfileListController by inject()

    init {
        this.title = "インストール済みのModpack"
    }

    override val root = vbox {
        label("Hello, World!")
        label("こんにちは世界")
    }
}

