package stepdefinitions;

import java.io.IOException;

import com.pages.IC_ActivitiesPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class IC_ActivitiesSteps {

	@Then("Switch to Activities tab")
	public void switch_to_activities_tab() throws InterruptedException {
		IC_ActivitiesPage.switchToActivitiesTab();
	}

	@Then("Click new appointment button")
	public void click_new_appointment_button() throws InterruptedException {
		IC_ActivitiesPage.clickNewAppointment();
	}

	@Then("Fill mandatory fields in new appointment page")
	public void fill_mandatory_fields_in_new_appointment_page() throws InterruptedException, IOException {
		IC_ActivitiesPage.fillMandatoryFieldsAppointments();
	}

	@Then("Fill mandatory fields in new appointment page lead")
	public void fill_mandatory_fields_in_new_appointment_page_lead() throws InterruptedException, IOException {
		IC_ActivitiesPage.fillMandatoryFieldsAppointmentsLead();
	}

	@Then("Verify new appointment created sucessfully")
	public void verify_new_appointment_created_sucessfully() {
		IC_ActivitiesPage.verifyAppointmentCreatedSucessfully();
	}

	@Then("Verify new appointment created sucessfully leads")
	public void verify_new_appointment_created_sucessfully_leads() {
		IC_ActivitiesPage.verifyAppointmentCreatedSucessfullyLead();
	}

	@Then("Open an appointment from the list")
	public void open_an_appointment_from_the_list() throws InterruptedException {
		IC_ActivitiesPage.openExistingAppointment();
	}

	@Then("Open an appointment from the list leads")
	public void open_an_appointment_from_the_list_leads() throws InterruptedException {
		IC_ActivitiesPage.openExistingAppointmentLead();
	}

	@Then("Click on edit appointment button")
	public void click_on_edit_appointment_button() throws InterruptedException {
		IC_ActivitiesPage.EditAppointment();
	}

	@Then("Update date of appointment")
	public void update_date_of_appointment() throws InterruptedException, IOException {
		IC_ActivitiesPage.UpdateAppointment();
	}

	@Then("Verify the updated appointment")
	public void verify_the_updated_appointment() {
		IC_ActivitiesPage.verifyUpdatedAppointment();
	}

	@Then("Verify the updated appointment leads")
	public void verify_the_updated_appointment_leads() throws InterruptedException {
		IC_ActivitiesPage.jumpToLeadTab();
		IC_ActivitiesPage.verifyUpdatedAppointmentLead();
	}

	@And("Delete the appointment")
	public void Delete_the_appointment() throws InterruptedException {
		IC_ActivitiesPage.deleteAppointment();
	}

	@And("Delete the appointment leads")
	public void Delete_the_appointment_leads() throws InterruptedException {
		IC_ActivitiesPage.deleteAppointmentLeads();
	}

	@Then("Click new task button")
	public void click_new_task_button() throws InterruptedException {
		IC_ActivitiesPage.clickNewTask();
	}

	@Then("Fill mandatory fields in new task section")
	public void fill_mandatory_fields_in_new_task_section() throws InterruptedException, IOException {
		IC_ActivitiesPage.fillMandatoryFieldsTask();
	}

	@Then("Verify new task created sucessfully")
	public void verify_new_task_created_sucessfully() {
		IC_ActivitiesPage.verifyTaskCreatedSucessfully();
	}

	@Then("Verify new task created sucessfully leads")
	public void verify_new_task_created_sucessfully_leads() {
		IC_ActivitiesPage.verifyTaskCreatedSucessfullyLead();
	}

	@Then("Open an task from the list")
	public void open_an_task_from_the_list() throws InterruptedException {
		IC_ActivitiesPage.openExistingTask();
	}

	@Then("Open an task from the list leads")
	public void open_an_task_from_the_list_leads() throws InterruptedException {
		IC_ActivitiesPage.openExistingTaskLeads();
	}

	@Then("Click on edit task button")
	public void click_on_edit_task_button() throws InterruptedException {
		IC_ActivitiesPage.EditTask();
	}

	@Then("Update fields of task")
	public void update_fields_of_task() throws InterruptedException, IOException {
		IC_ActivitiesPage.UpdateTask();
	}

	@Then("Verify the updated task")
	public void verify_the_updated_task() {
		IC_ActivitiesPage.verifyUpdatedTask();
	}

	@Then("Switch to task tab")
	public void switch_to_task_tab() throws InterruptedException {
		IC_ActivitiesPage.switchTaskTab();
	}

	@Then("Delete the task")
	public void delete_the_task() throws InterruptedException {
		IC_ActivitiesPage.deleteTask();
	}

	@Then("Delete the task leads")
	public void delete_the_task_leads() throws InterruptedException {
		IC_ActivitiesPage.deleteTaskLead();
	}

	@Then("Click new phone call button")
	public void click_new_phone_call_button() throws InterruptedException {
		IC_ActivitiesPage.clickNewPhonecall();
	}

	@Then("Fill mandatory fields in new phone call section")
	public void fill_mandatory_fields_in_new_phone_call_section() throws InterruptedException, IOException {
		IC_ActivitiesPage.fillMandatoryFieldsPhonecall();
	}

	@Then("Verify new phone call created sucessfully")
	public void verify_new_phone_call_created_sucessfully() {
		IC_ActivitiesPage.verifyPhonecallCreatedSucessfully();
	}

	@Then("Verify new phone call created sucessfully leads")
	public void verify_new_phone_call_created_sucessfully_leads() {
		IC_ActivitiesPage.verifyPhonecallCreatedSucessfullyLead();
	}

	@Then("Open an phone call from the list")
	public void open_an_phone_call_from_the_list() throws InterruptedException {
		IC_ActivitiesPage.openExistingPhonecall();
	}

	@Then("Open an phone call from the list leads")
	public void open_an_phone_call_from_the_list_leads() throws InterruptedException {
		IC_ActivitiesPage.openExistingPhonecallLead();
	}

	@Then("Click on edit phone call button")
	public void click_on_edit_phone_call_button() throws InterruptedException {
		IC_ActivitiesPage.EditPhonecall();
	}

	@Then("Update fields of phone call")
	public void update_fields_of_phone_call() throws InterruptedException, IOException {
		IC_ActivitiesPage.UpdatePhonecall();
	}

	@Then("Verify the updated phone call")
	public void verify_the_updated_phone_call() {
		IC_ActivitiesPage.verifyUpdatedPhonecall();
	}

	@Then("get the lead id")
	public void get_the_lead_id() {
		IC_ActivitiesPage.getLeadId();
	}

	@Then("Search for a lead record")
	public void search_for_a_lead_record() throws InterruptedException {
		IC_ActivitiesPage.searchLeadRecord();
	}

	@And("Save the lead ID activity")
	public void Save_the_lead_ID_activity() {
		IC_ActivitiesPage.saveLeadId();
	}

}
