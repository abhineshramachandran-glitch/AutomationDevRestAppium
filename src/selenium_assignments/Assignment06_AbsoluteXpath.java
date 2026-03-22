package selenium_assignments;

import org.openqa.selenium.By;

public class Assignment06_AbsoluteXpath extends baseFunctions {
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("chrome");
		
		driver.get("https://staragile.melimu.com/login/index.php");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div/div/div/div/div/div/div[1]/form/div[1]/div/input"))
		.sendKeys("abhineshramachandran@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div/div/div/div/div/div/div[1]/form/div[2]/div/input"))
		.sendKeys("Abhinesh@123");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div/div/div/div/div/div/div[1]/form/button"))
		.click();
		
		
		
		
	}

}
