package com.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;
import AppHooks.ApplicationHooks;

public class HotCoursesPage {
	public static String marketting = "";
	private static By btn_cookie = By.xpath("//a[text()='Allow All']");
	private static By btn_studyAbroad = By.xpath("//a[contains(text(),'HELP ME STUDY ABROAD')]");
	private static By txt_firstName = By.xpath("//input[@id='firstName']");
	private static By txt_lastName = By.xpath("//input[@id='lastName']");
	private static By txt_email = By.xpath("//input[@id='email']");
	private static By txt_mobileNumber = By.xpath("//input[@id='phoneNo']");
	private static By drp_countryCode = By.xpath("//select[@id='countryCode']");
	private static By drp_studyLevel = By.xpath("//select[@id='qualCode']");
	private static By drp_studyLocation = By.xpath("//select[@id='destiCountryId']");
	private static By drp_month = By.xpath("//select[@id='monthRange']");
	private static By drp_year = By.xpath("//select[@id='yearRange']");
	private static By chk_confirmAge = By.xpath("//input[@id='idptermsFlag']");
	private static By chk_agreeEnquiry = By.xpath("//input[@id='contactbymeFlag']");
	private static By chk_termsCondition = By.xpath("//input[@id='idpSubFlag']");
	private static By btn_speakToExpert = By.xpath("//input[@id='call_us_sub_btn']");
	private static By btn_Submit = By.xpath("//input[@id='call_us_veri_sub']");
	private static By btn_skipAll = By.xpath("//a[text()='Skip all']");
	private static By btn_Yes = By.xpath("//input[@value='Yes']");
	private static By txt_password = By.xpath("//input[@id='password']");
	private static By chk_content = By.xpath("//input[@id='marketingFlag']");
	private static By chk_University = By.xpath("//input[@id='solusFlag']");
	private static By chk_survey = By.xpath("//input[@id='surveyFlag']");
	private static By btn_registerNow = By.xpath("//input[@id='cbthankubtn']");
	private static By btn_profile = By.xpath("//a[@id='topNavlogIcn']");
	private static By txt_enterEmail = By.xpath("//input[@id='emailadd']");
	private static By txt_enterPassword = By.xpath("//input[@id='regpassword']");
	private static By btn_loginHC = By.xpath("//input[@id='loginbtn']");
	private static By btn_hcSearchIcon = By.xpath("//a[@id='topNavSrchIcn']");
	private static By txt_searchCourse = By.xpath("//input[@id='topNavSrch']");
	private static By li_utsCollege = By.xpath("//div[@id='topNav_srch_div']//ul[@id='topNvUnivUl']//li[1]");
	private static By btn_helpMeApply = By.xpath("(//div[@id='nonAdvBanner']//div[@id='stickyTop']//span)[1]");
	private static By lbl_markettingPermission = By.xpath("//bdi[text()='Marketing Acceptance']//following::span[1]");
	private static By lbl_siteId = By.xpath("//bdi[text()='Source Site ID']//following::span[1]");
	private static By lbl_Url = By.xpath("//bdi[text()='Referring URL']//following::a[1]");
	private static By lbl_nearesrOffice = By.xpath("//bdi[text()='IDP Nearest Office']//following::span[1]");
	private static By lbl_firstLead = By.xpath("//bdi[text()='FirstLead?']//following::span[1]");
	private static By btn_inPerson = By.xpath("(//div[@id='otpverify']//following::span[@class='countxt'])[2]");
	private static By drp_selectIDP = By.xpath("//select[@id='officeId']");
	private static By btn_onlineTab = By.xpath("//div[@role='tab']//div[text()='ONLINE']");

	String firstName = "";

	String lastName = "";

	public String email = "";
	String mobileNumber = "9" + ElementUtil.generateRandomNumber(9);

	public void launchURL(String url) throws IOException {
		ElementUtil.navigateToURL(url);
	}

	public void acceptCookies() throws InterruptedException {
		ElementUtil.Click(btn_cookie, "Accept cookies");
		Thread.sleep(2000);
	}

	public void saveEmail() {
		ConfigReader.writeToApplicationPropertie("HCEmail", email);
	}

	public void studyAbroad() throws InterruptedException {
		ElementUtil.scrollToElement(btn_studyAbroad);
		Thread.sleep(2000);
		ElementUtil.Click(btn_studyAbroad, "Study abroad button");
	}

	public void firstName() throws InterruptedException, IOException {
		firstName = "HC" + ElementUtil.generateRandomString(10);

		Thread.sleep(2000);
		ElementUtil.Type(txt_firstName, firstName);
	}

	public void lastName() throws InterruptedException, IOException {
		lastName = "Student";
		Thread.sleep(2000);
		ElementUtil.Type(txt_lastName, lastName);
	}

