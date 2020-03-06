package newPackage;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Apiconstants.Constants;
import apiUtility.CreateEmpApi;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import newMainPackage.HttpGeneral;

public class CreateEmployeeTest extends Constants{
	int id;
	final String file_reader = "F:\\EclipseOxygen\\REstAPIPOJO\\src\\main\\java\\requestPayload\\createEmployee.json";
	CreateEmpApi createApi = new CreateEmpApi();
	@DataProvider
	public Object[][] getData(){
		return new Object[][]{
			{"test14","123","23"},
			{"test15","124","24"},
			{"test16","125","25"},
			{"test17","126","26"}

		};
	}

	@Test(dataProvider = "getData")
	public void createEmplTest(String name1, String salary1 , String age1) throws IOException, ParseException{

		Response res = HttpGeneral.executePost(
				baseurl,
				createEmpEndPoint, null, null, null, 
				CreateEmpApi.createEmpReq(name1, salary1, age1) );

		System.out.println(res.asString());
		JsonPath jsp = new JsonPath(res.asString());
		String act = jsp.getString("name");
		id = jsp.getInt("id");
		String expect = name1;
		Assert.assertEquals(act, expect);
		
	} 

	@AfterMethod
	public void resetData(){
		System.out.println("deleting record for id ........................."+id);
		createApi.deleteEmpoyee(id);
	}
}
