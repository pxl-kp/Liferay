/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.msic.test.liferay.service.user.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchuserException extends NoSuchModelException {

	public NoSuchuserException() {
	}

	public NoSuchuserException(String msg) {
		super(msg);
	}

	public NoSuchuserException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchuserException(Throwable throwable) {
		super(throwable);
	}

}