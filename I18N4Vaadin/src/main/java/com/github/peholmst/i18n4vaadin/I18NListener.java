/*
 * Copyright (c) 2011 Petter Holmström
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.peholmst.i18n4vaadin;

import java.util.Locale;

/**
 * Listener interface to be implemented by classes that need to be notified when
 * the current locale of an {@link com.github.peholmst.i18n4vaadin.I18N} changes.
 * 
 * @see com.github.peholmst.i18n4vaadin.I18N#addListener(com.github.peholmst.i18n4vaadin.I18NListener)
 * @see com.github.peholmst.i18n4vaadin.I18N#setCurrentLocale(java.util.Locale)
 * 
 * @author Petter Holmström
 * @since 1.0
 */
public interface I18NListener extends java.io.Serializable {

	/**
	 * Called when the current locale of an {@link com.github.peholmst.i18n4vaadin.I18N} has changed.
	 * 
	 * @param sender
	 *            the source of the event (never <code>null</code>).
	 * @param oldLocale
	 *            the old locale (may be <code>null</code>).
	 * @param newLocale
	 *            the new locale (may be <code>null</code>).
	 */
	void localeChanged(I18N sender, Locale oldLocale, Locale newLocale);
}
