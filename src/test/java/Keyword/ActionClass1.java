package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionClass1 {
	
	
	WebDriver driver ;
	public ActionClass1(WebDriver driver ) 
	{
		this.driver = driver;
		
	}
	
	public void sending_Credentials(String uname, String  pwd) 
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		
	}

	
	
	

}
