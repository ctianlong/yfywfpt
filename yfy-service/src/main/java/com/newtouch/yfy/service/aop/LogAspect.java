package com.newtouch.yfy.service.aop;



import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newtouch.yfy.api.ServiceLog;
import com.newtouch.yfy.dao.WriteLogDao;
import com.newtouch.yfy.service.ReadDBService;

// 切面类
@Aspect
@Service("Aspect")
public class LogAspect {


	@Autowired
	private  HttpServletRequest request;
	
	@Autowired
	private ReadDBService readDBServiceImpl;

	// 环绕增强
	@Around(value = "this(com.yfy.webservice.YuYue)")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long begin = System.currentTimeMillis();
		Object result = proceedingJoinPoint.proceed();
		long end = System.currentTimeMillis();
//		System.out.println(proceedingJoinPoint.toLongString() + "方法执行时间：" + (end - begin));
		Object[] args = proceedingJoinPoint.getArgs();
		String parameter = "";
		for (int i = 0; i < args.length; i++) {
			parameter = (String) args[i]+"_";
		}
		String remoteHost = request.getRemoteHost();
		ServiceLog serviceLog = new ServiceLog();
		serviceLog.setApplyID("123");
		serviceLog.setIp(remoteHost);
		serviceLog.setFcd(new Date().toLocaleString());
		serviceLog.setDiversityTime(Integer.valueOf(Long.toString(end-begin)));
		serviceLog.setInputValue(parameter);
		serviceLog.setOutputValue(result.toString());
		serviceLog.setMethodName(proceedingJoinPoint.toLongString());
		serviceLog.setUserId("abc");
		System.out.println(serviceLog.toString());
		readDBServiceImpl.doserviceLog(serviceLog);
		return result;
	}
}
