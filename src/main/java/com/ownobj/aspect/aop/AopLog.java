package com.ownobj.aspect.aop;



import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
@Order(1)
public class AopLog {

	private final Logger logger = Logger.getLogger(AopLog.class);
			
	@Pointcut("execution(public * com.ownobj.aspect.controller.*.*(..))")
	public void recordLog() {
		
	}
	
	@Before(value = "recordLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();  
        HttpServletRequest request = attributes.getRequest();  
        // 记录下请求内容  
        logger.info("URL : " + request.getRequestURL().toString());  
        logger.info("HTTP_METHOD : " + request.getMethod());  
        logger.info("IP : " + request.getRemoteAddr()); 
		
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());  
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));  
	}
	
	@AfterReturning(returning = "ret", pointcut = "recordLog()")
	public void doAfterReturning(Object ret) throws Throwable{
		logger.info("方法返回值："+ret);
	}
	
	 //后置异常通知  
    @AfterThrowing("recordLog()")  
    public void throwss(JoinPoint jp){  
        logger.info("方法异常时执行.....");  
    }  
  
    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行  
    @After("recordLog()")  
    public void after(JoinPoint jp){  
        logger.info("方法最后执行.....");  
    }  
  
    //环绕通知,环绕增强，相当于MethodInterceptor  
    @Around("recordLog()")  
    public Object arround(ProceedingJoinPoint pjp) {  
        logger.info("方法环绕start.....");  
        try {  
            Object o =  pjp.proceed();  
            logger.info("方法环绕proceed，结果是 :" + o);  
            return o;  
        } catch (Throwable e) {  
            e.printStackTrace();  
            return null;  
        }  
    }  
    
    
}  

