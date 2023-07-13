package stepdefinitions_C;



import org.testng.Assert;

import com.pages.AccountPage;
import com.pages.ContactPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CRT_Role_BasedSteps {
	AccountPage account = new AccountPage();
	ContactPage contact = new ContactPage();


	@Then("Verify the tabs in the account workspace as a AR role")
	public void verify_the_tabs_in_the_account_workspace_as_a_AR_role() {
		boolean ADDRESSES = contact.navigate_ADDRESSES__TAB();
		Assert.assertTrue(ADDRESSES,"ADDRESSESTab IS NOT VISIBLE");

		boolean FEED = contact.navigate_FEED__TAB();
		Assert.assertTrue(FEED,"FEEDTab IS NOT VISIBLE");

		boolean MARKETING_PERMISSIONS = contact.navigate_MARKETING_PERMISSIONS__TAB();
		Assert.assertTrue(MARKETING_PERMISSIONS,"MARKETING_PERMISSIONSTab IS NOT VISIBLE");

		boolean NOTES = contact.navigate_NOTES__TAB();
		Assert.assertTrue(NOTES,"MARKETING_PERMISSIONSTab IS NOT VISIBLE");

		boolean ACTIVITIES = contact.navigate_ACTIVITIES__TAB();
		Assert.assertTrue(ACTIVITIES,"ACTIVITIESTab IS NOT VISIBLE");
	}

	@Then("Verify the tabs in the contact workspace as a AR role")
	public void verify_the_tabs_in_the_contact_workspace_as_a_AR_role() {
		boolean ADDRESSES = contact.navigate_ADDRESSES__TAB();
		Assert.assertTrue(ADDRESSES,"ADDRESSESTab IS NOT VISIBLE");

		boolean FEED = contact.navigate_FEED__TAB();
		Assert.assertTrue(FEED,"FEEDTab IS NOT VISIBLE");

		boolean TICKETS = contact.navigate_TICKETS__TAB();
		Assert.assertTrue(TICKETS,"TICKETS Tab IS NOT VISIBLE");
	}

	@Then("Verify the tabs in the account workspace as counsellor")
	public void verify_the_tabs_in_the_account_workspace_as_counsellor() {

		boolean INSTITUTION_INFO = account.navigate_INSTITUTION_INFO__TAB();
		Assert.assertTrue(INSTITUTION_INFO,"INSTITUTION_INFO Tab IS NOT VISIBLE");

		boolean US_CANADA_APP_DATA = account.navigate_US_CANADA_APP_DATA__TAB();
		Assert.assertTrue(US_CANADA_APP_DATA,"US_CANADA_APP_DATA Tab IS NOT VISIBLE");

		boolean CAMPUS = account.navigate_CAMPUS__TAB();
		Assert.assertTrue(CAMPUS,"CAMPUS Tab IS NOT VISIBLE");

		boolean WEB_LINKS = account.navigate_WEB_LINKS__TAB();
		Assert.assertTrue(WEB_LINKS,"WEB_LINKS Tab IS NOT VISIBLE");

		boolean CONTACTS = account.navigate_CONTACTS__TAB();
		Assert.assertTrue(CONTACTS,"CONTACTS Tab IS NOT VISIBLE");

		boolean RELATIONSHIPS = account.navigate_RELATIONSHIPS__TAB();
		Assert.assertTrue(RELATIONSHIPS,"RELATIONSHIPS Tab IS NOT VISIBLE");

		boolean CHANGES = account.navigate_CHANGES__TAB();
		Assert.assertTrue(CHANGES,"CHANGES Tab IS NOT VISIBLE");
	}

	
	
	
	
	
	
	
	@Then("Verify the tabs in the Contacts workspace as counsellor")
	public void verify_the_tabs_in_the_contacts_workspace_as_counsellor() {
		boolean ADDRESSES = contact.navigate_ADDRESSES__TAB();
		Assert.assertTrue(ADDRESSES,"ADDRESSESTab IS NOT VISIBLE");

		boolean FEED = contact.navigate_FEED__TAB();
		Assert.assertTrue(FEED,"FEEDTab IS NOT VISIBLE");

		boolean MARKETING_PERMISSIONS = contact.navigate_MARKETING_PERMISSIONS__TAB();
		Assert.assertTrue(MARKETING_PERMISSIONS,"MARKETING_PERMISSIONS IS NOT VISIBLE");

		boolean NOTES = contact.navigate_NOTES__TAB();
		Assert.assertTrue(NOTES,"NOTES IS NOT VISIBLE");

		boolean ACTIVITIES = contact.navigate_ACTIVITIES__TAB();
		Assert.assertTrue(ACTIVITIES,"ACTIVITIES IS NOT VISIBLE");

		boolean TICKETS = contact.navigate_TICKETS__TAB();
		Assert.assertTrue(TICKETS,"TICKETS Tab IS NOT VISIBLE");

		boolean LEADS = contact.navigate_LEADS__TAB();
		Assert.assertTrue(LEADS,"LEADS Tab IS NOT VISIBLE");

		boolean OPPORTUNITY = contact.navigate_OPPORTUNITY__TAB();
		Assert.assertTrue(OPPORTUNITY,"OPPORTUNITY Tab IS NOT VISIBLE");

		boolean SALES_QUOTES = contact.navigate_SALES_QUOTES__TAB();
		Assert.assertTrue(SALES_QUOTES,"SALES_QUOTES Tab IS NOT VISIBLE");

		boolean CAMPAIGNS = contact.navigate_CAMPAIGNS__TAB();
		Assert.assertTrue(CAMPAIGNS,"CAMPAIGNS Tab IS NOT VISIBLE");

		boolean MARKETING_INTERACTIONS = contact.navigate_MARKETING_INTERACTIONS__TAB();
		Assert.assertTrue(MARKETING_INTERACTIONS,"MARKETING_INTERACTIONS Tab IS NOT VISIBLE");

		boolean TARGET_GROUPS = contact.navigate_TARGET_GROUPS__TAB();
		Assert.assertTrue(TARGET_GROUPS,"TARGET_GROUPS Tab IS NOT VISIBLE");

	}
	/***********************************************************/
	
	
	
	
	
	
	
	
	@Then("Verify the TICKETS tab in the Contacts workspace as counsellor")
	public void verify_the_TICKETS_tab_in_the_contacts_workspace_as_counsellor() {
		boolean TICKETS = contact.navigate_TICKETS__TAB();
		Assert.assertTrue(TICKETS,"TICKETS Tab IS NOT VISIBLE");
	}
	
	@Then("Verify the LEADS tab in the Contacts workspace as counsellor")
	public void verify_the_LEADS_tab_in_the_contacts_workspace_as_counsellor() {
		boolean LEADS = contact.navigate_LEADS__TAB();
		Assert.assertTrue(LEADS,"LEADS Tab IS NOT VISIBLE");
	}
	
	@Then("Verify the OPPORTUNITY tab in the Contacts workspace as counsellor")
	public void verify_the_OPPORTUNITY_tab_in_the_contacts_workspace_as_counsellor() {
		boolean OPPORTUNITY = contact.navigate_OPPORTUNITY__TAB();
		Assert.assertTrue(OPPORTUNITY,"OPPORTUNITY Tab IS NOT VISIBLE");
	}
	
	@Then("Verify the SALES QUOTES tab in the Contacts workspace as counsellor")
	public void verify_the_SALES_QUOTES_tab_in_the_contacts_workspace_as_counsellor() {
		boolean SALES_QUOTES = contact.navigate_SALES_QUOTES__TAB();
		Assert.assertTrue(SALES_QUOTES,"SALES QUOTES Tab IS NOT VISIBLE");
	}
	
	
	@Then("Verify the CAMPAIGNS tab in the Contacts workspace as counsellor")
	public void verify_the_CAMPAIGNS_tab_in_the_contacts_workspace_as_counsellor() {
		boolean CAMPAIGNS = contact.navigate_CAMPAIGNS__TAB();
		Assert.assertTrue(CAMPAIGNS,"CAMPAIGNS Tab IS NOT VISIBLE");
	}
	
	@Then("Verify the MARKETING INTERACTIONS tab in the Contacts workspace as counsellor")
	public void verify_the_MARKETING_INTERACTIONS_tab_in_the_contacts_workspace_as_counsellor() {
		boolean MARKETING_INTERACTIONS = contact.navigate_MARKETING_INTERACTIONS__TAB();
		Assert.assertTrue(MARKETING_INTERACTIONS,"MARKETING INTERACTIONS Tab IS NOT VISIBLE");
	}
	
	@Then("Verify the TARGET GROUPS tab in the Contacts workspace as counsellor")
	public void verify_the_TARGET_GROUPS_tab_in_the_contacts_workspace_as_counsellor() {
		boolean TARGET_GROUPS = contact.navigate_TARGET_GROUPS__TAB();
		Assert.assertTrue(TARGET_GROUPS,"TARGET GROUPS Tab IS NOT VISIBLE");
	}
	
	

}
