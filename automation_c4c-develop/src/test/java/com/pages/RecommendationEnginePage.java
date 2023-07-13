package com.pages;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.util.Base64;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DataBaseUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ListeningUtils;

import AppHooks.ApplicationHooks;

public class RecommendationEnginePage {
	
    private static By recommendationTab=By.xpath(".//div[@data-help-id='9915cc29ca38741ceaf2d9adef9887b3']");
	private static By aero_down = By.xpath("//button[@title='slim-arrow-down']");
	private static By lbl_reTab = By
			.xpath("//ul[@role='listbox']//li/span[contains(text(),'RECOMMENDATION ENGINE')]//parent::li");
	private static By drp_studyLevel = By.xpath("//button[@title='Study Level']");
	private static By list_studyLevel = By.xpath("//button[@title='Study Level']//following::ul//li");
	private static By txt_intakeDate = By.xpath("//input[@formcontrolname='intake']");
	private static By txt_subjectKeyword = By.xpath("//input[@title='Subject Keyword']");
	private static By drp_destination = By.xpath("//button[@title='Destination']");
	private static By list_destination = By.xpath("//button[@title='Destination']//following::li//span");
	private static By btn_searchRE = By.xpath("(//span[text()='Search'])[1]");
	private static By btn_REtoggle = By.xpath("//input[@id='oipCheckbox']");
	private static By btn_apply = By.xpath("(//span[text()='Apply'])[1]");
	private static By drp_countryQualification = By
			.xpath("//mat-select[@formcontrolname='highestQualificationDropdown']");
	private static By list_countryQualification = By.xpath("//div[@role='listbox']//mat-option//span");
	private static By btn_save = By.xpath("(//span[text()='Save'])[1]");
	private static By list_OIPCourse = By.xpath("//div[@role='region']//ul//li");
	private static By btn_refresh = By.xpath("//button[@data-help-id='ShhKB9IH44M8cgwdZYyT4W']");
	private static By btn_showMore = By.xpath("//span[@class='mat-button-wrapper' and text()='Show more']");
	private static By label_shortListCount = By.xpath(".//mat-panel-title[text()='Shortlists ']//span[2]");
	private static By btn_reset = By.xpath("//span[text()='Reset']");
	public static By btn_close = By.xpath("//span[text()=' close ']");
	public static By btn_shortlistOIP = By.xpath(
			"(//div[@role='region']//ul//li//span[text()=' Offer in Principle']//following::span[text()='ShortList'])[1]");
	public static By btn_shortlistOIP2 = By.xpath(
			"(//div[@role='region']//ul//li//span[text()=' Offer in Principle']//following::span[text()='ShortList'])[2]");
	public static By btn_getDirection = By.xpath("//span[text()='Get Decision']");
	public static By btn_getDecisionFirst = By.xpath("(//span[text()='Get Decision'])[1]");
	private static By btn_feedback1 = By.xpath("//span[text()=' Feedback ']");
	private static By btn_rating = By.xpath("(//input[@name='courseRating' and @value='4']//following::label//div)[1]");
	private static By txt_comment = By.xpath("//textarea[@name='comment']");
	private static By btn_submitFeedback = By.xpath("//span[text()='Submit feedback']");
	private static By btn_feedback2 = By.xpath(
			"(//div[@id='cdk-accordion-child-0']//div[@class='btn_wrp']//span[@class='mat-ripple mat-button-ripple']//following::span)[2]");
	private static By lbl_courseName = By.xpath("(//div[@role='region'])[1]//tbody//td[3]");

