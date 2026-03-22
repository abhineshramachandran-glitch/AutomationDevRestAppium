package webdriver_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SA_21_HandlingAlert extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		driver.get("https://demoqa.com/");
		
		Alert  alt;
		
		driver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div/a[3]/div/div/div[3]/h5")).click();
		
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		alt = driver.switchTo().alert();
		
		System.out.println("text on alert = "+alt.getText());
		alt.accept();
		
		//driver.switchTo().defaultContent();
		
		System.out.println("alert accepted");
	}

}
