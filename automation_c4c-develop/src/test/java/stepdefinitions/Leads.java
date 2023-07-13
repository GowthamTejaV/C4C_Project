package stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.pages.IC_CreationPage;
import com.pages.IC_LeadCreationpage;
import com.pages.LeadCreationPage;
import com.pages.LoginPage;
import com.qa.util.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Leads {
	LeadCreationPage lead = new LeadCreationPage();
	IC_LeadCreationpage icLead = new IC_LeadCreationpage();

	// use
	@When("Navigate to Leads Page")
	public void Navigate_to_Leads_Page() throws InterruptedException {
		LoginPage.navigateToPage("Prospect", "Leads");
	}

	// use
	@Then("Search the lead record")
	public void Search_the_lead_record() throws InterruptedException, IOException {
		lead.searchLead();
	}

	// use
	@Then("Select first record from lead table")
	public void Select_first_record_from_lead_table() throws InterruptedException {
		lead.clickFirstLeadRecord();
	}

	// use
	@And("Save the lead ID")
	public void Save_the_lead_ID() {
		icLead.saveLeadId();
	}

	// use
	@Then("Select first record from lead table in a flow")
	public void Select_first_record_from_lead_table_in_a_flow() throws InterruptedException {
		LeadCreationPage.clickFirstLeadRecordInFlow();
	}

	// use
	@Then("Select second record from lead table")
	public void Select_second_record_from_lead_table() throws InterruptedException {
		LeadCreationPage.clickSecondLeadRecord();
	}

	// use
	@And("Click on action button")
	public void Click_on_action_button() throws InterruptedException {
		lead.clickActionButton();
	}

	// use
	@And("Click convert to oppurtunity from action dropdown")
	public void Click_convert_to_oppurtunity_from_action_dropdown() throws InterruptedException {
		lead.clickConvertOppurtunity();
	}
	@And("Click convert to oppurtunity from action dropdown second")
	public void Click_convert_to_oppurtunity_from_action_dropdown_second() throws InterruptedException {
		lead.clickConvertOppurtunity2();
	}


	// use
	@And("Click Global save and open")
	public void Click_Global_save_and_open() {
		IC_CreationPage.globalSaveOpen();
		
	}

	@And("Verify that the number of leads corresponding to the particualar IC is displayed")
	public void Verify_that_the_number_of_leads_corresponding_to_the_particualar_IC_is_displayed() {
		LeadCreationPage.verifLeadCount();
	}

	@And("Verify the Column fields in the leads tab of IC")
	public void Verify_the_Column_fields_in_the_leads_tab_of_IC() throws Exception {
		LeadCreationPage.verifyLeadTableHeader();
	}

	@And("Click on create lead button from IC")
	public void Click_on_create_lead_button_from_IC() throws InterruptedException, IOException {
		LeadCreationPage.createLeads();
	}

	@And("Fill mandatory fields in leads page")
	public void Fill_mandatory_fields_in_leads_page() throws Exception {
		LeadCreationPage.fillMandatoryFieldsLeads();
	}

	@And("Click on refresh button from leads page")
	public void Click_on_refresh_button_from_leads_page() throws InterruptedException {
		LeadCreationPage.refreshLead();
	}

	@And("Click on save button in lead tab")
	public void Click_on_save_button_in_lead_tab() throws InterruptedException {
		LeadCreationPage.saveLead();
	}

	@And("Click on the student name from the leads table")
	public void Click_on_the_student_name_from_the_leads_table() throws InterruptedException {
		LeadCreationPage.clickFirstLeadRecordInFlow();
	}

	@And("verify if same student lead is opened")
	public void verify_if_same_student_lead_is_opened() throws InterruptedException {
		LeadCreationPage.verifyLeadName();
	}

	@And("copy student name")
	public void copy_student_name() {
		LeadCreationPage.copyStudentName();
	}

	@And("Verify the sort functionality in the leads tab of IC")
	public void Verify_the_sort_functionality_in_the_leads_tab_of_IC() throws InterruptedException {
		LeadCreationPage.verifySort();
	}

	@And("Verify that clicking on the name of the IDP Owner the profile of the IDP owner is displayed")
	public void Verify_that_clicking_on_the_name_of_the_IDP_Owner_the_profile_of_the_IDP_owner_is_displayed() {

	}

	@And("Click on save and open button in lead tab")
	public void Click_on_save_and_open_button_in_lead_tab() {
		LeadCreationPage.save_and_Open();
	}

	@And("Click on create lead button from Leads")
	public void Click_on_create_lead_button_from_Leads() throws InterruptedException {
		LeadCreationPage.clickCreateLeadFromLeadList();
	}

	@Then("Click create new lead button")
	public void click_create_new_lead_button() throws InterruptedException {
		LeadCreationPage.clickCreateLeadFromLeadList();
	}

	@Then("Select the category from dropdown")
	public void select_the_category_from_dropdown() throws InterruptedException, IOException {
		LeadCreationPage.selectCategory();
	}

	@Then("Select the category SES from dropdown")
	public void select_the_category_SES_from_dropdown() throws InterruptedException, IOException {
		LeadCreationPage.selectCategorySES();
	}

	@Then("Select the qualification level from dropdown")
	public void select_the_qualification_level_from_dropdown() throws InterruptedException, IOException {
		LeadCreationPage.selectQualification();
	}

	@Then("Select the student from student popup")
	public void select_the_student_from_student_popup() throws InterruptedException, IOException {
		LeadCreationPage.selectStudent();
	}

	@Then("Select the source from dropdown")
	public void select_the_source_from_dropdown() throws InterruptedException, IOException {
		LeadCreationPage.selectSource();
	}

	@Then("Select the IDP owner from popup")
	public void select_the_idp_owner_from_popup() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Select the study location from dropdown")
	public void select_the_study_location_from_dropdown() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Click save and open button")
	public void click_save_and_open_button() throws InterruptedException {
		LeadCreationPage.clickSaveAndOpen();
	}

	@Then("Verify if visa type mandatory error displayed")
	public void verify_if_visa_type_mandatory_error_displayed() throws InterruptedException {
		LeadCreationPage.verifyVisaTypeError();
	}

	@And("Select the visa type from dropdown")
	public void Select_the_visa_type_from_dropdown() throws InterruptedException, IOException {
		LeadCreationPage.selectVisaType();
	}

	@Then("Save Lead ID")
	public void save_lead_id() throws InterruptedException {
		LeadCreationPage.saveLeadId();
	}

	@Then("Click on actions button")
	public void click_on_actions_button() throws InterruptedException {
		LeadCreationPage.clickActions();
	}

	@Then("Click on convert to opportunity button")
	public void click_on_convert_to_opportunity_button() throws InterruptedException {
		LeadCreationPage.clickConvertOpportunity();
	}

	@Then("Select the subcategory")
	public void select_the_subcategory() throws InterruptedException, IOException {
		LeadCreationPage.selectSubcategory();
	}

	@Then("Switch to overview page leads")
	public void switch_to_overview_page_leads() throws InterruptedException {
		LeadCreationPage.switchToOverviewPage();
	}

	@Then("Verify the status changes")
	public void verify_the_status_changes() {
		LeadCreationPage.verifyStatusUpdate();
	}

	@And("Click on more view button")
	public void Click_on_more_view_button() throws InterruptedException {
		LeadCreationPage.clickMoreview();
	}
	 @And ("Link first contract with lead")
	 public void Link_first_contract_with_lead() throws InterruptedException 
	 {
		 LeadCreationPage.selectContractID();
	 }
	 @And ("Link second contract with lead")
	 public void Link_second_contract_with_lead() throws InterruptedException 
	 {
		 LeadCreationPage.selectContractID2();
	 }

}
