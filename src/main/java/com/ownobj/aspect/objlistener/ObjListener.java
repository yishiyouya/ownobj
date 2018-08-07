package com.ownobj.aspect.objlistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

import com.ownobj.aspect.objfilter.ObjFilter;

@WebListener
public class ObjListener implements ServletContextListener{
	
	private final Logger logger = Logger.getLogger(ObjListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.info("监听器初始化");
		logger.info(sce.getServletContext().getServerInfo());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.info("监听器销毁");
	}

	
	
}
