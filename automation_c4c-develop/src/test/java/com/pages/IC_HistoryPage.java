package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelReader;
import com.qa.util.ExcelUtil;
import com.qa.util.WaitsUtil;

import AppHooks.ApplicationHooks;

public class IC_HistoryPage {
	ApplicationPageUtil applPage = new ApplicationPageUtil();
	/***********************************************************************************************/
	ExcelReader exc = new ExcelReader();
	private final String FileTestData_Path = "src\\test\\resources\\TestData\\TestData.xlsx";
	private By editBtn = By.xpath(".//*[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");
	private By englishProficiencyTest_AddBtn = By.xpath(".//*[@data-help-id='twAf5d5D9KMQc$8nLhJzJW']");
	private By status = By.xpath(".//*[@data-help-id='4$gnL0O40aEcVSfkIWRa5G']//input");
	private By save = By.xpath(".//*[@data-help-id='vdzW3flmW4UJwvWwOsvUTm']");
	private By statusMouseHover = By.xpath(
			".//*[@data-help-id='4$gnL0O40aEcVSfkIWRa5G']//span[contains(@class,'sapMClientInputInlineEditHidden')]");

	/***********************************************************************************************/
	String stud_Id = "";

	public static By Loading = By.xpath("//div[contains(@class,'sapUiLocalBusyIndicatorAnimation')]");
	// education history
	private static By btn_addEducation = By.xpath("//button[@data-help-id='aq1QgiSouKEACzNBdGKgXG']");
	private static By btn_instituteId = By
			.xpath(" //div[@data-help-id='wP7wzhgeO4QtTN4AaMMDJm']//input//following::span[1]");
	private static By btn_instituteSearch = By.xpath("//button[@data-help-id='gtnhDY8eZaMh5U_47xdUmW-searchButton']");
	private static By txt_instituteSearch = By
			.xpath("//div[@data-help-id='gtnhDY8eZaMh5U_47xdUmW-searchField']//input");
	private static By btn_instituteTabel = By
			.xpath("//div[@data-help-id='oNHI9gQjBq6rOK2P1W7QGm']//following-sibling::table[1]/tbody/tr[1]");
	private static By txt_fieldOfStudy = By.xpath("//div[@data-help-id='k7tgYMc6h4cDVB89vR3fMW']//input");
	private static By txt_studyMode = By.xpath("//div[@data-help-id='NFZVzs0Qpa_qtrYJrWHv7G']//input");
	private static By txt_language = By.xpath("//div[@data-help-id='8Szj9tNgo4ABJL_MoS8bim']//input");
	private static By txt_status = By.xpath("//div[@data-help-id='QzrnTax6q4omqVOf5oLmUm']//input");
	private static By txt_commenceDate = By.xpath(".//*[@data-help-id='gQ_EWTcR9agXcCSvsyw$OW']//input");
	private static By txt_graduationDate = By.xpath(".//*[@data-help-id='PTcH9QxqpKsbIUYxfmdujG']//input");
	private static By txt_grade = By.xpath(".//*[@data-help-id='6iYI7wuV4KQQVafqmvTf7m']//input");
	private static By txt_country = By.xpath(".//*[@data-help-id='_ZWNtO1kpKE737nnUAtyjW']//input");
	private static By txt_degreeType = By.xpath(".//*[@data-help-id='PjbdFt_r3KID0Mvk2V$28G']//input");
	private static By txt_degreeName = By.xpath(".//*[@data-help-id='XBLBcZy_KqUS$fl5snCazW']//input");
	private static By btn_saveHistory = By.xpath(".//*[@data-help-id='vdzW3flmW4UJwvWwOsvUTm']");

