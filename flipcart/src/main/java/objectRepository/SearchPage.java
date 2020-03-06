package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;
import org.samyak.com.generaicLib.GeneralClass;


public class SearchPage {
	ShowByProdcutOnline sp;
	@FindBy(name = "q")
	private WebElement searTextBox;
	
	

	public WebElement getSearTextBox() {
		return searTextBox;
	}
	
	
	public SearchPage(){
		PageFactory.initElements(BaseClass.driver, this);
		sp = new ShowByProdcutOnline();
	}
	public void searchShoes() throws InterruptedException{
		
		searTextBox.sendKeys("shoes");
		//GeneralClass.actionFun(searTextBox);
		searTextBox.sendKeys(Keys.ENTER);
		
		GeneralClass.explicitWait(sp.getShowing());
		//Thread.sleep(4000);
		//GeneralClass.waitForPageToLoad(BaseClass.driver);
		String pagetitle = BaseClass.driver.getTitle();
		System.out.println("after search pagetitle is : "+pagetitle);
		String result = sp.getShowing().getText();
		System.out.println(result+"......................................");
		
		//capture the total number of count
		String []arr = result.split(" ");
		String count = arr[5];
		String intercount = count.replace(",","");
		int actCount = Integer.parseInt(intercount);
		System.out.println("total number of records is : "+actCount);
		
		
		
	}

}
