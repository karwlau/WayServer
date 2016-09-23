package com.way.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	/**
	 * 获取日期，去时分秒
	 * 
	 * @param date
	 * @return
	 */
	public static Date dateForm(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	/**
	 * 日期偏移
	 * 
	 * @param date
	 * @param field
	 *            偏移字段，以Calendar为准
	 * @param amount
	 *            偏移量
	 * @return
	 */
	public static Date shift(Date date, int field, int amount) {
		Calendar c = Calendar.getInstance();
		c.add(field, amount);
		return c.getTime();
	}
}
