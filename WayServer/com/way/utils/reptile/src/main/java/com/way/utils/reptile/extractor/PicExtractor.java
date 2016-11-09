package com.way.utils.reptile.extractor;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.way.utils.reptile.factory.ExtraFactory;
import com.way.utils.reptile.model.Task;
import com.way.utils.reptile.util.JedisUtils;

public class PicExtractor extends Extractor {

	public void extract(Task task) {
		Elements eles = task.doc.select("img");
		String urlPath = null;
		for (Element e : eles) {
			urlPath = e.attr("abs:src");
			if (urlPath != null && ExtraFactory.check(urlPath)) {
				mark(urlPath);
				if (checkReg(urlPath)) {
					duel(urlPath);
				}
			}
		}
	}

	protected void duel(String urlPath) {
		// String name = urlPath.substring(urlPath.lastIndexOf('/') + 1);
		// HttpUtils.down(urlPath, "pic", name);

		JedisUtils.pushQ("image", urlPath);
	}
}