	// employment history
	private static By btn_addEmployment = By.xpath("//button[@data-help-id='khRu_IaVSK6I9CPbrdFCi0']");
	private static By txt_orgName = By.xpath("//div[@data-help-id='m141nGZzC4k03Ugk7EXgjW']//input");
	private static By txt_paidWork = By.xpath("//div[@data-help-id='QmNQQsoSyaUogJyk9NCqAm']//input");
	private static By txt_industry = By.xpath("//div[@data-help-id='LdiSpy7PkaIROBk5CKhS60']//input");
	private static By txt_partTime = By.xpath("//div[@data-help-id='eIfQ4siS5KMdBtHVX7FJ90']//input");
	private static By txt_occupation = By.xpath("//div[@data-help-id='iwp8DSSwyq2NfDV2N3cIj0']//input");
	private static By txt_designation = By.xpath("//div[@data-help-id='uHeICm2AfK_$nJwqTKY8YW']//input");
	private static By txt_description = By.xpath("//div[@data-help-id='8vwWmPNPBq_Qu8XK4L72GG']//input");
	private static By txt_empSector = By.xpath("//div[@data-help-id='b1v$cB2MzqUYhybLNs8O5W']//input");
	private static By txt_startDate = By.xpath("//div[@data-help-id='2IJNBPOh$461qlUM7hEscG']//input");
	private static By txt_endDate = By.xpath("//div[@data-help-id='obnvvO1XWaU7T57dXFh9D0']//input");
	private static By txt_address = By.xpath("//div[@data-help-id='_W2MElqJgaYn12zNgTkb5m']//input");
	private static By txt_countryRegion = By.xpath("//div[@data-help-id='cba$C38A3K604H6UtOksFG']//input");
	private static By txt_engSpeaking = By.xpath("//div[@data-help-id='nhYANQT_dqYGGytHXo_5sG']//input");

	// addEnglishProficiency
	private static By btn_addEnglish = By.xpath("//button[@data-help-id='twAf5d5D9KMQc$8nLhJzJW']");
	private static By drp_englishStatus = By.xpath("//div[@data-help-id='4$gnL0O40aEcVSfkIWRa5G']//input");

	private static By btn_addEducationHistory = By
			.xpath("(//bdi[text()='Education History']//following::bdi[text()='Add'])[1]");
	private static By btn_addEmploymentHistory = By
			.xpath("(//bdi[text()='Employment History']//following::bdi[text()='Add'])[1]");
	private static By btn_addEnglishProficiency = By
			.xpath("(//bdi[text()='English Proficiency Tests']//following::bdi[text()='Add'])[1]");

	private static By li_educationHistory = By
			.xpath("((//div[@data-help-id='oI8XzSikHK2CD29laSZXWm']//thead/tr)[1]//th//bdi)");
	private static By btn_globalSave = By.xpath("//bdi[text()='Save']");
	private static By lbl_headerMessage = By.xpath("//span[@data-help-id='messageBar-headerMessage']");
	private static By txt_discontinuedReason = By.xpath("//div[@data-help-id='CGJCPXZrwqgr7e270UpBnG']//input");
	private static By txt_discontinuedDate = By.xpath("//div[@data-help-id='Wne6HCAM4qUaUdDXhaQU_0']//input");
	private static By txt_state = By.xpath("//div[@data-help-id='KLnLhTpiea_olj6e5zXEo0']//input");

	private static By drp_testType=By.xpath("//div[@data-help-id='aKxOFrWTDKMoebTlkviUkm']//input");
	private static By txt_testScore=By.xpath("//div[@data-help-id='SfqUSwexvK6HYZVyYrrjA0']//input");
	private static By li_picklistOverview = By.xpath("//div[@role='dialog']//ul//li");
	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	// use
	public void addEnglishProficiency() throws InterruptedException, IOException {

		String StatusEnglishTest = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"StatusEnglishTest");
		ElementUtil.waitForPageLoad();
		Thread.sleep(3000);
		ElementUtil.waitForElementClickable(btn_addEnglish);

