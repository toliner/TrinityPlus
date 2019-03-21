package toliner.trinityplus.data

import kotlinx.serialization.SerialId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModFile(
        @SerialName("fileID")
        @SerialId(1)
        val fileID: Int,
        @SerialName("projectID")
        @SerialId(2)
        val projectID: Int,
        @SerialName("required")
        @SerialId(3)
        val required: Boolean = true
)