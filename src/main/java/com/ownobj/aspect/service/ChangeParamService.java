package com.ownobj.aspect.service;

import org.springframework.stereotype.Service;

import com.ownobj.aspect.bean.ParamBean;

@Service
public interface ChangeParamService {
	
	public void change(ParamBean pBean);
	
	
	public default void changeByAnno(ParamBean pBean) {
		
	}
	
	
}
