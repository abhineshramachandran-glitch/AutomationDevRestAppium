package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SA_16_Handling_DropDown extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		driver.get("https://register.rediff.com/register/register.php");
		
		WebElement CountryDD = driver.findElement(By.id("country"));
		
		Select sc = new Select(CountryDD);  //sc class method executes on countryDD
		
		//default option from countryDD
		System.out.println("default country = "+sc.getFirstSelectedOption().getText());
		
		//get options based on index
		System.out.println("get option "+sc.getOptions().get(0).getText());
		System.out.println("get option "+sc.getOptions().get(99).getText());
		System.out.println("get option "+sc.getOptions().get(20).getText());
		
		
	    //print the size of options
	    System.out.println("size of DD "+sc.getOptions().size());
			    
		List<WebElement> options = sc.getOptions();
		for(WebElement ddOption:options) {
			
			System.out.println("get text from options "+ddOption.getText());	
		} 
    
		sleep();		
		
		//select value option using DD using visible text

		sc.selectByVisibleText("Bermuda");
		System.out.println("new = "+sc.getFirstSelectedOption().getText());
		
		sleep();
		
		//select option from DD using value
		
		sc.selectByValue("39"); 
		
		//select option from DD using value

		sc.selectByIndex(5); 
		
		driver.close();
	}

}
