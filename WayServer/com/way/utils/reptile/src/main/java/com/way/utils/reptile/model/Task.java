package com.way.utils.reptile.model;

import org.jsoup.nodes.Document;

import com.way.utils.reptile.extractor.Extractor;
import com.way.utils.reptile.factory.ExtraFactory;
import com.way.utils.reptile.util.HttpUtils;

public class Task implements Runnable {
	public int depth = 0;
	public String url;
	public Document doc = null;

	public Task(int depth, String url) {
		this.depth = depth;
		this.url = url;
	}

	@Override
	public void run() {
		doc = HttpUtils.get(url);
		for(Extractor extract : ExtraFactory.extractors){
			extract.extract(this);
		}
	}


}
