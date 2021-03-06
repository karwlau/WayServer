SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS sys_dept_user;
DROP TABLE IF EXISTS sys_dept;
DROP TABLE IF EXISTS sys_dict;
DROP TABLE IF EXISTS sys_memver;
DROP TABLE IF EXISTS sys_memver_level;
DROP TABLE IF EXISTS sys_role_menu;
DROP TABLE IF EXISTS sys_menu;
DROP TABLE IF EXISTS sys_user_role;
DROP TABLE IF EXISTS sys_role;
DROP TABLE IF EXISTS sys_user;




/* Create Tables */

-- sys_dept : 部门表
CREATE TABLE sys_dept
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	name varchar(64) COMMENT 'name',
	parent_id bigint COMMENT 'parent_id',
	-- 部门编码
	code varchar(32) COMMENT 'code : 部门编码',
	-- 菜单id路径
	path varchar(128) COMMENT 'path : 菜单id路径',
	is_delete boolean DEFAULT '0' COMMENT 'is_delete',
	create_time datetime DEFAULT NULL COMMENT 'create_time',
	create_by bigint COMMENT 'create_by',
	update_time datetime COMMENT 'update_time',
	update_by bigint COMMENT 'update_by',
	PRIMARY KEY (id)
) COMMENT = 'sys_dept : 部门表';


-- sys_dept_user
CREATE TABLE sys_dept_user
(
	dept_id bigint NOT NULL COMMENT 'dept_id',
	user_id bigint NOT NULL COMMENT 'user_id',
	is_head boolean COMMENT 'is_head'
) COMMENT = 'sys_dept_user';


-- sys_dict
CREATE TABLE sys_dict
(
	-- id
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id : id',
	name varchar(64) COMMENT 'name',
	code varchar(64) COMMENT 'code ',
	parent_id bigint COMMENT 'parent_id',
	parent_code varchar(64) COMMENT 'parent_code',
	value varchar(128) COMMENT 'value',
	descr varchar(512) COMMENT 'descr',
	is_delete boolean DEFAULT '0' COMMENT 'is_delete',
	create_time datetime DEFAULT NULL COMMENT 'create_time',
	create_by bigint COMMENT 'create_by',
	update_time datetime COMMENT 'update_time',
	update_by bigint COMMENT 'update_by',
	PRIMARY KEY (id)
) COMMENT = 'sys_dict';


-- sys_memver
CREATE TABLE sys_memver
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	name varchar(64) COMMENT 'name',
	member_no varchar(64) COMMENT 'member_no',
	third_key varchar(64) COMMENT 'third_key',
	level_id bigint COMMENT 'level_id',
	level_name varchar(64) COMMENT 'level_name',
	expire_dt datetime COMMENT 'expire_dt',
	is_delete boolean DEFAULT '0' COMMENT 'is_delete',
	create_time datetime DEFAULT NULL COMMENT 'create_time',
	create_by bigint COMMENT 'create_by',
	update_time datetime COMMENT 'update_time',
	update_by bigint COMMENT 'update_by',
	id bigint NOT NULL COMMENT 'id',
	PRIMARY KEY (id),
	UNIQUE (id),
	UNIQUE (id)
) COMMENT = 'sys_memver';


-- sys_memver_level
CREATE TABLE sys_memver_level
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	name varchar(64) COMMENT 'name',
	priority int COMMENT 'priority',
	is_delete boolean DEFAULT '0' COMMENT 'is_delete',
	create_time datetime DEFAULT NULL COMMENT 'create_time',
	create_by bigint COMMENT 'create_by',
	update_time datetime COMMENT 'update_time',
	update_by bigint COMMENT 'update_by',
	PRIMARY KEY (id),
	UNIQUE (id)
) COMMENT = 'sys_memver_level';