	public static void navigateToRecommendationEngineTab() {
		ElementUtil.waitForPageLoad();
		try {
			ElementUtil.click(recommendationTab);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	//oipPageTab
	public static void switchtoCRE() throws InterruptedException {
		Thread.sleep(1000);
		ElementUtil.waitForElementClickable(aero_down);
		Thread.sleep(2000);
		ElementUtil.click(aero_down);
		Thread.sleep(3000);
		ElementUtil.scrollToElement(lbl_reTab);
		ElementUtil.click(lbl_reTab);
		ElementUtil.waitForPageLoad();
		Thread.sleep(5000);
	}

	public static void switchToFrameToCRE() throws InterruptedException {

		try {
			Thread.sleep(3000);
			DriverFactory.getDriver().switchTo().frame(0);
			Thread.sleep(1000);
			DriverFactory.getDriver().switchTo().frame(0);
			Thread.sleep(1000);
			System.out.println("Page-0 frame");

		} catch (Exception e) {
			try {
				Thread.sleep(3000);
				DriverFactory.getDriver().switchTo()
						.frame(DriverFactory.getDriver().findElement(By.xpath("//iframe[@id='__page2-iframe']")));
				Thread.sleep(1000);
				DriverFactory.getDriver().switchTo()
						.frame(DriverFactory.getDriver().findElement(By.xpath("//iframe[@id='rec-console-frame']")));
				Thread.sleep(1000);
				System.out.println("Page-2 frame");
			} catch (Exception et) {
				Thread.sleep(3000);
				DriverFactory.getDriver().switchTo()
						.frame(DriverFactory.getDriver().findElement(By.xpath("//iframe[@id='__page3-iframe']")));
				Thread.sleep(1000);
				DriverFactory.getDriver().switchTo()
						.frame(DriverFactory.getDriver().findElement(By.xpath("//iframe[@id='rec-console-frame']")));
				Thread.sleep(1000);
				System.out.println("Page-3 frame");
			}

		}

	}

	public static void studyLevel() throws Exception {
		String StudyLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "RecommendationEngine",
				"StudyLevel");
         System.out.println("Study Level="+StudyLevel);
		ElementUtil.Dropdown(drp_studyLevel, list_studyLevel, StudyLevel);
		Thread.sleep(2000);
	}

	public static void inatakeDate() throws Exception {
		String IntakeDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "RecommendationEngine",
				"IntakeDate");
		try {
			ElementUtil.Click(btn_searchRE, "Search button");
			Thread.sleep(2000);
			ElementUtil.Type(txt_intakeDate, IntakeDate);
			Thread.sleep(2000);

		} catch (Exception e) {
			ElementUtil.Click(btn_refresh, "Refresh button");
			Thread.sleep(5000);
			studyLevel();
			ElementUtil.Click(btn_searchRE, "Search button");
			Thread.sleep(2000);
			ElementUtil.Type(txt_intakeDate, IntakeDate);
			Thread.sleep(2000);

		}

	}

	public static void subjectKeyword() throws InterruptedException, IOException {
		String SubjectKeyword = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "RecommendationEngine",
				"SubjectKeyword");

		// ExtentCucumberAdapter.addTestStepLog("Enter subject keyword");
		ElementUtil.Type(txt_subjectKeyword, SubjectKeyword);
		Thread.sleep(2000);
	}

	public static void destination() throws Exception {
		String Destination = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "RecommendationEngine",
				"Destination");

		ElementUtil.Dropdown(drp_destination, list_destination, Destination);
		Thread.sleep(2000);
		ElementUtil.Click(btn_apply, "Apply button");
		Thread.sleep(2000);
	}

	public static void reset() throws InterruptedException {
		ElementUtil.Click(btn_reset, "Reset button");
		Thread.sleep(2000);
	}

	public static void enableToggle() throws Exception {
		String CountryQualification = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"RecommendationEngine", "CountryQualification");

		boolean toggleStatus = DriverFactory.getDriver().findElement(btn_REtoggle).isSelected();

		if (!toggleStatus == true) {
			ElementUtil.Click(btn_REtoggle, "Toggle button");
			Thread.sleep(2000);
			ElementUtil.Dropdown(drp_countryQualification, list_countryQualification, CountryQualification);
			Thread.sleep(2000);
			ElementUtil.Click(btn_save, "Save button");
			Thread.sleep(2000);
		}
