/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ui.internal.editors.text;


/**
 * Not yet for public use. API under construction.
 * 
 * @since 3.1
 */
public class ConvertLineDelimitersToWindows extends ConvertLineDelimitersAction {

	public ConvertLineDelimitersToWindows(){
		super("\r\n", TextEditorMessages.getString("ConvertLineDelimitersToWindows.label")); //$NON-NLS-1$ //$NON-NLS-2$
	}
}