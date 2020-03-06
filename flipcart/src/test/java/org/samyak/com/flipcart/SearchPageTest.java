package org.samyak.com.flipcart;
import org.samyak.com.generaicLib.BaseClass;
import org.samyak.com.generaicLib.GeneralClass;
import org.testng.annotations.Test;

import objectRepository.SearchPage;
import objectRepository.ShowByProdcutOnline;

public class SearchPageTest extends BaseClass{
	
	LoginPageTest lpt;
	SearchPage sp;
	
	/*public SearchPageTest() {
		lpt= new LoginPageTest();
		sp = new SearchPage();
	}*/
	@Test()
	public void searchProduct() throws InterruptedException{
		lpt= new LoginPageTest();
		lpt.login();
		sp = new SearchPage();
		sp.searchShoes();
		
		
	}


}
