package org.samyak.com.flipcart;

import java.util.Iterator;
import java.util.Set;

import org.samyak.com.generaicLib.BaseClass;
import org.testng.annotations.Test;

import objectRepository.SearchPage;
import objectRepository.ShowByProdcutOnline;

public class ShowByProdcutOnlineTest extends BaseClass{
	LoginPageTest lpt ;
	SearchPage sp ;
	ShowByProdcutOnline selectProduct ;
	
	
	
	@Test()
	public void selectProduct() throws InterruptedException{

		lpt = new LoginPageTest();
		sp = new SearchPage();
		selectProduct=new ShowByProdcutOnline();
		lpt.login();
		sp.searchShoes();
		selectProduct.clickOnImg();
		
		
	}
	
}
