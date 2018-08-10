package com.ownobj.aspect.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.ownobj.aspect.dao.IdCardDao;
import com.ownobj.aspect.service.impl.IdCardServiceImpl;


@RunWith(PowerMockRunner.class)
@PrepareForTest(IdCardServiceImpl.class)
public class IdCardTest {

	@Test
	public void idCardGetTotal() throws Exception {
		
		IdCardDao idCardDao = PowerMockito.mock(IdCardDao.class);
		
		try {
			PowerMockito.whenNew(IdCardDao.class).withNoArguments()
			.thenReturn(idCardDao);
			
			PowerMockito.when(idCardDao.getTotal()).thenReturn(10);
			
			IdCardServiceImpl idCardServiceImpl = new IdCardServiceImpl(); 
			int total = 0;
			total = idCardServiceImpl.getIdCardTotal();
			assertEquals(10, total);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
