package stepdefinitions_C;

import java.util.Set;

import org.testng.Assert;

import com.pages.IC_LeadCreationpage;
import com.pages.IC_Opportunitypage;
import com.pages.LeadCreationPage;
import com.pages.Lead_StudenEssential;
import com.qa.util.DriverFactory;
import com.qa.util.ExcelUtil;
import AppHooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StudentEssentialsEnquiryLead {
	IC_LeadCreationpage ICleadPage = new IC_LeadCreationpage();
	LeadCreationPage lead = new LeadCreationPage();
	Lead_StudenEssential se = new Lead_StudenEssential();
	IC_Opportunitypage opportunity = new IC_Opportunitypage();

	@Given("user copy the existing lead record")
	public void user_copy_the_existing_lead_record() {
		lead.copy__ExistingLeadRecord();
	}

	@Then("^Enter study Plan Date (.*)$")
	public void enter_study_plan_Date(String testcaseID) {

		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseID);
		String Study_Plan_Date = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Study Plan Date");
		lead.enter_Study_Plan_Date(Study_Plan_Date);
	}

	@Then("user click lead save and open button")
	public void user_click_lead_save_and_open_button() {

		lead.save_and_Open();
	}

	@Then("User open the {string} record on IC Lead Page")
	public void user_open_the_record_on_ic_lead_page(String string) {
		ICleadPage.filter_IC_Lead_Based_on_Category(string);
	}

	@Then("New Student Essentials Lead should be created successfully")
	public void new_student_essentials_lead_should_be_created_successfully() {

	}

	@Then("user select IC lead from leads page table")
	public void user_select_ic_lead_from_leads_page_table() {

		ICleadPage.selectSingle_IC_Lead_from_table();

	}

	@Given("user naviga to {string} tab")
	public void user_naviga_to_tab(String string) {
		lead.navigateTO(string);
	}

	@Given("User add the Product to SE record")
	public void user_add_the_product_to_se_record() {
		se.addproduct_To_SE();
	}

	@Then("save the SE successfully")
	public void save_the_se_successfully() {
		se.svae_SE();
	}

	/***************************************************/
	@Given("User clicks on the Add SE button")
	public void user_clicks_on_the_add_se_button() {
		se.add_Button_SE();
	}

	@Given("user clicks on the Product Category ID Lookup")
	public void user_clicks_on_the_product_category_id_lookup() {
		se.click_product_CategoryID_LookUp();
	}

	@Given("user search for the {string} package and select the package from the list")
	public void user_search_for_the_package_and_select_the_package_from_the_list(String string) {
		se.search_for_ProductCategory(string);
		se.select_ProductCategory();
	}

	@Then("User clicks on the Product lookup field")
	public void user_clicks_on_the_product_lookup_field() {
		se.click_productField_Lookup();
	}

	@Then("Select the Produc from the list")
	public void select_the_produc_from_the_list() {
		se.select_Product();
	}

	/********************************************************************************/

	@Then("IDP Office mandatory field error message should be display as {string}")
	public void idp_office_mandatory_field_error_message_should_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		System.out.println(errSet);
		Assert.assertTrue(errSet.contains(string));
	}

	@Then("I Would Like to Study In mandatory field error message should be display as {string}")
	public void i_would_like_to_study_in_mandatory_field_error_message_should_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertTrue(errSet.contains(string));
	}

	@Then("IDP Team mandatory field error message should be display as {string}")
	public void idp_team_mandatory_field_error_message_should_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertTrue(errSet.contains(string));
	}

	@Then("Source mandatory field error message should be display as {string}")
	public void source_mandatory_field_error_message_should_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertTrue(errSet.contains(string));
	}

	@Then("IDP Owner mandatory field error message should be display as {string}")
	public void idp_owner_mandatory_field_error_message_should_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertTrue(errSet.contains(string));
	}

	@Then("Qualification Level mandatory field error message should be display as {string}")
	public void qualification_level_mandatory_field_error_message_should_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertTrue(errSet.contains(string));
	}

	@Then("Study Plan Date mandatory field error message should be display as {string}")
	public void study_Plan_Date_field_error_message_should_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertTrue(errSet.contains(string));
	}

	@Then("Study Level I Prefer Is mandatory field error message should be display as {string}")
	public void study_Level_I_Prefer_field_error_message_should_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertTrue(errSet.contains(string));
	}

	@Then("Study Plan Date mandatory field error message should not be display as {string}")
	public void study_Plan_Date_field_error_message_should_not_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertFalse(errSet.contains(string));
	}

	@Then("Study Level I Prefer Is mandatory field error message should not be display as {string}")
	public void study_Level_I_Prefer_field_error_message_should__not_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertFalse(errSet.contains(string));
	}

	@Given("Create Unqualified SES lead record")
	public void create_unqualified_SES_lead_record() {
		lead.create_the_Lead__Record("50169422", "Unqualified", "Chat", "Canada", "Postgraduate", "04/16/2025",
				"Student Essentials");
		lead.save_and_Open();
	}

	@Then("Remove the Products")
	public void remove_the_products() {
		se.Remove_Selected_Product();
	}

	@Then("User verify the converted lead in overview page")
	public void user_verify_the_converted_lead_in_overview_page() {

		// boolean flag=opportunity.isLeadConvertionTo_Opportunity();
		// Assert.assertTrue("LEAD IS NOT CONVERTED INTO OPPORTUNITY", flag);
		System.out.println("LEAD GOT CONVERTED");
		opportunity.click_On_MoreOverview();
	}

	@Given("Filter the Leads based on the qualification level (.*)$")
	public void filter_the_leads_based_on_the_qualification_level_dc(String txt) {
		lead.filter_IC_Lead_Based_on_Qualification_level(txt);
	}

}
