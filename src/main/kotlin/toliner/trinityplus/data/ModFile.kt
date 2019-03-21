/*
 * Copyright (c) 2019. toliner.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 *   License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is "Incompatible With Secondary Licenses", as
 * defined by the Mozilla Public License, v. 2.0.
 */

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