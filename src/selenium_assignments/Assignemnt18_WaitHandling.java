package selenium_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignemnt18_WaitHandling extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
		driver.get("https://bus.ixigo.com/");	
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='abrs-backdrop']"))).click();
		//driver.findElement(By.xpath("//div[@class='abrs-backdrop']")).click();
		
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		
	    driver.findElement(By.cssSelector("input[data-testid='location-input-web']")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-testid='location-input-web']"))).sendKeys("hyde");
		
		driver.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]")).click();
		//driver.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[1]/div[2]/div/div/div[3]/div[3]/div/div[2]/div[2]/div")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[1]"))).click();
		
		driver.findElement(By.xpath("//p[text()='Check-in']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class^='react-calendar__tile react-calendar__tile--hasActive react-calendar'][type='button']"))).click();

		driver.findElement(By.xpath("//p[text()='Check-out']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//abbr[text()='13']"))).click();
		
		driver.findElement(By.xpath("//div[text()='Search']")).click(); 
		
		driver.findElement(By.xpath("//div[@data-testid='bpg-home-modal-close']")).click();
		
		System.out.println(driver.findElement(By.xpath("//h2[text()='Palette Madhapur']")).getText());
		
		driver.close();
		
	}

}
