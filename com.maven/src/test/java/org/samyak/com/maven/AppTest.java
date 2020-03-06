package org.samyak.com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;
import org.testng.internal.annotations.ExpectedExceptionsAnnotation;

public class AppTest 
{
	WebDriver driver ;
	
	@Test
	public void testFB() throws InterruptedException{
			
		//System.setProperty("webdriver.chrome.driver", ".//com.maven//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseOxygen\\com.maven\\chromedriver.exe");
		driver = new ChromeDriver();	

		driver.get("https://phptravels.com/demo");
		WebElement img = driver.findElement(By.xpath("//img[@src = 'https://phptravels.com/assets/img/front.png']"));
		WebDriverWait wait = new WebDriverWait(driver,4);
		wait.until(ExpectedConditions.visibilityOf(img));
		boolean b = img.isDisplayed();
		System.out.println(b);
		//capture the size of image
		
		Dimension dim = img.getSize();
		System.out.println(dim+"heght : "+dim.getHeight()+" height > "+dim.height);
		
		// location of img
		Point p = img.getLocation();
		System.out.println(p);
		
		
		
		
	//	driver.quit();
		
	}
	
}