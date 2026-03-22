package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_03_LocateByName {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("abhinesh@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(4000);
	
		
		
		
	}

}
