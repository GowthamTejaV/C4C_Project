package com.pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;

public class CourseSelectionPage {
	// private static By
	// lbl_CourseSelectionTab=By.xpath("//div[@data-help-id='NAVIGATIONITEMID_03908de5a460475999419543ee3355cb']//div[1]");
	private static By btn_addCourse = By.xpath("//button[@data-help-id='sow6_816a4EQYTEM_HPQ00']");
	private static By lbl_firstRecord = By.xpath("//div[@data-help-id='N5ux298jYKAe8js1GAnfcW']//tbody//tr[1]//td[2]");
	private static By lbl_firstRecordAdd = By
			.xpath("//div[@data-help-id='N5ux298jYKAe8js1GAnfcW']//tbody//tr[1]//td[2]//button");
	private static By btn_searchIcon = By.xpath("//button[@data-help-id='vPCZpGIoqqo7EG0TXqd3Jm-searchButton']");
	private static By txt_courseName = By.xpath("//div[@data-help-id='vPCZpGIoqqo7EG0TXqd3Jm-searchField']//input[1]");
	private static By btn_Close = By.xpath("//button[@data-help-id='xcesVfDOf4cC2njepdYD_W']");
	private static By btn_save = By.xpath("//button[@data-help-id='ri5eGNT8EK_NrSYPtZASbW']");
	static By lbl_courseList = By.xpath("//div[@data-help-id='lYH03emm34wK9U1xEIaZsW']//tbody/tr/td[3]");
	private static By btn_cancelCourse = By.xpath("//span[@data-help-id='wWeJknt_Sq67l4D8jc04Bm']");
	private static By btn_updateCourse = By.xpath("//span[@data-help-id='NAmTDDh$f4k7mkdomqoC6G']");
	private static By lbl_getMessage = By.xpath("//span[@data-help-id='messageBar-headerMessage']");
//	private static By drp_reasonForCancel = By.xpath(
//			"(//div[@data-help-id='$MN8DN4Q4KkY9XU9RCtZ90']//div[contains(@id,'dropdownlist')]//div[@role='combobox'])[6]");
	private static By drp_reasonForCancel = By.xpath("(//ul[@role='listbox'])[2]//li");
	private static By txt_resonForCancel = By
			.xpath("//div[@data-help-id='$MN8DN4Q4KkY9XU9RCtZ90']//tbody//tr[1]//td[17]//input");
	private static By btn_globalEdit = By
			.xpath("//button[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");
	private static By btn_editCourse = By
			.xpath("//button[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");
	// 67272
	private By institutionStudentRefNumber = By.xpath(".//*[@data-help-id='AOjhRqVdfq2$l$g1OyIYJG']//input");
	private static By btn_mouseMoveEnglish = By.xpath("//bdi[text()='English Proficiency Test']//following::div[1]");
	private static By btn_englishTest = By.xpath("//bdi[text()='English Proficiency Test']//following::input");

	private static By btn_switchCourse=By.xpath("(//span[@data-help-id='uAhyZMCc9KwlZcLUlaaYwW'])[2]");

	// 627228
	private By annualTuitionFee = By.xpath(".//*[@data-help-id='fQoJcwjM6qE9VjBvH4U0eG']//input");
	private static By btn_courseSelectionTab = By.xpath("//div[@role='tab']//div[text()='COURSE SELECTION']");

	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	// use
	public void switchToCourseSelectionTab() throws InterruptedException {
		try {
			Actions action = new Actions(DriverFactory.getDriver());
			WebElement ele = DriverFactory.getDriver().findElement(btn_courseSelectionTab);
			action.moveToElement(ele).click().build().perform();

		} catch (Exception e) {
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			ElementUtil.switchToTab("COURSE SELECTION");
			Thread.sleep(2000);
		}
	}

	// use
	public void clickAddCourseButton() throws InterruptedException {
		ElementUtil.waitForElementClickable(btn_addCourse);
		Thread.sleep(5000);
		ElementUtil.Click(btn_addCourse, "Add course button");
	}

	public void addCourseEBS() throws InterruptedException, IOException {
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(3000);
		searchCourse();
		ElementUtil.doubleClick(lbl_firstRecordAdd);
		Thread.sleep(5000);
		ElementUtil.Click(btn_Close, "Close button");

	}

