package stepdefinitions_C;

import org.testng.Assert;

import com.idpWebsite.IDP_WebSite_SES;
import com.pages.IC_CreationPage;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SESenquirySteps {
	IDP_WebSite_SES ses=new IDP_WebSite_SES();
	IC_CreationPage ic = new IC_CreationPage();

	@Given("User clicks on Student Essential tab")
	public void user_clicks_on_student_essential_tab() {
		ses.click__ON_StudentEssential_Tab();
	}

	@Given("Submit the SES Course enquiry")
	public void submit_the_ses_course_enquiry() {
		ses.submit_for_ses_MoneyTransferCourse();
	}

	
	@Then("verify the Course enquiry submitted successfully")
	public void verify_the_course_enquiry_submitted_successfully() {
		System.out.println("Testing=="+ses.get_Ses_EmailID());
		String email1=ses.get_Ses_EmailID();
		String email = ConfigReader.getApplicationPropertie("IDP_STUDENT");
		
		Assert.assertTrue(email.equals(email1),"SES NOT SUBMITTED");
		
	}

}
