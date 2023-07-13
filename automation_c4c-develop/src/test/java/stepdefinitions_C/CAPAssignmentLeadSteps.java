package stepdefinitions_C;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.testng.Assert;
import com.pages.IC_CreationPage;
import com.pages.IC_LeadCreationpage;
import com.pages.LeadCreationPage;
import com.pages.Lead_CapApplicationDetailsPage;
import com.pages.Lead_CourseCreationPage;
import com.pages.TaskPage;
import com.qa.util.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CAPAssignmentLeadSteps {

	IC_CreationPage icp = new IC_CreationPage();
	LeadCreationPage lead = new LeadCreationPage();
	IC_LeadCreationpage IcLead = new IC_LeadCreationpage();
	Lead_CapApplicationDetailsPage capDetsils = new Lead_CapApplicationDetailsPage();
	Lead_CourseCreationPage lc = new Lead_CourseCreationPage();
	TaskPage task = new TaskPage();
	public static HashMap<String, List<String>> courses;

	@Then("^add the course for Cap Application Details (.*)$")
	public void add_the_course_for_cap_application_details(String string) {
		lc.navigateToCourseSelectionTab();
		lc.click_OnAddCourse_Button();
		lc.click_OnSearchIcon();
		lc.searchForCourse(string);
		lc.select_FirstCourseInList();
		lc.cancelAddCourseWindow();
	}

	@Then("Save the Lead Details")
	public void save_the_cap_application_details() {
		capDetsils.saveCourse_Button();

	}

	@When("Click on Add Rows in Cap Application Details")
	public void click_on_add_rows_in_cap_application_details() {
		capDetsils.addRows(3);
	}

	@Then("Click on Add Rows in Cap Application Details {string}")
	public void click_on_add_rows_in_cap_application_details(String string) {
		Integer x = Integer.valueOf(string);
		capDetsils.addRows(x);
	}

	@Then("Enter the text in the course column {string}")
	public void enter_the_text_in_the_course_column(String string) {
		capDetsils.enterTextInCourse(string);
	}

	@Then("Enter the text in the institution column {string}")
	public void enter_the_text_in_the_institution_column(String string) {
		capDetsils.enterTextInInstitution(string);
	}

	@When("Enter the institution preference {string}")
	public void enter_the_institution_preference(String string) {
		Integer x = Integer.valueOf(string);
		capDetsils.setCoursePriority(x);
	}

	@Then("Selected Courses in Cap Application Details where officer is already assigned to the lead")
	public void selected_courses_in_cap_application_details_where_officer_is_already_assigned_to_the_lead() {
		capDetsils.seletcCourseBasedOnTheRow(1, 4);
	}

	@Then("User add two courses with the same AVA id")
	public void user_add_two_courses_with_the_same_ava_id() {
		capDetsils.seletcTheSingleCourse(1);
		capDetsils.seletcTheSingleCourse(2);
		capDetsils.seletcTheSingleCourse(3);
		capDetsils.setCoursePriority(3);
	}

	@Then("Selected Courses in Cap Application Details")
	public void selected_courses_in_cap_application_details() {
		capDetsils.select_RandomCourses(3);
		capDetsils.setCoursePriority(3);

	}

	@When("navigate to Cap Application Details")
	public void navigate_to_cap_application_details() {
		IcLead.cap_Application_DetailsTab();
	}

//	
//	@Given("the user Login to C4C as a {string} {string}")
//	public void the_user_login_to_c4c_as_a(String string, String string2) {
//		// url=GlobalVariables.TRAIN_URL;
//		
//	    icp.login_toApplication(string, string2,"https://my334392.crm.ondemand.com/");
//	}
//	

	@Given("User search for the India Lead record {string}")
	public void user_search_for_the_india_lead_record(String string) {
		// lead.filter_Lead_By_filterDropDownLeadSection("All");
		lead.search_for_Lead(string);
	}

	@Then("Verify CAP Fields should be available in Lead Overview")
	public void verify_CAP_fields_should_be_available_in_lead_overview() {

		boolean officer = lead.check_CAP_OfficerField_AVAILABLITY();
		Assert.assertTrue(officer);
		boolean teamID = lead.check_CAP_TeamIDField_AVAILABLITY();
		Assert.assertTrue(teamID);

	}

	@Then("Click on Assign CAP Officer")
	public void click_on_assign_cap_officer() {
		lead.click_On_AssignCAP_Officer_Bnt();
	}

	@Then("Verify the {string} error message should be thrown")
	public void verify_the_error_message_should_be_thrown(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		System.out.println(errSet);
		Assert.assertTrue(errSet.contains(string));
	}
	@Then("Verify whether the default value of the Course Status column is {string}")
	public void verify_whether_the_default_value_of_the_course_status_column_is(String string) {
	  String str=capDetsils.getCourseStatus();
	  Assert.assertTrue(str.contains(string));
	}

	@Then("Verify the {string} and {string} error message should be thrown")
	public void verify_the_and_error_message_should_be_thrown(String string, String string2) {
		Set<String> errMsg = new HashSet<String>();
		errMsg.add(string);
		errMsg.add(string2);
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		System.out.println("Actual Error Message" + errSet);
		System.out.println("Expected Error Message" + errMsg);
		Assert.assertTrue(errSet.containsAll(errMsg));
	}

	@Then("Enter same institution preferences for all the courses")
	public void enter_same_institution_preferences_for_all_the_courses() {
		capDetsils.setFirtPreferencePriority(3);
	}

	@Then("Navigate to the Lead Overview Page")
	public void navigate_to_the_lead_overview_page() {
		IcLead.navigate_to_OverviewPage();

	}

	@Then("Select the CAP Team ID")
	public void select_the_cap_team_id() {
		lead.select_the_CAP_Team_ID();
	}

	@Then("navigate to Activities tab")
	public void navigate_to_activities_tab() {
		IcLead.navigateTo_ACTIVITIES_Tab();
	}

	@Then("Select the Task in Activities page")
	public void select_the_task_in_activities_page() {
		IcLead.open_the_Task();
	}

	@Then("Get all the Courses in Cap Application Details")
	public void get_all_the_courses_in_cap_application_details() {
		courses = capDetsils.get_All_CapApplication_Added_Courses();
		Assert.assertTrue((courses != null));

	}

	@Then("navigate to task CAP Application Details")
	public void navigate_to_task_cap_application_details() {
		task.navigateTo_CAP_Application_Details_Tab();
	}

	@Then("Verify course added in the lead in the newly created task")
	public void verify_course_added_in_the_lead_in_the_newly_created_task() {
		HashMap<String, List<String>> leadAddCourses = courses;
		HashMap<String, List<String>> coursevalidation = capDetsils.get_All_CapApplication_Added_Courses();

		System.out.println("Old Courses:-" + leadAddCourses);
		System.out.println("New Courses:-" + coursevalidation);

		for (String id : leadAddCourses.keySet()) {
			boolean flag = coursevalidation.containsKey(id);
			Assert.assertTrue(flag);
			if (flag) {
				List<String> crs = leadAddCourses.get(id);
				boolean flag2 = coursevalidation.get(id).containsAll(crs);
				Assert.assertTrue(flag2);
			}

		}
	}

	@Then("Verify whether the first added course is considered as the primary course")
	public void verify_whether_the_first_added_course_is_considered_as_the_primary_course() {
		HashMap<String, List<String>> leadAddCourses = courses;
		HashMap<String, List<String>> coursevalidation = capDetsils.get_All_CapApplication_Added_Courses();
		for (String str : leadAddCourses.keySet()) {

			System.out.println("primary" + leadAddCourses.get(str).get(2));
			System.out.println(coursevalidation.get(str).get(2));
			if (leadAddCourses.get(str).get(2).trim().toString().equals("1st Preference")
					&& coursevalidation.get(str).get(2).trim().toString().equals("1st Preference")) {
				Assert.assertTrue(leadAddCourses.get(str).get(0)
						.trim().toString().equals(coursevalidation.get(str).get(0).trim().toString()));
				break;
			}

		}

	}

	@Then("Verify the primary lead id is updated in the lead id column of the task")
	public void verify_the_primary_lead_id_is_updated_in_the_lead_id_column_of_the_task() {
		String leadID = ConfigReader.getApplicationPropertie("ConvertedLeadID");
		String taskLeadId = capDetsils.getLeadID_fromTaskTab();
		Assert.assertTrue(leadID.equals(taskLeadId));
	}

	@Then("Switch to lead in which CAP Officer is already assigned")
	public void switch_to_lead_in_which_cap_officer_is_already_assigned() {
		IcLead.switchToLeadTabFromTask();
	}

	@And("^Enter Qualification Level field as (.*)$")
	public void enter_qualification_level_field_as(String string) {
		lead.enter_the_Qualification(string);

	}

	@Then("Enter the Category as {string}")
	public void enter_the_category_as(String string) {
		lead.enter_category_Status(string);
	}

	@When("User save the Qualification details successsfully")
	public void use_save_the_Qualification_details_successsfully() {

		lead.enter_SourceText("Chat");
		lead.enter_study_level_i_prefer("English Language");
		lead.enter_Study_plan_dateText("2024-02-11");
		lead.save_and_Open();

	}

	/************************************ Gowtham ****************************/

	@Then("^add the course by searching through Course ID (.*)$")
	public void add_the_course_by_searching_through_Course_ID(String string) {
		lc.navigateToCourseSelectionTab();
		lc.click_OnAddCourse_Button();
		lc.click_OnSearchIcon();
		lc.searchForCourse(string);
		lc.select_FirstCourseInList();
		lc.cancelAddCourseWindow();
	}



	@Then("Verify CAP Assign officer button should be visible in Right corner")
	public void verify_cap_assign_officer_button_should_be_visible_in_right_corner() {
		boolean flag = lead.check_ADD_CAP_BUTTON_AVAILABLITY();
		Assert.assertTrue(flag);
	}

}
