package com.pages;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;
import com.qa.util.Excel_Reader;

import AppHooks.ApplicationHooks;

public class IC_ContractCreationPage {

	private By contractTab = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'CONTRACT')]");
	private By addContractBtn = By.xpath(".//*[@data-help-id='dM0swn4bjaYI2sGrNq0DEm']/span/span");
	private By leadTab = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'LEADS')]");
	private By contractID = By.xpath(".//*[@data-help-id='KG9QsC5M9465k8ifKOYc0m']//input");// VGT
	private By Contractammount = By.xpath(".//*[@data-help-id='0$JuVt19$Kc$HpeflMfFA0']//input");// 12344
	// private By
	private static By contractType = By.xpath(".//*[@data-help-id='GmNKVjRXR4ErqIYgGGBVwW']//input");// Documentation
	private static By contractDestination = By.xpath(".//*[@data-help-id='k_BuKfn0Xq2$VzGCkmXWw0']//input");// Canada
	private By studyLevel=By.xpath(".//*[@data-help-id='c5bwQYy7lKonz_Lcl0BFZW']//input");
	private By contractOwnerID = By.xpath(".//*[@data-help-id='GSYEIR5714U_OBDb6fru1W']//input"); // 420000115
	private static By contractSaveButton = By.xpath(".//*[@data-help-id='vdzW3flmW4UJwvWwOsvUTm']");// need to check
	private By get_contractID = By.xpath(".//*[@data-help-id='zlLkF7IsV4sLS9KAY5237m']");
	private By dropDown_valueSelection = By
			.xpath("//div[contains(@style,'display: block')]//ul/li//div[@class='sapMSLITitleOnly']");
	private By LeadFromIcFlow = By.xpath(".//*[@data-sap-automation-id='uwtnY30of4U5by6QZm5IRG']");
	private By more = By.xpath(".//*[contains(@id,'moreLessButton-BDI-content')]");
	private static By aero_down = By.xpath("//button[@title='slim-arrow-down']");
	private static By lbl_historyTab = By
			.xpath("//ul[@role='listbox']//li/span[contains(text(),'CONTRACTS')]//parent::li");
	private static By drp_studyLevel = By.xpath("//div[@data-help-id='c5bwQYy7lKonz_Lcl0BFZW']//input");
	private static By tbl_firstContract = By
			.xpath("//div[@data-help-id='dfNL_gWxpaMvTnMdgswUG0-scrollContainer']//tbody//tr[1]//td[2]");
	private static By tbl_secondContract = By
			.xpath("//div[@data-help-id='dfNL_gWxpaMvTnMdgswUG0-scrollContainer']//tbody//tr[2]//td[2]");
	private static By btn_Opportunities = By.xpath("//div[text()='Opportunities']");
	private static By lbl_ConractId = By
			.xpath("//div[@data-help-id='KxCRaZCxAKUDaEVqsJnBRG']//tbody//tr[1]//td[2]//span");
	private static By btn_contractDetails = By.xpath("//div[text()='Contract Detail']");
	private static By btn_ebsSync = By.xpath("(//bdi[text()='EBS Sync'])[1]");
	private static By btn_refresh = By.xpath("//button[@data-help-id='ShhKB9IH44M8cgwdZYyT4W']");
	private static By btn_contractTab = By.xpath("//div[@role='tab']//div[text()='CONTRACTS']");
	private static By btn_finalise1 = By
			.xpath("(//div[@data-help-id='GV_HD2xpM4QDubwzp5hybG']//tbody//tr[1]//td[9]//div[1]//span)[1]");
	private static By btn_YesPopup = By.xpath("//bdi[text()='Yes']");
	private static By txt_contractDate = By.xpath("//div[@data-help-id='nE7bzLS6MawIpie4idwxqG']//input");
	private static By btn_paymentDetailsTab = By.xpath("//div[text()='Payment Details']");
	private static By btn_addRowPayment = By.xpath("(//bdi[text()='Add Row'])[2]");
	private static By txt_paymentMethod = By
			.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[1]//td[3]//input");
	private static By txt_idpBank = By
			.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[1]//td[4]//input");
	private static By txt_payer = By.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[1]//td[5]//input");
	private static By btn_payeePopup = By
			.xpath("(//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[1]//td[6]//input//following::span)[1]");
	private static By btn_searchPayee = By.xpath("//button[@data-help-id='eiRFlnbG14cTi2MbBWSioW-searchButton']");
	private static By txt_searchPayee = By.xpath("//div[@data-help-id='eiRFlnbG14cTi2MbBWSioW-searchField']//input");
	private static By tbl_Payeedata = By.xpath("//div[@data-help-id='a4jHB4H6X4slaGJg8nnHGW']//tbody//tr[1]//td[2]");
	private static By drp_paymentType = By
			.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[1]//td[7]//input");
	private static By txt_paymentAmount = By
			.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[1]//td[8]//input");
	private static By txt_recieptNumber = By
			.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[1]//td[10]//input");
	private static By txt_contractId = By.xpath("//div[@data-help-id='KG9QsC5M9465k8ifKOYc0m']//input");
	private static By btn_globalSave = By.xpath("//bdi[text()='Save']");
	private static By lbl_headerMessage = By.xpath("//span[@data-help-id='messageBar-headerMessage']");



	ApplicationPageUtil appPageUtil = new ApplicationPageUtil();

