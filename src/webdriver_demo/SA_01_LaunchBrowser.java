package webdriver_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_01_LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		//ctrl+shift+o | shortcut key to import
		//ChromeDriver driver = new ChromeDriver();
		//dr = new EdgeDriver();
		
		WebDriver dr = new ChromeDriver();  //class in selenium
		dr.get("http://www.google.co.in");  //launch the URL
		dr.manage().window().maximize();    //maximized the open browser
		Thread.sleep(4000);                 // to pause sometime for the execution
		dr.close();                        // to close the opened browser
		
		
		
		
		
		
		
		

		
		
	}

}
