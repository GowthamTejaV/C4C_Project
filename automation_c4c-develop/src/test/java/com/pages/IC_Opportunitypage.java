package com.pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;
import com.qa.util.WaitsUtil;

import AppHooks.ApplicationHooks;

public class IC_Opportunitypage {

	/************************************************************************/
	private By getOpportutyID = By
			.xpath(".//*[@data-help-id='pyvkyAK9S4IcyKPmS_87LG']/following-sibling::div/child::span");
	private By aleart_Ok = By.xpath(".//*[text()='OK']");
	private static By searchOppBtn = By.xpath(".//*[@data-help-id='sMpEU5d3YaMoQY55y2wbR0-searchButton']");
	private By searchInputBox = By.xpath(".//*[@data-help-id='sMpEU5d3YaMoQY55y2wbR0-searchField']//input");
	private By selectOppFromSearchList = By.xpath(".//*[@data-sap-automation-id='leOHuYGSJKMYOvNwXpafuW']");
	/*** MANDATORY FIELDS ***********************/
	private By opportunityID = By.xpath(".//*[@data-help-id='DHylALO94qYzH0KNTi4Yy0']");

	/****** CourseEnquiry *******/

	/******** Search Button ************/
	private By oppSearchBtn = By.xpath(".//*[@data-sap-automation-id='sMpEU5d3YaMoQY55y2wbR0-searchButton']");
	private By searchinputtxt = By.xpath(".//input[@type='search']");

	/*************** Filter *******************/

	private By filterIcon = By.xpath(".//button[@data-help-id='sMpEU5d3YaMoQY55y2wbR0-variantManagement-trigger']");

	/*************************************************************************/

