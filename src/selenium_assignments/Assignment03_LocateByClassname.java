package selenium_assignments;

import org.openqa.selenium.By;

public class Assignment03_LocateByClassname extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.className("form-control")).sendKeys("abhinesh");
		
		driver.findElement(By.id("txtPassword")).sendKeys("123456789");
		
		
	
	}

}
