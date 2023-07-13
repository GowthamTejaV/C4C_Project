package stepdefinitions_C;

import java.io.IOException;

import org.testng.Assert;

import com.pages.IC_ContractCreationPage;
import com.pages.IC_CreationPage;
import com.pages.IC_HistoryPage;
import com.pages.IC_LeadCreationpage;
import com.pages.IC_Opportunitypage;
import com.pages.Lead_CourseCreationPage;
import com.pages.Lead_QalificationCreationPage;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TagContractToLeadAndVerifyInOpportunity {
	public static int courseCount;
		
	IC_CreationPage iCc=new IC_CreationPage();
	IC_ContractCreationPage contractpage=new IC_ContractCreationPage();
	IC_LeadCreationpage iC_leadpage=new IC_LeadCreationpage();
	Lead_QalificationCreationPage lq=new Lead_QalificationCreationPage();
	Lead_CourseCreationPage lc=new Lead_CourseCreationPage();
	ApplicationPageUtil appPageutil=new ApplicationPageUtil();
	IC_Opportunitypage icop=new IC_Opportunitypage();
	IC_HistoryPage history=new IC_HistoryPage();

	@And("Use Should be able to log in to C4C as a contract admin user successfully")
	public void use_should_be_able_to_log_in_to_c4c_as_a_contract_admin_user_successfully() {

	}

	@Given("User navigate to the IC page")
	public void user_navigate_to_the_ic_page() {
		appPageutil.clickOn_Hamburgermenu();
		iCc.navigateTo_IC_page_As_Counsellor();
	}

	@And("User navigate to IC record creation page")
	public void user_navigate_to_ic_record_creation_page() {
		try {
			iCc.naviagteTo_IC_creationPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@And("^User create new Individual Customers record successfully (.*)$")
	public void user_create_new_individual_customers_record_successfully(String string) {
		iCc.createIndividual_Customers(string);
	}
	@And("User create new Individual Customers record {string}")
	public void user_create_new_individual_customers_record(String string) {
		iCc.createIndividual_Customers(string); 
	}
	@And("user navigate to the contract creation page")
	public void user_navigate_to_the_contract_creation_page() {
		contractpage.navigate_To_ContractPage();
	}

	@And("^User create new contract record (.*)$")
	public void user_create_new_contract_record(String string) {
		try {
			contractpage.clickON_addContractButton();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contractpage.createContract(string);
	}

	@And("User navigate to the Lead page")
	public void user_user_navigate_to_the_lead_page() {
		iC_leadpage.navigateToLeadTab();
	}

	@And("User tag the Contract to Lead")
	public void user_tag_the_contract_to_lead() {
		iC_leadpage.select_On_Lead_from_IC_Flow();
		iC_leadpage.clickOnContractField_and_mapContractToLead();
	}

	@And("User conver the lead to opportunity")
	public void user_conver_the_lead_to_opportunity() {

		try {
			iC_leadpage.convert_Lead_To_Opportunity();
			Thread.sleep(8000);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ConfigReader.writeToApplicationPropertie("OpportunityID", icop.getOpportunityID());
			ConfigReader.writeToApplicationPropertie("IcStudent360OpportunityID", icop.getOpportunityID());
			icop.click_On_MoreOverview();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("User Verify the contract ID at the opportunity level")
	public void user_verify_the_contract_id_at_the_opportunity_level() {
		String actualRes = iC_leadpage.get_ContractID_From_Opportunity();

		String expectedRes = ConfigReader.getApplicationPropertie("ContractID");
		Assert.assertEquals(expectedRes, actualRes);

	}

	@Then("^create the Qualification (.*)$")
	public void create_the_qualification(String string) {
		// lq.navigateTo_QualificationTab();
		lq.click_QualificationTab();
		lq.create_Qualification(string);
	}

	@Then("add the course")
	public void create_and_add_the_course() {
		ElementUtil.waitForPageLoad();
		lc.navigateToCourseSelectionTab();
		lc.click_OnAddCourse_Button();
		// lc.click_OnSearchIcon();
		// lc.searchForCourse("canada");
		lc.select_FirstCourseInList();
		lc.cancelAddCourseWindow();
	}

	@Then("Verify the list of courses should be displayed in the Selected Courses table")
	public void verify_the_list_of_courses_should_be_displayed_in_the_selected_courses_table() {
		courseCount = lc.getTodtalCourses();
		Assert.assertTrue(courseCount > 0);
	}

	@Then("User should click on Detele Course Icon for Selected Course")
	public void user_should_click_on_detele_course_icon_for_selected_course() {
		lc.click_DeleteCurseIcon();
	}

	@Then("Verify the course should be deleted")
	public void verify_the_course_should_be_deleted() {
		int count = lc.getTodtalCourses();
		Assert.assertTrue(count == (courseCount - 1));
	}

	@Given("user navigate to History page")
	public void user_navigate_to_history_page() {
		iC_leadpage.HistoryTab();
	}

	@Given("create English prefernece Details")
	public void crete_english_prefernece_details() {
		history.enter_EnglishProficiecyTest_Status();
	}

	@Given("^click on edit Icon and create English prefernece Details (.*)$")
	public void click_On_Edit_Icon_and_create_english_prefernece_details(String string) {
		history.enter_EnglishProficiecyTest_Status_By_Edit(string);
	}

	/*****************************/

	// 1
	@And("User create new contract record")
	public void user_create_new_contract_record() throws IOException, InterruptedException {
		contractpage.clickON_addContractButton();
		contractpage.createContract();
	}

	@Then("create the Qualification")
	public void create_the_qualification() {
		lq.navigateTo_QualificationTab();
		lq.click_QualificationTab();
		lq.create_Qualification();
	}

}
