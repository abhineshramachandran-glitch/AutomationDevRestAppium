package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_04_LocateById {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("abhinesh@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("123455jncjdsc");
		
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(4000);
		
		String PageTitle = driver.getTitle();
		
		System.out.println("Page Title = " + PageTitle);
		
		driver.close();
		
		
	}
}
