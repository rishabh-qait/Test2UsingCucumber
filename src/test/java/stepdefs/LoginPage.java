package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class  LoginPage {
	
	WebDriver   driver = null;
	
	
	
	
//	@Before("@First,@Second")
//	public void before_second_scenario() 
//	{
//		System.out.println("This will execute before the execution of the scenario tagged with @First and @Second both");
//		
//	}
//	public void running_in_background() 
//	{
//		
//	}
	@Given("^I have open the browser$")
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishabh.jain\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();	
	}
	@And("^I navigate to Available examples website$")
public void navigate_To_Examples_Website() 
	{
		driver.get("http://10.0.31.161:9292/");
		
	}	
	@When("I navigate to Form Authentication")
	public void clicking_Form_Authentication_Link() {

		driver.findElement(By.linkText("Form Authentication")).click();
		
	}
	@Then("Login page will display")
	public void check_Login_Page() {
		
		Assert.assertEquals("http://10.0.31.161:9292/login",driver.getCurrentUrl());		
        driver.close();
	}
	
	
	@Given("^I have the LoginPage$")
	public void openBrowser1() 
	{
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\rishabh.jain\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();	
		driver.get("http://10.0.31.161:9292/login");
	}
	
	@When("^I enter correct username (.*) and correct password (.*)$")
	public void i_enter_username_tomsmith_and_password_SuperSecretPassword(String username, String password) throws Throwable
	{
		System.out.println("usrname"+username);
		System.out.println("pwd"+password);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
	}

	@Then("^I will be  successfully logged in$")
	public void i_am_able_to_login_using_correct_credentials() throws Throwable {
		Assert.assertEquals("http://10.0.31.161:9292/secure",driver.getCurrentUrl());
		driver.close();
	  
	}
	

//	@Given("^I have the LoginPage$")
//	public void navigate_to_the_LoginPage() 
//	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishabh.jain\\eclipse-workspace\\chromedriver.exe");
//		driver= new ChromeDriver();	
//		driver.get("http://10.0.31.161:9292/login");
//		
//		
//	}
//	
	@When("^I enter incorrect username (.*) and incorrect password (.*)$")
	public void i_enter_incorrect_username_and_incorrect_password(String username, String password) throws Throwable
	{
		System.out.println("usrname"+username);
		System.out.println("pwd"+password);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();

	}

	@Then("^I will see an error message$")
	public void i_am_able_to_see_error_msg() throws Throwable {
		boolean check=false;
		check=driver.findElement(By.xpath("//*[@id=\"flash\"]")).isDisplayed();
		
		
		
		Assert.assertTrue(check);
		driver.close();
	  
	}
	public void get_Acces_To_Secure_Area(WebDriver driver1) 
	{
          driver=driver1;
          System.out.println("URL IS "+driver.getCurrentUrl());
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();	
	}
	
	@Given("^I have successfully logged in$")
	public void navigate_to_secure_area()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishabh.jain\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();	
		driver.get("http://10.0.31.161:9292/login");
		get_Acces_To_Secure_Area(driver);	
	}
	@And("^Logout button is displayed$")
	public void logout_button_is_displayed()
	{
		boolean check=false;
        check=driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).isDisplayed();
Assert.assertTrue(check);


	}
	@When("^I Logout$")
	public void click_on_Logout()
	{
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
	}
	@Then("^I will navigate back to Login page$")
	public void should_navigate_back_to_Login_page()
	{
		Assert.assertEquals("http://10.0.31.161:9292/login",driver.getCurrentUrl());	
		driver.close();
	}

}
