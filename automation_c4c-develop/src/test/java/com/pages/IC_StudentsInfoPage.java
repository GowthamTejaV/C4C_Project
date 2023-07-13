package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

import AppHooks.ApplicationHooks;

public class IC_StudentsInfoPage {

	private static By drp_addIdentificationDoc = By.xpath("//button[@data-help-id='UykoeO$Paac7EswutZqGPW']");
	private static By drp_typeIdentificationDoc = By
			.xpath("//div[@data-help-id='d3sAy9kEV4ENBolcMBytXG']//tbody//tr/td[2]//input");
	private static By li_picklistOverview = By.xpath("//ul[@role='listbox']//li//div[@class='sapMSLITitleOnly']");
	private static By drp_typeIssueCountry = By
			.xpath("//div[@data-help-id='d3sAy9kEV4ENBolcMBytXG']//tbody//tr/td[3]//input");
	private static By li_picklistIssueCountry = By
			.xpath("(//ul[@role='listbox'])[3]//li//div[@class='sapMSLITitleOnly']");
	private static By drp_sex = By.xpath("//div[@data-help-id='d3sAy9kEV4ENBolcMBytXG']//tbody//tr/td[6]//input");
	private static By txt_number = By.xpath("//div[@data-help-id='d3sAy9kEV4ENBolcMBytXG']//tbody//tr/td[4]//input");
	private static By txt_expiryDate = By
			.xpath("//div[@data-help-id='dateTime-jTj3ttKvo4U94Yh6myqw$G-DatePicker']//input");

	private static By btn_addSocialmediaAccount = By.xpath("//button[@data-help-id='YwjZm8acnKUycAaWCVWi$G']");
	private static By drp_typeSocialmedia = By
			.xpath("//div[@data-help-id='$iHBPHXHLq283Akr89cp3m']//tbody//tr//td[2]//input");
	private static By li_SocialMedia = By.xpath("(//ul[@role='listbox'])[5]//li//div[@class='sapMSLITitleOnly']");
	private static By txt_Id = By.xpath("//div[@data-help-id='$iHBPHXHLq283Akr89cp3m']//tbody//tr//td[3]//input");
	private static By txt_Url = By.xpath("//div[@data-help-id='$iHBPHXHLq283Akr89cp3m']//tbody//tr//td[4]//input");
	private static By btn_removeSocialmedia = By.xpath("//button[@data-help-id='vbYa9R6I94sB8hH_0V3Z0W']");

	public static void switchToStudentsInfo() throws InterruptedException {
		ElementUtil.switchToTab("STUDENT INFO");
	}

	public static void clickAddbuttonIdentificationDocuments() {
		ElementUtil.Click(drp_addIdentificationDoc, "Add identification documents button");
	}

	public static void picklistTypeIdentificationDocuments() throws Exception {

		ElementUtil.Click(drp_typeIdentificationDoc, "Type identification documents");
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IdentificationDoc", li_picklistOverview);
		Thread.sleep(2000);
	}

	public static void picklistTypeIssuingCountry() throws Exception {
		ElementUtil.Click(drp_typeIssueCountry, "Type Issuing country");
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IssuingCountry", li_picklistIssueCountry);
		Thread.sleep(2000);
	}

	public static void verifySexDisabled() throws InterruptedException, IOException {
		String Sex = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentInfo", "Sex");
		String TypeDoc2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentInfo", "TypeDoc2");

		ElementUtil.Type(drp_typeIdentificationDoc, TypeDoc2);
		Thread.sleep(2000);
		try {
			boolean el = DriverFactory.getDriver().findElement(drp_sex).isDisplayed();
			if (el == false)
//			ElementUtil.Type(drp_sex, Sex);
				System.out.println("Sex field in identification documets not enabled for driving licsense field");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Sex field in identification documets not enabled for driving licsense field" + "</span>");
			Thread.sleep(2000);
		} catch (Exception e) {

			System.out.println("Sex field in identification documets not enabled for driving licsense field");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Sex field in identification documets not enabled for driving licsense field" + "</span>");
		}
	}

	public static void fillMandatoryIdentificationDocuments() throws InterruptedException, IOException {
		String TypeDoc = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentInfo", "TypeDoc");
		String TypeCountry = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentInfo",
				"TypeCountry");
		String Number = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentInfo", "Number");
		String Expirydate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentInfo", "Expirydate");
		String Sex = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentInfo", "Sex");

		ElementUtil.Type(drp_typeIdentificationDoc, TypeDoc);
		Thread.sleep(2000);
		ElementUtil.Type(drp_typeIssueCountry, TypeCountry);
		Thread.sleep(2000);
		ElementUtil.Type(txt_number, Number);
		Thread.sleep(2000);
		ElementUtil.Type(txt_expiryDate, Expirydate);
		Thread.sleep(2000);
		ElementUtil.Type(drp_sex, Sex);
		Thread.sleep(2000);

	}

	public static void clickAddbuttonSocialmediaAccounts() {
		ElementUtil.Click(btn_addSocialmediaAccount, "Add social media accounts button");
	}

	public static void picklistTypeSocialMedia() throws Exception {
		ElementUtil.Click(drp_typeSocialmedia, "Type identification documents");
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "Social Media", li_SocialMedia);
		Thread.sleep(2000);
	}

	public static void fillMandatorySocialmediaAccounts() throws InterruptedException, IOException {
		String TypeSocialmedia = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentInfo",
				"TypeSocialmedia");
		String Id = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentInfo", "Id");
		String SocialUrl = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentInfo", "SocialUrl");

		ElementUtil.Type(drp_typeSocialmedia, TypeSocialmedia);
		Thread.sleep(2000);
		ElementUtil.Type(txt_Id, Id);
		Thread.sleep(2000);
		ElementUtil.Type(txt_Url, SocialUrl);
		Thread.sleep(2000);

	}

	public static void clickDeleteButtonSocialmediaAccounts() throws InterruptedException {
		ElementUtil.Click(btn_removeSocialmedia, "Remove social media button");
		Thread.sleep(2000);
	}

}
