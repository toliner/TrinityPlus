package toliner.trinityplus.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModpackManifest(
        @SerialName("author")
        val author: String,
        @SerialName("files")
        val files: List<ModFile>,
        @SerialName("manifestType")
        val manifestType: String = "minecraftModpack",
        @SerialName("manifestVersion")
        val manifestVersion: Int = 1,
        @SerialName("minecraft")
        val minecraft: Minecraft,
        @SerialName("name")
        val name: String,
        @SerialName("overrides")
        val overrides: String, // overrides
        @SerialName("version")
        val version: String // 1.1.2
)