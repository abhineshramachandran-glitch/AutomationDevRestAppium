package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Assignment08_LocateByRelativeLocator extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("txtPassword"))).sendKeys("abhinesh123@gmail.com");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("txtCustomerID"))).sendKeys("Abhinesh123");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.name("txtPassword"))).click();
		
		
	}

}
