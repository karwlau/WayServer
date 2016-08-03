package com.way.utils;

public class NumberUtil {

	/**
	 * 数字转换
	 */
	public static String getUpperNumber(int number) {
		StringBuffer sb = new StringBuffer();
		String str = String.valueOf(number);
		String last = "";
		for (int i = 0; i < str.length(); i++) {
			String d = matchNum(str.charAt(i));
			String g = matchPos(str.length() - i - 1);
			if ("零".equals(d)) {
				if ("".equals(last)) {
					sb.append(d);
				}
				last = d;
				continue;
			}
			last = d;
			if ("零".equals(last)) {
				sb.append(last);
			}
			sb.append(d).append(g);
		}
		return sb.toString();
	}

	private static String matchPos(int pos) {
		switch (pos) {
		case 8:
			return "亿";
		case 4:
			return "万";
		case 11:
		case 7:
		case 3:
			return "千";
		case 10:
		case 6:
		case 2:
			return "百";
		case 9:
		case 5:
		case 1:
			return "十";
		default:
			return "";
		}
	}

	private static String matchNum(char digit) {
		String str = null;
		switch (digit) {
		case '0':
			str = "零";
			break;
		case '1':
			str = "一";
			break;
		case '2':
			str = "二";
			break;
		case '3':
			str = "三";
			break;
		case '4':
			str = "四";
			break;
		case '5':
			str = "五";
			break;
		case '6':
			str = "六";
			break;
		case '7':
			str = "七";
			break;
		case '8':
			str = "八";
			break;
		case '9':
			str = "九";
			break;
		default:
		}
		return str;
	}
}
