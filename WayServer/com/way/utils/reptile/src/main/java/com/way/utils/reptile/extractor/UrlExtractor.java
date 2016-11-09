package com.way.utils.reptile.extractor;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.way.utils.reptile.factory.ExtraFactory;
import com.way.utils.reptile.model.Task;
import com.way.utils.reptile.util.Config;

public class UrlExtractor extends Extractor {

	public void extract(Task task) {
		Elements eles = task.doc.select("a[href]");
		String urlPath = null;
		for (Element e : eles) {
			urlPath = e.attr("abs:href");
			if (urlPath != null && ExtraFactory.check(urlPath)) {
				mark(urlPath);
				if (checkReg(urlPath) && task.depth < Config.searchDepth) {
					duel(task.depth, urlPath);
				}
			}
		}
	}

	protected void duel(int depth, String urlPath) {
		Task sub = new Task(depth + 1, urlPath);
		ExtraFactory.pool.execute(sub);
	}

}
