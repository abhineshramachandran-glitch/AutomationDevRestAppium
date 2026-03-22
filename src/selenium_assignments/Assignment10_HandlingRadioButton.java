package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment10_HandlingRadioButton extends baseFunctions {
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("chrome");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement Buttonmale = driver.findElement(By.xpath("//input[@type='radio'][@id= 'male']"));
		WebElement ButtonFemale = driver.findElement(By.xpath("//input[@type='radio'][@id= 'female']"));
		
		System.out.println("------------------------------before click-----------------------------");
		
		//print true or false for male radio button
		System.out.println("Button male displayed " + Buttonmale.isDisplayed());
		System.out.println("Button male checked " + Buttonmale.isEnabled());
		System.out.println("Button male selected " + Buttonmale.isSelected());
		
		Buttonmale.click();
		
		if (!Buttonmale.isSelected()) {
			Buttonmale.click();
		}
		
		
		//print t or f for female radio button 
		System.out.println("Button female displayed "+ ButtonFemale.isDisplayed());
		System.out.println("Button female checked "+ ButtonFemale.isEnabled());
		System.out.println("Button Female selected"+ ButtonFemale.isSelected());
		
		ButtonFemale.click();
		
		if (ButtonFemale.isSelected()) {
			ButtonFemale.click();
			
		}
		
		System.out.println("-----------------------------------after click------------------------------------");
		

		//print the after click status of male radio button
		System.out.println("Button male displayed " + Buttonmale.isDisplayed());
		System.out.println("Button male checked " + Buttonmale.isEnabled());
		System.out.println("Button male selected " + Buttonmale.isSelected());
		
		
		//print the after click status of female radio button
		System.out.println("Button female displayed "+ ButtonFemale.isDisplayed());
		System.out.println("Button female checked "+ ButtonFemale.isEnabled());
		System.out.println("Button Female selected"+ ButtonFemale.isSelected());

		Thread.sleep(4000);
		
	//taking the list of radiobutton present/ total count
		List<WebElement> RadioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total no of radio button = "+ RadioButton.size());
		
		for(int i=0; i<RadioButton.size(); i++) {
			RadioButton.get(i).click();
			
		}
		
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