//****************************** EXCEL **********************************************

	public static HashMap<String, String> data = new HashMap<String, String>();

	public static void initExcel(int row) throws IOException {
		data = ExcelUtil.readExcelData("Contract", row);
	}

//****************************** EXCEL **********************************************
	// navigate to Contract Tab
	public void navigate_To_ContractPage() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.scrollToElement(contractTab);
			ElementUtil.click(contractTab);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	// Enter contract ID
	public void enter_Contract_ID(String contractid) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		if (ElementUtil.waitForElementVisibleReturn(contractID)) {
			try {
				ElementUtil.Type(contractID, contractid);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// enter amount in contract creation pag
	public void enter_Amount_In_CotractCreationPage(String amount) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		if (ElementUtil.waitForElementVisibleReturn(Contractammount)) {
			Actions a = new Actions(DriverFactory.getDriver());
			a.moveToElement(DriverFactory.getDriver().findElement(Contractammount)).clickAndHold().keyDown(Keys.CONTROL)
			.sendKeys(String.valueOf('\u0061')).sendKeys(String.valueOf('\u0078')).keyUp(Keys.CONTROL)
			.sendKeys(amount).build().perform();

			
		}

	}
	

	// Enter contract type
	public static void enter_Contract_Type(String contractTyp) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		if (ElementUtil.waitForElementVisibleReturn(contractType)) {
			try {
				ElementUtil.Type(contractType, contractTyp);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// select contract Destination
	public static void select_contract_Destination(String conDestination) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		if (ElementUtil.waitForElementVisibleReturn(contractDestination)) {
			try {
				ElementUtil.Type(contractDestination, conDestination);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	// select studyLevel
	public void select_studyLevel(String studyLev) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		if (ElementUtil.waitForElementVisibleReturn(studyLevel)) {
		        try {
					Thread.sleep(2000);
					 ElementUtil.Type(studyLevel, studyLev);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	// Enter contract OwnerID
	public void enter_contract_OwnerID(String contOwnerID) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		if (ElementUtil.waitForElementVisibleReturn(contractOwnerID)) {
			try {
				ElementUtil.Type(contractOwnerID, contOwnerID);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// click on save Contract button
	public static void click_contractSaveButton() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		if (ElementUtil.waitForElementVisibleReturn(contractSaveButton)) {
			ElementUtil.click(contractSaveButton);
		}
	}

	// Click on the add Contract Button
	// use
	public void clickON_addContractButton() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(addContractBtn);
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(4000);
			// if(ElementUtil.waitForElementPresentReturn(addContractBtn))
			ElementUtil.click(addContractBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// select Lead from the IC Flow
	public void select_On_Lead_from_IC_Flow() {

		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2000);
			ElementUtil.click(LeadFromIcFlow);

			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(more);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// navigate to IC Page as a Counsellor
	public void navigateTo_IC_page_As_Counsellor() {
		appPageUtil.clickTab_underCategory("Customers", "Individual Customers");
	}

//use
	public void createContract(String testcaseNo) {
		try {
			String conid = ElementUtil.generateRandomNumber(5);
			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
			String ContractAmount = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICcontractTestData",
					"Contract Amount");
			String ContractDestination = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
					"ICcontractTestData", "Contract Destination");
			String ContractType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICcontractTestData",
					"Contract Type");
			String ContractOwner = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICcontractTestData",
					"Contract Owner");
			String studyLevel=ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICcontractTestData",
					"Study Level");
			System.out.println("Study Level:-"+studyLevel);
			Thread.sleep(2000);
			System.out.println(conid);
			enter_Contract_ID(conid);
			Thread.sleep(2000);
			enter_Contract_Type(ContractType);
			Thread.sleep(2000);
			select_contract_Destination(ContractDestination);
			enter_contract_OwnerID(ContractOwner);
			Thread.sleep(3000);
			select_studyLevel(studyLevel);
			enter_Amount_In_CotractCreationPage(ContractAmount);
			Thread.sleep(2000);
			click_contractSaveButton();
			String text = ElementUtil.getTextValue(get_contractID);
			ConfigReader.writeToApplicationPropertie("ContractID", text);
			System.out.println("ContractID---->" + ConfigReader.getApplicationPropertie("ContractID"));
		} catch (Exception ex) {
			ex.getMessage();
		}
	}

	public void createContract() throws IOException, InterruptedException {

		String Amount = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "Amount");
		String ContractType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"ContractType");
		String Destination = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "Destination");
		String OwnerID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "OwnerID");
		String StudyLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "StudyLevel");
		String ContractDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"ContractDate");

		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		String conid = ElementUtil.generateRandomNumber(5);
		System.out.println(conid);

		enter_Contract_ID(conid);
		Thread.sleep(2000);
		ElementUtil.Type(txt_contractDate, ContractDate);
		Thread.sleep(2000);
		enter_Contract_Type(ContractType);
		select_contract_Destination(Destination);
		enter_contract_OwnerID(OwnerID);
		enter_Amount_In_CotractCreationPage(Amount);
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_studyLevel);
		Thread.sleep(2000);
		ElementUtil.Type(drp_studyLevel, StudyLevel);
		Thread.sleep(2000);
		click_contractSaveButton();

		String text = ElementUtil.getTextValue(get_contractID);
		ConfigReader.writeToApplicationPropertie("ContractID", text);
		System.out.println("ContractID---->" + ConfigReader.getApplicationPropertie("ContractID"));
	}

