package toliner.trinityplus.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModLoader(
        @SerialName("id")
        val id: String, // forge-12.18.3.2511
        @SerialName("primary")
        val primary: Boolean // true
)