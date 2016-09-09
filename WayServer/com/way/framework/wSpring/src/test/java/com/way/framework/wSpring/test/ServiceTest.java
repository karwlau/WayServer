package com.way.framework.wSpring.test;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.way.framework.wSpring.HelloWorld;;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/*.xml" })
public class ServiceTest {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(ServiceTest.class.getName());

	@Test
	public void test() {
		try {
			// ApplicationContext
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
			HelloWorld obj = (HelloWorld) context.getBean("helloBean");
			obj.printHello();
			context.close();
			// System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ServiceTest t = new ServiceTest();
		t.test();
	}
}
