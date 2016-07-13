package com.way.common.plugins.mbg_plugins.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import com.way.common.plugins.mbg_plugins.service.constants.MbgType;
import com.way.common.plugins.mbg_plugins.service.constants.TypeName;

public class ServicePlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	final Map<TypeName, MbgType> MTYPES = new HashMap<TypeName, MbgType>();

	private void init(IntrospectedTable introspectedTable) {
		MTYPES.put(TypeName.PAGE, new MbgType("com.appleframework.model.page.Pagination", "page"));
		MTYPES.put(TypeName.LONG, new MbgType("java.lang.Long", "id"));
		MTYPES.put(TypeName.RECORD, new MbgType(introspectedTable.getBaseRecordType(), "record"));
		MTYPES.put(TypeName.EXAMPLE, new MbgType(introspectedTable.getExampleType(), "example"));
		MTYPES.put(TypeName.MAPPER, new MbgType(introspectedTable.getMyBatis3JavaMapperType()));
		String servicePath = this.getContext().getProperty("service_path");
		MTYPES.put(TypeName.SERVICE,
				new MbgType(servicePath + "." + MTYPES.get(TypeName.RECORD).getShortType() + "Service"));
		MTYPES.put(TypeName.SERVICE_IMPL,
				new MbgType(servicePath + ".impl." + MTYPES.get(TypeName.RECORD).getShortType() + "ServiceImpl"));
	}

	@Override
	public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
		this.init(introspectedTable);
		GeneratedJavaFile file = this.serviceIntGenerate(introspectedTable);
		GeneratedJavaFile fileImpl = this.serviceImplGenerate(introspectedTable);
		return Arrays.asList(file, fileImpl);
	}

	private GeneratedJavaFile serviceIntGenerate(IntrospectedTable introspectedTable) {
		Interface service = new ServiceIntGenerator(context, introspectedTable, MTYPES);
		GeneratedJavaFile file = new GeneratedJavaFile(service,
				this.getContext().getJavaClientGeneratorConfiguration().getTargetProject(),
				this.getContext().getJavaFormatter());

		return file;
	}

	private GeneratedJavaFile serviceImplGenerate(IntrospectedTable introspectedTable) {
		TopLevelClass serviceImpl = new ServiceImpGenerator(context, introspectedTable, MTYPES);
		GeneratedJavaFile file = new GeneratedJavaFile(serviceImpl,
				this.getContext().getJavaClientGeneratorConfiguration().getTargetProject(),
				this.getContext().getJavaFormatter());
		return file;
	}

}
