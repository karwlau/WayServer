package com.way.framework.wSpring;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AopAdviceAfterMethod implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("aop advise after method invoke");
	}

}
