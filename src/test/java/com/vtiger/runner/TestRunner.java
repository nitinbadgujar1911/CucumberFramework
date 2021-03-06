package com.vtiger.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/Features"
		,glue= {"com.vtiger.stepdefinitions"}
		//,format = {"pretty", "html:target/Destination"}
		//,plugin = {"pretty", "html:target/Destination"}
		//,plugin = { "pretty", "html:target/cucumber-reports"}
		,plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json"}
		,tags = {"@smoke"}////or
		//,tags = {"@Smoke,@sanity"},////or
		//,tags = {"@Smoke","@sanity"},////and
		//,tags = {"@Smoke","~@sanity"},////and
		//,tags = {"~@Smoke","~@sanity"},////and
		,monochrome = true
				,dryRun=false
		
		)

public class TestRunner {
	
}
