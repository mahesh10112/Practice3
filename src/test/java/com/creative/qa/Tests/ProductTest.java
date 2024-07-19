package com.creative.qa.Tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.creativecom.qa.pages.ProductPage;
import com.qa.setup.SetUp;

public class ProductTest extends SetUp{
	
	ProductPage pp;
	ProductTest()
	{
		initlization(); // preconditons 
		pp=new ProductPage(driver);
	}
	
	
	
	//to check add new Button is working or not 
	@Test(enabled=false)
	public void AddNewButton()
	{
	  boolean b=pp.clickOnAddNew();
	  Assert.assertTrue(b);
		
	}
	
	@Test
	public void enterTheProductDetais()
	{
		pp.clickOnAddNew();
		pp.enterProductName("hello");
	}

}
