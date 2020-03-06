package org.jira.jira_api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import requestPayload.API;
import requestPayload.GetCourses;
import requestPayload.WebAutomation;

public class OAuth {
	private static Logger log = LogManager.getLogger(OAuth.class.getName());
	@Test
	public static void authentication() throws InterruptedException{
		
		String []courseTitle = {"Selenium Webdriver Java","Cypress","Protractor"};
		System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyfjdss");
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("peelujain@gmail.com");
		driver.findElement(By.cssSelector("[type='email']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("peelujain@26");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String partialcode=url.split("code=")[1];
		String code=partialcode.split("&scope")[0];
		System.out.println(code);
		String response =
				given() 
				.urlEncodingEnabled(false)
				.queryParams("code",code)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("grant_type", "authorization_code")
				.queryParams("state", "verifyfjdss")
				.queryParams("session_state", "ff4a89d1f7011eb34eef8cf02ce4353316d9744b..7eb8")
				//.queryParam("scope", "email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.when().log().all()
				.post("https://www.googleapis.com/oauth2/v4/token").asString();
		// System.out.println(response);
		JsonPath jsonPath = new JsonPath(response);
		String accessToken = jsonPath.getString("access_token");
		System.out.println(accessToken);


		/*	String r2=    given().contentType("application/json").
				queryParams("access_token", accessToken).expect().defaultParser(Parser.JSON)
				.when()
				.get("https://rahulshettyacademy.com/getCourse.php").asString();
		System.out.println(r2);

		 */

		// converting json response into java object
		GetCourses gc =    given().contentType("application/json").
				queryParams("access_token", accessToken).expect().defaultParser(Parser.JSON)
				.when()
				.get("https://rahulshettyacademy.com/getCourse.php").as(GetCourses.class);
		System.out.println("linkedin profile --> "+gc.getLinkedIn());
		System.out.println(gc.getInstructor());
		System.out.println(gc.getCourses().getApi().get(0).getCourseTitle());
		List<API> apiCourses = gc.getCourses().getApi();
		for(int i=0;i<apiCourses.size();i++){
			if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("Rest Assured Automation using Java")){
				System.out.println(apiCourses.get(i).getPrice());
			}
		}
		List<WebAutomation> web_Automation= gc.getCourses().getWebAutomation();
		for(int i = 0;i<web_Automation.size();i++){
			
			if(web_Automation.get(i).getCourseTitle().equalsIgnoreCase("Selenium Webdriver Java")){
				System.out.println("web_automation--> "+ web_Automation.get(i).getPrice());
			}
		}
		//Get the course names of WebAutomation
		ArrayList<String> a = new ArrayList<String>();
		List<WebAutomation> w = gc.getCourses().getWebAutomation();
		for(int i=0;i<w.size();i++){
			a.add(w.get(i).getCourseTitle());
		}
		List<String> expectedList = Arrays.asList(courseTitle);
		Assert.assertTrue(a.equals(expectedList));
	}
}
