package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment07_LocateByTagname extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://www.bing.com/?PC=U808");
		
		// no of links present and the total count
	    List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
		
		 System.out.println("number of links present over webpages = " + noOfLinks.size());
		    
			    System.out.println("Link Name= " + noOfLinks.get(0).getText());
			    System.out.println("Link Name= " + noOfLinks.get(25).getText());
			    
			    for (int i=0; i<noOfLinks.size(); i++) {
			    	System.out.println("Link Name= " + noOfLinks.get(i).getText());
			    }
			    
     //no of buttons that are present and its count
	//   List<WebElement> noOfButtons = driver.findElements(By.tagName("button"));
	//  System.out.println("buttons which are present over the webpage " + noOfButtons.size());
	  
	    
	 //no of fields presnt over the webpage n its count
	// List<WebElement> noOfFields = driver.findElements(By.tagName("input"));
	// System.out.println("no of fields present over the webpage = " + noOfFields.size());
	    
	  //  for(int i=0; i<2; i++) {
	  //	System.out.println("Field Names = " + noOfFields.get(i).getText());
	  //  }
	    
	  // 
	   
	driver.close();
	
	       
	}

}
