package org.jira.jira_api;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Basic8 {

	Properties pobj = new Properties();
	JSONParser parser = new JSONParser();
	FileInputStream f;
	@BeforeTest
	public String getURLData() throws IOException{
		//FileInputStream f = new FileInputStream("F:\\EclipseOxygen\\jira-api\\src\\test\\java\\files\\baseURL.properties");
		FileInputStream f = new FileInputStream(System.getProperty("user.dir")+ "\\baseURL.properties");
		pobj.load(f);
		String strurl= pobj.getProperty("HOST");
		return strurl;
	}

	@Test
	public void updateComments() throws IOException, ParseException{

		// add comment
		FileReader f = new FileReader("F:\\EclipseOxygen\\jira-api\\src\\test\\java\\files\\updatecomment.json");
		JSONObject js = (JSONObject)parser.parse(f);

		System.out.println("this addComment data : "+js.toJSONString());

		RestAssured.baseURI = getURLData();
		String updateCommentstr = ResuableMethods.getAddCommentResources(); 
		
		System.out.println("..................................");
		Response res = given().
				header("Content-Type","application/json").
				header("cookie","JSESSIONID="+ResuableMethods.getSessionKey()).
				body(js.toJSONString()).
				when().
				put("rest/api/2/issue/10009/comment/10005").
				then().statusCode(200).extract().response();

		JsonPath jsp = ResuableMethods.rawToJson(res);
		String comment = jsp.prettify();
		System.out.println("add comment response : "+comment);
		System.out.println("....................................");
		String id = jsp.get("id");
		System.out.println("id is " +id);
	}

}