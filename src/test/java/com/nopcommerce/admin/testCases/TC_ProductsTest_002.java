package com.nopcommerce.admin.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nopcommerce.admin.base.BaseClass;
import com.nopcommerce.admin.pageObjects.LoginPage;
import com.nopcommerce.admin.pageObjects.ProductsPage;

public class TC_ProductsTest_002 extends BaseClass{
	private String createProductsUrl = "https://admin-demo.nopcommerce.com/Admin/Product/Create";
		
	@BeforeMethod
	public void login() {
		driver.get(baseUrl);
		logger.info("Url is launched");
		LoginPage login = new LoginPage(driver);
		login.inputEmail("admin@yourstore.com");
		login.inputPassword("admin");
		login.clickOnLogin();
	}
	
//	@AfterMethod
//	public void logout() {
//		LoginPage login = new LoginPage(driver);
//		login.clickOnLogout();
//	}
	
	@Test
	public void createProduct() {
		driver.get(createProductsUrl);
		ProductsPage product = new ProductsPage(driver);
		product.inputName("Test Product");
		product.inputShortDescription("Test Description");
		driver.switchTo().frame("FullDescription_ifr");
		product.inputFullDescription("This is a test product");
		product.inputSku("Test");
		product.selectCategory("Electronics");
	}
}
