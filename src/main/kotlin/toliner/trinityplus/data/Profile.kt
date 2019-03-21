package toliner.trinityplus.data

import kotlinx.serialization.SerialId
import kotlinx.serialization.Serializable

@Serializable
data class Profile(
        @SerialId(1)
        val name: String,
        @SerialId(2)
        val uuid: String,
        @SerialId(3)
        val manifest: ModpackManifest,
        @SerialId(4)
        val isUnlocked: Boolean,
        @SerialId(5)
        val lastPlayed: String,
        @SerialId(6)
        val icon: String // uri to icon.
)