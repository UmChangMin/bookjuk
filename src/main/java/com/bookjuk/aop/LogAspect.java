package com.bookjuk.aop;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Component
@Aspect
public class LogAspect {
	//Logger
	public static Logger logger=Logger.getLogger(LogAspect.class.getName());
	public static final String logMsg="LogMsg------------------------";
	
	@Around(value="within(com.bookjuk..*)")
	public Object advice(ProceedingJoinPoint joinPoint) {
		Object obj=null;
		
		try {
			logger.info(logMsg+joinPoint.getTarget().getClass().getName()+"\t\t"+joinPoint.getSignature().getName());
			
			obj=joinPoint.proceed();
			
		}catch (Throwable e) {
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		
		return obj;
	}
}
