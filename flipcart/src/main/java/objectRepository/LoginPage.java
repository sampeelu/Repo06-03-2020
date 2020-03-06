package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samyak.com.generaicLib.BaseClass;

public class LoginPage {
	
	WebDriver  driver;
	
	public LoginPage(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(xpath ="//span[text() = 'Enter Email/Mobile number']/../preceding-sibling::input")
	public WebElement email;

	@FindBy(xpath ="//form[@autocomplete='on']//input[@type = 'password']")
	public WebElement pwd;

	@FindBy(xpath = "//form//span[text()='Login']")
	public WebElement loginbutton;
	
	
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}
	
	public WebElement getlogin() {
		return loginbutton;
	}

	public void loginflipkart(){
		email.sendKeys("peelujain@gmail.com");
		//GeneralClass.waitForPageToLoad(driver);	
		pwd.sendKeys("peelu@123");
		
		loginbutton.click();
		BaseClass.driver.manage().window().maximize();
	}
}
