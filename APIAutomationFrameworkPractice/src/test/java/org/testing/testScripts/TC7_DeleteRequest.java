package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC7_DeleteRequest 
{

	@Test(enabled=false)
	public void testCase7() throws IOException
	{
		
		Properties pr=PropertiesHandling.ReadProperties("../APIAutomationFrameworkPractice/URI.properties");
		String IdValueforDeleteRequest=TC2_PostRequest_RandomID.responseidValue;
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.deleteRequest("QA_URI", IdValueforDeleteRequest);
		System.out.println("******************************TC7**********************************************");
		StatusCodeValidation.statusCodeMatch(200, res);
		System.out.println(res.asString());
		
		
		
		
		
		
		
		
	}
	
		
		
	
}
