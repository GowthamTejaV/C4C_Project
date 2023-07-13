package stepdefinitions_C;

import java.io.IOException;

import com.pages.IC_CreationPage;
import com.pages.IC_Opportunitypage;
import com.qa.util.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DocumentManagementFile_check_Steps {
	IC_CreationPage icp = new IC_CreationPage();
	IC_Opportunitypage opp=new IC_Opportunitypage();
	@When("^Search for the Opportunity (.*)")
	public void search_for_the_opportunity(String txtNo) {
		//All Opportunities
		opp.filte_the_Oppoertunty_Records("All Opportunities");
		opp.search_for_opportunity(txtNo); 
	}

	
	@Given("User Open the Opportunity for the search ID")
	public void user_open_the_opportunity_for_the_search_id() {
		opp.select_SearchOpportunity();
	}
	  @Then ("Search for the ID Opportunity in train")
	  public void Search_for_the_Opportunity_ID() throws InterruptedException, IOException 
	  {
		  IC_Opportunitypage.searchForTheOpportunityID();
	  }

}
