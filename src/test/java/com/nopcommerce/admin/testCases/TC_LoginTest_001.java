package com.nopcommerce.admin.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.admin.base.BaseClass;
import com.nopcommerce.admin.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	private String expectedMessage = "Dashboard";
	private String expectedMessage2 = "Login was unsuccessful. Please correct the errors and try again.";
	private String expectedMessage3 = "Please enter your email";
	
	@Test(priority=1, description="Login with valid credentials")
	public void validLogin() {
		driver.get(baseUrl);
		logger.info("Url is launched");
		LoginPage login = new LoginPage(driver);
		login.inputEmail("admin@yourstore.com");
		login.inputPassword("admin");
		login.clickOnLogin();
		
		
		//Login Assertion
		String actualMessage = driver.findElement(By.className("content-header")).getText();
		Assert.assertEquals(expectedMessage, actualMessage , "Login sucess verification has failed");
		
		login.clickOnLogout();
		
	}
	
	@Test(priority=2, description="Login with invalid credentials")
	public void invalidLogin() {
		driver.get(baseUrl);
		logger.info("Url is launched");
		LoginPage login = new LoginPage(driver);
		login.inputEmail("wrongadmin@yourstore.com");
		login.inputPassword("wrongpassword");
		login.clickOnLogin();
		
		//Invalid Login Assertion
		String actualMessage2 = driver.findElement(By.className("message-error validation-summary-errors")).getText();
		Assert.assertEquals(expectedMessage2, actualMessage2 , "Invalid Login sucess verification has failed");

	}
	
	@Test(priority=3, description="Login with no credentials")
	public void emptyLogin() {
		driver.get(baseUrl);
		logger.info("Url is launched");
		LoginPage login = new LoginPage(driver);
		login.clickOnLogin();
		
		//Login Assertion
		String actualMessage3 = driver.findElement(By.id("Email-error")).getText();
		Assert.assertEquals(expectedMessage3, actualMessage3 , "Empty Login sucess verification has failed");
	}
	
	@Test (priority=4, description="Verify the title of the Login page")
	public void loginTitle() throws IOException {

		if(driver.getTitle().equals("Your store. Login"))
		{
			Assert.assertTrue(true);
			logger.info("Title test passed");
		}
		else
		{	
			captureScreen(driver,"loginTitle");
			Assert.assertTrue(false);
			logger.info("Title test failed");
		}
	
	}
}
