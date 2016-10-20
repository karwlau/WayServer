package com.way.framework.model;

import java.util.List;

public class Pagination<T> {
	private int pageNo;
	private int pageSize;
	private int totalNum;
	private List<T> list;
	//easyUI
	private int page;
	private int rows;
	
	public void setPage(int page) {
		this.page = page;
		this.pageNo = page;
	}

	public void setRows(int rows) {
		this.rows = rows;
		this.pageSize = rows;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
