package com.way.utils.poi.model;

import java.util.List;

import org.springframework.util.StringUtils;

import com.way.framework.exception.ServiceException;

public class XlsxModel<T> {

	/**
	 * 文件名称
	 */
	private String fileName = "exportFile";
	/**
	 * 表单名称
	 */
	private String sheetName = "sheet";
	/**
	 * 导出类型
	 */
	private TYPE type = TYPE.SIMPLE;
	/**
	 * 表头
	 */
	private List<String> headers;
	/**
	 * 模板路径
	 */
	private String templatePath;
	/**
	 * 数据开始行数
	 */
	private int startRow = 1;
	/**
	 * 字段
	 */
	private List<Value> values;
	/**
	 * 数据
	 */
	private List<T> datas;
	/**
	 * 分页记录数,默认为0，不分页
	 */
	private int size = 0;
	/**
	 * 文件路径
	 */
	private String filePath;

	/**
	 * 导出类型：
	 * 
	 * @description simple(默认):headers必填,以此作为表头导出;
	 * @description template:templatePath和startRow必填;
	 */
	public enum TYPE {
		SIMPLE, TEMPLATE
	}

	/**
	 * 自检导出必要属性
	 * 
	 * @return
	 * @throws ServiceException
	 */
	public boolean checkParam() throws ServiceException {
		if (this.datas == null) {
			throw new ServiceException("Data_Empty", "导出未指定数据源");
		}
		if (this.values == null || this.values.size() < 1) {
			throw new ServiceException("Value_Empty", "导出未指定属性");
		}
		// 简单导出模式
		if (TYPE.SIMPLE == this.type) {
			if (this.headers == null || this.headers.size() < 1) {
				throw new ServiceException("Header_Empty", "导出表头为空");
			}
			if (this.headers.size() != this.values.size()) {
				throw new ServiceException("Header_Value_Size_Not_Match", "导出表头与属性数量不一致");
			}
		}
		// 模板导出模式
		else if (TYPE.TEMPLATE == this.type) {
			if (StringUtils.isEmpty(this.templatePath)) {
				throw new ServiceException("Template_Empty", "导出未指定模板文件");
			}
		}
		return true;
	}

	/*******************************************************************************************
	 * getter or setter start
	 *******************************************************************************************/

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the sheetName
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * @param sheetName
	 *            the sheetName to set
	 */
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}

	/**
	 * @return the type
	 */
	public TYPE getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(TYPE type) {
		this.type = type;
	}

	/**
	 * @return the headers
	 */
	public List<String> getHeaders() {
		return headers;
	}

	/**
	 * @param headers
	 *            the headers to set
	 */
	public void setHeaders(List<String> headers) {
		this.headers = headers;
	}

	/**
	 * @return the templatePath
	 */
	public String getTemplatePath() {
		return templatePath;
	}

	/**
	 * @param templatePath
	 *            the templatePath to set
	 */
	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}

	/**
	 * @return the startRow
	 */
	public int getStartRow() {
		return startRow;
	}

	/**
	 * @param startRow
	 *            the startRow to set
	 */
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	/**
	 * @return the values
	 */
	public List<Value> getValues() {
		return values;
	}

	/**
	 * @param values
	 *            the values to set
	 */
	public void setValues(List<Value> values) {
		this.values = values;
	}

	/**
	 * @return the datas
	 */
	public List<T> getDatas() {
		return datas;
	}

	/**
	 * @param datas
	 *            the datas to set
	 */
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath
	 *            the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
