package com.way.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.way.utils.poi.Record;
import com.way.utils.poi.export.ModelExport;
import com.way.utils.poi.model.Value;
import com.way.utils.poi.model.XlsxModel;
import com.way.utils.poi.model.XlsxModel.TYPE;

public class TestMain {

	public static void main(String[] args) {
		System.out.println();
	}

	// @Test
	public void testQr() {
		try {
			QRCoder.qrEncoder("testContent", "d:/test.jpg", "JPG");
			String content = QRCoder.qrDecoder("d:/test.jpg");
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExport() {
		XlsxModel<Record> model = new XlsxModel<Record>();
		// init data
		List<Record> datas = new ArrayList<Record>();
		datas.add(new Record("name1", "value1", "2016-09-25"));
		datas.add(new Record("name2", "value2", "2016-09-23"));
		datas.add(new Record("name3", "value3", "2016-09-22"));
		datas.add(new Record("name4", "value4", "2016-09-21"));
		model.setDatas(datas);
		List<String> headers = Arrays.asList("nameT", "dateT", "valueT");
		model.setHeaders(headers);
		List<Value> values = Arrays.asList(new Value("name", Value.ValueType.STRING),
				new Value("date", Value.ValueType.DATE, "yyyy-MM-dd"), new Value("value", Value.ValueType.STRING));
		model.setValues(values);
		model.setFilePath("D:/test.xlsx");
		if(true){
			model.setType(TYPE.TEMPLATE);
			model.setStartRow(3);
			model.setTemplatePath("D:/test1.xlsx");
		}
		try {
			ModelExport.export(model);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