	private By finalise = By.xpath("(.//*[text()='Finalise'])[1]");
	private By opportunityTab = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'OPPORTUNITIES')]");
	private By selectOpportunityRecord = By.xpath(".//*[@data-sap-automation-id='DAYimwbbSKAxGWbpLdCnlW']");
	private By editBtn = By.xpath(
			".//*[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']//span[@role='presentation']");

	private By errorMessage_eaderBar = By.xpath(".//*[@data-help-id='messageBar-headerBar']");
	private By error_messageDetails = By.xpath(".//*[@data-help-id='messageBar-messageDetails']/div");

	/*** MANDATORY FIELDS ***********************/

	private By applicationStatus = By.xpath(".//*[@data-help-id='0Pr6R5XAkK2FxUIQp1ZzZG']//input");
	private By institutionPreference = By.xpath(".//*[@data-help-id='647963aac9714ef1a265952d4c5efad5']//input");
	private By submissionMethod = By.xpath(".//*[@data-help-id='52700af914f1cad726aaace3d9a682ca']//input");
	private By service_Level = By.xpath(".//*[@data-help-id='862d5614d8327b6b36401e6e62e426bc']//input");
	private By reason=By.xpath(".//div[@data-help-id='949a13c32fb32c6a5ab85acdee7eafa8']//input");
	private By offerReceivedDate = By.xpath("//*[text()='Offer Received Date']//following::input[1]");
	private By OpportunityStatus = By.xpath(".//*[@data-help-id='D2IybYuRC4QDqB2f6330rm']//input");
	private By Probability = By.xpath(".//*[@data-help-id='YyLIDgqGr4oFHUihGyn_r0']//input");

	private By save_EditDetails = By.xpath(".//*[text()='Save']");
	private By moreBtn = By.xpath(".//*[text()='More']/parent::span//bdi");

	private By OVERVIEW = By.xpath(".//*[@role='tablist']//div[text()='OVERVIEW']");
	private By STUDENT_ESSENTIALS = By.xpath(".//*[@role='tablist']//div[text()='STUDENT ESSENTIALS']");
	private By ACTIVITIES = By.xpath(".//*[@role='tablist']//div[text()='ACTIVITIES']");
	private By NOTES = By.xpath(".//*[@role='tablist']//div[text()='NOTES']");
	private By VISA_DETAILS = By.xpath(".//*[@role='tablist']//div[text()='VISA DETAILS']");
	private By Involved_Parties = By.xpath(".//*[@role='tablist']//div[text()='Involved Parties']");
	private By Approval = By.xpath(".//*[@role='tablist']//div[text()='Approval']");
	private By TICKETS = By.xpath(".//*[@role='tablist']//div[text()='TICKETS']");
	private By DOCUMENTS = By.xpath(".//*[@role='tablist']//div[text()='DOCUMENTS']");
	private By STUDENT_DETAILS = By.xpath(".//*[@role='tablist']//div[text()='STUDENT DETAILS']");
	private By WORKFLOW_CHANGES = By.xpath(".//*[@role='tablist']//div[text()='WORKFLOW CHANGES']");
	private By CHANGES = By.xpath(".//*[@role='tablist']//div[text()='CHANGES']");
	private By RELATIONSHIPS = By.xpath(".//*[@role='tablist']//div[text()='RELATIONSHIPS']");

	private By categoryFilter = By.xpath(".//*[@data-help-id='AJSE$hup5aoWiOST4ZEVMG']");
	private By enterCategoryTextFilter = By.xpath(".//*[@placeholder='Search' and @role='textbox']");

	/****** CourseEnquiry *******/

	private By COURSE_SELECTION = By.xpath(".//*[@role='tablist']//div[text()='COURSE SELECTION']");
	private By HELP = By.xpath(".//*[@role='tablist']//div[text()='HELP']");

	private By LeadConvertionVaidation = By.xpath(".//*[text()='Overview']");
	private static By btn_courseSelectionTab = By.xpath("//div[@role='tab']//div[text()='COURSE SELECTION']");
	private static By txt_Search = By.xpath("//div[@data-help-id='sMpEU5d3YaMoQY55y2wbR0-searchField']//input");
	private static By tbl_listTrain = By.xpath("//div[@data-help-id='FECeGdOtwao7pKroKA1Cg0']//tbody/tr[1]/td[8]");
	private static By btn_studentDetails=By.xpath("(//span[@data-help-id='s5rvsyHaF46T4IGa$DDkkm']//following::a)[1]");
	

	/******************************/

	/*****************************/

	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	/******************** iushiudhidhd ************************************/

	// Search for opportunity
	// Search for IC Record

	// filter the opportunity records
	public void filte_the_Oppoertunty_Records(String str) {

		try {
			ElementUtil.click(filterIcon);
			Thread.sleep(3400);
			By filterTxt = By.xpath(".//li[text()='" + str + "']");
			ElementUtil.click(filterTxt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// All Opportunities
		}

	}

	// navigate to the Opportunity tab
	public void navigateToOpportunityTab() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.scrollToElement(opportunityTab);
			ElementUtil.click(opportunityTab);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// Get Opportunity text Id

	public String getOpportunityID() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getAttribute(getOpportutyID, "title");
	}

	// Select to Opportunity record from list
	public void selectOpportunityRecord() {

		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();

			WebElement ele = DriverFactory.getDriver().findElement(By.xpath("(.//*[@data-sap-automation-id='DAYimwbbSKAxGWbpLdCnlW'])[1]"));
			WaitsUtil.explicit_Wait(ele);
			ele.click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());

		}
	}

	// filter based on the category on the opportunity page

	public void filter_Based_On_Category(String searchtxt) {

		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3300);
			ElementUtil.click(categoryFilter);
			Thread.sleep(3300);
			appUtil.typeWithEnt(enterCategoryTextFilter, searchtxt);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Get the Error message or Success message after saving or updating
	public HashSet<String> get_PAGE_MESSAGE() {
		HashSet<String> errorMessage = new HashSet<String>();
		ApplicationPageUtil.waitForLoadGetDisappiear();
		if (ElementUtil.isElementDisplayed(errorMessage_eaderBar)) {
			ElementUtil.click(errorMessage_eaderBar);
			List<WebElement> wbele = DriverFactory.getDriver().findElements(error_messageDetails);
			for (WebElement ele : wbele) {
				String str = ele.getText().trim();
				errorMessage.add(str);
			}
			ElementUtil.click(errorMessage_eaderBar);
		}
		return errorMessage;

	}

	// Overview page more view
	public void click_On_MoreOverview() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			if (ElementUtil.isElementDisplayed(moreBtn)) {
				ElementUtil.click(moreBtn);
			}
		} catch (Exception ex) {

		}

	}

	// click on edit button in overview page
	public void clic_Edit_Button_OverViewPage() {

		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2000);
			if (ElementUtil.isElementDisplayed(editBtn)) {
				ElementUtil.click(editBtn);
			}
			if(ElementUtil.isElementDisplayed(By.xpath(".//bdi[text()='Yes']"))) {
				ElementUtil.click(By.xpath(".//bdi[text()='Yes']"));
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// click on save button to save Edit Details
	public void click_Save_Button() {

		try {
			// ApplicationPageUtil.waitForLoadGetDisappiear();
			  Thread.sleep(4000);
			  ElementUtil.click(save_EditDetails);
		      Thread.sleep(3000);		  
			
		} catch (InterruptedException e) {
			
		}
	}

	// Enter the Application Status
	public IC_Opportunitypage enter_application_Status(String txt) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.type(applicationStatus, txt);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Offer Accepted by Student
		return this;
	}
	
	
	public void enterApplicationStatus(String status) {
		
		switch(status) {
		case "Application Submitted","Withdrawn":
			enter_application_Status(status);
			break;
		case "Institution Acknowledged","Acknowledged / Info Pending","Rejected by Institution","Offer Received":
			enter_application_Status("Application Submitted").enter_application_Status(status);
		    break;
		case "Offer Accepted by Student":
			enter_application_Status("Application Submitted").enter_application_Status("Offer Received").enter_application_Status(status);
			break;
		}	
	}
	

