package stepdefinitions;

import java.io.IOException;

import com.pages.OP_IdpDirectPage;

import io.cucumber.java.en.And;

public class OP_IDPdirectSteps {
	OP_IdpDirectPage idp = new OP_IdpDirectPage();

	// use
	@And("Switch to IDP direct page")
	public void Switch_to_IDP_direct__page() throws InterruptedException {
		idp.SwitchIDPdirectTab();
	}

	// use
	@And("Enter all the required details in IDP direct page")
	public void Enter_all_the_required_details_in_IDP_direct_page() throws InterruptedException, IOException {
		idp.applicationDetail();
		idp.visaProcess();
		idp.pathway();
		idp.englishProficiency();

	}

	@And("Enter all the required details in IDP direct page UST university")
	public void Enter_all_the_required_details_in_IDP_direct_page_UST_university()
			throws InterruptedException, IOException {
		OP_IdpDirectPage.UTSuniverityIDP();

	}

}
