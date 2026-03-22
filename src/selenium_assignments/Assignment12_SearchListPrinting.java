package selenium_assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment12_SearchListPrinting extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Virat Kohili");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));
		
		List<WebElement> SearchList = driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));
		
		System.out.println("Total Count Of Search List = "+SearchList.size());
				
		
		for(int i=0; i<SearchList.size(); i++) {
			System.out.println("Text of each suggestions = "+SearchList.get(i).getText());
		}
		
		//driver.close();
		
	}

}