	// use
	public void addCourseNonIDP() throws InterruptedException, IOException {
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(3000);
		searchCourseNonIDP();
		ElementUtil.doubleClick(lbl_firstRecordAdd);
		Thread.sleep(5000);
		ElementUtil.Click(btn_Close, "Close button");

	}

	public void searchCourse() throws InterruptedException, IOException {
		ElementUtil.Click(btn_searchIcon, "Search icon");
		ElementUtil.Type(txt_courseName, "2029761");
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(5000);
	}

	public void searchCourse_UKdestination() throws InterruptedException, IOException {
		String NonIDPCourseUK = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"NonIDPCourseUK");

		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(btn_searchIcon);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(2000);
		ElementUtil.Click(btn_searchIcon, "Search icon");
		Thread.sleep(2000);
		ElementUtil.Type(txt_courseName, NonIDPCourseUK);
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(5000);
		ElementUtil.doubleClick(lbl_firstRecordAdd);
		Thread.sleep(5000);
		ElementUtil.Click(lbl_firstRecordAdd, "Add first record");
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(5000);
		ElementUtil.Click(btn_Close, "Close button");
		ElementUtil.waitForPageLoad();
	}

	public void searchCourseNonIDP() throws InterruptedException, IOException {
		String NonIDPCourseTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"NonIDPCourseTrain");

		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(btn_searchIcon);
		Thread.sleep(2000);
		ElementUtil.Click(btn_searchIcon, "Search icon");
		Thread.sleep(2000);
		ElementUtil.Type(txt_courseName, NonIDPCourseTrain);
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(5000);
	}
	
	//with out chnannel partner
	public static void courseIDPdirect() throws InterruptedException, IOException 
	{
		String IDPDirectCourseTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"IDPDirectCourseTrain");

		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(btn_searchIcon);
		Thread.sleep(2000);
		ElementUtil.Click(btn_searchIcon,"Search icon");
		Thread.sleep(2000);
		ElementUtil.Type(txt_courseName, IDPDirectCourseTrain);
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(5000);
		ElementUtil.doubleClick(lbl_firstRecordAdd);
		Thread.sleep(5000);
