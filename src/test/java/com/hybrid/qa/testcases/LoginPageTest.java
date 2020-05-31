package com.hybrid.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hybrid.qa.pages.LoginPage;
import com.hybrid.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {
	
	
	// Check Repo Code
	
	LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void validateLoginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
//	@Test(priority=2)
//	public void validateCRMImageTest() {
//		boolean flag=loginPage.validateCRMImage();
//		Assert.assertTrue(flag);
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
