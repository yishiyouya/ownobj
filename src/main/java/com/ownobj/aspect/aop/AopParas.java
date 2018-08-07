package com.ownobj.aspect.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ownobj.aspect.bean.ParamBean;

@Aspect
@Component
@Order(2)
public class AopParas {
	
	private final String expPoint="execution (* com.ownobj.aspect.service.ChangeParamService.change(..))";
	
	@Pointcut(expPoint)
	public void changeArgs() {
		
	}
	
	@Before(value = "changeArgs()")
	public Object before(JoinPoint joinPoint) {
		System.out.println("change para before……");
		Object[] obj = joinPoint.getArgs();
		for(Object oj : obj) {
			if(oj instanceof ParamBean) {
				ParamBean pb = (ParamBean)oj;
				pb.setArg1("hhhhhhh");
			}
		}
		return obj;
	}
	
}
