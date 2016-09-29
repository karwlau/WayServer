package com.way.utils.poi.export;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.way.utils.constants.StringConstant;
import com.way.utils.poi.model.Value;
import com.way.utils.poi.model.XlsxModel;

public class ModelExport {
	private static Logger log = Logger.getLogger(ModelExport.class);

	private final static SimpleDateFormat standardDateFmt = new SimpleDateFormat(StringConstant.DATE_FMT);
	private final static SimpleDateFormat standardTimeFmt = new SimpleDateFormat(StringConstant.TIME_FMT);
	private final static SimpleDateFormat standardDateTimeFmt = new SimpleDateFormat(StringConstant.DATE_TIME_FMT);
	private static SimpleDateFormat tempFmt = null;

	/**
	 * 导出方法
	 * 
	 * @param model
	 * @throws Exception
	 */
	public static void export(XlsxModel<?> model) throws Exception {
		model.checkParam();
		try {
			XSSFWorkbook wb = null;
			if (XlsxModel.TYPE.SIMPLE == model.getType()) {
				wb = buildSimple(model);
			} else if (XlsxModel.TYPE.TEMPLATE == model.getType()) {
				wb = buildTemplate(model);
			}
			FileOutputStream fos = new FileOutputStream(model.getFilePath());
			wb.write(fos);
			fos.close();
		} catch (Exception e) {
			log.error("文件导出异常");
			throw e;
		}
	}

	/**
	 * 基于模板文件导出
	 * 
	 * @param model
	 * @return
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws IOException
	 */
	private static XSSFWorkbook buildTemplate(XlsxModel<?> model) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		XSSFWorkbook wb = new XSSFWorkbook(model.getTemplatePath());
		XSSFSheet sheet = wb.cloneSheet(0);
		// data
		buildDatas(sheet, model.getStartRow(), model.getValues(), model.getDatas());
		// delete template sheet;
		wb.removeSheetAt(0);// wb.setSheetHidden(0, true);
		wb.setSheetName(0, model.getSheetName());
		return wb;
	}

	/**
	 * 简单导出
	 * 
	 * @param model
	 * @return
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	private static XSSFWorkbook buildSimple(XlsxModel<?> model) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet(model.getSheetName());
		// header
		buildHeaders(sheet, 0, model.getHeaders());
		// data
		buildDatas(sheet, 1, model.getValues(), model.getDatas());
		return wb;
	}

	/**
	 * 表头数据
	 * 
	 * @param sheet
	 * @param rowIndex
	 * @param headers
	 */
	private static void buildHeaders(XSSFSheet sheet, int rowIndex, List<String> headers) {
		XSSFRow row = sheet.createRow(rowIndex++);
		int colIndex = 0;
		XSSFCell cell = null;
		for (String header : headers) {
			cell = row.createCell(colIndex++);
			cell.setCellValue(header);
		}
	}

	/**
	 * 数据导出
	 * 
	 * @param sheet
	 * @param startIndex
	 * @param values
	 * @param datas
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	private static void buildDatas(XSSFSheet sheet, int startIndex, List<Value> values, List<?> datas)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		XSSFRow row = null;
		XSSFCell cell = null;
		int colIndex = 0;
		for (Object record : datas) {
			row = sheet.createRow(startIndex++);
			for (Value value : values) {
				cell = row.createCell(colIndex++);
				cell.setCellValue(getValue(record, value));
			}
			colIndex = 0;
		}
	}

	/**
	 * 格式化数据
	 * 
	 * @param object
	 * @param value
	 * @return
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	private static String getValue(Object object, Value value) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String str = StringConstant.BLANK_STR;
		Object obj = object.getClass()
				.getMethod("get" + Character.toUpperCase(value.value.charAt(0)) + value.value.substring(1),
						new Class[] {})
				.invoke(object, new Object[] {});
		switch (value.vType) {
		case NUMBER:
			str = String.valueOf(obj);
			break;
		case STRING:
			str = String.valueOf(obj);
			break;
		case DATE:
			str = standardDateFmt.format((Date) obj);
			break;
		case TIME:
			str = standardTimeFmt.format((Date) obj);
			break;
		case SPECIFY_DATE:
			if (!isBlank(value.format)) {
				tempFmt = new SimpleDateFormat(value.format);
				str = tempFmt.format((Date) obj);
			}
			break;
		case DATETIME:
			str = standardDateTimeFmt.format((Date) obj);
			break;
		case PERCNET:
			str = String.valueOf(obj) + StringConstant.PRECENT_STR;
			break;
		default:
			str = StringConstant.BLANK_STR;
		}
		return str;
	}

	private static boolean isBlank(String str) {
		if (str != null && !StringConstant.BLANK_STR.equals(str.trim())) {
			return false;
		}
		return true;
	}
}
