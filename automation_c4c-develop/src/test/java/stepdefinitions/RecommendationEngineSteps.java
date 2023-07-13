package stepdefinitions;

import java.io.IOException;
import java.sql.SQLException;

import com.pages.RecommendationEnginePage;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RecommendationEngineSteps {
	@And("Switch to recommendation engline tab")
	public void Switch_to_recommendation_engline_tab() throws InterruptedException {
		RecommendationEnginePage.switchtoCRE();
	}
	@And("Navigate to recommendation engline tab")
	public void navigate_to_recommendation_engline_tab() throws InterruptedException {
		RecommendationEnginePage.navigateToRecommendationEngineTab();
	}
	
	

	@And("Enter the study level in RE")
	public void Enter_the_study_level_in_RE() throws Exception {
		RecommendationEnginePage.switchToFrameToCRE();
		Thread.sleep(2000);
		RecommendationEnginePage.studyLevel();
	}

	@Then("Enter the intake date in RE")
	public void enter_the_intake_date_in_re() throws Exception {
		RecommendationEnginePage.inatakeDate();
	}

	@Then("Enter the subject keyword in RE")
	public void enter_the_subject_keywork_in_re() throws InterruptedException, IOException {
		RecommendationEnginePage.subjectKeyword();
	}

	@Then("Enter the destination in RE")
	public void enter_the_destination_in_re() throws Exception {
		RecommendationEnginePage.destination();
	}
	@Then("Shortlist the Enabled courses from RE")
	public void Shortlist_the_Enabled_courses_from_RE() throws Exception {
		String course=RecommendationEnginePage.shortListTheCourseIfEnabled();
		ConfigReader.writeToApplicationPropertie("icREShortListCourse", course);
		System.out.println("RE Course:-"+course);
		DriverFactory.getDriver().switchTo().defaultContent();
	}

	@Then("Click on search filters button in RE")
	public void click_on_search_filters_button_in_re() throws InterruptedException {
		RecommendationEnginePage.searchOIP();
	}

	@And("Enable offer in principles course toggle")
	public void Enable_offer_in_principles_course_toggle() throws Exception {
		RecommendationEnginePage.enableToggle();
	}

	@Then("Verify OIP course in RE")
	public void verify_oip_course_in_re() throws InterruptedException {
		RecommendationEnginePage.verifyOIP();
	}

	@And("Shortlist the courses")
	public void Shortlist_the_courses() throws InterruptedException {
		RecommendationEnginePage.shortlist();
	}

	@And("Unshortlist the courses")
	public void Unshortlist_the_courses() throws InterruptedException {
		RecommendationEnginePage.unShortlist();
	}

	@And("Verify the shortlisted course count")
	public void Verify_the_shortlisted_course_count() throws InterruptedException {
		RecommendationEnginePage.shortlistMaximum();
	}

	@And("Click reset button")
	public void Click_reset_button() throws InterruptedException {
		RecommendationEnginePage.reset();
	}

	@And("Check IDP suggested course displayed against shortlisted courses")
	public void Check_IDP_suggested_course_displayed_against_shortlisted_courses() throws InterruptedException {
		RecommendationEnginePage.IDPsuggest();
	}

	@And("Verify the shortlisted course detail with popup window")
	public void Verify_the_shortlisted_course_detail_with_popup_window() throws InterruptedException {
		RecommendationEnginePage.verifyDetails();
	}

	@And("Click get direction button from RE courses")
	public void Click_get_direction_button_from_RE_courses() throws InterruptedException {
		RecommendationEnginePage.selectOIPCourse();

	}

	@Then("Click on get decision button")
	public void click_on_get_decision_button() throws InterruptedException {
		RecommendationEnginePage.switchToFrameToCRE();
		Thread.sleep(2000);
		RecommendationEnginePage.verifyGetDecision();
	}

	@Then("Click on get decision button OIP")
	public void click_on_get_decision_button_OIP() throws InterruptedException {
		RecommendationEnginePage.switchToFrameToCRE();
		Thread.sleep(2000);
		RecommendationEnginePage.clickSameCourseOIP();
	}

	@Then("Open and submit feedback1")
	public void open_and_submit_feedback1()
			throws InterruptedException, IOException, ClassNotFoundException, SQLException {
		RecommendationEnginePage.sendFeedbackRE1();
	}

	@Then("Open and submit feedback2")
	public void open_and_submit_feedback2() throws InterruptedException, IOException {
		RecommendationEnginePage.sendFeedbackRE2();
	}


}