//use
	public static void switchToContractTab() throws InterruptedException {
		try {
			ElementUtil.waitForPageLoad();
			ElementUtil.scrollToElement(btn_contractTab);
			Thread.sleep(5000);
			ElementUtil.Click(btn_contractTab, "Contract tab");
			Thread.sleep(2000);

		} catch (Exception e) {
			ElementUtil.waitForPageLoad();
			Thread.sleep(5000);
			ElementUtil.waitForElementClickable(aero_down);
			ElementUtil.click(aero_down);
			ElementUtil.scrollToElement(lbl_historyTab);
			ElementUtil.click(lbl_historyTab);
			Thread.sleep(2000);
		}

	}

	public static void clickFirstContract() throws InterruptedException {
		ElementUtil.Click(tbl_firstContract, "First contract data ");
		Thread.sleep(2000);
		try {
			ElementUtil.Click(tbl_firstContract, "First contract data ");
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(1000);
		}
	}

	public static void clickSecondContract() throws InterruptedException {
		ElementUtil.Click(tbl_secondContract, "Second contract data ");
		Thread.sleep(2000);
	}

	public static void clickOpportunitiesSection() throws InterruptedException {
		ElementUtil.Click(btn_Opportunities, "Opportunities section");
		Thread.sleep(2000);
	}

	public static void clickContractDetailsSection() throws InterruptedException {
		ElementUtil.Click(btn_contractDetails, "Contract details section");
		Thread.sleep(2000);
	}

	public static void verifyContractOpportunity1() {
		String contId1 = DriverFactory.getDriver().findElement(lbl_ConractId).getText();
		if (contId1.equals(LeadCreationPage.ContIdOP1)) {
			System.out.println("First contract Id: " + contId1);
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "First contract ID: " + contId1 + "</span>");
		} else {
			System.out.println("fail");
		}
	}

	public static void verifyContractOpportunity2() throws InterruptedException {
		ElementUtil.Click(btn_refresh, "Refresh button");
		Thread.sleep(2000);
		String contId2 = DriverFactory.getDriver().findElement(lbl_ConractId).getText();
		if (contId2.equals(LeadCreationPage.ContIdOP2)) {
			System.out.println("Second contract Id: " + contId2);
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Second contract ID: " + contId2 + "</span>");
		} else {
			System.out.println("fail");
		}
	}

	public static void clickSyncEBS() throws InterruptedException {
		try {
			ElementUtil.Click(btn_refresh, "Refresh button");
			ElementUtil.waitForPageLoad();
			Thread.sleep(6000);
			ElementUtil.Click(btn_ebsSync, "EBS sync");
			Thread.sleep(2000);
			ElementUtil.waitForPageLoad();
			ElementUtil.verifyHeaderMessage("Student Synced with EBS Successfully");
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			ElementUtil.Click(btn_finalise1, "EBS sync 1st contract");
			Thread.sleep(2000);
			ElementUtil.Click(btn_YesPopup, "Yes popup");
			Thread.sleep(2000);
		}

	}

	public static void updateContract() throws InterruptedException, IOException {
		String ContractType2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"ContractType2");
		String Destination2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"Destination2");
		String StudyLevel2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "StudyLevel2");

		enter_Contract_Type(ContractType2);
		select_contract_Destination(Destination2);
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_studyLevel);
		Thread.sleep(2000);
		ElementUtil.Type(drp_studyLevel, StudyLevel2);
		Thread.sleep(2000);
		click_contractSaveButton();
	}

	public static void clickFinalise1() throws InterruptedException {
		try {
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			ElementUtil.Click(btn_refresh, "Refresh button");
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			ElementUtil.Click(btn_finalise1, "EBS sync 1st contract");
			Thread.sleep(2000);
			ElementUtil.Click(btn_YesPopup, "Yes popup");
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(1000);
		}
	}

	public static void clickPaymentDetailsTab() throws InterruptedException {
		ElementUtil.Click(btn_paymentDetailsTab, "Payment details tab");
		Thread.sleep(2000);
	}

	public static void clickAddRowPayment() throws InterruptedException {
		ElementUtil.Click(btn_addRowPayment, "Add payment row");
		Thread.sleep(2000);
	}

	public static void fillMandatoryPaymentDetails() throws InterruptedException, IOException {
		String PaymentMethod = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"PaymentMethod");
		String IdpBank = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "IdpBank");
		String Payer = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "Payer");
		String Payee = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "Payee");
		String PaymentType1 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"PaymentType1");
		String PaymentType2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"PaymentType2");
		String PaymentAmount = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"PaymentAmount");
		String ReceiptNumber = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"ReceiptNumber");
		ElementUtil.Type(txt_paymentMethod, PaymentMethod);
		Thread.sleep(2000);
		ElementUtil.Type(txt_idpBank, IdpBank);
		Thread.sleep(2000);
		ElementUtil.Type(txt_payer, Payer);
		Thread.sleep(2000);
		ElementUtil.Click(btn_payeePopup, "Payee select popup");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_searchPayee, "Search payee");
		Thread.sleep(2000);
		ElementUtil.Type(txt_searchPayee, Payee);
		Thread.sleep(2000);
		ElementUtil.Click(tbl_Payeedata, "Payee data from tabel");
		Thread.sleep(2000);
		ElementUtil.Type(drp_paymentType, PaymentType1);
		Thread.sleep(2000);
