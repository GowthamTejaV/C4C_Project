package stepdefinitions_C;



import org.testng.Assert;

import com.pages.LeadCreationPage;
import com.qa.util.DriverFactory;

import io.cucumber.java.en.Then;

public class NotificationSteps {
	
	public static String leadID;
	LeadCreationPage lead=new LeadCreationPage();
	@Then("user clicks on Notification Icon")
	public void user_clicks_on_notification_icon() {
		leadID=lead.get_LeadID_From_OverViewpage();
		 lead.click_On_NotificationIcon();
	}
	@Then("New notification message should displayed for newly created Lead")
	public void new_notification_message_should_displayed_for_newly_created_lead() {
	  
	  String notificationMsg=lead.get_Notification_Text_For_NewlyCreatedLead();
	  String text="Lead "+leadID+" has been assigned to you";
	  System.out.println("Notification Msg:-"+notificationMsg);
	  System.out.println("text Msg:-"+text);
	  
	  Assert.assertTrue(notificationMsg.equalsIgnoreCase(text),"FAILED:-NO NOTIFICATION FOUND");
	}
}
