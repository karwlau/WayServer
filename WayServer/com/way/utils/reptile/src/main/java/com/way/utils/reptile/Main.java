package com.way.utils.reptile;

import com.way.utils.reptile.extractor.Extractor;
import com.way.utils.reptile.extractor.PicExtractor;
import com.way.utils.reptile.extractor.UrlExtractor;
import com.way.utils.reptile.factory.ExtraFactory;
import com.way.utils.reptile.util.Config;
import com.way.utils.reptile.util.JedisUtils;

import redis.clients.jedis.Jedis;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Config.searchDepth = 1;
		Config.threads = 16;
		Config.root = "http://www.7160.com";

		Extractor picExac = new PicExtractor();
		picExac.addPositive("(.*)7160(.*)\\.jpg");
//		picExac.addNegative("(.*)limg(.*)\\.jpg");
		ExtraFactory.extractors.add(picExac);
		Extractor urlExac = new UrlExtractor();
		urlExac.addPositive("(.*)7160(.*)");
		ExtraFactory.extractors.add(urlExac);
		
		ExtraFactory.start();

//		Jedis jedis = JedisUtils.init();
//		while (true) {
//			System.out.println(jedis.llen("image"));
//			Thread.sleep(2000);
//		}
	}
}
