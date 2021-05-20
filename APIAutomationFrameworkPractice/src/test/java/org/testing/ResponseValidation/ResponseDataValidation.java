package org.testing.ResponseValidation;

import io.restassured.response.Response;

public class ResponseDataValidation 

{

	public static void responseDataValid(String expectedData,String jsonPath, Response res)
	{
		if(res.jsonPath().get(jsonPath).equals(expectedData))
		{
			System.out.println("Actual data and Expected data are Matching");
		}
		else
		{
			System.out.println("Actual data and Expected data are not Matching");
		}
	}
	
}
