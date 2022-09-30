package com.finansys.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.finansys.pageobject.drivers.DriverSingleton;

public class CreateApp {
	private WebDriver driver;

	public CreateApp() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"kt_header_menu\"]/ul/li[1]/a/span")
	private WebElement appEditor;
	
	@FindBy(xpath = "//*[@id=\"kt_content\"]/div[2]/div/div/div[1]/div[1]/div/button")
	private WebElement createApp;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[2]/form/fieldset/div[1]/div/input")
	private WebElement nameApp;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div[2]/form/fieldset/div[1]/div/input")
	private WebElement nameAppTwo;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[2]/form/fieldset/div[2]/div/textarea")
	private WebElement descriptionApp;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div[2]/form/fieldset/div[2]/div/textarea")
	private WebElement descriptionAppTwo;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div[2]/form/fieldset/div[3]/div/div/div/div[1]/div[1]")
	private WebElement btnSelectGroup;
	
	@FindBy(xpath = "//div[@role='dialog']")
	private WebElement chooseGroup;
	
	@FindBy(xpath = "//*[@id=\"kt_body\"]/div[5]/div/div/div[3]/button[2]")
	private WebElement create;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div[3]/button[2]")
	private WebElement createTwo;
	
	@FindBy(xpath = "//*[@id=\"fs-modal-form-editor\"]/div/div")
	private WebElement txtTestApp;
	
	@FindBy(xpath = "//*[@id=\"kt_body\"]/div[6]/div/div/fieldset/div[1]/button[3]")
	private WebElement publish;
	
	@FindBy(xpath = "//span[normalize-space()='Form is published.']")
	private WebElement formIsPublished;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div/span[2]")
	private WebElement txtFailedCreated;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button[1]")
	private WebElement cancel;
	
	public void btnAppEditor() {
		appEditor.click();
	}
	
	public void btnCancel() {
		cancel.click();
	}
	
	public void btnCreateApp() {
		createApp.click();
	}
	public void inputCreateApp(String nameApp, String descriptionApp) {
		this.nameApp.sendKeys(nameApp);
		this.descriptionApp.sendKeys(descriptionApp);
	}
	public void inputCreateAppTwo(String nameAppTwo, String descriptionAppTwo) {
		this.nameAppTwo.sendKeys(nameAppTwo);
		this.descriptionAppTwo.sendKeys(descriptionAppTwo);
	}
	public void btnCreate() {
		create.click();
	}
	public void btnCreateTwo() {
		createTwo.click();
	}
	
	public String getTxtTestApp() {
		return txtTestApp.getText();
	}
	
	public String getTxtFailedCreated() {
		return txtFailedCreated.getText();
	} 
	public void btnPublish() {
		publish.click();
	}
	public String getFormIsPublished() {
		return formIsPublished.getText();
	}
	
}