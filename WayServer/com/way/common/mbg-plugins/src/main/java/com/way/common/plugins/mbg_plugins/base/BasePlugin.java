package com.way.common.plugins.mbg_plugins.base;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import com.way.common.plugins.mbg_plugins.utils.constants.SType;

public class BasePlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public void initialized(IntrospectedTable introspectedTable) {
		super.initialized(introspectedTable);
		SType.initRecord(introspectedTable);
	}

	@Override
	public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		interfaze.addAnnotation("@Repository");
		interfaze.addImportedType(SType.ANO_REPOSITORY.getFQJType());
		return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
	}
}
