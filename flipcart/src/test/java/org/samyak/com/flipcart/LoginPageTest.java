package org.samyak.com.flipcart;
import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;
import org.testng.annotations.Test;

import objectRepository.LoginPage;
import objectRepository.SearchPage;
public class LoginPageTest extends BaseClass{
	
	LoginPage l;
	public LoginPageTest(){
		PageFactory.initElements(driver, this);
		System.out.println("==============================================pppppp=");
	}

	@Test
	public void login() throws InterruptedException{
		
		l=new LoginPage();
		
		l.loginflipkart();

	

	}
}
