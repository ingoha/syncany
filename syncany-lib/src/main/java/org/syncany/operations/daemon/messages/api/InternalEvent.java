/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011-2014 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.syncany.operations.daemon.messages.api;

import org.simpleframework.xml.Root;

/**
 * Internal events are {@link Event}s meant for JVM-local consumers.
 *  
 * <p>In particular, they are not to be broadcasted to external subscribers,
 * such as GUIs connected via WS, but only to the local event bus.
 *  
 * @author Philipp C. Heckel <philipp.heckel@gmail.com>
 */
@Root
public abstract class InternalEvent extends Event {
	// Marker
}
