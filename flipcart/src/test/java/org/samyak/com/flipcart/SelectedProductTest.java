package org.samyak.com.flipcart;

import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;
import org.samyak.com.generaicLib.GeneralClass;
import org.testng.annotations.Test;

import objectRepository.SearchPage;
import objectRepository.SelectedProduct;
import objectRepository.ShowByProdcutOnline;

public class SelectedProductTest extends BaseClass {
	SelectedProduct spt;
	LoginPageTest lpt;
	SearchPage sp;
	ShowByProdcutOnline sbpol;
		
	@Test
	public void addToCartProduct() throws InterruptedException{
		lpt= new LoginPageTest();
		lpt.login();
		sp = new SearchPage();
		sp.searchShoes();
		
		sbpol = new ShowByProdcutOnline();
		sbpol.clickOnImg();
		spt = new SelectedProduct();
		spt = PageFactory.initElements(driver, SelectedProduct.class);
		spt.addProdTocart();
		
		
	}
	

}
