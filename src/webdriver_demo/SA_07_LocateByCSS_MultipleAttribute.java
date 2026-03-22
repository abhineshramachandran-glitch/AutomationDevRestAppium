package webdriver_demo;

import org.openqa.selenium.By;

public class SA_07_LocateByCSS_MultipleAttribute extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.cssSelector("input[name = 'txtCustomerID'][placeholder = 'Username']"))
		.sendKeys("abhi@gmail.com");
		
		driver.findElement(By.cssSelector("input[name = 'txtPassword'][placeholder = 'Password']"))
		.sendKeys("test@123");
		
		driver.findElement(By.cssSelector("input[name = 'Butsub'][value = 'Login']")).click();
		

		sleep();
		
		driver.close();
		
	}

}
