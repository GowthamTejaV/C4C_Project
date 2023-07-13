package idpWebsiteSteps;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

import com.idpWebsite.IDP_RegistrationPage;
import com.pages.C4CDatePicker;
import com.pages.IC_ActivitiesPage;
import com.pages.IC_CreationPage;
import com.pages.IC_LeadCreationpage;
import com.pages.IC_NotesPage;
import com.pages.Ic_OfferInPrinciplesPage;
import com.pages.RecommendationEnginePage;
import com.pages.Student360Page;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Student360Steps {
	private static Map<String, Map<String, String>> mp = new HashMap<String, Map<String, String>>();
	IC_CreationPage ic = new IC_CreationPage();
	Student360Page stu = new Student360Page();
	IDP_RegistrationPage idpReg = new IDP_RegistrationPage();
	IC_ActivitiesPage activity = new IC_ActivitiesPage();
	IC_LeadCreationpage icLead = new IC_LeadCreationpage();
	Ic_OfferInPrinciplesPage oip = new Ic_OfferInPrinciplesPage();
	private static String leadcount;
	private static int notesCount;
	private static String appointMnetcount;
	private static String studyLevelIPrefer;
	private static String studyPlanDate;
	private static String educHistCount;
	private static String empProfincyCount;

	@Then("Click on IC edit button")
	public void click_on_ic_edit_button() {
		ic.click_On_Edit_IC_Record();
	}

	@Given("Filter the IC Leads based on the qualification level (.*)$")
	public void filter_the_IC_leads_based_on_the_qualification_level_dc(String txt) {
		stu.filter_IC_Lead_Based_on_Qualification_level(txt);
	}

	@Then("Update the Date of Birth field (.*)$")
	public void update_the_date_of_birth_field(String txt) {
		String dob = txt;
		C4CDatePicker.enterTheDateWith_FieldLabelName("Date of Birth", dob);
		//ic.enter_IC_Overview_Date_of_Birth(dob);
	}

	@Then("Update the Nationality (.*)$")
	public void update_the_nationality(String txt) {

		String nationality = txt;
		if (mp.get("Nationality") == null) {
			mp.put("Nationality", new HashMap<String, String>());
		}
		ConfigReader.writeToApplicationPropertie("iCNationality", nationality);
		mp.get("Nationality").put("Nationality", nationality);
		ic.enter_IC_overview_Nationality(nationality);

	}

	@Then("Update the Gender (.*)$")
	public void update_the_Gender(String txt) {
		ic.enter_IC_overview_Gender(txt);
	}

	@Then("Update the Country of Residency (.*)$")
	public void update_the_country_of_residency(String txt) {

		String residency = txt;
		if (mp.get("Residency") == null) {
			mp.put("Residency", new HashMap<String, String>());
		}
		ConfigReader.writeToApplicationPropertie("iCcountryResidency", residency);
		mp.get("Residency").put("Residency", residency);
		ic.enter_IC_countryOfResidency(residency);
	}

	@Then("Update the Country Of Birth (.*)$")
	public void update_the_country_of_birth(String txt) {
		String countryOfBirt = txt;
		if (mp.get("Birth") == null) {
			mp.put("Birth", new HashMap<String, String>());
		}
		ConfigReader.writeToApplicationPropertie("iCcountryOfBirth", countryOfBirt);
		mp.get("Birth").put("Birth", countryOfBirt);
		ic.enter_IC_countryOfBirth(countryOfBirt);
	}

	@Then("Navigate to Student360 tab")
	public void navigate_to_student360_tab() {
		stu.navigateToStudent360Tab();
		System.out.println(mp);
	}

	@Then("Navigate to Notes tab")
	public void navigate_to_Notes_tab() {
		try {
			IC_NotesPage.switchToNotesTab();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Create the Notes")
	public void create_the_Notes() {
		try {
			IC_NotesPage.verifyNotes();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Get the Notes Count")
	public void get_the_Notes_count() {
		try {
			notesCount = stu.getNotesCount();
			String ntsCount = String.valueOf(notesCount);
			ConfigReader.writeToApplicationPropertie("icNotesCount", ntsCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//Create the Notes
	@Then("Verify the Course Favourites section")
	public void verify_Course_Favourites_section() {
		String expectResult = ConfigReader.getApplicationPropertie("icREShortListCourse");
		String actualResult = stu.getFavouritesREcourse();
		Assert.assertEquals(actualResult, expectResult, "No Courses Added on Favourites");
	}

	@Then("Verify the OIP Status in OFFER IN PRINCIPLE section")
	public void verify_OIP_Status_In_OIP_section() {
		String expectResult = ConfigReader.getApplicationPropertie("icOIPStatus");
		if (expectResult.equals("Issued")) {
			String count = stu.get_OIP_IssuedCount();
			Assert.assertEquals(count, "1");
		} else {
			String count = stu.get_OIP_NotIssuedCount();
			Assert.assertEquals(count, "1");
		}
	}

	@Then("Verify the stage should be changed to Applied")
	public void verify_the_stage_should_be_changed_to_applied() {
		boolean flag = stu.isAppliedStage();
		Assert.assertTrue(flag, "FAILED:- STAGE IS NOT CHANGED TO APPLIED");
	}

	@Then("The Personal Details section should displayed")
	public void the_personal_details_section_should_displayed() {
		boolean flag = stu.isPersonalDetailsHeadingVisible();
		Assert.assertTrue(flag);
	}

	@Then("Varidy all the Tab Sections are available in the Engage flow")
	public void varidy_all_the_tab_sections_are_available_in_the_engage_flow() {
		boolean IDPLiveTab = stu.isIDPLiveTabSectionHeadingVisible();
		Assert.assertTrue(IDPLiveTab);
		boolean courseLeadTab = stu.iscourseLeadTabSectionVisible();
		Assert.assertTrue(courseLeadTab);
		boolean interactionTab = stu.isinteractionTabSectionVisible();
		Assert.assertTrue(interactionTab);
		boolean preferenceTab = stu.ispreferenceTabSectionVisible();
		Assert.assertTrue(preferenceTab);
		boolean educationHistory = stu.iseducationHistoryVisible();
		Assert.assertTrue(educationHistory);
		boolean coursefavorits = stu.iscoursefavoritsTabSectionVisible();
		Assert.assertTrue(coursefavorits);
		boolean oIP = stu.isofferInPrincipleTabSectionVisible();
		Assert.assertTrue(oIP);
		boolean contactPoinTab = stu.iscontactPoinTabSectionVisible();
		Assert.assertTrue(contactPoinTab);
		boolean totalApplicationTab = stu.istotalApplicationTabSectionVisible();
		Assert.assertTrue(totalApplicationTab);
		boolean visaTab = stu.isvisaTabSectionVisible();
		Assert.assertTrue(visaTab);
		DriverFactory.getDriver().switchTo().defaultContent();
	}

	@Then("Verify the Nationality field got updated in Personal Details section")
	public void verify_the_nationality_field_got_updated_in_personal_details_section() {
		String actualValue = stu.getFieldvalue_ByFieldlabel("Nationality");
		String expectvalue = mp.get("Nationality").get("Nationality");
		Assert.assertEquals(actualValue, expectvalue);
	}

	@Then("Verify the Country of Residency field got updated in Personal Details section")
	public void verify_the_country_of_residency_field_got_updated_in_personal_details_section() {
		String actualValue = stu.getFieldvalue_ByFieldlabel("Country of residence");
		String expectvalue = mp.get("Residency").get("Residency");
		Assert.assertEquals(actualValue, expectvalue);
	}

	@Then("Verify the Country Of Birth field got updated in Personal Details section")
	public void verify_the_country_of_birth_field_got_updated_in_personal_details_section() {
		String actualValue = stu.getFieldvalue_ByFieldlabel("Country of birth");
		String expectvalue = mp.get("Birth").get("Birth");
		Assert.assertEquals(actualValue, expectvalue);
		// DriverFactory.getDriver().switchTo().defaultContent();
	}

	@Then("Verify the Notes count is same as created Notes Count in interaction Section")
	public void verify_the_notes_count_is_same_as_created_notes_count_in_interaction_section() {
		String actualValue = stu.getFieldvalue_ByFieldlabel("Notes");
		int actual = Integer.valueOf(actualValue);
		int expectvalue = notesCount;
		Assert.assertEquals(actual, expectvalue);

	}

	@Then("Verify the Appointments count is same as created Notes Count in interaction Section")
	public void verify_the_appointments_count_is_same_as_created_notes_count_in_interaction_section() {
		String actualValue = stu.getFieldvalue_ByFieldlabel("Appointments");
		String expectedValue = appointMnetcount;
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Then("Verify the Plan to study Date in PREFERENCE Section")
	public void verify_the_plan_to_study_date_in_preference_section() {
		String actualValue = stu.getFieldvalue_ByFieldlabel("Plan to study");
		String stdPlanDate = ConfigReader.getApplicationPropertie("iCStudyPlanDate");
		String expectDate = stu.getDateInPlanToStudySectionFormat(stdPlanDate);
		System.out.println("Expect Date:-" + expectDate + " Actual Date:-" + actualValue);
		Assert.assertEquals(actualValue, expectDate);

	}

	@Then("Verify the Study level in PREFERENCE Section")
	public void verify_the_study_level_in_preference_section() {
		String act[] = stu.getStudyLevelText().split(" ");
		String actualValue=act[act.length-1].trim();
		String iCStudyLevelIprefer = ConfigReader.getApplicationPropertie("iCStudyLevelIprefer");
		String expectedValue = iCStudyLevelIprefer;

		Assert.assertEquals(actualValue, expectedValue);
	}

	@Then("Get the Count of Leads")
	public void get_the_count_of_leads() {
		leadcount = idpReg.get_Lead_Count();
		ConfigReader.writeToApplicationPropertie("icLeadsCount", leadcount);
	}

	@Then("Verify the Total Active Leads count is same as IC Leads count")
	public void verify_the_total_active_leads_count_is_same_as_ic_leads_count() {
		String actualValue = stu.getFieldvalue_ByFieldlabel("Total Active Leads");
		String expectedCount = ConfigReader.getApplicationPropertie("icLeadsCount");
		Assert.assertEquals(Integer.valueOf(actualValue), Integer.valueOf(expectedCount));
	}

	@Then("Verify the HOT LEAD Text should be displayed on the course lead Section")
	public void verify_the_hot_lead_text_should_be_displayed_on_the_course_lead_section() {
		boolean flag = stu.isHotLeadTextDisplaying();
		Assert.assertTrue(flag);
		// DriverFactory.getDriver().switchTo().defaultContent();
	}

	@Then("Verify the Education records in EDUCATION HISTORY Section")
	public void verify_the_education_records_in_education_history_section() {
		String actualValue = stu.getFieldvalue_ByFieldlabel("Education records");
		String expected = "2";// educHistCount
		Assert.assertEquals(actualValue, expected);

	}

	@Then("Verify the English proficiency test records in EDUCATION HISTORY Section")
	public void verify_the_english_proficiency_test_records_in_education_history_section() {
		String actualValue = stu.getFieldvalue_ByFieldlabel("English proficiency test records");
		String expected = empProfincyCount;
		Assert.assertEquals(actualValue, expected);
	}

	@Then("Get the Appointment Count")
	public void get_the_appointment_count() {
		appointMnetcount = activity.getAppointMentCount();
		ConfigReader.writeToApplicationPropertie("icAppointmentCount", appointMnetcount);
		int appoiCount = Integer.valueOf(appointMnetcount);
		System.out.println("AppointmnetCount:-" + appoiCount);
	}

	@Then("Get the Qualification page Details")
	public void get_the_qualification_page_details() {
		studyLevelIPrefer = icLead.getstudyLevelIPrefer();
		studyPlanDate = icLead.getstudyPlanDate();
		System.out.println("StudyLevelIPrefer:-" + studyLevelIPrefer + " Study Plan Date:-" + studyPlanDate);
	}

	@Then("Get the Education History and Employment Proficiency Count")
	public void get_the_education_history_and_employment_proficiency_count() {
		educHistCount = stu.getEducationHistoryCount();
		empProfincyCount = stu.getEmploymentProficiencyCount();
		ConfigReader.writeToApplicationPropertie("icEducationHstCount", educHistCount);
		ConfigReader.writeToApplicationPropertie("icEmploymentProfCount", empProfincyCount);
		// int eduHisCount=Integer.valueOf(educHistCount);
		// int empProCount=Integer.valueOf(empProfincyCount);
	}

	@And("^Enter the study level in Recommendation EnginePage (.*)$")
	public void Enter_the_study_level_in_RE(String testCaseNo) {
		try {
			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
			RecommendationEnginePage.switchToFrameToCRE();
			Thread.sleep(2000);
			RecommendationEnginePage.studyLevel();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("Fill all the details from academic admission test section OIP (.*)$")
	public void fill_all_the_details_from_academic_admission_test_section_OIP(String testCaseNo) throws Exception {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		oip.accademicAdmissionTestOIP();
	}

}
