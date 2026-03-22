package webdriver_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_02_ReadPageTitle {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		
		String PageTitle = driver.getTitle();
		
		System.out.println("Page Title " + PageTitle);
		
		String PageURL = driver.getCurrentUrl();
		
		System.out.println(" Page URL " + PageURL);
		
		
		if (PageTitle.equals("Google")) {
			System.out.println("testcase passed");
			
			
		}else { 
			System.out.println("testcase failed");	
			
		}
		
	
		driver.close();
		
		
	}

}
