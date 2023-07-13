package com.pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;

public class Ic_OfferInPrinciplesPage {
	private static By oipPageTab=By.xpath(".//*[@data-help-id='485e4d71c3e4607c978e8cc43b736360']");
	private By OIPStatus = By.xpath(".//td//span[text()='OIP Status']/following-sibling::span");
	private static By btn_editOIP = By.xpath("//span[text()=' edit_note ']");
	private static By btn_selectOIPCountry = By.xpath("(//mat-select[@role='combobox'])[1]");
	private static By list_selectOIPCountry = By
			.xpath("//div[@role='listbox']//mat-option/span[contains(text(),'India')]");
	private static By btn_highQualification = By.xpath("(//mat-select[@role='combobox'])[2]");
	private static By btn_next = By.xpath("//button[@type='submit']");
	private static By list_highQualification = By
			.xpath("//div[@role='listbox']//mat-option/span[text()=\" Bachelor's Degree\"]");
	private static By txt_titleOfCourse = By
			.xpath("//input[contains(@data-placeholder,'What is the title of your course?')]");
	private static By txt_subjectMajor = By
			.xpath("//input[contains(@data-placeholder,'What subject did you major in?')]");
	private static By list_subjectMajor = By
			.xpath("//div[@role='listbox']//mat-option/span[contains(text(),'Computer Engineering')]");
	private static By btn_statusQualification = By.xpath("(//mat-select[@role='combobox'])[3]");
	private static By list_statusQualification = By
			.xpath("//div[@role='listbox']//mat-option/span[contains(text(),'Completed')]");
	private static By btn_durationQualification = By.xpath("(//mat-select[@role='combobox'])[4]");
	private static By list_durationQualification = By
			.xpath("//div[@role='listbox']//mat-option/span[contains(text(),'4 Years')]");
	private static By txt_courseStartDate = By
			.xpath("//input[contains(@data-placeholder,'When did your course start?')]");
	private static By txt_courseEndDate = By.xpath("//input[contains(@data-placeholder,'do you intend to graduate?')]");
	private static By txt_instituteQualification = By
			.xpath("//input[contains(@data-placeholder,'Which institution did you gain your qualification from?')]");
	private static By list_instituteQualification = By.xpath(
			"//div[@role='listbox']//mat-option/span[contains(text(),'Anna University, Tirunelveli (Tamil Nadu)')]");
	private static By btn_languageTought = By.xpath("(//mat-select[@role='combobox'])[5]");
	private static By list_languageTought = By
			.xpath("//div[@role='listbox']//mat-option/span[contains(text(),'English')]");
	private static By btn_studyMode = By.xpath("(//mat-select[@role='combobox'])[6]");
	private static By list_studyMode = By
			.xpath("//div[@role='listbox']//mat-option/span[contains(text(),'On-campus')]");
	private static By btn_qualificationGrade = By.xpath("(//mat-select[@role='combobox'])[7]");
	private static By list_qualificationGrade = By
			.xpath("//div[@role='listbox']//mat-option/span[contains(text(),'Percentage')]");
	private static By txt_expectedResult = By.xpath("//input[contains(@data-placeholder,'expected result?')]");
	private static By btn_overAllPass = By
			.xpath("(//input[contains(@data-placeholder,'expected result?')]//following::mat-select)[1]");
	private static By list_overAllPass = By.xpath("//div[@role='listbox']//mat-option/span[contains(text(),'30')]");
	private static By txt_howManyModule = By.xpath("(//input[contains(@data-placeholder,'2 years of your studies')])");
	private static By txt_howManyModuleOIP1 = By.xpath("(//input[contains(@data-placeholder,'fail during')])[1]");
	private static By txt_howManyModuleOIP2 = By.xpath("(//input[contains(@data-placeholder,'fail during')])[2]");
	private static By txt_failStudies = By.xpath("//input[contains(@data-placeholder,'fail during')]");
	private static By radio_honorsDegree = By
			.xpath("(//mat-label[text()=' Did you receive an honours degree?']//following::span[text()=' Yes '])[1]");
	private static By radio_creditTransfer = By
			.xpath("(//mat-label[text()=' Did you receive an honours degree?']//following::span[text()=' Yes '])[2]");
	private static By btn_saveNextAcademic = By.xpath("(//span[text()='Save and Next'])[1]");
	private static By btn_saveNextEnglishTest = By.xpath("(//span[text()='Save and Next'])[2]");
	private static By btn_saveNextAdmissionTest = By.xpath("(//span[text()='Save and Next'])[3]");
	private static By btn_NextAcademic = By.xpath("(//button[@type='submit']//following::span[text()='Next'])[1]");
	private static By btn_NextEnglish = By.xpath("(//button[@type='submit']//following::span[text()='Next'])[2]");
	private static By btn_NextAdmission = By.xpath("(//button[@type='submit']//following::span[text()='Next'])[3]");
	private static By drp_typeOfCourse = By.xpath("(//mat-select[@role='combobox'])[8]");
	private static By drp_typeOfCourseOIP = By.xpath("(//mat-select[@role='combobox'])[8]");
	private static By list_typeOfCourse = By
			.xpath("//div[@role='listbox']//mat-option/span[contains(text(),'IELTS Academic')]");
	private static By txt_whensitTest = By.xpath("//input[@data-placeholder='When did you sit your test?']");
	private static By txt_overallScore = By.xpath("//input[@data-placeholder='What was your overall score?']");
	private static By txt_listeningScore = By.xpath("//input[@data-placeholder='What was your listening score?']");
	private static By txt_readingScore = By.xpath("//input[@data-placeholder='What was your reading score?']");
	private static By txt_writtingScore = By.xpath("//input[@data-placeholder='What was your writing score?']");
	private static By txt_speakingScore = By.xpath("//input[@data-placeholder='What was your speaking score?']");

