package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment13_HandlingDropDown extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://register.rediff.com/register/register.php");
		
			
		WebElement DayDD = driver.findElement(By.className("day"));
		Select sc = new Select(DayDD);
		sc.selectByVisibleText("01");
		//System.out.println("Day = "+sc.getOptions().get(1).getText());
		
		
		WebElement MonthDD = driver.findElement(By.xpath("//select[@class='middle month']"));
		Select sc1 = new Select(MonthDD);
		sc1.selectByVisibleText("JAN");
		//System.out.println("Month = "+sc1.getOptions().get(1).getText());
		
		WebElement YearDD = driver.findElement(By.xpath("//select[@class='year']"));
		Select sc2 = new Select(YearDD);
		sc2.selectByVisibleText("2000");
		//System.out.println("Year = "+sc2.getOptions().get(14).getText());
		
		
		System.out.println("My Date Of Birth Is = "+sc.getOptions().get(1).getText()+sc1.getOptions().get(1).getText()+sc2.getOptions().get(14).getText());
		
	}

}
