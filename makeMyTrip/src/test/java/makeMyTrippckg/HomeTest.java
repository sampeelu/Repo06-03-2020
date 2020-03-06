package makeMyTrippckg;

import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;
import org.samyak.com.generaicLib.GeneralClass;
import org.testng.annotations.*;

import objectRepo.Home;

public class HomeTest extends BaseClass {
	Home h ;
	GeneralClass gc;
	public HomeTest(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@Test(enabled=false)
	public void selectLowestPrice() throws InterruptedException{
		h = new Home();
		h.selectLowestPriceFlight();
		
		gc.waitForPageToLoad(driver);
		
		
	}
	
	@Test
	public void bookAHotelTest() throws InterruptedException{
		h = new Home();
	//	gc.waitForPageToLoad(driver);
		h.bookAHotel();
	
		
		
	}
}
