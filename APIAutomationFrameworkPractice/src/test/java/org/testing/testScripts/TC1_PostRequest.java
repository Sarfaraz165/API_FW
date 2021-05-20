package org.testing.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandling;
import org.testing.utilities.PropertiesHandling;

import io.restassured.response.Response;

public class TC1_PostRequest 
{
	public static void main(String[] args) throws IOException 
	{
		String bodyData=JsonFileHandling.JsonRead("../API_AUTOMATION_FRAMEWORK_PRACTICE/src/test/java/org/testing/resources/BodyData.json");
		Properties pr=PropertiesHandling.ReadProperties("../API_AUTOMATION_FRAMEWORK_PRACTICE/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.PostRequest(bodyData, "QA_URI");
		//System.out.println("The Status code is"+res.);
		System.out.println();
		
	}

}
