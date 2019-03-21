package toliner.trinityplus.app

import toliner.trinityplus.view.MainView
import tornadofx.*
import java.io.File
import java.nio.file.Paths

class TrinityPlusApp : App(MainView::class) {

    override val configBasePath = Paths.get(System.getProperty("user.home"), "Trinity+")!!.also {
        it.toFile().apply {
            if (!exists()) {
                mkdirs()
            }
        }
    }

    init {
        File(config.string("game_directory", configBasePath.toAbsolutePath().toString())).mkdirs()
    }
}