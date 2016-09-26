package com.way.utils;

import org.junit.Test;

public class TestMain {
	public static void main(String[] args) {
		System.out.println();
	}
	
	@Test
	public void testQr(){
		try {
			QRCoder.qrEncoder("testContent", "d:/test.jpg", "JPG");
			String content = QRCoder.qrDecoder("d:/test.jpg");
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
