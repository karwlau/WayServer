package com.way.framework.config;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertyConfig {

	private static Logger logger = Logger.getLogger(PropertyConfig.class);
	/**
	 * 全局配置项:global configuration
	 * 
	 */
	private static Properties props;

	/**
	 * @return the props
	 */
	public static Properties getProps() {
		return props;
	}

	public static void load(Properties exProps) {
		if (props == null) {
			props = new Properties(exProps);
		} else {
			mergerProps(exProps);
		}
	}

	public static void load(StringReader reader) {
		if (props == null) {
			props = new Properties();
		}
		try {
			props.load(reader);
		} catch (IOException e) {
			// e.printStackTrace();
			logger.error(e);
		}
	}

	/**
	 * 合并配置:merge property configuration
	 * 
	 * @param exProps
	 */
	private static void mergerProps(Properties exProps) {
		for (Entry<Object, Object> e : exProps.entrySet()) {
			props.setProperty(String.valueOf(e.getKey()), String.valueOf(e.getValue()));
		}
	}

	public static Object getProperty(String name) {
		if (props == null) {
			logger.warn("no any property has been config");
			return null;
		}
		return props.get(name);
	}

	public static String getValue(String name) {
		if (props == null) {
			logger.warn("no any property has been config");
			return null;
		}
		Object prop = getProperty(name);
		if (prop == null) {
			logger.warn("not found the property:[" + name + "]");
			return null;
		}
		return (String) prop;
	}
}
