package stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;

import com.pages.IC_SmsPage;

import io.cucumber.java.en.Then;

public class IC_SmsSteps {
	
	@Then("Switch to SMS tab")
	public void switch_to_sms_tab() throws InterruptedException {
		IC_SmsPage.switchToSmsTab();
	}
	@Then("Click on new button in sms page")
	public void click_on_new_button_in_sms_page() throws InterruptedException {
		IC_SmsPage.click_NewButton();
	}
	@Then("Type new text message")
	public void type_new_text_message() throws InterruptedException, IOException {
		IC_SmsPage.Type_NewMessage();
	}
	@Then("Type new text message multiple lines")
	public void type_new_text_message_multiple_lines() throws InterruptedException, IOException, AWTException {
		IC_SmsPage.Type_NewMessage_MultiLines();
	}
	@Then("Click on send button")
	public void click_on_send_button() throws InterruptedException {
		IC_SmsPage.click_SendButton();
	}
	@Then("Verify the message present in the sent list")
	public void verify_the_message_present_in_the_sent_list() throws InterruptedException {
		IC_SmsPage.verify_SentMessage();
	}


}
