/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.search.internal.ui.text;

import org.eclipse.core.resources.IMarker;

import org.eclipse.search.ui.IGroupByKeyComputer;

class GroupByKeyComputer implements IGroupByKeyComputer {

	public Object computeGroupByKey(IMarker marker) {
		if (marker == null)
			return null;
		else
			return marker.getResource();
	}
}