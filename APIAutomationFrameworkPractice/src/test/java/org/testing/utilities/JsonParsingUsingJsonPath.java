package org.testing.utilities;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath 
{
	public static String ParseJson(Response res, String jsonPath)
	{
		return res.jsonPath().get(jsonPath).toString();
	}

}
