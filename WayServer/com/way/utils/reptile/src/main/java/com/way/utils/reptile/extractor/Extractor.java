package com.way.utils.reptile.extractor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.way.utils.reptile.factory.ExtraFactory;
import com.way.utils.reptile.model.Task;

public abstract class Extractor {
	public abstract void extract(Task task);

	List<String> positiveList = new ArrayList<String>();
	List<String> negativeList = new ArrayList<String>();

	public void addPositive(String reg) {
		positiveList.add(reg);
	}

	public void addNegative(String reg) {
		negativeList.add(reg);
	}

	public boolean checkReg(String url) {
		for (String str : negativeList) {
			if (Pattern.matches(str, url)) {
				return false;
			}
		}
		for (String str : positiveList) {
			if (Pattern.matches(str, url)) {
				return true;
			}
		}
		return false;
	}

	public void mark(String url) {
		ExtraFactory.accessed.add(url);
	}
}
