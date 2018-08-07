package com.ownobj.aspect.service.impl;

import org.springframework.stereotype.Component;

import com.ownobj.aspect.bean.ParamBean;
import com.ownobj.aspect.ownannotation.ChanMethodArg;
import com.ownobj.aspect.service.ChangeParamByAnnoService;

@Component
public class ChangeParamByAnnoServiceImpl implements ChangeParamByAnnoService{

	@Override
	@ChanMethodArg
	public void changeByAnno(ParamBean pBean) {
		// TODO Auto-generated method stub
		System.out.println("===============");
		System.out.println(pBean.toString());
		System.out.println("===============");
	}
	
	
}
