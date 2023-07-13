package stepdefinitions;

import java.io.IOException;

import com.pages.OP_ManualApplicationPage;

import io.cucumber.java.en.Then;

public class OP_ManualApplicationSteps {


	@Then("Switch to Manual Application page")
	public void switch_to_manual_application_page() throws InterruptedException {
		OP_ManualApplicationPage.switchManualApplicationTab();
	}

	@Then("Fill mandatory fields in manual application page")
	public void fill_mandatory_fields_in_manual_application_page() throws InterruptedException, IOException {
		OP_ManualApplicationPage.fillMandatoryManualApplication();
	}

}
