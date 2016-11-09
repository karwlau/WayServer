package com.way.utils.reptile.util;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.log4j.Logger;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@SuppressWarnings("deprecation")
public class JedisUtils {
	public static JedisPool jedisPool = null;
	public static Logger log = Logger.getLogger(JedisUtils.class);

	public static Jedis init() {
		if (jedisPool == null) {
			JedisPoolConfig config = new JedisPoolConfig();
			config.setMaxIdle(10);
			config.setMaxTotal(20);
			jedisPool = new JedisPool(config, "localhost", 6379, 30000, "myRedis");
		}
		Jedis jedis = jedisPool.getResource();
		jedis.select(1);
		return jedis;
	}

	public static void pushQ(String key, String value) {
		Jedis jedis = init();
		try {
			jedis.lpush(key, value);
		} catch (Exception e) {
			log.info("Error : pushQ [key:" + key + ",value:" + value + "]");
		} finally {
			jedisPool.returnResource(jedis);
		}
	}

	public static String popQ(String key) {
		Jedis jedis = init();
		try {
			return jedis.lpop(key);
		} catch (Exception e) {
			log.info("Error : popQ [key:" + key + "]");
			return null;
		} finally {
			jedisPool.returnResource(jedis);
		}
	}

	public static void pushH(String key, String field, String value) {
		Jedis jedis = init();
		try {
			jedis.hset(key, field, value);
		} catch (Exception e) {
			log.info("Error : pushH [key:" + key + ",field:" + field + ",value:" + value + "]");
		} finally {
			jedisPool.returnResource(jedis);
		}
	}

	public static void export() {
		try {
			String expKey = "image";
			Jedis jedis = new Jedis("localhost");
			jedis.auth("myRedis");
			jedis.select(1);
			File file = new File("G://pic.txt");
			FileOutputStream fos = new FileOutputStream(file);
			String str = jedis.lpop(expKey);
			while (str != null) {
				fos.write(str.getBytes());
				fos.write('\r');
				fos.write('\n');
				str = jedis.lpop(expKey);
			}
			fos.close();
			jedis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exportHTML() {
		try {
			String expKey = "image";
			Jedis jedis = new Jedis("localhost");
			jedis.auth("myRedis");
			jedis.select(1);
			boolean tag = true;
			while (tag) {
				File file = new File("G://pic.html");
				FileOutputStream fos = new FileOutputStream(file);
				String str = jedis.lpop(expKey);
				int i = 0;
				fos.write("<html><head></head><body>".getBytes());
				String imgHead = "<img src=\"";
				String imgTail = "\" />";
				while (str != null && i++ < 50) {
					fos.write(imgHead.getBytes());
					fos.write(str.getBytes());
					fos.write(imgTail.getBytes());
					fos.write('\n');
					str = jedis.lpop(expKey);
				}
				fos.write("</body></html>".getBytes());
				fos.close();
				if(jedis.llen(expKey) < 1){
					tag = false;
				}
			}
			jedis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void exportDown() {
		try {
			String expKey = "image";
			Jedis jedis = new Jedis("localhost");
			jedis.auth("myRedis");
			jedis.select(1);
			String str = jedis.lpop(expKey);
			String name = null;
			while (str != null) {
				name = str.replace('/', 'a');
				name = name.substring(name.length()-20, name.length());
//				HttpUtils.down2(str, "dir", name);
				str = jedis.lpop(expKey);
			}
			jedis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		export();
	}
}
