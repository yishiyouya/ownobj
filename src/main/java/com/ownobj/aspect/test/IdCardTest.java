package com.ownobj.aspect.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.ownobj.aspect.dao.IdCardDao;
import com.ownobj.aspect.service.impl.IdCardServiceImpl;

public class IdCardTest {

	@Test
	public void idCardGetTotal() throws Exception {
		
		IdCardDao idCardDao = PowerMockito.mock(IdCardDao.class);
		
		PowerMockito.when(idCardDao.getTotal()).thenReturn(10);
		
		IdCardServiceImpl idCardServiceImpl = new IdCardServiceImpl(idCardDao); 
		int total = 0;
		total = idCardServiceImpl.getIdCardTotal();
		assertEquals(10, total);
		
		
	}

}
