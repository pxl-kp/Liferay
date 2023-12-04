/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.msic.test.liferay.service.user.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.msic.test.liferay.service.user.model.user;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing user in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class userCacheModel implements CacheModel<user>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof userCacheModel)) {
			return false;
		}

		userCacheModel userCacheModel = (userCacheModel)object;

		if (userId == userCacheModel.userId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", uId=");
		sb.append(uId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public user toEntityModel() {
		userImpl userImpl = new userImpl();

		if (uuid == null) {
			userImpl.setUuid("");
		}
		else {
			userImpl.setUuid(uuid);
		}

		userImpl.setUserId(userId);
		userImpl.setGroupId(groupId);
		userImpl.setUId(uId);

		if (userName == null) {
			userImpl.setUserName("");
		}
		else {
			userImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			userImpl.setCreateDate(null);
		}
		else {
			userImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userImpl.setModifiedDate(null);
		}
		else {
			userImpl.setModifiedDate(new Date(modifiedDate));
		}

		userImpl.resetOriginalValues();

		return userImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userId = objectInput.readLong();

		groupId = objectInput.readLong();

		uId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(uId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long userId;
	public long groupId;
	public long uId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}