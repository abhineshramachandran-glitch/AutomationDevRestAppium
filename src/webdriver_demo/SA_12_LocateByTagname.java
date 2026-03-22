package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SA_12_LocateByTagname extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("number of links present over webpage = " + noOfLinks.size());
		
		System.out.println("Link name= " + noOfLinks.get(0).getText());
		System.out.println("Link name= " + noOfLinks.get(20).getText());
		
		for (int i = 0; i<noOfLinks.size(); i++)  {
			System.out.println("Link name= " + noOfLinks.get(i).getText());
		}
		
		driver.close();
		
		
	}
}
