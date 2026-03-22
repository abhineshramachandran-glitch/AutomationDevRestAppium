package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment15_HandlingWebTable extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://money.rediff.com/companies/most-traded?src=moneyhome_mosttraded_more");
		

		List<WebElement> table = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table"));
		
		System.out.println("full table count = "+table.size());
		
		for (int i=0; i<table.size(); i++) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table")).getText());
			
		}
	}

}
