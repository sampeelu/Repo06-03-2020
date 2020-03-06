package org.jira.jira_api;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ResuableMethods {


	public static XmlPath rawToXML(Response r)
	{
		String respon=r.asString();
		XmlPath x=new XmlPath(respon);
		return x;
	}

	public static JsonPath rawToJson(Response r)
	{ 
		String respon=r.asString();
		JsonPath x=new JsonPath(respon);
		return x;
	}

	public static String getSessionKey() throws IOException, ParseException{
		
		JSONParser parser = new JSONParser();
		FileReader fis = new FileReader("F:\\EclipseOxygen\\jira-api\\src\\test\\java\\files\\loginData.json");
		JSONObject js = (JSONObject)parser.parse(fis);
		// creating session
		RestAssured.baseURI = "http://localhost:8080/";
		Response res = given().
				header("Content-Type","application/json").
				body(js.toJSONString()).
				when().
				post("rest/auth/1/session").
				then().
				statusCode(200).and().extract().response();
		JsonPath jspth = rawToJson(res);
		String sessionidres = jspth.prettify();
		//System.out.println(sessionidres);
		String sessionid = jspth.get("session.value");
		System.out.println("login session data is : "+sessionid);
		return sessionid;
	}
	
	public static String getIssueResources() throws IOException{
		FileInputStream f = new FileInputStream("F:\\EclipseOxygen\\jira-api\\src\\test\\java\\files\\Resources.properties");
		Properties pobj = new Properties();
		pobj.load(f);
		String issueResources = pobj.getProperty("createIssue");
		return issueResources;
	}
	
	public static String getAddCommentResources() throws IOException{
		FileInputStream f = new FileInputStream("F:\\EclipseOxygen\\jira-api\\src\\test\\java\\files\\Resources.properties");
		Properties pobj = new Properties();
		pobj.load(f);
		String addcomment = pobj.getProperty("addomment");
		return addcomment;
		
	}
	
	/**
	 *validation generall function
	 */
	
	public static void validationFun(Response res,HashMap<String,String> m){
		for(Map.Entry<String,String> expectedMap : m.entrySet() ){
			String expected = expectedMap.getValue();
			String actREs = res.jsonPath().get(expectedMap.getKey());
			Assert.assertEquals(actREs, expected);
		}
	}
}