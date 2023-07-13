package com.pages;

import java.io.IOException;


import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class OpportunitiesPage {
	public static String status = "";
	public static String probability = "";
	public static String opportunityStatus = "";
    public By getApplicationStatus=By.xpath(".//span[@data-help-id='I$7VoidAFasTd3U56UcpvG']/following-sibling::div//span[@title]");
	private static By lbl_oppurtunityId = By
			.xpath("//span[@data-help-id='pyvkyAK9S4IcyKPmS_87LG']//following::div[1]/span[1]");
	private static By tbl_list = By.xpath("//div[@data-help-id='FECeGdOtwao7pKroKA1Cg0']//tbody/tr[1]/td[6]");
	private static By tbl_listTrain = By.xpath("//div[@data-help-id='FECeGdOtwao7pKroKA1Cg0']//tbody/tr[1]/td[6]");
	private static By btn_Search = By.xpath("//button[@data-help-id='sMpEU5d3YaMoQY55y2wbR0-searchButton']");
	private static By txt_Search = By.xpath("//div[@data-help-id='sMpEU5d3YaMoQY55y2wbR0-searchField']//input");
	private static By btn_Edit = By
			.xpath("//button[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");
	private static By txt_applicationStatus = By.xpath("(//div[@data-help-id='0Pr6R5XAkK2FxUIQp1ZzZG']//span)[1]");
	private static By txt_institutePreference = By
			.xpath("//div[@data-help-id='647963aac9714ef1a265952d4c5efad5']//input");
	private static By btn_More = By.xpath("//button[@data-help-id='button-ObjectDetail-MoreOrLess']");
	private static By txt_serviceLevel = By.xpath("//div[@data-help-id='862d5614d8327b6b36401e6e62e426bc']//input");
	private static By btn_save = By.xpath("//bdi[text()='Save']");
	private static By drp_applicationStatus=By.xpath("//div[@data-help-id='0Pr6R5XAkK2FxUIQp1ZzZG']//input");
	private static By txt_probablity=By.xpath("(//div[@data-help-id='YyLIDgqGr4oFHUihGyn_r0']//span)[1]");
	private static By drp_withdrawnReason=By.xpath("//div[@data-help-id='949a13c32fb32c6a5ab85acdee7eafa8']//input");
	private static By btn_more=By.xpath("//bdi[text()='More']");
	private static By txt_opportunityStatus=By.xpath("(//div[@data-help-id='D2IybYuRC4QDqB2f6330rm']//span)[1]");
	private static By btn_opportunityAero=By.xpath("(//span[text()='My Opportunities']//following::span)[2]");
	private static By drp_AllOpportunity=By.xpath("(//ul//li)[1]");
	
	String oppurtunityId = "";

	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	// use
	public void saveOpportunityId() {
		oppurtunityId = DriverFactory.getDriver().findElement(lbl_oppurtunityId).getText();
		ConfigReader.writeToApplicationPropertie("OpportunityID", oppurtunityId);
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:green;font-weight:bold;'>" + "Opportunity id:" + oppurtunityId + "</span>");
	}

//use
	public void searchOpportunityId() throws InterruptedException, IOException {
		ElementUtil.Click(btn_Search, "Search button");
		Thread.sleep(1000);
		ElementUtil.Type(txt_Search, ConfigReader.getApplicationPropertie("OpportunityID"));
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(tbl_list);
		Thread.sleep(2000);
	}

	// use
	public void selectFirstRecord() throws InterruptedException {
		ElementUtil.Click(tbl_list, "Table list");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	// use
	public void selectFirstRecordTrain() throws InterruptedException {
		ElementUtil.Click(tbl_listTrain, "Table list");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public void clickEditOpportunity() throws InterruptedException {
		ElementUtil.Click(btn_Edit, "Edit button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public void applicationSubmitted() throws InterruptedException, IOException {
		ElementUtil.Type(txt_applicationStatus, "Application Submitted");
		Thread.sleep(2000);
		ElementUtil.Type(txt_institutePreference, "1st Preference");
		Thread.sleep(2000);
		ElementUtil.Click(btn_More, "More button");
		Thread.sleep(2000);
		ElementUtil.Type(txt_serviceLevel, "Full");
		Thread.sleep(2000);
		ElementUtil.Click(btn_save, "Save button");
		Thread.sleep(2000);
	}

	public static void verifyProbabilityOfApplicationPreparation() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);

		ElementUtil.Click(btn_Edit, "Edit button");
		Thread.sleep(2000);

		ElementUtil.Click(btn_more, "More button");
		Thread.sleep(2000);

		ElementUtil.Click(btn_save, "Save button");
		Thread.sleep(2000);

		try {
			ElementUtil.Click(btn_save, "Save button");
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		ElementUtil.scrollToElement(txt_applicationStatus);
		Thread.sleep(5000);

		status = DriverFactory.getDriver().findElement(txt_applicationStatus).getText();
		Thread.sleep(1000);
		if (status.equals("Application Preparation")) {
			probability = DriverFactory.getDriver().findElement(txt_probablity).getText();
			Thread.sleep(1000);
			opportunityStatus = DriverFactory.getDriver().findElement(txt_opportunityStatus).getText();
			Thread.sleep(1000);
			if (probability.equals("10%") && opportunityStatus.equals("Open")) {
				System.out.println("Application Status :" + status);
				System.out.println("Application probability :" + probability);
				System.out.println("Opportunity Status probability :" + opportunityStatus);

				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue;font-weight:bold;'>" + "Application Status :" + status + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Application probability :" + probability + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Opportunity Status probability :" + opportunityStatus + "</span>");
			} else {
				Assert.assertFalse(true);
			}
		}

	}

	public static void verifyApplicationSubmittedStatus() throws InterruptedException, IOException {

		ElementUtil.Type(drp_applicationStatus, "Application Submitted");
		Thread.sleep(2000);

		ElementUtil.Click(btn_save, "Save button");
		Thread.sleep(2000);

		try {
			ElementUtil.Click(btn_save, "Save button");
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		status = DriverFactory.getDriver().findElement(txt_applicationStatus).getText();
		Thread.sleep(1000);
		if (status.equals("Application Submitted")) {
			probability = DriverFactory.getDriver().findElement(txt_probablity).getText();
			Thread.sleep(1000);
			opportunityStatus = DriverFactory.getDriver().findElement(txt_opportunityStatus).getText();
			Thread.sleep(1000);
			if (probability.equals("30%") && opportunityStatus.equals("In Progress")) {
				System.out.println("Application Status :" + status);
				System.out.println("Application probability :" + probability);
				System.out.println("Opportunity Status probability :" + opportunityStatus);

				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue;font-weight:bold;'>" + "Application Status :" + status + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Application probability :" + probability + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Opportunity Status probability :" + opportunityStatus + "</span>");
			} else {
				Assert.assertFalse(true);
			}
		}

	}

	public static void verifyApplicationWithdrawnStatus() throws InterruptedException, IOException {
		ElementUtil.Type(drp_applicationStatus, "Withdrawn");
		Thread.sleep(2000);

		ElementUtil.Type(drp_withdrawnReason, "Family/personal reasons");
		Thread.sleep(2000);

		ElementUtil.Click(btn_save, "Save button");
		Thread.sleep(5000);
		try {
			ElementUtil.Click(btn_save, "Save button");
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		status = DriverFactory.getDriver().findElement(txt_applicationStatus).getText();
		Thread.sleep(1000);
		if (status.equals("Withdrawn")) {
			probability = DriverFactory.getDriver().findElement(txt_probablity).getText();
			Thread.sleep(1000);
			opportunityStatus = DriverFactory.getDriver().findElement(txt_opportunityStatus).getText();
			Thread.sleep(1000);
			if (probability.equals("0%") && opportunityStatus.equals("Lost")) {
				System.out.println("Application Status :" + status);
				System.out.println("Application probability :" + probability);
				System.out.println("Opportunity Status probability :" + opportunityStatus);

				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue;font-weight:bold;'>" + "Application Status :" + status + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Application probability :" + probability + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Opportunity Status probability :" + opportunityStatus + "</span>");
			} else {
				Assert.assertFalse(true);
			}
		}

	}

	public static void verifyApplicationVisaRejectedStatus() throws InterruptedException, IOException {
		ElementUtil.Type(drp_applicationStatus, "Application Submitted");
		Thread.sleep(2000);
		ElementUtil.Type(drp_applicationStatus, "Visa Rejected");
		Thread.sleep(2000);

		ElementUtil.Click(btn_save, "Save button");
		Thread.sleep(5000);
		try {
			ElementUtil.Click(btn_save, "Save button");
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		status = DriverFactory.getDriver().findElement(txt_applicationStatus).getText();
		Thread.sleep(1000);
		if (status.equals("Visa Rejected")) {
			probability = DriverFactory.getDriver().findElement(txt_probablity).getText();
			Thread.sleep(1000);
			opportunityStatus = DriverFactory.getDriver().findElement(txt_opportunityStatus).getText();
			Thread.sleep(1000);
			if (probability.equals("0%") && opportunityStatus.equals("Lost")) {
				System.out.println("Application Status :" + status);
				System.out.println("Application probability :" + probability);
				System.out.println("Opportunity Status probability :" + opportunityStatus);

				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue;font-weight:bold;'>" + "Application Status :" + status + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Application probability :" + probability + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Opportunity Status probability :" + opportunityStatus + "</span>");
			} else {
				Assert.assertFalse(true);
			}
		}

	}

	public static void verifyApplicationAcknowledgedStatus() throws InterruptedException, IOException {
		ElementUtil.Type(drp_applicationStatus, "Acknowledged / Info Pending");
		Thread.sleep(2000);

		ElementUtil.Click(btn_save, "Save button");
		Thread.sleep(5000);
		try {
			ElementUtil.Click(btn_save, "Save button");
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		status = DriverFactory.getDriver().findElement(txt_applicationStatus).getText();
		Thread.sleep(1000);
		if (status.equals("Acknowledged / Info Pending")) {
			probability = DriverFactory.getDriver().findElement(txt_probablity).getText();
			Thread.sleep(1000);
			opportunityStatus = DriverFactory.getDriver().findElement(txt_opportunityStatus).getText();
			Thread.sleep(1000);
			if (probability.equals("40%") && opportunityStatus.equals("In Progress")) {
				System.out.println("Application Status :" + status);
				System.out.println("Application probability :" + probability);
				System.out.println("Opportunity Status probability :" + opportunityStatus);

				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue;font-weight:bold;'>" + "Application Status :" + status + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Application probability :" + probability + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Opportunity Status probability :" + opportunityStatus + "</span>");
			} else {
				Assert.assertFalse(true);
			}
		}
	}

	public static void verifyApplicationReviewStatus() throws InterruptedException, IOException {
		ElementUtil.Type(drp_applicationStatus, "Review/Skills Assess only");
		Thread.sleep(2000);
		ElementUtil.Click(btn_save, "Save button");
		Thread.sleep(5000);
		try {
			ElementUtil.Click(btn_save, "Save button");
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		status = DriverFactory.getDriver().findElement(txt_applicationStatus).getText();
		Thread.sleep(1000);
		if (status.equals("Review/Skills Assess only")) {
			probability = DriverFactory.getDriver().findElement(txt_probablity).getText();
			Thread.sleep(1000);
			opportunityStatus = DriverFactory.getDriver().findElement(txt_opportunityStatus).getText();
			Thread.sleep(1000);
			if (probability.equals("100%") && opportunityStatus.equals("Won")) {
				System.out.println("Application Status :" + status);
				System.out.println("Application probability :" + probability);
				System.out.println("Opportunity Status probability :" + opportunityStatus);

				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue;font-weight:bold;'>" + "Application Status :" + status + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Application probability :" + probability + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Opportunity Status probability :" + opportunityStatus + "</span>");
			} else {
				Assert.assertFalse(true);
			}
		}
	}

	public static void verifyApplicatonApprovedStatus() throws InterruptedException, IOException {
		ElementUtil.Type(drp_applicationStatus, "Visa Approved");
		Thread.sleep(2000);
		ElementUtil.Click(btn_save, "Save button");
		Thread.sleep(5000);
		try {
			ElementUtil.Click(btn_save, "Save button");
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		status = DriverFactory.getDriver().findElement(txt_applicationStatus).getText();
		Thread.sleep(1000);

		if (status.equals("Visa Approved")) {
			probability = DriverFactory.getDriver().findElement(txt_probablity).getText();
			Thread.sleep(1000);
			opportunityStatus = DriverFactory.getDriver().findElement(txt_opportunityStatus).getText();
			Thread.sleep(1000);
			if (probability.equals("100%") && opportunityStatus.equals("Won")) {
				System.out.println("Application Status :" + status);
				System.out.println("Application probability :" + probability);
				System.out.println("Opportunity Status probability :" + opportunityStatus);

				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue;font-weight:bold;'>" + "Application Status :" + status + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Application probability :" + probability + "</span>");
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Opportunity Status probability :" + opportunityStatus + "</span>");

			} else {
				Assert.assertFalse(true);
			}
		}
	}

	public static void clickMore() throws InterruptedException {
		ElementUtil.Click(btn_More, "More button");
		Thread.sleep(2000);
	}

	public static void changeToAllOpportunity() throws InterruptedException {
		ElementUtil.Click(btn_opportunityAero, "Opportunity filter");
		Thread.sleep(2000);
		ElementUtil.Click(drp_AllOpportunity, "All Opportunity dropdown");
		Thread.sleep(2000);
	}

	public String getApplicationStatus() {
		ElementUtil.scrollToTopOfPage();
		return ElementUtil.getText(getApplicationStatus);
	}

}
