package com.way.common.plugins.mbg_plugins.page.extend;

import java.util.Arrays;
import java.util.List;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.SqlMapGeneratorConfiguration;

import com.way.common.plugins.mbg_plugins.utils.constants.SType;

/**
 * 
 * @author Administrator
 * @date 2016-7-21
 * @description page method generate as extend(including mapper client and
 *              sqlmap)
 */
public class PaginationExtendPlugin extends PluginAdapter {

	Document mapperDoc = null;

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
	public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
		GeneratedJavaFile file = this.clientExtenddGenerate(introspectedTable);
		return Arrays.asList(file);
	}

	private GeneratedJavaFile clientExtenddGenerate(IntrospectedTable introspectedTable) {
		Interface client = new ClientExtendGenerator(context, introspectedTable);
		GeneratedJavaFile file = new GeneratedJavaFile(client,
				this.getContext().getJavaClientGeneratorConfiguration().getTargetProject(),
				this.getContext().getJavaFormatter());
		return file;
	}

	@Override
	public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
		mapperDoc = document;
		return super.sqlMapDocumentGenerated(document, introspectedTable);
	}

	@Override
	public List<GeneratedXmlFile> contextGenerateAdditionalXmlFiles(IntrospectedTable introspectedTable) {
		SqlMapGeneratorConfiguration conf = introspectedTable.getContext().getSqlMapGeneratorConfiguration();
		Document doc = this.extendMapperGenerate(introspectedTable);
		GeneratedXmlFile xmapper = new GeneratedXmlFile(doc, SType.EXT_MAPPER.getShortType() + ".xml",
				conf.getTargetPackage(), conf.getTargetProject(), false,
				introspectedTable.getContext().getXmlFormatter());
		return Arrays.asList(xmapper);
	}

	private Document extendMapperGenerate(IntrospectedTable introspectedTable) {
		Document doc = new Document("-//mybatis.org//DTD Mapper 3.0//EN",
				"http://mybatis.org/dtd/mybatis-3-mapper.dtd");
		XmlElement root = new XmlElement("mapper");
		doc.setRootElement(root);
		root.addAttribute(new Attribute("namespace", SType.EXT_MAPPER.getType()));
		XmlElement result = (XmlElement) mapperDoc.getRootElement().getElements().get(0);
		XmlElement columns = (XmlElement) mapperDoc.getRootElement().getElements().get(3);
		root.addElement(result);
		root.addElement(columns);
		root.addElement(this.methodSelectByPageGenerated(introspectedTable));
		return doc;
	}

	private XmlElement methodSelectByPageGenerated(IntrospectedTable introspectedTable) {
		// select语句
		XmlElement sql = new XmlElement("select");
		sql.addAttribute(new Attribute("id", "selectByPage"));
		sql.addAttribute(new Attribute("parameterType", "map"));
		sql.addAttribute(new Attribute("resultMap", introspectedTable.getBaseResultMapId()));
		sql.addElement(new TextElement("select * from " + introspectedTable.getFullyQualifiedTableNameAtRuntime()));
		return sql;
	}
}
