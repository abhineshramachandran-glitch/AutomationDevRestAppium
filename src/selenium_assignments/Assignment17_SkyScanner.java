package selenium_assignments;

import org.openqa.selenium.By;

public class Assignment17_SkyScanner extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://www.skyscanner.co.in/?locale=en-GB&gclsrc=aw.ds&&utm_source=google&utm_medium=cpc&utm_campaign=IN-Travel-Search-Brand-SkyscannerPure-Desktop&utm_term=skyscanner&associateID="
				+ "SEM_FLI_19465_00000&campaign_id=21456707965&adgroupid=167310367911&keyword_id=kwd-400074527&gad_source=1&gad_campaignid=21456707965&gbraid=0AAAAAD3oWFjFMkUszAci2Vk2oNq1KcWz5&gclid=EAIaIQobChMIqLLHk82FkwMVbKZmAh32ZjUPEAAYASAAEgJHBvD_BwE");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div[1]/div/div[3]/div[2]/div/div[1]/div/fieldset/div/div[1]/div[1]/div/div/input")).sendKeys("hyde");
		sleep();
		driver.findElement(By.xpath("//span[text()='rabad '")).click();
		
		driver.findElement(By.xpath("//*[@id='destinationInput-input']")).sendKeys("trivan");
		sleep();
		driver.findElement(By.xpath("//*[@id=\"TRV\"]/span/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div/main/div[1]/div/div[3]/div[2]/div/div[3]/div[1]/div/button")).click();
		sleep();
		driver.findElement(By.xpath("//button[text()='12']")).click();
		sleep();
		driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div/main/div[1]/div/div[3]/div[2]/div/div[3]/div[3]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[4]/div/button")).click();
		
		
		driver.findElement(By.xpath("//span[text()='1 Adult, Economy']")).click();
		sleep();
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		sleep();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
	
		driver.findElement(By.xpath("//*[@id=\"dayview-first-result\"]/div/div[2]/a/div/div/div/div[2]/div/div/div/div[2]/div[3]/button")).click();
		
		driver.close();
	}

}











//*[@id="HYD"]/span/div/span[1]/span/span[2]