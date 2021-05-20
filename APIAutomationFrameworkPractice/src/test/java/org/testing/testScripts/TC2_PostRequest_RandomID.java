package org.testing.testScripts;


import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandling;
import org.testing.utilities.JsonParsingUsingJsonPath;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandling;
import org.testing.utilities.RandomClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class TC2_PostRequest_RandomID 

{ 
	static String responseidValue;
	@Test
	public void Testcase2() throws IOException 
	{
		//Random r=new Random();
		//Integer idValue=r.nextInt();
		Integer Randomid=RandomClass.RandomId();
		String bodyData=JsonFileHandling.JsonRead("../APIAutomationFrameworkPractice/src/test/java/org/testing/resources/ReplaceBodyData.json");
		bodyData=JsonReplacement.replaceVariable(bodyData,"id",Randomid.toString());
		Properties pr=PropertiesHandling.ReadProperties("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PostRequest(bodyData, "QA_URI");
		System.out.println("**********************TC2***************************************");
		System.out.println("Status code is "+res.statusCode());
		StatusCodeValidation.statusCodeMatch(201, res);
		responseidValue=JsonParsingUsingJsonPath.ParseJson(res,"id");
		
		
	
	}
}
