package toliner.trinityplus.view

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView
import javafx.geometry.Pos
import kfoenix.jfxbutton
import toliner.trinityplus.controller.ProfileListController
import tornadofx.*

// Profileの一覧
class ProfileListView : View() {

    private val controller: ProfileListController by inject()

    init {
        this.title = "インストール済みのModpack"
    }

    override val root = flowpane {
        controller.getProfileList().forEach { profile ->
            vbox {
                imageview(profile.icon)
                label(profile.name) {
                    alignment = Pos.CENTER
                }
                label("バージョン: ${profile.manifest.version}") {
                    alignment = Pos.CENTER
                }
                label("作者: ${profile.manifest.author}") {
                    alignment = Pos.CENTER
                }
            }
            hbox {
                if (controller.hasUpdate(profile)) {
                    jfxbutton {
                        FontAwesomeIconView(FontAwesomeIcon.DOWNLOAD).attachTo(this)
                        setOnMouseClicked {
                            // ToDo
                        }
                    }
                }
                jfxbutton("プレイ") {
                    setOnMouseClicked {
                        // ToDo
                    }
                }
            }
        }
    }
}

