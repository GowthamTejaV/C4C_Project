package stepdefinitions_C;

import com.pages.IC_CreationPage;
import com.pages.LeadCreationPage;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.Then;

public class MarketingSourceFieldsSteps {
	IC_CreationPage icp = new IC_CreationPage();
	LeadCreationPage lead = new LeadCreationPage();


	@Then("^Update the values in Event ID Fields (.*)$")
	public void update_the_values_in_event_id_fields(String testcaseID) {
		// ElementUtil.scrollToTopOfPage();
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseID);
        String eventID =  ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Event ID");
        System.out.println(eventID);
		lead.enter_EventID(eventID);
	}

	@Then("^Update the value in Event Name Field (.*)$")
	public void update_the_value_in_event_name_field(String testcaseID) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseID);
        String eventname =  ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Event Name");
		lead.enter_EventName(eventname);
	}

	@Then("^Update the value in Medium Field (.*)$")
	public void update_the_value_in_medium_field(String testcaseID) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseID);
        String Medium =  ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Medium");
		lead.select_Medium(Medium);
	}

	@Then("^Update the value in Paid Organic (.*)$")
	public void update_the_value_in_paid_organic(String testcaseID) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseID);
        String PaidOrganic =  ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Paid Organic");
		lead.select_Pain_Organic(PaidOrganic);
	}

	@Then("^Update the value in Channel (.*)$")
	public void update_the_value_in_channel(String testcaseID) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseID);
        String Channel =  ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Channel");
		lead.select_Channel(Channel);
	}
	
	
	@Then("Enter the IDP Office (.*)$")
	public void enter_the_idp_office_idp_office(String testcaseID) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseID);
        String idpOffice =  ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "IDP Office");
	  lead.enter_idp_office(idpOffice);
	}
	@Then("Enter the IDP Team (.*)$")
	public void enter_the_idp_team_idp_team(String testcaseID) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseID);
        String idpTeam =  ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "IDP Team");
	  lead.enter_idp_Team(idpTeam);
	}
	@Then("Enter the Channel (.*)$")
	public void enter_the_channel_dc(String testcaseID) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter the Event Name (.*)$")
	public void enter_the_event_name_event_name(String testcaseID) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter the Campaign (.*)$")
	public void enter_the_campaign_campaign(String testcaseID) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter the Event ID (.*)$")
	public void enter_the_event_id_event_id(String testcaseID) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter the Paid Organic (.*)$")
	public void enter_the_paid_organic_paid_organic(String testcaseID) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
