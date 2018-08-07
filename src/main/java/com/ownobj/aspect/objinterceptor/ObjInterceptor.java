package com.ownobj.aspect.objinterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/*
 * 拦截器
 */
@Component
public class ObjInterceptor implements HandlerInterceptor{
	
	private final Logger logger = Logger.getLogger(ObjInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object o
			) throws Exception{
		logger.info("-------拦截器请求前调用-------");
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object o,
			ModelAndView modelView) throws Exception{
		logger.info("请求处理后调用（controller后调用）");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object o, Exception e
			) throws Exception{
		logger.info("在整个请求结束后调用，也就是在DispacherServlet"
				+ "渲染了对应的视图之后执行（主要用于进行资源清理工作）");
	}
}