	private static By drp_admissionTest = By.xpath("(//mat-select[@role='combobox'])[9]");
	private static By drp_admissionTestOIP = By.xpath("(//mat-select[@role='combobox'])[9]");
	private static By list_admissionTest = By.xpath("//div[@role='listbox']//mat-option/span[contains(text(),'GRE')]");
	private static By txt_sitForAdmissionTest = By
			.xpath("(//input[@data-placeholder='When did you sit your test?'])[2]");
	private static By txt_averageAdmissionScore = By.xpath("//input[@data-placeholder='What was your average score?']");
	private static By txt_verbalAdmissionScore = By
			.xpath("//input[@data-placeholder='What was your Verbal Reasoning score?']");
	private static By txt_quantitativeAdmissionScore = By
			.xpath("//input[@data-placeholder='What was your Quantitative Reasoning score?']");
	private static By txt_analyticalAdmissionScore = By
			.xpath("//input[@data-placeholder='What was your Analytical Writing Measure score?']");

	private static By btn_submitStudent = By
			.xpath("//h3[text()=' Admission test']//following::span[text()='Submit']/..");
	private static By list_OIPcourse = By.xpath("//div[@id='cdk-accordion-child-1']//ul//li[1]");
	private static By btn_refresh = By.xpath("//button[@data-help-id='ShhKB9IH44M8cgwdZYyT4W']");

	private static By drp_startDateCourse = By.xpath("//mat-select[@formcontrolname='oipDropdown']");
	private static By list_startDateCourse = By.xpath("(//div[@role='listbox']//mat-option/span)[1]");
	private static By btn_nextStartDate = By.xpath("//span[text()='Next']");

	private static By btn_confirmToggle = By.xpath("//div[@class='tgl_chkbx']//label");
	private static By btn_radioSubmission = By.xpath("(//input[@type='radio'])[1]");
	private static By btn_radioSubmissionRE = By.xpath("(//input[@type='radio'])[5]");
	private static By btn_checkAcceptTerms1 = By.xpath("//input[@id='mat-checkbox-1-input']");
	private static By btn_checkAcceptTerms2 = By.xpath("//input[@id='mat-checkbox-2-input']");
	private static By btn_checkAcceptTerms1RE = By
			.xpath("(//div[text()='Student acceptance']//following::input[@type='checkbox']/..)[1]");
	private static By btn_checkAcceptTerms2RE = By
			.xpath("(//div[text()='Student acceptance']//following::input[@type='checkbox']/..)[2]");
	private static By btn_submitOIP = By.xpath("//span[text()='Submit']");
	private static By lbl_successMessage = By.xpath("//h3[text()='Congratulations!']");
	private static By btn_close = By.xpath("//span[text()=' close ']");

