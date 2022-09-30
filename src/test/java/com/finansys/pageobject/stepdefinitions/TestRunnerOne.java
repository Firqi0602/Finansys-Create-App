package com.finansys.pageobject.stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/1.LoginAccount.feature",
						"src/test/resources/features/2.CreateApp.feature"},
				glue = "com.finansys.pageobject.stepdefinitions",
				plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})
				
public class TestRunnerOne extends AbstractTestNGCucumberTests {
}


 
