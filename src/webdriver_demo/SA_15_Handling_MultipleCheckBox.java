package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SA_15_Handling_MultipleCheckBox extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		//xpath - //input[name= 'accessories'] --4 elements
		//xpath - ////input[@value='Laptop'] ---- 1 element
		//xpath - // based on index-- (//input[@value='Pen'])[2] 
		
		driver.get("https://omayo.blogspot.com/");
		
		//driver.findElement(By.cssSelector("input[type= 'checkbox'][name= 'accessories']")).click();
		//driver.findElement(By.xpath("(//input[@value='Pen'])[2]")).click();
		//driver.findElement(By.xpath("//input[@value='Laptop']")).click();
		List<WebElement> accessoriesCheckbox = driver.findElements(By.xpath("//input[@name= 'accessories']"));
		System.out.println("total size of Checkbox = "+accessoriesCheckbox.size());
		
		
		for(int i=0; i<accessoriesCheckbox.size(); i++) {
			accessoriesCheckbox.get(i).click();
			
		}
		
		sleep();
		
		driver.close();
	}

}
