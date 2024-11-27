package org.example.module.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.BaseSetup;
import org.junit.jupiter.api.Assertions;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;



public class API_Data extends BaseSetup {
	
	static int petID = 0;
	
	public void createNewPET(String petName, String petType, Integer age) throws IOException
	{
		Map<String, Object> requestParams = new HashMap<String, Object>(); 
		requestParams.put("name", petName);
		requestParams.put("type", petType);
		requestParams.put("age", age);
		System.out.println("URL is "+ baseURL + "/pet");
		Response response = apiHelpers.post(baseURL + "/pet", requestParams);
		
		//validation of status code
        response.then().assertThat().statusCode(201);
        
      petID =  response.jsonPath().getInt("id");
      System.out.println("Pet has been successfully created with ID "+petID);
			
		
	}
	
	public void validatePETAddOrDelete(String petName, boolean status) throws IOException
	{
		Response response = apiHelpers.get(baseURL + "/pet");
		
		System.out.println("URL is "+ baseURL + "/pet");
		
		//validation of status code
        response.then().assertThat().statusCode(200);

		String bodyAsString = response.getBody().asString();
		Assertions.assertEquals(bodyAsString.contains(petName), status);			  
		
	}
	
	
	public void updatePETAge(String petName, String petType, Integer age) throws IOException
	{
		
		Map<String, Object> requestParams = new HashMap<String, Object>(); 
		requestParams.put("id", petID);
		requestParams.put("name", petName);
		requestParams.put("type", petType);
		requestParams.put("age", age);
		Response response = apiHelpers.put(baseURL + "/pet", requestParams);
		
		//validation of status code
        response.then().assertThat().statusCode(200);
        System.out.println("Age is "+response.jsonPath().getString("age"));
        
        Assertions.assertEquals(String.valueOf(age), response.jsonPath().getString("age"));		  
		
	}
	
	public void deletePetbyID(String petName) throws IOException
	{
		
		Response response = apiHelpers.delete(baseURL + "/pet/" +petID);
		
		//validation of status code
        response.then().assertThat().statusCode(202);
        
        Assertions.assertEquals("success", response.jsonPath().getString("type"));	
        Assertions.assertEquals("Pet with id '"+petID+"' was deleted.", response.jsonPath().getString("message"));	
		
	}

}
