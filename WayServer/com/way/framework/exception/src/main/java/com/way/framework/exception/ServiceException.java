package com.way.framework.exception;

public class ServiceException extends WayException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4386937434460776107L;

	public ServiceException() {
		super();
	}

	public ServiceException(String serial, String code, String message) {
		super(serial, code, message);
	}

	public ServiceException(String code, String message) {
		super(code, message);
	}

	public ServiceException(Throwable throwable) {
		super(throwable);
	}

}
