package com.finansys.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.finansys.pageobject.drivers.DriverSingleton;

public class LoginAccountCucumber {
	private WebDriver driver;
 
	public LoginAccountCucumber() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
//	
//	======================= Login ====================
//	
	@FindBy(xpath = "//*[@id=\"kt_login_signin_form\"]/form/fieldset/div[1]/input")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='kt_login_signin_submit']")
	private WebElement btnSignin;
	
	@FindBy(xpath = "//*[@id=\"kt_login_signin_form\"]/form/fieldset/div[1]/div")
	private WebElement msgInvalidPassword;
	
	@FindBy(xpath = "//*[@id=\"kt_login_signin_form\"]/form/fieldset/div[1]/div")
	private WebElement msgUsernameNotFound;
	
	@FindBy(xpath = "//*[@id=\"kt_content\"]/div[2]/div/div/div[1]/div[1]/div/h2")
	private WebElement txtTask;
//	
//	======================= Login ====================
//	Scenario 
	public void login(String email, String password) {
		this.email.sendKeys(email); //step
		this.password.sendKeys(password);
	}
	
	
	public String getTxtTask() {
		return txtTask.getText();
	}
	
	public void btnSignin() {
		btnSignin.click();
	}
	public String msgInvalidPassword() {
		return msgInvalidPassword.getText();
	}
	public String msgUsernameNotFound() {
		return msgUsernameNotFound.getText();
	}
}