-- sys_menu : 权限资源表
CREATE TABLE sys_menu
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	name varchar(64) COMMENT 'name',
	parent_id bigint COMMENT 'parent_id',
	-- 菜单id路径
	path varchar(128) COMMENT 'path : 菜单id路径',
	-- 资源编码
	code varchar(64) COMMENT 'code : 资源编码',
	-- 权限控制编码
	pri_code varchar(64) COMMENT 'pri_code : 权限控制编码',
	-- 系统编码
	sys_code varchar(64) COMMENT 'sys_code : 系统编码',
	-- 排序
	order_no int COMMENT 'order_no : 排序',
	-- 深度
	depth smallint COMMENT 'depth : 深度',
	-- 系统URL
	base_url varchar(128) COMMENT 'base_url : 系统URL',
	url varchar(128) COMMENT 'url',
	is_delete boolean DEFAULT '0' COMMENT 'is_delete',
	create_time datetime DEFAULT NULL COMMENT 'create_time',
	create_by bigint COMMENT 'create_by',
	update_time datetime COMMENT 'update_time',
	update_by bigint COMMENT 'update_by',
	PRIMARY KEY (id)
) COMMENT = 'sys_menu : 权限资源表';


-- sys_role : 角色表
CREATE TABLE sys_role
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	name varchar(64) COMMENT 'name',
	-- 是否拥有权限钥匙
	isKeyOwner boolean COMMENT 'isKeyOwner : 是否拥有权限钥匙',
	-- 角色描述
	description varchar(128) COMMENT 'description : 角色描述',
	is_delete boolean DEFAULT '0' COMMENT 'is_delete',
	create_time datetime DEFAULT NULL COMMENT 'create_time',
	create_by bigint COMMENT 'create_by',
	update_time datetime COMMENT 'update_time',
	update_by bigint COMMENT 'update_by',
	PRIMARY KEY (id)
) COMMENT = 'sys_role : 角色表';


-- sys_role_menu : 角色权限（分配给角色的权限列表）
CREATE TABLE sys_role_menu
(
	role_id bigint NOT NULL COMMENT 'role_id',
	menu_id bigint NOT NULL COMMENT 'menu_id',
	UNIQUE (role_id, menu_id)
) COMMENT = 'sys_role_menu : 角色权限（分配给角色的权限列表）';


-- sys_user : 用户表
CREATE TABLE sys_user
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	name varchar(64) COMMENT 'name',
	is_admin boolean COMMENT 'is_admin',
	salt varchar(8) COMMENT 'salt',
	password varchar(64) COMMENT 'password',
	nick_name varchar(64) COMMENT 'nick_name',
	is_delete boolean DEFAULT '0' COMMENT 'is_delete',
	create_time datetime DEFAULT NULL COMMENT 'create_time',
	create_by bigint COMMENT 'create_by',
	update_time datetime COMMENT 'update_time',
	update_by bigint COMMENT 'update_by',
	PRIMARY KEY (id)
) COMMENT = 'sys_user : 用户表';


-- sys_user_role
CREATE TABLE sys_user_role
(
	user_id bigint NOT NULL COMMENT 'user_id',
	role_id bigint NOT NULL COMMENT 'role_id',
	UNIQUE (user_id, role_id)
) COMMENT = 'sys_user_role';



/* Create Foreign Keys */

ALTER TABLE sys_dept_user
	ADD FOREIGN KEY (dept_id)
	REFERENCES sys_dept (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE sys_memver
	ADD FOREIGN KEY (id)
	REFERENCES sys_memver_level (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE sys_role_menu
	ADD FOREIGN KEY (role_id)
	REFERENCES sys_menu (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE sys_role_menu
	ADD FOREIGN KEY (menu_id)
	REFERENCES sys_role (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE sys_user_role
	ADD FOREIGN KEY (user_id)
	REFERENCES sys_role (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE sys_dept_user
	ADD FOREIGN KEY (user_id)
	REFERENCES sys_user (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE sys_user_role
	ADD FOREIGN KEY (role_id)
	REFERENCES sys_user (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



