package newMainPackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class Utility {
	static FileInputStream f;
	static Properties pobj ;
	public static JsonPath rawToJson(Response r)
	{ 
		String respon=r.asString();
		JsonPath js=new JsonPath(respon);
		System.out.println(js.prettyPrint());
		return js;
	}
	
	public static XmlPath rawToXML(Response r)
	{
		String respon=r.asString();
		XmlPath x=new XmlPath(respon);
		return x;
	}
	
	public static String getProperty(String filePath, String key) throws IOException{
		
		f = new FileInputStream(filePath);
		pobj = new Properties();
		pobj.load(f);
		return pobj.getProperty(key);
		
	}
	
}
