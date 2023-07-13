package stepdefinition_DocumentManagement;

import org.junit.Assert;

import com.pages.IC_CreationPage;
import com.pages.IC_DocumentsPage;
import com.pages.DocumentManagementSystemRegression.DocumentManagementSystemPage;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DocumentManagement_StepDefinitions {
	public static String docTyp;
	IC_CreationPage create = new IC_CreationPage();
	DocumentManagementSystemPage dms = new DocumentManagementSystemPage();
	IC_DocumentsPage doc = new IC_DocumentsPage();

	@Then("^Search for a record using studentID (.*)$")
	public void search_for_a_record_using_studentID(String testCaseID) throws InterruptedException {
		String studID=ConfigReader.getApplicationPropertie("studentID");
		create.search_for_IC(studID); 
	}
	@Then("Search for a record using studentID")
	public void search_for_a_record_using_student() throws InterruptedException {
		String studID=ConfigReader.getApplicationPropertie("studentID");
		create.search_for_IC(studID); 
	}

	// ------------------------------------------

	@Then("^Upload document on Document management (.*)$")
	public void upload_document_on_document_management(String docname) {

		dms.upload_Document(docname);
	}

	@Then("Group the selected Document")
	public void group_the_selected_document() {
		dms.click_group_selected_document();
	}

	@Then("^Select the category and document type as (.*) and (.*)$")
	public void select_the_category_as_and_document_type_as_and(String category, String docType) {
		docTyp = docType;
		dms.document_Properties(category, docType);
	}

	@Then("User click on the Confirm and Upload")
	public void user_click_on_the_confirm_and_upload() {
		dms.click_On_Confirm_And_Upload();
	}

	@Then("User click on review SignOff button")
	public void user_click_on_review_sign_off_button() {
		dms.userClickOnReviewSignOff();

	}

	@Then("User verify the status is Verified")
	public void user_verify_the_status_is_verified() {
		String txt = "Verified";
		Assert.assertTrue(txt.contains(dms.get_Status()));
		System.out.println(dms.get_Status());
	}

	@Then("User Navigate into the Histrocial Document tab")
	public void user_navigate_into_the_histrocial_document_tab() {
		dms.switch_To_HISTORICAL_DOCUMENT();
	}
	
	@Then("User Switch to Opportunity Page")
	public void user_switch_to_opportunity_page() {
	    dms.switchTo_Opportunity();
	}
	@Then("User Open the Opportunity")
	public void user_open_the_opportunity() {
		dms.click_on_the_Opportunity();
	}
	@Then("Navigate to Documnet Tab")
	public void navigate_to_documnet_tab() {
	   dms.navigate_To_DocumentTab();
	}

	@Then("user move to available to attach section")
	public void user_move_to_available_to_attach_section() {
		dms.moveTo_available_to_attach_Section();
	}
	
	
	@Then("Verified document should displayed in Document Tab")
	public void verified_document_should_displayed_in_document_tab() {
		String expectedResult = docTyp.replace(" ", "");
		String actualResult = dms.get_VerifiedDocumentText_In_DocumentTAB();
		Assert.assertTrue(actualResult.contains(expectedResult));

		System.out.println(expectedResult + "    " + actualResult);
	}
	@Then("Verified document should displayed")
	public void verified_document_should_displayed() {
		String expectedResult = docTyp.replace(" ", "");
		System.out.println("Before Replace:- "+docTyp);
		System.out.println("After Replace:- "+expectedResult);
		String actualResult = dms.get_VerifiedDocumentText();
		Assert.assertTrue(actualResult.contains(expectedResult));

		System.out.println(expectedResult + "    " + actualResult);
	}

	@Then("User Enter the expiry Date")
	public void user_enter_the_expiry_date() {
		dms.datePicker("2024", "FEB", "9");
	}

	@Then("User click on DMS next button")
	public void user_click_on_dms_next_button() {
		dms.click_On_the_Next();
	}

	@Then("Click on the Verified option from the Decision picklist")
	public void click_on_the_verified_option_from_the_decision_picklist() {
		dms.enter_the_decisionField();
	}

	@Then("User clicks on Confirm Send Button")
	public void user_clicks_on_confirm_send_button() {
		dms.click_On_ConfirmSend_Button();
	}
	

@Then("Verify the document successfully reviewed")
public void verify_the_document_successfully_reviewed() {
	String actual=dms.get_SuccessMessageOfReviewedDocument();
	String expectresult="Document successfully reviewed";
	Assert.assertTrue(expectresult.contains(actual));
}

	@Then("User verify the document reviewed successfully")
	public void user_verify_the_document_reviewed_successfully() {
		Assert.assertTrue(dms.isReviewed());
	}

	@Then("^Upload Document (.*)$")
	public void upload_document_ieltstest(String docName) {

	}

	// use
	@And("Navigate to document management tab")
	public void Switch_to_document_management_tab() throws InterruptedException {
		doc.switchDocumentsManageTab();
		dms.switch_to_Doc_frames();
	}
	
	@And("Navigate to document management")
	public void navigate_to_document_management() throws InterruptedException {
		doc.navigateToDMtab();
		dms.switch_to_Doc_frames();
	}
	
	

	@Then("User select the uploaded file")
	public void user_select_the_uploaded_file() {
		dms.selectThe_firstDoc_CheckBoxIn_reviewSignOff_page();
	}

	@Then("User clicks on the delete icon in review SignOff page")
	public void user_clicks_on_the_delete_icon_in_review_sign_off_page() {
		dms.click_on_DeleteIcon_In_ReviewSignOffPage();
	}
	
	@Then("User clicks on the Dowload icon in review SignOff page")
	public void user_clicks_on_the_dowload_icon_in_review_sign_off_page() {
		dms.click_on_DowloadIcon_In_ReviewSignOffPage();
	}
	


	@Then("Verify the extract data are displayed for IELTS extract")
	public void verify_the_extract_data_are_displayed_for_ielts_extract() {

		boolean listeningScore = !dms.get_IELTSListeningScore().isBlank();
		Assert.assertTrue("listeningScore :-THE VALUE IS BLANK", listeningScore);
		System.out.println(listeningScore);

		boolean testDate = !dms.get_testDate().isBlank();
		Assert.assertTrue("testDate :-THE VALUE IS BLANK", testDate);
		System.out.println(testDate);

		boolean testReferenceNo = !dms.get_testReferenceNumber().isBlank();
		Assert.assertTrue("testReferenceNo :-THE VALUE IS BLANK", testReferenceNo);
		System.out.println(testReferenceNo);

		boolean IELTSReadingScore = !dms.get_IELTSReadingScore().isBlank();
		Assert.assertTrue("IELTSReadingScore :-THE VALUE IS BLANK", IELTSReadingScore);
		System.out.println(IELTSReadingScore);

		boolean IELTSWritingScore = !dms.get_IELTSWritingScore().isBlank();
		Assert.assertTrue("IELTSWritingScore :-THE VALUE IS BLANK", IELTSWritingScore);
		System.out.println(IELTSWritingScore);

		boolean IELTSSpeakingScore = !dms.get_IELTSSpeakingScore().isBlank();
		Assert.assertTrue("IELTSSpeakingScore :-THE VALUE IS BLANK", IELTSSpeakingScore);
		System.out.println(IELTSSpeakingScore);

		boolean TotalScore = !dms.get_TotalScore().isBlank();
		Assert.assertTrue("TotalScore :-THE VALUE IS BLANK", TotalScore);
		System.out.println(TotalScore);

	}

	@Then("Verify the extract data are displayed for Passport extract")
	public void verify_the_extract_data_are_displayed_for_passport_extract() {
		
		boolean firstName=!dms.get_firstName().isBlank();
		Assert.assertTrue("firstName :-THE VALUE IS BLANK",firstName);
		System.out.println(firstName);
		
		boolean lastname=!dms.get_lastname().isBlank();
		Assert.assertTrue("lastname :-THE VALUE IS BLANK",lastname);
		System.out.println(lastname);
		
		boolean dateOfBirth=!dms.get_dateOfBirth().isBlank();
		Assert.assertTrue("dateOfBirth :-THE VALUE IS BLANK",dateOfBirth);
		System.out.println(dateOfBirth);
		
		boolean nationality=!dms.get_nationality().isBlank();
		Assert.assertTrue("nationality :-THE VALUE IS BLANK",nationality);
		System.out.println(nationality);
	   
		boolean number=!dms.get_number().isBlank();
		Assert.assertTrue("number :-THE VALUE IS BLANK",number);
		System.out.println(number);
		
		
		
	}

}
