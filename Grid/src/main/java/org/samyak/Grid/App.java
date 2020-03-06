package org.samyak.Grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
   @Test(priority=1)
   public void registeredUser(){
	   System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32_78version\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   System.out.println("registeredUser");
	  // driver.close();
   }
   
   @Test(priority=2)
   public void loginUser(){
	   System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32_78version\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   System.out.println("loginUser");
	   //driver.close();
	   
   }
   
   @Test(priority=3)
   public void updateUser(){
	   System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32_78version\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   System.out.println("updateUser");
	   //driver.close();
   }
}