		try {
			ElementUtil.Click(btn_addEnglish, "Add eglish proficiency button");
			Thread.sleep(3000);
			ElementUtil.Type(drp_englishStatus, StatusEnglishTest);
			Thread.sleep(3000);
		} catch (Exception e) {
			ElementUtil.Click(btn_addEnglish, "Add eglish proficiency button");
			Thread.sleep(3000);
			ElementUtil.Type(drp_englishStatus, StatusEnglishTest);
			Thread.sleep(3000);
		}

	}

	// use
	public void clickAddEmployment() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.scrollToElement(btn_addEmployment);
		Thread.sleep(2000);
		ElementUtil.scrollToElement(btn_addEmployment);
		Thread.sleep(2000);
		Actions action = new Actions(DriverFactory.getDriver());
		WebElement addEmp = DriverFactory.getDriver()
				.findElement(By.xpath("//button[@data-help-id='khRu_IaVSK6I9CPbrdFCi0']"));
		action.moveToElement(addEmp).build().perform();
		action.click();
		ElementUtil.Click(btn_addEmployment, "Add employeement button");
		Thread.sleep(2000);

	}

	// use
	public static void addEmploymentHistory() throws InterruptedException, IOException {
		String OrgName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "OrgName");
		String PaidWork = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "PaidWork");
		String Industry = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Industry");
		String OccupationLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"OccupationLevel");
		String PartTime = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "PartTime");
		String Designation = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"Designation");
		String JobDescription = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"JobDescription");
		String EmpSector = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "EmpSector");
		String EnglishWorkplace = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"EnglishWorkplace");
		String EmpStartDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"EmpStartDate");
		String EmpEndDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "EmpEndDate");
		String Address = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Address");
		String CountryorRegion = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"Country/Region");

		ElementUtil.Click(btn_addEmployment, "Add employeement button");
		Thread.sleep(5000);
		ElementUtil.Type(txt_orgName, OrgName);
		Thread.sleep(2000);
		ElementUtil.Type(txt_paidWork, PaidWork);
		Thread.sleep(2000);
		ElementUtil.Type(txt_industry, Industry);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(txt_partTime);
		Thread.sleep(2000);
		ElementUtil.Type(txt_partTime, PartTime);
		Thread.sleep(2000);
		ElementUtil.Type(txt_occupation, OccupationLevel);
		Thread.sleep(2000);
		ElementUtil.Type(txt_designation, Designation);
		Thread.sleep(2000);
		ElementUtil.Type(txt_description, JobDescription);
		Thread.sleep(2000);
		ElementUtil.Type(txt_empSector, EmpSector);
		Thread.sleep(2000);
		ElementUtil.Type(txt_engSpeaking, EnglishWorkplace);
		Thread.sleep(2000);
		ElementUtil.Type(txt_startDate, EmpStartDate);
		Thread.sleep(2000);
		ElementUtil.Type(txt_endDate, EmpEndDate);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(txt_address);
		Thread.sleep(2000);
		ElementUtil.type(txt_address, Address);
		Thread.sleep(2000);
		ElementUtil.Type(txt_countryRegion, CountryorRegion);
		Thread.sleep(2000);

	}

	public void addEmploymentHistoryTrain() throws InterruptedException, IOException {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData("OP_0008");
		String OrgName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "OrgName");
		String PaidWork = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "PaidWork");
		String Industry = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Industry");
		String OccupationLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"OccupationLevel");
		String PartTime = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "PartTime");
		String Designation = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"Designation");
		String JobDescription = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"JobDescription");
		String EmpSector = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "EmpSector");
		String EnglishWorkplace = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"EnglishWorkplace");
		String EmpStartDateTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"EmpStartDateTrain");
		String EmpEndDateTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"EmpEndDateTrain");
		String Address = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Address");
		String CountryorRegion = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"Country/Region");

		ElementUtil.Click(btn_addEmployment, "Add employement button");
		Thread.sleep(2000);
		ElementUtil.Type(txt_orgName, OrgName);
		Thread.sleep(2000);
		ElementUtil.Type(txt_paidWork, PaidWork);
		Thread.sleep(2000);
		ElementUtil.Type(txt_industry, Industry);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(txt_partTime);
		Thread.sleep(2000);
		ElementUtil.Type(txt_partTime, PartTime);
		Thread.sleep(2000);
		ElementUtil.Type(txt_occupation, OccupationLevel);
		Thread.sleep(2000);
		ElementUtil.Type(txt_designation, Designation);
		Thread.sleep(2000);
		ElementUtil.Type(txt_description, JobDescription);
		Thread.sleep(2000);
		ElementUtil.Type(txt_empSector, EmpSector);
		Thread.sleep(2000);
		ElementUtil.Type(txt_engSpeaking, EnglishWorkplace);
		Thread.sleep(2000);
		ElementUtil.Type(txt_startDate, EmpStartDateTrain);
		Thread.sleep(2000);
		ElementUtil.Type(txt_endDate, EmpEndDateTrain);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(txt_address);
		Thread.sleep(2000);
		ElementUtil.Type(txt_address, Address);
		Thread.sleep(2000);
		ElementUtil.Type(txt_countryRegion, CountryorRegion);
		Thread.sleep(1000);

	}

	// use
	public void switchHIstoryTab() throws InterruptedException {
		ElementUtil.switchToTab("HISTORY");
	}

	public void switchContractTab() throws InterruptedException {
		ElementUtil.switchToTab("CONTRACTS");
	}

	// use
	public void clickAddEducation() throws InterruptedException {
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(5000);
		ElementUtil.Click(btn_addEducation, "Add education button");
		Thread.sleep(2000);
	}

	// use
	public void addEducationHistory() throws Exception {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData("OP_0008");
		String FieldOfStudy = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"FieldOfStudy");
		String StudyMode = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "StudyMode");
		String StudyLanguage = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"StudyLanguage");
		String Status = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Status");
		String StudyCommencement = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"StudyCommencement");
		String GraduationDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"GraduationDate");
		String Grade = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Grade");
		String CountryOfStudy = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"CountryOfStudy");
		String DegreeType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "DegreeType");
		String DegreeName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "DegreeName");

		ElementUtil.waitForPageLoad();
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(txt_fieldOfStudy);
		Thread.sleep(2000);
		try {

			ElementUtil.Type(txt_fieldOfStudy, FieldOfStudy);
			Thread.sleep(2000);
		} catch (Exception e) {
			ElementUtil.Click(btn_addEducation, "Add education button");
			Thread.sleep(2000);

			ElementUtil.Type(txt_fieldOfStudy, FieldOfStudy);
			Thread.sleep(2000);
		}

		instititeIdPopup();
		Thread.sleep(5000);
		ElementUtil.waitForPageLoad();
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForElementClickable(txt_studyMode);
		Thread.sleep(2000);
		ElementUtil.Type(txt_studyMode, StudyMode);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForElementClickable(txt_language);
		Thread.sleep(2000);
		ElementUtil.Type(txt_language, StudyLanguage);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForElementClickable(txt_status);
		Thread.sleep(2000);
		ElementUtil.scrollToElement(txt_status);
		ElementUtil.Type(txt_status, Status);
		Thread.sleep(2000);
		ElementUtil.Type(txt_commenceDate, StudyCommencement);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(txt_graduationDate);
		Thread.sleep(2000);
		ElementUtil.Type(txt_graduationDate, GraduationDate);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(txt_grade);
		Thread.sleep(2000);
		ElementUtil.Type(txt_grade, Grade);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(txt_country);
		Thread.sleep(1000);
		ElementUtil.Type(txt_country, CountryOfStudy);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForElementClickable(txt_degreeType);
		Thread.sleep(2000);
		ElementUtil.Type(txt_degreeType, DegreeType);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(txt_degreeName);
		Thread.sleep(2000);
		ElementUtil.Type(txt_degreeName, DegreeName);
		Thread.sleep(2000);

	}

	// use
	public void saveHistoryPage() throws InterruptedException {
		ElementUtil.Click(btn_saveHistory, "Save history button");
		Thread.sleep(5000);
	}

	public static void instititeIdPopup() throws InterruptedException, IOException {

		String InstituteName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"InstituteName");

		ElementUtil.Click(btn_instituteId, "Institute ID");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(btn_instituteTabel);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(btn_instituteSearch);
		Thread.sleep(2000);
		ElementUtil.Click(btn_instituteSearch, "Institute search icon");
		Thread.sleep(2000);
		ElementUtil.Type(txt_instituteSearch, InstituteName);
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementNotPresent(Loading);
		ElementUtil.waitForElementClickable(btn_instituteTabel);
		Thread.sleep(2000);
		ElementUtil.Click(btn_instituteTabel, "Institute table row");
		Thread.sleep(2000);
	}

	/***************************************************************/
