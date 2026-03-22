package webdriver_demo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SA_25_Handling_FileUpload extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		LaunchURL("https://demoqa.llq.vn/");
				
		driver.findElement(By.cssSelector("svg[baseProfile='tiny']")).click();
		
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		
		//putting data into the form
		
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Abhinesh");
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Ramachandran");
		
		driver.findElement(By.id("userEmail")).sendKeys("abhinesh@gmail.com");
		
		//radiobutton selecting 
		
		WebElement radiobutton =  driver.findElement(By.xpath("//label[text()='Male']"));
		
		radiobutton.click();
		
		//mobile no adding field
		
		driver.findElement(By.id("userNumber")).sendKeys("5895478956");
		
		//date of birth choosing
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
		
		// putting the subject on the subject box
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/form/div[6]/div[2]/div/span/span[1]/span")).sendKeys("Compu");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='select2-results']"))).click();
		
		//checkbox selecting
		
		WebElement Checkbox = driver.findElement(By.xpath("//label[text()='Sports']"));
		
		Checkbox.click();
				
		//uploading file on the file uploading area
		
		String filepath = "C:\\Users\\abhin\\OneDrive\\Pictures";
		
		driver.findElement(By.id("uploadPicture")).sendKeys(filepath);
		
		driver.findElement(By.id("currentAddress")).sendKeys("ABC Building 4th Floor House Number 245/65 656cc Sri Ram Nagar, Banglore India 458978 ");
		
		//select the state dd
		
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		
		driver.findElement(By.xpath("//li[text()='NCR']")).click();
		
		//select the district dd
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/form/div[10]/div[3]/span/span[1]/span")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(), 'Delhi')]"))).click();
		
		//submit the entire data using the submit button
		
		driver.findElement(By.id("submit")).click();
		
		
		driver.close();
		
	}

}