//		ElementUtil.Click(lbl_firstRecordAdd,"Add first record");
//		ElementUtil.waitForElementClickable(lbl_firstRecord);
//		Thread.sleep(5000);
		ElementUtil.Click(btn_Close,"Close button");
		ElementUtil.waitForPageLoad();
	}


	
	public static void courseIDPdirectChannelPartner() throws InterruptedException, IOException {
		String IDPDirectCourseTrainCPP = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"CourseSelection", "IDPDirectCourseTrainCPP");

		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(btn_searchIcon);
		Thread.sleep(2000);
		ElementUtil.Click(btn_searchIcon, "Search icon");
		Thread.sleep(2000);
		ElementUtil.Type(txt_courseName, IDPDirectCourseTrainCPP);
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(5000);
		ElementUtil.doubleClick(lbl_firstRecordAdd);
		Thread.sleep(5000);
		ElementUtil.Click(btn_Close, "Close button");
		ElementUtil.waitForPageLoad();
		try {
			ElementUtil.Click(btn_Close, "Close button");
		} catch (Exception e) {

		}
	}

	public static void standaloneCourseManual() throws InterruptedException, IOException {
		String standaloneUK = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"standaloneUK");

		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(btn_searchIcon);
		Thread.sleep(2000);
		ElementUtil.Click(btn_searchIcon, "Search icon");
		Thread.sleep(2000);
		ElementUtil.Type(txt_courseName, standaloneUK);
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(5000);
		ElementUtil.doubleClick(lbl_firstRecordAdd);
		Thread.sleep(5000);
		ElementUtil.Click(btn_Close, "Close button");
		ElementUtil.waitForPageLoad();
	}

	public static void courseNestedType(String type) throws InterruptedException, IOException {
		String NestedCourse1 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"NestedCourse1");
		String NestedCourse2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"NestedCourse2");

		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(btn_searchIcon);
		Thread.sleep(2000);
		ElementUtil.Click(btn_searchIcon, "Search icon");
		Thread.sleep(2000);
		if (type.equals("NO")) {
			ElementUtil.Type(txt_courseName, NestedCourse1);
		} else if (type.equals("YES")) {
			ElementUtil.Type(txt_courseName, NestedCourse2);
		}

		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(5000);
		ElementUtil.doubleClick(lbl_firstRecordAdd);
		Thread.sleep(5000);
		ElementUtil.Click(btn_searchIcon, "Search icon");
		Thread.sleep(2000);
		ElementUtil.Type(txt_courseName, NestedCourse2);
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(5000);
		ElementUtil.doubleClick(lbl_firstRecordAdd);
		Thread.sleep(5000);

		ElementUtil.Click(btn_Close, "Close button");
		ElementUtil.waitForPageLoad();
	}

	public void saveCourseSelection() {
		ElementUtil.Click(btn_save, "Save button");
	}

	public static void englishTest() throws InterruptedException, IOException {
		String EnglishTest = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"EnglishTest");

		ElementUtil.scrollToElement(btn_mouseMoveEnglish);
		Thread.sleep(2000);
		IC_CreationPage.enterdata_OnMouseOverField(btn_mouseMoveEnglish, btn_englishTest, EnglishTest);
		Thread.sleep(2000);
	}

	// use
	public void cancelCourse() throws InterruptedException {

		ElementUtil.Click(btn_cancelCourse, "Cancel course button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_globalEdit, "Edit button");
		Thread.sleep(2000);
	}

	// use
	public void reasonForCancel() throws InterruptedException, IOException {
		String ReasonForCancel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"ReasonForCancel");

		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(txt_resonForCancel);
		//ElementUtil.scrollToElement(txt_resonForCancel);
		Thread.sleep(2000);
		try {
			ElementUtil.scrollToTopOfPage();
			ElementUtil.scrollToTopOfPage();
			Thread.sleep(2000);
			ElementUtil.Click(drp_reasonForCancel, "Reason for cancel button");
			Thread.sleep(2000);
			ElementUtil.Type(txt_resonForCancel, ReasonForCancel);
			Thread.sleep(2000);
			

//			ElementUtil.Click(txt_resonForCancel, "Reason for cancel button");
//			Thread.sleep(2000);
//			List<WebElement> reasonList = DriverFactory.getDriver().findElements(drp_reasonForCancel);
//			Thread.sleep(2000);
//			reasonList.get(1).click();
		} catch (Exception e) {
//			ElementUtil.Click(drp_reasonForCancel, "Reason for cancel button");
//			Thread.sleep(2000);
			ElementUtil.Type(txt_resonForCancel, ReasonForCancel);
			Thread.sleep(2000);
		}

	}

	// use
	public void updateCourse() throws InterruptedException, IOException {
		String StudentRefNumber = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"StudentRefNumber");

		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(institutionStudentRefNumber);
		Thread.sleep(2000);
		try {
			ElementUtil.doubleClick(institutionStudentRefNumber);
			Thread.sleep(1000);
			ElementUtil.Type(institutionStudentRefNumber, StudentRefNumber);
			Thread.sleep(2000);
		} catch (IllegalArgumentException e) {
			ElementUtil.doubleClick(institutionStudentRefNumber);
			Thread.sleep(1000);
			ElementUtil.Type(institutionStudentRefNumber, StudentRefNumber);
			Thread.sleep(2000);
		}

	}

	public void ClickEditCourse() throws InterruptedException {
		ElementUtil.waitForElementClickable(btn_editCourse);
		Thread.sleep(2000);
		ElementUtil.Click(btn_editCourse, "Edit button");
	}

	// use
	public void updateCourseFlag() throws InterruptedException {

		ElementUtil.Click(btn_updateCourse, "Update course button");
		Thread.sleep(2000);
	}

	public void getMessage() {
		String message = DriverFactory.getDriver().findElement(lbl_getMessage).getAttribute("value");
		System.out.println(message);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + message + "</span>");

	}
	public static void switchCourse() throws InterruptedException 
	{
		ElementUtil.scrollToElement(btn_switchCourse);
		Thread.sleep(2000);
		ElementUtil.Click(btn_switchCourse,"Switch courses");
		Thread.sleep(2000);
	}


}
