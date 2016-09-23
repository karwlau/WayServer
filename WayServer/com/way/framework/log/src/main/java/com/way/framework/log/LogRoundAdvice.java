package com.way.framework.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class LogRoundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		Logger log = Logger.getLogger(methodInvocation.getMethod().getDeclaringClass());
		log.debug("before invoked method process");
		try {
			Object result = methodInvocation.proceed();
			log.debug("after invoked method process");
			return result;
		} catch (Exception e) {
			log.error("invoked method exception:"+e);
			throw e;
		}
	}

}
