package com.way.utils.security;

import org.junit.Test;

import com.way.utils.security.MD5.MD5Util;

public class TestMD5 {
	@Test
	public void pwd() {
		// System.out.println(MD5Util.makeSalt(9));
		System.out.println(MD5Util.makePassWord("123456", "1234"));
	}

	public static void main(String[] args) {
		TestMD5 test = new TestMD5();
		test.pwd();
	}
}
