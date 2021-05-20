package org.testing.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandling;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_PutRequest 
{
	@Test
	public void testcase6() throws IOException
	{
		//String firstname=RandomStringUtils.random(6);//This is for validation multiple firstname  
		String idValue=TC2_PostRequest_RandomID.responseidValue;
		String bodyData=JsonFileHandling.JsonRead("../APIAutomationFrameworkPractice/src/test/java/org/testing/resources/DataForPut.json");
		bodyData=JsonReplacement.replaceVariable(bodyData, "id", idValue);
		//bodyData=JsonReplacement.replaceVariable(bodyData, "firstName", firstname);
		Properties pr=PropertiesHandling.ReadProperties("../APIAutomationFrameworkPractice/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.putRequest("QA_URI", idValue, bodyData);
		System.out.println("*****************************************TC6*****************************************");
		StatusCodeValidation.statusCodeMatch(200, res);
		//ResponseDataValidation.responseDataValid(firstname, "firstname", res);
		System.out.println(res.asString());
	}
	
	
}
