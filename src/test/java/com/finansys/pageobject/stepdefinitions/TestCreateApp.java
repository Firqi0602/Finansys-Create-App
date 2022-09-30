package com.finansys.pageobject.stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.finansys.pageobject.drivers.DriverSingleton;
import com.finansys.pageobject.pages.CreateApp;
import com.finansys.pageobject.pages.LoginAccountCucumber;
import com.finansys.pageobject.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCreateApp {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private LoginAccountCucumber loginAccountCucumber = new LoginAccountCucumber();
	private CreateApp createApp = new CreateApp();
	
	public TestCreateApp() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}

	@When("Go to Web finansysapps 1")
	public void Go_to_Web_finansysapps_1() {
	//	driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Go to Web finansysapps 1");
	}
	
	@And("User enter email valid password invalid 1")
	public void User_enter_email_valid_password_invalid_1() {
		loginAccountCucumber.login("system", "Password");
		extentTest.log(LogStatus.PASS, "User enter email valid password invalid 1");
	}
	
	@And("User press button signin 1")
	public void User_press_button_signin_1() {
		loginAccountCucumber.btnSignin();
		extentTest.log(LogStatus.PASS, "User press button signin 1");
	}
	
	@Then("Popup invalid password 1")
	public void Popup_invalid_password_1() {
		assertEquals(loginAccountCucumber.msgInvalidPassword(), "Invalid Password");
		extentTest.log(LogStatus.PASS, "Popup invalid password 1");
	}
	@When("Go to Web finansysapps 2")
	public void Go_to_Web_finansysapps_2() {
	//	driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Go to Web finansysapps 2");
	}
	
	@And("User enter email invalid password valid 2")
	public void User_enter_email_invalid_password_valid_2() {
		loginAccountCucumber.login("systemm", "P@ssw0rd123#");
		extentTest.log(LogStatus.PASS, "User enter email invalid password valid 2");
	}
	 
	@And("User press button signin 2")
	public void User_press_button_signin_2() {
		loginAccountCucumber.btnSignin();
		extentTest.log(LogStatus.PASS, "User press button signin 2");
	}
	
	@Then("Popup Username not found 2")
	public void Popup_Username_not_found_2() {
		assertEquals(loginAccountCucumber.msgUsernameNotFound(), "Username not found");
		extentTest.log(LogStatus.PASS, "Popup Username not found 2");
	}
	@When("Go to Web finansysapps 3")
	public void Go_to_Web_finansysapps_3() {
		//driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Go to Web finansysapps 3");
	}
	
	@And("User enter email address password valid 3")
	public void User_enter_email_address_password_valid_3() {
		loginAccountCucumber.login("system", "P@ssw0rd123#");
		extentTest.log(LogStatus.PASS, "User enter email address password valid 3");
	}
	
	@And("User press button signin 3")
	public void User_press_button_signin_3() {
		loginAccountCucumber.btnSignin();
		extentTest.log(LogStatus.PASS, "User press button signin 3");
	}
	
	@Then("User can see task text 3")
	public void User_can_see_task_text_3() {
		assertEquals(loginAccountCucumber.getTxtTask(), "Tasks");
		extentTest.log(LogStatus.PASS, "User can see task text 3");
	}
	@When("As a user of the form editor page of the demo website 4")
	public void As_a_user_of_the_form_editor_page_of_the_demo_website_4() {
		createApp.btnAppEditor();
		extentTest.log(LogStatus.PASS, "As a user of the form editor page of the demo website 4");
	}
	
	@And("I provide an application name that has already been used in the system 4")
	public void I_provide_an_application_name_that_has_already_been_used_in_the_system_4() {
		createApp.btnCreateApp();
		createApp.inputCreateApp("Labarotory", "test");
		createApp.btnCreate();
		extentTest.log(LogStatus.PASS, "I provide an application name that has already been used in the system 4");
	}
	
	@Then("I see an appropriate error message 4")
	public void I_see_an_appropriate_error_message_4() {
		assertEquals(createApp.getTxtFailedCreated(), "Module name of labarotory is reserved.");
		createApp.btnCancel();
		extentTest.log(LogStatus.PASS, "I see an appropriate error message 4");
	}
	@When("As a user of the form editor page of the demo website 5")
	public void As_a_user_of_the_form_editor_page_of_the_demo_website_5() {
		createApp.btnAppEditor();
		extentTest.log(LogStatus.PASS, "As a user of the form editor page of the demo website 5");
	}
	
	@And("I provide valid application name 5")
	public void I_provide_valid_application_name_5() {
		createApp.btnCreateApp();
		createApp.inputCreateAppTwo("Nandi", "test");
		createApp.btnCreateTwo();
		createApp.btnPublish();
		extentTest.log(LogStatus.PASS, "I provide valid application name 5");
	}
	
	@Then("An application is created for me 5")
	public void An_application_is_created_for_me_5() {
		assertEquals(createApp.getFormIsPublished(), "Form is published.");
		extentTest.log(LogStatus.PASS, "An application is created for me 5");
	}
}
