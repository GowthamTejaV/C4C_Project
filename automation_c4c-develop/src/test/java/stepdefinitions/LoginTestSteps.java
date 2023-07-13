package stepdefinitions;

import com.pages.LoginTestPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
	@Given("User launch the {string}")
	public void user_launch_the(String username) throws InterruptedException {
		LoginTestPage.launchURl(username);
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string1, String string2) throws InterruptedException {
		LoginTestPage.enterUsername(string1, string2);
	}

	@Then("User click login button")
	public void user_click_login_button() throws InterruptedException {
		LoginTestPage.clickSignin();
	}

}
