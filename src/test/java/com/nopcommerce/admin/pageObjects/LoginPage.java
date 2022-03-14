package com.nopcommerce.admin.pageObjects;

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

	@FindBy(name = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(name = "Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[3]/a")
	@CacheLookup
	WebElement btnLogout;
	
	public void inputEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void inputPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickOnLogin() {
		btnLogin.click();
	}
	
	public void clickOnLogout() {
		btnLogout.click();
	}

}
