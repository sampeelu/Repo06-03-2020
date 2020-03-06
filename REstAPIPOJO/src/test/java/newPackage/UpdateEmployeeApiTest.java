package newPackage;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Apiconstants.Constants;
import apiUtility.UpdateEmpApi;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import newMainPackage.HttpGeneral;

public class UpdateEmployeeApiTest extends Constants{
	int id;
	UpdateEmpApi upEmp = new UpdateEmpApi();	
	@DataProvider
	public Object[][] getupdateData(){
		return new Object[][]{
			{"samjain","1000000","21","1"}
			
		};
	}
	
	@Test(dataProvider = "getupdateData")
	public void updateEmp(String name1,String salary1, String age1 ,int id) throws IOException, ParseException{
		Response res = HttpGeneral.executePut(baseurl,updateEmpl+"/"+id, null, null, null,
							UpdateEmpApi.updatedata(name1, salary1, age1));
	//	System.out.println(res.asString());
		JsonPath jsp = new JsonPath(res.asString());
				
	}
}
