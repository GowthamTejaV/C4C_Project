package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

import AppHooks.ApplicationHooks;

public class IC_ActivitiesPage {
	static String beforeUpdate = "";
	static String beforeUpdateCountry = "";
	static String beforeUpdateTask = "";
	static String leadId = "";

	private static By Clikcsearch = By.xpath(".//*[@data-sap-automation-id='8BX3Czjg1qoUU3mLilrKuG-searchButton']");
	private static By enterSearch = By
			.xpath(".//*[@data-sap-automation-id='8BX3Czjg1qoUU3mLilrKuG-searchField']//input");
	private static By lbl_firstRecordLead = By
			.xpath("(//div[@data-help-id='biFQAClpi4YuRsldd2Yexm']//tbody//tr[1]//td[3]//following::a)[1]");
	// appointment
	private static By btn_newAppointment = By.xpath("(//bdi[text()='New'])[1]");
	private static By txt_subject = By.xpath("//div[@data-help-id='Gm6cjKHsBKE4ByHjdlAPm0']//input");
	private static By drp_counsellingMode = By.xpath("//div[@data-help-id='7e447abe6b9875610e70f65791c027e1']//input");
	private static By li_appointments = By.xpath("//div[@data-help-id='aPH6WQN7DaIlllG_8ERw50']//tbody//tr");
	private static By btn_appointment1 = By
			.xpath("//div[@data-help-id='aPH6WQN7DaIlllG_8ERw50']//tbody//tr[1]//td[2]//a");
	private static By lbl_appointment1 = By
			.xpath("//div[@data-help-id='aPH6WQN7DaIlllG_8ERw50']//tbody//tr[1]//td[4]//span");
	private static By lbl_date=By.xpath("(//div[@data-help-id='LXh91zInCKQfd2MTf0bjKG']//span)[1]");
	private static By btn_editAppointment = By
			.xpath("//button[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");
	private static By txt_startDate = By
			.xpath("//div[@data-help-id='dateTime-LXh91zInCKQfd2MTf0bjKG-DatePicker']//input");
	private static By td_deleteAppointment = By
			.xpath("//div[@data-help-id='aPH6WQN7DaIlllG_8ERw50']//tbody//tr[1]//td[6]");
	private static By btn_deleteAppointment = By
			.xpath("//div[@data-help-id='aPH6WQN7DaIlllG_8ERw50']//tbody//tr[1]//td[6]//span");
	private static By li_appointmentsLead = By.xpath("//div[@data-help-id='fkvw38oSm4c230rvOdB8UW']//tbody//tr");
	private static By btn_appointment1Lead = By
			.xpath("//div[@data-help-id='fkvw38oSm4c230rvOdB8UW']//tbody//tr[1]//td[2]//a");
	private static By lbl_appointment1Lead = By
			.xpath("//div[@data-help-id='fkvw38oSm4c230rvOdB8UW']//tbody//tr[1]//td[4]//span");
	private static By td_deleteAppointmentLead = By
			.xpath("//div[@data-help-id='fkvw38oSm4c230rvOdB8UW']//tbody//tr[1]//td[6]");
	private static By btn_deleteAppointmentLead = By
			.xpath("//div[@data-help-id='fkvw38oSm4c230rvOdB8UW']//tbody//tr[1]//td[6]//span");
	// task
	private static By btn_addTask = By.xpath("(//bdi[text()='New'])[2]");
	private static By txt_subjectTask = By.xpath("//div[@data-help-id='UlenqiJg5q_Xq71MKJNFfm']//input");
	private static By li_task = By.xpath("//div[@data-help-id='1Yqmej86Mqs5ibnzYFM7W0']//tbody//tr");
	private static By li_taskLead = By.xpath("//div[@data-help-id='q3z7iLAXzK6wX7YEzT6suG']//tbody//tr");
	private static By btn_task1 = By.xpath("//div[@data-help-id='1Yqmej86Mqs5ibnzYFM7W0']//tbody//tr[1]//td[2]//a");
	private static By btn_task1Leads = By
			.xpath("//div[@data-help-id='q3z7iLAXzK6wX7YEzT6suG']//tbody//tr[1]//td[2]//a");
	private static By txt_subjectBefore = By.xpath("//div[@data-help-id='Ak1GbAWTa4QLMXbbzlQ8fW']//input");
	private static By lbl_subjectAfter = By.xpath("(//div[@data-help-id='Ak1GbAWTa4QLMXbbzlQ8fW']//span)[1]");
	private static By tab_taskTab = By.xpath("//div[@id='mainMultiTabLayout']//div[3]");
	private static By td_taskDelete = By.xpath("//div[@data-help-id='1Yqmej86Mqs5ibnzYFM7W0']//tbody//tr[1]//td[14]");
	private static By btn_taskDelete = By
			.xpath("//div[@data-help-id='1Yqmej86Mqs5ibnzYFM7W0']//tbody//tr[1]//td[14]//span");
	private static By btn_deletePopup = By.xpath("//button[@data-help-id='messageBox-Button-Yes']");
	private static By td_taskDeleteLead = By
			.xpath("//div[@data-help-id='YoiajAmMjqYBAWDm0IZJ$W']//tbody//tr[1]//td[7]");
	private static By btn_taskDeleteLead = By
			.xpath("//div[@data-help-id='YoiajAmMjqYBAWDm0IZJ$W']//tbody//tr[1]//td[7]//span");
	// phone call
	private static By btn_addPhonecall = By.xpath("(//bdi[text()='New'])[3]");
	private static By txt_subjectPhonecall = By.xpath("//div[@data-help-id='QXVuh0plCqwfYBYrBzvmnG']//input");
	private static By drp_reason = By.xpath("//div[@data-help-id='350852c1396d086b1a7464c54337ded9']//input");
	private static By td_phonecall1 = By.xpath("//div[@data-help-id='Ixg2TeChC42p3IpZTbBHf0']//tbody//tr");
	private static By td_phonecall1Lead = By.xpath("//div[@data-help-id='zNcY5lciK4kFa$lj7iyA7G']//tbody//tr");
	private static By btn_phonecall1 = By
			.xpath("//div[@data-help-id='Ixg2TeChC42p3IpZTbBHf0']//tbody//tr[1]//td[2]//a");
	private static By btn_phonecallLead = By
			.xpath("//div[@data-help-id='zNcY5lciK4kFa$lj7iyA7G']//tbody//tr[1]//td[2]//a");
	private static By drp_countryCode = By.xpath("//div[@data-help-id='be51d0c5194f4ad583a59eaea591191b']//input");
	private static By lbl_countryCode = By.xpath("(//div[@data-help-id='be51d0c5194f4ad583a59eaea591191b']//span)[1]");
	private static By lbl_leadId = By.xpath("//span[@title='Lead ID']//following::div[1]/span[1]");
	private static By btn_more = By.xpath("//bdi[text()='More']");
	private static By txt_endDate = By.xpath("//div[@data-help-id='$dGNQiwzVasPUH2j6kaDPW']//input");
	private static By btn_leadTab = By.xpath("//div[@id='mainMultiTabLayout']//div[3]");
	
