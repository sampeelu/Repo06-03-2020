package objectRepo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;
import org.samyak.com.generaicLib.GeneralClass;

import net.bytebuddy.asm.Advice.FieldValue;

public class Home {

	WebDriver  driver;
	GeneralClass gc;
	public Home(){
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(xpath = "//a[text()='Search']")
	private WebElement search;

	@FindBy(xpath = "//span[@xpath = '1']")
	private WebElement stops;

	@FindBy(xpath = "//div[@id = 'departure_group']//span[text()='12 Noon-6PM']")
	private WebElement departFromND;

	@FindBy(xpath= "//div[@id='arrival_group']//span[4]//label[1]//span[1]//span[1]")
	private WebElement arrivalBng;

	@FindBy(xpath= "//span[contains(@class,'labeltext')][contains(text(),'Air India')]")
	private WebElement airline;

	@FindBy(xpath = "//span[contains(@class,'actual-price')]")
	private List<WebElement> lst;

	@FindBy(xpath = "//span[text()='Hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//label[@for = 'city']//input[@type = 'text']")
	private WebElement typecityforsearchhotel;

	@FindBy(id = "checkin")
	private WebElement checkin;
	
	@FindBy(xpath = "//div[@aria-label = 'Sat Feb 22 2020']")
	private WebElement checkInDate;

	@FindBy(id = "checkout")
	private WebElement checkout;
	
	@FindBy(xpath = "//div[@aria-label= 'Sun Mar 01 2020']")
	private WebElement checkOutDate;

	@FindBy(id = "guest")
	private WebElement guest;

	@FindBy(xpath = "//li[@data-cy='adults-6']")
	private WebElement adults;
	
	@FindBy(xpath = "//li[@data-cy='children-2']")
	private WebElement children;

	@FindBy(id = "0")
	private WebElement childAge;

	@FindBy(xpath = "//option[@data-cy = 'childAgeValue-2']")
	private WebElement childAgeValue;

	@FindBy(xpath = "//button[text()='APPLY']")
	private WebElement apply;

	@FindBy(xpath = "//span[@data-cy = 'travelForText']")
	private WebElement travelFor;
	
	@FindBy(xpath = "//li[text()='Leisure']")
	private WebElement leisure;
	
	@FindBy(xpath = "//p//button[@type='button']")
	private WebElement searchButton;

	/**
	 * @return the checkin
	 */
	public WebElement getCheckin() {
		return checkin;
	}

	/**
	 * @return the adults
	 */
	public WebElement getAdults() {
		return adults;
	}

	/**
	 * @return the children
	 */
	public WebElement getChildren() {
		return children;
	}

	/**
	 * @return the childAge
	 */
	public WebElement getChildAge() {
		return childAge;
	}

	/**
	 * @return the childAgeValue
	 */
	public WebElement getChildAgeValue() {
		return childAgeValue;
	}

	/**
	 * @return the apply
	 */
	public WebElement getApply() {
		return apply;
	}


	/**
	 * @return the travelFor
	 */
	public WebElement getTravelFor() {
		return travelFor;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getTypecityforsearchhotel() {
		return typecityforsearchhotel;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getStops() {
		return stops;
	}

	public WebElement getDepartFromND() {
		return departFromND;
	}

	public WebElement getArrivalBng() {
		return arrivalBng;
	}

	public WebElement getAirline() {
		return airline;
	}




	public void selectLowestPriceFlight() throws InterruptedException {
		BaseClass.driver.manage().window().maximize();
		search.click();
		//Thread.sleep(3000);
		gc.explicitWaitClickable(departFromND);
		departFromND.click();
		arrivalBng.click();
		airline.click();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(WebElement wb:lst){
			String str = wb.getText();
			list.add(Integer.parseInt(str.replace("₹", "").replace(",","").trim()));
		}

		System.out.println("prict is .... "+list);

		Collections.sort(list);

		System.out.println("after sort .....> "+list);
		System.out.println("take lowest price flight :-----> "+list.get(0));


	}

	public void bookAHotel() throws InterruptedException {
		BaseClass.driver.manage().window().maximize();
		GeneralClass.waitForPageToLoad(BaseClass.driver);

		hotels.click();
		GeneralClass.waitForPageToLoad(BaseClass.driver);
		//typecityforsearchhotel.click();
		typecityforsearchhotel.sendKeys("Delhi");
		typecityforsearchhotel.sendKeys(Keys.ENTER);
		checkin.click();
		
		checkInDate.click();
		checkOutDate.click();
		guest.click();
		adults.click();
		
		children.click();
		
		childAge.click();
		childAgeValue.click();
		
		GeneralClass.waitForPageToLoad(BaseClass.driver);
		apply.click();
		travelFor.click();
		leisure.click();
		searchButton.click();
	}




}
