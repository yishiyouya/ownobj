package com.ownobj.aspect.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ownobj.aspect.bean.ParamBean;

@Aspect
@Component
@Order(3)
public class AopParasAnno {

	private final String expPoint="@annotation(com.ownobj.aspect.ownannotation.ChanMethodArg)";
	
	@Pointcut(expPoint)
	public void changeArgsByAnno() {
		
	}
	
	@Before(value = "changeArgsByAnno()")
	public Object before(JoinPoint joinPoint) {
		System.out.println("change para by Annotation before……");
		Object[] obj = joinPoint.getArgs();
		for(Object oj : obj) {
			if(oj instanceof ParamBean) {
				ParamBean pb = (ParamBean)oj;
				pb.setArg2("#&*）￥%*（）");
			}
		}
		return obj;
	}
	
}
