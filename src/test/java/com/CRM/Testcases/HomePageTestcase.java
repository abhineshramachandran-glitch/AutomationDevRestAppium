package com.CRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Utility.Utilites;

public class HomePageTestcase extends BaseClass {
	
	
  @Test(priority=1)
  public void VerifyUrl() {
	  
	  
	  String actUrl = hp.getAppUrl();
	  
	  Assert.assertTrue(actUrl.contains("amazon"), "Test Fail: Url not matched!");
	  
	  System.out.println("Test pass: Url matched!");
	  
  }
  
  
  @Test(priority=2)
  public void ValidateSearchBox() {
	  
	  
	  driver.get("https://www.amazon.in/");

	    Assert.assertTrue(hp.searchBoxisDisplayed());
	    
	    Utilites.getScreenShot(driver);

	    System.out.println("Search box displayed successfully");
	 	  
  }
  
  
}
