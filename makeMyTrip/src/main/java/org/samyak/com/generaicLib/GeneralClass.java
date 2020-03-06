package org.samyak.com.generaicLib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralClass {

	public static void waitForPageToLoad(WebDriver driver){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		String state = "";
		do{
			state = (String) executor.executeScript("return document.readyState");
			System.out.println("is page loaded..................."+state);
		}while(!state.equals("complete"));
	}
	
	/**
	 * wait statement visibility of element located
	 */
	public static void explicitWait(WebElement e){
		WebDriverWait wait  = new WebDriverWait(BaseClass.driver, 10);
		wait.until(ExpectedConditions.visibilityOf(e));
		}

	
	/**
	 * wait clickable
	 */
	
	public static void explicitWaitClickable(WebElement e){
		WebDriverWait wait  = new WebDriverWait(BaseClass.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(e));

	}

	/**
	 * invisibility of element
	 */
	
	public static void explicitInVisibility(WebElement e){
		WebDriverWait wait  = new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.invisibilityOf(e));

	}
	
	/**
	 * 
	 * action class function
	 */
	public static void actionFun(WebElement e){
		Actions act = new Actions(BaseClass.driver);
		act.moveByOffset(0,20).build();
		act.perform();
		
		act.sendKeys(Keys.F5);
		
	}
	
	/**
	 * drag and drop action class L2R
	 */
	
	public static void dragAndDropL2R(WebElement e) {
		
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(e).click().dragAndDropBy(e, e.getLocation().getX()-50,0)
		.build().perform();
	}
	
	/**
	 * drag and drop action class R2L
	 */
	
	public static void dragAndDropR2L(WebElement e) {
		
		Actions act = new Actions(BaseClass.driver);
		int width = e.getSize().getWidth();
		System.out.println("...............: "+width);
		act.moveToElement(e).click().dragAndDropBy(e, e.getLocation().getX()-350,0)
		.build().perform();
	}
	
	
	
	/**
	 * 
	 * select class general methd
	 */
	
	public static void selectFun(WebElement e){
		Select sel = new Select(e);
		sel.deselectByIndex(2);
	}
	
	/*
	 * select class 
	 */
	
	public static void selectByVisibleText(WebElement e){
		Select sel = new Select(e);
		sel.selectByVisibleText("Electronics");
	}
	
}