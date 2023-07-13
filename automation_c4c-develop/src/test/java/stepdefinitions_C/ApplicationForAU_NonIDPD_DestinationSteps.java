package stepdefinitions_C;
import java.io.IOException;
import org.testng.Assert;import com.pages.IC_Opportunitypage;
import com.pages.LeadCreationPage;
import com.pages.Lead_CourseCreationPage;
import com.pages.OpportunitiesPage;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ExcelUtil;
import AppHooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When; 

public class ApplicationForAU_NonIDPD_DestinationSteps {
	Lead_CourseCreationPage leadCourse = new Lead_CourseCreationPage();
	IC_Opportunitypage opportunity = new IC_Opportunitypage();
	LeadCreationPage lead = new LeadCreationPage();
	OpportunitiesPage opp=new OpportunitiesPage();
	@When("^add the Non IDPClient Course (.*)$")
	public void add_the_non_idp_client_course(String string) {
		
		 ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(string);
		 String NonidpClientID= ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelectionTestData", "NonidpClientID");
		
		leadCourse.selectIDPCourse(NonidpClientID);//AVA-0939177
		String txt = leadCourse.getSelectedCoursesText();
		Assert.assertTrue(txt.contains("Selected Courses"));
		// AVA-1401567-Other
		// AVA-0939177-AU
		
	}

	@When("^Change the application stage to (.*)$")
	public void change_the_application_stage_to_submitted(String string) {
		
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(string);
		 String Stage= ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityTestData", "Stage");
		System.out.println("Application Stage:-"+Stage);
		opportunity.enterApplicationStatus(Stage);
	}

	@Then("click on opportunity Edit icon")
	public void click_on_opportunity_edit_icon() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		opportunity.clic_Edit_Button_OverViewPage();
		String oppID=opportunity.get_opportunityID();
		ConfigReader.writeToApplicationPropertie("OpportunityID", oppID);
	}

	@Then("Click on save button to save Opportunity Edit details")
	public void click_on_save_button_to_save_opportunity_edit_details() {
		opportunity.click_Save_Button();
		
		/*
		 * Set<String> msg = opportunity.get_PAGE_MESSAGE(); System.out.println(msg);
		 * Assert.assertTrue("MSG:-" + msg,
		 * msg.contains("Your entries have been saved."));
		 */

	}

	@Then("^navigate to Opportunity Overview page$")
	public void navigate_to_opportunity_overview_page() {
		opportunity.navigate_OVERVIEW__TAB();
	}

	@Then("^Verify the application status got changed to Finalised$")
	public void verify_the_application_status_got_changed_to_finalised() {

		String status = opportunity.get_applicationStatusText();
		lead.clickOnCancelButton();
		System.out.println(status);
		Assert.assertTrue(status.contains("Finalised"));
	
	}

	@Then("^Enter the Institution Preference as (.*)$")
	public void enter_the_institution_preference_as(String string) throws InterruptedException, IOException {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(string);
		 String Preference= ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityTestData", "Preference");
		opportunity.enter_institution_Preference(Preference);
		
	}
	@Then("^Enter the Reason for Withdrawn (.*)$")
	public void enter_the_reason_for_withdrawn_reason(String string) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(string);
		 String reason= ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityTestData", "Reason");
		opportunity.enter_reason_Of_Withdrawn(reason);
	}


	@Then("^Enter the Submission Method as (.*)$")
	public void enter_the_submission_method_as_email(String string) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(string);
		 String Method= ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityTestData", "Method");
		opportunity.enter_submission_Method(Method);
	}

	@Then("^Enter the Service Level as (.*)$")
	public void enter_the_service_level_as_hot(String string) {
		
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(string);
		 String ServiceLevel= ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityTestData", "ServiceLevel");
		opportunity.enter_service_Level(ServiceLevel);
	}

	@Then("^Enter the offer Received Date as (.*)$")
	public void enter_the_offer_received_date_as(String string) {

		try {
			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(string);
			 String OfferReceivedDate= ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OpportunityTestData", "OfferReceivedDate");
			opportunity.enter_offerReceivedDate(OfferReceivedDate);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("verfiy Probability fields got updated to {string}")
	public void verfiy_probability_fields_got_updated_to(String string) {
		String str = opportunity.get_ProbabilityText();
		System.out.println(str);
		Assert.assertTrue(str.contains(string));

	}

	@Then("verfiy Opportunity Status fields got updated to {string}")
	public void verfiy_opportunity_status_fields_got_updated_to(String string) {
		String str = opportunity.get_OpportunityStatusText();
		System.out.println(str);
		Assert.assertTrue(str.contains(string));
		lead.clickOnCancelButton();
	}

	@Given("User search for the already created Lead record")
	public void user_search_for_the_already_created_lead_record() {
		String leadId = ConfigReader.getApplicationPropertie("ConvertedLeadID");
		lead.search_for_Lead(leadId);
	}
	
	@Given("Navigate to Opportunity Page")
	public void navigate_to_opportunity_page() {
		opportunity.navigateTo_IC_page_As_Counsellor();
	}
	@Given("Search for the Opportunity")
	public void search_for_the_opportunity() {
		String oppId=ConfigReader.getApplicationPropertie("OpportunityID");
		opportunity.search_for_opportunity(oppId);
	}
	@Given("Select the Opportunity from the List")
	public void select_the_opportunity_from_the_list() {
		opportunity.select_SearchOpportunity();
		opportunity.click_On_MoreOverview();
	}
	@Then("Verify the Application Status got Updated to {string}")
	public void verify_the_application_status_got_updated_to(String string) {
		String appStatus=opp.getApplicationStatus();
		Assert.assertEquals(appStatus, string,"FAILED:- Application Status is miss matched");
	}

}