	public void email() throws InterruptedException, IOException {
		// String Email = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
		// "HotCourses", "Email");
		email = firstName + "@yopmail.com";
		Thread.sleep(2000);
		ElementUtil.Type(txt_email, email);
	}

	public void emailExistinguser() throws InterruptedException, IOException {
		// String Email = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
		// "HotCourses", "Email");
		email = ConfigReader.getApplicationPropertie("HCEmail");
		Thread.sleep(2000);
		ElementUtil.Type(txt_email, email);
	}

	public void mobileNumber() throws InterruptedException, IOException {
		String MobileNo = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HotCourses", "MobileNo");
		Thread.sleep(2000);
		Select countryCode = new Select(DriverFactory.getDriver().findElement(By.xpath("//select[@id='countryCode']")));
		try {
			countryCode.selectByVisibleText("India (+91)");
			Thread.sleep(2000);
			ElementUtil.Type(txt_mobileNumber, MobileNo);
			Thread.sleep(2000);
		} catch (Exception e) {
			ElementUtil.Type(txt_mobileNumber, MobileNo);
			Thread.sleep(2000);
		}
	}

	public void studyLevel() throws InterruptedException, IOException {
		String StudyLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HotCourses", "StudyLevel");
		Thread.sleep(2000);
		Select sLevel = new Select(DriverFactory.getDriver().findElement(By.xpath("//select[@id='qualCode']")));
		sLevel.selectByVisibleText(StudyLevel);
	}

	public void studyLocation() throws InterruptedException, IOException {
		String StudyLocation = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HotCourses",
				"StudyLocation");

