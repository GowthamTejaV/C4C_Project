package stepdefinitions;

import java.io.IOException;

import com.pages.IC_CounsellorsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class IC_CounsellorsSteps {

	@Then("Switch to counsellors tab")
	public void switch_to_counsellors_tab() throws InterruptedException {
		IC_CounsellorsPage.switchToCounsellorsTab();
	}

	@Then("Verify that the user is able to add Counsellors to the particular IC")
	public void verify_that_the_user_is_able_to_add_counsellors_to_the_particular_ic()
			throws InterruptedException, IOException {
		IC_CounsellorsPage.fillMandateCounsellor();
	}

	@Then("Verify the Delete functionality in the Counsellor tab")
	public void verify_the_delete_functionality_in_the_counsellor_tab() throws InterruptedException {
		IC_CounsellorsPage.deleteCounsellors();
	}

	@And("Click add counsellor button")
	public void Click_add_counsellor_button() throws InterruptedException {
		IC_CounsellorsPage.clickAddButtonCounsellors();
	}


	@Then("Switch to IC_overview tab")
	public void switch_to_ic_overview_tab() throws InterruptedException {
		IC_CounsellorsPage.swithcToOverviewTab();
	}

	@Then("Verify that the Counsellor with check box enabled for Current field is displayed in in the IDP Section of IC Overview tab")
	public void verify_that_the_counsellor_with_check_box_enabled_for_current_field_is_displayed_in_in_the_idp_section_of_ic_overview_tab() {
		IC_CounsellorsPage.verifyOverviewPageIDP();
	}

}
