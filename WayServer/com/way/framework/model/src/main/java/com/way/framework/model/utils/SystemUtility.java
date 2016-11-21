package com.way.framework.model.utils;

import java.lang.reflect.Field;

public class SystemUtility {

	public static void copyBean(Object dest, Object src, boolean filtNullProps)
			throws IllegalArgumentException, IllegalAccessException {
		if (dest.getClass() == src.getClass()) {
			Field[] destField = dest.getClass().getDeclaredFields();

			Field[] srcField = src.getClass().getDeclaredFields();
			for (int i = 0; i < destField.length; i++) {
				String destFieldName = destField[i].getName();
				String destFieldType = destField[i].getGenericType().toString();
				for (int n = 0; n < srcField.length; n++) {
					String srcFieldName = srcField[n].getName();
					String srcFieldType = srcField[n].getGenericType().toString();
					if ((destFieldName.equals(srcFieldName)) && (destFieldType.equals(srcFieldType))) {
						destField[i].setAccessible(true);
						srcField[n].setAccessible(true);
						Object srcValue = srcField[n].get(src);
						Object destValue = destField[i].get(dest);
						if (filtNullProps) {
							if (srcValue == null) {
								srcField[n].set(src, destValue);
							}
						} else {
							srcField[n].set(dest, srcValue);
						}
					}
				}
			}
		}
	}

	public static Field getFieldByFieldName(Object obj, String fieldName) {
		for (Class<?> superClass = obj.getClass(); superClass != Object.class; superClass = superClass
				.getSuperclass()) {
			try {
				return superClass.getDeclaredField(fieldName);
			} catch (NoSuchFieldException e) {
			}
		}
		return null;
	}

	public static Object getValueByFieldName(Object obj, String fieldName)
			throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Field field = getFieldByFieldName(obj, fieldName);
		Object value = null;
		if (field != null) {
			if (field.isAccessible()) {
				value = field.get(obj);
			} else {
				field.setAccessible(true);
				value = field.get(obj);
				field.setAccessible(false);
			}
		}
		return value;
	}

	public static void setValueByFieldName(Object obj, String fieldName, Object value)
			throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Field field = obj.getClass().getDeclaredField(fieldName);
		if (field.isAccessible()) {
			field.set(obj, value);
		} else {
			field.setAccessible(true);
			field.set(obj, value);
			field.setAccessible(false);
		}
	}
}
