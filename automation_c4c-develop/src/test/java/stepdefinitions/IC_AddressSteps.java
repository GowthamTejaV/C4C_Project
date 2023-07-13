package stepdefinitions;

import java.io.IOException;

import com.pages.IC_AddressPage;
import com.pages.IC_CreationPage;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.Then;

public class IC_AddressSteps {

	@Then("Click show communication details toggle")
	public void click_show_communication_details_toggle() throws InterruptedException {
		IC_CreationPage.verifyShowCommunicationDetails();
	}

	@Then("Switch to address tab")
	public void switch_to_address_tab() throws InterruptedException {
		IC_AddressPage.switchToAddressTab();
	}

	@Then("Click add address icon")
	public void click_add_address_icon() throws InterruptedException {
		IC_AddressPage.clickAddAddress();
	}

	@Then("Fill mandatory fields in new address page")
	public void fill_mandatory_fields_in_new_address_page() throws InterruptedException, IOException {
		IC_AddressPage.fillMandatoryFieldsAddress();
	}

	@Then("Click add address button in footer")
	public void click_add_address_button_in_footer() throws InterruptedException {
		IC_AddressPage.addAddressFooter();
	}

	@Then("Click on edit button")
	public void click_on_edit_button() throws InterruptedException {
		IC_AddressPage.clickEdit();
	}

	@Then("Update the address fields")
	public void update_the_address_fields() throws InterruptedException, IOException {
		IC_AddressPage.fillMandatoryFieldsAddress();
	}

	@Then("Switch to IC-overview tab")
	public void switch_to_ic_overview_tab() throws InterruptedException {
		IC_AddressPage.switchToOverviewTab();
		IC_AddressPage.switchToOverviewTab();
	}

	@Then("Verify that the Addresses tab is not displayed when the Show communication details radio button is turned off")
	public void verify_that_the_addresses_tab_is_not_displayed_when_the_show_communication_details_radio_button_is_turned_off()
			throws InterruptedException {
		IC_AddressPage.verifyAddressTab();
	}

}
