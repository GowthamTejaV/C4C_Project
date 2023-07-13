package stepdefinitions;

import java.io.IOException;

import com.pages.CourseSelectionPage;
import com.pages.IC_Opportunitypage;
import com.pages.LeadCreationPage;
import com.qa.util.DriverFactory;

import io.cucumber.java.en.And;

public class CourseSelectionSteps {
	CourseSelectionPage course = new CourseSelectionPage();
	LeadCreationPage lead = new LeadCreationPage();
	IC_Opportunitypage opportunity = new IC_Opportunitypage();

	// use
	@And("Switch to course selection tab")
	public void Switch_to_course_selection_tab() throws InterruptedException {
		course.switchToCourseSelectionTab();
	}

	// use
	@And("Click on add courses button")
	public void Click_on_add_courses_button() throws InterruptedException {
		course.clickAddCourseButton();

	}
	// use

	@And("Select a course from the table and close the window")
	public void Select_a_course_from_the_table_and_close_the_window() throws InterruptedException, IOException {
		course.addCourseNonIDP();

	}
	@And("Select a course from the table and close the window IDP direct")
	public void Select_a_course_from_the_table_and_close_the_window_IDP_direct() throws InterruptedException, IOException {
		CourseSelectionPage.courseIDPdirect();
		
	}
	@And("Select a course from the table and close the window IDP direct CPP")
	public void Select_a_course_from_the_table_and_close_the_window_IDP_direct_CPP() throws InterruptedException, IOException {
		CourseSelectionPage.courseIDPdirectChannelPartner();
		
	}
	@And("Select a course from the table and close the window nested type course NO")
	public void Select_a_course_from_the_table_and_close_the_window_nested_type_course_NO() throws InterruptedException, IOException {
		CourseSelectionPage.courseNestedType("NO");
		
	}
	@And("Select a course from the table and close the window nested type course YES")
	public void Select_a_course_from_the_table_and_close_the_window_nested_type_course_YES() throws InterruptedException, IOException {
		CourseSelectionPage.courseNestedType("YES");
		
	}
	@And("Select a course from the table and close the window standalone UK course")
	public void Select_a_course_from_the_table_and_close_the_window_standalone_UK_course() throws InterruptedException, IOException {
		CourseSelectionPage.standaloneCourseManual();
		
	}

	@And("Select a course from the table and close the window for UK destination")
	public void Select_a_course_from_the_table_and_close_the_window_for_UK_destination()
			throws InterruptedException, IOException {
		course.searchCourse_UKdestination();

	}

	// use
	@And("Update the added course")
	public void Update_the_added_course() throws InterruptedException, IOException {
		course.updateCourse();
	}

	// use
	@And("Click on the update course flag")
	public void Click_on_the_update_course_flag() throws InterruptedException {
		course.updateCourseFlag();
	}

	@And("Click edit course button")
	public void Click_edit_course_button() throws InterruptedException {
		course.ClickEditCourse();
	}

	// use
	@And("Click on the delete course button")
	public void Click_on_the_delete_course_button() throws InterruptedException {
		course.cancelCourse();
	}

	// use
	@And("Select the reason for cancel course")
	public void Select_the_reason_for_cancel_course() throws InterruptedException, IOException {
		course.reasonForCancel();
	}

	// use
	@And("Click on save button")
	public void Click_on_save_button() {
		opportunity.click_Save_Button();
	}

	@And("Select a NonIDP course from the table and close the window")
	public void Select_a_NonIDP_course_from_the_table_and_close_the_window() throws InterruptedException, IOException {
		course.addCourseNonIDP();

	}
	
	

}
