package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_GetRequestForAll 
{
	@Test
	public void TestCase4() throws IOException
	{
		Properties pr=PropertiesHandling.ReadProperties("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetRequestforAllRecord("QA_URI");
		System.out.println("==================TC4=======================================");
		StatusCodeValidation.statusCodeMatch(200, res);
		//ResponseDataValidation.responseDataValid("testKhan", "fistname", res);  //Not executed this statement need to check
		System.out.println("Status code is "+res.statusCode());
		System.out.println("*****See All the Response below****** "+res.asString());
		
		
	}

}
