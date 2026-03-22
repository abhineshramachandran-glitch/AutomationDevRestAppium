package webdriver_demo;

import org.openqa.selenium.By;

public class SA_06_LocateByCSS_SingleAttribute extends baseFunctions {
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("Chrome");
		
		driver.get("https://autotestacademy.com/#/auth");
		
		driver.findElement(By.cssSelector("input[placeholder = 'john@example.com']"))
		.sendKeys("abhinesh@gmail.com");
		
		driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys("test@123");
		
		driver.findElement(By.cssSelector("button[type = 'submit']")).click();
		
		Thread.sleep(4000);
		
		driver.close();
		
		
		
	}

}
