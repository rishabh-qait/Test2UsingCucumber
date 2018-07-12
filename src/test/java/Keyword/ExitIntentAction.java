package Keyword;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class ExitIntentAction {
	
	
	
	WebDriver driver;

	public ExitIntentAction(WebDriver driver) {
		this.driver = driver;

	}
public void verifying_Exit_Intent_Page_Displayed() {
		
		Assert.assertEquals("http://10.0.31.161:9292/exit_intent",driver.getCurrentUrl());
			
	} 
	
	
	public void move_mouse() throws AWTException, InterruptedException 
	{
		
		Robot rob = new Robot();
		int xcor=500;
        rob.mouseMove(xcor, 300);
        Thread.sleep(2000);
        rob.mouseMove(xcor, 100);
       
	
	}
	public void veriying_Modal_Window_Displayed() 
	{
		
		boolean check=driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]")).isDisplayed();
		Assert.assertTrue(check);
		String text = driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]/div[1]")).getText();
				Assert.assertEquals("THIS IS A MODAL WINDOW", text);
		
	}
	public void move_mouse_away() throws AWTException, InterruptedException 
	{
		
		Robot rob = new Robot();
		int xcor=500;
        rob.mouseMove(xcor, 300);
        Thread.sleep(2000);
        rob.mouseMove(xcor, 100);
       
	
	}
	public void verifying_Modal_Window_Disappears() throws AWTException, InterruptedException  
	{
		
		boolean check = true;
		Thread.sleep(2000);
		 check=driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]")).isDisplayed();
		Assert.assertFalse(check);	
	}	


	
	

}
