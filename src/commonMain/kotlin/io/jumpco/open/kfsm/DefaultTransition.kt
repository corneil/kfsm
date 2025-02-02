/*
 * Copyright (c) 2019. Open JumpCO
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.jumpco.open.kfsm

/**
 * Represents a DefaultTransition
 * @param event The event identifies the transition
 * @param endState when optional represents an internal transition
 * @param action optional lambda will be invoked when transition occurs.
 */
class DefaultTransition<E : Enum<E>, S : Enum<S>, C>(
    internal val event: E,
    endState: S? = null,
    action: StateAction<C>? = null
) : Transition<S, E, C>(endState, action)
