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
data class ModLoader(
        @SerialName("id")
        @SerialId(1)
        val id: String, // forge-12.18.3.2511
        @SerialName("primary")
        @SerialId(2)
        val primary: Boolean // true
)