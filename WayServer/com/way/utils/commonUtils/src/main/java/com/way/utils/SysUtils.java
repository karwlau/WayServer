package com.way.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;


/**
 * 系统kit
 * 
 * @author karwlau
 * @version 1-2016.4.25
 */
public class SysUtils {
	@Test
	public void ipAddr() {
		try {
			System.out.println(InetAddress.getLocalHost().toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void currentTime(){
		System.out.println(System.currentTimeMillis());
	}
}
