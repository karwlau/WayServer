package com.way.utils.poi.model;

import java.util.List;

public class XlsxModel<T> {

	/**
	 * 文件名称
	 */
	private String fileName;
	/**
	 * 表单名称
	 */
	private String sheetName;
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
	private long startRow = 1;
	/**
	 * 字段
	 */
	private List<String> values;
	/**
	 * 数据
	 */
	private List<T> datas;
	/**
	 * 分页记录数,默认为0，不分页
	 */
	private int size;
	/**
	 * 文件路径
	 */
	private String filePath;
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
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
	 * @param sheetName the sheetName to set
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
	 * @param type the type to set
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
	 * @param headers the headers to set
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
	 * @param templatePath the templatePath to set
	 */
	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}
	/**
	 * @return the startRow
	 */
	public long getStartRow() {
		return startRow;
	}
	/**
	 * @param startRow the startRow to set
	 */
	public void setStartRow(long startRow) {
		this.startRow = startRow;
	}
	/**
	 * @return the values
	 */
	public List<String> getValues() {
		return values;
	}
	/**
	 * @param values the values to set
	 */
	public void setValues(List<String> values) {
		this.values = values;
	}
	/**
	 * @return the datas
	 */
	public List<T> getDatas() {
		return datas;
	}
	/**
	 * @param datas the datas to set
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
	 * @param size the size to set
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
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}

/**
 * 导出类型：
 * 
 * @description simple(默认):headers必填,以此作为表头导出;
 * @description template:templatePath和startRow必填;
 */
enum TYPE {
	SIMPLE, TEMPLATE
}