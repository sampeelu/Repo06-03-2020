package objectRepo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;
import org.samyak.com.generaicLib.GeneralClass;
import org.testng.Assert;

public class SearchHotelPage {
	
	GeneralClass gc;
	
	public SearchHotelPage() {
	PageFactory.initElements(BaseClass.driver,this);
	}
	
	@FindBy(xpath = "//a[@class = 'mapCont']")
	private WebElement viewMap;
	
	@FindBy(xpath = "//div[contains(@class,'listingMapModal')]//span[1]//div")
	private WebElement slider1;
	
	@FindBy(xpath = "//div[contains(@class,'listingMapModal')]//span[2]//div")
	private WebElement slider2;

	@FindBy(xpath = "The Zuri Whitefield")
	private WebElement zuriWhitefield;

	@FindBy(xpath = "//span[@title = 'Pay @ Hotel Available']")
	private WebElement filterPay; 
	
	@FindBy(xpath = "//span[@class = 'mapClose']")
	private WebElement mpaclose;
	
	@FindBy(xpath = "//div[text()= 'Facility']/following-sibling::ul/li[*]//label")
	private List<WebElement> lst;
	
	@FindBy(xpath = "//div[@id='hlistpg_fr_facility']//span[@id='hlistpg_proptypes_show_more']")
	private WebElement showMoreFacility;
	
	
	public WebElement getViewMap() {
		return viewMap;
	}
	
	
	public WebElement getSlider1() {
		return slider1;
	}
	public WebElement getZuriWhitefield() {
		return zuriWhitefield;
	}

	public void searchHotels() throws InterruptedException {

		viewMap.click();
		gc.waitForPageToLoad(BaseClass.driver);
		filterPay.click();
	//	slider1.click();
		
		gc.dragAndDropL2R(slider1);
		gc.waitForPageToLoad(BaseClass.driver);
		gc.dragAndDropR2L(slider2);
		
		mpaclose.click();
		showMoreFacility.click();	
		List<WebElement> list = new ArrayList<WebElement>();
		int size = lst.size();
		System.out.println("------->"+size);
		list.addAll(lst);
		System.out.println(list.addAll(lst));
		
		/*
		for(WebElement ls : list){
			
			ls.click();
			System.out.println("============: "+ls.getText());
			gc.waitForPageToLoad(BaseClass.driver);
		}*/
		
		for(int i=0;i<list.size();i++){
			
			try{
			System.out.println("============: "+list.get(i).getText());
			gc.explicitWaitClickable(list.get(i));
			list.get(i).click();
			}catch (Exception e) {
				e.printStackTrace();			}
			//gc.waitForPageToLoad(BaseClass.driver);
		}
		
		gc.waitForPageToLoad(BaseClass.driver);
	}
	
}
