package newPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.google.gson.JsonObject;
import groovy.json.JsonParser;
import io.restassured.parsing.Parser;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import newMainPackage.Utility;

public class POSTREq {
	
	static FileReader f ;
	Properties pobj=new Properties();
	FileInputStream fis;
	JSONParser parser = new JSONParser();
			
	
	@DataProvider
	public static Object[][] postData(){
		return new Object[][]{
			{"morpheus","leader"},
			{"sam","business"},
			{"peelu","BA"}
		};
	}
	
	@BeforeTest
	public String getbaseurl() throws IOException{
		FileInputStream fis = new FileInputStream("F:\\EclipseOxygen\\REstAPIPOJO\\src\\main\\java\\files\\BaseUrl.properties");
		
		pobj.load(fis);
		String baseUrl = pobj.getProperty("BASEURL");
		System.out.println("..............................................");
		System.out.println("this is base url : "+baseUrl);
		return baseUrl;
	
	}	

	public String getResources() throws IOException{
		fis = new FileInputStream("F:\\EclipseOxygen\\REstAPIPOJO\\src\\main\\java\\files\\Resources.properties");
		pobj.load(fis);
		String resource = pobj.getProperty("RESOURCES");
		System.out.println("this is resources url : "+resource);
		return resource;
	
	}	

	//@Test(dataProvider="postData")
	public void executePostReq(String name1,String job1) throws IOException, ParseException{
		// this for validation
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("name",name1);
		m.put("job", job1);
		System.out.println("map :"+m);
		// this for update the value in json PAYLOAD
	 f = new FileReader("F:\\EclipseOxygen\\REstAPIPOJO\\src\\main\\java\\requestPayload\\postREq.json");
		JSONObject js = (JSONObject)parser.parse(f);
		js.replace("name",name1);
		js.replace("job",job1);
	// System.out.println(js.toJSONString());
				
		RestAssured.baseURI = getbaseurl(); 
Response res = given().
		header("Content-Type","application/json").
		body(js.toJSONString()).
		when().
		post(getResources()).
		then().
		statusCode(201).and().extract().response();
	JsonPath jsp = 	Utility.rawToJson(res);
	System.out.println(jsp.prettify());
	}
	
	@DataProvider
	public Object[][] test2(){
		return new Object[][]{
			{"test1","test2",""}
		};
	}
	
	@Test(dataProvider="test2")
	public void test(String name1,String job1,String student) throws IOException, ParseException{
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("name",name1);
		m.put("job", job1);
		System.out.println("map :"+m);
		// this for update the value in json PAYLOAD
	 f = new FileReader("F:\\EclipseOxygen\\REstAPIPOJO\\src\\main\\java\\requestPayload\\postREq.json");
		JSONObject js = (JSONObject)parser.parse(f);
		js.replace("name",name1);
		js.replace("job",job1);
	// System.out.println(js.toJSONString());
				
		RestAssured.baseURI = getbaseurl(); 
Response res = given().
		header("Content-Type","application/json").
		body(js.toJSONString()).
		when().
		post(getResources());
	String str = res.asString();
	Assert.assertEquals(str, student);
	System.out.println(str);
	}
}
