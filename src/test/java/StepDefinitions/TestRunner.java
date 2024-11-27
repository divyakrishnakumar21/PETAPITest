package StepDefinitions;

import org.example.BaseSetup;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/**
 * This class main configuration for cucumber BDD setup
 * Unique tag name to run cases can be given here
 * Also, reports to be generated along with other cucumber project options are given here
 * 
 * @return null
 */

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources",glue = {"StepDefinitions"},
monochrome = true,strict = true,
plugin = {"pretty" , "html:target/HtmlReports",
		"json:target/JsonReports/report.json",
		"junit:target/JunitReports/report.xml"},
tags="@APITests")
public class TestRunner extends BaseSetup{


}
