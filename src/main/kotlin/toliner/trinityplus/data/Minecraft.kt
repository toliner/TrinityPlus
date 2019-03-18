package toliner.trinityplus.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Minecraft(
        @SerialName("modLoaders")
        val modLoaders: List<ModLoader>,
        @SerialName("version")
        val version: String
)