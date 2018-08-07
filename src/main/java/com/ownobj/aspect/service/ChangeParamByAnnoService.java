package com.ownobj.aspect.service;

import org.springframework.stereotype.Service;

import com.ownobj.aspect.bean.ParamBean;

@Service
public interface ChangeParamByAnnoService {
	
	public void changeByAnno(ParamBean pBean);
	
}
