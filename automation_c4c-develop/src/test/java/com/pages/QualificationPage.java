package com.pages;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;

public class QualificationPage {
	private static By btn_edit = By
			.xpath("//button[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");
	private static By drp_studyPrefer = By.xpath("//div[@title='My Preferred Study Level Is']//input[1]");
	private static By drp_qualification = By.xpath("//span[@title='Qualification']//following::input[1]");
	private static By txt_plandate = By.xpath("//span[@title='Study Plan Date']//following::input[1]");
	private static By drp_englishTest = By.xpath("//div[@data-help-id='f65cf5852ade92da0f2836ef5562c8c8']");
	private static By btn_globalSave = By.xpath("//bdi[text()='Save']");
	private static By btn_qualificationTab = By.xpath("//div[@role='tab']//div[text()='QUALIFICATION']");

	ApplicationPageUtil appUtil = new ApplicationPageUtil();

//use
	public void switchToQualificationTab() throws InterruptedException {
		try {
			Actions action = new Actions(DriverFactory.getDriver());
			WebElement ele = DriverFactory.getDriver().findElement(btn_qualificationTab);
			action.moveToElement(ele).click().build().perform();

		} catch (Exception e) {
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			ElementUtil.switchToTab("QUALIFICATION");
			Thread.sleep(2000);
		}

	}

//use
	public void editQualification() throws InterruptedException {
		ElementUtil.waitForElementClickable(btn_edit);
		Thread.sleep(3000);
		ElementUtil.Click(btn_edit, "Edit button");
	}

//use
	public void addQualification() throws InterruptedException, IOException {

		String PlanToStudy = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Qualification",
				"PlanToStudy");
		String StudyLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Qualification",
				"StudyLevel");
		String QualificationLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Qualification",
				"QualificationLevel");
		try {
			ElementUtil.Type(txt_plandate, PlanToStudy);
			ElementUtil.waitForElementClickable(drp_studyPrefer);
			Thread.sleep(2000);

			ElementUtil.Type(drp_studyPrefer, StudyLevel);
			ElementUtil.waitForElementClickable(drp_qualification);
			Thread.sleep(2000);

			ElementUtil.Type(drp_qualification, QualificationLevel);
			Thread.sleep(2000);

		} catch (StaleElementReferenceException e) {
			ElementUtil.Type(drp_studyPrefer, StudyLevel);
			Thread.sleep(2000);

		}

	}

//use
	public void englishTest() throws InterruptedException, IOException {
		ElementUtil.Type(drp_englishTest, "Not yet decided");
		Thread.sleep(2000);
		ElementUtil.Click(btn_globalSave, "Save button");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();

	}

}
