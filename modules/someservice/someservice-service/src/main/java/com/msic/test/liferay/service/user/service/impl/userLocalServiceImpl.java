/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.msic.test.liferay.service.user.service.impl;

import com.liferay.portal.aop.AopService;

import com.msic.test.liferay.service.user.service.base.userLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.msic.test.liferay.service.user.model.user",
	service = AopService.class
)
public class userLocalServiceImpl extends userLocalServiceBaseImpl {
}