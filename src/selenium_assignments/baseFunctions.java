package selenium_assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class baseFunctions {
	
	static WebDriver driver = null;
	
	public static void LaunchBrowser ( String browserName) {
		
		if (browserName.equals("chrome")) {
		driver = new ChromeDriver(); 
		
		}else if(browserName.equals("firefox")) {
			
			driver = new FirefoxDriver(); 
					
				} else if(browserName.equals("safari")) {
					
			 driver = new SafariDriver(); 
				} else if(browserName.equals("edge")) {
					driver = new EdgeDriver();
				}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
		public static void LaunchURL (String url) {
			driver.get(url);
		}

	     public static void sleep() {
	    	 try {
	    		 Thread.sleep(4000);
	    	 } catch (Exception e) {
	    		 e.getMessage();
	    	 }
	     
		
	}
		
}
