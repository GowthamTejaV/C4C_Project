package stepdefinitions;

import java.io.IOException;

import com.pages.IC_HistoryPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class IC_HistorySteps {
	@Then("Verify education history along with add button exist")
	public void verify_education_history_along_with_add_button_exist() {
		IC_HistoryPage.verifyEducationAddButton();
	}

	@Then("Verify employement history along with add button exist")
	public void verify_employement_history_along_with_add_button_exist() {
		IC_HistoryPage.verifyEmploymentAddButton();
	}

	@Then("Verify english proficiency along with add button exist")
	public void verify_english_proficiency_along_with_add_button_exist() {
		IC_HistoryPage.verifyEnglishAddButton();
	}

	@Then("Verify columns are displayed in the table under Education History")
	public void verify_columns_are_displayed_in_the_table_under_education_history() throws Exception {
		IC_HistoryPage.verifyCoulumsEducationHistory();
	}

	@Then("Click on add button and enter the education history details")
	public void click_on_add_button_and_enter_the_education_history_details() throws InterruptedException {
		IC_HistoryPage.clickAddEducationHistoryButton();
	}

	@Then("enter the status as completed")
	public void enter_the_status_as_completed() throws InterruptedException, IOException {
		IC_HistoryPage.AddEducationHistory("completed", "india");
	}

	@Then("enter the status as currently studying")
	public void enter_the_status_as_currently_studying() throws InterruptedException, IOException {
		IC_HistoryPage.AddEducationHistory("currently studying", "india");
	}

	@Then("enter the status as discontinued")
	public void enter_the_status_as_discontinued() throws InterruptedException, IOException {
		IC_HistoryPage.AddEducationHistory("discontinued", "Australia");
	}

	@And("Click save button")
	public void Click_save_button() throws InterruptedException {
		IC_HistoryPage.clickSaveButton();
	}

	@Then("Click on add button and enter the english proficiency details")
	public void click_on_add_button_and_enter_the_english_proficiency_details() throws InterruptedException {
		IC_HistoryPage.clickAddEnglishProficiencyButton();
	}

	@Then("Fill mandatory fields of english proficiency test")
	public void fill_mandatory_fields_of_english_proficiency_test() throws InterruptedException, IOException {
		IC_HistoryPage.fillMandatoryEnglishProficiency();
	}

	@Then("Verify the English proficiency picklist value field level validation")
	public void verify_the_english_proficiency_picklist_value_field_level_validation() throws Exception {
		IC_HistoryPage.verifyEnglishStatusPicklist();
	}

	@Then("Click on add button and enter the employment history details")
	public void click_on_add_button_and_enter_the_employment_history_details() throws InterruptedException {
		// IC_HistoryPage.clickAddEmploymentHistoryButton();
	}


	@Then("Fill mandatory fields in employment history details")
	public void fill_mandatory_fields_in_employment_history_details() throws InterruptedException, IOException {
		IC_HistoryPage.addEmploymentHistory();
	}
}
