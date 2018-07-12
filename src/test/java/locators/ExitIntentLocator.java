package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExitIntentLocator {
	
	
	
	public  WebElement get_Exit_Intent_link(WebDriver driver) 
	{
		return driver.findElement(By.linkText("Exit Intent"));
		
	}
	
	

}
