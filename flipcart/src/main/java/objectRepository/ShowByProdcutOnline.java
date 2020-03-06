package objectRepository;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;
import org.samyak.com.generaicLib.GeneralClass;

public class ShowByProdcutOnline {
	
	// id is dynamic
	/*@FindBy(xpath = "//div[@data-id='SHOFE5PHQZJP7ETQ']")
	private WebElement shoesProd;*/
	
	/*@FindBy(xpath = "//div[@data-id='SHOFE5PHDHXBU8DG']")
	private WebElement shoesProd;*/
	
	@FindBy(linkText="SOCKS Running Shoes For Men")
	private WebElement shoesProd;
	
	@FindBy(xpath="//span[contains(text(),'Showing')]")
	private WebElement showingText;
	
	@FindBy(xpath = "//div[@class= '_2LG8B7']")
	private WebElement deliveryAddbox;
	
	public WebElement getshoesProd() {
		return shoesProd;
	}

	public WebElement getShowing(){
		return this.showingText;
	}
	
	public ShowByProdcutOnline(){
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	
	public void clickOnImg() throws InterruptedException{
		
		shoesProd.click();
	
	//verify after click on the product 	
		Set<String> set = BaseClass.driver.getWindowHandles();
		Iterator it = set.iterator();
		String parentWind = (String) it.next();
		
		while(it.hasNext()){
			String childWind = (String) it.next();
			if(!parentWind.equals(childWind)){
				
				BaseClass.driver.switchTo().window(childWind);
				System.out.println("........................"+BaseClass.driver.getTitle());
				
				
			}
		
		}
	}
}
