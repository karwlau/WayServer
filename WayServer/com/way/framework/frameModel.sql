SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS sys_role_menu;
DROP TABLE IF EXISTS sys_menu;
DROP TABLE IF EXISTS sys_user_role;
DROP TABLE IF EXISTS sys_role;
DROP TABLE IF EXISTS sys_user;




/* Create Tables */

-- sys_menu : 权限菜单资源
CREATE TABLE sys_menu
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	name varchar(64) COMMENT 'name',
	parentId bigint COMMENT 'parentId',
	path varchar(128) COMMENT 'path',
	code varchar(64) COMMENT 'code',
	priCode varchar(64) COMMENT 'priCode',
	url varchar(128) COMMENT 'url',
	isDelete tinyint(1) COMMENT 'isDelete',
	createTime timestamp NULL DEFAULT NULL COMMENT 'createTime',
	createBy bigint COMMENT 'createBy',
	updateTime timestamp NULL DEFAULT NULL COMMENT 'updateTime',
	updateBy bigint COMMENT 'updateBy',
	PRIMARY KEY (id)
) COMMENT = 'sys_menu : 权限菜单资源';


-- sys_role
CREATE TABLE sys_role
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	name varchar(64) COMMENT 'name',
	isKeyOwner boolean COMMENT 'isKeyOwner',
	isDelete tinyint(1) COMMENT 'isDelete',
	createTime timestamp NULL DEFAULT NULL COMMENT 'createTime',
	createBy bigint COMMENT 'createBy',
	updateTime timestamp NULL DEFAULT NULL COMMENT 'updateTime',
	updateBy bigint COMMENT 'updateBy',
	PRIMARY KEY (id)
) COMMENT = 'sys_role';


-- sys_role_menu
CREATE TABLE sys_role_menu
(
	roleId bigint NOT NULL COMMENT 'roleId',
	menuId bigint NOT NULL COMMENT 'menuId',
	UNIQUE (roleId, menuId)
) COMMENT = 'sys_role_menu';


-- sys_user : 用户表
CREATE TABLE sys_user
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	name varchar(64) COMMENT 'name',
	isAdmin boolean COMMENT 'isAdmin',
	salt varchar(8) COMMENT 'salt',
	password varchar(64) COMMENT 'password',
	nickName varchar(64) COMMENT 'nickName',
	isDelete tinyint(1) COMMENT 'isDelete',
	createTime timestamp NULL DEFAULT NULL COMMENT 'createTime',
	createBy bigint COMMENT 'createBy',
	updateTime timestamp NULL DEFAULT NULL COMMENT 'updateTime',
	updateBy bigint COMMENT 'updateBy',
	PRIMARY KEY (id)
) COMMENT = 'sys_user : 用户表';


-- sys_user_role
CREATE TABLE sys_user_role
(
	userId bigint NOT NULL COMMENT 'userId',
	roleId bigint NOT NULL COMMENT 'roleId',
	UNIQUE (userId, roleId)
) COMMENT = 'sys_user_role';



/* Create Foreign Keys */

ALTER TABLE sys_role_menu
	ADD FOREIGN KEY (roleId)
	REFERENCES sys_menu (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE sys_role_menu
	ADD FOREIGN KEY (menuId)
	REFERENCES sys_role (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE sys_user_role
	ADD FOREIGN KEY (userId)
	REFERENCES sys_role (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE sys_user_role
	ADD FOREIGN KEY (roleId)
	REFERENCES sys_user (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



