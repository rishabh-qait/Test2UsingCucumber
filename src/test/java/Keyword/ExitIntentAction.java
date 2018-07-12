package Keyword;

import java.awt.AWTException;
import java.awt.Robot;


import org.openqa.selenium.WebDriver;


import locators.ExitIntentLocator;

public class ExitIntentAction {
	
	
	
	WebDriver driver;
	ExitIntentLocator exitintentlocatorobj;

	public ExitIntentAction(WebDriver driver) {
		this.driver = driver;

	}
	public void click_Exit_Intent_Link() 
	{
	exitintentlocatorobj.get_Exit_Intent_link(driver).click();	
		
	}

	
	
	public void move_Mouse_Out_Of_Window() throws AWTException, InterruptedException 
	{
		
		Robot rob = new Robot();
		int xcor=500;
        rob.mouseMove(xcor, 300);
        Thread.sleep(2000);
        rob.mouseMove(xcor, 100);
       
	
	}
	public String getting_Modal_Window_Text() 
	{
		
		
		return exitintentlocatorobj.get_Modal_Window_Header(driver).getText();
				
		
	}
	public void move_mouse_away() throws AWTException, InterruptedException 
	{
		
		Robot rob = new Robot();
		int xcor=500;
        rob.mouseMove(xcor, 300);
        Thread.sleep(2000);
        rob.mouseMove(xcor, 100);
       
	
	}
	public boolean verifying_Modal_Window_Disappears() throws AWTException, InterruptedException  
	{
		
		Thread.sleep(2000);
		 return exitintentlocatorobj.get_Modal_Window(driver).isDisplayed();	
	}	
	public boolean verifying_Modal_Window_Appears() throws AWTException, InterruptedException  
	{
		
		Thread.sleep(2000);
		 return exitintentlocatorobj.get_Modal_Window(driver).isDisplayed();	
	}	


	
	

}
