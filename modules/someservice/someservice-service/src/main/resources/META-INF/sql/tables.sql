create table user_user (
	uuid_ VARCHAR(75) null,
	userId LONG not null primary key,
	groupId LONG,
	uId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);