package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class  LoginPage {
	
	WebDriver   driver = null;
	
	@Given("^I have open the browser$")
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishabh.jain\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();	
	}
	@And("^I open Available examples website$")
public void navigate_To_Examples_Website() 
	{
		driver.get("http://10.0.31.161:9292/");
		
	}	
	@When("I click on Form Authentication")
	public void clicking_Form_Authentication_Link() {

		driver.findElement(By.linkText("Form Authentication")).click();
		
	}
	@Then("Login page should display")
	public void check_Login_Page() {
		
		Assert.assertEquals("http://10.0.31.161:9292/login",driver.getCurrentUrl());		
        driver.close();
	}
	
	@Given("^I have open the LoginPage$")
	public void openBrowser1() 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishabh.jain\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();	
		driver.get("http://10.0.31.161:9292/login");
	}
	
	@When("^I enter username (.*) and password (.*)$")
	public void i_enter_username_tomsmith_and_password_SuperSecretPassword(String username, String password) throws Throwable
	{
		System.out.println("usrname"+username);
		System.out.println("pwd"+password);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
	}

	@Then("^I am able to access the secure area$")
	public void i_am_able_to_login_using_correct_credentials() throws Throwable {
		Assert.assertEquals("http://10.0.31.161:9292/secure",driver.getCurrentUrl());
	  
	}

}
