package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01_LocatorByName {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtCustomerID")).sendKeys("abhinesh@gmail.com");
		
		driver.findElement(By.name("txtPassword")).sendKeys("Abhi123456");
		
		driver.findElement(By.name("Butsub")).click();
		
		String Pagetitle = driver.getTitle();
		
		System.out.println(" Page Title " + Pagetitle);
		
		Thread.sleep(4000);
		
		driver.close();
		
	}

}
