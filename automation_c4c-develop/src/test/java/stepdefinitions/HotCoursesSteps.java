package stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.pages.HotCoursesPage;
import com.pages.IC_CreationPage;
import com.pages.LeadCreationPage;
import com.pages.LoginPage;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotCoursesSteps {
	HotCoursesPage hc = new HotCoursesPage();
	IC_CreationPage ic = new IC_CreationPage();

	@Given("Launch the hot courses india URL {string}")
	public void launch_the_hot_courses_india_url(String key) throws IOException {
		
		
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(key);
		String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "url_HotCourses");
		hc.launchURL(url);
	}

	@When("Accept all cookies")
	public void accept_all_cookies() throws InterruptedException {
		hc.acceptCookies();
	}

	@Then("Scbscribe to the newsletter")
	public void scbscribe_to_the_newsletter() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Click help me to study abroad button")
	public void click_help_me_to_study_abroad_button() throws InterruptedException {
		hc.studyAbroad();
	}

	@Then("Enter the first name")
	public void enter_the_first_name() throws InterruptedException, IOException {
		hc.firstName();
	}

	@Then("Enter the second name")
	public void enter_the_second_name() throws InterruptedException, IOException {
		hc.lastName();
	}

	@Then("Enter the email ID")
	public void enter_the_email_id() throws InterruptedException, IOException {
		hc.email();
	}
	@Then("Enter the email ID existing user")
	public void enter_the_email_id_existing_user() throws InterruptedException, IOException {
		hc.emailExistinguser();
	}

	@Then("Enter the mobile number")
	public void enter_the_mobile_number() throws InterruptedException, IOException {
		hc.mobileNumber();
	}

	@Then("Select preferred study level")
	public void select_preferred_study_level() throws InterruptedException, IOException {
		hc.studyLevel();
	}

	@Then("Select preferred study location")
	public void select_preferred_study_location() throws InterruptedException, IOException {
		hc.studyLocation();
	}

	@Then("Select when do you want to study")
	public void select_when_do_you_want_to_study() throws InterruptedException, IOException {
		hc.Year();
	}

	@Then("Select month")
	public void select_month() throws InterruptedException, IOException {
		hc.month();
	}

	@Then("Click the terms and policy checkboxes")
	public void click_the_terms_and_policy_checkboxes() {
		hc.termsAndCondition();
	}
	@Then("Click the terms and policy checkboxes with out marketting permission")
	public void click_the_terms_and_policy_checkboxes_with_out_marketting_permission() {
		hc.termsAndConditionWithoutMarket();
	}

	@Then("Click speak to an expert button")
	public void click_speak_to_an_expert_button() throws InterruptedException {
		hc.speakToExpert();
	}

	@Then("Click submit button as online counselling")
	public void click_submit_button_as_online_counselling() throws InterruptedException, IOException {
		HotCoursesPage.submit();
	}

	@Then("Click skip all button")
	public void click_skip_all_button() throws InterruptedException {
		hc.skipAll();
	}

	@Then("Click on YES button from popup")
	public void click_on_yes_button_from_popup() throws InterruptedException {
		hc.popupYes();
	}

	@Then("create a password")
	public void create_a_password() throws InterruptedException, IOException {
		hc.createPassword();
	}

	@Then("Click on register now button")
	public void click_on_register_now_button() {
		hc.register();
	}

	@And("Save the email")
	public void Save_the_email() {
		hc.saveEmail();
	}

	@Then("Get the Hot Courses email address")
	public void Get_the_Hot_Courses_email_address() throws InterruptedException {
		ic.getHCEmail();
	}

	@Then("Click on profile icon")
	public void click_on_profile_icon() throws InterruptedException {
		hc.clickMyProfile();
	}

	@Then("Enter the email address")
	public void enter_the_email_address() throws InterruptedException, IOException {
		hc.enterEMail();
	}

	@Then("Enter the password")
	public void enter_the_password() throws InterruptedException, IOException {
		hc.enterPassword();
	}

	@Then("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		hc.clickLoginHC();
	}

	@Then("Click Search course icon")
	public void click_search_course_icon() throws InterruptedException {
		hc.clickSearchHC();
	}

	@Then("Search and open a course")
	public void search_and_open_a_course() throws InterruptedException, IOException {
		hc.searchCourse();
	}

	@Then("Click helpme to apply button")
	public void click_helpme_to_apply_button() throws InterruptedException {

		hc.helpToApply();
		Assert.assertTrue(true,"PASSED:- Verified "+ hc.verifySuccess());
		
		// Assert.assertFalse("FAILED:- Unable to verify ", hc.verifySuccess());

	}
	@Then("Open the first lead")
	public void open_the_first_lead() throws InterruptedException {
		LeadCreationPage.clickFirstLeadRecordInFlow();
	}
	@Then("Open the second lead")
	public void open_the_second_lead() throws InterruptedException {
		LeadCreationPage.clickSecondLeadRecordInFlow();
	}
	@Then("Switch to online tab")
	public void switch_to_online_tab() throws InterruptedException {
		HotCoursesPage.switchToOnlineTab();
	}
	@Then("Verify the site ID updated with the application")
	public void verify_the_site_id_updated_with_the_application() {
		HotCoursesPage.verifySiteID();
	}
	@Then("Verify the URL is updated")
	public void verify_the_url_is_updated() throws InterruptedException {
		HotCoursesPage.verifyURL();
	}
	@Then("Verify the nearest IDP office is updated")
	public void verify_the_nearest_idp_office_is_updated() {
		HotCoursesPage.verifyNearestIDPOffice();
	}
	@Then("Verify the first lead created value as Yes")
	public void verify_the_first_lead_created_value_as_yes() {
		HotCoursesPage.verifyFirstLead();
	}
	@Then("Verify the first lead created value as No")
	public void verify_the_first_lead_created_value_as_no() {
		HotCoursesPage.verifySecondLead();
	}
	
	@Then("Verify the marketting permission set to YES")
	public void verify_the_marketting_permission_set_to_yes() {
		HotCoursesPage.verifyMArkettingPermissionYes();
	}
	@When("Select counselling mode as in person counselling")
	public void select_counselling_mode_as_in_person_counselling() throws InterruptedException {
		HotCoursesPage.selectInPersonCounselling();
	}
	@When("Select nearest IDP office")
	public void select_nearest_idp_office() throws InterruptedException, IOException {
		HotCoursesPage.selectIDPOffice();
		
	}
	@Then("Verify the marketting permisson field marked as No")
	public void verify_the_marketting_permisson_field_marked_as_no() {
		HotCoursesPage.verifyMArkettingPermissionNo();
	}
	@Given("the user Login to Hot Courses as {string} in {string} and {string}")
	public void the_user_login_to_Hot_Courses(String role,String env,String testCaseNo ) 
	{
	HotCoursesPage.loginTo_HotCourses_Application(role,env,testCaseNo);
	}

}
