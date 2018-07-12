package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExitIntentLocator {
	
	
	
	public  WebElement get_Exit_Intent_link(WebDriver driver) 
	{
		return driver.findElement(By.linkText("Exit Intent"));
		
	}
	public  WebElement get_Modal_Window(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]"));
		
	}
	public  WebElement get_Modal_Window_Header(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]"));
		
	}
	
	
	

}
