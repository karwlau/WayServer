package com.way.framework.model.query;

import java.util.Map;

import com.way.framework.model.Pagination;

public abstract interface Query extends Map<String, Object> {

	public abstract void setDefaultPo(Object paramObject);

	public abstract Object getDefaultPo();

	public abstract void setDefaultPage(Pagination paramPagination);

	public abstract Pagination getDefaultPage();

	public abstract void setDefaultIds(String paramString);

	public abstract void setDefaultId(Object paramObject);

	public abstract String getDefaultIds();

	public abstract Object getDefaultId();

	public abstract void addParameters(Object... paramVarArgs);

	public abstract void addParameters(Map<String, Object> paramMap);

	public abstract void addParameters(String paramString, Object paramObject);

	public abstract Object getParameter(String paramString);

	public abstract String getParameter(String paramString1, String paramString2);

	public abstract double getParameter(String paramString, double paramDouble);

	public abstract float getParameter(String paramString, float paramFloat);

	public abstract long getParameter(String paramString, long paramLong);

	public abstract int getParameter(String paramString, int paramInt);

	public abstract short getParameter(String paramString, short paramShort);

	public abstract byte getParameter(String paramString, byte paramByte);

	public abstract boolean getParameter(String paramString, boolean paramBoolean);
}