//use
	public void enter_ApplicationStatisAs_OfferAcceptedByStudent() throws InterruptedException, IOException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(applicationStatus);
		Thread.sleep(2000);
		appUtil.type_KeysEnter(applicationStatus, "Application Submitted");
		Thread.sleep(2000);
		try {
			ElementUtil.waitForElementClickable(applicationStatus);
			Thread.sleep(2000);
			appUtil.type_KeysEnter(applicationStatus, "Offer Received");
		} catch (StaleElementReferenceException st) {
			ElementUtil.Type(applicationStatus, "Offer Received");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ElementUtil.waitForElementClickable(applicationStatus);
			Thread.sleep(2000);
			appUtil.selectDDOption(applicationStatus, "Offer Accepted by Student");
		} catch (StaleElementReferenceException st) {

			ElementUtil.Type(applicationStatus, "Offer Accepted by Student");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void enter_ApplicationStatisAs_OfferReceived() throws InterruptedException, IOException {
		ElementUtil.Type(applicationStatus, "Application Submitted");
		ElementUtil.Type(applicationStatus, "Offer Received");

	}

	// Enter the institution_Preference
	public void enter_institution_Preference(String txt) throws InterruptedException, IOException {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		Thread.sleep(3700);
		ElementUtil.Type(institutionPreference, txt);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Enter the reason for Withdrawn
	public void enter_reason_Of_Withdrawn(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		
		try {
			Thread.sleep(3700);
			ElementUtil.Type(reason, txt);
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//reason
	// Enter the submission Method
	public void enter_submission_Method(String txt) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.scrollToElement(submissionMethod);
			Thread.sleep(3700);
			ElementUtil.type(submissionMethod, txt);
			DriverFactory.getDriver().findElement(submissionMethod).sendKeys(Keys.ENTER);

			// appUtil.typeWithEnt(submissionMethod, "Online");
		} catch (StaleElementReferenceException ex) {
			// appUtil.typeWithEnt(submissionMethod, "Online");
			ElementUtil.type(submissionMethod, txt);
			DriverFactory.getDriver().findElement(submissionMethod).sendKeys(Keys.ENTER);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	// Enter the service_Level
	public void enter_service_Level(String txt) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.scrollToElement(service_Level);
			Thread.sleep(3700);
			ElementUtil.type(service_Level, txt);
			DriverFactory.getDriver().findElement(service_Level).sendKeys(Keys.ENTER);

			// appUtil.typeWithEnt(submissionMethod, "Online");
		} catch (StaleElementReferenceException ex) {
			// appUtil.typeWithEnt(submissionMethod, "Online");
			ElementUtil.type(submissionMethod, txt);
			DriverFactory.getDriver().findElement(service_Level).sendKeys(Keys.ENTER);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	// Enter the offer Received Date
	public void enter_offerReceivedDate(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2000);
			if(ElementUtil.isElementDisplayed(offerReceivedDate)) {
				C4CDatePicker.enterTheDateWith_FieldLabelName("Offer Received Date", txt);
				//ElementUtil.type(offerReceivedDate, txt);	
			}
		} catch (Exception e) {
			
		}
		
	}

	// Enter the institution_Preference
	// use
	public void enter_institution_Preference1() throws InterruptedException, IOException {
		String InstitutePreference = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Opportunity",
				"InstitutePreference");

		appUtil.selectDDOption(institutionPreference, InstitutePreference);
		Thread.sleep(2000);
	}

	// Enter the submission Method
	// use
	public void enter_submission_Method1() throws InterruptedException, IOException {
		String SubmissionMethod = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Opportunity",
				"SubmissionMethod");

		click_On_MoreOverview();
		Thread.sleep(2000);
		ApplicationPageUtil.typeWithEnt(submissionMethod, SubmissionMethod);
		Thread.sleep(2000);
	}

	// Enter the service_Level
	// use
	public void enter_service_Level1() throws IOException {
		String ServiceLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Opportunity",
				"ServiceLevel");

		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForElementClickable(service_Level);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.typeWithEnt(service_Level, ServiceLevel);
	}

	// Enter the offer Received Date
	// use
	public void enter_offerReceivedDate1() throws InterruptedException {
		String OfferReceived = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Opportunity",
				"OfferReceived");
		Thread.sleep(2000);
		ElementUtil.scrollToElement(offerReceivedDate);
		ElementUtil.waitForElementClickable(offerReceivedDate);
		ApplicationPageUtil.typeWithEnt(offerReceivedDate, OfferReceived);
	}

	public void enter_offerReceivedDateTrain() throws InterruptedException, IOException {
		String OfferReceivedTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Opportunity",
				"OfferReceivedTrain");
		Thread.sleep(2000);
		ElementUtil.scrollToElement(offerReceivedDate);
		ElementUtil.waitForElementClickable(offerReceivedDate);
		ElementUtil.Type(offerReceivedDate, OfferReceivedTrain);
	}

	// Get OpportunityStatus value Text
	public String get_OpportunityStatusText() {
		return ElementUtil.getAttribute(OpportunityStatus, "value");
	}

	// Get applicationStatus value Text
	public String get_applicationStatusText() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getAttribute(applicationStatus, "value");
	}

	// Get Probability value Text
	public String get_ProbabilityText() {
		return ElementUtil.getAttribute(Probability, "value");
	}

	// Get opportunity ID text
	public String get_opportunityID() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ElementUtil.getTextValue(opportunityID);
	}

	// Lead Convert to Opportunity validation
	public boolean isLeadConvertionTo_Opportunity() {
		boolean flag = false;
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(5000);
			flag = ElementUtil.isElementDisplayed(LeadConvertionVaidation);
			return flag;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return flag;

		}

	}

	// Search for the Opportunity
	public void search_for_opportunity(String str) {

		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(4000);
			ElementUtil.click(searchOppBtn);
			ApplicationPageUtil.typeWithEnt(searchInputBox, str);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Select Search opportunity record
	public void select_SearchOpportunity() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		DriverFactory.getDriver().findElements(selectOppFromSearchList).get(0).click();

		ApplicationPageUtil.waitForLoadGetDisappiear();

		if (ElementUtil.isElementDisplayed(aleart_Ok)) {
			ElementUtil.click(aleart_Ok);
		}
	}
	/* Opportunity Tab navigations */

	// navigate to Opportunity Page as a Counsellor
	public void navigateTo_IC_page_As_Counsellor() {
		appUtil.clickTab_underCategory("Prospect", "Opportunities");
	}

	// navigate to the COURSE_SELECTION tab
	public boolean navigateToCOURSE_SELECTIONTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.scrollToElement(COURSE_SELECTION);
		ElementUtil.click(COURSE_SELECTION);
		return ElementUtil.isElementDisplayed(COURSE_SELECTION);

	}

	// navigate to the HELP tab
	public boolean navigateTo_HELP_Tab() {

		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.scrollToElement(HELP);
		ElementUtil.click(HELP);
		return ElementUtil.isElementDisplayed(HELP);

	}

	// Navigate to OVERVIEW tab
	public boolean navigate_OVERVIEW__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(OVERVIEW);
		ElementUtil.click(OVERVIEW);
		return ElementUtil.isElementDisplayed(OVERVIEW);
	}

	// Navigate to Student essentials tab
	public boolean navigate_STUDENT_ESSENTIALS_TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(STUDENT_ESSENTIALS);
		ElementUtil.click(STUDENT_ESSENTIALS);
		return ElementUtil.isElementDisplayed(STUDENT_ESSENTIALS);
	}

	// Navigate to ACTIVITIES tab
	public boolean navigate_ACTIVITIES__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(ACTIVITIES);
		ElementUtil.click(ACTIVITIES);
		return ElementUtil.isElementDisplayed(ACTIVITIES);

	}

	// Navigate to NOTES tab
	public boolean navigate_NOTES__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(NOTES);
		ElementUtil.click(NOTES);
		return ElementUtil.isElementDisplayed(NOTES);

	}

	// Navigate to VISA_DETAILS tab
	public boolean navigate_VISA_DETAILS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(VISA_DETAILS);
		ElementUtil.Click(VISA_DETAILS, "Visa details");
		return ElementUtil.isElementDisplayed(VISA_DETAILS);

	}

	// Navigate to Involved_Parties tab
	public boolean navigate_Involved_Parties__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(Involved_Parties);
		ElementUtil.click(Involved_Parties);
		return ElementUtil.isElementDisplayed(Involved_Parties);

	}

	// Navigate to Approval tab
	public boolean navigate_Approval__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(Approval);
		ElementUtil.click(Approval);
		return ElementUtil.isElementDisplayed(Approval);

	}

	// Navigate to TICKETS tab
	public boolean navigate_TICKETS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(TICKETS);
		ElementUtil.click(TICKETS);
		return ElementUtil.isElementDisplayed(TICKETS);
	}

	// Navigate to DOCUMENTS tab
	public boolean navigate_DOCUMENTS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(DOCUMENTS);
		ElementUtil.click(DOCUMENTS);
		return ElementUtil.isElementDisplayed(DOCUMENTS);

	}

	// Navigate to DOCUMENTS tab
	public boolean navigate_STUDENT_DETAILS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(STUDENT_DETAILS);
		ElementUtil.click(STUDENT_DETAILS);
		return ElementUtil.isElementDisplayed(STUDENT_DETAILS);

	}

	// Navigate to WORKFLOW_CHANGES tab
	public boolean navigate_WORKFLOW_CHANGES__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(WORKFLOW_CHANGES);
		ElementUtil.click(WORKFLOW_CHANGES);
		return ElementUtil.isElementDisplayed(WORKFLOW_CHANGES);
	}

	// Navigate to CHANGES tab
	public boolean navigate_CHANGES__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(CHANGES);
		ElementUtil.click(CHANGES);
		return ElementUtil.isElementDisplayed(CHANGES);
	}

	// Navigate to RELATIONSHIPS tab
	public boolean navigate_RELATIONSHIPS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.scrollToElement(RELATIONSHIPS);
		ElementUtil.click(RELATIONSHIPS);
		return ElementUtil.isElementDisplayed(RELATIONSHIPS);

	}

	// click on finalise

	public void clickOn_Finalise() {
		// ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.Click(finalise, "Finalize button");
	}

	/************** Gowtham Teja *****************************/
	// Enter the institution_Preference
	// use
	public void enter_institution_Preference() throws InterruptedException, IOException {
		String InstitutePreference = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Opportunity",
				"InstitutePreference");

		ElementUtil.Type(institutionPreference, InstitutePreference);
		Thread.sleep(2000);
	}

	// Enter the submission Method
	// use
	public void enter_submission_Method() throws InterruptedException, IOException {
		String SubmissionMethod = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Opportunity",
				"SubmissionMethod");

		click_On_MoreOverview();
		Thread.sleep(2000);
		ElementUtil.Type(submissionMethod, SubmissionMethod);
		Thread.sleep(2000);
	}

	public void enter_submission_Method_Email() throws InterruptedException, IOException {
		String SubmissionMethod2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Opportunity",
				"SubmissionMethod2");

		click_On_MoreOverview();
		Thread.sleep(2000);
		ElementUtil.Type(submissionMethod, SubmissionMethod2);
		Thread.sleep(2000);
	}

	// Enter the service_Level
	// use
	public void enter_service_Level() throws IOException, InterruptedException {
		String ServiceLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Opportunity",
				"ServiceLevel");

		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForElementClickable(service_Level);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.Type(service_Level, ServiceLevel);
	}

	// Enter the offer Received Date
	// use
	public void enter_offerReceivedDate() throws InterruptedException, IOException {
		String OfferReceived = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Opportunity",
				"OfferReceived");
		Thread.sleep(2000);
		ElementUtil.scrollToElement(offerReceivedDate);
		ElementUtil.waitForElementClickable(offerReceivedDate);
		ElementUtil.Type(offerReceivedDate, OfferReceived);
	}

	public static void searchForTheOpportunityID() throws InterruptedException, IOException {
		ElementUtil.Click(searchOppBtn, "Search button");
		Thread.sleep(1000);
		ElementUtil.Type(txt_Search, ConfigReader.getApplicationPropertie("OpportunityID"));
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(tbl_listTrain);
		Thread.sleep(2000);
	}
	public static void clickStudentDetails() throws InterruptedException 
	{
		ElementUtil.Click(btn_studentDetails, "Student details hyperlink");
		Thread.sleep(2000);
	}

}
