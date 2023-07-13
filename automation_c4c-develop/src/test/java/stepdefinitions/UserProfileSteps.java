package stepdefinitions;

import java.io.IOException;

import com.pages.UserProfilePage;

import io.cucumber.java.en.Then;

public class UserProfileSteps {
	@Then("Click on the profile icon")
	public void click_on_the_profile_icon() throws InterruptedException {
		UserProfilePage.clickUserProfile();
	}
	@Then("Click on the profile name hyperlink")
	public void click_on_the_profile_name_hyperlink() throws InterruptedException {
		UserProfilePage.clickUserProfileLink();
	}

	@Then("Click on more button from profile")
	public void click_on_more_button_from_profile() throws InterruptedException {
		UserProfilePage.clickMore();
	}


	@Then("Click on edit profile button")
	public void click_on_edit_profile_button() throws InterruptedException {
		UserProfilePage.clickEdit();
	}

	@Then("Select mara agent location as australia")
	public void select_mara_agent_location_as_australia() throws InterruptedException, IOException {
		UserProfilePage.selectCountry("Australia");
	}

	@Then("Select mara agent location as india")
	public void select_mara_agent_location_as_india() throws InterruptedException, IOException {
		UserProfilePage.selectCountry("India");
	}

}
