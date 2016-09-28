package com.way.utils.poi.export;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.way.framework.exception.ServiceException;
import com.way.utils.poi.model.Value;
import com.way.utils.poi.model.XlsxModel;

public class ModelExport {
	private static Logger log = Logger.getLogger(ModelExport.class);

	public void export(XlsxModel<?> model) throws ServiceException {
		model.checkParam();
		try {
			XSSFWorkbook wb = new XSSFWorkbook(model.getFilePath());
			if (XlsxModel.TYPE.SIMPLE == model.getType()) {
				this.buildSimple(wb, model);
			} else if (XlsxModel.TYPE.SIMPLE == model.getType()) {
				this.buildTemplate(wb, model);
			}
		} catch (IOException e) {
			log.error(e);
			throw new ServiceException("File_Path_IO_Error", "文件路径异常");
		}
	}

	/**
	 * 基于模板文件导出
	 * 
	 * @param wb
	 * @param model
	 */
	private void buildTemplate(XSSFWorkbook wb, XlsxModel<?> model) {
		// XSSFSheet sheet = wb.createSheet(model.getSheetName());
	}

	/**
	 * 简单表头导出
	 * 
	 * @param wb
	 * @param model
	 */
	private void buildSimple(XSSFWorkbook wb, XlsxModel<?> model) {
		XSSFSheet sheet = wb.createSheet(model.getSheetName());
		XSSFRow row = null;
		XSSFCell cell = null;
		int rowIndex = 0, colIndex = 0;
		// header
		row = sheet.createRow(rowIndex);
		for (String header : model.getHeaders()) {
			cell = row.createCell(colIndex);
			cell.setCellValue(header);
		}
		// data
		for (Object record : model.getDatas()) {
			for (Value value : model.getValues()) {
				cell = row.createCell(colIndex);
				cell.setCellValue(getValue(record, value));
			}
			colIndex = 0;
		}
	}

	private static String getValue(Object obj, Value value) {
		return "";
	}
}
