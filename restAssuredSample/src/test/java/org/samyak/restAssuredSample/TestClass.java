package org.samyak.restAssuredSample;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import responsePayload.*;

public class TestClass {
	
	SoftAssert softAssert = new SoftAssert();
	@DataProvider
	public Object[][] responseValidation(){
		return new Object[][]{
			{"Tiger Nixon","320800","61"}
			/*{"Caesar Vance","106450","21"},
			{"Yuri Berry","675000","40"}*/
		};
	}
	
	@Test(dataProvider="responseValidation")
	public void getEmployees(String employee_name,String employee_salary,String employee_age){
		Map<String,String> hm = new HashMap<String, String>();
		hm.put("Content-Type", "application/json");
	
		Response res = GeneralUtility.executeGET(hm, null, APIConstant.getEmpEndPoint);
		// print the response
		System.out.println("..................."+res.asString());
		
		// validate the response
		JsonPath jsp = new JsonPath(res.asString());
		String response = jsp.toString();
	
		Data d = given().expect().defaultParser(Parser.JSON)
				.when()
				.get(APIConstant.baseUrl+""+APIConstant.getEmpEndPoint).as(Data.class);
		System.out.println("=============: "+d.getEmployee_age());
		
		//System.out.println(jsp.get("data.employee_age"));
		/*List<String> lst = jsp.getList("data[0]");*/
		/*
		String act1 = jsp.get("data[0].employee_name");
		String act2 = jsp.get("data[0].employee_salary");
		String act = jsp.get("data[0].employee_age");
		softAssert.assertEquals(act, employee_age);
		softAssert.assertEquals(act1, employee_name);
		softAssert.assertEquals(act2, employee_salary);
		*/
			//	softAssert.assertAll();
	}

}