		Thread.sleep(2000);
		Select sLocation = new Select(
				DriverFactory.getDriver().findElement(By.xpath("//select[@id='destiCountryId']")));
		sLocation.selectByVisibleText(StudyLocation);
	}

	public void month() throws InterruptedException, IOException {
		String Month = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HotCourses", "Month");
		Thread.sleep(2000);
		Select sMonth = new Select(DriverFactory.getDriver().findElement(By.xpath("//select[@id='monthRange']")));
		sMonth.selectByVisibleText(Month);
	}

	public void Year() throws InterruptedException, IOException {
		String Year = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HotCourses", "Year");

		Thread.sleep(2000);
		Select sYear = new Select(DriverFactory.getDriver().findElement(By.xpath("//select[@id='yearRange']")));
		sYear.selectByVisibleText(Year);
	}

	public void termsAndCondition() {
		ElementUtil.Click(chk_confirmAge, "Confirm age toggle");
		ElementUtil.Click(chk_agreeEnquiry, "Agree enquiry checkbox");
		ElementUtil.Click(chk_termsCondition, "Terms and conditions checkbox");
	}

	public void termsAndConditionWithoutMarket() {
		ElementUtil.Click(chk_confirmAge, "Confirm age toggle");
		ElementUtil.Click(chk_agreeEnquiry, "Agree enquiry checkbox");
	}

	public void speakToExpert() throws InterruptedException {

		ElementUtil.scrollToElement(btn_speakToExpert);
		Thread.sleep(1000);
		ElementUtil.Click(btn_speakToExpert, "Speak to expert button");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
	}

	public static void submit() throws InterruptedException, IOException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.scrollToElement(btn_Submit);
		Thread.sleep(2000);
		ElementUtil.Click(btn_Submit, "Submit button");
		Thread.sleep(2000);

	}

	public void skipAll() throws InterruptedException {

		ElementUtil.waitForElementClickable(btn_skipAll);
		Thread.sleep(2000);
		ElementUtil.Click(btn_skipAll, "Skip all button");
		Thread.sleep(2000);
	}

	public void popupYes() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.Click(btn_Yes, "Yes button");
		Thread.sleep(2000);
	}

	public void createPassword() throws InterruptedException, IOException {
		String CreatePassword = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HotCourses",
				"CreatePassword");

		ElementUtil.waitForPageLoad();
		Thread.sleep(5000);
		ElementUtil.Type(txt_password, CreatePassword);
	}

	public void register() {
		ElementUtil.Click(chk_content, "contetn check box");
		ElementUtil.Click(chk_University, "University check box");
		ElementUtil.Click(chk_survey, "Survey button");
		ElementUtil.Click(btn_registerNow, "Register now button");
	}

	public void clickMyProfile() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.Click(btn_profile, "Profile button");
		Thread.sleep(2000);
	}

	public void enterEMail() throws InterruptedException, IOException {
		Thread.sleep(2000);
		ElementUtil.Type(txt_enterEmail, ConfigReader.getApplicationPropertie("HCEmail"));
		Thread.sleep(2000);
	}

	public void enterPassword() throws InterruptedException, IOException {
		String CreatePassword = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HotCourses",
				"CreatePassword");
		Thread.sleep(2000);
		ElementUtil.TypeWithoutEnter(txt_enterPassword, CreatePassword);
	}

	public void clickLoginHC() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.Click(btn_loginHC, "Login hotcourses");
		Thread.sleep(3000);

	}

	public void clickSearchHC() throws InterruptedException {

		ElementUtil.waitForElementClickable(btn_hcSearchIcon);
		Thread.sleep(5000);
		ElementUtil.Click(btn_hcSearchIcon, "Hot courses search icon");
		Thread.sleep(2000);
	}

	public void searchCourse() throws InterruptedException, IOException {
		String SearchCourse = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "HotCourses",
				"SearchCourse");

		ElementUtil.Type(txt_searchCourse, SearchCourse);
		ElementUtil.waitForElementClickable(li_utsCollege);
		Thread.sleep(2000);
		ElementUtil.Click(li_utsCollege, "College list");
		Thread.sleep(2000);
	}

	public void helpToApply() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.Click(btn_helpMeApply, "Help me to apply button");
		Thread.sleep(2000);
	}

	public boolean verifySuccess() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(5000);
		String ele = DriverFactory.getDriver()
				.findElement(By.xpath("//div[@id='incidentSuccess']//div[@class='family']")).getText();
		Thread.sleep(2000);
		System.out.println(ele);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>" + ele + "</span>");

		if (ele.contains("Your request to get application guidance for this university has been sent")) {
			return true;

		} else {
			return false;
		}
	}

	public static void switchToOnlineTab() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		try 
		{
			ElementUtil.waitForPageLoad();
			ElementUtil.scrollToElement(btn_onlineTab);
			Thread.sleep(5000);
			ElementUtil.Click(btn_onlineTab, "Online tab");
			Thread.sleep(2000);
			
		}catch(Exception e) 
		{
			ElementUtil.switchToTab("ONLINE");
			Thread.sleep(2000);
		}
		
	}

	public static void verifySiteID() {
		String siteId = DriverFactory.getDriver().findElement(lbl_siteId).getText();

		if (siteId.contains("India")) {
			System.out.println("Verified :" + siteId);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Verified site Id has been updated : " + siteId + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyURL() throws InterruptedException {
		String Url = DriverFactory.getDriver().findElement(lbl_Url).getText();

		if (Url.contains("india")) {
			System.out.println("Verified :" + Url);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Verified url has been updated : " + Url + "</span>");
			Thread.sleep(2000);

		}

		else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyNearestIDPOffice() {
		String idpOffice = DriverFactory.getDriver().findElement(lbl_nearesrOffice).getText();

		if (idpOffice != "") {
			System.out.println("Verified :" + idpOffice);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Verified nearesr IDP office has been updated : " + idpOffice + "</span>");
		} else {
			// Assert.assertFalse(true);
		}
	}

	public static void verifyFirstLead() {
		String firstLead = DriverFactory.getDriver().findElement(lbl_firstLead).getText();

		if (firstLead.equals("Yes")) {
			System.out.println("Verified :" + firstLead);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Verified first lead set as : " + firstLead + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifySecondLead() {
		String secondLead = DriverFactory.getDriver().findElement(lbl_firstLead).getText();

		if (secondLead.equals("No")) {
			System.out.println("Verified :" + secondLead);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Verified first lead set as : " + secondLead + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyMArkettingPermissionNo() {
		marketting = DriverFactory.getDriver().findElement(lbl_markettingPermission).getText();

		if (marketting.equals("No")) {
			System.out.println("Verified :" + marketting);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Verified marketting permission set as : " + marketting + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void verifyMArkettingPermissionYes() {
		marketting = DriverFactory.getDriver().findElement(lbl_markettingPermission).getText();

		if (marketting.equals("Yes")) {
			System.out.println("Verified :" + marketting);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Verified marketting permission set as : " + marketting + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void selectInPersonCounselling() throws InterruptedException {
		ElementUtil.Click(btn_inPerson, "In-person counselling mode");
		Thread.sleep(2000);
	}

	public static void selectIDPOffice() throws InterruptedException, IOException {
		Select idpOffice = new Select(DriverFactory.getDriver().findElement(By.xpath("//select[@id='officeId']")));
		idpOffice.selectByVisibleText("Coimbatore");
		Thread.sleep(2000);
		submit();
		Thread.sleep(2000);
	}

	// Login to the Hot courses Application
	public static void loginTo_HotCourses_Application(String role, String env, String testCaseNo) {
		System.out.println(testCaseNo);
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		Map<String, String> credData = new Login().getCredentials(role, env);
		String url = credData.get("url");
		System.out.println(url);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ElementUtil.navigateToURL(url);
	}
}
