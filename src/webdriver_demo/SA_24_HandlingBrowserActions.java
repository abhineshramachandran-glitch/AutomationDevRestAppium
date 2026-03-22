package webdriver_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_24_HandlingBrowserActions {

	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/?hl=in");
		
		String googleTitle = driver.getTitle();
		System.out.println("Title = "+googleTitle);
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
		
		String facebookTitle = driver.getTitle();
		System.out.println("Title of FB = "+facebookTitle);
		
		driver.navigate().to("https://in.pinterest.com/");
		
		String pinterestTitle = driver.getTitle();
		System.out.println("Title of Pin = "+pinterestTitle);
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		

	}
}
