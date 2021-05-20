package org.testing.ResponseValidation;

import io.restassured.response.Response;

public class StatusCodeValidation 
{
	public static void statusCodeMatch(int expectedStatusCode, Response res)
	{
		if(res.getStatusCode()==expectedStatusCode)//Soft Assertion
		{
			System.out.println("Status Code is matching");
		}
		
		else
		{
			System.out.println("Status Code is not matching");
		}
}
}
