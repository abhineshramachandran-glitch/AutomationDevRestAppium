package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SA_14_Handling_CheckBox extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//driver.findElement(By.cssSelector("input[name^='chk_altemail']")).click();
		
		WebElement CheckBox = driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail')]"));
		
		System.out.println("----------------------------------Before Click------------------------------------");
		
		System.out.println("displayed " +driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail')]")).isDisplayed());
		System.out.println("checked " +driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail')]")).isEnabled());
		System.out.println("selected " +driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail')]")).isSelected());
		
		//System.out.println("displayed " +CheckBox.isDisplayed());
		//System.out.println("Checked " +CheckBox.isEnabled());
		//System.out.println("Selected " +CheckBox.isSelected());
		
		CheckBox.click();
		
		sleep();
		
		if (!CheckBox.isSelected())  {
			CheckBox.click();
		}
		
		System.out.println("---------------------------------------After Click------------------------------------------");
		
		System.out.println("displayed " + CheckBox.isDisplayed());
		System.out.println("checked " + CheckBox.isEnabled());
		System.out.println("selected " + CheckBox.isSelected());
		
		sleep();
		
		
		
		driver.close();
	}

}
