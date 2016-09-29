package com.way.utils.poi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {

	public String name;
	public String value;
	public Date date;

	public Record(String name, String value, String date) {
		this.name = name;
		this.value = value;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d;
		try {
			d = sdf.parse(date);
		} catch (ParseException e) {
			d = new Date();
		}
		this.date = d;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
}
