package selenium_assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Assignment19_HandlingSimpleAlert extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://autotestacademy.com/#/");
		
		Alert alt;
		
		driver.findElement(By.xpath("//*[@id='root']/div/main/div/div/div[3]/a")).click();
		driver.findElement(By.xpath("//button[@id='alert-btn']")).click();
		
		alt = driver.switchTo().alert();
		
		System.out.println("text on the alert = "+ alt.getText());
		alt.dismiss();
		
		
		
	}

}
