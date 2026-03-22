package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SA_05_LocateByClassName extends baseFunctions {

	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
		
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.className("gNO89b")).click(); another scenario 50-50 chance
		
		
		
		
		
		
	}
}
