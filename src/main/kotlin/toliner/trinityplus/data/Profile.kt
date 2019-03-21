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