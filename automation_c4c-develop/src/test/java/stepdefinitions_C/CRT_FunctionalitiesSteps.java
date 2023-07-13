package stepdefinitions_C;
import org.testng.Assert;

import com.pages.AccountPage;
import com.pages.ContactPage;
import com.pages.LeadCreationPage;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CRT_FunctionalitiesSteps {
	private static String account_Name ;
	private static String Role;
	private static String WebSite;
	private static String CountryRegion;
	private static String City;
	private static String State ;
	private static String OwnerId;
	private static String AccountStatus;
	
	AccountPage account = new AccountPage();
	ContactPage contact = new ContactPage();
	LeadCreationPage lead = new LeadCreationPage();

	@Given("user navigate to the Accounts tab")
	public void user_navigate_to_the_accounts_tab() {
		account.navigateTo_AccountPage();
	}

	@Given("user open any one of the accounts")
	public void user_open_any_one_of_the_accounts() {
		account.select_Account_from_the_List();
		account.click_On_MoreBtn();
	}

	@Then("Verify the tabs in the account workspace")
	public void verify_the_tabs_in_the_account_workspace() {

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

		boolean DOCUMENTS = account.navigate_DOCUMENTS__TAB();
		Assert.assertTrue(DOCUMENTS,"DOCUMENTS Tab IS NOT VISIBLE");

		boolean NOTES = account.navigate_NOTES__TAB();
		Assert.assertTrue(NOTES,"NOTES Tab IS NOT VISIBLE");

		boolean CHANGES = account.navigate_CHANGES__TAB();
		Assert.assertTrue(CHANGES,"CHANGES Tab IS NOT VISIBLE");
	}

	// Account Tab's

	@Then("Verify the INSTITUTION INFO TAB in the account workspace")
	public void verify_the_INSTITUTION_INFO__TAB_in_Account_WorkSpace() {
		boolean INSTITUTION_INFO = account.navigate_INSTITUTION_INFO__TAB();
		Assert.assertTrue(INSTITUTION_INFO,"INSTITUTION_INFO Tab IS NOT VISIBLE");
	}

	@Then("Verify the US CANADA APP DATA TAB in the account workspace")
	public void verify_US_CANADA_APP_DATA__TAB_in_Account_WorkSpace() {
		boolean US_CANADA_APP_DATA = account.navigate_US_CANADA_APP_DATA__TAB();
		Assert.assertTrue(US_CANADA_APP_DATA,"US_CANADA_APP_DATA Tab IS NOT VISIBLE");
	}

	@Then("Verify the CAMPUS TAB in the account workspace")
	public void verify_CAMPUS_Tab_in_Account_WorkSpace() {
		boolean CAMPUS = account.navigate_CAMPUS__TAB();
		Assert.assertTrue(CAMPUS,"CAMPUS Tab IS NOT VISIBLE");
	}

	@Then("Verify the WEB LINKS Tab in the account workspace")
	public void verify_WEB_LINKS_Tab_in_Account_WorkSpace() {
		boolean WEB_LINKS = account.navigate_WEB_LINKS__TAB();
		Assert.assertTrue(WEB_LINKS,"WEB_LINKS Tab IS NOT VISIBLE");
	}

	@Then("Verify the CONTACTS Tab in the account workspace")
	public void verify_CONTACTS_Tab_in_Account_WorkSpace() {
		boolean CONTACTS = account.navigate_CONTACTS__TAB();
		Assert.assertTrue(CONTACTS,"CONTACTS Tab IS NOT VISIBLE");
	}

	@Then("Verify the Account Team Tab in the account workspace")
	public void verify_Account_Team_Tab_in_Account_WorkSpace() {
		boolean accountTeam = account.navigate_Account_Team__TAB();
		Assert.assertTrue(accountTeam,"Account Team IS NOT VISIBLE");
	}

	@Then("Verify the RELATIONSHIPS TAB in the account workspace")
	public void verify_RELATIONSHIPS_TAB_in_Account_WorkSpace() {
		boolean RELATIONSHIPS = account.navigate_RELATIONSHIPS__TAB();
		Assert.assertTrue(RELATIONSHIPS,"RELATIONSHIPS Tab IS NOT VISIBLE");

	}

	@Then("Verify the Addresses TAB in the account workspace")
	public void verify_Addresses_TAB_in_Account_WorkSpace() {
		boolean addresses = account.navigate_Addresses__TAB();
		Assert.assertTrue(addresses,"Addresses Tab IS NOT VISIBLE");

	}

	@Then("Verify the salesData TAB in the account workspace")
	public void verify_salesData_TAB_in_Account_WorkSpace() {
		boolean salesData = account.navigate_salesData__TAB();
		Assert.assertTrue(salesData,"salesData Tab IS NOT VISIBLE");

	}

	@Then("Verify the DOCUMENTS TAB in the account workspace")
	public void verify_DOCUMENTS__TAB_in_Account_WorkSpace() {
		boolean DOCUMENTS = account.navigate_DOCUMENTS__TAB();
		Assert.assertTrue(DOCUMENTS,"DOCUMENTS Tab IS NOT VISIBLE");

	}

	@Then("Verify the NOTES TAB in the account workspace")
	public void verify_NOTES_TAB_in_Account_WorkSpace() {
		boolean NOTES = account.navigate_NOTES__TAB();
		Assert.assertTrue(NOTES,"NOTES Tab IS NOT VISIBLE");

	}

	@Then("Verify the CHANGES Tab in the account workspace")
	public void verify_CHANGES_Tab_in_Account_WorkSpace() {
		boolean CHANGES = account.navigate_CHANGES__TAB();
		Assert.assertTrue(CHANGES,"CHANGES Tab IS NOT VISIBLE");
	}

	@Then("Verify the Help Tab in the account workspace")
	public void verify_Help_Tab_in_Account_WorkSpace() {
		boolean Help = account.naviagte_Help_TAB();
		lead.clickOnCancelButton();
		Assert.assertTrue(Help,"Help Tab IS NOT VISIBLE");
	}

	/************************************************************************/

	@Given("user navigate to the Contacts tab")
	public void user_navigate_to_the_contacts_tab() {
		contact.navigateTo_Contacts();
	}

	@Given("user open any one of the Contacts")
	public void user_open_any_one_of_the_contacts() {
		contact.filter_All_the_Contacts();
		contact.select_Contacts_from_the_List_As_counsellor();
		try {
			Thread.sleep(2700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contact.click_On_more_Button();
	}

	@Given("user open any one of the Contacts as AR")
	public void user_open_any_one_of_the_contacts_As_AR() {
		contact.filter_All_the_Contacts();
		contact.select_Contacts_from_the_List_As_AR();
		try {
			Thread.sleep(2700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contact.click_On_more_Button();
	}

	@Then("Verify the tabs in the Contacts workspace")
	public void verify_the_tabs_in_the_contacts_workspace() {

		boolean ADDRESSES = contact.navigate_ADDRESSES__TAB();
		Assert.assertTrue(ADDRESSES,"ADDRESSESTab IS NOT VISIBLE");

		boolean FEED = contact.navigate_FEED__TAB();
		Assert.assertTrue(FEED,"FEEDTab IS NOT VISIBLE");

		boolean MARKETING_PERMISSIONS = contact.navigate_MARKETING_PERMISSIONS__TAB();
		Assert.assertTrue(MARKETING_PERMISSIONS,"MARKETING PERMISSIONS Tab IS NOT VISIBLE");

		boolean NOTES = contact.navigate_NOTES__TAB();
		Assert.assertTrue(NOTES,"NOTES Tab IS NOT VISIBLE");

		boolean ACTIVITIES = contact.navigate_ACTIVITIES__TAB();
		Assert.assertTrue(ACTIVITIES,"ACTIVITIES Tab IS NOT VISIBLE");
	}

	// Contract Tabs
	@Then("Verify the ADDRESSES tab in the Contacts workspace")
	public void verify_the_ADDRESSES_tab_in_the_contacts_workspace() {
		boolean ADDRESSES = contact.navigate_ADDRESSES__TAB();
		Assert.assertTrue(ADDRESSES,"ADDRESSESTab IS NOT VISIBLE");
	}

	@Then("Verify the FEED tab in the Contacts workspace")
	public void verify_the_FEED_tab_in_the_contacts_workspace() {
		boolean FEED = contact.navigate_FEED__TAB();
		Assert.assertTrue(FEED,"FEEDTab IS NOT VISIBLE");
	}

	@Then("Verify the MARKETING PERMISSIONS tab in the Contacts workspace")
	public void verify_the_MARKETING_PERMISSIONS_tab_in_the_contacts_workspace() {
		boolean MARKETING_PERMISSIONS = contact.navigate_MARKETING_PERMISSIONS__TAB();
		Assert.assertTrue(MARKETING_PERMISSIONS,"MARKETING PERMISSIONS Tab IS NOT VISIBLE");
	}

	@Then("Verify the NOTES tab in the Contacts workspace")
	public void verify_the_NOTES_tab_in_the_contacts_workspace() {
		boolean NOTES = contact.navigate_NOTES__TAB();
		Assert.assertTrue(NOTES,"NOTES Tab IS NOT VISIBLE");
	}

	@Then("Verify the ACTIVITIES tab in the Contacts workspace")
	public void verify_the_ACTIVITIES_tab_in_the_contacts_workspace() {
		boolean ACTIVITIES = contact.navigate_ACTIVITIES__TAB();
		Assert.assertTrue(ACTIVITIES,"ACTIVITIES Tab IS NOT VISIBLE");
	}

	/***********************************/

	@Then("Verify the tabs in the account List View as Client Relation role")
	public void verify_the_tabs_in_the_account_list_view() {
		boolean accountIdTab = account.navigate_accountIdTab();
		Assert.assertTrue(accountIdTab,"accountIdTab IS NOT VISIBLE");

		boolean ExternalIdTab = account.navigate_ExternalIdTab();
		Assert.assertTrue(ExternalIdTab,"ExternalIdTab IS NOT VISIBLE");

		boolean NameTab = account.navigate_NameTab();
		Assert.assertTrue(NameTab,"NameTab IS NOT VISIBLE");

		boolean RoleTab = account.navigate_RoleTab();
		Assert.assertTrue(RoleTab,"RoleTab IS NOT VISIBLE");

		boolean AccountOwnerTab = account.navigate_AccountOwnerTab();
		Assert.assertTrue(AccountOwnerTab,"AccountOwnerTab IS NOT VISIBLE");

		boolean AccountStatusTab = account.navigate_AccountStatusTab();
		Assert.assertTrue(AccountStatusTab,"AccountStatusTab IS NOT VISIBLE");

		boolean country_region = account.navigate_country_regionTab();
		Assert.assertTrue(country_region,"country_region IS NOT VISIBLE");

		boolean StateTab = account.navigate_StateTab();
		Assert.assertTrue(StateTab,"State IS NOT VISIBLE");

		boolean CityTab = account.navigate_CityTab();
		Assert.assertTrue(CityTab,"CityTab IS NOT VISIBLE");

		boolean changedOnTab = account.navigate_changedOnTab();
		Assert.assertTrue(changedOnTab,"changedOnTab IS NOT VISIBLE");

		boolean changeByTab = account.navigate_changeByTab();
		Assert.assertTrue(changeByTab,"changeByTab IS NOT VISIBLE");

		boolean CreatedOn = account.navigate_CreatedOnTab();
		Assert.assertTrue(CreatedOn,"CreatedOn IS NOT VISIBLE");

		boolean CollectionNowStatus = account.navigate_CollectionNowStatusTab();
		Assert.assertTrue(CollectionNowStatus,"CollectionNowStatus IS NOT VISIBLE");

		boolean DestinationCountry = account.navigate_DestinationCountryTab();
		Assert.assertTrue(DestinationCountry,"DestinationCountry IS NOT VISIBLE");

		boolean ClientSectorTab = account.navigate_ClientSectorTab();
		Assert.assertTrue(ClientSectorTab,"ClientSectorTab IS NOT VISIBLE");

		boolean IDPClientTab = account.navigate_IDPClientTab();
		Assert.assertTrue(IDPClientTab,"IDPClientTab IS NOT VISIBLE");
	}

	@Then("Verify the tabs in the account List View as counsellor")
	public void verify_the_tabs_in_the_account_list_view_as_counsellor() {
		boolean accountIdTab = account.navigate_accountIdTab();
		Assert.assertTrue(accountIdTab,"accountIdTab IS NOT VISIBLE");

		boolean ExternalIdTab = account.navigate_ExternalIdTab();
		Assert.assertTrue(ExternalIdTab,"ExternalIdTab IS NOT VISIBLE");

		boolean NameTab = account.navigate_NameTab();
		Assert.assertTrue(NameTab,"NameTab IS NOT VISIBLE");

		boolean RoleTab = account.navigate_RoleTab();
		Assert.assertTrue(RoleTab,"RoleTab IS NOT VISIBLE");

		boolean AccountOwnerTab = account.navigate_AccountOwnerTab();
		Assert.assertTrue(AccountOwnerTab,"AccountOwnerTab IS NOT VISIBLE");

		boolean AccountStatusTab = account.navigate_AccountStatusTab();
		Assert.assertTrue(AccountStatusTab,"AccountStatusTab IS NOT VISIBLE");

		boolean country_region = account.navigate_country_regionTab();
		Assert.assertTrue(country_region,"country_region IS NOT VISIBLE");

		boolean State = account.navigate_StateTab();
		Assert.assertTrue(State,"State IS NOT VISIBLE");

		boolean City = account.navigate_CityTab();
		Assert.assertTrue(City,"City IS NOT VISIBLE");

		boolean changedOn = account.navigate_changedOnTab();
		Assert.assertTrue(changedOn,"changedOn IS NOT VISIBLE");

		boolean changeBy = account.navigate_changeByTab();
		Assert.assertTrue(changeBy,"changeBy IS NOT VISIBLE");

		boolean CreatedOn = account.navigate_CreatedOnTab();
		Assert.assertTrue(CreatedOn,"CreatedOn IS NOT VISIBLE");

		boolean CollectionNowStatus = account.navigate_CollectionNowStatusTab();
		Assert.assertTrue(CollectionNowStatus,"CollectionNowStatus IS NOT VISIBLE");

		boolean DestinationCountry = account.navigate_DestinationCountryTab();
		Assert.assertTrue(DestinationCountry,"DestinationCountry IS NOT VISIBLE");

		boolean ClientSectorTab = account.navigate_ClientSectorTab();
		Assert.assertTrue(ClientSectorTab,"ClientSectorTab IS NOT VISIBLE");

		boolean IDPClientTab = account.navigate_IDPClientTab();
		Assert.assertTrue(IDPClientTab,"IDPClientTab IS NOT VISIBLE");
	}

	@Then("Verify the tabs in the contact List View")
	public void verify_the_tabs_in_the_contact_list_view() {
		boolean NameTab = contact.navigate_NameTab();
		Assert.assertTrue(NameTab,"NameTab IS NOT VISIBLE");

		boolean FirstNameTab = contact.navigate_FirstNameTab();
		Assert.assertTrue(FirstNameTab,"FirstNameTab IS NOT VISIBLE");

		boolean LastNameTab = contact.navigate_LastNameTab();
		Assert.assertTrue(LastNameTab,"LastNameTab IS NOT VISIBLE");

		boolean AccountTab = contact.navigate_AccountTab();
		Assert.assertTrue(AccountTab,"AccountTab IS NOT VISIBLE");

		boolean JobTitleTab = contact.navigate_JobTitleTab();
		Assert.assertTrue(JobTitleTab,"JobTitleTab IS NOT VISIBLE");

		boolean PrimaryRoleTab = contact.navigate_PrimaryRoleTab();
		Assert.assertTrue(PrimaryRoleTab,"PrimaryRoleTab IS NOT VISIBLE");

		boolean SecondaryRoleTab = contact.navigate_SecondaryRoleTab();
		Assert.assertTrue(SecondaryRoleTab,"SecondaryRoleTab IS NOT VISIBLE");

		boolean PhoneTab = contact.navigate_PhoneTab();
		Assert.assertTrue(PhoneTab,"PhoneTab IS NOT VISIBLE");

		boolean MobileTab = contact.navigate_MobileTab();
		Assert.assertTrue(MobileTab,"MobileTab IS NOT VISIBLE");

		boolean EmailTab = contact.navigate_EmailTab();
		Assert.assertTrue(EmailTab,"EmailTab IS NOT VISIBLE");

		boolean StatusTab = contact.navigate_StatusTab();
		Assert.assertTrue(StatusTab,"StatusTab IS NOT VISIBLE");

		boolean Country_RegionTab = contact.navigate_Country_RegionTab();
		Assert.assertTrue(Country_RegionTab,"Country_RegionTab IS NOT VISIBLE");

		boolean ContactIDTab = contact.navigate_ContactIDTab();
		Assert.assertTrue(ContactIDTab,"ContactIDTab IS NOT VISIBLE");

		boolean CreatedOnTab = contact.navigate_CreatedOnTab();
		Assert.assertTrue(CreatedOnTab,"CreatedOnTab IS NOT VISIBLE");

	}
	//

	@Then("Verify the tabs in the contact List View as counsellor")
	public void verify_the_tabs_in_the_contact_list_view_as_counsellor() {
		boolean NameTab = contact.navigate_NameTab();
		Assert.assertTrue(NameTab,"NameTab IS NOT VISIBLE");

		boolean FirstNameTab = contact.navigate_FirstNameTab();
		Assert.assertTrue(FirstNameTab,"FirstNameTab IS NOT VISIBLE");

		boolean LastNameTab = contact.navigate_LastNameTab();
		Assert.assertTrue(LastNameTab,"LastNameTab IS NOT VISIBLE");

		boolean AccountTab = contact.navigate_AccountTab();
		Assert.assertTrue(AccountTab,"AccountTab IS NOT VISIBLE");

		boolean JobTitleTab = contact.navigate_JobTitleTab();
		Assert.assertTrue(JobTitleTab,"JobTitleTab IS NOT VISIBLE");

		boolean PrimaryRoleTab = contact.navigate_PrimaryRoleTab();
		Assert.assertTrue(PrimaryRoleTab,"PrimaryRoleTab IS NOT VISIBLE");

		boolean SecondaryRoleTab = contact.navigate_SecondaryRoleTab();
		Assert.assertTrue(SecondaryRoleTab,"SecondaryRoleTab IS NOT VISIBLE");

		boolean PhoneTab = contact.navigate_PhoneTab();
		Assert.assertTrue(PhoneTab,"PhoneTab IS NOT VISIBLE");

		boolean MobileTab = contact.navigate_MobileTab();
		Assert.assertTrue(MobileTab,"MobileTab IS NOT VISIBLE");

		boolean EmailTab = contact.navigate_EmailTab();
		Assert.assertTrue(EmailTab,"EmailTab IS NOT VISIBLE");

		boolean StatusTab = contact.navigate_StatusTab();
		Assert.assertTrue(StatusTab,"StatusTab IS NOT VISIBLE");

		boolean Country_RegionTab = contact.navigate_Country_RegionTab();
		Assert.assertTrue(Country_RegionTab,"Country_RegionTab IS NOT VISIBLE");

		boolean ContactIDTab = contact.navigate_ContactIDTab();
		Assert.assertTrue(ContactIDTab,"ContactIDTab IS NOT VISIBLE");

		boolean CreatedOnTab = contact.navigate_CreatedOnTab();
		Assert.assertTrue(CreatedOnTab,"CreatedOnTab IS NOT VISIBLE");

	}

	@Then("Verify the tabs in the contact List View as AR role")
	public void verify_the_tabs_in_the_contact_list_view_as_AR_role() {
		boolean NameTab = contact.navigate_NameTab();
		Assert.assertTrue(NameTab,"NameTab IS NOT VISIBLE");

		boolean FirstNameTab = contact.navigate_FirstNameTab();
		Assert.assertTrue(FirstNameTab,"FirstNameTab IS NOT VISIBLE");

		boolean LastNameTab = contact.navigate_LastNameTab();
		Assert.assertTrue(LastNameTab,"LastNameTab IS NOT VISIBLE");

		boolean AccountTab = contact.navigate_AccountTab();
		Assert.assertTrue(AccountTab,"AccountTab IS NOT VISIBLE");

		boolean JobTitleTab = contact.navigate_JobTitleTab();
		Assert.assertTrue(JobTitleTab,"JobTitleTab IS NOT VISIBLE");

		boolean PrimaryRoleTab = contact.navigate_PrimaryRoleTab();
		Assert.assertTrue(PrimaryRoleTab,"PrimaryRoleTab IS NOT VISIBLE");

		boolean SecondaryRoleTab = contact.navigate_SecondaryRoleTab();
		Assert.assertTrue(SecondaryRoleTab,"SecondaryRoleTab IS NOT VISIBLE");

		boolean PhoneTab = contact.navigate_PhoneTab();
		Assert.assertTrue(PhoneTab,"PhoneTab IS NOT VISIBLE");

		boolean MobileTab = contact.navigate_MobileTab();
		Assert.assertTrue(MobileTab,"MobileTab IS NOT VISIBLE");

		boolean EmailTab = contact.navigate_EmailTab();
		Assert.assertTrue(EmailTab,"EmailTab IS NOT VISIBLE");

		boolean StatusTab = contact.navigate_StatusTab();
		Assert.assertTrue(StatusTab,"StatusTab IS NOT VISIBLE");

		boolean Country_RegionTab = contact.navigate_Country_RegionTab();
		Assert.assertTrue(Country_RegionTab,"Country_RegionTab IS NOT VISIBLE");

		boolean ContactIDTab = contact.navigate_ContactIDTab();
		Assert.assertTrue(ContactIDTab,"ContactIDTab IS NOT VISIBLE");

		boolean CreatedOnTab = contact.navigate_CreatedOnTab();
		Assert.assertTrue(CreatedOnTab,"CreatedOnTab IS NOT VISIBLE");

	}

	@Given("user clicks on account advance filter Icon")
	public void user_clicks_on_account_advance_filter_icon() {
		account.Click_On_advanceFilterIcon();
	}

	@Then("Verify the fields in Account Filter View")
	public void verify_the_fields_in_account_filter_view() {
		boolean advance_AccountId = account.enter_advance_AccountId_Field("");
		Assert.assertTrue(advance_AccountId,"advance_AccountId IS NOT VISIBLE");

		boolean advance_name = account.enter_advance_name_Field("");
		Assert.assertTrue(advance_name,"advance_name IS NOT VISIBLE");

		boolean advance_role = account.enter_advance_role_Field("");
		Assert.assertTrue(advance_role,"advance_role IS NOT VISIBLE");

		boolean Account_Status = account.enter_advance_Account_Status_Field("");
		Assert.assertTrue(Account_Status,"Account_Status IS NOT VISIBLE");

		boolean Country_Region = account.enter_advance_Country_Region_Field("");
		Assert.assertTrue(Country_Region,"Country_Region IS NOT VISIBLE");

		boolean advance_State = account.enter_advance_State_Field("");
		Assert.assertTrue(advance_State,"advance_State IS NOT VISIBLE");

		boolean advance_City = account.enter_advance_City_Field("");
		Assert.assertTrue(advance_City,"advance_City IS NOT VISIBLE");

		boolean account_Owner = account.enter_advance_account_Owner_Field("");
		Assert.assertTrue(account_Owner,"account_Owner IS NOT VISIBLE");
	}

	@Given("user clicks on contact advance filter Icon")
	public void user_clicks_on_contact_advance_filter_icon() {
		contact.Click_advance_Filter_Icon();
	}

	@Then("Verify the fields in contact Filter View")
	public void verify_the_fields_in_contact_filter_view() {
		boolean ContactID = contact.enter_advance_ContactID("");
		Assert.assertTrue(ContactID,"ContactID Field IS NOT VISIBLE");

		boolean FirstName = contact.enter_advance_FirstName("");
		Assert.assertTrue(FirstName,"FirstName Field IS NOT VISIBLE");

		boolean LastName = contact.enter_advance_LastName("");
		Assert.assertTrue(LastName,"LastName Field IS NOT VISIBLE");

		boolean Account = contact.enter_advance_Account("");
		Assert.assertTrue(Account,"Account Field IS NOT VISIBLE");

		boolean email = contact.enter_advance_email("");
		Assert.assertTrue(email,"email Field IS NOT VISIBLE");

		boolean City = contact.enter_advance_City("");
		Assert.assertTrue(City,"City Field IS NOT VISIBLE");

		boolean postal_code = contact.enter_advance_postal_code("");
		Assert.assertTrue(postal_code,"postal_code Field IS NOT VISIBLE");

		boolean State = contact.enter_advance_State("");
		Assert.assertTrue(State,"State Field IS NOT VISIBLE");

		boolean Country_Region = contact.enter_advance_Country_Region("");
		Assert.assertTrue(Country_Region,"Country_Region Field IS NOT VISIBLE");

		boolean PrimaryRole = contact.enter_advance_PrimaryRole("");
		Assert.assertTrue(PrimaryRole,"PrimaryRole Field IS NOT VISIBLE");
	}

	@Then("Verify the Overview Fields in Accounts as AR role")
	public void verify_the_overview_fields_in_accounts_as_Ar_role() {
		account.click_On_EditBtn();

		boolean name = account.enter_name_Field("Test Name");
		Assert.assertTrue(name,"name IS NOT VISIBLE");

		boolean accountID = account.isAccountID_Displayed();
		Assert.assertTrue(accountID,"accountID IS NOT VISIBLE");

		boolean ExternalID = account.isExternalID_Displayed();
		Assert.assertTrue(ExternalID,"ExternalID IS NOT VISIBLE");

		boolean oscae_legacyID = account.enter_oscae_legacyID_Field("Test Oscae Field");
		Assert.assertTrue(oscae_legacyID,"oscae_legacyID IS NOT VISIBLE");

		boolean parentAccount = account.enter_parentAccount_Field("50165821");
		Assert.assertTrue(parentAccount,"parentAccount IS NOT VISIBLE");

		boolean contractingEntity = account.enter_contractingEntity_Field("HDO01");
		Assert.assertTrue(contractingEntity,"contractingEntity IS NOT VISIBLE");

		boolean idp_Client = account.enter_idp_Client_Field("Yes");
		Assert.assertTrue(idp_Client,"idp_Client IS NOT VISIBLE");

		boolean account_Owner = account.enter_accountOwner_Field("9007");
		Assert.assertTrue(account_Owner,"account_Owner IS NOT VISIBLE");

		boolean Aliases = account.isAliases_Displayed();
		Assert.assertTrue(Aliases,"Aliases IS NOT VISIBLE");

		boolean legalName = account.enter_legalName_Field("Test Leagle name");
		Assert.assertTrue(legalName,"legalName IS NOT VISIBLE");

		boolean address = account.is_address_Field_IsDisplaying();
		Assert.assertTrue(address,"address IS NOT VISIBLE");

		boolean role = account.enter_role_Field("Institution");
		Assert.assertTrue(role,"role IS NOT VISIBLE");

		boolean IDP_directClient = account.isIDP_directClient_Field_Displaying();
		Assert.assertTrue(IDP_directClient,"IDP_directClient IS NOT VISIBLE");

		boolean account_status = account.enter_account_status_Field("On-Hold");
		Assert.assertTrue(account_status,"account_status IS NOT VISIBLE");

		boolean collectNowStatus = account.isCollectNowStatus_Field_Displaying();
		Assert.assertTrue(collectNowStatus,"collectNowStatus IS NOT VISIBLE");

		boolean destination_country = account.enter_destination_country_Field_AR_Role("Canada");
		Assert.assertTrue(destination_country,"destination_country IS NOT VISIBLE");

		boolean university_class = account.enter_university_class_Field("A");
		Assert.assertTrue(university_class,"university_class IS NOT VISIBLE");

		boolean activated_Date = account.enter_activated_Date_Field("28.12.2022");
		Assert.assertTrue(activated_Date,"activated_Date IS NOT VISIBLE");

		boolean deactivate_Date = account.enter_deactivate_Date_Field("31.12.2022");
		Assert.assertTrue(deactivate_Date,"deactivate_Date IS NOT VISIBLE");

		boolean deactivate_Reason = account.enter_deactivate_Reason_Field("Test Deactivate");
		Assert.assertTrue(deactivate_Reason,"deactivate_Reason IS NOT VISIBLE");

		boolean client_Sector = account.enter_client_Sector_Field("University");
		Assert.assertTrue(client_Sector,"client_Sector IS NOT VISIBLE");

		boolean webSite = account.enter_webSite_Field("www.testsp.co.in");
		Assert.assertTrue(webSite,"webSite IS NOT VISIBLE");

		boolean applicatin_processingTime = account
				.enter_applicatin_processingTime_Field("Test Application Processing Time");
		Assert.assertTrue(applicatin_processingTime,"applicatin_processingTime IS NOT VISIBLE");

		boolean is_EBS_Account_siteID = account.is_EBS_Account_siteID_Displaying();
		Assert.assertTrue(is_EBS_Account_siteID,"is_EBS_Account_siteID IS NOT VISIBLE");

		boolean EBS_replication_Status = account.isEBS_replication_Status_Displayed();
		Assert.assertTrue(EBS_replication_Status,"EBS_replication_Status IS NOT VISIBLE");

		boolean EBS_Debtor_status = account.is_EBS_Debtor_status_Field_Displaying();
		Assert.assertTrue(EBS_Debtor_status,"EBS_Debtor_status IS NOT VISIBLE");

		boolean ebs_debtor_accountStatus = account.is_ebs_debtor_accountStatus_Field_Displaying();
		Assert.assertTrue(ebs_debtor_accountStatus,"ebs_debtor_accountStatus IS NOT VISIBLE");
	}

	@Then("Verify the Overview Fields in Accounts as a Counsellor")
	public void verify_the_overview_fields_in_accounts_as_a_counsellor() {
		account.click_On_EditBtn();

		boolean name = account.isnameDisplaying_();
		Assert.assertTrue(name,"name IS NOT VISIBLE");

		boolean accountID = account.isaccountIDDisplaying_();
		Assert.assertTrue(accountID,"accountID IS NOT VISIBLE");

		boolean ExternalID = account.isexternalIDDisplaying_();
		Assert.assertTrue(ExternalID,"ExternalID IS NOT VISIBLE");

		boolean oscae_legacyID = account.isOscarLegacyIDDisplaying_();
		Assert.assertTrue(oscae_legacyID,"oscae_legacyID IS NOT VISIBLE");

		boolean parentAccount = account.isparentAccountDisplaying_();
		Assert.assertTrue(parentAccount,"parentAccount IS NOT VISIBLE");

		boolean contractingEntity = account.iscontractingEntityDisplaying_();
		Assert.assertTrue(contractingEntity,"contractingEntity IS NOT VISIBLE");

		boolean idp_Client = account.isIDPClientDisplaying_();
		Assert.assertTrue(idp_Client,"idp_Client IS NOT VISIBLE");

		boolean account_Owner = account.isAccountOwnerDisplaying_();
		Assert.assertTrue(account_Owner,"account_Owner IS NOT VISIBLE");

		boolean Aliases = account.isaliasesDisplaying_();
		Assert.assertTrue(Aliases,"Aliases IS NOT VISIBLE");

		boolean legalName = account.islegalNameDisplaying_();
		Assert.assertTrue(legalName,"legalName IS NOT VISIBLE");

		boolean address = account.isaddressDisplaying_();
		Assert.assertTrue(address,"address IS NOT VISIBLE");

		boolean role = account.isroleDisplaying_();
		Assert.assertTrue(role,"role IS NOT VISIBLE");

		boolean IDP_directClient = account.isIDPDirectClientDisplaying_();
		Assert.assertTrue(IDP_directClient,"IDP_directClient IS NOT VISIBLE");

		boolean account_status = account.isAccountStatusDisplaying_();
		Assert.assertTrue(account_status,"account_status IS NOT VISIBLE");

		boolean destination_country = account.isDestinationCountryDisplaying_();
		Assert.assertTrue(destination_country,"destination_country IS NOT VISIBLE");

		boolean university_class = account.isuniversityClassDisplaying_();
		Assert.assertTrue(university_class,"university_class IS NOT VISIBLE");

		boolean activated_Date = account.isactivatedDateDisplaying_();
		Assert.assertTrue(activated_Date,"activated_Date IS NOT VISIBLE");

		boolean deactivate_Date = account.isdeactivatedDateDisplaying_();
		Assert.assertTrue(deactivate_Date,"deactivate_Date IS NOT VISIBLE");

		boolean deactivate_Reason = account.isdeactivatedReasonDisplaying_();
		Assert.assertTrue(deactivate_Reason,"deactivate_Reason IS NOT VISIBLE");

		boolean client_Sector = account.isclientSectorDisplaying_();
		Assert.assertTrue(client_Sector,"client_Sector IS NOT VISIBLE");

		boolean webSite = account.iswebSiteDisplaying_();
		Assert.assertTrue(webSite,"webSite IS NOT VISIBLE");

		boolean applicatin_processingTime = account.isapplicationProcessingTimeDisplaying_();
		Assert.assertTrue(applicatin_processingTime,"applicatin_processingTime IS NOT VISIBLE");

		boolean is_EBS_Account_siteID = account.iseBSAccountSiteDisplaying_();
		Assert.assertTrue(is_EBS_Account_siteID,"is_EBS_Account_siteID IS NOT VISIBLE");

		boolean EBS_replication_Status = account.iseBSReplicationStatusDisplaying_();
		Assert.assertTrue(EBS_replication_Status,"EBS_replication_Status IS NOT VISIBLE");

		boolean EBS_Debtor_status = account.iseBSDebtorStatusDisplaying_();
		Assert.assertTrue(EBS_Debtor_status,"EBS_Debtor_status IS NOT VISIBLE");

		boolean ebs_debtor_accountStatus = account.iseBSDebtorAccountStatusDisplaying_();
		Assert.assertTrue(ebs_debtor_accountStatus,"ebs_debtor_accountStatus IS NOT VISIBLE");
	}

	@Then("Verify the Overview Fields in Accounts")
	public void verify_the_overview_fields_in_accounts() {
		account.click_On_EditBtn();

		boolean name = account.enter_name_Field("Test Name");
		Assert.assertTrue(name,"name IS NOT VISIBLE");

		boolean accountID = account.isAccountID_Displayed();
		Assert.assertTrue(accountID,"accountID IS NOT VISIBLE");

		boolean ExternalID = account.isExternalID_Displayed();
		Assert.assertTrue(ExternalID,"ExternalID IS NOT VISIBLE");

		boolean oscae_legacyID = account.enter_oscae_legacyID_Field("Test Oscae Field");
		Assert.assertTrue(oscae_legacyID,"oscae_legacyID IS NOT VISIBLE");

		boolean parentAccount = account.enter_parentAccount_Field("50165821");
		Assert.assertTrue(parentAccount,"parentAccount IS NOT VISIBLE");

		boolean contractingEntity = account.enter_contractingEntity_Field("HDO01");
		Assert.assertTrue(contractingEntity,"contractingEntity IS NOT VISIBLE");

		boolean idp_Client = account.enter_idp_Client_Field("Yes");
		Assert.assertTrue(idp_Client,"idp_Client IS NOT VISIBLE");

		boolean account_Owner = account.enter_accountOwner_Field("9007");
		Assert.assertTrue(account_Owner,"account_Owner IS NOT VISIBLE");

		boolean Aliases = account.isAliases_Displayed();
		Assert.assertTrue(Aliases,"Aliases IS NOT VISIBLE");

		boolean legalName = account.enter_legalName_Field("Test Leagle name");
		Assert.assertTrue(legalName,"legalName IS NOT VISIBLE");

		boolean address = account.is_address_Field_IsDisplaying();
		Assert.assertTrue(address,"address IS NOT VISIBLE");

		boolean role = account.enter_role_Field("Institution");
		Assert.assertTrue(role,"role IS NOT VISIBLE");

		boolean IDP_directClient = account.isIDP_directClient_Field_Displaying();
		Assert.assertTrue(IDP_directClient,"IDP_directClient IS NOT VISIBLE");

		boolean account_status = account.enter_account_status_Field("On-Hold");
		Assert.assertTrue(account_status,"account_status IS NOT VISIBLE");

		boolean destination_country = account.enter_destination_country_Field("Canada");
		Assert.assertTrue(destination_country,"destination_country IS NOT VISIBLE");

		boolean university_class = account.enter_university_class_Field("A");
		Assert.assertTrue(university_class,"university_class IS NOT VISIBLE");

		boolean activated_Date = account.enter_activated_Date_Field("28.12.2022");
		Assert.assertTrue(activated_Date,"activated_Date IS NOT VISIBLE");

		boolean deactivate_Date = account.enter_deactivate_Date_Field("31.12.2022");
		Assert.assertTrue(deactivate_Date,"deactivate_Date IS NOT VISIBLE");

		boolean deactivate_Reason = account.enter_deactivate_Reason_Field("Test Deactivate");
		Assert.assertTrue(deactivate_Reason,"deactivate_Reason IS NOT VISIBLE");

		boolean client_Sector = account.enter_client_Sector_Field("University");
		Assert.assertTrue(client_Sector,"client_Sector IS NOT VISIBLE");

		boolean webSite = account.enter_webSite_Field("www.testsp.co.in");
		Assert.assertTrue(webSite,"webSite IS NOT VISIBLE");

		boolean applicatin_processingTime = account
				.enter_applicatin_processingTime_Field("Test Application Processing Time");
		Assert.assertTrue(applicatin_processingTime,"applicatin_processingTime IS NOT VISIBLE");

		boolean is_EBS_Account_siteID = account.is_EBS_Account_siteID_Displaying();
		Assert.assertTrue(is_EBS_Account_siteID,"is_EBS_Account_siteID IS NOT VISIBLE");

		boolean EBS_replication_Status = account.isEBS_replication_Status_Displayed();
		Assert.assertTrue(EBS_replication_Status,"EBS_replication_Status IS NOT VISIBLE");

		boolean EBS_Debtor_status = account.is_EBS_Debtor_status_Field_Displaying();
		Assert.assertTrue(EBS_Debtor_status,"EBS_Debtor_status IS NOT VISIBLE");

		boolean ebs_debtor_accountStatus = account.is_ebs_debtor_accountStatus_Field_Displaying();
		Assert.assertTrue(ebs_debtor_accountStatus,"ebs_debtor_accountStatus IS NOT VISIBLE");
	}

	@Then("Verify the Overview Fields in Contacts")
	public void verify_the_overview_tabs_in_contacts() {
		contact.click_On_Edit_Button();

		boolean contactID = contact.is_contactID_Displaying();
		Assert.assertTrue(contactID,"contactID FIELD IS NOT VISIBLE");

		boolean status = contact.is_status_Displaying();
		Assert.assertTrue(status,"status FIELD IS NOT VISIBLE");

		boolean name = contact.is_name_Displaying();
		Assert.assertTrue(name,"name FIELD IS NOT VISIBLE");

		boolean title = contact.enter_title("Mr.");
		Assert.assertTrue(title,"title FIELD IS NOT VISIBLE");

		boolean account = contact.enter_account("50075029");
		Assert.assertTrue(account,"account FIELD IS NOT VISIBLE");

		boolean job_title = contact.enter_job_title("Test Job");
		Assert.assertTrue(job_title,"job_title FIELD IS NOT VISIBLE");

		boolean business_address = contact.is_business_address_Displaying();
		Assert.assertTrue(business_address,"business_address FIELD IS NOT VISIBLE");

		boolean phone = contact.enter_phoneNumber("992929");
		Assert.assertTrue(phone,"phone FIELD IS NOT VISIBLE");

		boolean mobile = contact.enter_mobileNumber("990203");
		Assert.assertTrue(mobile,"mobile FIELD IS NOT VISIBLE");

		boolean email = contact.enter_email("Test@gmail.com");
		Assert.assertTrue(email,"email FIELD IS NOT VISIBLE");

		boolean primaryRole = contact.enter_primaryRole("Finance Contact");
		Assert.assertTrue(primaryRole,"primaryRole FIELD IS NOT VISIBLE");

		boolean secondaryRole = contact.enter_secondaryRole("Admissions Contact");
		Assert.assertTrue(secondaryRole,"secondaryRole FIELD IS NOT VISIBLE");

		boolean region = contact.enter_region("India");
		Assert.assertTrue(region,"region FIELD IS NOT VISIBLE");
	}

	@Then("Verify the Overview Fields in Contacts as a Counsellor")
	public void verify_the_overview_tabs_in_contacts_as_a_Counsellor() {
		contact.click_On_Edit_Button();

		boolean contactID = contact.iscontactidDisplaying_();
		Assert.assertTrue(contactID,"contactID FIELD IS NOT VISIBLE");

		boolean status = contact.isStatusDisplaying_();
		Assert.assertTrue(status,"status FIELD IS NOT VISIBLE");

		boolean name = contact.isNameDisplaying_();
		Assert.assertTrue(name,"name FIELD IS NOT VISIBLE");

		boolean title = contact.isTitleDisplaying_();
		Assert.assertTrue(title,"title FIELD IS NOT VISIBLE");

		boolean account = contact.isAccountDisplaying_();
		Assert.assertTrue(account,"account FIELD IS NOT VISIBLE");

		boolean job_title = contact.isJobTitleDisplaying_();
		Assert.assertTrue(job_title,"job_title FIELD IS NOT VISIBLE");

		boolean business_address = contact.isBusinessAddressDisplaying_();
		Assert.assertTrue(business_address,"business_address FIELD IS NOT VISIBLE");

		boolean phone = contact.isPhoneDisplaying_();
		Assert.assertTrue(phone,"phone FIELD IS NOT VISIBLE");

		boolean mobile = contact.isMobileDisplaying_();
		Assert.assertTrue(mobile,"mobile FIELD IS NOT VISIBLE");

		boolean email = contact.isEmailDisplaying_();
		Assert.assertTrue(email,"email FIELD IS NOT VISIBLE");

		boolean primaryRole = contact.isPrimaryRoleDisplaying_();
		Assert.assertTrue(primaryRole,"primaryRole FIELD IS NOT VISIBLE");

		boolean secondaryRole = contact.isSecondaryRoleDisplaying_();
		Assert.assertTrue(secondaryRole,"secondaryRole FIELD IS NOT VISIBLE");

		boolean region = contact.isRegionDisplaying_();
		Assert.assertTrue(region,"region FIELD IS NOT VISIBLE");
	}

	// Create the Account Record

	@Given("click on Add Icon in order to create new account")
	public void click_on_add_icon_in_order_to_create_new_account() {
		account.click_On_Account_Add_icon();
	}

	@Given("^Enter the account name (.*)$")
	public void enter_the_account_name_testcase_no(String testNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testNo);
		//account_Name = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Account","Account name");
		account_Name  ="Train__"+ElementUtil.generateRandomString(5);
		account.enter_account_Name(account_Name );
	}

	@Given("^Enter the Role name (.*)$")
	public void enter_the_role_name_testcase_no(String testNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testNo);
		Role = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Account","Role");
		account.enter_account_Role(Role);
	}

	@Given("^Enter the WebSite name (.*)$")
	public void enter_the_web_site_name_testcase_no(String testNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testNo);
		WebSite = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Account","WebSite");
		account.enter_account_WebSite(WebSite);
	}

	@Given("^Enter the CountryRegion name (.*)$")
	public void enter_the_country_region_name_testcase_no(String testNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testNo);
		CountryRegion = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Account","CountryRegion");
		account.enter_account_CountryRegion(CountryRegion);
	}

	@Given("^Enter the City name (.*)$")
	public void enter_the_city_name_testcase_no(String testNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testNo);
		City = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Account","City");
		account.enter_account_City(City);
	}

	@Given("^Enter the State name (.*)$")
	public void enter_the_state_name_testcase_no(String testNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testNo);
		State = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Account","State");
		account.enter_account_State(State);
	}

	@Given("^Enter the Owner name (.*)$")
	public void enter_the_owner_name_testcase_no(String testNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testNo);
		OwnerId = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Account","OwnerId");
		account.enter_account_Owner(OwnerId);
	}

	@Given("^Enter the AccountStatus name (.*)$")
	public void enter_the_account_status_name_testcase_no(String testNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testNo);
		AccountStatus = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Account","AccountStatus");
		account.enter_account_status_Field(AccountStatus);
	}

	@Then("Save and Open the Account Record")
	public void save_and_open_the_account_record() {
		
		account.saveTheAccountRecord();
	}

	@Then("Verify the Account is created with all the Data")
	public void verify_the_account_is_created_with_all_the_data() {
    ApplicationPageUtil.waitForLoadGetDisappiear();
    account.click_On_MoreBtn();
    account.click_On_EditBtn();
    Assert.assertTrue((account.get_account_Name().equals(account_Name)),"NAME FIELD IS NOT CREATED AS GIVEN DATA");
    Assert.assertTrue((account.get_account_Role().equals(Role)),"Role FIELD IS NOT CREATED AS GIVEN DATA");
   // Assert.assertTrue((account.get_account_WebSite().equals(WebSite)),"WebSite FIELD IS NOT CREATED AS GIVEN DATA");
        System.out.println(account.get_account_Name());
      	System.out.println(account.get_account_Role());
      	//System.out.println(account.get_account_WebSite());
      	System.out.println(account.get_accountID());
      	account.cancel_AccountRecord();
      	
	}
	
	@Given("Verify counsellor should not be able to add or edit the Accounts")
	public void verify_counsellor_should_not_be_able_to_add_or_edit_the_accounts() {
		boolean flag = account.click_On_Account_Add_icon();
		Assert.assertFalse(flag,"COUNSELLOR CAN ABLE TO ADD OR EDIT");
	}

}
