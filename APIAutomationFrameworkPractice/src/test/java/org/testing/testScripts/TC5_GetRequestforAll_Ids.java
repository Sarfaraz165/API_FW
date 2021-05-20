package org.testing.testScripts;

import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseData;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_GetRequestforAll_Ids 
{

	@Test
	public void testcase5() throws IOException
	{
	
	Properties pr=PropertiesHandling.ReadProperties("../APIAutomationFrameworkPractice/URI.properties");
	HTTPMethods http=new HTTPMethods(pr);
	Response res=http.GetRequestforAllRecordsIds("QA_URI");
	System.out.println("******************************TC5***********************************");
	StatusCodeValidation.statusCodeMatch(200, res);
	//ResponseDataValidation.responseDataValid("testKhan", "fistname", res); //Not executed this statement need to check
	System.out.println("Status code is for getRequest "+res.statusCode());
	System.out.println("***************See All the xtracted ids below******************************");
	//JsonParsingUsingOrgJson.extractJson(res.asString(), "id");//As per the first logic of Orgjson utility
	HashSet<String>allids=JsonParsingUsingOrgJson.extractJson(res.asString(), "id"); //As per the Second logic of Orgjson utility
	ResponseData.Response(allids, "1723583016");
	System.out.println(allids);
	
	
	}
}
