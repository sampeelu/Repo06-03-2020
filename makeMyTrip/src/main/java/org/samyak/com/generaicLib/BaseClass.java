package org.samyak.com.generaicLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	FileInputStream f;
	@BeforeClass
	public void launchBrowser() throws IOException {
		System.out.println("..........................l.........................");
		f = new FileInputStream("F:\\EclipseOxygen\\flipcart\\src\\main\\java\\UtilFile.properties");	
		Properties pobj = new Properties();
		pobj.load(f);
		String brows = pobj.getProperty("brows");
		System.out.println("Before launch chrome ");
		if(brows.equalsIgnoreCase("chrome")) {
			System.out.println("After launch chrome ");
			System.setProperty("webdriver.chrome.driver", "F:\\EclipseOxygen\\flipcart\\resources\\chromedriver.exe");
		
	/*	launch chrome driver in incognito
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(cap);
			
	*/		
			driver = new ChromeDriver();
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}else if(brows.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		String url = pobj.getProperty("mmtUrl");
		driver.get(url);
		
	}
	
	
	@AfterClass
	public void quit() {
		driver.quit();
		
	}
	
}
