package com.way.common.plugins.mbg_plugins.service;

import java.util.Arrays;
import java.util.List;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class ServicePlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
		GeneratedJavaFile file = this.serviceIntGenerate(introspectedTable);
		GeneratedJavaFile fileImpl = this.serviceImplGenerate(introspectedTable);
		return Arrays.asList(file, fileImpl);
	}

	private GeneratedJavaFile serviceIntGenerate(IntrospectedTable introspectedTable) {
		String servicePath = this.getContext().getProperty("service_path");
		String className = introspectedTable.getBaseRecordType();
		className = className.substring(className.lastIndexOf(".") + 1);
		String serviceName = servicePath + "." + className + "Service";

		Interface service = new ServiceIntGenerator(context, introspectedTable, serviceName);
		GeneratedJavaFile file = new GeneratedJavaFile(service,
				this.getContext().getJavaClientGeneratorConfiguration().getTargetProject(),
				this.getContext().getJavaFormatter());

		return file;
	}

	private GeneratedJavaFile serviceImplGenerate(IntrospectedTable introspectedTable) {
		String servicePath = this.getContext().getProperty("service_path");
		String className = introspectedTable.getBaseRecordType();
		className = className.substring(className.lastIndexOf(".") + 1);
		String serviceImplName = servicePath + ".impl." + className + "ServiceImpl";

		TopLevelClass serviceImpl = new ServiceImpGenerator(context, introspectedTable, serviceImplName);
		GeneratedJavaFile file = new GeneratedJavaFile(serviceImpl,
				this.getContext().getJavaClientGeneratorConfiguration().getTargetProject(),
				this.getContext().getJavaFormatter());
		return file;
	}

}
