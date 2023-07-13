package stepdefinitions;

import java.io.IOException;
import java.util.Set;

import org.testng.Assert;

import com.pages.LeadCreationPage;
import com.pages.OP_StudentDetailsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OP_StudentDetailsSteps {
	LeadCreationPage lead = new LeadCreationPage();
	OP_StudentDetailsPage student = new OP_StudentDetailsPage();
	//use
	@And("Switch to student details page")
	public void Switch_to_student_details_page() throws InterruptedException {
		student.SwitchStudentDetailsTab();
	}
	//use
	@And("Enter all the required details in student details page")
	public void Enter_all_the_required_details_in_student_details_page()
			throws InterruptedException, IOException {
		student.personalDetails();
		student.permanentAddressDetails();
		student.corrresAddressDetails();
		student.passportDetails();
		student.financeDetails();
		student.disabilityDetails();
	}
	
	@Then("Verify the error message should be display as {string}")
	public void error_message_should_be_display_as(String string) {
		Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
		Assert.assertTrue(errSet.contains(string),"FAILED:- TO SAVE THE RECORD");
	}

}
