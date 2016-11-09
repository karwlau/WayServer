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
		Config.searchDepth = 5;
		Config.threads = 8;
		Config.root = "";
		
		Extractor picExac = new PicExtractor();
		picExac.addPositive("(.*)\\.jpg");
		picExac.addNegative("(.*)\\.jpg");
		ExtraFactory.extractors.add(picExac);
		Extractor urlExac = new UrlExtractor();
		urlExac.addPositive("(.*)");
		ExtraFactory.extractors.add(urlExac);
		
		ExtraFactory.start();

		Jedis jedis = JedisUtils.init();
		while (true) {
			System.out.println(jedis.llen("image"));
			Thread.sleep(2000);
		}
	}
}
