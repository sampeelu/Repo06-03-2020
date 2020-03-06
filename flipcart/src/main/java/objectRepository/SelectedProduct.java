package objectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;
import org.samyak.com.generaicLib.GeneralClass;

public class SelectedProduct {

	@FindBy(xpath= "//div[@class = '_2LG8B7']/span")
	private WebElement selectAdd;

	@FindBy(xpath="//input[@placeholder='Enter delivery pincode']")
	private WebElement enterPincode;

	@FindBy(xpath = "//span[text()='Check']")
	private WebElement check;

	@FindBy(xpath = "//span[text()='Size Chart']")
	public WebElement sizeChart;

	@FindBy(xpath="//div[text()='Size Chart']")
	public WebElement verifySizeChartPopup;

	@FindBy(xpath = "//div[text()='Size Chart']/ancestor::div[2]/button")
	public WebElement cancelSizeChart;

	@FindBy(xpath = "//div/span[text()='Size- UK/India']/..//li/a[text()='8']")
	private WebElement size;
	/*@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCartbutton;*/

	@FindBy(xpath="//div[@class = '_1k1QCg']//li[1]")
	private WebElement addToCartbutton;

	@FindBy(xpath = "(//div[text()='Remove'])[1]")
	private WebElement removeProdAfterAddToCart;

	@FindBy(xpath ="//div[text()='Remove Item']/following-sibling::div[2]//div[text()='Remove']")
	private WebElement removepopup;

	@FindBy(xpath= "//div[contains(text(),'Successfully removed')]")
	public WebElement SuccessfullyRemovedPopUpMsg;

	public WebElement getCancelSizeChart() {
		return cancelSizeChart;
	}

	public WebElement getRemoveProdAfterAddToCart() {
		return removeProdAfterAddToCart;
	}

	public WebElement getSuccessfullyRemovedPopUpMsg() {
		return SuccessfullyRemovedPopUpMsg;
	}

	@FindBy(xpath = "//span[text()='Continue']")
	private WebElement continuebutton;
	
	@FindBy(id= "to-payment")
	private WebElement afterContinueAgainCONTINUEToPayemnt;
	
	
	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddToCartbutton() {
		return addToCartbutton;
	}

	public WebElement getRemoveProd() {
		return removeProdAfterAddToCart;
	}



	public WebElement getCheck() {
		return check;
	}

	public WebElement getEnterPincode() {
		return enterPincode;
	}

	public WebElement getSelectAdd() {
		return selectAdd;
	}

	public WebElement getVerifySizeChartPopup() {
		return verifySizeChartPopup;
	}

	public WebElement getSizeChart() {
		return sizeChart;
	}

	public WebElement getRemovepopup() {
		return removepopup;
	}

	public SelectedProduct(){
		PageFactory.initElements(BaseClass.driver,this);

	}

	public void addProdTocart() throws InterruptedException{
		try{
			selectAdd.click();
		}catch (Exception e) {
			e.printStackTrace();
		}
		GeneralClass.explicitWait(enterPincode);
		//GeneralClass.waitForPageToLoad(BaseClass.driver);
		enterPincode.sendKeys("560037");
		GeneralClass.explicitWait(check);
		//Thread.sleep(2000);
		if(check.isEnabled()){
			check.click();
		}
		//Thread.sleep(2000);
		try{
			GeneralClass.explicitWait(sizeChart);
			sizeChart.click();
		}catch (Exception e) {
			GeneralClass.explicitWait(sizeChart);
			sizeChart.click();
		}
		GeneralClass.explicitWait(verifySizeChartPopup);
		String getTextOfSizeChart = verifySizeChartPopup.getText();

		System.out.println("get text of size chart popup :"+getTextOfSizeChart);
		cancelSizeChart.click();
		size.click();
		//GeneralClass.explicitWait(addToCartbutton);

		/* JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
		 js.executeScript("window.scrollBy(0,200)");*/

		//String captureAdd = selectAdd.getText();
		//System.out.println(captureAdd);
		try{
			GeneralClass.explicitWait(addToCartbutton);
			addToCartbutton.click();
		}catch(StaleElementReferenceException e){
			addToCartbutton.click();
		}
		//GeneralClass.waitForPageToLoad(BaseClass.driver);
		Thread.sleep(5000);
		removeProdAfterAddToCart.click();
		removepopup.click();
		//Thread.sleep(2000);



		do {
			System.out.println("waiting ........................................");
		} while (SuccessfullyRemovedPopUpMsg.isDisplayed());
		
		//GeneralClass.explicitInVisibility(SuccessfullyRemovedPopUpMsg);
		
			Thread.sleep(5000);
		
		try{
			GeneralClass.explicitWait(continuebutton);
			//GeneralClass.explicitWaitClickable(continuebutton);
			continuebutton.click();
		}catch (Exception e) {
				GeneralClass.explicitWaitClickable(continuebutton);
			continuebutton.click();


		}
		GeneralClass.explicitWait(afterContinueAgainCONTINUEToPayemnt);
		afterContinueAgainCONTINUEToPayemnt.click();
		Thread.sleep(5000);


	}




}
