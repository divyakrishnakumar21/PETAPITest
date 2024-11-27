$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/APITests.feature");
formatter.feature({
  "name": "Test all Journey planner API",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@APITests"
    }
  ]
});
formatter.scenario({
  "name": "As a user I create a new PET",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@APITests"
    },
    {
      "name": "@APITest1"
    }
  ]
});
formatter.step({
  "name": "I create a new PET with name \u0027dog\u0027 and type \u0027hound\u0027 and age 3",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.createNewPET(java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check if the PET with name \u0027dog\u0027 has been added into the list of Pets",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.validateAddedPET(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user I create a new PET and modify its age",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@APITests"
    },
    {
      "name": "@APITest2"
    }
  ]
});
formatter.step({
  "name": "I create a new PET with name \u0027dog1\u0027 and type \u0027hound1\u0027 and age 3",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.createNewPET(java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check if the PET with name \u0027dog1\u0027 has been added into the list of Pets",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.validateAddedPET(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Update the PET \u0027dog1\u0027 with age 4",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.updatePETAge(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate if the PET with name \u0027dog\u0027 has its age updated to 4",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.validateUpdatedPET(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "As a user I create a new PET",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@APITest3"
    }
  ]
});
formatter.step({
  "name": "I create a new PET with name \u0027\u003cname\u003e\u0027 and type \u0027\u003ctype\u003e\u0027 and age \u003cage\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I check if the PET with name \u0027\u003cname\u003e\u0027 has been added into the list of Pets",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "type",
        "age"
      ]
    },
    {
      "cells": [
        "dog2",
        "hound2",
        "4"
      ]
    },
    {
      "cells": [
        "cat",
        "tiger",
        "5"
      ]
    },
    {
      "cells": [
        "snake",
        "reptile",
        "25"
      ]
    },
    {
      "cells": [
        "rabbit",
        "white",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a user I create a new PET",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@APITests"
    },
    {
      "name": "@APITest3"
    }
  ]
});
formatter.step({
  "name": "I create a new PET with name \u0027dog2\u0027 and type \u0027hound2\u0027 and age 4",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.createNewPET(java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check if the PET with name \u0027dog2\u0027 has been added into the list of Pets",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.validateAddedPET(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user I create a new PET",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@APITests"
    },
    {
      "name": "@APITest3"
    }
  ]
});
formatter.step({
  "name": "I create a new PET with name \u0027cat\u0027 and type \u0027tiger\u0027 and age 5",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.createNewPET(java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check if the PET with name \u0027cat\u0027 has been added into the list of Pets",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.validateAddedPET(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user I create a new PET",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@APITests"
    },
    {
      "name": "@APITest3"
    }
  ]
});
formatter.step({
  "name": "I create a new PET with name \u0027snake\u0027 and type \u0027reptile\u0027 and age 25",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.createNewPET(java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check if the PET with name \u0027snake\u0027 has been added into the list of Pets",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.validateAddedPET(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user I create a new PET",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@APITests"
    },
    {
      "name": "@APITest3"
    }
  ]
});
formatter.step({
  "name": "I create a new PET with name \u0027rabbit\u0027 and type \u0027white\u0027 and age 1",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.createNewPET(java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check if the PET with name \u0027rabbit\u0027 has been added into the list of Pets",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.validateAddedPET(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user I create a new PET and delete it",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@APITests"
    },
    {
      "name": "@APITest4"
    }
  ]
});
formatter.step({
  "name": "I create a new PET with name \u0027dog3\u0027 and type \u0027hound3\u0027 and age 3",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.createNewPET(java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check if the PET with name \u0027dog3\u0027 has been added into the list of Pets",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.validateAddedPET(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete the pet with name \u0027dog3\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.deletePET(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate if the pet with name \u0027dog3\u0027 has been deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.APISmokeTestDefinition.validateDeletedPET(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});