package selenium_assignments;

import org.openqa.selenium.By;

public class Assignment05_Xpath extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.xpath("//input[@id='txtCustomerID']")).sendKeys("elio@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("4235465687989");
		
		driver.findElement(By.xpath("//input[@title='Login']")).click();
		
		
	}

}
