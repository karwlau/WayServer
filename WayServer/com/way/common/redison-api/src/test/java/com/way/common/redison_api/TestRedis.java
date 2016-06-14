package com.way.common.redison_api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.Redisson;
import org.redisson.core.RKeys;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/biz-*.xml" })
public class TestRedis {

	@Test
	public void test() {
		try {
			System.out.println();
			Redisson redisson = (Redisson) SpringUtils.getBean("redisson");
			RKeys rKeys = redisson.getKeys();
			System.out.println(rKeys);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
