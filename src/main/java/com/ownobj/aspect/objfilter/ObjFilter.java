package com.ownobj.aspect.objfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.log4j.Logger;

import com.ownobj.aspect.objinterceptor.ObjInterceptor;

@WebFilter
public class ObjFilter implements Filter{
	
	private final Logger logger = Logger.getLogger(ObjFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("过滤器初始化");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		logger.info("过滤器操作");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		logger.info("过滤器销毁");
	}
	
}
