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

