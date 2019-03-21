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
data class ModpackManifest(
        @SerialName("author")
        @SerialId(1)
        val author: String,
        @SerialName("files")
        @SerialId(2)
        val files: List<ModFile>,
        @SerialName("manifestType")
        @SerialId(3)
        val manifestType: String = "minecraftModpack",
        @SerialName("manifestVersion")
        @SerialId(4)
        val manifestVersion: Int = 1,
        @SerialName("minecraft")
        @SerialId(5)
        val minecraft: Minecraft,
        @SerialName("name")
        @SerialId(6)
        val name: String,
        @SerialName("overrides")
        @SerialId(7)
        val overrides: String, // Directory name of override files
        @SerialName("version")
        @SerialId(8)
        val version: String
)