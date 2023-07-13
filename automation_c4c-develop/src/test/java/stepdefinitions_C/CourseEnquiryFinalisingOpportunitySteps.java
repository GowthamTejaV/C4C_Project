package stepdefinitions_C;
import java.io.IOException;
import java.util.Set;

import org.testng.Assert;

import com.pages.IC_Opportunitypage;
import com.pages.LeadCreationPage;
import com.pages.OP_CourseSelectionPage;
import com.pages.OP_DocumentsPage;
import com.pages.OP_VisaDetailsPage;
import com.pages.Student360Page;
import com.qa.util.DriverFactory;
import com.qa.util.ExcelUtil;
import AppHooks.ApplicationHooks;
import io.cucumber.java.en.Then;

public class CourseEnquiryFinalisingOpportunitySteps {
	Student360Page stu = new Student360Page();
	IC_Opportunitypage opp = new IC_Opportunitypage();
	OP_VisaDetailsPage visa = new OP_VisaDetailsPage();
	OP_DocumentsPage doc = new OP_DocumentsPage();
	OP_CourseSelectionPage cou = new OP_CourseSelectionPage();
	LeadCreationPage lead = new LeadCreationPage();
	private static String visaRequired;
	private static String visaLodgementDate;
	private static String visaDecision;
	private static String visApproveDate;
	private static String visaDecisionDate;
	
  
	/*
	 * @Then("Navigate to the Documents Section and Upload the Document") public
	 * void navigate_to_the_documents_section() { opp.navigate_DOCUMENTS__TAB();
	 * doc.uploadFileFromTheLocal(); doc.click_On_refresh(); }
	 */
	@Then("^Navigate to the Documents Section and Upload the Document based on size (.*)$")
	public void navigate_to_the_documents_section_and_Upload_The_Document_based_On_size(String x) {
		opp.navigate_DOCUMENTS__TAB();
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(x);
		 String siz= ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "DocumentTestdata", "Doc_Size");
		Integer size=Integer.valueOf(siz);
		doc.uploadFileFromTheLocal_BasedOn_Size(size);
		doc.click_On_refresh();
	}

	@Then("categories attachment in Documents Section")
	public void categories_attachment_in_documents_section() throws InterruptedException, IOException {
		doc.ATTACHMENTCATEGORIES();
	}

	@Then("attaching document without attaching Visa Document")
	public void attaching_document_without_attaching_Visa_Document() {
		doc.SKIP_Visa_Related_documents_FOR_ATTACHMENT_CATEGORIES();
	}

	@Then("Navigate to Visa Details")
	public void navigate_to_visa_details() {
		opp.navigate_VISA_DETAILS__TAB();
	}

	@Then("Enter Details in Visa Details page")
	public void enter_details_in_visa_details_page() {
		visa.entert_VisaDetails("Yes", "2");
		// visa.select_visaRequired_From_DropDown("Yes");
		// visa.select_visaAssessmentLevel_DropDown("2");

	}
	
	@Then("^Enter Visa Details (.*)$")
	public void enter_visa_details(String testCaseNO) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNO);
		opp.clic_Edit_Button_OverViewPage();
		visaRequired=ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityVisaDetails", "Visa Required");
		visaLodgementDate=ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityVisaDetails", "Visa Lodgement Date");
		visaDecision=ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityVisaDetails", "Visa Decision");
		visApproveDate=ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityVisaDetails", "Visa Approved Date");
		visaDecisionDate=ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityVisaDetails", "Visa Approved Date");
		visa.enterVisaRequired(visaRequired).enterVisaLodgementDate(visaLodgementDate).enterVisaDecision(visaDecision).enterVisApproveDate(visApproveDate).enterVisaDecisionDate(visaDecisionDate);
		
	}
	@Then("Verify the all the details VISA Section")
	public void verify_all_the_details_in_VISA_section() {
		String expectedVisalodgementDateValue = stu.getFieldvalue_ByFieldlabel("Visa lodgement date");
		String expectedVisaoutcome = stu.getFieldvalue_ByFieldlabel("Visa outcome");
		String expectedApprovedDate = stu.getFieldvalue_ByFieldlabel("Visa outcome");
		
		Assert.assertEquals(visaLodgementDate, expectedVisalodgementDateValue);
		Assert.assertEquals(visaRequired, expectedVisaoutcome);
		Assert.assertEquals(visApproveDate, expectedApprovedDate);
	}

	@Then("Navigate to Course Selection tab")
	public void navigate_to_course_selection_tab() {
		opp.navigateToCOURSE_SELECTIONTab();
	}

	@Then("^Enter Details in Course Selection page (.*)$")
	public void enter_details_in_course_selection_page(String string) {
		cou.enterAllTheMadatoryFields_To_Finalise(string);

	}


	@Then("Change the application stage as Offer Received")
	public void change_the_application_stage_as_offer_received() throws InterruptedException, IOException {
		opp.enter_ApplicationStatisAs_OfferReceived();
	}

	@Then("Change the application stage as Offer Accepted by Student")
	public void change_the_application_stage_as_offer_accepted_by_student() throws InterruptedException, IOException {
		opp.enter_ApplicationStatisAs_OfferAcceptedByStudent();
	}
	/*******************************************/
	@Then("Verify the message should be display as {string}")
	public void source_mandatory_field_error_message_should_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertTrue(errSet.contains(string),"FAILED:- TO SAVE THE RECORD");
	}

}
