package newMainPackage;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * 
 * PostMethod
 * @author Administrator
 *
 */
public class HttpGeneral {
	//static FileReader f;
	public static Response executePost(String baseUrlcreate,
			String endpoints,
			Map<String,String> headerMap,
			Map<String,String> queryParamMap,
			Map<String,String> pathParmMap,
			Object body) throws IOException, ParseException
	{
		String url = baseUrlcreate+endpoints;
		RequestSpecification res = RestAssured.given().when().with().log().all();

		if(url !=null){
			if(headerMap !=null){
				res = res.headers(headerMap);
			}
			if(queryParamMap !=null){
				res = res.queryParams(queryParamMap);
			}
			if(pathParmMap !=null){
				res = res.pathParams(pathParmMap);
			}
			if(body!=null){
				res = res.body(body);
			}
		}

		return res.post(url);
	}

	/**
	 * 
	 * Get method
	 */
	public static Response executeGet(String BaseUrlemployees ,
			String endPointemployees,
			Map<String,String> headerMap,
			Map<String,String> queryParamMap,
			Map<String,String> pathParmMap){

		String url = BaseUrlemployees+endPointemployees;
		RequestSpecification res = RestAssured.given().when().with().log().all();
		if(url !=null){
			if(headerMap !=null){
				res = res.headers(headerMap);
			}
			if(queryParamMap !=null){
				res = res.queryParams(queryParamMap);
			}
			if(pathParmMap !=null){
				res = res.pathParams(pathParmMap);
			}
		}
		return res.get(url);
	}


	/**
	 * Delete method
	 */
	public static Response executeDelete(String BaseUrlemployees ,
			String endPointemployees,
			Map<String,String> headerMap,
			Map<String,String> queryParamMap,
			Map<String,String> pathParmMap){

		String url = BaseUrlemployees+endPointemployees;
		RequestSpecification res = RestAssured.given().when().with().log().all();
		if(url !=null){
			if(headerMap !=null){
				res = res.headers(headerMap);
			}
			if(queryParamMap !=null){
				res = res.queryParams(queryParamMap);
			}
			if(pathParmMap !=null){
				res = res.pathParams(pathParmMap);
			}
		}
		return res.delete(url);
	}

	
	/**
	 * 
	 * Update method put
	 * 
	 */
	
	public static Response executePut(String BaseUrlemployees ,
			String endPointemployees,
			Map<String,String> headerMap,
			Map<String,String> queryParamMap,
			Map<String,String> pathParmMap,
			Object body){

		String url = BaseUrlemployees+endPointemployees;
		RequestSpecification res = RestAssured.given().when().with().log().all();
		if(url !=null){
			if(headerMap !=null){
				res = res.headers(headerMap);
			}
			if(queryParamMap !=null){
				res = res.queryParams(queryParamMap);
			}
			if(pathParmMap !=null){
				res = res.pathParams(pathParmMap);
			}
			if(body !=null){
				res = res.body(body);
			}
		}
		return res.put(url);
	}
}
