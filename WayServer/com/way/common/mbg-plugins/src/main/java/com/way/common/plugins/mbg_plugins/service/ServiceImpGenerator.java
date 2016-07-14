package com.way.common.plugins.mbg_plugins.service;

import java.util.Arrays;
<<<<<<< HEAD
import java.util.List;
import java.util.Map;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.Context;

import com.way.common.plugins.mbg_plugins.service.constants.MbgType;
import com.way.common.plugins.mbg_plugins.service.constants.TypeName;

public class ServiceImpGenerator extends TopLevelClass {

	Map<TypeName, MbgType> MTYPES;

	private ServiceImpGenerator(FullyQualifiedJavaType type) {
		super(type);
	}

	List<String> findMethodCode = Arrays.asList("List<#{recordType}> list = #{mapper}.selectByPage(page,example);",
			"page.setList(list);", "return page;");
	List<String> getMethodCode = Arrays.asList("return #{mapper}.selectByPrimaryKey(id)");
	List<String> saveMethodCode = Arrays.asList("Date now = new Date();", "record.setIsDelete(false);",
			"record.setCreateTime(now);", "record.setUpdateTime(now);", "#{mapper}.insertSelective(record);");
	List<String> updateMethodCode = Arrays.asList("Date now = new Date();", "record.setUpdateTime(now);",
			"#{mapper}.updateByPrimaryKeySelective(record);");
	List<String> deleteMethodCode = Arrays.asList("Date now = new Date();",
			"#{recordType} update = new #{recordType}();", "update.setId(id);", "update.setUpdateTime(now);",
			"udpate.setIsDelete(true);", "#{mapper}.updateByPrimaryKeySelective(update);");

	public ServiceImpGenerator(Context context, IntrospectedTable introspectedTable, Map<TypeName, MbgType> MTYPES) {
		this(new FullyQualifiedJavaType(MTYPES.get(TypeName.SERVICE_IMPL).getType()));
		this.MTYPES = MTYPES;
		// implements
		this.addSuperInterface(MTYPES.get(TypeName.SERVICE).getFQJType());

		// import
		this.addImportedType("com.appleframework.model.page.Pagination");
		this.addImportedType("org.springframework.stereotype.Service");
		this.addImportedType("javax.annotation.Resource");
		this.addImportedType(MTYPES.get(TypeName.RECORD).getFQJType());
		this.addImportedType(MTYPES.get(TypeName.EXAMPLE).getFQJType());
		this.addImportedType(MTYPES.get(TypeName.MAPPER).getFQJType());
		this.addImportedType(MTYPES.get(TypeName.SERVICE).getFQJType());

		// annotation
		this.addAnnotation("@Service(\"" + MTYPES.get(TypeName.SERVICE).getName() + "\")");

		// field
		Field mapper = new Field(MTYPES.get(TypeName.MAPPER).getName(), MTYPES.get(TypeName.MAPPER).getFQJType());
		mapper.addAnnotation("@Resouce");
		mapper.setVisibility(JavaVisibility.PRIVATE);
		this.addField(mapper);

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
		method.setReturnType(MTYPES.get(TypeName.PAGE).getFQJType());
		method.addParameter(MTYPES.get(TypeName.PAGE).getParam());
		method.addParameter(MTYPES.get(TypeName.RECORD).getParam());
		this.buildBody(method, findMethodCode);
		method.addAnnotation("@Override");
		this.addMethod(method);
	}

	private void getMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("getById");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(MTYPES.get(TypeName.RECORD).getFQJType());
		method.addParameter(MTYPES.get(TypeName.LONG).getParam());
		this.buildBody(method, getMethodCode);
		method.addAnnotation("@Override");
		this.addMethod(method);
	}

	private void saveMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("save");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(MTYPES.get(TypeName.RECORD).getFQJType());
		method.addParameter(MTYPES.get(TypeName.RECORD).getParam());
		method.addAnnotation("@Override");
		this.buildBody(method, saveMethodCode);
		this.addMethod(method);
	}

	private void updateMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("update");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(MTYPES.get(TypeName.RECORD).getFQJType());
		method.addParameter(MTYPES.get(TypeName.RECORD).getParam());
		method.addAnnotation("@Override");
		this.buildBody(method, updateMethodCode);
		this.addMethod(method);
	}

	private void deleteMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("delete");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(MTYPES.get(TypeName.LONG).getFQJType());
		method.addParameter(MTYPES.get(TypeName.LONG).getParam());
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
		return str.replaceAll("#\\{recordType\\}", MTYPES.get(TypeName.RECORD).getShortType())
				.replaceAll("#\\{mapper\\}", MTYPES.get(TypeName.MAPPER).getName());
=======
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.Context;

import com.way.common.plugins.mbg_plugins.service.constants.TypeName;

public class ServiceImpGenerator extends TopLevelClass {

	static Map<TypeName, FullyQualifiedJavaType> TYPES = new HashMap<TypeName, FullyQualifiedJavaType>();
	static String findMethodCode = "List<recordType> list = serviceBean.selectByPage(page,example);page.setList(list);return page;";
	static {
		// 类型
		TYPES.put(TypeName.PAGE, new FullyQualifiedJavaType("com.appleframework.model.page.Pagination"));
		TYPES.put(TypeName.LONG, new FullyQualifiedJavaType("java.lang.Long"));
		// 代码
	}

	private ServiceImpGenerator(FullyQualifiedJavaType type) {
		super(type);
	}

	public ServiceImpGenerator(Context context, IntrospectedTable introspectedTable, String type) {
		this(new FullyQualifiedJavaType(type));

		TYPES.put(TypeName.RECORD, new FullyQualifiedJavaType(introspectedTable.getBaseRecordType()));
		TYPES.put(TypeName.EXAMPLE, new FullyQualifiedJavaType(introspectedTable.getExampleType()));
		
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
		method.setReturnType(TYPES.get(TypeName.PAGE));
		method.addParameter(new Parameter(TYPES.get(TypeName.PAGE), "page"));
		method.addParameter(new Parameter(TYPES.get(TypeName.RECORD), "info"));
		method.addBodyLine(findMethodCode.replaceAll("recordType", TYPES.get(TypeName.RECORD).getShortName())
				.replaceAll("serviceBean", TYPES.get(TypeName.RECORD).getShortName() + "Service"));
		this.addMethod(method);
	}

	private void getMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("getById");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(TYPES.get(TypeName.RECORD));
		method.addParameter(new Parameter(TYPES.get(TypeName.LONG), "id"));
		this.addMethod(method);
	}

	private void saveMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("save");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(TYPES.get(TypeName.RECORD));
		method.addParameter(new Parameter(TYPES.get(TypeName.RECORD), "record"));
		this.addMethod(method);
	}

	private void updateMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("update");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(TYPES.get(TypeName.RECORD));
		method.addParameter(new Parameter(TYPES.get(TypeName.RECORD), "record"));
		this.addMethod(method);
	}

	private void deleteMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("delete");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(TYPES.get(TypeName.LONG));
		method.addParameter(new Parameter(TYPES.get(TypeName.LONG), "id"));
		this.addMethod(method);
>>>>>>> branch 'master' of ssh://git@github.com/karwlau/WayServer.git
	}

}
