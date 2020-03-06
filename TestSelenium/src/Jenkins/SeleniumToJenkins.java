package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumToJenkins {
	
@Test
public void test() {
	System.out.println("PASS");
	System.setProperty("webdriver.chrome.driver", "F:\\Automation_Utility\\chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	System.out.println(driver.getTitle());
	if(driver.getTitle().equals("Google"))
		System.out.println("PASS");
	else
		System.out.println("FAIL");
}
}
