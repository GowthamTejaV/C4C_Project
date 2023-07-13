package stepdefinitions;

import java.io.IOException;

import com.pages.CourseSelectionPage;
import com.pages.IC_Opportunitypage;
import com.pages.OP_CourseSelectionPage;
import com.pages.OP_DocumentsPage;
import com.pages.OP_VisaDetailsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FinaliseOpportunitySteps {
//{
	OP_VisaDetailsPage visa = new OP_VisaDetailsPage();
	OP_DocumentsPage doc = new OP_DocumentsPage();
	IC_Opportunitypage opportunity = new IC_Opportunitypage();
	OP_CourseSelectionPage cou = new OP_CourseSelectionPage();

	// use
	@Then("click on opportunity global Edit icon")
	public void click_on_opportunity_global_edit_icon() throws InterruptedException {
		opportunity.clic_Edit_Button_OverViewPage();
	}

	// use
	@Then("Change the application stage as Offer Accepted by Student dropdown")
	public void change_the_application_stage_as_offer_accepted_by_student_dropdown()
			throws InterruptedException, IOException {
		opportunity.enter_ApplicationStatisAs_OfferAcceptedByStudent();
	}

	// use
	@And("Enter the Institution Preference")
	public void enter_the_institution_preference() throws InterruptedException, IOException {
		opportunity.enter_institution_Preference();
	}

	// use
	@And("Enter the Submission Method")
	public void enter_the_submission_method() throws InterruptedException, IOException {
		opportunity.enter_submission_Method();
	}

	@And("Enter the Submission Method Email")
	public void enter_the_submission_method_Email() throws InterruptedException, IOException {
		opportunity.enter_submission_Method_Email();
	}

	// use
	@And("Enter the Service Level")
	public void enter_the_service_level() throws IOException, InterruptedException {
		opportunity.enter_service_Level();
	}

	// use
	@And("Enter the offer Received Date Train")
	public void enter_the_offer_received_date_Train() throws InterruptedException, IOException {
		opportunity.enter_offerReceivedDateTrain();
	}

	@And("Enter the offer Received Date")
	public void enter_the_offer_received_date() throws InterruptedException, IOException {
		opportunity.enter_offerReceivedDate();
	}

	// use
	@And("Navigate to Course Selection")
	public void navigate_to_course_selection() {
		opportunity.navigateToCOURSE_SELECTIONTab();
	}

	// use
	@And("Enter Details in Course Selection page")
	public void enter_details_in_course_selection_page() throws InterruptedException, IOException {
		cou.enterAllTheMadatoryFields_To_Finalise();
	}

	@And("Enter the Details in Course Selection page Train")
	public void enter_the_details_in_course_selection_page_Train() throws InterruptedException, IOException {
		cou.enterAllTheMadatoryFields_To_FinaliseTrain("No");
	}

	@And("Enter the Details in Course Selection page OfferAccepted No")
	public void enter_the_details_in_course_selection_page_OfferAccepted_No() throws InterruptedException, IOException {
		cou.enterAllTheMadatoryFields_To_FinaliseTrain_OfferAcceptanceNo();
	}

	// use
	@And("Navigate to Visa Details tab")
	public void navigate_to_visa_details_tab() {
		opportunity.navigate_VISA_DETAILS__TAB();
	}

	// use
	@And("Enter Details in Visa Details tab")
	public void enter_details_in_visa_details_tab() throws InterruptedException, IOException {
		visa.select_visaRequired_From_DropDown();
		visa.select_visaAssessmentLevel_DropDown();
		;
	}

	// use
	@And("Navigate to the Documents Section and Upload the Document")
	public void navigate_to_the_documents_section_and_upload_the_document() throws InterruptedException {
		opportunity.navigate_DOCUMENTS__TAB();
		doc.uploadFileFromTheLoacl();
		doc.click_On_refresh();
	}

	// use
	@Then("categories attachment in Documents")
	public void categories_attachment_in_documents() throws InterruptedException, IOException {
		doc.ATTACHMENT_CATEGORIES();
	}

	// use
	@And("Finalise the Opportunity")
	public void finalise_the_opportunity() {
		opportunity.clickOn_Finalise();
	}

	@Then("Verify the header message")
	public void verify_the_header_message() {
	   OP_DocumentsPage.verifyHeaderMessage();
	}
	@Then("Move second course to first in course list")
	public void move_second_course_to_first_in_course_list() throws InterruptedException, IOException {
	CourseSelectionPage.switchCourse();
	}
	@Then("Change offer accepted to YES")
	public void change_offer_accepted_to_yes() throws InterruptedException, IOException {
		 OP_CourseSelectionPage.offerAcceptanceYes();
	}
	@Then("Switch to Documents tab")
	public void switch_to_documents_tab() throws InterruptedException {
		OP_DocumentsPage.switchToDocumentsTab();
	}

	@Then("Click refresh button")
	public void click_refresh_button() {
		OP_DocumentsPage.click_On_refresh();
	}


}
