package com.parasoft.parabank.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.parasoft.parabank.base.BaseClass;
import com.parasoft.parabank.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() {
		driver.get(baseUrl);
		logger.info("Url is launched");
		LoginPage login = new LoginPage(driver);
		login.inputUsername("imranalmunyeem");
		login.inputPassword("automationtester");
		login.clickOnLogin();
	}
	
	@Test
	public void loginTitle() throws IOException {
		if(driver.getTitle().equals("ParaBank | Welcome | Online Banking"))
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
