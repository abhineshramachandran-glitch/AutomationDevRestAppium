package webdriver_demo;

import org.openqa.selenium.By;

public class SA_11_LocateByRelativeXpath extends baseFunctions {
	
	public static void main(String[] args) {
		
		
		LaunchBrowser("Chrome");
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lolappan@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("43546576");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		String LoginError = driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		System.out.println("Error Message= " + LoginError);
		
		if (LoginError.contains("Invalid")) {
			System.out.println("testcases failed");
			
		}
	}

}
