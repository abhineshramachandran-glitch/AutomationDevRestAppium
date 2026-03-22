package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SA_13_LocateByRelative extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("pass"))).sendKeys("username");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.name("email"))).sendKeys("3454668809");
		
		driver.close();
		
		
	}
	

}
