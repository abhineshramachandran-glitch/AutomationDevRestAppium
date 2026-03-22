package webdriver_demo;

import org.openqa.selenium.By;

public class SA_10_LocateBy_Link_PartialLink extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.linkText("About")).click();
		
		driver.findElement(By.partialLinkText("Advert")).click();
		
	}

}
