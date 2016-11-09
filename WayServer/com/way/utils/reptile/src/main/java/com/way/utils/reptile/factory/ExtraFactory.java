package com.way.utils.reptile.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.way.utils.reptile.extractor.Extractor;
import com.way.utils.reptile.model.Task;
import com.way.utils.reptile.util.Config;

public class ExtraFactory {

	public static ExecutorService pool;

	public static Set<String> accessed = new ConcurrentSkipListSet<String>();
	
	public static List<Extractor> extractors = new ArrayList<Extractor>();

	public static void start() {
		if (pool == null) {
			pool = Executors.newFixedThreadPool(Config.threads);
		}
		Task task = new Task(0, Config.root);
		ExtraFactory.accessed.add(Config.root);
		pool.execute(task);
	}
	
	public static boolean check(String url){
		return !ExtraFactory.accessed.contains(url);
	}
	
}
