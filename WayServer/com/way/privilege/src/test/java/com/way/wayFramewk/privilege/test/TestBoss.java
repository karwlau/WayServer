package com.way.wayFramewk.privilege.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.way.wayFramewk.privilege.constant.Constants;
import com.way.wayFramewk.privilege.entity.SysMenu;
import com.way.wayFramewk.privilege.utils.BossUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/applicationContext-mvc.xml" })
public class TestBoss {
	// @Test
	public void test() {
		Map<Long, Map<Long, SysMenu>> buc = BossUtil.client.getMap(Constants.SYSTEM_KEY);
		// SysMenu menu = new SysMenu();
		// List<SysMenu> list = new ArrayList<SysMenu>();
		// list.add(menu);
		// buc.put(new Long (1), list);

		SysMenu menu = new SysMenu();
		Map<Long, SysMenu> map = new HashMap<Long, SysMenu>();
		map.put(new Long(2), menu);
		buc.put(new Long(1), map);

		buc.get(new Long(1));
		System.out.println(buc);
	}

	@Test
	public void testInit() {
		try {
			BossUtil.initPrivilege();
			Map<Long, Map<String, Map<String, Boolean>>> ctrlMap = BossUtil.client.getMap(Constants.BOSS_CONTROL);
			System.out.println(ctrlMap.entrySet());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
