package apiUtility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Apiconstants.Constants;
import newMainPackage.HttpGeneral;
import newPackage.CreateEmployeeTest;

public class UpdateEmpApi extends Constants{
		
	
	final static String f = "F:\\EclipseOxygen\\REstAPIPOJO\\src\\main\\java\\requestPayload\\updateEmployee.json"; 

	public static Object updatedata(String name1,String salary1, String age1) throws IOException, ParseException {
		FileReader fis = new FileReader(f);
		JSONParser jsp = new JSONParser();
		JSONObject js = (JSONObject)jsp.parse(fis);

		if(name1 != null){
			js.replace("name",name1);
		}
		if(salary1 != null){
			js.replace("salary",salary1);
		}
		if(age1 != null){
			js.replace("age",age1);
		}
		
		
		return js;
	}
}
