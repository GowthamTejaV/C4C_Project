package stepdefinitions;

import com.pages.IC_Opportunitypage;
import com.pages.OP_EvsVisaPage;

import io.cucumber.java.en.Then;

public class OP_EvsVisaSteps {

	@Then("Switch to opportunity EVS VISA tab")
	public void switch_to_opportunity_evs_visa_tab() throws InterruptedException {
		OP_EvsVisaPage.switchToOpportunityEvsVisaTab();
	}
	@Then("Verify visa type fields is non editable")
	public void verify_visa_type_fields_is_non_editable() {
		OP_EvsVisaPage.verifyVisaTypeNonEditable();
	}
	@Then("Verify that the calendar is displayed for all date fields in the EVS VISA page")
	public void verify_that_the_calendar_is_displayed_for_all_date_fields_in_the_EVS_VISA_page() {
		OP_EvsVisaPage.verifyCalenderOfContractSigned();
		OP_EvsVisaPage.verifyCalenderOfEstimateChargeDate();
		OP_EvsVisaPage.verifyCalenderOfVisaAppSubmissionDate();
		OP_EvsVisaPage.verifyCalenderOfVisaResponseDate();
		OP_EvsVisaPage.verifyCalenderOfPassportExpiryDate();
	}
	@Then("Veirfy the toggle buttons in the EVS VISA page")
	public void veirfy_the_toggle_buttons_in_the_evs_visa_page() {
		OP_EvsVisaPage.verifyToggleButottonContractSigned();
		OP_EvsVisaPage.verifyToggleButottonAckSigned();
		
	}
	@Then("Verify that date option is available for Date of payment field")
	public void verify_that_date_option_is_available_for_date_of_payment_field() throws InterruptedException {
		OP_EvsVisaPage.clickaddRow();
		OP_EvsVisaPage.verifyCalenderOfDateOfPayment();
	}
	@Then("Verify that the Amount paid field contains a text box")
	public void verify_that_the_amount_paid_field_contains_a_text_box() throws InterruptedException {
		OP_EvsVisaPage.verifyAmountPaid();
		OP_EvsVisaPage.clickCancel();
	}
	@Then("Verify the opportunity tabs picklist")
	public void verify_the_opportunity_tabs_picklist() throws Exception {
		OP_EvsVisaPage.verifyOpportunityTabPicklist();
	}
	@Then("Verify the visa assesment level picklist")
	public void verify_the_visa_assesment_level_picklist() throws Exception {
		OP_EvsVisaPage.verifyVisaAssesmentLevelPicklist();
	}
	@Then("Verify the visa submission channel picklist")
	public void verify_the_visa_submission_channel_picklist() throws Exception {
		OP_EvsVisaPage.verifyVisaSubmissionChannelPicklist();
	}
	@Then("Verify the passport issuing country picklist")
	public void verify_the_passport_issuing_country_picklist() throws Exception {
		OP_EvsVisaPage.verifyPassportIssuingCountryPicklist();
	}
	@Then("Verify the visa application fee picklist")
	public void verify_the_visa_application_fee_picklist() throws Exception {
		OP_EvsVisaPage.verifyApplicationFeePicklist();
	}
	@Then("Verify the payment details picklist")
	public void verify_the_payment_details_picklist() throws Exception {
		OP_EvsVisaPage.verifyPaymentDetailsHeaderPicklist();
	}
	@Then("Verify the visa payment type picklist")
	public void verify_the_visa_payment_type_picklist() throws Exception {
		OP_EvsVisaPage.verifyVisaPaymentTypePicklist();
	}
}
