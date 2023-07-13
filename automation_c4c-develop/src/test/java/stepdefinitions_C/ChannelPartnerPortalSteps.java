package stepdefinitions_C;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.pages.ChannelPartnerPage;
import com.pages.IC_CreationPage;
import com.pages.IC_LeadCreationpage;
import com.pages.IC_Opportunitypage;
import com.pages.LeadCreationPage;
import com.pages.Lead_QalificationCreationPage;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ExcelUtil;
import com.qa.util.Excel_Reader;
import AppHooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChannelPartnerPortalSteps {
	ChannelPartnerPage channelPartner = new ChannelPartnerPage();
	private static String firstname;
	private static String lastName;
	private static String nonEnglishName;
	IC_CreationPage icp = new IC_CreationPage();
	IC_LeadCreationpage icLead = new IC_LeadCreationpage();
	Lead_QalificationCreationPage qualification = new Lead_QalificationCreationPage();
	LeadCreationPage lead = new LeadCreationPage();
	Lead_QalificationCreationPage lq = new Lead_QalificationCreationPage();
	IC_CreationPage ic = new IC_CreationPage();
	IC_Opportunitypage opportunity = new IC_Opportunitypage();

	@Given("the user Login to Channel Partner as {string} in {string}")
	public void the_user_login_to_channel_partner(String role,String env) {
		channelPartner.loginTo_Channel_Partner_Application(role,env);
	}

//	@Given("User Login to Channel Partner with valid credential")
//	public void user_login_to_channel_partner_with_valid_credential() {
//		channelPartner.loginTo_Channel_Partner_Application();
//	}

	@Given("Verify Login should be successful by redirecting to the CPP Home page")
	public void verify_login_should_be_successful_by_redirecting_to_the_cpp_home_page() {
		boolean falg = channelPartner.isGenrealTab_Displaying();
		Assert.assertTrue(falg);
	}

	@Given("Verify the user is redirecting to the Education History Tab page")
	public void verify_user_is_redirecting_to_the_educationHistoryTab_() {
		boolean falg = channelPartner.iseducationHistoryTab_Displaying();
		Assert.assertTrue(falg);
	}

	@Then("User clicks on create record Icon")
	public void user_clicks_on_create_record_icon() {
		channelPartner.addNewRecord_In_EducationHistory();
	}

	@Then("User clicks on create record Icon in Employement History Tab")
	public void user_clicks_on_create_record_icon_employement_history_tab() {
		channelPartner.addNewRecord_In_employementHistory();
	}

	@Then("User Enter Education History Institution Name (.*)$")
	public void user_enter_education_history_institution_name_cpp(String testCaseNo) {
		channelPartner.enter_instuteName(testCaseNo);
	}

	@Then("User Enter Education History Language of Study (.*)$")
	public void user_enter_education_history_language_of_study_cpp(String testCaseNo) {
		channelPartner.enter_LanguageOfStudy(testCaseNo);
	}

	@Then("User Enter Education History Commencement of Study (.*)$")
	public void user_enter_education_history_commencement_of_study_cpp(String testCaseNo) {
		channelPartner.enter_CommencementOfStudy(testCaseNo);
	}

	@Then("User entered Invalid data in the Commencement of Study")
	public void user_entered_invalid_data_in_the_commencement_of_study() {

	}

	@Then("User entered Invalid data in the Graduation Date")
	public void user_entered_invalid_data_in_the_graduation_date() {

	}

	@Then("User Enter Education History Graduation Date (.*)$")
	public void user_enter_education_history_graduation_date_cpp(String testCaseNo) {
		channelPartner.enter_GraduationDate(testCaseNo);
	}

	@Then("User entered Commencement of study date greater than Graduation Date")
	public void user_entered_commencement_of_study_date_greater_than_graduation_date() {

	}

	@Then("Verify the {string} error message should be displayed for Commencement Date")
	public void verify_the_error_message_should_be_displayed_for_commencement_date(String string) {
		Assert.assertTrue(channelPartner.getGraduationDategreater_thanCommencementDatefields_errorMsg_ErrorMessage()
				.equals(string));
	}

	@Then("User Enter Education History Degree Type (.*)$")
	public void user_enter_education_history_degree_type_cpp(String testCaseNo) {
		channelPartner.enter_degreeType(testCaseNo);
	}

	@Then("User Enter Education History Degree Name (.*)$")
	public void user_enter_education_history_degree_name_cpp(String testCaseNo) {
		channelPartner.enter_degreeName(testCaseNo);
	}

	@Then("User Enter Education History Study Mode (.*)$")
	public void user_enter_education_history_study_mode_cpp(String testCaseNo) {
		channelPartner.enter_StudyMode(testCaseNo);
	}

	@Then("User Enter Education History Country of Study (.*)$")
	public void user_enter_education_history_country_of_study_cpp(String testCaseNo) {
		channelPartner.enter_CountryofStudy(testCaseNo);
	}

	@Then("User Enter Education History Field Of Study (.*)$")
	public void user_enter_education_history_field_of_study_cpp(String testCaseNo) {
		channelPartner.enter_fieldofstudy(testCaseNo);
	}

	@Then("User Enter Education History Grade (.*)$")
	public void user_enter_education_history_grade_cpp(String testCaseNo) {
		channelPartner.enter_Grade(testCaseNo);
	}

	@Then("User Enter Education History Status (.*)$")
	public void user_enter_education_history_status_cpp(String testCaseNo) {
		channelPartner.enter_status(testCaseNo);
	}

	@Then("User Enter the Institution Name field as Null")
	public void user_enter_the_institution_name_field_as_null() {

	}

	@Then("User entered Invalid data in the Language of Study")
	public void user_entered_invalid_data_in_the_language_of_study() {

	}

	@Then("SignOut to Channel Partner portel")
	public void sign_out_to_channel_partner_portel() {
		channelPartner.signOutFromTheApplication();
	}

	@Then("User enter the Invalid credential in the Email and Pasword field and click log on")
	public void user_enter_the_invalid_credential_in_the_email_and_pasword_field_and_click_log_on() {
		channelPartner.login_with_Invalid_EmailID_Psw_to_Channel_Partner_Application();
	}

	@Then("Login should fail with {string} Error Message")
	public void login_should_fail_with_error_message(String string) {
		Assert.assertTrue(string.equals(channelPartner.getInvaidLogin_errorMsg()));
	}

	@Then("User enter the Invalid EmailID and click log on")
	public void user_enter_the_invalid_email_id_and_click_log_on() {
		channelPartner.login_with_Invalid_EmailID_to_Channel_Partner_Application();
	}

	@Then("User enter the Invalid password and click log on")
	public void user_enter_the_invalid_password_and_click_log_on() {
		channelPartner.login_with_Invalid_Psw_to_Channel_Partner_Application();
	}

	@Given("User Click on Submit Student Application tab")
	public void user_click_on_submit_student_application_tab() {
		channelPartner.click_on_Submit_Student_Application_Tab();
	}

	@Given("^User Enter Student Application invalid First Name (.*)$")
	public void user_enter_student_application_invalid_first_name_first_name(String string) {
		channelPartner.enter_Firdtname(string);
	}

	@Given("^User Enter Student Application First Name (.*)$")
	public void user_enter_student_application_first_name_first_name(String string) {
		firstname = string;
		channelPartner.enter_Firdtname(string);
	}

	@Given("^User Enter Student Application invalid Last Name (.*)$")
	public void user_enter_student_application_invalid_last_name_lastname(String string) {
		channelPartner.enter_lastname(string);
	}

	@Given("^User Enter Student Application Last Name (.*)$")
	public void user_enter_student_application_last_name_lastname(String string) {
		lastName = string;
		channelPartner.enter_lastname(string);
	}

	@Given("^User Enter Student Application Non English Name (.*)$")
	public void user_enter_student_application_non_english_name_non_english_name(String string) {
		nonEnglishName = string;
		channelPartner.enter_non_English_Name(string);
	}

	@Given("^User Enter Student Application future DOB (.*)$")
	public void user_enter_student_application_invalid_dob_dob(String string) {
		channelPartner.enter_dob(string);
	}

	@Given("^User Enter Student Application DOB (.*)$")
	public void user_enter_student_application_dob_dob(String string) {
		channelPartner.enter_dob(string);
	}

	@Given("^User Enter Student Application Pre Destination (.*)$")
	public void user_enter_student_application_pre_destination_pre_destination(String string) {
		channelPartner.enter_pre_Destination(string);
	}

	@Given("^User Enter Student Application as invalid Pre Destination (.*)$")
	public void user_enter_student_application_pre_destination_as_invalid_pre_destination(String string) {
		channelPartner.enter_pre_Destination(string);
	}

	@Given("User Enter Student Application email")
	public void user_enter_student_application_email_email() {
		channelPartner.enter_email();
	}

	@Given("^User Enter Student Application invalid email (.*)$")
	public void user_enter_student_application_email_email(String string) {
		channelPartner.enter_email(string);
	}

	@Given("^User enter student information (.*)$")
	public void user_enter_student_information(String string) {
		channelPartner.enter_Student_Application(string);
	}

//getFutureDOB_ErrorMessage
	@Given("Verify the {string} error message should be displayed")
	public void verify_the_error_message_should_be_displayed(String string) {
		Assert.assertTrue(channelPartner.getrequiredfields_errorMsg_ErrorMessage().equals(string));
	}

	@Then("User Enter valid data in Attachments Name Field {string}")
	public void user_enter_valid_data_in_attachments_name_field(String string) {
		channelPartner.enter_AttcahmentName(string);
	}

	@Then("User upload the valid document")
	public void user_upload_the_valid_document() {
		channelPartner.uploadDocumnet();
	}

	@Given("Verify the {string} error message should be displayed for Future DOB")
	public void verify_the_error_message_should_be_displayed_for_future_DOB(String string) {
		Assert.assertTrue(channelPartner.getFutureDOB_ErrorMessage().equals(string));
	}

	@Given("Verify the {string} error message should be displayed for invalid preDestination")
	public void verify_the_error_message_should_be_displayed_for_invalid_preDestination(String string) {
		Assert.assertTrue(channelPartner.getrequiredfields_errorMsg_ErrorMessage().equals(string));
	}

	@Given("Verify the {string} error message should be displayed for invalid email")
	public void verify_the_error_message_should_be_displayed_for_invalid_email(String string) {
		Assert.assertTrue(channelPartner.getrequiredfields_errorMsg_ErrorMessage().equals(string));
	}

	@Given("user click on Save button")
	public void user_click_on_save_button() {
		channelPartner.click_On_Save_Student_Details();
	}

	@Then("Verify the {string} popup message should be displayed")
	public void verify_the_popup_message_should_be_displayed(String string) {
		String res = channelPartner.get_Success_popup_text_Eudcation_history_record();
		Assert.assertTrue(res.equals(string));
	}

	@Given("Enter NULL Value in the First Name field")
	public void enter_null_value_in_the_first_name_field() {
		channelPartner.enter_Firdtname_as_null();
	}

	@Given("Enter NULL Value in the Last Name field")
	public void enter_null_value_in_the_last_name_field() {
		channelPartner.enter_lastname_as_null();
	}

	@Given("Enter NULL Value in the DOB field")
	public void enter_null_value_in_the_DOB_field() {
		channelPartner.enter_DOB_as_null();
	}

	@Given("Enter NULL Value in the Email field")
	public void enter_null_value_in_the_Email_field() {
		channelPartner.enter_email_as_null();
	}

	@Given("Enter NULL Value in the Pre Destination field")
	public void enter_null_value_in_the_Pre_Destination_field() {
		channelPartner.enter_PreDestination_as_null();
	}

	@Given("Verify Save should be failed for invalid first name")
	public void verify_save_should_be_failed_for_invalid_firstname() {
		Assert.assertTrue(channelPartner.issaveShoulbeFails_firstname());
	}

	@Given("Verify Save should be failed for invalid last name")
	public void verify_save_should_be_failed_for_invalid_lastname() {
		Assert.assertTrue(channelPartner.issaveShoulbeFails_lastname());
	}

	@Then("Vefiry the Students Details gets saved successfully")
	public void vefiry_the_students_details_gets_saved_successfully() {
		channelPartner.click_On_CloseButton_On_Success_popup();
		channelPartner.getStudentID_and_WriteToProperty();
	}

	@Then("click on Next button CPP")
	public void click_on_next_button_cpp() {
		channelPartner.click_On_NextButton();
	}

	@Then("add the new Attachment File")
	public void add_the_new_attachment_file() {

		channelPartner.addNew_AttachmentFile();
	}

	@Then("Submit Student Application")
	public void submit_student_application() {
		channelPartner.click_On_SubmitButton();
	}

	@Then("verify the student Application submited successfully")
	public void verify_the_student_application_submited_successfully() {
		String txt = channelPartner.get_SuccessPopUpText();
		Assert.assertTrue(txt.contains("SUCCESS"));

		channelPartner.click_OK_Button_On_SuccessPopup();
	}

	@Then("Verify Success pop up should be displayed after submit the student application")
	public void verify_success_pop_up_should_be_displayed_after_submit_the_student_application() {
		String txt = channelPartner.getSuccesspopupTextafterSumbit();
		Assert.assertTrue(txt.contains(
				"Application Submitted Successfully.To Upload additional documents please goto 'Verification in Progress Application' in the Landing Dashboard."));

		channelPartner.click_OK_Button_On_SuccessPopup();
	}

	@Then("User Click on Verification In Progress tab")
	public void user_click_on_verification_in_progress_tab() {
		channelPartner.click_on_verificationInProgress_tab();
	}

	@Then("click on the Student Name in the Verification in Progress List view page")
	public void click_on_the_student_name_in_the_verification_in_progress_list_view_page() {
		channelPartner.click_on_StudentNameLinkInverificationInProgres();
	}

	@When("User Open the Student Created on Channel Partner portal")
	public void user_open_the_student_created_on_channel_partner_portal() {
		icp.search_for_IC(ConfigReader.getApplicationPropertie("CppStudentID"));
		icp.select_search_IC_Record();

	}

	@Then("Verify the Student created through CPP in C4C is same")
	public void verify_the_student_created_through_cpp_in_c4c_is_same() {
		String cppStudentID = ConfigReader.getApplicationPropertie("CppStudentID");

		Assert.assertTrue(cppStudentID.contains(icp.getStudentID()));
	}

	@Then("Verify the Automatic lead is created for the student created via the CPP")
	public void verify_the_automatic_lead_is_created_for_the_student_created_via_the_cpp() {
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String source = icLead.getSourcetext();
		String status = icLead.getStatusText();
		Assert.assertTrue(source.contains("Channel Partner Portal"));
		Assert.assertTrue(status.contains("Qualified"));
	}

	@Then("navigate to Qualification tab")
	public void navigate_to_qualification_tab() {
		qualification.navigateTo_QualificationTab();
	}

	@Then("Click on Edit button in Lead page")
	public void click_on_edit_button_in_lead_page() {
		qualification.click_On_Edit_Qualification();
	}

	@And("Use save the Qualification details for CPP Student")
	public void use_save_the_Qualification_details_for_CPP_Student() {

		lq.update_studyLevel_I_Prefer_Is("English Language");
		lq.update_study_plan_date("2024-02-11");
		lq.save_qualification();

	}

	@Then("user clicks on Edit button in IC overview page")
	public void user_clicks_on_edit_button_in_ic_overview_page() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ic.click_On_Edit_IC_Record();
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ic.more_button_On_IC_OverviewPage();
	}

	@Then("^user Enter the Nationality Field (.*)$")
	public void user_enter_the_nationality_field(String testCaseNo) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String Nationality = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData",
				"Nationality");
		ic.enter_IC_overview_Nationality(Nationality);
	}

	@Then("^user Enter the Primary Language Field (.*)$")
	public void user_enter_the_primary_language_field(String testCaseNo) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String PrimaryLanguage = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData",
				"PrimaryLanguage");
		ic.enter_IC_overview_PrimaryLanguage(PrimaryLanguage);
	}

	@Then("^user Enter the Gender Field (.*)$")
	public void user_enter_the_gender_field(String testCaseNo) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String Gender = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData", "Gender");
		ic.enter_IC_overview_Gender(Gender);
	}

	@Then("Save the IC Record")
	public void save_the_ic_record() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ic.IC_SaveButton();
	}

	@Then("user Enter the modile number for cpp student")
	public void user_enter_the_modile_number_for_cpp_student() {
		ic.enter_mobileNumber_for_CPP_CreatedStudent();
	}

	@Then("User verify the CPP converted lead in overview page")
	public void user_verify_the_CPP_converted_lead_in_overview_page() {

		// boolean flag=opportunity.isLeadConvertionTo_Opportunity();
		// Assert.assertTrue("LEAD IS NOT CONVERTED INTO OPPORTUNITY", flag);
		System.out.println("LEAD GOT CONVERTED");
		opportunity.click_On_MoreOverview();
		ConfigReader.writeToApplicationPropertie("CppConvertedID", opportunity.getOpportunityID());
		System.out.println("STUDENT ID:--" + ConfigReader.getApplicationPropertie("CppConvertedID"));
	}

	@Given("User Click on Applications In Process tab")
	public void user_click_on_applications_in_process_tab() {
		channelPartner.click_on_Applications_InProcess_tab();
	}

	@Then("User verify the converted opportunity ID in CPP")
	public void user_verify_the_converted_opportunity_id_in_cpp() {
		String id = ConfigReader.getApplicationPropertie("CppConvertedID");
		boolean flag = channelPartner.convertedOpportuntyID_In_CPP(id);
		Assert.assertTrue(flag);
	}

	@Then("User Enter Organization Name (.*)$")
	public void user_enter_organization_name_cpp(String testcaseNo) {
		channelPartner.enter_organizationName(testcaseNo);
	}

	@Then("User Enter Occupation Level (.*)$")
	public void user_enter_occupation_level_cpp(String testcaseNo) {
		channelPartner.enter_occupationLevel(testcaseNo);
	}

	@Then("User Enter Designation (.*)$")
	public void user_enter_designation_cpp(String testcaseNo) {
		channelPartner.enter_designation(testcaseNo);
	}

	@Then("User Enter Country (.*)$")
	public void user_enter_country_cpp(String testcaseNo) {
		channelPartner.enter_country(testcaseNo);
	}

	@Then("User Enter Start Date (.*)$")
	public void user_enter_start_date_cpp(String testcaseNo) {
		channelPartner.enter_startdate(testcaseNo);
	}

	@Then("User Enter End Date (.*)$")
	public void user_enter_end_date_cpp(String testcaseNo) {
		channelPartner.enter_endDate(testcaseNo);
	}

	@Then("User Enter Description (.*)$")
	public void user_enter_description_cpp(String testcaseNo) {
		channelPartner.enter_description(testcaseNo);
	}

	@Then("User Enter Employment Sector (.*)$")
	public void user_enter_employment_sector_cpp(String testcaseNo) {
		channelPartner.enter_employMentSection(testcaseNo);
	}

	@Then("User Enter Industry (.*)$")
	public void user_enter_industry_cpp(String testcaseNo) {
		channelPartner.enter_industry(testcaseNo);
	}

	@Then("User Enter Eng Speaking Workplace (.*)$")
	public void user_enter_eng_speaking_workplace_cpp(String testcaseNo) {
		channelPartner.enter_eng_speaking_wrkplance(testcaseNo);
	}

	@Then("User Enter Paid Work (.*)$")
	public void user_enter_paid_work_cpp(String testcaseNo) {
		channelPartner.enter_paidWrk(testcaseNo);
	}

	@Then("User Enter Address (.*)$")
	public void user_enter_address_cpp(String testcaseNo) {
		channelPartner.enter_address(testcaseNo);
	}

	@Then("User Enter Part Time (.*)$")
	public void user_enter_part_time_cpp(String testcaseNo) {
		channelPartner.enter_partTime(testcaseNo);
	}

	@Then("User Enter PartTimeHours (.*)$")
	public void user_enter_parttimehours(String testcaseNo) {
		channelPartner.enter_partTimeHours(testcaseNo);
	}

	@Then("User Enter NULL in Organization Name Field {string}")
	public void user_enter_null_in_organization_name_field(String str) {
		channelPartner.enter_Null_InorganizationName(str);
	}

	@Then("User Enter NULL in Occupation Level Field {string}")
	public void user_enter_entering_null_in_occupation_level_field(String str) {
		channelPartner.enter_NulloccupationLevel(str);
	}

	@Then("User Enter NULL in Country Field {string}")
	public void user_enter_entering_null_in_country_field(String str) {
		channelPartner.enter_Nullcountry(str);
	}

	@Then("User Enter NULL in Start Date Field {string}")
	public void user_enter_entering_null_in_start_date_field(String str) {
		channelPartner.enter_Nullstartdate(str);
	}

	@Then("User Enter NULL in End Date Field {string}")
	public void user_enter_entering_null_in_end_date_field(String str) {
		channelPartner.enter_NullendDate(str);
	}

	@Then("User Enter NULL in Description Field {string}")
	public void user_enter_entering_null_in_description_field(String str) {
		channelPartner.enter_Nulldescription(str);
	}

	@Then("User Enter NULL in Employment Sector Field {string}")
	public void user_enter_entering_null_in_employment_sector_field(String str) {
		channelPartner.enter_NullemployMentSection(str);
	}

	@Then("User Enter NULL in Industry Field {string}")
	public void user_enter_entering_null_in_industry_field(String str) {
		channelPartner.enter_Nullindustry(str);
	}

	@Then("User Enter NULL in Eng Speaking Workplace Field {string}")
	public void user_enter_entering_null_in_eng_speaking_workplace_field(String str) {
		channelPartner.enter_Nulleng_speaking_wrkplance(str);
	}

	@Then("User Enter NULL in Paid Work Field {string}")
	public void user_enter_entering_null_in_paid_work_field(String str) {
		channelPartner.enter_NullpaidWrk(str);
	}

	@Then("User Enter NULL in Address Field {string}")
	public void user_enter_entering_null_in_address_field(String str) {
		channelPartner.enter_Nulladdress(str);
	}

	@Then("User Enter NULL in Part Time Field {string}")
	public void user_enter_entering_null_in_part_time_field(String str) {
		channelPartner.enter_nullpartTime(str);
	}

	@Then("User Enter NULL in Partime Hours Field {string}")
	public void user_enter_entering_null_in_partime_hours_field(String str) {
		channelPartner.enter_NullpartTimeHours(str);
	}

	@Then("{string} Error message popup should be displayed")
	public void error_message_popup_should_be_displayed(String string) {
		Assert.assertTrue(channelPartner.get_specifyPartimehours_text().equals(string));
	}

	@Then("User Enter Invalid data in Organization Name Field {string}")
	public void user_enter_invalid_data_in_organization_name_field(String string) {
		channelPartner.enter_Null_InorganizationName(string);
	}

	@Then("User Enter Invalid data in Occupation Level Field {string}")
	public void user_enter_invalid_data_in_occupation_level_field(String string) {
		channelPartner.enter_NulloccupationLevel(string);
	}

	@Then("User Enter Invalid data in Country Field {string}")
	public void user_enter_invalid_data_in_country_field(String string) {
		channelPartner.enter_Nullcountry(string);
	}

	@Then("User Enter Invalid data in Start Date Field {string}")
	public void user_enter_invalid_data_in_start_date_field(String string) {
		channelPartner.enter_Nullstartdate(string);
	}

	@Then("User Enter Invalid data in End Date Field {string}")
	public void user_enter_invalid_data_in_end_date_field(String string) {
		channelPartner.enter_NullendDate(string);
	}

	@Then("User Enter Invalid data in Description Field {string}")
	public void user_enter_invalid_data_in_description_field(String string) {
		channelPartner.enter_Nulldescription(string);
	}

	@Then("User Enter Invalid data in Employment Sector Field {string}")
	public void user_enter_invalid_data_in_employment_sector_field(String string) {
		channelPartner.enter_NullemployMentSection(string);
	}

	@Then("User Enter Invalid data in Industry Field {string}")
	public void user_enter_invalid_data_in_industry_field(String string) {
		channelPartner.enter_Nullindustry(string);
	}

	@Then("User Enter Invalid data in Eng Speaking Workplace Field {string}")
	public void user_enter_invalid_data_in_eng_speaking_workplace_field(String string) {
		channelPartner.enter_Nulleng_speaking_wrkplance(string);
	}

	@Then("User Enter Invalid data in Paid Work Field {string}")
	public void user_enter_invalid_data_in_paid_work_field(String string) {
		channelPartner.enter_NullpaidWrk(string);
	}

	@Then("User Enter Invalid data in Address Field {string}")
	public void user_enter_invalid_data_in_address_field(String string) {
		channelPartner.enter_Nulladdress(string);
	}

	@Then("User Enter Invalid data in Part Time Field {string}")
	public void user_enter_invalid_data_in_part_time_field(String string) {
		channelPartner.enter_nullpartTime(string);
	}

	@Then("Enter Part Time Field {string}")
	public void enter_part_time_field(String string) {
		System.out.println(string);
		channelPartner.enter_nullpartTime(string);
	}

	@Then("Verify whether Part Time Hours field is enabled when Part Time is set as Yes")
	public void verify_whether_part_time_hours_field_is_enabled_when_part_time_is_set_as_yes() {
		boolean flag = channelPartner.ispartTimeHoursFiledEnabled();
		Assert.assertTrue(flag);
	}

