package org.samyak.com.flipcart;

import org.samyak.com.generaicLib.BaseClass;
import org.testng.annotations.Test;

import objectRepository.SortBy;

public class SortByTest extends BaseClass{

	SortBy sortby;
	@Test
	public void executeSortByTest() throws InterruptedException{
		sortby = new SortBy();
		
		sortby.clickonScreenGaurdsSortBy();
		Thread.sleep(2000);
	}
	
}
