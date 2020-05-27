package com.hybrid.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.hybrid.qa.testbase.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'User: Demo User')]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		
		public boolean verifyCorrectUserName(){
			return userNameLabel.isDisplayed();
		}
		
		public void clickOnNewContactLink(){
			//Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	      //Perform Click on newContactLink using JavascriptExecutor		
	        js.executeScript("arguments[0].click();", newContactLink);
	        
	        
//			Actions action = new Actions(driver);
//			action.moveToElement(contactsLink).build().perform();
//			newContactLink.click();
			
		}
	
	
	
	
}
