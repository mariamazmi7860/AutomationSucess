package com.qa.testcases;



import org.apache.commons.logging.impl.AvalonLogger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.BaseClass;
import com.qa.pages.HomePage;



public class TestBanking extends BaseClass {
	
	
	@Test
	
		//create an object of your HomePage class
	
	  public void openBankSite() {
	  
	  logger = report.createTest("Client creation test");
	  
	  HomePage home =new HomePage(driver); home.loginAsManager();
	  logger.info("Logged in as Manager");
	  home.addCustomer(excel.getStringData("Client", 1,
	  0),excel.getStringData("Client",1,1),excel.getStringData("Client", 1,2));
	  logger.info("Added a client"); }
	 
	

	
}
		
		

		/*
		 * driver =BrowserFactory.openApplication(driver, "firefox",
		 * "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		 * System.out.println(driver.getTitle()); driver
		 * =BrowserFactory.openApplication(driver, "edge",
		 * "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		 * System.out.println(driver.getTitle());;
		 */


