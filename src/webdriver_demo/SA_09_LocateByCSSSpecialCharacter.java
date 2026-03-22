package webdriver_demo;

import org.openqa.selenium.By;

public class SA_09_LocateByCSSSpecialCharacter extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		//driver.get("https://practice.expandtesting.com/login");
		
		//driver.findElement(By.cssSelector(".form-control#username")).sendKeys("kuttanpan@gmail.com");
		
		//driver.findElement(By.cssSelector("#password")).sendKeys("6543423");
		
		//driver.findElement(By.cssSelector("#submit-login")).click();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.cssSelector("input[id$='_R_1h6kqsqppb6amH1_']")).sendKeys("kuttappanpilla@gmail.com");
		
		driver.findElement(By.cssSelector("input[type^='password']")).sendKeys("35465787980");
		
		
	
		
		
	}

}
