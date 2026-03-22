package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment14_FormFilling extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://autotestacademy.com/#/practice/forms");
		
		driver.findElement(By.id("firstName")).sendKeys("Abhinesh");
		driver.findElement(By.id("lastName")).sendKeys("Ramachandran");
		
		driver.findElement(By.id("email")).sendKeys("abhineshramachandran@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='male']")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		WebElement CountryDD = driver.findElement(By.xpath("//select[@id='country']"));
		Select sc = new Select(CountryDD);
		sc.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String LoginMessage = driver.findElement(By.xpath("//button[@type='submit']")).getText();
		System.out.println("Success Msg = "+LoginMessage);
		
		
	}

}
