package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.By;

import com.pages.IC_Opportunitypage;
import com.pages.LoginPage;
import com.pages.OpportunitiesPage;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpportunitiesSteps {
	OpportunitiesPage opportunity = new OpportunitiesPage();
	private static By tbl_list = By.xpath("//div[@data-help-id='FECeGdOtwao7pKroKA1Cg0']//tbody/tr[1]/td[3]");
	
	//use
	@And("Save the opportunity ID")
	public void Save_the_opportunity_ID() {
		opportunity.saveOpportunityId();
	}
	//use
	@When("Switch to Opportunity Page")
	public void Switch_to_Opportunity_Page() throws InterruptedException {
		LoginPage.navigateToPage("Prospect", "Opportunities");
		ElementUtil.waitForElementClickable(tbl_list);
		Thread.sleep(2000);
	}
	@When("Switch to Opportunity Page with no listing")
	public void Switch_to_Opportunity_Page_with_no_listing() throws InterruptedException {
		LoginPage.navigateToPage("Prospect", "Opportunities");
		Thread.sleep(2000);
	}
	//use
	@Then("Search for the latest Opportunity ID")
	public void Search_for_the_latest_Opportunity_ID() throws InterruptedException, IOException {
		opportunity.searchOpportunityId();
	}
	//use
	@And("Select the first record from the opportunity list")
	public void Select_the_first_record_from_the_opportunity_list() throws InterruptedException {
		opportunity.selectFirstRecord();
	}
	@And("Select the first record from the opportunity list Train")
	public void Select_the_first_record_from_the_opportunity_list_Train() throws InterruptedException {
		opportunity.selectFirstRecordTrain();
	}
	 @Then ("Search for opportunity ID")
	 public void Search_for_opportunity_ID() throws InterruptedException, IOException 
	 {
		 opportunity.searchOpportunityId();
	 }
	 @Then("Verify the application status as application preparation")
		public void Verify_the_application_status_as_application_preparation() throws InterruptedException, IOException {
			OpportunitiesPage.verifyProbabilityOfApplicationPreparation();
		}
	 @Then("Change the Application status to Application Submitted")
		public void change_the_application_status_to_application_submitted() throws InterruptedException, IOException {
			OpportunitiesPage.verifyApplicationSubmittedStatus();
		}
		@Then("Change the Application status to Withdrawn")
		public void change_the_application_status_to_withdrawn() throws InterruptedException, IOException {
			OpportunitiesPage.verifyApplicationWithdrawnStatus();
		}
		@Then("Change the Application status to Visa Rejected")
		public void change_the_application_status_to_visa_rejected() throws InterruptedException, IOException {
			OpportunitiesPage.verifyApplicationVisaRejectedStatus();
		}
		@Then("Change the Application status to Acknowledged Info Pending")
		public void change_the_application_status_to_acknowledged_info_pending() throws InterruptedException, IOException {
			OpportunitiesPage.verifyApplicationAcknowledgedStatus();
		}
		@Then("Change the Application status to Review Skills Assess only")
		public void change_the_application_status_to_review_skills_assess_only() throws InterruptedException, IOException {
			OpportunitiesPage.verifyApplicationReviewStatus();
		}
		@Then("Change the Application status to Visa Approved")
		public void change_the_application_status_to_Visa_Approved() throws InterruptedException, IOException {
			OpportunitiesPage.verifyApplicatonApprovedStatus();
		}
		@When("Change the opportunity list filter to all opportunity")
		public void change_the_opportunity_list_filter_to_all_opportunity() throws InterruptedException {
			OpportunitiesPage.changeToAllOpportunity();
		}
		@And ("Click stundent details hyperlink from opportunity")
		public void Click_stundent_details_hyperlink_from_opportunity() throws InterruptedException 
		{
			IC_Opportunitypage.clickStudentDetails();
		}

}
