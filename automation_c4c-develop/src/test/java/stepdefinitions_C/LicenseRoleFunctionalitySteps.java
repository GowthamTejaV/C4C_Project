package stepdefinitions_C;

import org.testng.Assert;

import com.pages.IC_CreationPage;
import com.pages.LeadCreationPage;
import com.pages.LicenseeRestrictionsPage;
import com.pages.LoginPage;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LicenseRoleFunctionalitySteps {
	LicenseeRestrictionsPage licenseRestriction=new LicenseeRestrictionsPage();
	IC_CreationPage icCreationPage=new IC_CreationPage();
	LeadCreationPage lead =new LeadCreationPage();
	
	IC_CreationPage icp = new IC_CreationPage();
	@Then("Verify user should be able to view only the information of his own country or Office records in list view")
	public void verify_user_should_be_able_to_view_only_the_information_of_his_own_country_or_office_records_in_list_view() {
		String txt = licenseRestriction.getMyCutomerIndividualCustomerTxt();
		Assert.assertEquals(txt, "My Country's Individuals");
	}

	@Given("Navigate to Licensee Individual Customers Page")
	public void navigate_to_licensee_individual_customers_page() {
		try {
			LoginPage.navigateToPage("Customers", "Licensee Individual Customers");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Click On Advance Filter Icon")
	public void click_on_advance_filter_icon() {
		icCreationPage.clickIc_advanceFilterIcon();
	}

	@Then("Verify the Customer ID field is Displaying for the Licensee Counsellor")
	public void verify_the_customer_id_field_is_displaying_for_the_licensee_counsellor() {
		String actualText = icCreationPage.getCustomerIDtext();
		Assert.assertEquals(actualText, "Customer ID");

	}

	@Then("Click On Lead Page Edit")
	public void click_on_lead_page_edit() {
		licenseRestriction.clickOnMoreButton();
		licenseRestriction.clickOnLicenceLeadEditButton();

	}

	@Then("Click on Licence Lead Add icon")
	public void click_on_licence_lead_add_icon() {
		licenseRestriction.clickOnLicenceLeadAddBtn();
	}

	@Then("^Enter Study Plan Date (.*)$")
	public void enter_study_plan_date(String testcaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		String plan_dateText = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Study Plan Date");
		System.out.println("Study Plan Date"+plan_dateText);
		licenseRestriction.enter_Study_plan_dateText(plan_dateText);
	}

	@Then("^Enter Study Level I Prefer (.*)$")
	public void enter_study_level_i_prefer_dc(String testcaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		String studyLevelIPrefer = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Study Level I Prefer Is");
		System.out.println("Study Level I Prefer"+studyLevelIPrefer);
		licenseRestriction.enter_studyLevelIPrefer(studyLevelIPrefer);
		lead.save_and_Open();

	}
	@Then("^Study Plan Date Is(.*)$")
	public void enter_study_plan_date_Is(String text) {
		System.out.println("Study Plan Date"+text);
		lead.enter_Study_Plan_Date(text);
	}

	@Then("^Study Level I Prefer Is (.*)$")
	public void study_level_i_prefer_Is(String text) {
		System.out.println("Study Level I Prefer"+text);
		lead.enter_Study_Level_I_Prefer_Is(text);
		
	}

	@Then("Assign the Lead ownership to any other country users (.*)$")
	public void assign_the_lead_ownership_to_any_other_country_users(String testcaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		String userID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"IDP owner ID");
		lead.enter_IDP_OWNER_Field(userID);
	}

	@Then("^Verify the IDP Owner is assigned (.*)$")
	public void verify_the_idp_owner_is_assigned(String testcaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		String ExpectdidpOwnerName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"IDPownerName");
		String actualText = licenseRestriction.getIdpOwnerName();
		System.out.println(actualText);
		Assert.assertEquals(actualText, ExpectdidpOwnerName);

	}

}
