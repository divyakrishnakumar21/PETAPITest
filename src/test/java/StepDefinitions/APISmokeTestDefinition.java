package StepDefinitions;

import java.io.IOException;

import org.example.module.api.API_Data;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class APISmokeTestDefinition {
	
	API_Data apiData = new API_Data();
	
	@Given("I create a new PET with name {string} and type {string} and age {int}")
	public void createNewPET(String petName, String petType, Integer age) throws IOException {
	 apiData.createNewPET(petName, petType, age);
	}

	@Then("I check if the PET with name {string} has been added into the list of Pets")
	public void validateAddedPET(String petName) {
	
	}

	@When("Update the PET {string} with age {int}")
	public void updatePETAge(String petName, Integer age) {
	
	}

	@Then("validate if the PET with name {string} has its age updated to {int}")
	public void validateUpdatedPET(String petName, Integer age) {
	
	}

	@When("I delete the pet with name {string}")
	public void deletePET(String petName) {

	}

	@Then("I validate if the pet with name {string} has been deleted")
	public void validateDeletedPET(String petName) {
	 
	}

}