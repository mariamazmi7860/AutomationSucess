package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//this is the core of page object model
public class HomePage   {
	WebDriver driver;
	//create a constructor of homepage class
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	       @FindBy(xpath="//button[@ng-click='manager()']")
			 WebElement managerLoginBtn;
			
			
			@FindBy(xpath="//button[@ng-class='btnClass1']") 
			 WebElement addCustomer;
			 
			 @FindBy(xpath="//input[@ng-model='fName']") 
			 WebElement fName;
			 
			 @FindBy(xpath="//input[@ng-model='lName']") 
			 WebElement lName;
			 
			 @FindBy(xpath="//input[@ng-model='postCd']") 
			 WebElement zip;
			 
			
			 @FindBy(xpath="//button[@type='submit']") 
			 WebElement addBtn;
			 //log in as managrr this is a function
			 public void loginAsManager() {
				 managerLoginBtn.click();
		}
			 //this is a function//send keys take only string
			 public void addCustomer(String firstName, String lastName, String postCode) {
				  addCustomer.click();
				  fName.sendKeys(firstName);
				  lName.sendKeys(lastName);
				  zip.sendKeys(postCode);
				  addBtn.click();
				  driver.switchTo().alert().accept();
				

				 }

	
	

}

