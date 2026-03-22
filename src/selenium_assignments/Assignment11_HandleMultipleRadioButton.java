package selenium_assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment11_HandleMultipleRadioButton extends baseFunctions {
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("chrome");
		
		driver.get("https://practice.expandtesting.com/radio-buttons");
		
		WebElement RadioButtonBlue = driver.findElement(By.xpath("//input[@id='blue']"));
		WebElement RadioButtonRed = driver.findElement(By.xpath("//input[@id='red']"));
		WebElement RadioButtonYellow = driver.findElement(By.xpath("//input[@id='yellow']"));
		WebElement RadioButtonBlack = driver.findElement(By.xpath("//input[@id='black']"));
		WebElement RadioButtonGreen = driver.findElement(By.xpath("//input[@value='green'][@id= 'green']"));
	

		
		System.out.println("==========================================before click========================================");
		
		sleep();
		
		System.out.println("-----------------------status of blue---------------------------");
		
		System.out.println("radio button blue is displayed " + RadioButtonBlue.isDisplayed());
		System.out.println("radio button blue is checked " + RadioButtonBlue.isEnabled());
		System.out.println("radio button blue is selected " + RadioButtonBlue.isSelected());
		
		RadioButtonBlue.click();
		
		if (!RadioButtonBlack.isSelected()) {
			RadioButtonBlack.click();
		}
		
		sleep();
		
		System.out.println("--------------------------status of red----------------------------");
		
		System.out.println("radio button red is displayed " + RadioButtonRed.isDisplayed());
		System.out.println("radio button red is checked " + RadioButtonRed.isEnabled());
		System.out.println("radio button red is selected " + RadioButtonRed.isSelected());
		
		RadioButtonRed.click();
		
		if(!RadioButtonRed.isSelected()) {
			RadioButtonRed.click();
		}
		
		sleep();
		
		System.out.println("--------------------------status of yellow----------------------------");
		
		System.out.println("radio button yellow is displayed " + RadioButtonYellow.isDisplayed());
		System.out.println("radio button yellow is checked " + RadioButtonYellow.isEnabled());
		System.out.println("radio button yellow is selected " + RadioButtonYellow.isSelected());
		
		RadioButtonYellow.click();
		
		if(!RadioButtonYellow.isSelected()) {
			RadioButtonYellow.click();
		}
		
		sleep();
		
		System.out.println("-------------------------status of black-----------------------------");
		
		System.out.println("radio button black is displayed " + RadioButtonBlack.isDisplayed());
		System.out.println("radio button black is checked " + RadioButtonBlack.isEnabled());
		System.out.println("radio button black is selected " + RadioButtonBlack.isSelected());
		
		RadioButtonBlack.click();
		
		if(!RadioButtonBlack.isSelected()) {
			RadioButtonBlack.click();
		}
		
		sleep();
		
		System.out.println("----------------------------status of green-------------------------------");
		System.out.println("radio button green is displayed " + RadioButtonGreen.isDisplayed());
		System.out.println("radio button green is checked " + RadioButtonGreen.isEnabled());
		System.out.println("radio button green is selected " + RadioButtonGreen.isSelected());
		
		//RadioButtonGreen.click();
		
		if(!RadioButtonGreen.isSelected()) {
			//RadioButtonGreen.click();
		}
		
		sleep();

		
		System.out.println("====================================after click====================================");
		
		
        System.out.println("-----------------------status of blue---------------------------");
		
		System.out.println("radio button blue is displayed " + RadioButtonBlue.isDisplayed());
		System.out.println("radio button blue is checked " + RadioButtonBlue.isEnabled());
		System.out.println("radio button blue is selected " + RadioButtonBlue.isSelected());
		
        System.out.println("--------------------------status of red----------------------------");
		
		System.out.println("radio button red is displayed " + RadioButtonRed.isDisplayed());
		System.out.println("radio button red is checked " + RadioButtonRed.isEnabled());
		System.out.println("radio button red is selected " + RadioButtonRed.isSelected());
		
        System.out.println("--------------------------status of yellow----------------------------");
		
		System.out.println("radio button yellow is displayed " + RadioButtonYellow.isDisplayed());
		System.out.println("radio button yellow is checked " + RadioButtonYellow.isEnabled());
		System.out.println("radio button yellow is selected " + RadioButtonYellow.isSelected());
		
        System.out.println("-------------------------status of black-----------------------------");
		
		System.out.println("radio button black is displayed " + RadioButtonBlack.isDisplayed());
		System.out.println("radio button black is checked " + RadioButtonBlack.isEnabled());
		System.out.println("radio button black is selected " + RadioButtonBlack.isSelected());
		
		System.out.println("----------------------------status of green-------------------------------");
		System.out.println("radio button green is displayed " + RadioButtonGreen.isDisplayed());
		System.out.println("radio button green is checked " + RadioButtonGreen.isEnabled());
		System.out.println("radio button green is selected " + RadioButtonGreen.isSelected());
		
		sleep();	
		
		List<WebElement> ColourRadioButton = driver.findElements(By.xpath("//input[@type='radio'][@name= 'color']"));
		
		System.out.println("Total no of Color radio button = "+ ColourRadioButton.size());
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		for (WebElement element : ColourRadioButton) {
		    wait.until(ExpectedConditions.elementToBeClickable(element));
		    element.click();
		}

		
		
		for (int i=0; i<ColourRadioButton.size(); i++) {
			ColourRadioButton.get(i).click();
			
		}
		
		driver.close();
			
		
	}

}
