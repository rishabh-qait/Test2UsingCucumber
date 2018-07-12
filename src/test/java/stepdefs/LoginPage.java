package stepdefs;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Keyword.LoginAction;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPage {

	WebDriver driver = null;

	LoginAction loginactionobj;

	public void launch_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishabh.jain\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser has been launched ");

	}

	@Given("^I have open the browser$")
	public void openBrowser() {
		launch_Browser();
		loginactionobj = new LoginAction(driver);
	}

	@Given("^I navigate to Available examples website$")
	public void navigate_To_Examples_Website() {
		driver.get("http://10.0.31.161:9292/");

	}

	@When("I navigate to Form Authentication")
	public void clicking_Form_Authentication_Link() {

		loginactionobj.click_Form_Authentication();

	}

	@Then("Login page will display")
	public void check_Login_Page() {

		Assert.assertEquals("http://10.0.31.161:9292/login", driver.getCurrentUrl());
		driver.close();
	}

	@Given("^I have the LoginPage$")
	public void openBrowser1() {
		launch_Browser();
		loginactionobj = new LoginAction(driver);
		driver.get("http://10.0.31.161:9292/login");
	}

	@When("^I enter correct username (.*) and correct password (.*)$")
	public void i_enter_username_tomsmith_and_password_SuperSecretPassword(String userName, String password)
			throws Throwable {

		loginactionobj.sending_Credentials(userName, password);
		loginactionobj.click_Login();
	}

	@Then("^I will be  successfully logged in$")
	public void i_am_able_to_login_using_correct_credentials() throws Throwable {
		Assert.assertEquals("http://10.0.31.161:9292/secure", driver.getCurrentUrl());
		driver.close();

	}

	@When("^I enter incorrect username (.*) and incorrect password (.*)$")
	public void i_enter_incorrect_username_and_incorrect_password(String userName, String password) throws Throwable {

		loginactionobj.sending_Credentials(userName, password);
		loginactionobj.click_Login();
	}

	@Then("^I will see an error message$")
	public void i_am_able_to_see_error_msg() throws Throwable {
		Assert.assertTrue(loginactionobj.error_Message_Displayed_Successfully());
		driver.close();

	}

	@Given("^I have successfully logged in$")
	public void navigate_to_secure_area() {
		launch_Browser();
		driver.get("http://10.0.31.161:9292/login");
		loginactionobj = new LoginAction(driver);
		loginactionobj.sending_Credentials("tomsmith", "SuperSecretPassword!");
		loginactionobj.click_Login();
	}

	@Given("^Logout button is displayed$")
	public void logout_button_is_displayed() {
		Assert.assertTrue(loginactionobj.logout_Button_Displayed_Successfully());

	}

	@When("^I Logout$")
	public void click_on_Logout() {
		loginactionobj.click_Logout();
	}

	@Then("^I will navigate back to Login page$")
	public void should_navigate_back_to_Login_page() {
		Assert.assertEquals("http://10.0.31.161:9292/login", driver.getCurrentUrl());
		driver.close();
	}

}
