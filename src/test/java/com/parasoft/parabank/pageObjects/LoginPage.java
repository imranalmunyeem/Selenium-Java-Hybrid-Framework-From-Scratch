package com.parasoft.parabank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver localDriver;

	public LoginPage(WebDriver remoteDriver) { // Constructor
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}

	@FindBy(name = "username")
	@CacheLookup
	WebElement txtUsername;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[3]/input")
	@CacheLookup
	WebElement btnLogin;
	
	public void inputUsername(String username) {
		txtUsername.sendKeys(username);
	}
	
	public void inputPassword(String password) {
		txtUsername.sendKeys(password);
	}
	
	public void clickOnLogin() {
		btnLogin.click();
	}

}
