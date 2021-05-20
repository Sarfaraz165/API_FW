package org.testing.TestSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods 

{
	Properties pr;
	public HTTPMethods(Properties pr) 
	{
		this.pr=pr;
	}
	public Response PostRequest(String body,String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty(uriKey));
		return res;
		
	}
	
	public Response GetRequestforSingleRecord(String urikey, String idValue)
	{
		String uri=pr.getProperty(urikey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
	}
	
	public Response GetRequestforAllRecord(String urikey)
	{
		String uri=pr.getProperty(urikey);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
	}
	
	public Response GetRequestforAllRecordsIds(String urikey)
	{
		String uri=pr.getProperty(urikey);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
	}
	
	public Response putRequest(String uriKey,String idValue,String bodyData)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.put(uri);
		
		return res;
			
	}
	
	public Response deleteRequest(String uriKey,String idValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete();
		
		return res;
	}
	

}
