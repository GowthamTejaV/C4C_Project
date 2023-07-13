package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;

public class OP_DocumentsPage {
	ApplicationPageUtil apputil = new ApplicationPageUtil();

	// **********************GOW****************************************************//

	private By waitFileUpload = By.xpath(".//span[text()='Upload in Progress']");
	private By add_Btn = By.xpath(".//*[text()='Add']");

	private By localFileOptn = By.xpath(".//*[text()='Local File']");

	private By browserLocal = By.xpath("(.//*[@title='Browse'])[1]");

	private By addCourse = By.xpath(".//*[@data-help-id='$N$fJr_zSqwrn4o4HCd_Um']//bdi");

	private static By refresh = By.xpath(".//*[@data-help-id='eHchVh2J_KkVzURuZm74Xm']/descendant::bdi");

	private By FeePayments = By.xpath("(.//*[@type='text'])[4]");

	private By PaymentReceipt = By.xpath("(.//*[@type='text'])[5]");

	private By InstitutionLettersOrDocuments1 = By.xpath("(.//*[@type='text'])[10]");

	private By OfferLetter = By.xpath("(.//*[@type='text'])[11]");

	private By InstitutionLettersOrDocuments2 = By.xpath("(.//*[@type='text'])[16]");

	private By ElectroniConfirmationOfenrolment = By.xpath("(.//*[@type='text'])[17]");

	private By PersonalDocuments = By.xpath("(.//*[@type='text'])[22]");

	private By PassportDocument = By.xpath("(.//*[@type='text'])[23]");

	private By Academic = By.xpath("(.//*[@type='text'])[28]");

	private By AcademicTranscripts = By.xpath("(.//*[@type='text'])[29]");

	private By InstitutionLettersDocuments = By.xpath("(.//*[@type='text'])[34]");

	private By I20Copy = By.xpath("(.//*[@type='text'])[35]");

	private By PersonalDocuments2 = By.xpath("(.//*[@type='text'])[40]");

	private By visaRelatedDocuments = By.xpath("(.//*[@type='text'])[41]");
	private By InstitutionLettersOrDocuments3 = By.xpath("(.//*[@type='text'])[46]");
	private By LetterofAcceptance = By.xpath("(.//*[@type='text'])[47]");

	private By aleart_Ok = By.xpath(".//*[text()='OK']");
	
	private static By headerMessage=By.xpath("//span[@data-help-id='messageBar-headerMessage']");

