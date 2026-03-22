package selenium_assignments;

import org.openqa.selenium.By;

public class Assignment04_LocateBy_Absolute_n_Relative_Xpath extends baseFunctions {
	
	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		
		driver.get("https://testyou.in/Login.aspx");
		
		//relative xpath
		
		//driver.findElement(By.xpath("//input[@name='ctl00$CPHContainer$txtUserLogin']")).sendKeys("praveen@gmail.com");
		
		//driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtPassword']")).sendKeys("45456889");
		
		//driver.findElement(By.xpath("//input[@name='ctl00$CPHContainer$btnLoginn']")).click();
		
		//absolute xpath
		
		driver.findElement(By.xpath("//*[@id='ctl00_CPHContainer_txtUserLogin\']")).sendKeys("abhinesh@gmail.com");
		driver.findElement(By.xpath("//*[@id='ctl00_CPHContainer_txtPassword\']")).sendKeys("2435465688");
		driver.findElement(By.xpath("//*[@id='ctl00_CPHContainer_btnLoginn\']")).click();
		
		
		String ErrorText = driver.findElement(By.xpath("//span[@class='lblboxerror']")).getText();
		
		System.out.println("Output Text " + ErrorText );
		
		
		
		
		
	}

}
