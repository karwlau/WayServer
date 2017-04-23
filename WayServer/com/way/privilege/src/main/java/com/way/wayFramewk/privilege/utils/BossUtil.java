package com.way.wayFramewk.privilege.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.SerializationCodec;
import org.redisson.config.Config;
import org.redisson.config.MasterSlaveServersConfig;

import com.way.wayFramewk.privilege.constant.Constants;
import com.way.wayFramewk.privilege.entity.SysMenu;
import com.way.wayFramewk.privilege.service.SysMenuService;
import com.way.wayFramewk.privilege.service.SysRoleService;

public class BossUtil {
	public static RedissonClient client;
	static {
		// 配置
		Config config = new Config();
		config.setCodec(new SerializationCodec());
		MasterSlaveServersConfig msConfig = config.useMasterSlaveServers();
		msConfig.setMasterAddress("127.0.0.1:6379");
		msConfig.setDatabase(1);
		//msConfig.setPassword("myRedis");
		// 连接
		client = Redisson.create(config);
	}

	public static void initPrivilege() {
		SysMenuService sysMenuService = (SysMenuService) SpringUtils.getBean("sysMenuService");
		SysRoleService sysRoleService = (SysRoleService) SpringUtils.getBean("sysRoleService");
		// SysUserService sysUserService = (SysUserService)
		// SpringUtils.getBean("sysUserService");
		// List<SysMenu> sysList = sysMenuService.getSysList();
		Map<Long, SysMenu> menuMap = sysMenuService.getAllMap();
		Map<Long, List<Long>> roleMenuMap = sysMenuService.getAllRoleMenuMap();
		Map<Long, List<Long>> userRoleMap = sysRoleService.getAllUserRoleMap();

		// user,sys,menu
		Map<Long, Map<String, Map<String, Boolean>>> ctrlMap = BossUtil.client.getMap(Constants.BOSS_CONTROL);
		Map<String, Map<String, Boolean>> userCtrlMap = null;
		Map<String, Boolean> userSysCtrlMap = null;
		List<Long> userMenus = null;
		SysMenu menu = null;
		for (Entry<Long, List<Long>> ur : userRoleMap.entrySet()) {
			userCtrlMap = ctrlMap.get(ur.getKey());
			if (userCtrlMap == null) {
				userCtrlMap = new HashMap<String, Map<String, Boolean>>();
			}
			userMenus = new ArrayList<Long>();
			for (Long urRoleId : ur.getValue()) {
				if (roleMenuMap.containsKey(urRoleId)) {
					userMenus.addAll(roleMenuMap.get(urRoleId));
				}
			}

			for (Long urMenuId : userMenus) {
				menu = menuMap.get(urMenuId);
				if (menu != null) {
					userSysCtrlMap = userCtrlMap.get(menu.getSysCode());
					if (userSysCtrlMap == null) {
						userSysCtrlMap = new HashMap<String, Boolean>();
						userCtrlMap.put(menu.getSysCode(), userSysCtrlMap);
					}
					userSysCtrlMap.put(menu.getCode(), true);
				}
			}
			ctrlMap.put(ur.getKey(), userCtrlMap);
		}
	}

}
