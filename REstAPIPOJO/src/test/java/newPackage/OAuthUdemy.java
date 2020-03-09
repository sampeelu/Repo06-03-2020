package newPackage;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import pojoUdemy.API;
import pojoUdemy.GetCourses;
import pojoUdemy.WebAutomation;


public class OAuthUdemy {

	@Test
	public static void authentication() throws InterruptedException{

		String []courseTitle = {"Selenium Webdriver Java","Cypress","Protractor"};
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseOxygen\\REstAPIPOJO\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyfjdss");
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("modisam26@gmail.com");
		driver.findElement(By.cssSelector("[type='email']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("Peelu@26");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String partialcode=url.split("code=")[1];
		String code=partialcode.split("&scope")[0];
		System.out.println("partial code is code=[1] : "+partialcode);
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


		// converting json response into java object
				GetCourses gc =    given().contentType("application/json")
						.queryParams("access_token", accessToken).expect().defaultParser(Parser.JSON)
						.when()
						.get("https://rahulshettyacademy.com/getCourse.php").as(GetCourses.class);
				System.out.println("linkedin profile --> "+gc.getLinkedIn());
				System.out.println("instructor :"+gc.getInstructor());
				System.out.println("api course title :"+gc.getCourses().getApi().get(0).getCourseTitle());

		List<API> apiCourses = gc.getCourses().getApi();
		System.out.println("api size :" +apiCourses.size());
		for(int i=0;i<=apiCourses.size()-1;i++){
			if(apiCourses.get(i).getCourseTitle().equals("Rest Assured Automation using Java"))
			System.out.println(apiCourses.get(i).getPrice());
			
		}
		
		List<WebAutomation> web = gc.getCourses().getWebAutomation();
		System.out.println(web.size());
		
		for(int i =0;i<web.size();i++){
			if(web.get(i).getPrice().equals("50"))
			System.out.println("web :"+web.get(i).getCourseTitle());
			
		}
		// validation
		ArrayList<String> a = new ArrayList<String>();
		List<WebAutomation> weblist = gc.getCourses().getWebAutomation();
		for(int i=0;i<weblist.size();i++){
			a.add(weblist.get(i).getCourseTitle());
		}
		String[] exp_courseTitle = {"Selenium Webdriver Java","Cypress","Protractor"};
		List<String> expList = Arrays.asList(exp_courseTitle);
		Assert.assertEquals(a, expList);
		
		driver.quit();
	
	}
}
