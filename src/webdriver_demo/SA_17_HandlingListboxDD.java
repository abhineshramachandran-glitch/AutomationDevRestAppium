package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SA_17_HandlingListboxDD extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("multiselect1"));
		
		Select sc = new Select(driver.findElement(By.id("multiselect1")));
		
		System.out.println("Total count of Listbox = "+sc.getOptions().size());
		
		
		List<WebElement> ListBox = sc.getOptions();
		for (WebElement Lb : ListBox) {
			System.out.println(Lb.getText());
		}
		
		
		
		sc.selectByVisibleText("Audi");
		
		sc.selectByIndex(2);
		
		sleep();
		
		sc.deselectByIndex(3);
		sc.deselectByVisibleText("Hyundai");
		
		sc.selectByIndex(1);
		sc.selectByVisibleText("Volvo");
		
		sleep();
		
		sc.deselectAll();
		
		sleep();
		
		driver.close();
		
	}
	

}