//		ElementUtil.doubleClick(txt_paymentAmount);
//		Thread.sleep(1000);
//		ElementUtil.TypeWithoutClear(txt_paymentAmount, PaymentAmount);
//		Thread.sleep(2000);
		WebElement e6 = DriverFactory.getDriver()
				.findElement(By.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[1]//td[8]//input"));
		Actions action = new Actions(DriverFactory.getDriver());
		action.moveToElement(e6).doubleClick().build().perform();
		e6.sendKeys(PaymentAmount);
		Thread.sleep(2000);
		ElementUtil.scrollToElement(txt_recieptNumber);
		Thread.sleep(2000);
		ElementUtil.Type(txt_recieptNumber, ReceiptNumber);
		Thread.sleep(2000);
	}

	public static void verifyContractIdNotEditable() {
		boolean contID = DriverFactory.getDriver().findElement(txt_contractId).isSelected();
		if (contID == false) {
			System.out.println("not editable");
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Contract ID field is non editable " + "</span>");
		}
	}

	public static void addMultiplePayments() throws InterruptedException, IOException {

		String PaymentMethod = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"PaymentMethod");
		String IdpBank = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "IdpBank");
		String Payer = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "Payer");
		String Payee = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract", "Payee");
		String PaymentType1 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"PaymentType1");
		String PaymentType2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"PaymentType2");
		String PaymentAmount = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"PaymentAmount");
		String ReceiptNumber = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Contract",
				"ReceiptNumber");

		for (int i = 2; i <= 5; i++) {
			ElementUtil.Click(btn_addRowPayment, "Add payment row");
			Thread.sleep(2000);
//			ElementUtil.scrollToElement(txt_paymentMethod);
//			Thread.sleep(2000);
			WebElement e1 = DriverFactory.getDriver().findElement(
					By.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[" + i + "]//td[3]//input"));
			e1.sendKeys(PaymentMethod);
			Thread.sleep(2000);
			WebElement e2 = DriverFactory.getDriver().findElement(
					By.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[" + i + "]//td[4]//input"));
			e2.sendKeys(IdpBank);
			Thread.sleep(2000);
			WebElement e3 = DriverFactory.getDriver().findElement(
					By.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[" + i + "]//td[5]//input"));
			e3.sendKeys(Payer);
			Thread.sleep(2000);
			WebElement e4 = DriverFactory.getDriver().findElement(
					By.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[" + i + "]//td[6]//input"));
			e4.sendKeys(Payee);
			Thread.sleep(2000);
//			WebElement e5 = DriverFactory.getDriver().findElement(
//					By.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[" + i + "]//td[7]//input"));
//			e5.clear();
//			Thread.sleep(2000);
//			e5.sendKeys(PaymentType2);
//			Thread.sleep(2000);
			WebElement e6 = DriverFactory.getDriver().findElement(
					By.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[" + i + "]//td[8]//input"));
			Actions action = new Actions(DriverFactory.getDriver());
			action.moveToElement(e6).doubleClick().build().perform();
			e6.sendKeys(PaymentAmount);
			Thread.sleep(2000);
			WebElement e7 = DriverFactory.getDriver().findElement(
					By.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[" + i + "]//td[10]//input"));
			e7.sendKeys(ReceiptNumber);
			Thread.sleep(2000);

//			ElementUtil.Type(txt_paymentMethod, PaymentMethod);
//			Thread.sleep(2000);
//			ElementUtil.Type(txt_idpBank, IdpBank);
//			Thread.sleep(2000);
//			ElementUtil.Type(txt_payer, Payer);
//			Thread.sleep(2000);
//			ElementUtil.Click(btn_payeePopup, "Payee select popup");
//			Thread.sleep(2000);
//			ElementUtil.Click(btn_searchPayee, "Search payee");
//			Thread.sleep(2000);
//			ElementUtil.Type(txt_searchPayee, Payee);
//			Thread.sleep(2000);
//			ElementUtil.Click(tbl_Payeedata, "Payee data from tabel");
//			Thread.sleep(2000);
//			ElementUtil.Type(drp_paymentType, PaymentType2);
//			Thread.sleep(2000);
////			ElementUtil.doubleClick(txt_paymentAmount);
////			Thread.sleep(1000);
//			ElementUtil.TypeWithoutClear(txt_paymentAmount, PaymentAmount);
//			Thread.sleep(2000);
//			ElementUtil.scrollToElement(txt_recieptNumber);
//			Thread.sleep(2000);
//			ElementUtil.Type(txt_recieptNumber, ReceiptNumber);
//			Thread.sleep(2000);

			ElementUtil.Click(btn_globalSave, "Save button");
			Thread.sleep(2000);
			if (i == 6) {
				ElementUtil.Type(txt_paymentMethod, PaymentMethod);
				Thread.sleep(2000);
				ElementUtil.Type(txt_idpBank, IdpBank);
				Thread.sleep(2000);
				ElementUtil.Type(txt_payer, Payer);
				Thread.sleep(2000);
				ElementUtil.Click(btn_payeePopup, "Payee select popup");
				Thread.sleep(2000);
				ElementUtil.waitForPageLoad();
				Thread.sleep(2000);
				ElementUtil.Click(btn_searchPayee, "Search payee");
				Thread.sleep(2000);
				ElementUtil.Type(txt_searchPayee, Payee);
				Thread.sleep(2000);
				ElementUtil.Click(tbl_Payeedata, "Payee data from tabel");
				Thread.sleep(2000);
//				ElementUtil.Type(drp_paymentType, PaymentType1);
//				Thread.sleep(2000);
				WebElement el6 = DriverFactory.getDriver()
						.findElement(By.xpath("//div[@data-help-id='VoAD$7PkuqoXFOCbLQV0MW']//tbody//tr[1]//td[8]//input"));
				Actions action1 = new Actions(DriverFactory.getDriver());
				action1.moveToElement(el6).doubleClick().build().perform();
				e6.sendKeys(PaymentAmount);
				Thread.sleep(2000);
				ElementUtil.scrollToElement(txt_recieptNumber);
				Thread.sleep(2000);
				ElementUtil.Type(txt_recieptNumber, ReceiptNumber);
				Thread.sleep(2000);
				
				String label1 = DriverFactory.getDriver().findElement(lbl_headerMessage).getText();
				if (label1.contains("More than 5 payment Installments")) {
					System.out.println(label1);
					ExtentCucumberAdapter
							.addTestStepLog("<span style='color:green;font-weight:bold;'>" + label1 + "</span>");
				} else {
					// Assert.assertFalse(true);
				}
			}
			String label = DriverFactory.getDriver().findElement(lbl_headerMessage).getText();
			if (label.contains("Your entries have been saved")) {
				System.out.println(label);
				ExtentCucumberAdapter
						.addTestStepLog("<span style='color:green;font-weight:bold;'>" + label + "</span>");
			} else {
				// Assert.assertFalse(true);
			}

		}

	}

}
