package toliner.trinityplus.app

import javafx.scene.text.FontWeight
import tornadofx.*

class TrinityPlusStyles : Stylesheet() {
    companion object {
        val heading by cssclass()
    }

    init {
        Stylesheet.label and heading {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }
    }
}