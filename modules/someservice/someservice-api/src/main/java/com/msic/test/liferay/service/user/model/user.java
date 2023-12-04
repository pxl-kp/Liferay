/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.msic.test.liferay.service.user.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the user service. Represents a row in the &quot;user_user&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see userModel
 * @generated
 */
@ImplementationClassName(
	"com.msic.test.liferay.service.user.model.impl.userImpl"
)
@ProviderType
public interface user extends PersistedModel, userModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.msic.test.liferay.service.user.model.impl.userImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<user, Long> USER_ID_ACCESSOR =
		new Accessor<user, Long>() {

			@Override
			public Long get(user user) {
				return user.getUserId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<user> getTypeClass() {
				return user.class;
			}

		};

}