package Keyword;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locators.LoginPageLocator;

public class LoginAction {

	WebDriver driver;
	LoginPageLocator loginpagelocatorobj;

	public LoginAction(WebDriver driver) {
		this.driver = driver;

	}
	public void click_Login() 
	{
		loginpagelocatorobj.get_Login_Button(driver).click();
		
	}
	public void click_Form_Authentication() 
	{
		loginpagelocatorobj.get_Form_Authentication_Link(driver).click();
		
	}

	public void sending_Credentials(String uname, String pwd) {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	public boolean error_Message_Displayed_Successfully() 
			{
		return loginpagelocatorobj.get_Error_Msg_Field(driver).isDisplayed();
		
		
	}
	public boolean logout_Button_Displayed_Successfully() 
	{
		
		return loginpagelocatorobj.get_Logout_Button(driver).isDisplayed();
		
	}
	public void click_Logout() 
	{
		loginpagelocatorobj.get_Logout_Button(driver).click();
		
	}
	
	
}
