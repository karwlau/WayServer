package com.way.framework.model.query;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.way.framework.model.Pagination;

public class PageQuery extends HashMap<String, Object> implements Query {
/*	FIXME data type
	public BigDecimal getAsBigDecimal(String key) {
		Object obj = TypeCaseHelper.convert(get(key), "BigDecimal", null);
		if (obj != null) {
			return (BigDecimal) obj;
		}
		return null;
	}

	public Date getAsDate(String key) {
		Object obj = TypeCaseHelper.convert(get(key), "Date", "yyyy-MM-dd");
		if (obj != null) {
			return (Date) obj;
		}
		return null;
	}

	public Integer getAsInteger(String key) {
		Object obj = TypeCaseHelper.convert(get(key), "Integer", null);
		if (obj != null) {
			return (Integer) obj;
		}
		return null;
	}

	public Long getAsLong(String key) {
		Object obj = TypeCaseHelper.convert(get(key), "Long", null);
		if (obj != null) {
			return (Long) obj;
		}
		return null;
	}

	public Boolean getAsBoolean(String key) {
		Object obj = TypeCaseHelper.convert(get(key), "Boolean", null);
		if (obj != null) {
			return (Boolean) obj;
		}
		return null;
	}

	public String getAsString(String key) {
		Object obj = TypeCaseHelper.convert(get(key), "String", null);
		if (obj != null) {
			return (String) obj;
		}
		return "";
	}

	public Timestamp getAsTimestamp(String key) {
		Object obj = TypeCaseHelper.convert(get(key), "Timestamp", "yyyy-MM-dd HH:mm:ss");
		if (obj != null) {
			return (Timestamp) obj;
		}
		return null;
	}
*/
	public void setDefaultAList(List<?> pList) {
		put("defaultAList", pList);
	}

	public void setDefaultBList(List<?> pList) {
		put("defaultBList", pList);
	}

	public List<?> getDefaultAList() {
		return (List) get("defaultAList");
	}

	public List<?> getDefaultBList() {
		return (List) get("defaultBList");
	}

	public void setDefaultPo(Object po) {
		put("defaultPo", po);
	}

	public Object getDefaultPo() {
		return get("defaultPo");
	}

	public void setDefaultPage(Pagination page) {
		put("defaultPage", page);
	}

	public Pagination getDefaultPage() {
		return (Pagination) get("defaultPage");
	}

	public void setDefaultIds(String ids) {
		put("defaultIds", ids);
	}

	public String getDefaultIds() {
		return (String) get("defaultIds");
	}

	public void setDefaultId(Object id) {
		put("defaultId", id);
	}

	public Object getDefaultId() {
		return get("defaultId");
	}

	public static PageQuery create(Pagination page) {
		PageQuery query = new PageQuery();
		query.setDefaultPage(page);
		return query;
	}

	public static PageQuery create() {
		PageQuery query = new PageQuery();
		return query;
	}

	public static PageQuery create(Pagination page, Map<String, Object> params) {
		PageQuery query = new PageQuery();
		query.setDefaultPage(page);
		query.putAll(params);
		return query;
	}

	public static PageQuery create(Object... pairs) {
		PageQuery query = new PageQuery();
		query.addParameters(pairs);
		return query;
	}

	public void addParameters(Object... pairs) {
		if ((pairs == null) || (pairs.length == 0)) {
			return;
		}
		if (pairs.length % 2 != 0) {
			throw new IllegalArgumentException("Map pairs can not be odd number.");
		}
		Map<String, Object> map = new HashMap();
		int len = pairs.length / 2;
		for (int i = 0; i < len; i++) {
			map.put((String) pairs[(2 * i)], pairs[(2 * i + 1)]);
		}
		putAll(map);
	}

	public void addParameters(Map<String, Object> parameters) {
		if ((parameters == null) || (parameters.size() == 0)) {
			return;
		}
		putAll(parameters);
	}

	public void addParameters(String key, Object value) {
		put(key, value);
	}

	public Object getParameter(String key) {
		return get(key);
	}

	public String getParameter(String key, String defaultValue) {
		Object value = getParameter(key);
		if (value == null) {
			return defaultValue;
		}
		return String.valueOf(value);
	}

	public double getParameter(String key, double defaultValue) {
		Object value = getParameter(key);
		if (value == null) {
			return defaultValue;
		}
		return ((Double) value).doubleValue();
	}

	public float getParameter(String key, float defaultValue) {
		Object value = getParameter(key);
		if (value == null) {
			return defaultValue;
		}
		return ((Float) value).floatValue();
	}

	public long getParameter(String key, long defaultValue) {
		Object value = getParameter(key);
		if (value == null) {
			return defaultValue;
		}
		return ((Long) value).longValue();
	}

	public int getParameter(String key, int defaultValue) {
		Object value = getParameter(key);
		if (value == null) {
			return defaultValue;
		}
		return ((Integer) value).intValue();
	}

	public short getParameter(String key, short defaultValue) {
		Object value = getParameter(key);
		if (value == null) {
			return defaultValue;
		}
		return ((Short) value).shortValue();
	}

	public byte getParameter(String key, byte defaultValue) {
		Object value = getParameter(key);
		if (value == null) {
			return defaultValue;
		}
		return ((Byte) value).byteValue();
	}

	public boolean getParameter(String key, boolean defaultValue) {
		Object value = getParameter(key);
		if (value == null) {
			return defaultValue;
		}
		return ((Boolean) value).booleanValue();
	}
}
