package com.way.common.plugins.mbg_plugins.service;

import java.util.Arrays;
import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.Context;

import com.way.common.plugins.mbg_plugins.utils.constants.SType;

public class ServiceImpGenerator extends TopLevelClass {

	private ServiceImpGenerator(FullyQualifiedJavaType type) {
		super(type);
	}

	List<String> findMethodCode = Arrays.asList("List<#{recordType}> list = #{mapper}.selectByPage(page,record);",
			"page.setList(list);", "return page;");
	List<String> findExtendMethodCode = Arrays.asList(
			"List<#{recordType}> list = #{extendMapper}.selectByPage(page,record);", "page.setList(list);",
			"return page;");
	List<String> getMethodCode = Arrays.asList("return #{mapper}.selectByPrimaryKey(id);");
	List<String> saveMethodCode = Arrays.asList("Date now = new Date();", "record.setIsDelete(false);",
			"record.setCreateTime(now);", "record.setUpdateTime(now);", "#{mapper}.insertSelective(record);",
			"return record;");
	List<String> updateMethodCode = Arrays.asList("Date now = new Date();", "record.setUpdateTime(now);",
			"#{mapper}.updateByPrimaryKeySelective(record);", "return record;");
	List<String> deleteMethodCode = Arrays.asList("Date now = new Date();",
			"#{recordType} update = new #{recordType}();", "update.setId(id);", "update.setUpdateTime(now);",
			"update.setIsDelete(true);", "#{mapper}.updateByPrimaryKeySelective(update);", "return id;");

	public ServiceImpGenerator(Context context, IntrospectedTable introspectedTable) {
		this(new FullyQualifiedJavaType(SType.SERVICE_IMPL.getType()));
		// implements
		this.addSuperInterface(SType.SERVICE.getFQJType());

		// import
		this.addImportedType(SType.PAGE.getFQJType());
		this.addImportedType(SType.ANO_SERVICE.getFQJType());
		this.addImportedType(SType.ANO_RESOURCE.getFQJType());
		this.addImportedType(SType.DATE.getFQJType());
		this.addImportedType(SType.LIST.getFQJType());
		this.addImportedType(SType.RECORD.getFQJType());
		this.addImportedType(SType.EXAMPLE.getFQJType());
		this.addImportedType(SType.MAPPER.getFQJType());
		this.addImportedType(SType.EXT_MAPPER.getFQJType());
		this.addImportedType(SType.SERVICE.getFQJType());

		// annotation
		this.addAnnotation("@Service(\"" + SType.SERVICE.getName() + "\")");

		// field
		Field mapper = new Field(SType.MAPPER.getName(), SType.MAPPER.getFQJType());
		mapper.addAnnotation("@Resource");
		mapper.setVisibility(JavaVisibility.PRIVATE);
		this.addField(mapper);
		Field extMapper = new Field(SType.EXT_MAPPER.getName(), SType.EXT_MAPPER.getFQJType());
		extMapper.addAnnotation("@Resource");
		extMapper.setVisibility(JavaVisibility.PRIVATE);
		this.addField(extMapper);

		this.setVisibility(JavaVisibility.PUBLIC);
		this.findMethodGenerate(introspectedTable);
		this.getMethodGenerate(introspectedTable);
		this.saveMethodgeenerate(introspectedTable);
		this.updateMethodgeenerate(introspectedTable);
		this.deleteMethodgeenerate(introspectedTable);
	}

	private void findMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("findByPage");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.PAGE.getFQJType());
		method.addParameter(SType.PAGE.getParam());
		method.addParameter(SType.RECORD.getParam());
		if ("mExtend".equals(introspectedTable.getContext().getProperty("mExtend"))) {
			this.buildBody(method, findExtendMethodCode);
		} else {
			this.buildBody(method, findMethodCode);
		}
		method.addAnnotation("@Override");
		this.addMethod(method);
	}

	private void getMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("getById");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.RECORD.getFQJType());
		method.addParameter(SType.LONG.getParam());
		this.buildBody(method, getMethodCode);
		method.addAnnotation("@Override");
		this.addMethod(method);
	}

	private void saveMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("save");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.RECORD.getFQJType());
		method.addParameter(SType.RECORD.getParam());
		method.addAnnotation("@Override");
		this.buildBody(method, saveMethodCode);
		this.addMethod(method);
	}

	private void updateMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("update");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.RECORD.getFQJType());
		method.addParameter(SType.RECORD.getParam());
		method.addAnnotation("@Override");
		this.buildBody(method, updateMethodCode);
		this.addMethod(method);
	}

	private void deleteMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("delete");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.LONG.getFQJType());
		method.addParameter(SType.LONG.getParam());
		method.addAnnotation("@Override");
		this.buildBody(method, deleteMethodCode);
		this.addMethod(method);
	}

	private void buildBody(Method method, List<String> code) {
		for (String str : code) {
			method.addBodyLine(this.bodyReplace(str));
		}
	}

	private String bodyReplace(String str) {
		return str.replaceAll("#\\{recordType\\}", SType.RECORD.getShortType())
				.replaceAll("#\\{mapper\\}", SType.MAPPER.getName())
				.replaceAll("#\\{extendMapper\\}", SType.EXT_MAPPER.getName());
	}

}
