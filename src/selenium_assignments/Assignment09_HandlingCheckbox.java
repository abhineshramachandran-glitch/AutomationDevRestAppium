package selenium_assignments;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment09_HandlingCheckbox extends baseFunctions {
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("chrome");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
    	WebElement Checkbox = driver.findElement(By.xpath("//input[@type= 'checkbox'][@id= 'sunday']"));
		WebElement Checkbox1 = driver.findElement(By.xpath("//input[@type= 'checkbox'][@id= 'monday']"));
		WebElement Checkbox2 = driver.findElement(By.xpath("//input[@type= 'checkbox'][@id= 'tuesday']"));
		WebElement Checkbox3 = driver.findElement(By.xpath("//input[@type= 'checkbox'][@id= 'wednesday']"));
		WebElement Checkbox4 = driver.findElement(By.xpath("//input[@type= 'checkbox'][@id= 'thursday']"));
		WebElement Checkbox5 = driver.findElement(By.xpath("//input[@type= 'checkbox'][@id= 'friday']"));
		WebElement Checkbox6 = driver.findElement(By.xpath("//input[@type= 'checkbox'][@id= 'saturday']"));
		
		System.out.println("--------------------------------------Before Click----------------------------------------");
		
		//checkbox sunday 
		System.out.println("displayed "+ Checkbox.isDisplayed());
		System.out.println("checked "+ Checkbox.isEnabled());
		System.out.println("enabled "+ Checkbox.isSelected());
		
		//checkbox monday
		System.out.println("displayed "+ Checkbox1.isDisplayed());
		System.out.println("checked "+ Checkbox1.isEnabled());
		System.out.println("enabled "+ Checkbox1.isSelected());
		
		//checkbox tuesday
		System.out.println("displayed "+ Checkbox2.isDisplayed());
		System.out.println("checked "+ Checkbox2.isEnabled());
		System.out.println("enabled "+ Checkbox2.isSelected());
		
		//checkbox wednesday
		System.out.println("displayed "+ Checkbox3.isDisplayed());
		System.out.println("checked "+ Checkbox3.isEnabled());
		System.out.println("enabled "+ Checkbox3.isSelected());
		
		//checkbox thursday
		System.out.println("displayed "+ Checkbox4.isDisplayed());
		System.out.println("checked "+ Checkbox4.isEnabled());
		System.out.println("enabled "+ Checkbox4.isSelected());
		
		//checkbox friday
		System.out.println("displayed "+ Checkbox5.isDisplayed());
		System.out.println("checked "+ Checkbox5.isEnabled());
		System.out.println("enabled "+ Checkbox5.isSelected());
		
		//checkbox saturday
		System.out.println("displayed "+ Checkbox6.isDisplayed());
		System.out.println("checked "+ Checkbox6.isEnabled());
		System.out.println("enabled "+ Checkbox6.isSelected());
		
		Thread.sleep(2000);
		
		//checkbox sunday
		Checkbox.click();
		if (!Checkbox.isSelected()) {
			Checkbox.click();
		}
		//checkbox monday
		Checkbox1.click();
		if (!Checkbox1.isSelected()) {
			Checkbox1.click();
		}
		//checkbox tuesday
		Checkbox2.click();
		if (!Checkbox2.isSelected()) {
			Checkbox2.click();
		}
		//checkbox wednesday
		Checkbox3.click();
		if (!Checkbox3.isSelected()) {
			Checkbox3.click();
		}
		//checkbox thursday
		Checkbox4.click();
		if (!Checkbox4.isSelected()) {
			Checkbox4.click();
		}
		//checkbox friday
		Checkbox5.click();
		if (!Checkbox5.isSelected()) {
			Checkbox5.click();
		}
		//checkbox saturday
		Checkbox6.click();
		if (!Checkbox6.isSelected()) {
			Checkbox6.click();
		}
		
		System.out.println("----------------------------------------After Click----------------------------------------");
		

		System.out.println("displayed "+ Checkbox.isDisplayed());
		System.out.println("checked "+ Checkbox.isEnabled());
		System.out.println("enabled "+ Checkbox.isSelected());
		
		System.out.println("displayed "+ Checkbox1.isDisplayed());
		System.out.println("checked "+ Checkbox1.isEnabled());
		System.out.println("enabled "+ Checkbox1.isSelected());
		
		System.out.println("displayed "+ Checkbox2.isDisplayed());
		System.out.println("checked "+ Checkbox2.isEnabled());
		System.out.println("enabled "+ Checkbox2.isSelected());
		
		System.out.println("displayed "+ Checkbox3.isDisplayed());
		System.out.println("checked "+ Checkbox3.isEnabled());
		System.out.println("enabled "+ Checkbox3.isSelected());
		
		System.out.println("displayed "+ Checkbox4.isDisplayed());
		System.out.println("checked "+ Checkbox4.isEnabled());
		System.out.println("enabled "+ Checkbox4.isSelected());
		
		System.out.println("displayed "+ Checkbox5.isDisplayed());
		System.out.println("checked "+ Checkbox5.isEnabled());
		System.out.println("enabled "+ Checkbox5.isSelected());
		
		System.out.println("displayed "+ Checkbox6.isDisplayed());
		System.out.println("checked "+ Checkbox6.isEnabled());
		System.out.println("enabled "+ Checkbox6.isSelected()); 
		
		Thread.sleep(5000);
		
		List<WebElement> WeekCheckbox = driver.findElements(By.xpath("//input[@type= 'checkbox'][@class='form-check-input']"));
		System.out.println( "Total no of Checkboxes = "+ WeekCheckbox.size());
		
		for(int i=0; i<WeekCheckbox.size(); i++) {
			WeekCheckbox.get(i).click();
			
		}

		driver.close();
		


		
			
		
		
	}

}
