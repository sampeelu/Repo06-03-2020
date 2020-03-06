package apiUtility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Apiconstants.Constants;
import groovy.json.JsonParser;
import io.restassured.response.Response;
import newMainPackage.HttpGeneral;

public class CreateEmpApi extends Constants{

	final static String fileReader = "F:\\EclipseOxygen\\REstAPIPOJO\\src\\main\\java\\requestPayload\\createEmployee.json";
	public static Object createEmpReq(String name1 ,String salary1,String age1) throws IOException, ParseException {
		FileReader f = new FileReader(fileReader);
		JSONParser parser = new JSONParser();
		JSONObject js = (JSONObject)parser.parse(f);
		js.replace("name", name1);
		js.replace("salary", salary1);
		js.replace("age",age1);
		
		return js;
		
	}
	
	public void deleteEmpoyee(int id){
		String endPoint = deleteEmp+"/"+id;
		HttpGeneral.executeDelete(baseurl, endPoint, null, null, null);
	}
	
}
