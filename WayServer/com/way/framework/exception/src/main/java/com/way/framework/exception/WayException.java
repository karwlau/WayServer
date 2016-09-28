package com.way.framework.exception;

public class WayException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2854697456254125411L;

	protected String serial;

	protected String code;

	protected String message;

	public WayException() {

	}

	public WayException(Throwable throwable) {
		super(throwable);
	}

	public WayException(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public WayException(String serial, String code, String message) {
		this.serial = serial;
		this.code = code;
		this.message = message;
	}

	/**
	 * @return the serial
	 */
	public String getSerial() {
		return serial;
	}

	/**
	 * @param serial
	 *            the serial to set
	 */
	public void setSerial(String serial) {
		this.serial = serial;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
