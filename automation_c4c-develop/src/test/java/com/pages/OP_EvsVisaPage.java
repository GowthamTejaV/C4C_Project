package com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class OP_EvsVisaPage {
	public static boolean fieldStatus = false;
	public static String dateFormat = "";

	private static By txt_visaType = By.xpath("//div[@data-help-id='t$Qrv0Mgkao8c$mKArxKk0']//input");
	private static By txt_contractSignedDate = By.xpath("//div[@data-help-id='HobN$idq14Is6St2kmp2tW']//input");
	private static By txt_estimateChargesDate = By.xpath("//div[@data-help-id='GtVMWVABz4A72YlQB$0j30']//input");
	private static By txt_visaSubmissionDate = By.xpath("//div[@data-help-id='Bkd36jT2sqQXV1NW6Tn5lG']//input");
	private static By txt_visaResponseDate = By.xpath("//div[@data-help-id='5NnVV1ZWy4w0MvZ4zvLSem']//input");
	private static By txt_passportExpiryDate = By.xpath("//div[@data-help-id='1p6MS9f_OKg_KZW2HcJgyW']//input");

	private static By btn_contractSigned = By.xpath("(//div[@data-help-id='chtWnellzKEhGHcYjVWDA0']//div)[1]");
	private static By btn_estimateAckSigned = By.xpath("(//div[@data-help-id='oSTXt3fcYKMkK89fVC_RYm']//div)[1]");
	private static By txt_visaAppNo = By.xpath("//div[@data-help-id='mj_PnuDXfKUJ3HhA_hpKs0']//input");
	private static By txt_totalServiceFee = By.xpath("//div[@data-help-id='FLH6_kLRR4ouv9ZQ7HbQo0']//input");
	private static By txt_passportNumber = By.xpath("//div[@data-help-id='8FSEWpfCk4YCRytoDa$uTG']//input");

	private static By btn_addRow = By.xpath("//button[@data-help-id='y0hksRqIzK2vfvqK1Bag7W']");
	private static By txt_dateOfPayment = By
			.xpath("//div[@data-help-id='dateTime-6yB3B$2_JaIi1RrHYLa390-DatePicker']//input");
	private static By txt_amountPaid = By.xpath("(//div[@data-help-id='jbWdRAC_gK6U96YOyaHl00']//input)[1]");
	private static By btn_cancel = By.xpath("//bdi[text()='Cancel']");

	private static By li_opportunityTabs = By.xpath("//ul[@role='listbox']//li/span");
	private static By aero_down = By.xpath("//button[@title='slim-arrow-down']");
	private static By li_visaAssesmentLevel = By.xpath("//div[@data-help-id='28P$IGnlyagxd54XoLRrym']//input");
	private static By li_visaSubmissionChannel = By.xpath("//div[@data-help-id='nAHp5t9XaqE1fbiwW8J13G']//input");
	private static By li_passportIssuingCountry = By.xpath("//div[@data-help-id='hrpiAZcrVqc2g4jpqeuz7m']//input");
	private static By li_visaApplicationFee = By.xpath("//div[@data-help-id='FRW4QwdJ54MBZ_rGRLCHGG']//input");
	private static By li_paymentDetails = By
			.xpath("(//div[@data-help-id='CZ7w2Lfli4grW0pbMRpClm']//table//tr)[1]//bdi");
	private static By li_visaPaymentType = By
			.xpath("(//bdi[text()='Payment Details']//following::tbody)//td[2]//input");

	private static By li_picklist = By.xpath("//div[@class='sapMPopoverScroll']//ul[@tabindex='0']/li");
	private static By btn_EvsTab = By.xpath("//div[@role='tab']//div[text()='EVS VISA']");

	public static void switchToOpportunityEvsVisaTab() throws InterruptedException {
	
		try 
		{
			ElementUtil.waitForPageLoad();
			ElementUtil.scrollToElement(btn_EvsTab);
			Thread.sleep(5000);
			ElementUtil.Click(btn_EvsTab, "Activities tab");
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			ElementUtil.switchToTab("EVS VISA");
		}
	}

	public static void verifyVisaTypeNonEditable() {
		boolean editable = DriverFactory.getDriver().findElement(txt_visaType).isSelected();
		if (editable == false) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Unable to edit the visa type as expected" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyCalenderOfContractSigned() {
		String dateFormat = DriverFactory.getDriver().findElement(txt_contractSignedDate).getAttribute("placeholder");

		if (dateFormat.equals("MM/dd/yyyy")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Date format displayed properly for contract signed field: " + dateFormat + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyCalenderOfEstimateChargeDate() {
		String dateFormat = DriverFactory.getDriver().findElement(txt_estimateChargesDate).getAttribute("placeholder");

		if (dateFormat.equals("MM/dd/yyyy")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Date format displayed properly for estimate charge date : " + dateFormat + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyCalenderOfVisaAppSubmissionDate() {
		String dateFormat = DriverFactory.getDriver().findElement(txt_visaSubmissionDate).getAttribute("placeholder");

		if (dateFormat.equals("MM/dd/yyyy")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Date format displayed properly for visa app submission date : " + dateFormat + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyCalenderOfVisaResponseDate() {
		String dateFormat = DriverFactory.getDriver().findElement(txt_visaResponseDate).getAttribute("placeholder");

		if (dateFormat.equals("MM/dd/yyyy")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Date format displayed properly for visa response date : " + dateFormat + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyCalenderOfPassportExpiryDate() {
		String dateFormat = DriverFactory.getDriver().findElement(txt_passportExpiryDate).getAttribute("placeholder");

		if (dateFormat.equals("MM/dd/yyyy")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Date format displayed properly for passport expiry date : " + dateFormat + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyCalenderOfDateOfPayment() {
		String dateFormat = DriverFactory.getDriver().findElement(txt_dateOfPayment).getAttribute("placeholder");

		if (dateFormat.equals("MM/dd/yyyy")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Date format displayed properly for date of payment : " + dateFormat + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyToggleButottonContractSigned() {
		boolean toggleContract = DriverFactory.getDriver().findElement(btn_contractSigned).isSelected();
		if (toggleContract == false) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Toggle button available in the contact signed field as expected" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyToggleButottonAckSigned() {
		boolean toggleAck = DriverFactory.getDriver().findElement(btn_estimateAckSigned).isSelected();
		if (toggleAck == false) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Toggle button available in the estimate of charges ACK signed field as expected" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyVisaAppField() {
		fieldStatus = DriverFactory.getDriver().findElement(txt_visaAppNo).isSelected();
		if (fieldStatus == true) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Visa App File Ref No or TFN No field accepts inputs" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyTotalServiceFeeField() {
		fieldStatus = DriverFactory.getDriver().findElement(txt_totalServiceFee).isSelected();
		if (fieldStatus == true) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Total Service Fee field accepts inputs" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyPassportNoField() {
		fieldStatus = DriverFactory.getDriver().findElement(txt_passportNumber).isSelected();
		if (fieldStatus == true) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Passport Number field accepts inputs" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyAmountPaid() throws InterruptedException {
		ElementUtil.doubleClick(txt_amountPaid);
		Thread.sleep(2000);
		fieldStatus = DriverFactory.getDriver().findElement(txt_amountPaid).isEnabled();
		if (fieldStatus == true) {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:green;font-weight:bold;'>" + "Amount paid field accepts inputs" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void clickaddRow() throws InterruptedException {
		ElementUtil.Click(btn_addRow, "Add row button");
		Thread.sleep(2000);
	}

	public static void clickCancel() throws InterruptedException {
		ElementUtil.Click(btn_cancel, "Cancel button");
		Thread.sleep(2000);
	}

	public static void verifyOpportunityTabPicklist() throws Exception {
		ElementUtil.waitForElementClickable(aero_down);
		ElementUtil.Click(aero_down, "Aero down button");
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "OpportunityTabs", li_opportunityTabs);
		Thread.sleep(5000);
		ElementUtil.Click(aero_down, "Aero down button");
		Thread.sleep(2000);
	}

	public static void verifyVisaAssesmentLevelPicklist() throws Exception {
		ElementUtil.waitForElementClickable(li_visaAssesmentLevel);
		Thread.sleep(2000);
		ElementUtil.Click(li_visaAssesmentLevel, "Assesment level ");
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "VisaAssesmentLevel", li_picklist);
		Thread.sleep(3000);
	}

	public static void verifyVisaSubmissionChannelPicklist() throws Exception {
		ElementUtil.Click(li_visaSubmissionChannel, "Visa submission channel ");
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "VisaSubmissionChannel", li_picklist);
		Thread.sleep(3000);
	}

	public static void verifyPassportIssuingCountryPicklist() throws Exception {
		ElementUtil.Click(li_passportIssuingCountry, "Passport Issuing country");
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "PassportIssuingCountry", li_picklist);
		Thread.sleep(3000);
	}

	public static void verifyApplicationFeePicklist() throws Exception {
		ElementUtil.Click(li_visaApplicationFee, "Visa application fee");
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "VisaApplicationFee", li_picklist);
		Thread.sleep(3000);
	}

	public static void verifyPaymentDetailsHeaderPicklist() throws Exception {
		ElementUtil.comparePickList("Picklist", "PaymentDetails", li_paymentDetails);
		Thread.sleep(3000);
	}

	public static void verifyVisaPaymentTypePicklist() throws Exception {

		ElementUtil.scrollToBottomOfPage();
		Thread.sleep(2000);
		ElementUtil.Click(btn_addRow, "Add row button");
		Thread.sleep(2000);

		ElementUtil.Click(li_visaPaymentType,"Payment type");
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist","VisaPaymentType",li_picklist);
		Thread.sleep(3000);
		ElementUtil.Click(btn_cancel, "Cancel button");
		Thread.sleep(2000);
	}
}
