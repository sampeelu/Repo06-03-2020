package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Utility\\chromedriver_win32\\chromedriver.exe");
	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-extensions");
		driver = new ChromeDriver(co);
		driver.navigate().to("http://demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		WebElement user = driver.findElement(By.name("uid"));
		user.sendKeys("mngr121371");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("amanUby");
		WebElement submit = driver.findElement(By.name("btnLogin"));
		submit.click();
		

		WebElement new_customer = driver.findElement(By.xpath("//a[.='New Customer']"));
		new_customer.click();

		WebElement customerName = driver.findElement(By.xpath("//*[@name='name']"));
		
		customerName.sendKeys("TestUser");
		WebElement dob = driver.findElement(By.xpath("//*[@type='date']"));
		dob.click();

		dob.sendKeys("2018");
		WebElement address = driver.findElement(By.xpath("//*[@name='addr']"));
		address.sendKeys("Address 1");
		WebElement submit1 = driver.findElement(By.xpath("//*[@type='submit']"));
		submit1.click();
		
	}

}