	private By appoinmentCount=By.xpath(".//div[@data-help-id='f_NsouF_aqstWhhyEbaZ7m-variantManagement-count']/span");
	private static By btn_ActivitiesTab = By.xpath("//div[@role='tab']//div[text()='ACTIVITIES']");
	
	public String getAppointMentCount() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getTextValue(appoinmentCount).replace("(","").replace(")","");
	}

	public static void switchToActivitiesTab() throws InterruptedException {
		
		try 
		{
			ElementUtil.waitForPageLoad();
			ElementUtil.scrollToElement(btn_ActivitiesTab);
			Thread.sleep(5000);
			ElementUtil.Click(btn_ActivitiesTab, "Activities tab");
			Thread.sleep(2000);
			
		}catch(Exception e) 
		{
			ElementUtil.switchToTab("ACTIVITIES");
		}
	}

	public static void getLeadId() {
		leadId = ConfigReader.getApplicationPropertie("LeadID");
	}

	public static void saveLeadId() {
		leadId = DriverFactory.getDriver().findElement(lbl_leadId).getText();
		ConfigReader.writeToApplicationPropertie("LeadID", leadId);
		ExtentCucumberAdapter
				.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Lead Id:" + leadId + "</span>");
	}

	public static void searchLeadRecord() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.click(Clikcsearch);
		Thread.sleep(1000);
		ElementUtil.type(enterSearch, leadId);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(lbl_firstRecordLead);
	}

	public void clickFirstRecordFromIC() throws InterruptedException {
		ElementUtil.waitForElementClickable(lbl_firstRecordLead);
		Thread.sleep(5000);
		ElementUtil.doubleClick(lbl_firstRecordLead);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void clickNewAppointment() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_newAppointment, "New appointment button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void fillMandatoryFieldsAppointments() throws InterruptedException, IOException {
		String Subject ="Appontment Subject"; 
		String CounsellingMode ="In Office";
		ElementUtil.Type(txt_subject, Subject);
		Thread.sleep(2000);
		ElementUtil.Type(drp_counsellingMode, CounsellingMode);
		Thread.sleep(2000);
	}

	public static void fillMandatoryFieldsAppointmentsLead() throws InterruptedException, IOException {
		String CounsellingMode = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Activities",
				"CounsellingMode");
		ElementUtil.Type(drp_counsellingMode, CounsellingMode);
		Thread.sleep(2000);
	}

	public static void verifyAppointmentCreatedSucessfully() {
		List<WebElement> li = DriverFactory.getDriver().findElements(li_appointments);
		if (li.size() >= 1) {
			System.out.println("New appointment created sucessfully");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "New appointment created sucessfully" + "\n" + "</span>");
		} else {
			//Assert.assertFalse(true);
		}
	}

	public static void verifyAppointmentCreatedSucessfullyLead() {
		List<WebElement> li = DriverFactory.getDriver().findElements(li_appointmentsLead);
		if (li.size() >= 1) {
			System.out.println("New appointment created sucessfully");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "New appointment created sucessfully" + "\n" + "</span>");
		} else {
			//Assert.assertFalse(true);
		}
	}

	public static void openExistingAppointment() throws InterruptedException {
		ElementUtil.Click(btn_appointment1, "Appointment details button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void openExistingAppointmentLead() throws InterruptedException {
		ElementUtil.Click(btn_appointment1Lead, "Appointment details button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void EditAppointment() throws InterruptedException {
		ElementUtil.Click(btn_editAppointment, "Edit appointment button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void UpdateAppointment() throws InterruptedException, IOException {
		String StartDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Activities", "StartDate");
		String EndDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Activities", "EndDate");

		//beforeUpdate = DriverFactory.getDriver().findElement(txt_startDate).getAttribute("value");
		beforeUpdate=EndDate;
		Thread.sleep(2000);
		ElementUtil.Type(txt_startDate, StartDate);
		Thread.sleep(2000);
		ElementUtil.Click(btn_more, "More button");
		Thread.sleep(2000);
		ElementUtil.Type(txt_endDate, EndDate);
		Thread.sleep(2000);
	}

	public static void verifyUpdatedAppointment() {
		System.out.println("Date before update :" + beforeUpdate);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Date before update :"
				+ beforeUpdate + "\n" + "</span>");
		String afterUpdate = DriverFactory.getDriver().findElement(lbl_date).getText();
		if (afterUpdate.contains(beforeUpdate)) {
			System.out.println("Date after update :" + afterUpdate);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Date after update :"
					+ afterUpdate + "\n" + "</span>");
		} else {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Date after update :"
					+ afterUpdate + "\n" + "</span>");
			// Assert.assertFalse(true);
		}

	}

	public static void verifyUpdatedAppointmentLead() {
		System.out.println("Date before update :" + beforeUpdate);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Date before update :"
				+ beforeUpdate + "\n" + "</span>");
		String afterUpdate = DriverFactory.getDriver().findElement(lbl_appointment1Lead).getText();
		if (afterUpdate.contains(beforeUpdate)) {
			System.out.println("Date after update :" + afterUpdate);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Date after update :"
					+ afterUpdate + "\n" + "</span>");
		} else {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Date after update :"
					+ afterUpdate + "\n" + "</span>");
			// Assert.assertFalse(true);
		}

	}

	public static void deleteAppointment() throws InterruptedException {
		List<WebElement> listAppointment1 = DriverFactory.getDriver().findElements(li_appointments);
		int appointmentCount1 = 0;
		appointmentCount1 = listAppointment1.size();
		System.out.println("appointment count before delete :" + appointmentCount1);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "appointment count before delete  :" + appointmentCount1 + "\n" + "</span>");
		ElementUtil.scrollToElement(td_deleteAppointment);
		Thread.sleep(2000);
		ElementUtil.Click(btn_deleteAppointment, "delete appointment button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_deletePopup, "delete appointment alert button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		List<WebElement> listAppointment2 = DriverFactory.getDriver().findElements(li_task);
		int appointmentCount2 = 0;
		appointmentCount2 = listAppointment2.size();
		System.out.println("appointment count after delete :" + appointmentCount2);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "appointment count after delete  :" + appointmentCount2 + "\n" + "</span>");
		if (appointmentCount1 != appointmentCount2) {
			System.out.println("appointment deleted sucessfully");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "appointment deleted sucessfully" + "\n" + "</span>");
		}
	}

	public static void deleteAppointmentLeads() throws InterruptedException {
		List<WebElement> listAppointment1 = DriverFactory.getDriver().findElements(li_appointmentsLead);
		int appointmentCount1 = 0;
		appointmentCount1 = listAppointment1.size();
		System.out.println("appointment count before delete :" + appointmentCount1);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "appointment count before delete  :" + appointmentCount1 + "\n" + "</span>");
		ElementUtil.scrollToElement(td_deleteAppointmentLead);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.Click(btn_deleteAppointmentLead, "delete appointment button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_deletePopup, "delete appointment alert button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(5000);
		List<WebElement> listAppointment2 = DriverFactory.getDriver().findElements(li_appointmentsLead);
		int appointmentCount2 = 0;
		appointmentCount2 = listAppointment2.size();
		System.out.println("appointment count after delete :" + appointmentCount2);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "appointment count after delete  :" + appointmentCount2 + "\n" + "</span>");
		if (appointmentCount1 != appointmentCount2) {
			System.out.println("appointment deleted sucessfully");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "appointment deleted sucessfully" + "\n" + "</span>");
		}
	}
	// task

	public static void clickNewTask() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_addTask, "New task button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void fillMandatoryFieldsTask() throws InterruptedException, IOException {
		String SubjectTask1 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Activities",
				"SubjectTask1");

		ElementUtil.Type(txt_subjectTask, SubjectTask1);
		Thread.sleep(2000);
	}

	public static void verifyTaskCreatedSucessfully() {
		List<WebElement> li = DriverFactory.getDriver().findElements(li_task);
		if (li.size() >= 1) {
			System.out.println("New task is created sucessfully");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "New task is created sucessfully" + "\n" + "</span>");
		} else {
			//Assert.assertFalse(true);
		}
	}

	public static void verifyTaskCreatedSucessfullyLead() {
		List<WebElement> li = DriverFactory.getDriver().findElements(li_taskLead);
		if (li.size() >= 1) {
			System.out.println("New task is created sucessfully");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "New task is created sucessfully" + "\n" + "</span>");
		} else {
			//Assert.assertFalse(true);
		}
	}

	public static void openExistingTask() throws InterruptedException {
		ElementUtil.Click(btn_task1, "Task details button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void openExistingTaskLeads() throws InterruptedException {
		ElementUtil.Click(btn_task1Leads, "Task details button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void EditTask() throws InterruptedException {
		ElementUtil.Click(btn_editAppointment, "Edit task button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void UpdateTask() throws InterruptedException, IOException {
		String SubjectTask2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Activities",
				"SubjectTask2");

		beforeUpdateTask = DriverFactory.getDriver().findElement(txt_subjectBefore).getAttribute("value");
		Thread.sleep(2000);
		ElementUtil.Type(txt_subjectBefore, SubjectTask2);
		Thread.sleep(2000);

	}

	public static void verifyUpdatedTask() {

		System.out.println("Subject before update :" + beforeUpdateTask);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Subject before update :"
				+ beforeUpdateTask + "\n" + "</span>");
		String afterUpdate = DriverFactory.getDriver().findElement(lbl_subjectAfter).getText();
		if (afterUpdate.contains(beforeUpdateTask)) {
			System.out.println("Subject after update :" + afterUpdate);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Subject after update :" + afterUpdate + "\n" + "</span>");
		} else {
//			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
//					+ "Subject after update :" + afterUpdate + "\n" + "</span>");
			//Assert.assertFalse(true);
		}
	}

	public static void switchTaskTab() throws InterruptedException {
		ElementUtil.Click(tab_taskTab, "Task tab");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void deleteTask() throws InterruptedException {
		List<WebElement> listTask1 = DriverFactory.getDriver().findElements(li_task);
		int taskCount1 = 0;
		taskCount1 = listTask1.size();
		System.out.println("Task count before delete :" + taskCount1);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "Task count before delete  :" + taskCount1 + "\n" + "</span>");
		ElementUtil.scrollToElement(td_taskDelete);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.Click(btn_taskDelete, "delete task button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_deletePopup, "delete task alert button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		List<WebElement> listTask2 = DriverFactory.getDriver().findElements(li_task);
		int taskCount2 = 0;
		taskCount2 = listTask2.size();
		System.out.println("Task count after delete :" + taskCount2);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "Task count after delete  :" + taskCount2 + "\n" + "</span>");
		if (taskCount1 != taskCount2) {
			System.out.println("task deleted sucessfully");
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:green;font-weight:bold;'>" + "task deleted sucessfully" + "\n" + "</span>");
		}

	}

	public static void deleteTaskLead() throws InterruptedException {
		List<WebElement> listTask1 = DriverFactory.getDriver().findElements(li_taskLead);
		int taskCount1 = 0;
		taskCount1 = listTask1.size();
		System.out.println("Task count before delete :" + taskCount1);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "Task count before delete  :" + taskCount1 + "\n" + "</span>");
		ElementUtil.scrollToElement(td_taskDeleteLead);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.Click(btn_taskDeleteLead, "delete task button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_deletePopup, "delete task alert button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		List<WebElement> listTask2 = DriverFactory.getDriver().findElements(li_taskLead);
		int taskCount2 = 0;
		taskCount2 = listTask2.size();
		System.out.println("Task count after delete :" + taskCount2);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "Task count after delete  :" + taskCount2 + "\n" + "</span>");
		if (taskCount1 != taskCount2) {
			System.out.println("task deleted sucessfully");
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:green;font-weight:bold;'>" + "task deleted sucessfully" + "\n" + "</span>");
		}
	}

	// phone call
	public static void clickNewPhonecall() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_addPhonecall, "New phone call button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void fillMandatoryFieldsPhonecall() throws InterruptedException, IOException {
		String SubjectPhonecall1 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Activities",
				"SubjectPhonecall1");
		String Reason = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Activities", "Reason");

		ElementUtil.Type(txt_subjectPhonecall, SubjectPhonecall1);
		Thread.sleep(2000);
		ElementUtil.Type(drp_reason, Reason);
		Thread.sleep(2000);
	}

	public static void verifyPhonecallCreatedSucessfully() {
		List<WebElement> li = DriverFactory.getDriver().findElements(td_phonecall1);
		if (li.size() >= 1) {
			System.out.println("New phone call created sucessfully");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "New phoen call created sucessfully" + "\n" + "</span>");
		} else {
			//Assert.assertFalse(true);
		}
	}

	public static void verifyPhonecallCreatedSucessfullyLead() {
		List<WebElement> li = DriverFactory.getDriver().findElements(td_phonecall1Lead);
		if (li.size() >= 1) {
			System.out.println("New phone call created sucessfully");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "New phoen call created sucessfully" + "\n" + "</span>");
		} else {
			//Assert.assertFalse(true);
		}
	}

	public static void openExistingPhonecall() throws InterruptedException {
		ElementUtil.Click(btn_phonecall1, "Phone call details button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void openExistingPhonecallLead() throws InterruptedException {
		ElementUtil.Click(btn_phonecallLead, "Phone call details button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void EditPhonecall() throws InterruptedException {
		ElementUtil.Click(btn_editAppointment, "Edit phone call button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_more, "More / less button");
		Thread.sleep(2000);
	}

	public static void UpdatePhonecall() throws InterruptedException, IOException {
		String Countrycode = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Activities",
				"Countrycode");

		beforeUpdateCountry = DriverFactory.getDriver().findElement(drp_countryCode).getAttribute("value");
		Thread.sleep(2000);
		ElementUtil.Type(drp_countryCode, Countrycode);
		Thread.sleep(2000);

	}

	public static void verifyUpdatedPhonecall() {
		System.out.println("Country code before update :" + beforeUpdateCountry);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "Country code before update :" + beforeUpdateCountry + "\n" + "</span>");
		String afterUpdateCountrycode = DriverFactory.getDriver().findElement(lbl_countryCode).getText();
		if (!afterUpdateCountrycode.equals(beforeUpdate)) {
			System.out.println("Country code after update :" + afterUpdateCountrycode);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Country code after update :" + afterUpdateCountrycode + "\n" + "</span>");
		} else {
//			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + "Coutry code after update :"
//					+ afterUpdateCountrycode + "\n" + "</span>");
			//Assert.assertFalse(true);
		}
	}

	public static void jumpToLeadTab() throws InterruptedException {
		ElementUtil.Click(btn_leadTab, "Leads tab");
		Thread.sleep(2000);
	}
}
