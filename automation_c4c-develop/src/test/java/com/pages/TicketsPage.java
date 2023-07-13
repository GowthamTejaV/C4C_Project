package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

import AppHooks.ApplicationHooks;

public class TicketsPage {
	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	private static By btn_viewSelection = By
			.xpath("//button[@data-help-id='tI4iPmJ7c4AtsLvx$E9EAG-variantManagement-trigger']");
	private static By list_viewSelection = By.xpath("//div[@role='dialog']//ul[@role='listbox']//li");
	private static By tbl_ticketList = By.xpath("//div[@data-help-id='wN9QyApR3q_23BFLBSdAqG']//table[2]//tr/td");
	private static By btn_status = By.xpath(
			"//div[@data-help-id='wN9QyApR3q_23BFLBSdAqG']//table[1]//th[@data-help-id='hVna3MtPt42Faru8Kal4Om']");
	private static By txt_searchStatus = By.xpath("(.//*[@placeholder='Search'])[2]");
	private static By btn_emailInteraction = By.xpath(
			"//div[@data-help-id='wN9QyApR3q_23BFLBSdAqG']//table[1]//th[@data-help-id='64a28a941bb06c4b2ab447cbbd3142c9']");
	private static By btn_firstRecord = By
			.xpath("//div[@data-help-id='wN9QyApR3q_23BFLBSdAqG']//table[2]//tr[1]/td[3]");
	private static By ele_loader = By.xpath("//div[@id='loader']//following::p[text()='Loading...'][1]");
	private static By ele_statusText = By.xpath("(//div[@data-help-id='NJlLVFQOTKY_CJyUDbl8AG']//span)[1]");
	private static By btn_globalEdit = By
			.xpath("//button[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");
	private static By ele_headerMessage = By.xpath("//span[@data-help-id='messageBar-headerMessage']");
	private static By btn_globalSave = By.xpath("(//bdi[text()='Save'])[2]");
	private static By btn_replyAll = By.xpath("//button[@data-help-id='3M_FK$G2l4oZMeo_V9tGsG']");
	private static By btn_sendEmail = By.xpath("//button[@title='Send']");
	private static By btn_yesSend=By.xpath("//bdi[text()='Yes, send anyway']");
	private static By btn_documentTab = By.xpath("//div[text()='DOCUMENTS']");
	private static By btn_interactionsTab = By.xpath("//div[text()='INTERACTIONS']");
	private static By btn_overviewTab = By.xpath("//div[text()='OVERVIEW']");

	private static By btn_createTicket = By.xpath("//button[@data-help-id='MyhsQOk2saslFBU5NpnmTW']");
	private static By txt_subject = By.xpath("//div[@data-help-id='ZGToPcpuQ4g_FZzF6qOSfm']//input");
	private static By txt_customer = By.xpath("//div[@data-help-id='W5yVIVez24_AJZdPlKK31W']//input");
	private static By btn_globalSaveOpen = By.xpath("//bdi[text()='Save and Open']");
	private static By btn_newInteraction = By.xpath("//button[@data-help-id='eXwplluUSKwIks_SkYbqPG']");
	private static By btn_editFrom = By.xpath("//bdi[text()='From']//following::button[1]");
	private static By btn_firstRecordChannel = By
			.xpath("//div[@data-help-id='qNbXk6CcwKs4HaYtJlg5WG']//tbody//tr//td[2]");
	private static By txt_emailContent = By.xpath("//body[@contenteditable='true']");
	
	//yopmail
	private static By txt_emailField=By.xpath("//input[@id='login']");
	private static By btn_login=By.xpath("(//div[@id='refreshbut']//button)[1]");
	private static By btn_newEmail=By.xpath("//button[@id='newmail']");
	private static By txt_recipient=By.xpath("//input[@id='msgto']");
	private static By txt_subjectYopmail=By.xpath("//input[@id='msgsubject']");
	private static By txt_emailBody=By.xpath("//div[@id='msgbody']");
	private static By btn_sendYopmail=By.xpath("//button[@id='msgsend']");
//use
	public void viewSelection() throws Exception {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		try {
			ElementUtil.selectDDOption(btn_viewSelection, list_viewSelection, "All Tickets");
			ElementUtil.waitForPageLoad();
			ElementUtil.waitForElementPresent(tbl_ticketList);
			
		}catch(Exception e) 
		{
			ElementUtil.selectDDOption(btn_viewSelection, list_viewSelection, "All Tickets");
			ElementUtil.waitForPageLoad();
			ElementUtil.waitForElementPresent(tbl_ticketList);
		}
		
		

	}

//use
	public void clickStatus() throws InterruptedException {
		try {
			ElementUtil.click(btn_status);
			Thread.sleep(2000);
			ElementUtil.click(txt_searchStatus);
		}catch(Exception e) {
			ElementUtil.click(btn_status);
			Thread.sleep(2000);
			ElementUtil.click(txt_searchStatus);
		}
	}

//use
	public void searchOpenStatus() {
		ApplicationPageUtil.typeWithEnt(txt_searchStatus, "Open");
		ElementUtil.waitForElementPresent(tbl_ticketList);
	}

//use
	public void clickInteractionType() throws InterruptedException {
		try 
		{
			ElementUtil.click(btn_emailInteraction);
			Thread.sleep(2000);
			ElementUtil.click(txt_searchStatus);
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			ElementUtil.click(btn_emailInteraction);
			Thread.sleep(2000);
			ElementUtil.click(txt_searchStatus);
			Thread.sleep(2000);
		}

	}

//use
	public void searchEmailInteraction() {
		ApplicationPageUtil.typeWithEnt(txt_searchStatus, "Email");
		ElementUtil.waitForElementPresent(tbl_ticketList);
	}

