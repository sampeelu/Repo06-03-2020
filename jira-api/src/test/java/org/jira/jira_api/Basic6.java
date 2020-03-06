package org.jira.jira_api;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.jira.jira_api.ResuableMethods;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Basic6 {
	
	private static Logger log = LogManager.getLogger(Basic6.class.getName());
	Properties pobj = new Properties();
	JSONParser parser = new JSONParser();
	FileInputStream f;
	
	@BeforeTest
	public String getURLData() throws IOException{
		FileInputStream f = new FileInputStream("F:\\EclipseOxygen\\jira-api\\src\\test\\java\\files\\baseURL.properties");
		pobj.load(f);
		String strurl= pobj.getProperty("HOST");
		return strurl;
	}
	
	@Test
	public void createBugTests() throws IOException, ParseException{
				
		// creating defect/issue
		FileReader f = new FileReader("F:\\EclipseOxygen\\jira-api\\src\\test\\java\\files\\createIssueData.json");
		JSONObject js = (JSONObject)parser.parse(f);
		//System.out.println("this create issue data : "+js.toJSONString());
		
		log.info("this create issue data : "+js.toJSONString());
		RestAssured.baseURI = getURLData();
		log.info("..................................");
		//System.out.println("..................................");
		Response res = given().
				header("Content-Type","application/json").
				header("cookie","JSESSIONID="+ResuableMethods.getSessionKey()).
				body(js.toJSONString()).
				when().
				post(ResuableMethods.getIssueResources()).
				then().statusCode(201).extract().response();
		System.out.println("Response:"+res.asString());
		JsonPath jsp = ResuableMethods.rawToJson(res);
		String issueREs = jsp.prettify();
		System.out.println("create issue response : "+issueREs);
		System.out.println("....................................");
		String id = jsp.get("id");
		System.out.println("id is " +id);
	}
}

