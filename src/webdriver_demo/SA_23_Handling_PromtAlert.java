package webdriver_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SA_23_Handling_PromtAlert extends baseFunctions {
	
public static void main(String[] args) {
	
	LaunchBrowser("Chrome");
	
	driver.get("https://demoqa.com/");
	
	Alert alt;
	
	driver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div/a[3]")).click();
	driver.findElement(By.xpath("//span[text()='Alerts']")).click();
	
	driver.findElement(By.id("promtButton")).click();
	
	alt = driver.switchTo().alert();
	alt.sendKeys("Abhinesh R P");
	alt.accept();
	
	System.out.println("promt result ="+driver.findElement(By.id("promptResult")).getText());
	
	
	
}

}