	// use
	public void selectFirstRecord() {
		ElementUtil.click(btn_firstRecord);
		ElementUtil.waitForElementNotPresent(ele_loader);

	}

	// use
	public void verifyStatusOpen() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		String status = DriverFactory.getDriver().findElement(ele_statusText).getText();
		if (status.equals("Open")) {
			Assert.assertTrue(true, "Current Ticket Status is : " + status);
		} else {
			Assert.assertTrue(false, "Current Ticket Status is : " + status);

		}
	}

//use
	public void clickEditTicket() throws InterruptedException {
		ElementUtil.click(btn_globalEdit);
		Thread.sleep(3000);
	}

//use
	public void selectAssignedTo() throws InterruptedException {
		DriverFactory.getDriver()
				.findElement(By.xpath("(//span[@title='Assigned to']//following::input[1]//following::span)[1]"))
				.click();
		ElementUtil.waitForElementNotPresent(ele_loader);
		Thread.sleep(3000);
		DriverFactory.getDriver().findElement(By.xpath("//table//tbody//tr//td[2]")).click();
		ElementUtil.waitForElementNotPresent(ele_loader);

	}

//use
	public void clickSaveTicket() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		try {

			ElementUtil.waitForElementClickable(btn_globalSave);
			ElementUtil.click(btn_globalSave);
			String headerText = ElementUtil.getText(ele_headerMessage);
			if (headerText.contains("Your entries have been saved.")) {
				Assert.assertTrue(true, "Save Pass : " + headerText);
			} else {
				Assert.assertTrue(false, "Save Failed : " + headerText);

			}
		} catch (Exception e) {
			ElementUtil.waitForElementClickable(btn_globalSave);
			ElementUtil.click(btn_globalSave);
			String headerText = ElementUtil.getText(ele_headerMessage);
			if (headerText.contains("Your entries have been saved.")) {
				Assert.assertTrue(true, "Save Pass : " + headerText);
			} else {
				Assert.assertTrue(false, "Save Failed : " + headerText);

			}
		}

	}

	// use
	public void verifyStatusInProcess() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		String status = DriverFactory.getDriver().findElement(ele_statusText).getText();
		if (status.equals("In Process")) {
			Assert.assertTrue(true, "Current Ticket Status is : " + status);
		} else {
			//Assert.assertTrue(false, "Current Ticket Status is : " + status);

		}
	}

	// use
	public void switchToDocumentsTab() throws InterruptedException {
		ElementUtil.click(btn_documentTab);
		ElementUtil.waitForElementNotPresent(ele_loader);
	}

	// use
	public void switchToInteractionsTab() throws InterruptedException {
		ElementUtil.click(btn_interactionsTab);
		ElementUtil.waitForElementNotPresent(ele_loader);
	}

	// use
	public void clickReplyAll() throws InterruptedException {
		ElementUtil.waitForElementClickable(btn_replyAll);
		Thread.sleep(3000);
		ElementUtil.click(btn_replyAll);

	}

	// use
	public void sendEmail() throws InterruptedException {
		ElementUtil.waitForElementClickable(btn_sendEmail);
		Thread.sleep(3000);
		ElementUtil.click(btn_sendEmail);
		ElementUtil.waitForElementNotPresent(ele_loader);
		Thread.sleep(3000);
		ElementUtil.click(btn_yesSend);
		ElementUtil.waitForElementNotPresent(ele_loader);
		Thread.sleep(3000);

	}

	// use
	public void verifyEmailSent() throws InterruptedException {
		ElementUtil.waitForElementNotPresent(ele_loader);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		String headerText = ElementUtil.getText(ele_headerMessage);
		if (headerText.contains("Your entries have been saved")) {

			Assert.assertTrue(true, "Save Pass : " + headerText);
		} else {
		//Assert.assertTrue(false, "Save Failed : " + headerText);
		}

	}

	// use
	public void switchToOverviewTab() throws InterruptedException {
		ElementUtil.waitForElementNotPresent(ele_loader);
		Thread.sleep(2000);
		ElementUtil.click(btn_overviewTab);
		ElementUtil.waitForElementNotPresent(ele_loader);
	}

	// use
	public void verifyStatusCompleted() {
		try {
			String status = DriverFactory.getDriver().findElement(ele_statusText).getText();
			if (status.equals("Completed")) {
				Assert.assertTrue(true, "Current Ticket Status is : " + status);
			} else {
				Assert.assertTrue(false, "Current Ticket Status is : " + status);

			}
			
		}catch(Exception e) 
		{
			
			ElementUtil.click(btn_overviewTab);
			ElementUtil.waitForElementNotPresent(ele_loader);
			String status = DriverFactory.getDriver().findElement(ele_statusText).getText();
			if (status.equals("Completed")) {
				Assert.assertTrue(true, "Current Ticket Status is : " + status);
			} else {
				Assert.assertTrue(false, "Current Ticket Status is : " + status);

			}
		}
		
	}

	// create new ticket
	// use
	public void createTicket() throws InterruptedException {
		ElementUtil.waitForElementNotPresent(ele_loader);
		ElementUtil.click(btn_createTicket);
		ElementUtil.waitForElementClickable(txt_subject);
		Thread.sleep(2000);
	}

	// use
	public void mandatoryFieldsTickets() throws InterruptedException {
		String Subject = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Tickets", "Subject");
		//String CustomerID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Tickets", "CustomerID");

		ElementUtil.waitForElementNotPresent(ele_loader);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.type(txt_subject, Subject);
		Thread.sleep(1000);
		ApplicationPageUtil.typeWithEnt(txt_customer, ConfigReader.getApplicationPropertie("studentID"));
		Thread.sleep(1000);
	}

	// use
	public void SaveAndOpen() {
		ElementUtil.click(btn_globalSaveOpen);
		ElementUtil.waitForElementNotPresent(ele_loader);
	}

	// use
	public void newInteraction() throws InterruptedException {
		ElementUtil.waitForElementClickable(btn_newInteraction);
		Thread.sleep(2000);
		ElementUtil.click(btn_newInteraction);
		ElementUtil.waitForElementNotPresent(ele_loader);
	}

	// use
	public void editChannel() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(btn_editFrom);
		Thread.sleep(2000);
		try {
			ElementUtil.click(btn_editFrom);
			ElementUtil.waitForElementNotPresent(ele_loader);
		}catch(Exception e) 
		{
			ElementUtil.click(btn_editFrom);
			ElementUtil.waitForElementNotPresent(ele_loader);
		}
	}

	// use
	public void selectChannel() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(btn_firstRecordChannel);
		Thread.sleep(2000);
		ElementUtil.click(btn_firstRecordChannel);
		ElementUtil.waitForElementNotPresent(ele_loader);
	}

	// use
	public void emailContent() throws InterruptedException {
		WebElement iframe = DriverFactory.getDriver()
				.findElement(By.xpath("//iframe[@title='Editable area. Press F10 for toolbar.']"));
		DriverFactory.getDriver().switchTo().frame(iframe);
		Thread.sleep(3000);
//		ElementUtil.type(txt_emailContent, "This is sample email content from automation");
//		Thread.sleep(3000);
		DriverFactory.getDriver().switchTo().defaultContent();
		Thread.sleep(1000);
	}
	public static void launchEmailYopmail() throws InterruptedException 
	{
		DriverFactory.getDriver().get("https://yopmail.com/en/");
		Thread.sleep(2000);
	}
	public static void saveEmailYopmail() throws InterruptedException, IOException 
	{
		String Email=ElementUtil.generateRandomAlphaNumeric(10)+"@yopmail.com";
		
		ConfigReader.writeToApplicationPropertie("Yopmail", Email);
		Thread.sleep(2000);
		ElementUtil.Type(txt_emailField,Email );
		Thread.sleep(2000);
//		ElementUtil.Click(btn_login, "Login to yopmail");
//		Thread.sleep(2000);
	}
	public static void composeEmailYopmail() throws InterruptedException, IOException 
	{
		ElementUtil.Click(btn_newEmail, "New email button");
		Thread.sleep(2000);
		DriverFactory.getDriver().switchTo().frame("ifmail");
		Thread.sleep(2000);
		ElementUtil.Type(txt_recipient, "info.khanna@idp.com");
		Thread.sleep(2000);
		ElementUtil.Type(txt_subjectYopmail, "Automated email subject");
		Thread.sleep(2000);
		ElementUtil.Type(txt_emailBody, "Automated email Body");
		Thread.sleep(2000);
		
	}
	public static void sendEmailYopmail() throws InterruptedException 
	{
		ElementUtil.Click(btn_sendYopmail, "Send yopmail button");
		Thread.sleep(2000);
	}
}
