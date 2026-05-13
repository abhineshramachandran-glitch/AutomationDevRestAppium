package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepage 
{
	
 private WebDriver driver;
 
 public AmazonHomepage() {
	 
 }
 
 
 
public AmazonHomepage(WebDriver driver) {
	 
	 this.driver = driver;
	 PageFactory.initElements(driver, this); 	 
 }
 
  
 public String getAppUrl()
 
 {
	return driver.getCurrentUrl(); 
 }
 
 
 @FindBy(id="twotabsearchtextbox")
 WebElement searchBox;
 
 
 public boolean searchBoxisDisplayed() {
	 
	 return searchBox.isDisplayed();
 }

 
 
}