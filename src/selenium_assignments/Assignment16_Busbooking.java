package selenium_assignments;

import org.openqa.selenium.By;

public class Assignment16_Busbooking extends baseFunctions  {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://www.redbus.in/?gad_source=1&gad_campaignid=19018580125&gclid=EAIaIQobChMI64nM-7uFkwMVaKNmAh1_0jhPEAAYASAAEgL5uvD_BwE");
		//from element execution
		
		driver.findElement(By.id("srcinput")).sendKeys("hyde");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[2]/div/div[3]/div[1]/div[5]")).click();
		
		//to element execution
		driver.findElement(By.id("destinput")).sendKeys("goa");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[2]/div/div[3]/div[1]/div[3]/div[1]/div/div[1]")).click();
		
		//the date selection execution
		driver.findElement(By.cssSelector("div[aria-label^='Select Date of Journey']")).click();
		
		driver.findElement(By.xpath("//span[text()='31']")).click();
		
		//submission execution
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/button")).click();
		
		
		//get the text from the first result
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Kadamba Transport Corporation Limited  (KTCL) - 181828']")).getText());
		
	
		driver.close();
	}

}