	// Vgt
	public void ATTACHMENTCATEGORIES() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			if (ElementUtil.isElementDisplayed(aleart_Ok)) {
				ElementUtil.click(aleart_Ok);
			}

			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ElementUtil.waitForElementClickable(FeePayments);
			ElementUtil.type__C(FeePayments, "Fee Payments");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(PaymentReceipt);
			ElementUtil.type__C(PaymentReceipt, "Payment Receipt");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(InstitutionLettersOrDocuments1);
			ElementUtil.type__C(InstitutionLettersOrDocuments1, "Institution Letters or Documents");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(OfferLetter);
			ElementUtil.type__C(OfferLetter, "Offer Letter");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(InstitutionLettersOrDocuments2);
			ElementUtil.type__C(InstitutionLettersOrDocuments2, "Institution Letters or Documents");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(ElectroniConfirmationOfenrolment);
			ElementUtil.type__C(ElectroniConfirmationOfenrolment, "Electronic confirmation of enrolment (eCOE)");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(PersonalDocuments);
			ElementUtil.type__C(PersonalDocuments, "Personal Documents");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(PassportDocument);
			ElementUtil.type__C(PassportDocument, "Passport/Other Identification Document");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(Academic);
			ElementUtil.type__C(Academic, "Academic");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(AcademicTranscripts);
			ElementUtil.type__C(AcademicTranscripts, "Academic Transcripts and/or Course Completion");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(InstitutionLettersDocuments);
			ElementUtil.type__C(InstitutionLettersDocuments, "Institution Letters or Documents");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(I20Copy);
			ElementUtil.type__C(I20Copy, "I20 Copy");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(PersonalDocuments2);
			ElementUtil.type__C(PersonalDocuments2, "Personal Documents");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(visaRelatedDocuments);
			ElementUtil.type__C(visaRelatedDocuments, "Visa Related documents");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(InstitutionLettersOrDocuments3);
			ElementUtil.type__C(InstitutionLettersOrDocuments3, "Institution Letters or Documents");
			Thread.sleep(2500);
			ElementUtil.waitForElementClickable(LetterofAcceptance);
			ElementUtil.type__C(LetterofAcceptance, "Letter of Acceptance");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	// use
	public void ATTACHMENT_CATEGORIES() throws InterruptedException, IOException {
		String FeePayments_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Documents",
				"FeePayments");
		String PaymentReceipt_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Documents",
				"PaymentReceipt");
		String InstitutionLettersOrDocuments1_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"Documents", "InstitutionLettersOrDocuments1");
		String OfferLetter_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Documents",
				"OfferLetter");
		String InstitutionLettersOrDocuments2_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"Documents", "InstitutionLettersOrDocuments2");
		String ElectroniConfirmationOfenrolment_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"Documents", "ElectroniConfirmationOfenrolment");
		String PersonalDocuments_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Documents",
				"PersonalDocuments");
		String PassportDocument_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Documents",
				"PassportDocument");
		String Academic_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Documents", "Academic");
		String AcademicTranscripts_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Documents",
				"AcademicTranscripts");
		String InstitutionLettersDocuments_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"Documents", "InstitutionLettersDocuments");
		String I20Copy_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Documents", "I20Copy");
		String PersonalDocuments2_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Documents",
				"PersonalDocuments2");
		String visaRelatedDocuments_ = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Documents",
				"visaRelatedDocuments");

		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(aleart_Ok);
			Thread.sleep(8000);
			ApplicationPageUtil.waitForLoadGetDisappiear();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
		ElementUtil.type(FeePayments, FeePayments_);
		Thread.sleep(3000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(PaymentReceipt, PaymentReceipt_);
		ElementUtil.waitForElementClickable(InstitutionLettersOrDocuments1);
		Thread.sleep(3000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(InstitutionLettersOrDocuments1, InstitutionLettersOrDocuments1_);
		ElementUtil.waitForElementClickable(OfferLetter);
		Thread.sleep(3000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(OfferLetter, OfferLetter_);
		ElementUtil.waitForElementClickable(InstitutionLettersOrDocuments2);
		Thread.sleep(3000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(InstitutionLettersOrDocuments2, InstitutionLettersOrDocuments2_);
		ElementUtil.waitForElementClickable(ElectroniConfirmationOfenrolment);
		Thread.sleep(3000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(ElectroniConfirmationOfenrolment, ElectroniConfirmationOfenrolment_);
		ElementUtil.waitForElementClickable(PersonalDocuments);
		Thread.sleep(3000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(PersonalDocuments, PersonalDocuments_);
		ElementUtil.waitForElementClickable(PassportDocument);
		Thread.sleep(3000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(PassportDocument, PassportDocument_);
//		ElementUtil.waitForElementClickable(Academic);
		Thread.sleep(3000);
//		ApplicationPageUtil.waitForLoadGetDisappiear();
//		ElementUtil.type(Academic, Academic_);
//		ElementUtil.waitForElementClickable(AcademicTranscripts);
//		Thread.sleep(3000);
//		ApplicationPageUtil.waitForLoadGetDisappiear();
//		ElementUtil.type(AcademicTranscripts, AcademicTranscripts_);
//		ElementUtil.waitForElementClickable(InstitutionLettersDocuments);
//		Thread.sleep(3000);
//		ApplicationPageUtil.waitForLoadGetDisappiear();
//		ElementUtil.type(InstitutionLettersDocuments, InstitutionLettersDocuments_);
//		ElementUtil.waitForElementClickable(I20Copy);
//		Thread.sleep(3000);
//		ApplicationPageUtil.waitForLoadGetDisappiear();
//		ElementUtil.type(I20Copy, I20Copy_);
//		ElementUtil.waitForElementClickable(PersonalDocuments2);
//		Thread.sleep(2000);
//		ApplicationPageUtil.waitForLoadGetDisappiear();
//		ElementUtil.type(PersonalDocuments2, PersonalDocuments2_);
//		ElementUtil.waitForElementClickable(visaRelatedDocuments);
//		Thread.sleep(2000);
//		ApplicationPageUtil.waitForLoadGetDisappiear();
//		ElementUtil.type(visaRelatedDocuments, visaRelatedDocuments_);
//		Thread.sleep(3000);
//		try 
//		{
//			ElementUtil.type(By.xpath("(.//*[@type='text'])[40]"), "Institution Letters or Documents");
//			Thread.sleep(5000);
//			ElementUtil.type(By.xpath("(.//*[@type='text'])[41]"), "Letter of Acceptance");
//			Thread.sleep(3000);
//		}catch(Exception ee) 
//		{
//			Thread.sleep(1000);
//		}
		
		}catch(Exception e) {
			Thread.sleep(1000);
		}
	}

	public void SKIP_Visa_Related_documents_FOR_ATTACHMENT_CATEGORIES() {

		if (ElementUtil.isElementDisplayed(aleart_Ok)) {
			ElementUtil.click(aleart_Ok);
		}

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.type(FeePayments, "Fee Payments");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(PaymentReceipt, "Payment Receipt");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(InstitutionLettersOrDocuments1, "Institution Letters or Documents");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(OfferLetter, "Offer Letter");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(InstitutionLettersOrDocuments2, "Institution Letters or Documents");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(ElectroniConfirmationOfenrolment, "Electronic confirmation of enrolment (eCOE)");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(PersonalDocuments, "Personal Documents");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(PassportDocument, "Passport/Other Identification Document");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(Academic, "Academic");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(AcademicTranscripts, "Academic Transcripts and/or Course Completion");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(InstitutionLettersDocuments, "Institution Letters or Documents");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(I20Copy, "I20 Copy");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		// ElementUtil.type(PersonalDocuments2, "Personal Documents");

		// ApplicationPageUtil.waitForLoadGetDisappiear();
		// ElementUtil.type(visaRelatedDocuments, "Visa Related documents");
		ElementUtil.type(By.xpath("(.//*[@type='text'])[40]"), "Institution Letters or Documents");
		ElementUtil.type(By.xpath("(.//*[@type='text'])[41]"), "Letter of Acceptance");
	}

	// Click on Add Button to upload the Doc
	public void click_On_Document_AddButton() {

		try {
			Thread.sleep(3500);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.isElementDisplayed(add_Btn);
			ElementUtil.click(add_Btn);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// select localFileOptn to upload the Doc
	public void select_localFileOptn() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.isElementDisplayed(localFileOptn);
		ElementUtil.click(localFileOptn);
	}

	// Click on browserLoca to upload the Doc
	public void click_On_browserLocal() throws InterruptedException {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.waitForPageLoad();
		ElementUtil.isElementDisplayed(browserLocal);
		Thread.sleep(2000);
		ElementUtil.click(browserLocal);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Click on refresh button
	public static void click_On_refresh() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(refresh);
	}

	// add the course after uploading the course
	public void click_On_addCourse_Button() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(addCourse);
	}

//	public void uploadFileWithRobot(String imagePath) {
//		StringSelection stringSelection = new StringSelection(imagePath);
//		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		clipboard.setContents(stringSelection, null);
//		Robot robot = null;
//		try {
//			robot = new Robot();
//		} catch (AWTException e) {
//			e.printStackTrace();
//		}
//		robot.delay(250);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.delay(150);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//	}

	public void uploadFileFromTheLocal() {
		String path = System.getProperty("user.dir");
		for (int i = 1; i <= 8; i++) {
			try {
				Thread.sleep(2000);
				String filepath = path + "//src//test//resources//Data//TestFiles//Doc" + i + ".pdf";
				click_On_Document_AddButton();
				select_localFileOptn();
				Thread.sleep(2000);
//				click_On_browserLocal();
//				Thread.sleep(3200);
//				uploadFileWithRobot(filepath);
				WebElement element=DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']"));
				element.sendKeys(filepath);
				Thread.sleep(3000);
				click_On_addCourse_Button();
				Thread.sleep(2500);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}

	public void uploadFileFromTheLocal_BasedOn_Size(int size) {
		String path = System.getProperty("user.dir");
		for (int i = 1; i <= size; i++) {
			try {
				Thread.sleep(2500);
				String filepath = path + "//src//test//resources//Data//TestFiles//Doc" + i + ".pdf";
				click_On_Document_AddButton();
				Thread.sleep(2300);
				select_localFileOptn();
				Thread.sleep(2300);
//				click_On_browserLocal();
//				Thread.sleep(2300);
//				uploadFileWithRobot(filepath);
				WebElement element=DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']"));
				element.sendKeys(filepath);
				Thread.sleep(2000);
				ElementUtil.waitForElementNotPresent(waitFileUpload);
				click_On_addCourse_Button();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}

	// ***********************VGT********************************//
//use
	public void uploadFileFromTheLoacl() throws InterruptedException {
		String path = System.getProperty("user.dir");
		for (int i = 1; i <= 4; i++) {
			try {
				String filepath = path + "//src//test//resources//Data//TestFiles//Doc" + i + ".pdf";
				click_On_Document_AddButton();
				select_localFileOptn();
				Thread.sleep(2000);
//  			click_On_browserLocal();
//  			Thread.sleep(3200);
//				uploadFileWithRobot(filepath);
				
				WebElement element=DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']"));
				element.sendKeys(filepath);
				Thread.sleep(3000);
				click_On_addCourse_Button();
				Thread.sleep(2500);
			} catch (Exception e) {
				e.printStackTrace();
				Thread.sleep(1);
				System.out.println(e.getMessage());
			}
		}
	}
	public void uploadFileFromTheLoaclEmail() throws InterruptedException {
		String path = System.getProperty("user.dir");
		
			try {
				String filepath = path + "//src//test//resources//Data//TestFiles//Doc1.pdf";
				click_On_Document_AddButton();
				select_localFileOptn();
				Thread.sleep(3000);
				WebElement element=DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']"));
				element.sendKeys(filepath);
				Thread.sleep(3000);
				click_On_addCourse_Button();
				Thread.sleep(2500);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
	}

	// use
	public void uploadFileFromTheLoaclIC() {
		String path = System.getProperty("user.dir");
		for (int i = 1; i <= 2; i++) {
			try {
				String filepath = path + "//src//test//resources//Data//TestFiles//Doc" + i + ".pdf";
				DriverFactory.getDriver().findElement(By.xpath("//input[@id='file']")).sendKeys(filepath);
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
	

	public static void switchToDocumentsTab() throws InterruptedException 
	{
		ElementUtil.switchToTab("DOCUMENTS");
		Thread.sleep(2000);
	}
	

	public static void verifyHeaderMessage() {
		String header = DriverFactory.getDriver().findElement(headerMessage).getText();
		if (header.contains("Primary Flag cannot be set against course where accepted is NO")) {
			System.out.println(header);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + header + "</span>");
		} else {
			// Assert.assertFalse(true);
		}
	}



}
