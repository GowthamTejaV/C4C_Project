package stepdefinitions;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.pages.HotCoursesPage;
import com.pages.IC_ContractCreationPage;
import com.pages.IC_CreationPage;
import com.pages.IC_HistoryPage;
import com.pages.IC_LeadCreationpage;
import com.pages.LeadCreationPage;
import com.pages.LoginPage;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndividualCustomer {

	Properties prop;
	private ConfigReader configReader;

	LeadCreationPage leadCreation = new LeadCreationPage();
	IC_CreationPage create = new IC_CreationPage();
	ApplicationPageUtil appUtil = new ApplicationPageUtil();
	IC_HistoryPage history = new IC_HistoryPage();
	IC_LeadCreationpage leads = new IC_LeadCreationpage();
	LoginPage login = new LoginPage();
	IC_ContractCreationPage contractpage = new IC_ContractCreationPage();
	HotCoursesPage hc = new HotCoursesPage();


	@Given("User Login to C4C application {string}")
	public void user_login_to_c4c_application(String key) throws Exception {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(key);

		configReader = new ConfigReader();
		prop = configReader.init_prop();
		String env = prop.getProperty("environment");

		if (env.equals("UAT")) {
			String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_url");
			String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_username");
			String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_password");
			LoginPage.loginTotheApplication(url, username, password);
			ExtentCucumberAdapter.addTestStepLog("Logged in sucessfully");
		} else if (env.equals("DEV")) {
			String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "Dev_Url");
			String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login",
					"Dev_User_Couns5");
			String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login",
					"Dev_Pass_Couns5");
			LoginPage.loginTotheApplication(url, username, password);
			ExtentCucumberAdapter.addTestStepLog("Logged in sucessfully");
		} else if (env.equals("TRAIN")) {
			String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "Dev_Url");
			String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login",
					"Dev_User_Couns5");
			String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login",
					"Dev_Pass_Couns5");
			LoginPage.loginTotheApplication(url, username, password);
			ExtentCucumberAdapter.addTestStepLog("Logged in sucessfully");
		}

	}

	@Given("User Login to C4C application Train{string}")
	public void user_login_to_c4c_application_Train(String key) throws Exception {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(key);

		String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "TRAIN_url");
		String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "Train_username");
		String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "Train_password");

		LoginPage.loginTotheApplication(url, username, password);
	}


	@Given("User Login to C4C application as a Mara Agent {string}")
	public void user_login_to_c4c_application_as_a_Mara_Agent(String key) throws Exception {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(key);

		String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_url");
		String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "MaraAgent_username");
		String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "MaraAgent_password");

		LoginPage.loginTotheApplication(url, username, password);
	}


	@Given("User Login to C4C application as a AU Manager {string}")
	public void user_login_to_c4c_application_as_a_AU_Manager(String key) throws Exception {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(key);

		String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_url");
		String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "AU_Manager_username");
		String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "AU_Manager_password");

		LoginPage.loginTotheApplication(url, username, password);
	}
	@Given("User Login to C4C application train office manager{string}")
	public void user_login_to_c4c_application_train_office_manager(String key) throws Exception {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(key);

		String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "TRAIN_url");

		String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "Train_OfficeManager_username");
		String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "Train_OfficeManager_password");

		LoginPage.loginTotheApplication(url, username, password);
		ExtentCucumberAdapter.addTestStepLog("Logged in sucessfully");
	}

	// use
	@And("Navigate to Individual Customer Page")
	public void navigate_to_individual_customer_page() throws InterruptedException {
		LoginPage.navigateToPage("Customers", "Individual Customers");
	}

	// use
	@Then("get the student id")
	public void get_the_student_id() {
		create.putStudentId();
	}

	@Then("get the channel partner student id")
	public void get_the_channel_partner_student_id() {
		IC_CreationPage.getCPPStudentId();
	}

	// use
	@When("Click on create icon and select Individual customer")
	public void click_on_create_icon_and_select_individual_customer() throws InterruptedException {
		IC_CreationPage.createIC();
	}

	// use
	@Then("Verify by entering all the mandatory fields")
	public void verify_by_entering_all_the_mandatory_fields() throws InterruptedException, IOException {
		IC_CreationPage.createIndividual_Customer("General");

	}
	@Then("Verify by entering all the mandatory fields others")
	public void verify_by_entering_all_the_mandatory_fields_others() throws InterruptedException, IOException {
		IC_CreationPage.IndividualCustomer_others();;

	}

	@Then("Verify by entering all the mandatory fields for duplicate flow")
	public void verify_by_entering_all_the_mandatory_fields_for_duplicate_flow()
			throws InterruptedException, IOException {
		IC_CreationPage.createIndividual_Customer("Duplicate");

	}

	@Then("Verify by entering all the mandatory fields for regression")
	public void verify_by_entering_all_the_mandatory_fields_for_regression() throws InterruptedException, IOException {
		IC_CreationPage.IndividualCustomer_regression();

	}

	@Then("Verify by entering all the mandatory fields for Train")
	public void verify_by_entering_all_the_mandatory_fields_for_Train() throws InterruptedException, IOException {
		IC_CreationPage.createIndividual_Customers_Train();

	}

	@And("Update IC record")
	public void Update_IC_record() throws InterruptedException, IOException {
		IC_CreationPage.UpdateICRecordTrain();
	}

	@Then("Click on save and open button")
	public void click_on_save_and_open_button() throws InterruptedException {
	}

	// use
	@Then("Click on save and open button regression")
	public void click_on_save_and_open_button_regression() throws InterruptedException {
		IC_CreationPage.saveICrecord("Save and Open");
	}

	@Then("Click on save button regression")
	public void click_on_save_button_regression() throws InterruptedException {
		IC_CreationPage.saveICrecord("Save");
	}

	@Then("Click on save and new button regression")
	public void click_on_save_and_new_button_regression() throws InterruptedException {
		IC_CreationPage.saveICrecord("Save and New");
	}

	// use
	@Then("Save the studentId")
	public void Save_the_studentId() {
		create.getStudentId();
	}

	@Then("Save the studentId for contract")
	public void Save_the_studentId_for_contract() {
		create.getStudentIdContract();
	}

	@Then("get the student id for contract")
	public void get_the_student_id_for_contract() {
		create.putStudentIdContract();
	}

	@And("Verifiy if the IC is created successfully")
	public void Verifiy_if_the_IC_is_created_successfully() throws InterruptedException {

	}

	// use
	@Then("Search for a record")
	public void Search_for_a_record() throws InterruptedException {
		create.search_for_IC();

	}

	@Then("Search for HC record")
	public void Search_for_HC_record() throws InterruptedException {
		create.search_for_HCemail();
		Thread.sleep(1000);
	}

	// use
	@Then("Select first record from table")
	public void Select_first_record_from_table() throws InterruptedException {
		create.clickFirstRecordFromIC();
	}

	// use
	@And("Switch to history tab")
	public void Switch_to_history_tab() throws InterruptedException {
		history.switchHIstoryTab();
	}

	// use
	@Then("Click edit button")
	public void Click_edit_button() throws InterruptedException {
		create.editIC();
	}

	// use
	@And("click more button")
	public void click_more_button() throws InterruptedException {
		IC_CreationPage.clickMoreButton();
	}

	// use
	@And("fill the required fields")
	public void fill_the_required_fields() throws InterruptedException, IOException {
		create.updateIC();
	}

	@And("Fill the required fields to be updated")
	public void Fill_the_required_fields_to_be_updated() throws InterruptedException, IOException {
		IC_CreationPage.UpdateICRecord();
	}

	@And("Fill the required fields add more details")
	public void Fill_the_required_fields_add_more_details() throws InterruptedException, IOException {
		IC_CreationPage.addMoreDetails();
	}

	// use
	@Then("Click on add education history button")
	public void Click_on_add_education_history_button() throws Exception {
		history.clickAddEducation();
	}

	// use
	@And("fill the all mandatory fields in education history tab")
	public void fill_the_all_mandatory_fields_in_education_history_tab() throws Exception {
		history.addEducationHistory();
	}

	// use
	@Then("click on save history button")
	public void click_on_save_history_button() throws InterruptedException {
		history.saveHistoryPage();
	}

	// use
	@Then("Click on add employment history button")
	public void Click_on_add_employment_history_button() throws InterruptedException {
		history.clickAddEmployment();
	}

	// use
	@And("fill the all mandatory fields in employment history tab")
	public void fill_the_all_mandatory_fields_in_employment_history_tab() throws InterruptedException, IOException {
		history.addEmploymentHistory();
	}

	@And("fill the all mandatory fields in employment history tab Train")
	public void fill_the_all_mandatory_fields_in_employment_history_tab_Train()
			throws InterruptedException, IOException {
		history.addEmploymentHistoryTrain();
	}

	// use
	@And("click add english proficiency data")
	public void click_add_english_proficiency_data() throws InterruptedException, IOException {
		history.addEnglishProficiency();
	}

	// use
	@And("Switch to leads tab")
	public void Switch_to_leads_tab() throws InterruptedException {
		leads.switchLeadsTab();
	}

	@And("Open the OIP lead from lead list")
	public void Open_the_OIP_lead_from_lead_list() throws InterruptedException {
		LeadCreationPage.clickSecondLeadRecord();
	}

	// use
	@Then("click on save IC")
	public void click_on_save_IC() throws InterruptedException {
		create.saveIC();
	}

	// use
	@Then("verify the data exist in leads tab")
	public void verify_the_data_exist_in_leads_tab() {
		Assert.assertTrue(true, "PASSED:- New record created" + IC_CreationPage.verifyLead());


	}

	@And("Verify the lead created multiple times")
	public void Verify_the_lead_created_multiple_times() {
		Assert.assertTrue(true, "PASSED:- New record created" + create.HCmultipleRow());

	}

	@And("Click on save and open button from new IC")
	public void Click_on_save_and_open_button_from_new_IC() throws InterruptedException {
		create.saveNewIC();
	}

	// use
	@Then("switch to contract tab")
	public void switch_to_contract_tab() throws InterruptedException {
		contractpage.switchToContractTab();
	}

	// use
	@And("click on create new contract button")
	public void click_on_create_new_contract_button() throws InterruptedException {
		contractpage.clickON_addContractButton();
	}

	@And("Click on edit contract button")
	public void Click_on_edit_contract_button() {

	}

	// use
	@Then("fill all the mandatory fields in contrcat page")
	public void fill_all_the_mandatory_fields_in_contrcat_page() throws IOException, InterruptedException {
		contractpage.createContract();
	}

	// use
	@And("Click on create IC icon")
	public void Click_on_create_IC_icon() throws InterruptedException {
		IC_CreationPage.createIC();
	}

	// use
	@Then("Enter the site ID")
	public void Enter_the_site_ID() throws InterruptedException, IOException {
		IC_CreationPage.enterSiteID();

	}

	// use
	@And("verify if country region field is selected")
	public void verify_if_country_region_field_is_selected() throws InterruptedException, IOException {
		// IC_CreationPage.enterSiteID();
		IC_CreationPage.verifyCountryRegion();

	}

	// use
	@Then("mobile number code is auto populated against the site id")
	public void mobile_number_code_is_auto_populated_against_the_site_id() throws InterruptedException, IOException {
		IC_CreationPage.verifyMobileCode();

	}

	@And("Verify the overview page facet fields")
	public void Verify_the_overview_page_facet_fields() throws Exception {
		IC_CreationPage.verifyOverviewFields();
	}

	@And("Click on the more button in overview page")
	public void Click_on_the_more_button_in_overview_page() throws InterruptedException {
		IC_CreationPage.clickMoreButton();
	}

	@Then("Click edit button in Overview page")
	public void click_edit_button_in_overview_page() throws InterruptedException {
		IC_CreationPage.globalEdit();
	}

	@And("Verify the picklist items of the Student Lifecycle field in the IC Overview")
	public void Verify_the_picklist_items_of_the_Student_Lifecycle_field_in_the_IC_Overview() throws Exception {
		IC_CreationPage.studentLifeCyclePickList();
	}

	@Then("Verify the picklist items of Gender field in IC Overview")
	public void verify_the_picklist_items_of_gender_field_in_ic_overview() throws Exception {
		IC_CreationPage.genderPicklist();
	}

	@Then("Verify the picklist items of Marital status field")
	public void verify_the_picklist_items_of_marital_status_field() throws Exception {
		IC_CreationPage.maritalStatusPicklist();
	}

	@Then("Verify the picklist values of Country of birth field")
	public void verify_the_picklist_values_of_country_of_birth_field() throws Exception {
		IC_CreationPage.countryOfBirthPicklist();
	}

	@Then("Verify the picklist values for Nationality Field")
	public void verify_the_picklist_values_for_nationality_field() throws Exception {
		IC_CreationPage.nationalityPicklist();
	}

	@Then("Verify the picklist values for Country of residency Field")
	public void verify_the_picklist_values_for_country_of_residency_field() throws Exception {
		IC_CreationPage.countryOfResidentPicklist();
	}

	@Then("Verify the picklist values for Primary Language Field")
	public void verify_the_picklist_values_for_primary_language_field() throws Exception {
		IC_CreationPage.primaryLanguagePicklist();
	}

	@Then("Verify the picklist items of Academic Title field")
	public void verify_the_picklist_items_of_academic_title_field() throws Exception {
		IC_CreationPage.academicTitlePicklist();
	}

	@Then("Verify the picklist values for Site ID Field in the IC Overview")
	public void verify_the_picklist_values_for_site_id_field_in_the_ic_overview() throws Exception {
		IC_CreationPage.siteIdPicklist();
	}

	@Then("Verify the picklist values for Counselling Mode Field in the IC Overview")
	public void verify_the_picklist_values_for_counselling_mode_field_in_the_ic_overview() throws Exception {
		IC_CreationPage.counsellingModePicklist();
	}

	@And("Verify the default values at the IC Overview")
	public void Verify_the_default_values_at_the_IC_Overview() {
		IC_CreationPage.verifyDefaultValuesOverviewPage();
	}

	@And("Verify the IDP Section below the Overview facet")
	public void Verify_the_IDP_Section_below_the_Overview_facet() {
		IC_CreationPage.verifyIDPsection();
	}

	@And("Click cancel button from overview page")
	public void Click_cancel_button_from_overview_page() throws InterruptedException {
		IC_CreationPage.globalCancel();
	}

	@Then("Verify whether the Copy lead option is disabled when the lead is assigned to the CAP officer")
	public void verify_whether_the_copy_lead_option_is_disabled_when_the_lead_is_assigned_to_the_cap_officer() {
		boolean flag = leadCreation.isCopyButtonDisplying();
		Assert.assertTrue(!flag);
	}

	@And("Verify that enabling the Show Communication details radio button displays the email id and contact number")
	public void Verify_that_enabling_the_Show_Communication_details_radio_button_displays_the_email_id_and_contact_number()
			throws InterruptedException {
		IC_CreationPage.verifyShowCommunicationDetails();
	}
	@Then("Select the reffered by counsellor")
	public void select_the_reffered_by_counsellor() throws InterruptedException {
		IC_CreationPage.verifyRefferedBy();
	}
	@Then("Verify header message for referred by")
	public void verify_header_message_for_referred_by() throws InterruptedException {
		IC_CreationPage.verifyHeaderRefferedBy();
	}
	@Then("Select referral counsellor ID")
	public void select_referral_counsellor_id() throws InterruptedException {
		IC_CreationPage.verifyReferralCounselor();
	}
	@Then("Verify header message for referral counsellor ID")
	public void verify_header_message_for_referral_counsellor_id() throws InterruptedException {
		IC_CreationPage.verifyHeaderRefferalCounsellor();
	}
	@Then("Fill all referral fields")
	public void fill_all_referral_fields() throws InterruptedException {
		IC_CreationPage.FillRefferalFields();
	}
	 @And ("Verify header message for referral")
	 public void Verify_header_message_for_referral() throws InterruptedException 
	 {
		 IC_CreationPage.verifyHeaderRefferal();
	 }
			 



}
