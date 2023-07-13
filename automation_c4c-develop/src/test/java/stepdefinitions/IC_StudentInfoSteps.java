package stepdefinitions;

import java.io.IOException;

import com.pages.IC_StudentsInfoPage;

import io.cucumber.java.en.Then;

public class IC_StudentInfoSteps {
	@Then("Switch to students info tab")
	public void switch_to_students_info_tab() throws InterruptedException {
		IC_StudentsInfoPage.switchToStudentsInfo();
	}

	@Then("Click on add identification documents button")
	public void click_on_add_identification_documents_button() {
		IC_StudentsInfoPage.clickAddbuttonIdentificationDocuments();
	}

	@Then("Verify the functionality of Driving licence value in the identification documents section")
	public void verify_the_functionality_of_driving_licence_value_in_the_identification_documents_section()
			throws InterruptedException, IOException {
		IC_StudentsInfoPage.verifySexDisabled();
	}

	@Then("Verify the list of picklist values at Type field of identification documents section in Student info tab")
	public void verify_the_list_of_picklist_values_at_type_field_of_identification_documents_section_in_student_info_tab()
			throws Exception {
		IC_StudentsInfoPage.picklistTypeIdentificationDocuments();
	}

	@Then("Verify the list of picklist values at Type issuing country of identification documents section in Student info tab")
	public void verify_the_list_of_picklist_values_at_type_issuing_country_of_identification_documents_section_in_student_info_tab()
			throws Exception {
		IC_StudentsInfoPage.picklistTypeIssuingCountry();
	}

	@Then("Fill mandatory fields in identification documents")
	public void fill_mandatory_fields_in_identification_documents() throws InterruptedException, IOException {
		IC_StudentsInfoPage.fillMandatoryIdentificationDocuments();
	}

	@Then("Click on add social media accounts button")
	public void click_on_add_social_media_accounts_button() {
		IC_StudentsInfoPage.clickAddbuttonSocialmediaAccounts();
	}

	@Then("Verify the list of picklist values at Type field of Social media accounts section in Student info tab")
	public void verify_the_list_of_picklist_values_at_type_field_of_social_media_accounts_section_in_student_info_tab()
			throws Exception {
		IC_StudentsInfoPage.picklistTypeSocialMedia();
	}


	@Then("Fill mandatory fields in social media accounts")
	public void fill_mandatory_fields_in_social_media_accounts() throws InterruptedException, IOException {
		IC_StudentsInfoPage.fillMandatorySocialmediaAccounts();
	}

	@Then("Click delete button from social media accounts")
	public void click_delete_button_from_social_media_accounts() throws InterruptedException {
		IC_StudentsInfoPage.clickDeleteButtonSocialmediaAccounts();
	}


}
