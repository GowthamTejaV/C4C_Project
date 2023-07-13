package stepdefinitions;

import java.io.IOException;

import com.pages.Ic_OfferInPrinciplesPage;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Ic_OfferInPrinciplesStepes {
	Ic_OfferInPrinciplesPage oip = new Ic_OfferInPrinciplesPage();

//use
	@Then("Switch to offer in principles tab")
	public void switch_to_offer_in_principles_tab() throws InterruptedException {
		DriverFactory.getDriver().switchTo().defaultContent();
		oip.switchtoOIP();
	}
	@Then("Navigate to offer in principles tab")
	public void navigate_to_offer_in_principles_tab() throws InterruptedException {
		DriverFactory.getDriver().switchTo().defaultContent();
		oip.navigateToOfferInPrincipleTab();
	}
	
//use
	@Then("Click the edit button in OIP")
	public void click_the_edit_button_in_oip() throws InterruptedException {
		oip.switchTOFrame();
		oip.editOIP();
	}

//use
	@Then("Select the student qualification country")
	public void select_the_student_qualification_country() throws Exception {
		oip.selectOIPCountry();
	}

	@And("Edit academic admission test section")
	public void Edit_academic_admission_test_section() throws InterruptedException {
		Ic_OfferInPrinciplesPage.editAcademic();
	}

	@And("Fill all the details from academic admission test section from edit view")
	public void Fill_all_the_details_from_academic_admission_test_section_from_edit_view()
			throws InterruptedException, IOException {
		Ic_OfferInPrinciplesPage.EditAcademicDetails();
	}

//use

	@Then("Fill all the details from academic admission test section RE")
	public void fill_all_the_details_from_academic_admission_test_section_RE() throws Exception {
		oip.accademicAdmissionTest("RE");

	}

	@Then("Fill all the details from academic admission test section OIP")
	public void fill_all_the_details_from_academic_admission_test_section_OIP() throws Exception {
		oip.accademicAdmissionTestOIP();
	}

//use
	@Then("Fill all the details from english language admission test section OIP")
	public void fill_all_the_details_from_english_language_admission_test_section_OIP()
			throws InterruptedException, IOException {
		oip.englishLanguageTestOIP();
	}

//use
	@Then("Fill all the details from admission test admission test section OIP")
	public void fill_all_the_details_from_admission_test_admission_test_section_OIP()
			throws InterruptedException, IOException {
		oip.admissionTestOIP();
	}

	@Then("Fill all the details from english language admission test section RE")
	public void fill_all_the_details_from_english_language_admission_test_section_RE()
			throws InterruptedException, IOException {
		oip.englishLanguageTest("RE");
	}

//use
	@Then("Fill all the details from admission test admission test section RE")
	public void fill_all_the_details_from_admission_test_admission_test_section_RE()
			throws InterruptedException, IOException {
		oip.admissionTest("RE");
	}

//use
	@Then("Submit student qualification details")
	public void submit_student_qualification_details() throws InterruptedException {
		oip.submitStudent();
	}

//use
	@Then("Click get direction button from OIP course suggestion")
	public void click_get_direction_button_from_oip_course_suggestion() throws InterruptedException {
		oip.selectOIPcourse();
	}

//use
	@Then("Select start date for the course choosen")
	public void select_start_date_for_the_course_choosen() throws InterruptedException {
		oip.selectStartDate();
	}

//use
	@Then("accept all the terms and conditions")
	public void accept_all_the_terms_and_conditions() throws InterruptedException {
		oip.acceptTermsConditions("General");
	}

	@Then("accept all the terms and conditions RE")
	public void accept_all_the_terms_and_conditions_RE() throws InterruptedException {
		oip.acceptTermsConditions("RE");
	}

//use
	@Then("Submit OIP course")
	public void submit_oip_course() throws InterruptedException {
		oip.submitOIPCourse();
		oip.switchDefaultFrame();
	}
	
	@Then("Get the OIP Status")
	public void get_OIP_Status() throws InterruptedException {
		oip.switchTOFrame();
		String oipStatus=oip.getOIP_Status();
		ConfigReader.writeToApplicationPropertie("icOIPStatus", oipStatus);
		System.out.println("OIP Status:-"+oipStatus);
		DriverFactory.getDriver().switchTo().defaultContent();
	}
//use
	@And("Verify OIP lead is created")
	public void Verify_OIP_lead_is_created() throws InterruptedException {
		oip.verifyOIPlead();

	}

//use
	@And("Click on verify button from selected OIP course")
	public void Click_on_verify_button_from_selected_OIP_course() throws InterruptedException {
		oip.switchTOFrame();
		oip.clickVerifyOIP();
	}

//use
	@And("Final verificatin of OIP course")
	public void Final_verificatin_of_OIP_course() throws InterruptedException {
		oip.verificationFinal();
	}

	@And("Verifiy the updated detils")
	public void Verifiy_the_updated_detils() {
		Ic_OfferInPrinciplesPage.verifyAcademicDetails();
	}

}
