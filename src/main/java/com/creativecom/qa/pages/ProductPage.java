package com.creativecom.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.setup.SetUp;

public class ProductPage extends SetUp{
	
	
	//############   3   ...
	
	//1. in pageclasss extend the setup class
	//2. write constructor to initlize the page Objects 
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		products.click();
		
	}
	
	// find Elements and write related methods 
	
	
	@FindBy(xpath="//p[normalize-space(text())='Products']")
	WebElement products;
	
	@FindBy(xpath="//a[@href='/Admin/Product/Create']")
	WebElement addNew;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement save;
	
	@FindBy(xpath="//button[@id='search-products']")
	WebElement search;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement productName;

	public boolean clickOnAddNew()
	{
		addNew.click();
		return save.isDisplayed();
		
	    
	}
	
	public void clickOnSearch()
	{
		search.click();
	}
	
	public void enterProductName(String val)
	{
		productName.sendKeys(val);
	}
}
