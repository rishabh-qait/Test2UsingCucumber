package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
	

	public WebElement get_Login_Button(WebDriver driver) 
	{
		
		return driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		
	}
}
