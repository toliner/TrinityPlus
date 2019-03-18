package toliner.trinityplus.data

import kotlinx.serialization.Serializable

@Serializable
data class Profile(
        val name: String,
        val isUnlocked: Boolean,
        val lastPlayed: String,
        val manifest: ModpackManifest,
        val uuid: String
)