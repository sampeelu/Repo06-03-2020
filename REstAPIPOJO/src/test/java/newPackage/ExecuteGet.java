package newPackage;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.gherkin.model.Given;

import Apiconstants.Constants;

import io.restassured.RestAssured;
import io.restassured.assertion.HeaderMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import newMainPackage.HttpGeneral;
import newMainPackage.Utility;

public class ExecuteGet extends Constants{

	
	final String filepath = "F:\\EclipseOxygen\\REstAPIPOJO\\src\\main\\java\\files\\BaseUrl.properties";

	@DataProvider
	public Object[][] getdata(){

		return new Object[][]{
			{"23","21100"},{"0","21321"},{"23","87675"},{"23","76889"},
			{"726357","21100"},{"91","21321"},{"9","87675"},{"659","76889"}
		};
	}

	@Test(dataProvider = "getdata")
	public void executionGetTest(String employee_age,String employee_salary) throws IOException, ParseException{
		SoftAssert softAssert = new SoftAssert();
		HashMap<String, String> headermap = new HashMap<String, String>();
		headermap.put("Content-Type", "application/json");
		HashMap<String, String> qmap = new HashMap<String, String>();
		Response res = HttpGeneral.executeGet(baseurl, 
				Utility.getProperty(filepath,"ResourcesEmployees"), headermap, null, null);
		System.out.println(res.statusCode());
		System.out.println(baseurl);

		JsonPath jsp = new JsonPath(res.asString());
	//	System.out.println(jsp.prettyPrint());
		String act= jsp.getString("[0].employee_age");
		System.out.println("valiue is "+act);
		//String exp = employee_age;

		String actsalary = jsp.getString("[0].employee_salary");
		List<String> lst = jsp.getList("employee_age");
		
		System.out.println("-------------------------------------"+lst.size());
		for(String str : lst){
			System.out.println("-------------"+employee_age);
			softAssert.assertEquals(str, employee_age);
		}
	//	String expSalary = employee_salary;
	//	softAssert.assertEquals(act, exp);
	//	softAssert.assertEquals(actsalary, expSalary);
		

		// read json file
		
		/*System.out.println("iterator..................");
		 JSONParser parser = new JSONParser();
		 JSONObject jsonObject = (JSONObject) parser.parse(jsp.get().toString());
		 JSONArray age = (JSONArray) jsonObject.get("");
		 Iterator<String> iterator = age.iterator();
         while (iterator.hasNext()) {
             System.out.println(iterator.next());
         }*/
         
         /*
		JSONArray[] emp = res.jsonPath().getObject("emp",JSONArray[].class );

		for(JSONArray emp1 : emp)
		{
			System.out.println("employees title " + emp1.toString());
		}*/
         
         softAssert.assertAll();
         
         	}
}