//Enter the enter_EnglishProficiecyTest_Status
	public void enter_EnglishProficiecyTest_Status() {

		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			String Nationality = exc.getData("IC_History").get(0).get("Status");
			Thread.sleep(4500);
			// ElementUtil.click(editBtn);
			ElementUtil.scrollToElement(status);
			Thread.sleep(1500);
			applPage.typeWithEnt(status, Nationality);
			// applPage.enterdata_OnMousehoverField(statusMouseHover, status, "Not Taken");
			Thread.sleep(2500);
			ElementUtil.click(save);
			Thread.sleep(3000);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	// Enter the enter_EnglishProficiecyTest_Status By Edit
	public void enter_EnglishProficiecyTest_Status_By_Edit(String testcaseNo) {

		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
			String sts = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICHistoryTestData",
					"Status");

			Thread.sleep(5500);
			try {
				if (ElementUtil.isElementDisplayed(editBtn)) {
					ElementUtil.click(editBtn);
				}
			} catch (Exception ex) {

			}

			Thread.sleep(2500);
			ElementUtil.scrollToElement(status);
			Thread.sleep(2500);
			ElementUtil.click(status);
			ElementUtil.type(status, sts);
			// applPage.selectDropdown(status, Nationality);
			// applPage.enterdata_OnMousehoverField(statusMouseHover, status, "Not Taken");
			Thread.sleep(2500);
			ElementUtil.click(save);
			Thread.sleep(2000);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void verifyEducationAddButton() {
		boolean education = DriverFactory.getDriver().findElement(btn_addEducationHistory).isDisplayed();
		if (education == true) {
			System.out.println("Education history add button exist");
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:green;font-weight:bold;'>" + "Education history add button exist" + "</span>");
		} else {
			System.out.println("Education history add button does not exist");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "Education history add button does not exist" + "</span>");
		}
	}

	public static void verifyEmploymentAddButton() {
		boolean education = DriverFactory.getDriver().findElement(btn_addEmployment).isDisplayed();
		if (education == true) {
			System.out.println("Employment history add button exist");
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:green;font-weight:bold;'>" + "Employment history add button exist" + "</span>");
		} else {
			System.out.println("Employment history add button does not exist");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "Employment history add button does not exist" + "</span>");
		}
	}

	public static void verifyEnglishAddButton() {
		boolean education = DriverFactory.getDriver().findElement(btn_addEnglishProficiency).isDisplayed();
		if (education == true) {
			System.out.println("English proficiency add button exist");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "English proficiency add button exist" + "</span>");
		} else {
			System.out.println("English proficiency add button does not exist");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "English proficiency add button does not exist" + "</span>");
		}
	}




	public static void clickSaveButton() throws InterruptedException {
		ElementUtil.Click(btn_globalSave, "Save button");
		Thread.sleep(2000);
		String label = DriverFactory.getDriver().findElement(lbl_headerMessage).getText();
		if (label.contains("Your entries have been saved")) {
			System.out.println(label);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + label + "</span>");
		} else {
			//Assert.assertFalse(true);
		}
	}

	public static void fillMandatoryEnglishProficiency() throws InterruptedException, IOException {
		String StatusEnglishTest1 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"StatusEnglishTest1");
		String TestType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "TestType");
		String TestScore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "TestScore");
		ElementUtil.waitForPageLoad();
		Thread.sleep(3000);
		ElementUtil.waitForElementClickable(drp_englishStatus);
		ElementUtil.Type(drp_englishStatus, StatusEnglishTest1);
		Thread.sleep(2000);
		ElementUtil.Type(drp_testType, TestType);
		Thread.sleep(2000);
		ElementUtil.Type(txt_testScore, TestScore);
		Thread.sleep(2000);

	}


	public static void verifyCoulumsEducationHistory() throws Exception {

		ElementUtil.comparePickList("Picklist", "EducationHistory", li_educationHistory);
	}

	public static void clickAddEducationHistoryButton() throws InterruptedException {
		ElementUtil.Click(btn_addEducation, "Add education history button");
		Thread.sleep(2000);
	}

	public static void clickAddEnglishProficiencyButton() throws InterruptedException {
		ElementUtil.Click(btn_addEnglish, "Add English proficiency button");
		Thread.sleep(2000);
	}
	public static void clickAddEmploymentHistoryButton() throws InterruptedException {
		ElementUtil.Click(btn_addEmployment, "Add Employment History button");
		Thread.sleep(2000);
	}


	public static void AddEducationHistory(String status, String country) throws InterruptedException, IOException {
		String FieldOfStudy = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"FieldOfStudy");
		String StudyMode = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "StudyMode");
		String StudyLanguage = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"StudyLanguage");
		String Status = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Status");
		String Status2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Status2");
		String Status3 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Status3");
		String StudyCommencement = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"StudyCommencement");
		String GraduationDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"GraduationDate");
		String Grade = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Grade");
		String CountryOfStudy = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"CountryOfStudy");
		String Country2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "Country2");
		String State = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "State");
		String DegreeType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "DegreeType");
		String DegreeName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage", "DegreeName");
		String DiscontinueReason = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"DiscontinueReason");
		String DiscontinueDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HistoryPage",
				"DiscontinueDate");

		ElementUtil.waitForPageLoad();
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(txt_fieldOfStudy);
		Thread.sleep(2000);
		try {

			ElementUtil.Type(txt_fieldOfStudy, FieldOfStudy);
			Thread.sleep(2000);
		} catch (Exception e) {
			ElementUtil.Click(btn_addEducation, "Add education button");
			Thread.sleep(2000);

			ElementUtil.Type(txt_fieldOfStudy, FieldOfStudy);
			Thread.sleep(2000);
		}

		instititeIdPopup();
		Thread.sleep(5000);
		ElementUtil.waitForPageLoad();
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForElementClickable(txt_studyMode);
		Thread.sleep(2000);
		ElementUtil.Type(txt_studyMode, StudyMode);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForElementClickable(txt_language);
		Thread.sleep(2000);
		ElementUtil.Type(txt_language, StudyLanguage);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForElementClickable(txt_status);
		Thread.sleep(2000);
		ElementUtil.scrollToElement(txt_status);
		if (status == "completed") {
			ElementUtil.Type(txt_status, Status);
			Thread.sleep(2000);
		} else if (status == "currently studying") {
			ElementUtil.Type(txt_status, Status2);
			Thread.sleep(2000);
		} else if (status == "discontinued") {
			ElementUtil.Type(txt_status, Status3);
			Thread.sleep(2000);
			ElementUtil.Type(txt_discontinuedReason, DiscontinueReason);
			Thread.sleep(2000);
			ElementUtil.Type(txt_discontinuedDate, DiscontinueDate);
			Thread.sleep(2000);

		}

		ElementUtil.Type(txt_commenceDate, StudyCommencement);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(txt_graduationDate);
		Thread.sleep(2000);
		ElementUtil.Type(txt_graduationDate, GraduationDate);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(txt_grade);
		Thread.sleep(2000);
		ElementUtil.Type(txt_grade, Grade);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(txt_country);
		Thread.sleep(1000);
		if (country == "Australia") {
			ElementUtil.Type(txt_country, Country2);
			Thread.sleep(2000);
			ElementUtil.Type(txt_state, State);
			Thread.sleep(2000);
		} else if (country == "india") {
			ElementUtil.Type(txt_country, CountryOfStudy);
			Thread.sleep(2000);
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForElementClickable(txt_degreeType);
		Thread.sleep(2000);
		ElementUtil.Type(txt_degreeType, DegreeType);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(txt_degreeName);
		Thread.sleep(2000);
		ElementUtil.Type(txt_degreeName, DegreeName);
		Thread.sleep(2000);

	}

	

	public static void verifyEnglishStatusPicklist() throws Exception 
	{
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_englishStatus);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "EnglishTestStatus", li_picklistOverview);
	}
}
