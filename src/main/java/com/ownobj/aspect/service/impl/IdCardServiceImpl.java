package com.ownobj.aspect.service.impl;

import com.ownobj.aspect.dao.IdCardDao;
import com.ownobj.aspect.service.IdCardService;

public class IdCardServiceImpl implements IdCardService{


	private IdCardDao idCardDao;
	
	public IdCardServiceImpl(IdCardDao idCardDao) {
		this.idCardDao = idCardDao;
	}
	
	public int getIdCardTotal(){
		return idCardDao.getTotal();
	}
	
}
