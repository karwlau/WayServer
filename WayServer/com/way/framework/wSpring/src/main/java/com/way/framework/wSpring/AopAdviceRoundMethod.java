package com.way.framework.wSpring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class AopAdviceRoundMethod implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("aop advise round method before invoke");
		try{
			Object result = methodInvocation.proceed();
			System.out.println("aop advise round method after invoke");
			return result;
		}catch(Exception e){
			System.out.println("aop advise round method exception invoke");
			throw e;
		}
	}


}
