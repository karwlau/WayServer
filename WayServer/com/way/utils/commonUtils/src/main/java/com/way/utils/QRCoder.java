package com.way.utils;

import java.io.File;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.Writer;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GlobalHistogramBinarizer;

/**
 * 二维码图片编码解码
 * 
 * @author karwlau
 * @version 1-2015.5.20
 */
// 编码
public class QRCoder {
	/**
	 * 生成二维码图片
	 * 
	 * @param content
	 *            编码内容
	 * @param filePath
	 *            生成图片文件路径
	 * @param format(JPG
	 *            GIF BMP) 图片格式
	 */
	public static void qrEncoder(String content, String filePath, String format) throws Exception {
		String encoding = "utf-8";
		int width = 150;
		int height = 150;
		File imagePath = new File(filePath);

		Writer writer = new MultiFormatWriter();
		Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>(2);
		hints.put(EncodeHintType.CHARACTER_SET, encoding);
		BitMatrix matrix = writer.encode(content, BarcodeFormat.QR_CODE, width, height, hints);
		MatrixToImageWriter.writeToFile(matrix, format, imagePath);
	}

	/**
	 * 解析二维码图片
	 * 
	 * @param filePath
	 *            解析图片文件路径
	 * @return 解析内容
	 * @throws Exception
	 */
	public static String qrDecoder(String filePath) throws Exception {
		File imagePath = new File(filePath);
		String encoding = "utf-8";

		Reader reader = new MultiFormatReader();
		LuminanceSource ls = new BufferedImageLuminanceSource(ImageIO.read(imagePath));
		Binarizer b = new GlobalHistogramBinarizer(ls);
		Hashtable<DecodeHintType, String> hint1 = new Hashtable<DecodeHintType, String>(2);
		hint1.put(DecodeHintType.CHARACTER_SET, encoding);
		Result r = reader.decode(new BinaryBitmap(b), hint1);
		return r.getText();
	}

	// 测试代码
	public static void main(String[] args) throws Exception {
		QRCoder.qrEncoder("testContent", "d:/test.jpg", "JPG");
		String content = QRCoder.qrDecoder("d:/test.jpg");
		System.out.println(content);
	}
}
