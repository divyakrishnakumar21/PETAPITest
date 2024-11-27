package org.example.utils;
import org.example.BaseSetup;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.io.IOException;
import java.util.Map;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class APIHelpers extends BaseSetup {


	public Response get(String getBaseURL) throws IOException
	{
		//Get call
		System.out.println("\n");
		RestAssured.baseURI = getBaseURL;
		System.out.println("API call is "+getBaseURL);
		Response response= given().contentType(ContentType.JSON)
				.when().get(getBaseURL);
		System.out.println("Response code is " +response.getStatusCode());
		System.out.println("Response Body of the API call is "+response.body().asString());
		return response;
	}

	public Response getWithHeaders(String getBaseURL, Map<String,Object> list) throws IOException
	{
		//Get call
		System.out.println("\n");
		RestAssured.baseURI = getBaseURL;
		System.out.println("API call is "+getBaseURL);
		Response response= given().headers(list).contentType(ContentType.JSON)
				.when().get(getBaseURL);
		System.out.println("Response code is " +response.getStatusCode());
		System.out.println("Response Body of the API call is "+response.body().asString());
		return response;
	}


	public Response post(String postBaseURL, Map<String, Object> list) throws IOException
	{
		//Post call
		System.out.println("\n");
		Response response= given().
				contentType("application/json").
				body(list).
				when().
				post(postBaseURL);
		System.out.println("API call is "+postBaseURL);
		System.out.println("Response code is " +response.getStatusCode());
		System.out.println("Response Body of the API call is "+response.body().asString());

		return response;
	}

	public Response postWithHeaders(String postBaseURL, String jsonFilePath, Map<String,Object> list) throws IOException
	{
		//Post call
		System.out.println("\n");
		Response response= given().headers(list).
				contentType("application/json").
				body(jsonFilePath).
				when().
				post(postBaseURL);
		return response;
	}

	public Response put(String putBaseURL, Map<String, Object> list) throws IOException
	{
		//Post call
		System.out.println("\n");
		Response response= given().
				contentType("application/json").
				body(list).
				when().
				put(putBaseURL);
		System.out.println("API call is "+putBaseURL);
		System.out.println("Response code is " +response.getStatusCode());
		System.out.println("Response Body of the API call is "+response.body().asString());
		return response;
	}

	public Response putWithHeaders(String putBaseURL, String jsonFilePath, Map<String,Object> list) throws IOException
	{
		//Post call
		System.out.println("\n");
		Response response= given().headers(list).
				contentType("application/json").
				body(jsonFilePath).
				when().
				put(putBaseURL);
		System.out.println("API call is "+putBaseURL);
		System.out.println("Response code is " +response.getStatusCode());
		System.out.println("Response Body of the API call is "+response.body().asString());
		return response;
	}

	public Response patch(String patchBaseURL, String jsonFilePath) throws IOException
	{
		//Post call
		System.out.println("\n");
		Response response= given().
				contentType("application/json").
				body(jsonFilePath).
				when().
				patch(patchBaseURL);
		System.out.println("API call is "+patchBaseURL);
		System.out.println("Response code is " +response.getStatusCode());
		System.out.println("Response Body of the API call is "+response.body().asString());
		return response;
	}

	public Response patchWithHeaders(String patchBaseURL, String jsonFilePath, Map<String,Object> list) throws IOException
	{
		//Post call
		System.out.println("\n");
		Response response= given().headers(list).
				contentType("application/json").
				body(jsonFilePath).
				when().
				patch(patchBaseURL);
		System.out.println("API call is "+patchBaseURL);
		System.out.println("Response code is " +response.getStatusCode());
		System.out.println("Response Body of the API call is "+response.body().asString());
		return response;
	}
	
	public Response delete(String getBaseURL) throws IOException
	{
		//Get call
		System.out.println("\n");
		RestAssured.baseURI = getBaseURL;
		System.out.println("API call is "+getBaseURL);
		Response response= given().contentType(ContentType.JSON)
				.when().delete(getBaseURL);
		System.out.println("Response code is " +response.getStatusCode());
		System.out.println("Response Body of the API call is "+response.body().asString());
		return response;
	}
	
	
}
