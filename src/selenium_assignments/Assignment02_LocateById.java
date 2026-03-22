package selenium_assignments;

import org.openqa.selenium.By;

public class Assignment02_LocateById  extends baseFunctions {
	

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("chrome");
		
		driver.get("https://staragile.melimu.com/login/index.php?id=1&code=Star%20Agile");
		
		String LoginPageTitle = driver.getTitle();
		
		System.out.println("Loginpagetitle " + LoginPageTitle);
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("abhineshramachandran@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Abhinesh@123");
		
		driver.findElement(By.id("loginbtn")).click();
		
		String PageTitle = driver.getTitle();
		
		System.out.println("Page Title" + PageTitle);
		
	}
}
