package com.CRM.Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.CRM.Pages.AmazonHomepage;

public class BaseClass 
{
public WebDriver driver;

public AmazonHomepage hp;

@Parameters("browser")

@BeforeTest
public void setup(@Optional("chrome") String browser)
{
	if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	}
	
	else if(browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
	}
	
	else if(browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.amazon.in/");
	
	hp = new AmazonHomepage(driver);
	
}

}
 