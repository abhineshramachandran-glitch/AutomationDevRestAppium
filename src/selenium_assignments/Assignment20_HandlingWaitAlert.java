package selenium_assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment20_HandlingWaitAlert extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		driver.get("https://demoqa.com/");
		
		Alert alt;
		
		driver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div/a[3]")).click();
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='alertButton']"))).click();
		
		alt = driver.switchTo().alert();
		System.out.println("text from the alert = "+alt.getText());
		//alt.accept();
		alt.dismiss();
		
		
		
	}

}
