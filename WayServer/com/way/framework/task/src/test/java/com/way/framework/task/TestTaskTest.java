package com.way.framework.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/biz-*.xml" })
public class TestTaskTest {
	@Test
	public void test() {
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
