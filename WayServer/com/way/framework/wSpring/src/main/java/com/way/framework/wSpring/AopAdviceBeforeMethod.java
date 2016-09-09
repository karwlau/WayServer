package com.way.framework.wSpring;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AopAdviceBeforeMethod implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("aop advise before method invoke");
	}	

}
