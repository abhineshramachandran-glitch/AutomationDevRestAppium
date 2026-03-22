package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SA_18_HandlingWebTable extends baseFunctions  {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		driver.get("https://money.rediff.com/companies/most-traded?src=moneyhome_mosttraded_more");
		
		
	/*	List<WebElement> Headers = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("No of headers = "+Headers.size());
		
		System.out.println("text from the 1st header = "+ Headers.get(0).getText());
		System.out.println("text from the 2nd header = "+ Headers.get(1).getText());
		System.out.println("text from the 3rd header = "+ Headers.get(2).getText());

		for(WebElement wb : Headers) {
			System.out.println("Headers Name = "+wb.getText());
		} 
		
		 List<WebElement> Rowsize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("total no of rows = "+Rowsize.size());

		for(int i=0; i<Rowsize.size(); i++) {
			System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td[1]/a")).getText());
		} */
		
		
		List<WebElement> table = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table"));
		
		System.out.println("full table count = "+table.size());
		
		for (int i=0; i<table.size(); i++) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table")).getText());
			
		}
	
		driver.close();
		
	}

}
