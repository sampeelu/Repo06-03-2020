package objectRepository;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;
import org.samyak.com.generaicLib.GeneralClass;


public class SortBy {
	LoginPage lp ;
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronics;

	@FindBy(partialLinkText = "Screenguards")
	public WebElement screengaurd;

	@FindBy(xpath = "//div[text()='Price -- Low to High']")
	public WebElement priceLowToHigh;

	@FindBy(xpath = "//div[contains(@data-id,'ACCF')]")
	public List<WebElement> verifyPRiceLowToHigh;

	@FindBy(xpath = "//div[text()='Price -- High to Low']")
	public WebElement priceHighToLow;

	public WebElement getPriceHighToLow() {
		return priceHighToLow;
	}

	@FindBy(xpath = "//div[@class='_1vC4OE']")
	public List<WebElement> priceOfScreenGaurd;

	public LoginPage getLp() {
		return lp;
	}

	public WebElement getScreengaurd() {
		return screengaurd;
	}

	public WebElement getPriceLowToHigh() {
		return priceLowToHigh;
	}

	public WebElement getElectronics() {
		return electronics;

	}

	public SortBy(){
		lp = PageFactory.initElements(BaseClass.driver,LoginPage.class);
		PageFactory.initElements(BaseClass.driver,this);
	}

	public void clickonScreenGaurdsSortBy(){
		lp.loginflipkart();
		electronics.click();

		screengaurd.click();

		/**
		 * low to high sort technique
		 */
		priceLowToHigh.click();

		System.out.println(verifyPRiceLowToHigh.size());

		List<WebElement> lst= priceOfScreenGaurd;

		List<String> strings = new ArrayList<String>();

		for(WebElement e : lst){
			strings.add(e.getText());
		}


		System.out.println("get text of links ............:....... "+ strings);
		List<String> priceProd = new ArrayList<String>();
		priceProd.addAll(strings);

		Collections.sort(priceProd);

		System.out.println("after sort array list>>>>>>>>>>>>>>> :"+priceProd);
		assertEquals(strings, priceProd);

		/**
		 * high to low sort technique
		 * 
		 */

		priceHighToLow.click();

		List<WebElement> highToLow= priceOfScreenGaurd;

		List<String> sthighToLow = new ArrayList<String>();

		try{

			for(WebElement web : highToLow){
				sthighToLow.add(web.getText());
			}
		}
		catch(Exception eprint){
			for(WebElement web : highToLow){
				sthighToLow.add(web.getText());
			}	
		}

		System.out.println("high to low before sort ............:....... "+ sthighToLow);

		List<String> priceProdHightolow = new ArrayList<String>();
		priceProdHightolow.addAll(sthighToLow);
		Collections.sort(priceProdHightolow, Collections.reverseOrder());

		System.out.println("high to low after sort ............:....... "+ priceProdHightolow);
		assertEquals(priceProdHightolow, sthighToLow);

	}

}
