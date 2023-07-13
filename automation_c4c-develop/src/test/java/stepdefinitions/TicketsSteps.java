package stepdefinitions;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import com.pages.LoginPage;
import com.pages.OP_DocumentsPage;
import com.pages.TicketsPage;
import com.pages.sendEmail;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TicketsSteps {
	LoginPage login = new LoginPage();
	TicketsPage ticket = new TicketsPage();
	OP_DocumentsPage doc = new OP_DocumentsPage();

//use
	@When("User navigates to ticket Menu")
	public void user_navigates_to_ticket_menu() throws InterruptedException {
		LoginPage.navigateToPage("Service", "Tickets");
		Thread.sleep(1000);
	}
//use
	@And("Change the view selection to All Tickets")
	public void change_the_view_selection_to_all_tickets() throws Exception {
		ticket.viewSelection();
	}
//use
	@And("Click on the status header")
	public void click_on_the_status_header() throws InterruptedException {
		ticket.clickStatus();
	}
//use
	@And("search for open status records")
	public void search_for_open_status_records() {
		ticket.searchOpenStatus();
	}
//use
	@And("Click on the interation type")
	public void click_on_the_interation_type() throws InterruptedException {
		ticket.clickInteractionType();
	}
//use
	@And("Search for Email interation type")
	public void search_for_email_interation_type() {
		ticket.searchEmailInteraction();
	}
//use
	@And("Select the first record from the tickets table")
	public void select_the_first_record_from_the_tickets_table() {
		ticket.selectFirstRecord();
	}
//use
	@And("Verify the status if Open")
	public void verify_the_status_if_open() throws InterruptedException {
		ticket.verifyStatusOpen();
	}
//use
	@And("Click on the edit record button in tickets overview page")
	public void click_on_the_edit_record_button_in_tickets_overview_page() throws InterruptedException {
		ticket.clickEditTicket();
	}
//use
	@And("Select the assigned to from the assign dropdown")
	public void select_the_assigned_to_from_the_assign_dropdown() throws InterruptedException {
		ticket.selectAssignedTo();
	}
//use
	@And("Save the record")
	public void save_the_record() throws InterruptedException {
		ticket.clickSaveTicket();
	}
//use
	@And("Verify the status field auto update to in-progress")
	public void verify_the_status_field_auto_update_to_in_progress() throws InterruptedException {
		ticket.verifyStatusInProcess();
	}
//use
	@And("Navigate to Documents tab in tickets page")
	public void navigate_to_documents_tab_in_tickets_page() throws InterruptedException {
		ticket.switchToDocumentsTab();
	}
//use
	@And("upload the required document")
	public void upload_the_required_document() {
		doc.uploadFileFromTheLoaclIC();
	}
	@And("upload the required document email")
	public void upload_the_required_document_email() throws InterruptedException {
		doc.uploadFileFromTheLoaclEmail();
	}
//use
	@And("Navigate to interactions tab in tickets page")
	public void navigate_to_interactions_tab_in_tickets_page() throws InterruptedException {
		ticket.switchToInteractionsTab();
	}
//use
	@And("Click on the reply all button from email interation tab")
	public void click_on_the_reply_all_button_from_email_interation_tab() throws InterruptedException {
		ticket.clickReplyAll();
	}
//use
	@And("Click on the Send email button")
	public void click_on_the_send_email_button() throws InterruptedException {
		ticket.sendEmail();
	}
//use
	@And("Verify the email is sent")
	public void verify_the_email_is_sent() throws InterruptedException {
		ticket.verifyEmailSent();
	}
//use
	@And("Navigate to overview page in tickets menu")
	public void navigate_to_overview_page_in_tickets_menu() throws InterruptedException {
		ticket.switchToOverviewTab();
	}
//use
	@And("Verify the status is changed to completed")
	public void verify_the_status_is_changed_to_completed() {
		ticket.verifyStatusCompleted();
	}
//use
	@And("Click create new ticket icon")
	public void click_create_new_ticket_icon() throws InterruptedException {
		ticket.createTicket();
	}
//use
	@And("Fill the all required fields in new ticket creation page")
	public void fill_the_all_required_fields_in_new_ticket_creation_page() throws InterruptedException {
		ticket.mandatoryFieldsTickets();
	}
//use
	@And("Click save and open")
	public void click_save_and_open() {
		ticket.SaveAndOpen();
	}
//use
	@And("Click New button in interaction tab")
	public void click_new_button_in_interaction_tab() throws InterruptedException {
		ticket.newInteraction();
	}
//use
	@And("Click edit from address button")
	public void click_edit_from_address_button() throws InterruptedException {
		ticket.editChannel();
	}
//use
	@And("Select a relevent channel")
	public void select_a_relevent_channel() throws InterruptedException {
		ticket.selectChannel();
	}
//use
	@And("Enter the email content")
	public void enter_the_email_content() throws InterruptedException {
		ticket.emailContent();
	}
//use
	@Then("Send an email to the admin for creating new ticket")
	public void Send_an_email_to_the_admin_for_creating_new_ticket() throws NoSuchAlgorithmException {
		sendEmail.mail();
	}
//use
	@And("Save the sent email address")
	public void Save_the_sent_email_address() {
		sendEmail.saveEmail();
	}
//use
	@And("Click search the email record")
	public void Click_search_the_email_record() {

	}
	@Given("Launch the yopmail")
	public void launch_the_yopmail() throws InterruptedException {
		TicketsPage.launchEmailYopmail();
	}
	@When("User send new email to config email")
	public void user_send_new_email_to_config_email() throws InterruptedException, IOException {
		
		TicketsPage.composeEmailYopmail();
		TicketsPage.sendEmailYopmail();
	}
	@Then("Save the user email")
	public void save_the_user_email() throws InterruptedException, IOException {
		TicketsPage.saveEmailYopmail();
	}

}
