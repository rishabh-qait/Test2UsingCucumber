package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Keyword.ExitIntentAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class ExitIntentCucumber {

	WebDriver driver;

	ExitIntentAction exitintentactionobj;

	public void launch_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishabh.jain\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Exit Intent Browser");
	}

	@Given("^I launch Browser$")
	public void i_launch_Browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		launch_Browser();

		exitintentactionobj = new ExitIntentAction(driver);
	}

	@Given("^navigate to the Available Examples Website$")
	public void navigate_to_the_Available_Examples_Website() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://10.0.31.161:9292/");

	}

	@When("^I navigate to the exit intent page$")
	public void i_navigate_to_the_exit_intent_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exitintentactionobj.click_Exit_Intent_Link();

	}

	@Then("^Exit intent page will be displayed$")
	public void exit_intent_page_will_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Assert.assertEquals("http://10.0.31.161:9292/exit_intent",driver.getCurrentUrl());
		driver.close();

	}

	@Given("^I am on the exit intent page$")
	public void i_am_on_the_exit_intent_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		launch_Browser();

		exitintentactionobj = new ExitIntentAction(driver);
		driver.get("10.0.31.161:9292/exit_intent");

	}

	@When("^I move mouse over the page and then out of the window$")
	public void i_move_mouse_over_the_page_and_then_out_of_the_window() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exitintentactionobj.move_Mouse_Out_Of_Window();

	}

	@Then("^overlay model pops up$")
	public void overlay_model_pops_up() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(exitintentactionobj.verifying_Modal_Window_Appears());
		Assert.assertEquals("THIS IS A MODAL WINDOW",exitintentactionobj.getting_Modal_Window_Text());
		driver.close();
	}

	@Given("^overlay model been popped up$")
	public void overlay_model_been_popped_up() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		launch_Browser();

		exitintentactionobj = new ExitIntentAction(driver);
		driver.get("10.0.31.161:9292/exit_intent");
		exitintentactionobj.move_Mouse_Out_Of_Window();

	}

	@When("^I click on the page anywhere outside of the modal overlay popup$")
	public void i_click_on_the_page_anywhere_outside_of_the_modal_overlay_popup() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		exitintentactionobj.move_mouse_away();
	}

	@Then("^it defocusses the model overlay popup$")
	public void it_defocusses_the_model_overlay_popup() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(exitintentactionobj.verifying_Modal_Window_Disappears());
		driver.close();
	}

}
