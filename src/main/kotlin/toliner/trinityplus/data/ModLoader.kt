package toliner.trinityplus.data

import kotlinx.serialization.SerialId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModLoader(
        @SerialName("id")
        @SerialId(1)
        val id: String, // forge-12.18.3.2511
        @SerialName("primary")
        @SerialId(2)
        val primary: Boolean // true
)