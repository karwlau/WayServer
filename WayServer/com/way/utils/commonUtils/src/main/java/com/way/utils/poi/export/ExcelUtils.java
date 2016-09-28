package com.way.utils.poi.export;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

/**
 * 生成excel视图，可用excel工具打开或者保存 由ViewController的return new ModelAndView(viewExcel,
 * model)生成
 * 
 * @version Version 1.0
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class ExcelUtils extends AbstractExcelView {

	public String excelType;
	public final static String HEADER_KEY = "header";
	public final static String DATA_KEY = "data";
	public final static String PROPERTY_KEY = "propertName";

	// 导出增加的导出类型

	/**
	 * map key：header,value:list<String> 标题 key: data, valeu: list<?> 内容集合
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void buildExcelDocument(Map map, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HSSFSheet sheet = workbook.createSheet("list");
		sheet.setDefaultColumnWidth((short) 18);

		// 创建表头
		List<String> headerList = (List<String>) map.get(HEADER_KEY);
		int headerSize = headerList == null ? 0 : headerList.size();
		HSSFRow headerRow = sheet.createRow(0);
		for (int i = 0; i < headerSize; i++) {
			headerRow.createCell(i).setCellValue(headerList.get(i));
		}

		// 判断数据字段是否正常
		List<String> propList = (List<String>) map.get(PROPERTY_KEY);
		int propSize = propList == null ? 0 : propList.size();
		if (propSize == headerSize) {

			List<?> dataList = (List<?>) map.get(DATA_KEY);
			int dataSize = dataList == null ? 0 : dataList.size();

			for (short i = 0; i < dataSize; i++) {
				HSSFRow sheetRow = sheet.createRow((i + 1));
				Object object = dataList.get(i);
				String prop = null;
				Object value = null;
				for (int j = 0; j < propSize; j++) {
					prop = propList.get(j);
					value = object.getClass()
							.getMethod("get" + Character.toUpperCase(prop.charAt(0)) + prop.substring(1),
									new Class[] {})
							.invoke(object, new Object[] {});
					sheetRow.createCell(j).setCellValue(value == null ? "" : String.valueOf(value));
				}
			}
		} else {
			// throw new ServiceException("size_error", "表头与字段数量不对应");
		}

	}

	public String getExcelType() {
		return excelType;
	}

	public void setExcelType(String excelType) {
		this.excelType = excelType;
	}

}
