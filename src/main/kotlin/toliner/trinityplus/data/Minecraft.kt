package toliner.trinityplus.data

import kotlinx.serialization.SerialId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Minecraft(
        @SerialName("modLoaders")
        @SerialId(1)
        val modLoaders: List<ModLoader>,
        @SerialName("version")
        @SerialId(2)
        val version: String
)