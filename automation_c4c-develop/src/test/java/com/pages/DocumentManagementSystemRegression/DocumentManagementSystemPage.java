package com.pages.DocumentManagementSystemRegression;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class DocumentManagementSystemPage {

	/*********************************************************/
	// Passport

	private By firstName = By.xpath(".//input[@placeholder='First Name ']");

	private By lastname = By.xpath(".//input[@placeholder='Last Name']");

	private By dateOfBirth = By.xpath(".//input[@formcontrolname='dateOfBirth']");

	private By nationality = By.xpath(".//mat-select[@formcontrolname='nationality']//span/span");

	private By number = By.xpath(".//input[@formcontrolname='number']");

	/*************************************************/
	// IELTS
	private By testReferenceNumber = By.xpath(".//input[@placeholder='Test Reference Number']");
	private By testDate = By.xpath(".//input[@placeholder='DD-MM-YYYY']");
	private By IELTSListeningScore = By
			.xpath(".//mat-select[@formcontrolname='IELTSListeningScore']/descendant::span/span");
	private By IELTSReadingScore = By.xpath(".//mat-select[@formcontrolname='IELTSReadingScore']//span/span");
	private By IELTSWritingScore = By.xpath(".//mat-select[@formcontrolname='IELTSWritingScore']//span/span");
	private By IELTSSpeakingScore = By.xpath(".//mat-select[@formcontrolname='IELTSSpeakingScore']//span/span");
	private By TotalScore = By.xpath(".//input[@formcontrolname='TotalScore']");

	/**************************************************/
	private By available_to_attach_Section=By.xpath(".//span[@data-help-id='D9C1LWK_cK_p_s6Qvl6scW-variantManagement-title']//bdi[text()='AVAILABLE TO ATTACH']");
	private By navigateTODocumentTab = By
			.xpath(".//div[@data-help-id=\"j1QuCToZNK6RuFGhGMCOvG\"]//div[text()='DOCUMENTS']");
	private By opportunityRecord = By.xpath("(.//*[@data-help-id=\"DAYimwbbSKAxGWbpLdCnlW\"])[1]");
	private By switchToOpportunity = By.xpath(
			".//div[@data-help-id='NAVIGATIONITEMID_a8552f7066084a4abc853d7bba28e589']/div[text()='OPPORTUNITIES']");
	private By reviewSignOfffirst_DocNameChkBox = By.xpath("(.//input[contains(@id,'mat-checkbox')])[1]/parent::span");
	private By reviewSignOf_deleteIcon = By.xpath(".//span[text()=' delete ']");
	private By reviewSignOf_download = By.xpath(".//button[text()='Download']");

	// **************************************************
	private By decisionField = By.xpath(".//span[text()='Pending Decision']");
	private By veridyOption = By.xpath(".//span[text()='Verified']");
	private By confirm_send = By.xpath(".//button[text()='Confirm & send ']");
	private By verifyDocSuccessfullyreviewed=By.xpath(".//p[text()='Document successfully reviewed']");
	private By nextButton = By.xpath(".//button[text()='Next']");
	private By docReviewdSuccessfully = By.xpath(".//p[text()='Document successfully reviewed']");
	private By closeSuccessPopup = By.xpath(".//button[text()='Close']");

	// *******************************************************************
	private By review_SignOff = By.xpath(".//li[text()='Review / Sign off']");
	private By HISTORICAL_DOCUMENT = By.xpath(
			".//div[@data-help-id='NAVIGATIONITEMID_edfdec697cf14fc092de3440820c216d']/div[text()='HISTORICAL DOCUMENT']");

	// By.xpath(".//div[@data-help-id='NAVIGATIONITEMID_edfdec697cf14fc092de3440820c216d']/div[text()='OFFER
	// IN PRINCIPLE']");
   private By verifi_documentIN_DOC_TAB=By.xpath("(.//span[@data-help-id='$lJ5lDChjK2NHylffdJQrG'])[1]");
	private By verified_document = By.xpath("(.//a[@data-help-id='string_61'])[1]");

	private By fileUpload = By.xpath(".//span[text()='file_upload ']");

	private By clickOnUploadDoc = By.xpath(".//span[text()='Extracting info ']/parent::strong");

	// ***************************************************
	private By groupDocs_btn=By.xpath("(.//span[text()=' file_upload ']/following-sibling::span)[1]");
	private By btn_secondFileUpload = By.xpath("(.//input[@id='file'])[2]");
	private By btn_upload = By.xpath("//div[text()='browse ']");
	private By fm_fileUpload = By.xpath(".//*[@name='__page3-iframe']");
	private By chk_selectAll = By.xpath(".//span[text()='Select all']");
	private By chk_uploadedFile = By.xpath("//mat-checkbox/parent::mat-panel-title");
	private By drp_selectCategory = By.xpath("//span[text()='Select category']");

	private By drp_docType = By.xpath("//span[text()='Select document type']");
	private By btn_uploadSubmit = By.xpath("//div[@class='upldbtn_sbmit']//button[text()='Confirm & upload']");
	private By txt_loader = By.xpath("//div[@class='tbwrp']//following::div[1]//p[text()='Loading...']");
	private By btn_close = By.xpath("//button[text()='Close']");

	private By aero_down = By.xpath("//button[@title='slim-arrow-down']");
	private By lbl_DocTab = By.xpath("//ul[@role='listbox']//li/span[contains(text(),'DOCUMENTS')]//parent::li");
	private By lbl_DocManageTab = By
			.xpath("//ul[@role='listbox']//li/span[contains(text(),'DOCUMENT MANAGEMENT')]//parent::li");
//************************************************************************
	private By status = By.xpath("((.//div//mat-checkbox)[1]/following-sibling::div)[2]/strong/span");
//**********************************************************************************
	private By academic = By.xpath(".//mat-option//span[contains(text(),'Academic')]");

//*********************************************************************************

	private By calender_icon = By.xpath("(.//mat-datepicker-toggle[@data-mat-calendar])[2]");
	private By yearMothDateBtn = By.xpath(".//button[@aria-label='Choose month and year']");
	private By selectYear = By.xpath(".//button//div[contains(text(),'2024')]");
	private By selectMoth = By.xpath(".//button//div[contains(text(),' FEB ')]");
	private By date = By.xpath(".//button//div[contains(text(),' 10 ')]");

	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	// Date picker field
	public void datePicker(String year, String month, String date) {
		try {
			ElementUtil.scrollToElement(calender_icon);
			ElementUtil.waitForElementClickable(calender_icon);
			ElementUtil.click(calender_icon);
			ElementUtil.click(yearMothDateBtn);
			ElementUtil.click(By.xpath(".//button//div[contains(text(),'" + year + "')]"));
			ElementUtil.click(By.xpath(".//button//div[contains(text(),'" + month + "')]"));
			ElementUtil.click(By.xpath(".//button//div[contains(text(),'" + date + "')]"));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	// Review Button
	public void userClickOnReviewSignOff() {
		try {
			ElementUtil.waitForElementClickable(review_SignOff);
			ElementUtil.click(review_SignOff);
			Thread.sleep(7500);
			ElementUtil.waitForElementPresent(clickOnUploadDoc);
			Thread.sleep(7000);
			if (ElementUtil.isElementDisplayed(clickOnUploadDoc)) {
				WebElement ele = DriverFactory.getDriver().findElement(clickOnUploadDoc);
				Thread.sleep(5500);
				Actions act = new Actions(DriverFactory.getDriver());
				Thread.sleep(6500);
				act.moveToElement(ele).click().build().perform();
				Thread.sleep(3000);
				System.out.println("Clicken on doc");
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
	
	//get success message of reviewed document
	public String get_SuccessMessageOfReviewedDocument() {
		ElementUtil.waitForElementPresent(verifyDocSuccessfullyreviewed);
		return ElementUtil.getTextValue(verifyDocSuccessfullyreviewed);
	}

	// get verified document text
	public String get_VerifiedDocumentText() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		String txt = ElementUtil.getTextValue(verified_document);

		return txt;
	}
	
	// get verified document text in Document tab
		public String get_VerifiedDocumentText_In_DocumentTAB() {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			String txt = ElementUtil.getAttribute(verifi_documentIN_DOC_TAB,"title");

			return txt;
		}

	// Navigate to history Document tab
	public void switch_To_HISTORICAL_DOCUMENT() {
		try {
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			// ElementUtil.scrollToTopOfPage();
			DriverFactory.getDriver().switchTo().defaultContent();
			ElementUtil.scrollToElement(HISTORICAL_DOCUMENT);
			ElementUtil.click(HISTORICAL_DOCUMENT);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void switchDocumentsTab() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.click(aero_down);
		ElementUtil.scrollToElement(lbl_DocTab);
		ElementUtil.click(lbl_DocTab);
		Thread.sleep(2000);
	}

	// use
	public void switchDocumentsManageTab() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.click(aero_down);
		ElementUtil.scrollToElement(lbl_DocManageTab);
		ElementUtil.click(lbl_DocManageTab);
		Thread.sleep(2000);
	}

	public WebElement getEle() {
		WebElement ele = DriverFactory.getDriver().findElement(fm_fileUpload);
		return ele;
	}
	// use

	public void switch_to_Doc_frames() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			DriverFactory.getDriver().switchTo().frame(0);

		} catch (NoSuchFrameException e) {
			DriverFactory.getDriver().switchTo().frame("__page2-iframe");

		}catch(Exception ee) {
			DriverFactory.getDriver().switchTo().frame("__page3-iframe");
		}

		DriverFactory.getDriver().switchTo().frame("dms-frame");

	}

	// upload the document
	public void upload_Document(String filename) {
		// Studentschooldoc
		// StudentResume
		// IELTSTEST
		// AcademicTranscripts
		// Passport
 
		try {
            String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\Data\\Documentmanagement\\"+ filename+ ".pdf";
			//StringSelection s = new StringSelection(System.getProperty("user.dir")+"\\src\\test\\resources\\Data\\Documentmanagement\\"+ filename+ ".pdf");
			DriverFactory.getDriver().findElement(By.xpath("//input[@id='file']")).sendKeys(filePath);
             //+ ".pdf"
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//			Thread.sleep(5000);
//			try { 
//				if (ElementUtil.isElementDisplayed(btn_upload)) {
//					ElementUtil.click(btn_upload);
//				}
//				if (ElementUtil.isElementDisplayed(fileUpload)) {
//					ElementUtil.click(fileUpload);
//				}
//
//				if (ElementUtil.isElementDisplayed(btn_secondFileUpload)) {
//					ElementUtil.click(btn_secondFileUpload);
//				}
//			} catch (Exception ex) {
//
//			}
//			Thread.sleep(5000);
//
//			Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//			r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyPress(KeyEvent.VK_V);
//			Thread.sleep(2000);
//			r.keyRelease(KeyEvent.VK_CONTROL);
//			r.keyRelease(KeyEvent.VK_V);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//
			ElementUtil.waitForElementClickable(chk_selectAll);
			ElementUtil.click(chk_selectAll);
			Thread.sleep(2000);
			ElementUtil.waitForElementClickable(chk_uploadedFile);
			ElementUtil.click(chk_uploadedFile);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	// select the document properties
	public void document_Properties(String category, String documentType) {

		try {
			String cat = ".//mat-option//span[contains(text(),'" + category + "')]";
			String docType = ".//mat-option//span[contains(text(),'" + documentType + "')]";
			Thread.sleep(2000);
			ElementUtil.scrollToElement(drp_selectCategory);
			Thread.sleep(2000);

			System.out.println(category + " " + documentType);
			ElementUtil.click(drp_selectCategory);
			ElementUtil.click(By.xpath(cat));// academic);

			ElementUtil.click(drp_docType);
			ElementUtil.click(By.xpath(docType));
			Thread.sleep(2000);

		} catch (Exception ex) {

		}
	}

	// Confirm and Upload
	public void click_On_Confirm_And_Upload() {
		try {
			ElementUtil.waitForElementClickable(btn_uploadSubmit);
			ElementUtil.scrollToElement(btn_uploadSubmit);
			ElementUtil.click(btn_uploadSubmit);
			Thread.sleep(2000);
			ElementUtil.waitForElementNotPresent(txt_loader);
			ElementUtil.waitForElementClickable(btn_close);
			Thread.sleep(2000);
			ElementUtil.click(btn_close);
			Thread.sleep(2000);
			ElementUtil.waitForElementNotPresent(txt_loader);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	// navigate to the opportunity page

	public void switchTo_Opportunity() {
		DriverFactory.getDriver().switchTo().defaultContent();
		ElementUtil.waitForElementPresent(switchToOpportunity);
		ElementUtil.scrollToElement(switchToOpportunity);
		ElementUtil.click(switchToOpportunity);
	}

	// get the status
	public String get_Status() {
		ElementUtil.waitForElementPresent(status);
		ElementUtil.scrollToElement(status);
		return ElementUtil.getTextValue(status);
	}

	// click on Next Button
	public void click_On_the_Next() {
		ElementUtil.click(nextButton);
	}

	//
	public void enter_the_decisionField() {

		ElementUtil.click(decisionField);
		ElementUtil.click(veridyOption);
	}

	// click on confirm_send button
	public void click_On_ConfirmSend_Button() {
		ElementUtil.click(confirm_send);
	}

	// verify the doc reviewed successfully
	public boolean isReviewed() {
		ElementUtil.waitForElementClickable(docReviewdSuccessfully);
		ElementUtil.scrollToElement(docReviewdSuccessfully);
		boolean flag = ElementUtil.isElementDisplayed(docReviewdSuccessfully);
		ElementUtil.click(closeSuccessPopup);
		return flag;
	}

	// In Review SignOff select the 1st document
	public void selectThe_firstDoc_CheckBoxIn_reviewSignOff_page() {

		List<WebElement> lst = DriverFactory.getDriver().findElements(reviewSignOfffirst_DocNameChkBox);
		for (WebElement ele : lst) {
			WebDriver driver = DriverFactory.getDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			if (ele.isEnabled()) {
				ele.click();
			} else {
				System.out.println("No Doc FOUND :***");
			}
		}

	}
   
	
	//Group the Documents
	public void click_group_selected_document() {
		ElementUtil.waitForElementClickable(groupDocs_btn);
		ElementUtil.click(groupDocs_btn);
	}
	
	
	
	
	// In review sign off Delete Icon
	public void click_on_DeleteIcon_In_ReviewSignOffPage() {
		ElementUtil.waitForElementClickable(reviewSignOf_deleteIcon);
		ElementUtil.click(reviewSignOf_deleteIcon);
	}

	// In review sign off Delete Icon
	public void click_on_DowloadIcon_In_ReviewSignOffPage() {
		ElementUtil.waitForElementClickable(reviewSignOf_download);
		ElementUtil.scrollToElement(reviewSignOf_download);
		ElementUtil.click(reviewSignOf_download);
	}

	// open the opportunity

	public void click_on_the_Opportunity() {
		ElementUtil.waitForElementClickable(opportunityRecord);
		ElementUtil.click(opportunityRecord);
	}

	// navigate to Document Tab

	public void navigate_To_DocumentTab() {
    	
    	ElementUtil.waitForElementClickable(navigateTODocumentTab);
    	ElementUtil.scrollToElement(navigateTODocumentTab);;
    	ElementUtil.click(navigateTODocumentTab);
    }
	
	//Move to the available_to_attach_Section
	public void moveTo_available_to_attach_Section() {
		
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.scrollToElement(available_to_attach_Section);
		
	}

	/****************************************** IELTS **************************/

	// Get test Reference Number
	public String get_testReferenceNumber() {
		return ElementUtil.getAttribute(testReferenceNumber, "value");
	}

	// Get test test Date
	public String get_testDate() {
		return ElementUtil.getAttribute(testDate, "value");
	}

	// Get test IELTSListeningScore
	public String get_IELTSListeningScore() {
		ElementUtil.scrollToElement(IELTSListeningScore);
		return ElementUtil.getText(IELTSListeningScore);
	}

	// Get test IELTSReadingScore
	public String get_IELTSReadingScore() {
		return ElementUtil.getText(IELTSReadingScore);
	}

	// Get test IELTSWritingScore
	public String get_IELTSWritingScore() {
		return ElementUtil.getText(IELTSWritingScore);
	}

	// Get test IELTSSpeakingScore
	public String get_IELTSSpeakingScore() {
		return ElementUtil.getText(IELTSSpeakingScore);
	}

	// Get test TotalScore
	public String get_TotalScore() {
		return ElementUtil.getAttribute(TotalScore, "value");
	}

	/************************** Passport *************************************/

	// Get test firstName
	public String get_firstName() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(firstName);
		return ElementUtil.getAttribute(firstName, "value");
	}

	// Get test lastname
	public String get_lastname() {
		return ElementUtil.getAttribute(lastname, "value");
	}

	// Get test dateOfBirth
	public String get_dateOfBirth() {
		return ElementUtil.getAttribute(dateOfBirth, "value");
	}

	// Get test nationality
	public String get_nationality() {
		return ElementUtil.getText(nationality);
	}

	// Get test number
	public String get_number() {
		return ElementUtil.getAttribute(number, "value");
	}
}