//		ElementUtil.Click(btn_REtoggle,"Toggle button");
//		Thread.sleep(2000);
//		ElementUtil.Dropdown(drp_countryQualification, list_countryQualification,CountryQualification);
//		Thread.sleep(2000);
//		ElementUtil.Click(btn_save, "Save button");
//		Thread.sleep(2000);
	}

	public static void searchOIP() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_searchRE, "Search button");
		Thread.sleep(2000);
	}

	public static void verifyOIP() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		for (int i = 1; i < 3; i++) {
			ElementUtil.Click(btn_showMore, "Show more button");
			Thread.sleep(2000);
		}
		List<WebElement> course = DriverFactory.getDriver().findElements(list_OIPCourse);
		int listCount = course.size();

		if (listCount >= 1) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "OIP course suggestions found for below universities" + "</span>");

			List<WebElement> listOffer = DriverFactory.getDriver().findElements(
					By.xpath("//div[@role='region']//ul/li//span[text()=' Offer in Principle']//following::p[1]"));

			for (WebElement para : listOffer) {
				String getParaName = para.getText();
				Thread.sleep(2000);
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue'>" + getParaName + "</span>");

			}

		} else {
			ExtentCucumberAdapter.addTestStepLog("There is no OIP course suggested for given details");
		}
	}

	public static void selectOIPCourse() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		for (int i = 1; i < 3; i++) {
			ElementUtil.Click(btn_showMore, "Show more button");
			Thread.sleep(2000);
		}
		try {
			ElementUtil.Click(btn_shortlistOIP, "Shortlisted OIP course button");
			Thread.sleep(2000);
		} catch (Exception e) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", btn_shortlistOIP);
			Thread.sleep(2000);
		}

		try {
			ElementUtil.Click(btn_getDirection, "Clicked get direction button");
			Thread.sleep(2000);
		} catch (Exception ea) {
			try {
				((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
						btn_getDirection);
				Thread.sleep(2000);
			} catch (Exception ee) {
				ElementUtil.Click(btn_shortlistOIP2, "Shortlisted OIP course button");
				Thread.sleep(2000);
				ElementUtil.waitForElementClickable(btn_getDirection);
				ElementUtil.Click(btn_getDirection, "Clicked get direction button");
				Thread.sleep(2000);
			}

		}

	}

	public static void shortlist() throws InterruptedException {
		ExtentCucumberAdapter
				.addTestStepLog("<span style='color:red;font-weight:bold;'>" + "Shortlisting the course" + "</span>");

		List<WebElement> listShort = DriverFactory.getDriver()
				.findElements(By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortList']"));

		for (int i = 0; i < 4; i++) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", listShort.get(i));
			ElementUtil
					.waitForElementClickable(By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortList']"));
			Thread.sleep(3000);
		}

	}
	
	public static String shortListTheCourseIfEnabled() {
	  String course="";
	  try {
		ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>" + "Shortlisting the course" + "</span>");
		List<WebElement> listShort = DriverFactory.getDriver().findElements(By.xpath(".//span[text()='Show more']/parent::button/parent::div/preceding-sibling::ul/li//h4/parent::mat-card//span[text()='ShortList']/parent::button"));
		
		   int size=listShort.size()-1;
		   while(size>0) {
			   if(listShort.get(size).isEnabled()) {
				   listShort.get(size).click();
				   break;
			   }
			   size--;
		   }
		   ApplicationPageUtil.waitForLoadGetDisappiear();
		   Thread.sleep(5000);
		 course=DriverFactory.getDriver().findElement(By.xpath(".//button[contains(@class,'dsbl_btn')]/parent::div/parent::mat-card//h4")).getText();
	  }catch(Exception ex){
		  System.out.println(ex.getMessage());
	  }
	   return course;
	  
	}
	
	
	

	public static void unShortlist() throws InterruptedException {
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:red;font-weight:bold;'>" + "Un Shortlisting the course" + "</span>");

		List<WebElement> listUnshort = DriverFactory.getDriver()
				.findElements(By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortListed']"));

//			for(WebElement unShortlist:listUnshort) 
//			{
		for (int i = 0; i < 3; i++) {

			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", listUnshort.get(i));
			ElementUtil.waitForElementClickable(
					By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortListed']"));
			Thread.sleep(3000);
		}

	}

	public static void IDPsuggest() throws InterruptedException {
		ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
				+ "IDP suggested course for shortlisted courses" + "</span>");

//		 List<WebElement> listShort = DriverFactory.getDriver().findElements(By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortList']"));
//			
//			for(int i=0;i<1;i++) 
//			{
//				((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();", listShort.get(i));
//				ElementUtil.waitForElementClickable(By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortList']"));
//				Thread.sleep(3000);
//			}

		try {
			List<WebElement> shortlistedList = DriverFactory.getDriver()
					.findElements(By.xpath("(//div[@role='region']//li//p)[1]"));
			for (WebElement shortlisted : shortlistedList) {

				String getShortlisted = shortlisted.getText();
				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue'>" + "Shortlisted Courses:-" + getShortlisted + "</span>");
				System.out.println("Shortlisted Courses:-" + getShortlisted);
			}
		} catch (StaleElementReferenceException e) {
			try {
				List<WebElement> shortlistedList = DriverFactory.getDriver()
						.findElements(By.xpath("(//div[@role='region']//li//p)[1]"));
				for (WebElement shortlisted : shortlistedList) {

					String getShortlisted = shortlisted.getText();
					ExtentCucumberAdapter.addTestStepLog(
							"<span style='color:blue'>" + "Shortlisted Courses:-" + getShortlisted + "</span>");
					System.out.println("Shortlisted Courses:-" + getShortlisted);
				}
			} catch (StaleElementReferenceException e1) {
				List<WebElement> shortlistedList = DriverFactory.getDriver()
						.findElements(By.xpath("(//div[@role='region']//li//p)[1]"));
				for (WebElement shortlisted : shortlistedList) {

					String getShortlisted = shortlisted.getText();
					ExtentCucumberAdapter.addTestStepLog(
							"<span style='color:blue'>" + "Shortlisted Courses:-" + getShortlisted + "</span>");
					System.out.println("Shortlisted Courses:-" + getShortlisted);
				}
			}

		}

		try {
			List<WebElement> IDPtable = DriverFactory.getDriver()
					.findElements(By.xpath("(//div[@role='region'])[2]//ul[1]//li//h4[1]"));
			for (WebElement IDPsuggested : IDPtable) {

				String IDPsuggestedCourse = IDPsuggested.getText();
				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue'>" + "IDP Sugggested Courses:-" + IDPsuggestedCourse + "</span>");
				System.out.println("IDP Suggested Courses:-" + IDPsuggestedCourse);
			}
		} catch (Exception e) {
			List<WebElement> IDPtable = DriverFactory.getDriver()
					.findElements(By.xpath("(//div[@role='region'])[2]//ul[1]//li//h4[1]"));
			for (WebElement IDPsuggested : IDPtable) {

				String IDPsuggestedCourse = IDPsuggested.getText();
				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue'>" + "IDP Sugggested Courses:-" + IDPsuggestedCourse + "</span>");
				System.out.println("IDP Suggested Courses:-" + IDPsuggestedCourse);
			}
		}

	}

	public static void verifyDetails() throws InterruptedException {
		ExtentCucumberAdapter
				.addTestStepLog("<span style='color:red;font-weight:bold;'>" + "Verify the course details" + "</span>");

		List<WebElement> listShort = DriverFactory.getDriver()
				.findElements(By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortList']"));

		for (int i = 0; i < 1; i++) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", listShort.get(i));
			ElementUtil
					.waitForElementClickable(By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortList']"));
			Thread.sleep(3000);
		}

		WebElement getCollegeName = DriverFactory.getDriver()
				.findElement(By.xpath("(//div[@role='region']//li//h4)[1]"));

		String getCollegeName_ = DriverFactory.getDriver().findElement(By.xpath("(//div[@role='region']//li//p)[1]"))
				.getText();
		String getCourseName_ = DriverFactory.getDriver().findElement(By.xpath("(//div[@role='region']//li//h4)[1]"))
				.getText();
		String getStudyLevel_ = DriverFactory.getDriver()
				.findElement(By.xpath("(//div[@role='region']//li//div[1]//p)[2]")).getText();
		String getRegion_ = DriverFactory.getDriver().findElement(By.xpath("(//div[@role='region']//li//div[2]//p)[2]"))
				.getText();
		String getCoursefee_ = DriverFactory.getDriver()
				.findElement(By.xpath("(//div[@role='region']//li//div[3]//p)[2]")).getText();

		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:red;font-weight:bold;'>" + "University Name:-" + getCollegeName_ + "</span>");
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:red;font-weight:bold;'>" + "Course Name:-" + getCourseName_ + "</span>");
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:red;font-weight:bold;'>" + "Study Level:-" + getStudyLevel_ + "</span>");
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:red;font-weight:bold;'>" + "Region/City:-" + getRegion_ + "</span>");
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:red;font-weight:bold;'>" + "Annula Course Fee:-" + getCoursefee_ + "</span>");

		try {
			Thread.sleep(2000);
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", getCollegeName);
			Thread.sleep(2000);
		} catch (Exception e) {
			getCollegeName.click();
			Thread.sleep(2000);
		}

//		WebElement getCollegeName2=DriverFactory.getDriver().findElement(By.xpath("(//mat-dialog-container[@role='dialog']//div//p)[3]"));
//		WebElement getCourseName2=DriverFactory.getDriver().findElement(By.xpath("(//mat-dialog-container[@role='dialog']//p)[1]"));
//		WebElement getStudyLevel2=DriverFactory.getDriver().findElement(By.xpath("(//mat-dialog-container[@role='dialog']//div//p)[6]"));
//		WebElement getRegion2=DriverFactory.getDriver().findElement(By.xpath("(//mat-dialog-container[@role='dialog']//div//p)[8]"));
//		WebElement getCoursefee2=DriverFactory.getDriver().findElement(By.xpath("(//mat-dialog-container[@role='dialog']//div//p)[12]"));

		String getCollegeName2_ = DriverFactory.getDriver()
				.findElement(By.xpath("(//mat-dialog-container[@role='dialog']//div//p)[3]")).getText();
		String getCourseName2_ = DriverFactory.getDriver()
				.findElement(By.xpath("(//mat-dialog-container[@role='dialog']//p)[1]")).getText();
		String getStudyLevel2_ = DriverFactory.getDriver()
				.findElement(By.xpath("(//mat-dialog-container[@role='dialog']//div//p)[6]")).getText();
		String getRegion2_ = DriverFactory.getDriver()
				.findElement(By.xpath("(//mat-dialog-container[@role='dialog']//div//p)[8]")).getText();
		String getCoursefee2_ = DriverFactory.getDriver()
				.findElement(By.xpath("(//mat-dialog-container[@role='dialog']//div//p)[12]")).getText();

		if (getCollegeName_.contains(getCollegeName2_)) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "University Detail verified with pop-up window" + "</span>");
		}
		if (getCourseName_.contains(getCourseName2_)) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "Course Detail verified with pop-up window" + "</span>");
		}
		if (getStudyLevel_.contains(getStudyLevel2_)) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "Study Level Detail verified with pop-up window" + "</span>");
		}
		if (getRegion_.contains(getRegion2_)) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "Region Detail verified with pop-up window" + "</span>");
		}
		if (getCoursefee_.contains(getCoursefee2_)) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "Annual course Fee Detail verified with pop-up window" + "</span>");
		}

		try {
			Thread.sleep(2000);
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", btn_close);
			Thread.sleep(2000);
		} catch (Exception e) {
			ElementUtil.Click(btn_close, "Close button");
			Thread.sleep(2000);
		}

	}

	public static void shortlistMaximum() throws InterruptedException {
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:red;font-weight:bold;'>" + "Shortlisting the maximum course" + "/span");

		List<WebElement> listMaximumShortlist = DriverFactory.getDriver()
				.findElements(By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortList']"));

		for (WebElement MaxShortlist : listMaximumShortlist) {
			WebElement count = DriverFactory.getDriver()
					.findElement(By.xpath("//mat-panel-title[text()='Shortlists ']//span[2]"));
			if (!count.getText().equals("20/20")) {
//				Thread.sleep(3000);
//				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"+"Clicking on the shortlist course : "+count.getText()+"</span>");
//				System.out.println("Clicking on the shortlist course : "+count.getText());

				Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverFactory.getDriver())
						.withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(5))
						.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);

				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
						By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortList']")));

				((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", MaxShortlist);
				ElementUtil.waitForElementClickable(
						By.xpath(".//span[text()=' favorite ']/parent::span[text()='ShortListed']"));
				Thread.sleep(3000);
				ElementUtil.waitForPageLoad();
//				ApplicationPageUtil.waitForLoadGetDisappiear();
				Thread.sleep(3000);
				ElementUtil.waitForPageLoad();
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Clicking on the shortlist course : " + count.getText() + "</span>");
				System.out.println("Clicking on the shortlist course : " + count.getText());

			} else {
				ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
						+ "Unable to shortlist more then 20 courses" + "</span>");
				System.out.println("Unable to shortlist more then 20 courses");
				break;
			}

		}

	}


	public static void verifyGetDecision() 
	{
	
		boolean getDecsion=DriverFactory.getDriver().findElement(btn_getDecisionFirst).isSelected();
		
		if(getDecsion==true) 
		{
			System.out.println("Enabled");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"+"Get decision button is clickable"+"</span>");
			Assert.assertFalse(true);
		}else 
		{
			System.out.println("Disabled");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"+"Get decision button is not clickable"+"</span>");
		}
	}
	public static void sendFeedbackRE1() throws InterruptedException, IOException, SQLException, ClassNotFoundException 
	{
		String comment="This comment will be send to feedback table";
		 String feedback="";
		ElementUtil.Click(btn_feedback1, "Feedback button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_rating, "rating button");
		Thread.sleep(2000);
		ElementUtil.Type(txt_comment, comment);
		Thread.sleep(2000);
		ElementUtil.Click(btn_submitFeedback, "Submit Feedback button");
		Thread.sleep(2000);
		
		String connectionString = ListeningUtils.GetProperty("PostgresConnectionString") +
				ListeningUtils.GetProperty("PostgresDatabaseName");
				String UserName = ListeningUtils.GetProperty("UserNameDB");
				byte[] decodedBytes = Base64.getDecoder().decode(ListeningUtils.GetProperty("PasswordDB"));
				String DecodedString = new String(decodedBytes);
				String Password = DecodedString;
				String Query = "select * from recomm_client_ms.rec_counsellor_feedback order by submitted_on desc LIMIT 2";

				ResultSet rs = DataBaseUtil.retrieveData(connectionString, UserName, Password, Query);
				while (rs.next()) {
				   feedback = rs.getString("feedback");
				  System.out.print(feedback);
				  ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"+"Clicked on :- " + feedback+"</span>");
				 }
				 if(feedback.contains(comment)) 
				 {
					 System.out.println("Feedback Verified");
					 ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"+"Clicked on :- " + "Feedback Verified"+"</span>");
				 }
		
	}
	public static void sendFeedbackRE2() throws InterruptedException, IOException 
	{
		
		ElementUtil.Click(btn_feedback2, "Feedback button");
		Thread.sleep(2000);
		ElementUtil.Type(txt_comment, "This comment will be send to feedback table");
		Thread.sleep(2000);
		ElementUtil.Click(btn_submitFeedback, "Submit Feedback button");
		Thread.sleep(2000);
		
	}
	public static void clickSameCourseOIP() throws InterruptedException 
	{
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		String courseName=DriverFactory.getDriver().findElement(lbl_courseName).getText();
		for (int i = 1; i < 5; i++) {
			ElementUtil.Click(btn_showMore, "Show more button");
			Thread.sleep(2000);
		}
		boolean flag=DriverFactory.getDriver().findElement(By.xpath("((//div[@role='region'])[2]//ul//li//following::h4[contains(text(),'"+courseName+"')]//following::button)[1]")).isSelected();
		if(flag==false) 
		{
			 System.out.println("Get decision button can not be clicked");
			 ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"+"Unable to click on already selected course "+"</span>");
		}else
		{
			Assert.assertFalse(true);
		}
	}

}
