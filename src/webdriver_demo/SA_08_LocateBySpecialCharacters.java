package webdriver_demo;

import org.openqa.selenium.By;

public class SA_08_LocateBySpecialCharacters extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.cssSelector("#txtCustomerID")).sendKeys("abhineshbhadiabadbasb");
		
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("35465768798");
		
		
		
	}

}
