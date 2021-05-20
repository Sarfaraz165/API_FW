package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_GetRequestForSingle 
{
	@Test
	public void TestCase3() throws IOException
	
	{
		Properties pr=PropertiesHandling.ReadProperties("../APIAutomationFramework/URI.properties");
		String idValueforGetRequest=TC2_PostRequest_RandomID.responseidValue;
		
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetRequestforSingleRecord("QA_URI", idValueforGetRequest);
		System.out.println("****************************TC3****************************************");
		StatusCodeValidation.statusCodeMatch(200, res);
		//ResponseDataValidation.responseDataValid("testKhan", "fistname", res); //Not executed this statement need to check
		System.out.println("The status code is "+res.statusCode());
		System.out.println("Get Response below");
		System.out.println(res.asString());
		
		
	}

}
