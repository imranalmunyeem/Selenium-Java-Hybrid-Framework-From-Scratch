package com.parasoft.parabank.testCases;

import org.testng.annotations.Test;

import com.parasoft.parabank.base.BaseClass;
import com.parasoft.parabank.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void LoginTest() {
		driver.get(baseUrl);
		LoginPage login = new LoginPage(driver);
		login.inputUsername("imranalmunyeem");
		login.inputPassword("automationtester");
		login.clickOnLogin();
	}
}
