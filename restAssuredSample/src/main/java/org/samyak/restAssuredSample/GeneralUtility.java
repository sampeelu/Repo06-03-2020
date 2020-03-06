package org.samyak.restAssuredSample;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GeneralUtility extends APIConstant{
	
	public static Response executeGET(Map<String , String> headerMap ,
			Map<String , String> queryParamMap,
			String endPoint) {
		RestAssured.baseURI= baseUrl;
		RequestSpecification res = RestAssured.given();
		
		if(headerMap != null)
			res.headers(headerMap);
		if(queryParamMap != null)
			res.queryParameters(queryParamMap);
		return res.get(endPoint);		
		
	}

}