	private static By btn_verifyOIP = By.xpath("//span[contains(text(),'Verify')]");
	private static By btn_radioOIPstatus = By.xpath("//input[@id='mat-radio-2-input']");
	private static By btn_finalSave = By.xpath("//span[text()='Save']");
	private static By btn_editAcademic = By.xpath("((//h3[text()='Academic'])//following::span[text()='Edit'])[1]");

	private static By lbl_qualification = By.xpath("(//span[text()='Qualification title']//following::span)[1]");
	private static By lbl_expectedResult = By.xpath("(//span[text()='Final grade achieved']//following::span)[1]");
	private static By lbl_FailtStatus = By
			.xpath("(//span[text()='Number of backlogs or retakes']//following::span)[1]");
	private static By lbl_Modules = By.xpath("(//span[text()='Applicable grade']//following::span)[1]");
	private static By btn_Close=By.xpath("//span[text()=' close ']");
	private static By btn_Next=By.xpath("(//span[text()='Next'])[2]");

	public void switchtoOIP() throws InterruptedException {
		ElementUtil.switchToTab("OFFER IN PRINCIPLE");
	}

	public String getOIP_Status() {
		return ElementUtil.getTextValue(OIPStatus);
	}
	
	public static void navigateToOfferInPrincipleTab() {
		ElementUtil.waitForPageLoad();
		try {
			ElementUtil.click(oipPageTab);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void switchTOFrame() throws InterruptedException {
		WebElement frame1 = DriverFactory.getDriver()
				.findElement(By.xpath("//div[@data-help-id='00163eb8-a377-1eeb-ade2-493a5bb85341']//iframe[1]"));
		DriverFactory.getDriver().switchTo().frame(frame1);
		WebElement frame2 = DriverFactory.getDriver().findElement(By.xpath("//iframe[@id='svc-frame']"));
		DriverFactory.getDriver().switchTo().frame(frame2);
		Thread.sleep(2000);
	}

	public void switchDefaultFrame() throws InterruptedException {
		DriverFactory.getDriver().switchTo().defaultContent();
		Thread.sleep(2000);
	}

	public void editOIP() throws InterruptedException {
		ElementUtil.waitForElementClickable(btn_editOIP);
		Thread.sleep(1000);
		ElementUtil.Click(btn_editOIP, "Edit OIP button");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
	}

	public void selectOIPCountry() throws Exception {
		ElementUtil.Click(btn_selectOIPCountry, "Select country");
		Thread.sleep(2000);
		ElementUtil.click(list_selectOIPCountry);
		Thread.sleep(2000);
		ElementUtil.Click(btn_next, "Next button");
		ElementUtil.waitForPageLoad();
	}

	public void accademicAdmissionTest(String type) throws Exception {

		String CourseTitle = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "CourseTitle");
		String MajorSubject = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "MajorSubject");
		String CourseStartDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
				"CourseStartDate");
		String CourseEndDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "CourseEndDate");
		String InstituteQulify = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
				"InstituteQulify");
		String ExpectedResult = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "ExpectedResult");
		String FailStatus = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "FailStatus");
		String HowManyModule = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "HowManyModule");

		ElementUtil.waitForElementClickable(btn_highQualification);
		ElementUtil.Click(btn_highQualification, "High qualification button");
		ElementUtil.Click(list_highQualification, "high qualification list");
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_titleOfCourse, CourseTitle);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_subjectMajor, MajorSubject);
		Thread.sleep(2000);
		ElementUtil.Click(list_subjectMajor, "Major subject");
		Thread.sleep(2000);
		ElementUtil.Click(btn_statusQualification, "Qualification status");
		Thread.sleep(2000);
		ElementUtil.click(list_statusQualification);
		Thread.sleep(2000);
		ElementUtil.Click(btn_durationQualification, "Qualification duration");
		Thread.sleep(2000);
		ElementUtil.click(list_durationQualification);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_courseStartDate, CourseStartDate);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_courseEndDate, CourseEndDate);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_instituteQualification, InstituteQulify);
		Thread.sleep(2000);
		ElementUtil.click(list_instituteQualification);
		Thread.sleep(2000);
		ElementUtil.Click(btn_languageTought, "Language tought");
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(list_languageTought);
		Thread.sleep(2000);
		ElementUtil.click(list_languageTought);
		Thread.sleep(2000);
		ElementUtil.Click(btn_studyMode, "Study mode");
		Thread.sleep(2000);
		ElementUtil.click(list_studyMode);
		Thread.sleep(2000);
		ElementUtil.Click(btn_qualificationGrade, "Grade");
		Thread.sleep(2000);
		ElementUtil.click(list_qualificationGrade);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_expectedResult, ExpectedResult);
		Thread.sleep(2000);
		if (type.equals("OIP")) {
			ElementUtil.Click(btn_overAllPass, "OverAllPass");
			Thread.sleep(2000);
			ElementUtil.click(list_overAllPass);
			Thread.sleep(2000);
		}

		ElementUtil.TypeWithoutEnter(txt_failStudies, FailStatus);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_howManyModule, HowManyModule);
		Thread.sleep(2000);
		ElementUtil.Click(radio_honorsDegree, "Honors degree radio button");
		Thread.sleep(2000);
		ElementUtil.Click(radio_creditTransfer, "Credit transfer radio button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_saveNextAcademic, "Save and next academic");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();

	}

	public void accademicAdmissionTestOIP() throws Exception {

		String CourseTitle = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "CourseTitle");
		String MajorSubject = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "MajorSubject");
		String CourseStartDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
				"CourseStartDate");
		String CourseEndDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "CourseEndDate");
		String InstituteQulify = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
				"InstituteQulify");
		String ExpectedResult = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "ExpectedResult");
		String HowManyModule1 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "HowManyModule");
		String HowManyModule2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "HowManyModule");

		ElementUtil.waitForElementClickable(btn_highQualification);
		ElementUtil.Click(btn_highQualification, "High qualification button");
		ElementUtil.Click(list_highQualification, "high qualification list");
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_titleOfCourse, CourseTitle);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_subjectMajor, MajorSubject);
		Thread.sleep(2000);
		ElementUtil.Click(list_subjectMajor, "Major subject");
		Thread.sleep(2000);
		ElementUtil.Click(btn_statusQualification, "Qualification status");
		Thread.sleep(2000);
		ElementUtil.click(list_statusQualification);
		Thread.sleep(2000);
		ElementUtil.Click(btn_durationQualification, "Qualification duration");
		Thread.sleep(2000);
		ElementUtil.click(list_durationQualification);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_courseStartDate, CourseStartDate);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_courseEndDate, CourseEndDate);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_instituteQualification, InstituteQulify);
		Thread.sleep(2000);
		ElementUtil.click(list_instituteQualification);
		Thread.sleep(2000);
		ElementUtil.Click(btn_languageTought, "Language tought");
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(list_languageTought);
		Thread.sleep(2000);
		ElementUtil.click(list_languageTought);
		Thread.sleep(2000);
		ElementUtil.Click(btn_studyMode, "Study mode");
		Thread.sleep(2000);
		ElementUtil.click(list_studyMode);
		Thread.sleep(2000);
		ElementUtil.Click(btn_qualificationGrade, "Grade");
		Thread.sleep(2000);
		ElementUtil.click(list_qualificationGrade);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_expectedResult, ExpectedResult);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_howManyModuleOIP1, HowManyModule1);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_howManyModuleOIP2, HowManyModule2);
		Thread.sleep(2000);
		ElementUtil.Click(radio_honorsDegree, "Honors degree radio button");
		Thread.sleep(2000);
		ElementUtil.Click(radio_creditTransfer, "Credit transfer radio button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_saveNextAcademic, "Save and next academic");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();

	}

	public void englishLanguageTest(String type) throws InterruptedException, IOException {

		String SitTestDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "SitTestDate");
		String OverallScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "OverallScore");
		String ListeningScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "ListeningScore");
		String ReadingScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "ReadingScore");
		String WrittingScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "WrittingScore");
		String SpeakingScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "SpeakingScore");

		if (type.equals("OIP")) {
			// ElementUtil.waitForElementClickable(drp_typeOfCourseOIP);
			Thread.sleep(2000);
			ElementUtil.Click(drp_typeOfCourseOIP, "Type of course");
			Thread.sleep(2000);
		} else if (type.equals("RE")) {
			// ElementUtil.waitForElementClickable(drp_typeOfCourse);
			Thread.sleep(2000);
			ElementUtil.Click(drp_typeOfCourse, "Type of course");
			Thread.sleep(2000);
		}

		ElementUtil.click(list_typeOfCourse);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_whensitTest, SitTestDate);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_overallScore, OverallScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_listeningScore, ListeningScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_readingScore, ReadingScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_writtingScore, WrittingScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_speakingScore, SpeakingScore);
		Thread.sleep(2000);
		ElementUtil.Click(btn_saveNextEnglishTest, "Save and next english test");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();

	}

	public void englishLanguageTestOIP() throws InterruptedException, IOException {

		String SitTestDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "SitTestDate");
		String OverallScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "OverallScore");
		String ListeningScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "ListeningScore");
		String ReadingScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "ReadingScore");
		String WrittingScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "WrittingScore");
		String SpeakingScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "SpeakingScore");

		Thread.sleep(2000);
		ElementUtil.Click(drp_typeOfCourseOIP, "Type of course");
		Thread.sleep(2000);
		ElementUtil.click(list_typeOfCourse);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_whensitTest, SitTestDate);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_overallScore, OverallScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_listeningScore, ListeningScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_readingScore, ReadingScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_writtingScore, WrittingScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_speakingScore, SpeakingScore);
		Thread.sleep(2000);
		ElementUtil.Click(btn_saveNextEnglishTest, "Save and next english test");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();

	}

	public void admissionTest(String type) throws InterruptedException, IOException {

		String SitForAdmissionTest = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
				"SitForAdmissionTest");
		String AverageScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "AverageScore");
		String VerbalScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "VerbalScore");
		String QuantitavieScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
				"QuantitavieScore");
		String AnalyticalScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
				"AnalyticalScore");

		if (type.equals("OIP")) {
			ElementUtil.waitForElementClickable(drp_admissionTestOIP);
			Thread.sleep(2000);
			ElementUtil.Click(drp_admissionTestOIP, "Admission test");
			Thread.sleep(2000);
		} else if (type.equals("RE")) {
			ElementUtil.waitForElementClickable(drp_admissionTest);
			Thread.sleep(2000);
			ElementUtil.Click(drp_admissionTest, "Admission test");
			Thread.sleep(2000);
		}

		ElementUtil.click(list_admissionTest);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_sitForAdmissionTest, SitForAdmissionTest);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_averageAdmissionScore, AverageScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_verbalAdmissionScore, VerbalScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_quantitativeAdmissionScore, QuantitavieScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_analyticalAdmissionScore, AnalyticalScore);
		Thread.sleep(2000);
		ElementUtil.Click(btn_saveNextAdmissionTest, "Save and next admission test");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		ElementUtil.scrollToElement(btn_Next);
		Thread.sleep(2000);
		ElementUtil.click(btn_Next);
		Thread.sleep(2000);

	}

	public void admissionTestOIP() throws InterruptedException, IOException {

		String SitForAdmissionTest = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
				"SitForAdmissionTest");
		String AverageScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "AverageScore");
		String VerbalScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "VerbalScore");
		String QuantitavieScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
				"QuantitavieScore");
		String AnalyticalScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
				"AnalyticalScore");

		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(drp_admissionTestOIP);
		Thread.sleep(2000);
		ElementUtil.Click(drp_admissionTestOIP, "Admission test");
		Thread.sleep(2000);
		ElementUtil.click(list_admissionTest);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_sitForAdmissionTest, SitForAdmissionTest);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_averageAdmissionScore, AverageScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_verbalAdmissionScore, VerbalScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_quantitativeAdmissionScore, QuantitavieScore);
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_analyticalAdmissionScore, AnalyticalScore);
		Thread.sleep(2000);
		ElementUtil.Click(btn_saveNextAdmissionTest, "Save and next admission test");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();

	}

	public static void EditAcademicDetails() throws InterruptedException, IOException {
		String CourseTitle = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "CourseTitle");
		// String ExpectedResult =
		// ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP",
		// "ExpectedResult");
		String FailStatus = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "FailStatus");

		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_titleOfCourse, CourseTitle);
		Thread.sleep(2000);
