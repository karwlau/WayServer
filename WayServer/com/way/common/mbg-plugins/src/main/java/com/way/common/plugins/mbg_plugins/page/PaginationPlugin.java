package com.way.common.plugins.mbg_plugins.page;

import java.util.List;

import org.mybatis.generator.api.PluginAdapter;

public class PaginationPlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

}
