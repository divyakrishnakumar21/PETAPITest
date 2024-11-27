@APITests
Feature: Test Pet creation API


  @APITest1 
  Scenario: As a user I create a new PET
    Given I create a new PET with name 'dog' and type 'hound' and age 3
    Then I check if the PET with name 'dog' has been added into the list of Pets
  
  @APITest2
  Scenario: As a user I create a new PET and modify its age
    Given I create a new PET with name 'dog1' and type 'hound1' and age 3
    Then I check if the PET with name 'dog1' has been added into the list of Pets
    When Update the PET 'dog1' with age 4
    Then validate if the PET with name 'dog' has its age updated to 4
 
   @APITest3
  Scenario Outline: As a user I create a new PET 
    Given I create a new PET with name '<name>' and type '<type>' and age <age>
    Then I check if the PET with name '<name>' has been added into the list of Pets
    
    Examples:
    
    | name | type | age |
    | dog2 | hound2 | 4 |
    | cat| tiger | 5 |
    | snake | reptile | 25 |
    | rabbit | white | 1 |
  
  @APITest4 
  Scenario: As a user I create a new PET and delete it
    Given I create a new PET with name 'dog3' and type 'hound3' and age 3
    Then I check if the PET with name 'dog' has been added into the list of Pets
    When I delete the pet with name 'dog3'
    Then I validate if the pet with name 'dog3' has been deleted
  