//		ElementUtil.TypeWithoutEnter(txt_expectedResult,ExpectedResult);
//		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_failStudies, FailStatus);
		Thread.sleep(2000);
		ElementUtil.Click(btn_NextAcademic, "Save and next academic");
		Thread.sleep(2000);
		ElementUtil.Click(btn_NextEnglish, "Save and next english test");
		Thread.sleep(2000);
		ElementUtil.Click(btn_NextAdmission, "Save and next admission test");
		Thread.sleep(2000);
	}

	public static void verifyAcademicDetails() {
		String CourseTitle = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "CourseTitle");
		String ExpectedResult = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "ExpectedResult");
		String FailStatus = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "OIP", "FailStatus");

		if (DriverFactory.getDriver().findElement(lbl_qualification).getText().equals(CourseTitle)) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Clicked on :- "
					+ "Qualification verified" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
		if (DriverFactory.getDriver().findElement(lbl_FailtStatus).getText().equals(FailStatus)) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Clicked on :- "
					+ "Fail status verified" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public void submitStudent() throws InterruptedException {
		Ic_OfferInPrinciplesPage oip = new Ic_OfferInPrinciplesPage();
		ElementUtil.waitForElementClickable(btn_submitStudent);
		Thread.sleep(2500);
		ElementUtil.Click(btn_submitStudent, "Submit student");
		Thread.sleep(11500);
//		ElementUtil.Click(btn_Close, "Close button");
//		Thread.sleep(2000);
		List<WebElement> OIPcountlist = DriverFactory.getDriver()
				.findElements(By.xpath("//div[@id='cdk-accordion-child-1']//ul//li"));
		Thread.sleep(5000);
		System.out.println("LIST SIZE : " + OIPcountlist.size());
		while (OIPcountlist.size() <= 0) {
			DriverFactory.getDriver().switchTo().defaultContent();
			ElementUtil.Click(btn_refresh, "Refresh button");
			ElementUtil.waitForPageLoad();
			Thread.sleep(5000);
			oip.switchTOFrame();
			OIPcountlist = DriverFactory.getDriver()
					.findElements(By.xpath("//div[@id='cdk-accordion-child-1']//ul//li"));
			System.out.println("LIST SIZE :" + OIPcountlist.size());
		}
	}

	public void selectOIPcourse() throws InterruptedException {
		List<WebElement> courseList = DriverFactory.getDriver().findElements(
				By.xpath("(//div[@role='region'])[2]//ul//li//strong[text()='OIP Application Fee Waiver']"));
		int courseCount = courseList.size();

		System.out.println("Course count :" + courseCount);

		if (courseCount >= 1) {
			WebElement Ocourse = DriverFactory.getDriver().findElement(By.xpath(
					"((//div[@role='region'])[2]//ul//li//strong[text()='OIP Application Fee Waiver']//following::button)[1]"));
			Thread.sleep(2200);
			try {
				Ocourse.click();
				Thread.sleep(1500);
			} catch (StaleElementReferenceException ex) {
				WebElement Ocourse2 = DriverFactory.getDriver().findElement(By.xpath(
						"((//div[@role='region'])[2]//ul//li//strong[text()='OIP Application Fee Waiver']//following::button)[1]"));
				Ocourse2.click();
			}

		} else {
			System.out.println("There is no OIP course suggestion displayed");
		}
		ElementUtil.waitForElementClickable(drp_startDateCourse);
		Thread.sleep(3000);
		ElementUtil.waitForPageLoad();
	}

	public void selectStartDate() throws InterruptedException {
		ElementUtil.waitForElementClickable(drp_startDateCourse);
		Thread.sleep(2000);
		ElementUtil.Click(drp_startDateCourse, "Course start date");
		Thread.sleep(2000);
		ElementUtil.click(list_startDateCourse);
		Thread.sleep(2000);
		ElementUtil.Click(btn_nextStartDate, "Next start date");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();

	}

	public void acceptTermsConditions(String type) throws InterruptedException {
		ElementUtil.waitForElementClickable(btn_confirmToggle);
		Thread.sleep(2000);
		if (type.equals("RE")) {
			ElementUtil.Click(btn_confirmToggle, "Confirm toggle");
			Thread.sleep(2000);
			ElementUtil.Click(btn_radioSubmissionRE, "Submision RE");
			Thread.sleep(2000);
			ElementUtil.Click(btn_checkAcceptTerms1RE, "Accept terms and conditions");
			Thread.sleep(2000);
			try {
				ElementUtil.Click(btn_checkAcceptTerms2RE, "Accept terms and conditions");
				Thread.sleep(2000);

			} catch (Exception ee) {
				((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
						btn_checkAcceptTerms2RE);
				Thread.sleep(2000);
			}
		} else if (type.equals("General")) {
			ElementUtil.Click(btn_confirmToggle, "Confirm toggle");
			Thread.sleep(2000);
			ElementUtil.Click(btn_radioSubmission, "Submision button");
			Thread.sleep(2000);
			ElementUtil.Click(btn_checkAcceptTerms1, "Accept terms and conditions");
			Thread.sleep(2000);
			try {
				ElementUtil.Click(btn_checkAcceptTerms2, "Accept terms and conditions");
				Thread.sleep(2000);

			} catch (Exception ee) {
				((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
						btn_checkAcceptTerms2RE);
				Thread.sleep(2000);
			}
		}

		ElementUtil.waitForPageLoad();

	}

	public void submitOIPCourse() throws InterruptedException {
		try {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", btn_submitOIP);
			Thread.sleep(2000);
		} catch (Exception e) {
			ElementUtil.Click(btn_submitOIP, "Submit OIP");
			Thread.sleep(2000);
		}

		ElementUtil.waitForElementPresent(lbl_successMessage);
		WebElement message = DriverFactory.getDriver()
				.findElement(By.xpath("//h3[text()='Congratulations!']//following::p"));
		if (message.getText().contains("Offer in Principle has been issued")) {
			System.out.println(message + ": OIP course selected sucessfully");
		}
		Thread.sleep(5000);
		ElementUtil.Click(btn_close, "Close button");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
	}

	public void verifyOIPlead() throws InterruptedException {
		List<WebElement> leadList = DriverFactory.getDriver()
				.findElements(By.xpath("//div[@data-help-id='3nKWypX2Tqc0dFB$SLmbrG']//table//tbody//tr"));
		int leadCount = leadList.size();
		if (leadCount >= 1) {
			System.out.println("OIP lead is created");
			String OIPstatus = DriverFactory.getDriver()
					.findElement(
							By.xpath("//div[@data-help-id='3nKWypX2Tqc0dFB$SLmbrG']//table//tbody//tr[2]//td[5]//span"))
					.getText();
			Thread.sleep(2000);
			System.out.println("Current OIP status is : - " + OIPstatus);
			String OIPreference = DriverFactory.getDriver()
					.findElement(By
							.xpath("//div[@data-help-id='3nKWypX2Tqc0dFB$SLmbrG']//table//tbody//tr[2]//td[11]//span"))
					.getText();
			Thread.sleep(2000);
			System.out.println("OIP reference number : - " + OIPreference);

		}
		ElementUtil.waitForPageLoad();

	}

	public void clickVerifyOIP() throws InterruptedException {
		ElementUtil.waitForElementClickable(btn_verifyOIP);
		Thread.sleep(2000);
		ElementUtil.Click(btn_verifyOIP, "Verifiy OIP");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
	}

	public void verificationFinal() throws InterruptedException {
		ElementUtil.waitForElementClickable(btn_radioOIPstatus);
		Thread.sleep(2000);
		ElementUtil.Click(btn_radioOIPstatus, "OIP sttaus radio button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_finalSave, "Final save");
		Thread.sleep(10000);
		try {
			String OIPstatus = DriverFactory.getDriver()
					.findElement(By.xpath("//div[@id='cdk-accordion-child-0']//table//tbody//tr[1]//td[6]/span[2]"))
					.getText();
			if (OIPstatus.equals("Verified")) {
				System.out.println("OIP Status :- " + OIPstatus);
			}
		} catch (Exception e) {
			String OIPstatus = DriverFactory.getDriver()
					.findElement(By.xpath("//div[@id='cdk-accordion-child-1']//table//tbody//tr[1]//td[6]/span[2]"))
					.getText();
			if (OIPstatus.equals("Verified")) {
				System.out.println("OIP Status :- " + OIPstatus);
			}
		}

		ElementUtil.waitForPageLoad();
		switchDefaultFrame();
		Thread.sleep(2000);
	}

	public static void editAcademic() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		ElementUtil.Click(btn_editAcademic, "Edit Academic details");
		Thread.sleep(2000);
	}
}
