package stepdefinitions;

import java.io.IOException;

import com.pages.Lead_StudentEssesntialsPage;

import io.cucumber.java.en.Then;

public class Leads_StudentEssestialsSteps {
	@Then("Switch to student essestial tab")
	public void switch_to_student_essestial_tab() throws InterruptedException {
		Lead_StudentEssesntialsPage.switchToStudentEssesntial();
	}
	@Then("Switch to student essestials tab")
	public void switch_to_student_essestials_tab() throws InterruptedException {
		Lead_StudentEssesntialsPage.switchToStudentEssesntials();
	}
	@Then("Click on add product button")
	public void click_on_add_product_button() throws InterruptedException, IOException {
		Lead_StudentEssesntialsPage.addProductbutton();
	}
	@Then("Add a product into SES lead")
	public void add_a_product_into_ses_lead() throws InterruptedException, IOException {
		Lead_StudentEssesntialsPage.addProduct();
	}
	@Then("Enter the mandatory fields")
	public void enter_the_mandatory_fields() throws InterruptedException, IOException {
		Lead_StudentEssesntialsPage.enterMandatoryFields();
	}
	

}
