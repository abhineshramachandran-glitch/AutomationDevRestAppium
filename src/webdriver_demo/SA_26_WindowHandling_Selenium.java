package webdriver_demo;

import org.openqa.selenium.By;

public class SA_26_WindowHandling_Selenium extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		LaunchURL("https://www.naukri.com/");
		
		System.out.println("get title of the page "+driver.getTitle());
				
		driver.findElement(By.xpath("//*[@id='trending-naukri-wdgt']/div/div[1]/a[2]")).click();
		
		driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
		
		String slidertext = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/div[1]/text()")).getText();
		
		System.out.println("slider text "+ slidertext);
		
		
	}

}
