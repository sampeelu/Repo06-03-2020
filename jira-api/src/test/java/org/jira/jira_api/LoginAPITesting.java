package org.jira.jira_api;

import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.jira.jira_api.ResuableMethods;
import org.json.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LoginAPITesting {	
	Properties pobj = new Properties();
	JSONParser parser = new JSONParser();
	FileInputStream f;

	@DataProvider
	public Object[][] getloginData(){
		return new Object[][]{
			{"peelujain","peelu@123","JSESSIONID","null","null","200"},
			{"bhjgjbj","peelu@123","null","errorMessages=[Login failed]","null","401"},
			{"peelujain","uyghhvh","null","Login failed","null","400"},
			{"peelujain","","null","Login failed","null","400"},
			{"","peelu@123","null","Login failed","null","400"},
			{"","","null","Login failed","null","400"}
		};
	}
	@BeforeTest
	public String getURLData() throws IOException{
		FileInputStream f = new FileInputStream("F:\\EclipseOxygen\\jira-api\\src\\test\\java\\files\\baseURL.properties");
		Properties pobj = new Properties();
		pobj.load(f);
		String strurl= pobj.getProperty("HOST");
		return strurl;
	}

	public String getResources() throws IOException{
		FileInputStream f = new FileInputStream("F:\\EclipseOxygen\\jira-api\\src\\test\\java\\files\\Resources.properties");
		pobj.load(f);
		String strurl= pobj.getProperty("session");
		return strurl;
	}

	@Test(dataProvider="getloginData")
	public void createBugTests(String username,String password,String name,String errorMessages,String error,String statuscode) throws IOException, ParseException{

		// test ouptut map for response verify
		HashMap<String ,String> m = new HashMap<String ,String>();
		if(!name.equals("null"))
			m.put("session.name", name);
		if(!errorMessages.equals("null")){
			m.put("errorMessages", errorMessages);
		}
		if(!error.equals("null")){
			m.put("errors", error);
		}

		// creating defect/issue
		FileReader f = new FileReader("F:\\EclipseOxygen\\jira-api\\src\\test\\java\\files\\loginData.json");
		JSONObject js = (JSONObject)parser.parse(f);
		js.replace("username",username );
		js.replace("password",password );
		System.out.println("this create issue data : "+js.toJSONString());

		RestAssured.baseURI = getURLData();
		//System.out.println("resuable methods issue resources : "+ResuableMethods.getIssueResources());
		//System.out.println("this is session key : "+ResuableMethods.getSessionKey());
		System.out.println("..................................");
		Response res = given().
				header("Content-Type","application/json").
				body(js.toJSONString()).
				when().
				post(getResources()).
				then().
				statusCode(Integer.parseInt(statuscode)).and().extract().response();
		System.out.println("Response:"+res.asString());
		JsonPath jsp = ResuableMethods.rawToJson(res);
		String issueREs = jsp.prettify();
		System.out.println("login response : "+issueREs);

		System.out.println("....................................");
		ResuableMethods.validationFun(res, m);
	}
}