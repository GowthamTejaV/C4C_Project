package stepdefinitions_C;
import org.testng.Assert;

import com.pages.IC_Opportunitypage;
import com.pages.LeadCreationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Verify_Tabs_and_Options_in_OpportunitySteps {
    private static String category;
	IC_Opportunitypage opportunity = new IC_Opportunitypage();
	LeadCreationPage lead = new LeadCreationPage();
	@Given("Navigate to Opportunities tab")
	public void navigate_to_opportunities_tab() {
		opportunity.navigateToOpportunityTab();
	}

	@Then("User select the existing Opportunity record")
	public void user_select_the_existing_opportunity_record() {
		opportunity.selectOpportunityRecord();
	}

	@Then("user verify the Tabs and options in Opportunity page for Course Enquiry")
	public void user_verify_the_tabs_and_options_in_opportunity_page_for_course_enquiry() {
		
		boolean overview = opportunity.navigate_OVERVIEW__TAB();
  		Assert.assertTrue(overview,"OVERVIEW Tab IS NOT VISIBLE");
		
		boolean COURSE_SELECTION = opportunity.navigateToCOURSE_SELECTIONTab();
  		Assert.assertTrue(COURSE_SELECTION,"COURSE_SELECTION Tab IS NOT VISIBLE");
     
  		boolean ACTIVITIES = opportunity.navigate_ACTIVITIES__TAB();
		Assert.assertTrue(ACTIVITIES,"ACTIVITIES Tab IS NOT VISIBLE");
		
		boolean NOTES = opportunity.navigate_NOTES__TAB();
		Assert.assertTrue(NOTES,"NOTES Tab IS NOT VISIBLE");
		
		boolean VISA_DETAILS = opportunity.navigate_VISA_DETAILS__TAB();
		Assert.assertTrue(VISA_DETAILS,"VISA_DETAILS IS NOT VISIBLE");
		
		boolean Involved_Parties = opportunity.navigate_Involved_Parties__TAB();
		Assert.assertTrue(Involved_Parties,"Involved_Parties IS NOT VISIBLE");
		
		boolean Approval = opportunity.navigate_Approval__TAB();
		Assert.assertTrue(Approval,"Approval IS NOT VISIBLE");
		
		boolean TICKETS = opportunity.navigate_TICKETS__TAB();
		Assert.assertTrue(TICKETS,"TICKETS IS NOT VISIBLE");
		
		boolean DOCUMENTS = opportunity.navigate_DOCUMENTS__TAB();
		Assert.assertTrue(DOCUMENTS,"DOCUMENTS IS NOT VISIBLE");
		
		boolean HELP = opportunity.navigateTo_HELP_Tab();
  		Assert.assertTrue(HELP,"HELP Tab IS NOT VISIBLE");
		
  		boolean WORKFLOW_CHANGES = opportunity.navigate_WORKFLOW_CHANGES__TAB();
		Assert.assertTrue(WORKFLOW_CHANGES,"WORKFLOW_CHANGES IS NOT VISIBLE");
		
		boolean CHANGES = opportunity.navigate_CHANGES__TAB();
		Assert.assertTrue(CHANGES,"CHANGES IS NOT VISIBLE");
		
		boolean RELATIONSHIPS = opportunity.navigate_RELATIONSHIPS__TAB();
		Assert.assertTrue(RELATIONSHIPS,"RELATIONSHIPS IS NOT VISIBLE");
		lead.clickOnCancelButton();
    	// boolean STUDENT_ESSENTIALS = opportunity.navigate_STUDENT_ESSENTIALS_TAB();
  		//Assert.assertTrue("STUDENT ESSENTIALS Tab IS NOT VISIBLE", STUDENT_ESSENTIALS);
     		
		//boolean STUDENT_DETAILS = opportunity.navigate_STUDENT_DETAILS__TAB();
		//Assert.assertTrue("STUDENT_DETAILS IS NOT VISIBLE", STUDENT_DETAILS);
		
	}
	
	@And("Filter the Opportunity based on {string}")
	public void filter_the_opportunity_based_on(String string) {
		category=string;
		opportunity.filter_Based_On_Category(string);
	}
}
