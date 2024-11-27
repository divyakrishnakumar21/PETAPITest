package org.example.module.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.example.BaseSetup;

import io.restassured.response.Response;


public class API_Data extends BaseSetup {
	
	static int petID = 0;
	
	public void createNewPET(String petName, String petType, Integer age) throws IOException
	{
		Map<String, Object> requestParams = new HashMap<String, Object>(); 
		requestParams.put("name", petName);
		requestParams.put("type", petType);
		requestParams.put("age", age);
		
		Response response = apiHelpers.post(petType, requestParams);
		
		//validation of status code
        response.then().assertThat().statusCode(201);
        
      petID =  response.jsonPath().getInt("id");
      System.out.println("Pet has been successfully created with ID "+petID);
			
		
	}
	
	public void validateNewAddedPet(String petName)
	{
		
	}

}
