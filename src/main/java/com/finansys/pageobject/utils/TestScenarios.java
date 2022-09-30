package com.finansys.pageobject.utils;

public enum TestScenarios {

	T1("Account succes login"),
	T2("Account failed login one"),
	T3("Account failed login two"),
	T4("Invalid application name"),
	T5("Valid application name");

private String testName;

TestScenarios(String value) {
	testName = value;
} 

public String getTestName(){
	return testName;
}
}
