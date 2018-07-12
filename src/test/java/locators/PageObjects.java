package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
	

	public WebElement get_Login_Button(WebDriver driver) 
	{
		
		return driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		
	}

	public WebElement get_Form_Authentication_Link(WebDriver driver) 
	{
		
		return driver.findElement(By.linkText("Form Authentication"));
		
	}
	
	public WebElement get_Error_Msg_Field(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//*[@id=\"flash\"]"));
		
		
	}
	public WebElement get_Logout_Button(WebDriver driver) 
	{
		
		return  driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		
	}
	
	
	
}
