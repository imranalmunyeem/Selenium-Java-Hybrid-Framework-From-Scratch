package com.nopcommerce.admin.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver localDriver;

	public ProductsPage(WebDriver remoteDriver) { // Constructor
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}

//------------------------------Product Info---------------------------------------------//

	// Product Name Locator
	@FindBy(how = How.ID, using = "Name")
	@CacheLookup
	WebElement txtName;

	// Short Description
	@FindBy(how = How.ID, using = "ShortDescription")
	@CacheLookup
	WebElement txtShortDescription;

	// Full Description
	@FindBy(how = How.ID, using = "tinymce")
	@CacheLookup
	WebElement txtFullDescription;

	// SKU
	@FindBy(how = How.ID, using = "Sku")
	@CacheLookup
	WebElement txtSku;

	// Categories
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-info\"]/div[2]/div[2]/div[2]/div/div")
	@CacheLookup
	WebElement dropdownCategories;

	// Manufactures
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-info\"]/div[2]/div[3]/div[2]/div/div")
	@CacheLookup
	WebElement dropdownManufacturers;

	// Published
	@FindBy(how = How.ID, using = "Published")
	@CacheLookup
	WebElement checkboxPublished;

	// Product Tags
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-info\"]/div[2]/div[5]/div[2]/ul")
	@CacheLookup
	WebElement txtTags;

	// GTIN
	@FindBy(how = How.ID, using = "Gtin")
	@CacheLookup
	WebElement numberGtin;

	// Manufacturer part number
	@FindBy(how = How.ID, using = "ManufacturerPartNumber")
	@CacheLookup
	WebElement numberManufacturerPart;

	// Show on home page
	@FindBy(how = How.ID, using = "ShowOnHomepage")
	@CacheLookup
	WebElement checkboxShowOnHomepage;

	// Product type
	@FindBy(how = How.ID, using = "ProductTypeId")
	@CacheLookup
	WebElement dropdownProductType;

	// Product template
	@FindBy(how = How.ID, using = "ProductTemplateId")
	@CacheLookup
	WebElement dropdownProductTemplateId;

	// Visible individually
	@FindBy(how = How.ID, using = "VisibleIndividually")
	@CacheLookup
	WebElement checkboxVisibleIndividually;

	// Customer roles
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-info\"]/div[2]/div[14]/div[2]/div/div[1]/div/div")
	@CacheLookup
	WebElement dropdownCustomerRoles;

	// Limited to stores
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-info\"]/div[2]/div[15]/div[2]/div/div[1]/div/div")
	@CacheLookup
	WebElement dropdownLimitedToStore;

	// Vendor
	@FindBy(how = How.ID, using = "VendorId")
	@CacheLookup
	WebElement dropdownVendor;

	// Require other products
	@FindBy(how = How.ID, using = "RequireOtherProducts")
	@CacheLookup
	WebElement checkboxRequireOtherProducts;

	// Allow customer reviews
	@FindBy(how = How.ID, using = "AllowCustomerReviews")
	@CacheLookup
	WebElement checkboxAllowCustomerReviews;

	// Available start date
	@FindBy(how = How.ID, using = "AvailableStartDateTimeUtc")
	@CacheLookup
	WebElement numberStartDate;

	// Available end date
	@FindBy(how = How.ID, using = "AvailableEndDateTimeUtc")
	@CacheLookup
	WebElement numberEndDate;

	// Mark as new
	@FindBy(how = How.ID, using = "MarkAsNew")
	@CacheLookup
	WebElement checkboxMarkAsNew;

	// Admin comment
	@FindBy(how = How.ID, using = "AdminComment")
	@CacheLookup
	WebElement txtAdminComment;

	// Product Name Method
	public void inputName(String name) {
		txtName.clear();
		txtName.sendKeys(name);
	}
	
	// Product Short Description Method
	public void inputShortDescription(String shortdescription) {
		txtShortDescription.clear();
		txtShortDescription.sendKeys(shortdescription);
	}

	// Product Full Description Method
	public void inputFullDescription(String fulldescription) {
		txtFullDescription.clear();
		txtFullDescription.sendKeys(fulldescription);
	}
	
	// Sku Method
	public void inputSku(String sku) {
		txtSku.clear();
		txtSku.sendKeys(sku);
	}
	
	// Category dropdown selection Method
	public void selectCategory(String category) {
		dropdownCategories.clear();
		dropdownCategories.sendKeys(category);
		dropdownCategories.sendKeys(Keys.RETURN);
	}
	
	// Manufacture dropdown selection Method
	public void selectManufacturer(String manufacturer) {
		dropdownManufacturers.clear();
		dropdownManufacturers.sendKeys(manufacturer);
		dropdownManufacturers.sendKeys(Keys.RETURN);
	}

	
	// Select Published checkbox
	public void selectPublishedCheckbox() {
		boolean isSelected = checkboxPublished.isSelected();

		// performing click operation if element is not selected
		if (isSelected == false) {
			checkboxPublished.click();
		}
	}
	
	// Deselect Published checkbox
	public void deselectPublishedCheckbox() {
		boolean isSelected = checkboxPublished.isSelected();

		// performing click operation if element is not selected
		if (isSelected == true) {
			checkboxPublished.click();
		}
	}
	
	// Tags entering method
	public void inputTags(String tags) {
		txtTags.clear();
		txtTags.sendKeys(tags);
		txtTags.sendKeys(Keys.ENTER);
	}

	//Gtin number
	public void inputGtin(int gtin) {
		numberGtin.clear();
		numberGtin.sendKeys(String.valueOf(gtin));
	}
	
	//Manufacturer part number
	public void inputManufacturerPartNumber(int partnumber) {
		numberManufacturerPart.clear();
		numberManufacturerPart.sendKeys(String.valueOf(partnumber));
	}

	// Select Visible Individually checkbox
	public void selectVisibleIndividuallyCheckbox() {
		boolean isSelected = checkboxVisibleIndividually.isSelected();

		// performing click operation if element is not selected
		if (isSelected == false) {
			checkboxVisibleIndividually.click();
		}
	}

	// Deselect Visible Individually checkbox
	public void deselectVisibleIndividuallyCheckbox() {
		boolean isSelected = checkboxVisibleIndividually.isSelected();

		// performing click operation if element is not selected
		if (isSelected == true) {
			checkboxVisibleIndividually.click();
		}
	}
	
	//Customer Role
	public void inputCustomerRole(String role) {
		dropdownCustomerRoles.clear();
		dropdownCustomerRoles.sendKeys(role);
		dropdownCustomerRoles.sendKeys(Keys.ENTER);
	}
	
	// Store Name
	public void inputLimitedToStore(String storename) {
		dropdownLimitedToStore.clear();
		dropdownLimitedToStore.sendKeys(storename);
		dropdownLimitedToStore.sendKeys(Keys.ENTER);
	}

	// Select Customer Review checkbox
	public void selectAllowCustomerReviewCheckbox() {
		boolean isSelected = checkboxAllowCustomerReviews.isSelected();

		// performing click operation if element is not selected
		if (isSelected == false) {
			checkboxAllowCustomerReviews.click();
		}
	}
	
	// Deselect Customer Review checkbox
	public void deselectAllowCustomerReviewCheckbox() {
		boolean isSelected = checkboxAllowCustomerReviews.isSelected();

		// performing click operation if element is not selected
		if (isSelected == true) {
			checkboxAllowCustomerReviews.click();
		}
	}
	
	// Start Date
	public void inputStartDate(String startdate) {
		numberStartDate.clear();
		numberStartDate.sendKeys(startdate);
	}
	
	// End Date
	public void inputEndDate(String enddate) {
		numberEndDate.clear();
		numberEndDate.sendKeys(enddate);
	}
	
	// Admin Comment
	public void inputAdminComment(String comment) {
		txtAdminComment.clear();
		txtAdminComment.sendKeys(comment);
	}

}
