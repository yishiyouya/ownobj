package com.ownobj.aspect.service.impl.change;

import org.springframework.stereotype.Component;

import com.ownobj.aspect.bean.ParamBean;
import com.ownobj.aspect.ownannotation.ChanMethodArg;
import com.ownobj.aspect.service.ChangeParamService;

@Component(value = "ChangeParamServiceImpl")
public class ChangeParamServiceImpl implements ChangeParamService{

	@Override
	public void change(ParamBean pBean) {
		// TODO Auto-generated method stub
		System.out.println(pBean.toString());
	}


}
