package com.way.common.redison_api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.codec.SerializationCodec;
import org.redisson.config.Config;
import org.redisson.config.MasterSlaveServersConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/biz-cache-redisson-master.xml",
 "classpath:config/applicationContext.xml" })
public class TestRedison {
	// @Test
	public void test() {
		// 配置
		Config config = new Config();
		config.setCodec(new SerializationCodec());
		MasterSlaveServersConfig msConfig = config.useMasterSlaveServers();
		msConfig.setMasterAddress("127.0.0.1:6379");
		msConfig.setDatabase(1);
		msConfig.setPassword("myRedis");
		// 连接
		RedissonClient client = Redisson.create(config);
		// 操作
		RBucket<String> rbo = client.getBucket("abc");
		System.out.println(rbo.get());
	}

	@Test
	public void test2() {
		try {
			Object bean = SpringUtils.getBean("redisson");
			System.out.println(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	}

}