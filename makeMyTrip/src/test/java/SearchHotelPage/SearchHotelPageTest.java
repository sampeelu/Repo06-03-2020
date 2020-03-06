package SearchHotelPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;
import org.samyak.com.generaicLib.GeneralClass;
import org.testng.annotations.Test;

import makeMyTrippckg.HomeTest;
import objectRepo.SearchHotelPage;

public class SearchHotelPageTest extends BaseClass{
	GeneralClass gc;
	SearchHotelPage shp;
	HomeTest ht;
	/*public SearchHotelPageTest() {
	PageFactory.initElements(driver,this);
	}*/
	@Test
	public void searchHotelsTest() throws InterruptedException{
		shp = new SearchHotelPage();
		ht = new HomeTest();
		ht.bookAHotelTest();
		shp.searchHotels();	
	
	
	}

}
