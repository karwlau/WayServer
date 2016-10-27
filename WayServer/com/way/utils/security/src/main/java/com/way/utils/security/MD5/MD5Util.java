package com.way.utils.security.MD5;

import java.security.MessageDigest;
import java.util.Random;

public class MD5Util {
	public static Random rand = new Random();

	/**
	 * 生成随机字串
	 * 
	 * @param digit
	 *            位数(小于等于0时默认为4)
	 * @return
	 */
	public static String makeSalt(int digit) {
		if (digit <= 0) {
			digit = 4;
		}
		rand.setSeed(System.currentTimeMillis());
		int num = rand.nextInt();
		if (num < 0) {
			num = 0 - num;
		}
		StringBuffer sb = new StringBuffer();
		for (; digit > 0; digit--) {
			sb.append(num % 10);
			num = num / 10;
		}
		return sb.toString();
	}

	/**
	 * 加盐密码哈希值
	 * 
	 * @param password
	 * @param salt
	 * @return
	 */
	public static String makePassWord(String password, String salt) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		// hash次数
		int count = 2;
		try {
			// 获得MD5摘要算法的 MessageDigest 对象
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			byte[] md = null;
			byte[] btInput = (password + salt).getBytes();
			for (; count > 0; count--) {
				// 使用指定的字节更新摘要
				mdInst.update(btInput);
				// 获得密文
				md = mdInst.digest();
				btInput = md;
			}

			// 把密文转换成十六进制的字符串形式
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
