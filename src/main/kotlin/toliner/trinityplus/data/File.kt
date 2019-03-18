package toliner.trinityplus.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class File(
        @SerialName("fileID")
        val fileID: Int,
        @SerialName("projectID")
        val projectID: Int,
        @SerialName("required")
        val required: Boolean = true
)