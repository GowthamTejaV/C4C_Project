package stepdefinitions;

import com.pages.IC_MarkettingPermisionPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class IC_MarkettingPermisionSteps {
	@Then("Switch to marketing permission tab")
	public void switch_to_marketing_permission_tab() throws InterruptedException {
		IC_MarkettingPermisionPage.switchToMarkettingPermission();

	}

	@Then("Ensure the counsellor is able to update by clicking opt_in button")
	public void ensure_the_counsellor_is_able_to_update_by_clicking_opt_in_button() throws InterruptedException {
		IC_MarkettingPermisionPage.clickOptInSection();
	}

	@Then("Ensure the counsellor is able to update by clicking opt_out button")
	public void ensure_the_counsellor_is_able_to_update_by_clicking_opt_out_button() throws InterruptedException {
		IC_MarkettingPermisionPage.clickOptOutSection();
	}

	@Then("Ensure the counsellor is able to update by clicking undefined button")
	public void ensure_the_counsellor_is_able_to_update_by_clicking_undefined_button() throws InterruptedException {
		IC_MarkettingPermisionPage.clickUndefinedSection();
	}

	@And("Verify SMS set to optout")
	public void Verify_SMS_set_to_optout() throws InterruptedException {
		IC_MarkettingPermisionPage.clickOptOutSection();
	}


}
