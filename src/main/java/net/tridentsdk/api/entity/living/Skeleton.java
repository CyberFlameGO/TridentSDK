/*
 *     TridentSDK - A Minecraft Server API
 *     Copyright (C) 2014, The TridentSDK Team
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.tridentsdk.api.entity.living;

import net.tridentsdk.api.entity.Equippable;
import net.tridentsdk.api.entity.Hostile;

/**
 * Represents a skeleton mob
 *
 * @author The TridentSDK Team
 */
public interface Skeleton extends Hostile, Equippable {
    /**
     * Whether or not this is a Wither Skeleton
     *
     * @return whether or not this skeleton is a Wither Skeleton
     */
    boolean isWither();
}