//Dropdown fields employment History tab
	@Then("click on Employment Sector dropdown field")
	public void click_on_employment_sector_dropdown_field() {
		channelPartner.click_employMentDropDownBtn();
	}

	@Then("Check the Employment Sector field Dropdown variants are available")
	public void check_the_employment_sector_field_dropdown_variants_are_available() {
		List<String> str = Excel_Reader.getListOf_values("CPPemployHistoryDropdownvalues", "Employment Sector");
		System.out.println("From table:-" + str);
		Set<String> st = channelPartner.getPickListvaluesfrom_EmploymentHistoryPage("idEmpSector");
		System.out.println("From Page:-" + st);
		Assert.assertTrue(str.containsAll(st));
	}

	@Then("click on Eng Speaking Workplace dropdown field")
	public void click_on_eng_speaking_workplace_dropdown_field() {
		channelPartner.click_engSpeakingWrkplanceDropDownBtn();
	}

	@Then("Check the Eng Speaking Workplace field Dropdown variants are available")
	public void check_the_eng_speaking_workplace_field_dropdown_variants_are_available() {
		List<String> str = Excel_Reader.getListOf_values("CPPemployHistoryDropdownvalues", "Eng Speaking Workplace");
		System.out.println("From table:-" + str);
		Set<String> st = channelPartner.getPickListvaluesfrom_EmploymentHistoryPage("idEngSpeaking");
		System.out.println("From Page:-" + st);
		Assert.assertTrue(str.containsAll(st));
	}

	@Then("click on Paid Work dropdown field")
	public void click_on_paid_work_dropdown_field() {
		channelPartner.click_paidWrkDropDownBtn();
	}

	@Then("Check the Paid Work field Dropdown variants are available")
	public void check_the_paid_work_field_dropdown_variants_are_available() {
		List<String> str = Excel_Reader.getListOf_values("CPPemployHistoryDropdownvalues", "Paid Work");
		System.out.println("From table:-" + str);
		Set<String> st = channelPartner.getPickListvaluesfrom_EmploymentHistoryPage("idPaidWork");
		System.out.println("From Page:-" + st);
		Assert.assertTrue(str.containsAll(st));
	}

	@Then("click on Part Time dropdown field")
	public void click_on_part_time_dropdown_field() {
		channelPartner.click_partTimeDropDownBtn();
	}

	@Then("Check the Part Time field Dropdown variants are available")
	public void check_the_part_time_field_dropdown_variants_are_available() {
		List<String> str = Excel_Reader.getListOf_values("CPPemployHistoryDropdownvalues", "Part Time");
		System.out.println("From table:-" + str);
		Set<String> st = channelPartner.getPickListvaluesfrom_EmploymentHistoryPage("idParttime");
		System.out.println("From Page:-" + st);
		Assert.assertTrue(str.containsAll(st));
	}

	@Then("User clicks on create record Icon in Attachments Tab")
	public void user_clicks_on_create_record_icon_in_attachments_tab() {
		channelPartner.addNewRecord_In_addNewRecordBtn_attachments();
	}

	@Then("Verif the Add new record popup should be displayed")
	public void verif_the_add_new_record_popup_should_be_displayed() {
		String txt = channelPartner.getAttachmentPopupTxt_text();
		Assert.assertTrue(txt.equals("Add New Record"));
	}

	@Then("User Enter NULL in Attachments Name Field {string}")
	public void user_enter_null_in_attachments_name_field(String string) {
		channelPartner.enter_AttcahmentName(string);
	}

	@Then("User Enter NULL in Attachments File Location Field {string}")
	public void user_enter_null_in_attachments_file_location_field(String string) {
		//DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']")).sendKeys("");
	}

	@Then("Save the Attachment Record")
	public void save_the_attachment_record() {
		channelPartner.save_AttachmentNewRecord();
	}

	@Then("Student Overview should be displayed with Student ID")
	public void student_overview_should_be_displayed_with_student_id() {
		boolean flag = channelPartner.isStudentID_From_VerificationInProgressTabisVisble();
		Assert.assertTrue(flag);
	}

	@Then("Student Overview should be displayed with Name")
	public void student_overview_should_be_displayed_with_name() {
		boolean flag = channelPartner.isStudentID_From_VerificationInProgressTabisVisble();
		Assert.assertTrue(flag);
	}

	@Then("Student Overview should be displayed with Non English Name")
	public void student_overview_should_be_displayed_with_non_english_name() {
		boolean flag = channelPartner.isNonEnglishName_From_VerificationInProgressTabisVisible();
		Assert.assertTrue(flag);

	}

	@Then("Student Overview should be displayed with Created on")
	public void student_overview_should_be_displayed_with_created_on() {
		boolean flag = channelPartner.isCreatedIsVisible();
		Assert.assertTrue(flag);
	}

	@Then("Student Overview should be displayed with Status")
	public void student_overview_should_be_displayed_with_status() {
		String status = channelPartner.getStatus_From_VerificationInProgressTab();
		Assert.assertTrue(status.equals("Qualified"));
	}


}
