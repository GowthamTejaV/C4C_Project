package com.idpWebsite;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.IC_LeadCreationpage;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class IDP_RegistrationPage {
	IC_LeadCreationpage icLead = new IC_LeadCreationpage();
	private By searchCourseUnvSchBtn = By.xpath(".//span[contains(text(),'Search courses')]");
	private By courseSelectStdyLevelField = By.xpath("(.//div[text()='Select study level'])[1]");
	private By courseSelectCourseSubFld = By.xpath(".//input[contains(@aria-label,'Course subject')]");

	private By findMyIdeacourse = By.xpath(".//span[text()='Find my ideal course']");
	private By goToUniversityBtn = By.xpath(".//button[@title='Go to university']");

	private By findUniversityTabBtn = By.xpath(".//span[text()='Find a university']");
	private By findUniverUniversityNameField = By.xpath(".//input[contains(@aria-label,'University name')]");

	private By switchlanguageBtn = By.xpath(".//*[@name='language']");
	private By switchTOEnglishLanguage = By.xpath(".//option[text()='English']");

	private By spinnerLoading = By.xpath(".//div[@class='spinner']");

	private By signUpBtn = By.xpath(".//*[@class='usr_ar']//following-sibling::a");
	private By RegFtName = By.xpath(".//*[contains(@formcontrolname,'firstName')]//input");
	private By RegLtName = By.xpath(".//*[contains(@formcontrolname,'lastName')]//input");
	private By RegMob = By.xpath(".//*[contains(@formcontrolname,'mobileNumber')]//input");
	private By RegEmails = By.xpath(".//*[contains(@formcontrolname,'email')]//input");
	private By RegPwds = By.xpath(".//*[contains(@formcontrolname,'password')]//input");
	private By RegTC_and_PrivacyPolicy_checkBox = By.xpath(".//*[contains(@formcontrolname,'termsFlag')]");
	private By RegContMeth_checkBox = By.xpath(".//*[contains(@formcontrolname,'contactBy')]");
	private By RegMktPrefAcpt_checkBox = By.xpath(".//*[contains(@formcontrolname,'notificationFlag')]");

	private By create_AccBtn = By.xpath(".//ion-button[text()='Create an account']");
	private By iframes = By.xpath(".//iframe[(@id='CognitoIFrame')]");

	private By Completeprofileskip = By.xpath("(.//*[@href=\"javascript:void(0);\"])[5]");

	// private By searchCourse = By.xpath(".//*[text()='Search courses, universities
	// or scholarships']");
	private By searchCourse = By.xpath(".//*[contains(text(),'Search courses')]");
	private By Select_study_level_Option = By.xpath(".//div[text()='Select study level']/following-sibling::div/div");
	private By Select_study_level = By.xpath("(.//div[text()='Select study level'])[1]");
	private By courseSubject = By.xpath(".//*[@placeholder='Course subject e.g. law'='Course subject e.g. law']");
	private By Find_my_Ideal_Course = By.xpath(".//*[text()='Find my ideal course']");

	private By preferedStudyDestination = By.xpath(".//*[@id='preferedStudyDestination']/parent::div/i");
	private By eq_values = By.xpath(".//*[@class='menu transition visible']/div");

	private By preferedStudyPlanDate = By.xpath(".//*[@id='preferedStudyPlanDate']/parent::div");
	private By officeName = By.xpath(".//*[@id='officeName']/parent::div");
	private By preferredCounsellingMode = By.xpath(".//*[@id='preferredCounsellingMode']/parent::div");
	private By studentEssentialCode = By.xpath(".//*[@id='studentEssentialCode']/parent::div");
	private By nationality = By.xpath(".//*[@id='nationality']/parent::div");
	private By educationFunding = By.xpath(".//*[@id='educationFunding']/parent::div");
	private By studyLevel = By.xpath(".//*[@id='studyLevel']/parent::div");
	private By howDidYouHear = By.xpath(".//*[@id='howDidYouHear']/parent::div");

	private By Help_me_Study_Abroad = By.xpath(".//*[text()='Help me study abroad']");
	private By conactNowBtn = By.xpath(".//span[text()='Contact now.']");

	private By Your_journey_BegunTxt = By.xpath(".//*[text()='Your journey has begun']");

	private By loginBtn = By.xpath(".//*[text()='sign in.']");
	private By emailID = By.xpath(".//*[text()='Email address']/following-sibling::ion-input");
	private By emailID_field = By.xpath(".//ion-input[@formcontrolname='email']/input");
	private By password = By.xpath(".//ion-input /input[@type='password']");
	private By signIN = By.xpath(".//*[text()='Sign in']");
	private By iframe_loginPage = By.xpath(".//iframe[@id='CognitoIFrame']");

	private By leadCount = By.xpath(".//span[@data-help-id='SfUp96COrqwM5FPB46t8um-variantManagement-count']//bdi");

	// Student information for anonymous use
	private By firstname = By.xpath(".//*[@id='firstName']");
	private By lastname = By.xpath(".//*[@id='lastName']");
	private By emailAddress = By.xpath(".//*[@id='emailId']");
	private By mobieNo = By.xpath(".//*[@id='phoneNo']");
	private By termas_and_conditions_chkb = By
			.xpath(".//a[@target]/parent::label[normalize-space(text())='I agree to IDP']/parent::div//input");
	private By contactMethod_chkb = By.xpath(".//label[@for='contactMethod']");
	private By marketingPrefer_chkb = By.xpath(".//label[@for='marketingPreferenceAcceptance']");

	public void searchtheCourseThroughCourseSection() {
		ElementUtil.click(searchCourseUnvSchBtn);
		select_From_DropDown(courseSelectStdyLevelField, eq_values, "Postgraduate");
		ElementUtil.type(courseSelectCourseSubFld, "Computer Science");
		ElementUtil.click(findMyIdeacourse);

	}

	public void searchUniversity() {
		ElementUtil.click(searchCourseUnvSchBtn);
		ElementUtil.click(findUniversityTabBtn);
		ElementUtil.type(findUniverUniversityNameField, "The university of New england");
		ElementUtil.click(By.xpath(".//p[contains(text(),'Choose an institution')]/parent::ul/li/span"));
		ElementUtil.click(goToUniversityBtn);
	}

	public void login_to_IDP_Website(String emailId, String psw) {

		WebElement elementFrames = DriverFactory.getDriver().findElement(iframe_loginPage);
		DriverFactory.getDriver().switchTo().frame(elementFrames);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(emailID);
		ElementUtil.type(emailID_field, emailId);
		ElementUtil.click(password);
		ElementUtil.type(password, psw);
		ElementUtil.click(signIN);
	}

	public String get_Lead_Count() {

		try {
			icLead.clickOnRefreshButton();
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(5800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ElementUtil.getText(leadCount).replace("(", "").replace(")", "").trim();
	}

	// Select the Drop Down Method
	public void select_From_DropDown(By dropDown, By dropDownValues, String str) {
		ElementUtil.click(dropDown);
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> ele = DriverFactory.getDriver().findElements(dropDownValues);

		for (WebElement el : ele) {
			if (el.getText().contains(str)) {
				try {
					Thread.sleep(1200);
					el.click();
				} catch (ElementClickInterceptedException ex) {
					((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].scrollIntoView();",
							el);
					ElementUtil.clickJS(el);
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
	}

//Switch for the English language
//	public void switch_To_English_Language() {
//		// waitForLoadGetDisappiera();
//		ElementUtil.click(switchlanguageBtn);
//		ElementUtil.click(switchTOEnglishLanguage); 
//
//	}

	public void waitForLoadGetDisappiera() {

		ElementUtil.waitForElementNotPresent(spinnerLoading);
	}

	// Register for the Student
	public void registerFor_Student() {
		String FnamePrefix = "IDP_VGT_";
		String Fname = ElementUtil.generateRandomString(4);
		String Lname = ElementUtil.generateRandomString(4);
		String Pemail = ElementUtil.generateEmail(7);
		System.out.println("vgt_" + Pemail);
		ConfigReader.writeToApplicationPropertie("IDP_STUDENT", "vgt_" + Pemail);
		String modNo = ElementUtil.generateRandomNumber(10);
		String updatedmodNo = modNo.replace(modNo.substring(0, 3), "999");

		ElementUtil.click(signUpBtn);
		WebElement elementFrames = DriverFactory.getDriver().findElement(iframes);
		DriverFactory.getDriver().switchTo().frame(elementFrames);
		ElementUtil.type(RegFtName, FnamePrefix + Fname);
		ElementUtil.type(RegLtName, Lname);
		ElementUtil.type(RegMob, updatedmodNo);
		ElementUtil.type(RegEmails, "vgt_" + Pemail);
		ElementUtil.type(RegPwds, "Test@123");
		ElementUtil.click(RegTC_and_PrivacyPolicy_checkBox);
		ElementUtil.click(RegContMeth_checkBox);
		ElementUtil.click(RegMktPrefAcpt_checkBox);
		try {
			Thread.sleep(3400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(create_AccBtn);
		waitForLoadGetDisappiera();
		ElementUtil.click(Completeprofileskip);
		// waitForLoadGetDisappiera();
	}

	// Search find the courses
	public void searchFor_The_findCourses(String studylevel, String course) {

		// Computer Graphics
		// "Computer science "
		// "Undergraduate"
		try {
			Thread.sleep(2500);
			ElementUtil.click(searchCourse);
			Thread.sleep(2500);
			select_From_DropDown(Select_study_level, Select_study_level_Option, studylevel);
			ElementUtil.type(courseSubject, course);
			Thread.sleep(2400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(Find_my_Ideal_Course);

	}

	// anonymous user details
	public void anonymousUser() {
		String FnamePrefix = "IDP_VGT_Anonymous_";
		String Fname = ElementUtil.generateRandomString(4);
		String Lname = ElementUtil.generateRandomString(4);
		String Pemail = ElementUtil.generateEmail(7);
		System.out.println("vgt_" + Pemail);
		ConfigReader.writeToApplicationPropertie("IDP_STUDENT", "vgt_" + Pemail);
		String modNo = ElementUtil.generateRandomNumber(10);
		String updatedmodNo = modNo.replace(modNo.substring(0, 3), "999");

		ElementUtil.type(firstname, FnamePrefix + Fname);
		ElementUtil.type(lastname, Lname);
		ElementUtil.type(emailAddress, "vgt_" + Pemail);
		ElementUtil.type(mobieNo, updatedmodNo);

	}

	// Submit Student Enquire for anonymous user
	public void submit_studentEnquiry_For_AnonymousUser() {
		try {
			anonymousUser();
			select_From_DropDown(preferedStudyDestination, eq_values, "Australia");
			select_From_DropDown(preferedStudyPlanDate, eq_values, "Jul 2023");
			select_From_DropDown(officeName, eq_values, "Chennai - Adyar");
			select_From_DropDown(preferredCounsellingMode, eq_values, "Virtual Counselling");
			select_From_DropDown(studentEssentialCode, eq_values, "Bank account");
			select_From_DropDown(nationality, eq_values, "India"); // Bank Loan
			select_From_DropDown(educationFunding, eq_values, "Bank Loan");
			select_From_DropDown(studyLevel, eq_values, "Postgraduate");
			select_From_DropDown(howDidYouHear, eq_values, "Social media");
        
			ElementUtil.click(termas_and_conditions_chkb);
			ElementUtil.click(contactMethod_chkb);
			ElementUtil.click(marketingPrefer_chkb);
			Thread.sleep(2400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ElementUtil.isElementDisplayed(conactNowBtn)) {
			ElementUtil.click(conactNowBtn);
		} else if (ElementUtil.isElementDisplayed(Help_me_Study_Abroad)) {
			ElementUtil.click(Help_me_Study_Abroad);
		}

	}
	public void registr_submit_For_studentEnquiry() {
		select_From_DropDown(preferedStudyDestination, eq_values, "Canada");
		select_From_DropDown(preferedStudyPlanDate, eq_values, "Jul 2023");
		select_From_DropDown(officeName, eq_values, "Chennai - Adyar");
		select_From_DropDown(preferredCounsellingMode, eq_values, "Virtual Counselling");
		select_From_DropDown(studentEssentialCode, eq_values, "Bank account");
		select_From_DropDown(nationality, eq_values, "India"); // Bank Loan
		select_From_DropDown(educationFunding, eq_values, "Bank Loan");
		select_From_DropDown(studyLevel, eq_values, "Postgraduate");
		select_From_DropDown(howDidYouHear, eq_values, "Social media");
		
		if (ElementUtil.isElementDisplayed(conactNowBtn)) {
			System.out.println("conact Now Button is visible");
			ElementUtil.Jclick(conactNowBtn);
		} else if (ElementUtil.isElementDisplayed(Help_me_Study_Abroad)) {
			System.out.println("Help Me Study is visible");
			ElementUtil.click(Help_me_Study_Abroad);
		}
	}

//
	// Submit for Student Enquiry
	public void submit_For_studentEnquiry() {
		select_From_DropDown(preferedStudyDestination, eq_values, "Canada");
		select_From_DropDown(preferedStudyPlanDate, eq_values, "Jul 2023");
		select_From_DropDown(officeName, eq_values, "Chennai - Adyar");
		select_From_DropDown(preferredCounsellingMode, eq_values, "Virtual Counselling");
		select_From_DropDown(studentEssentialCode, eq_values, "Bank account");
		select_From_DropDown(nationality, eq_values, "India"); // Bank Loan
		select_From_DropDown(educationFunding, eq_values, "Bank Loan");
		select_From_DropDown(studyLevel, eq_values, "Postgraduate");
		select_From_DropDown(howDidYouHear, eq_values, "Social media");
		try {
			Thread.sleep(2400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 ElementUtil.jsClick(termas_and_conditions_chkb);
//			WebDriverWait wait=new WebDriverWait(DriverFactory.getDriver(),Duration.ofSeconds(6));
//			wait.until(ExpectedConditions.elementToBeClickable(termas_and_conditions_chkb)).click();
			//ElementUtil.click(termas_and_conditions_chkb);
		
		if (ElementUtil.isElementDisplayed(contactMethod_chkb)) {
			ElementUtil.click(contactMethod_chkb);
		}
		if (ElementUtil.isElementDisplayed(marketingPrefer_chkb)) {
			ElementUtil.click(marketingPrefer_chkb);
		}
		

		if (ElementUtil.isElementDisplayed(conactNowBtn)) {
			System.out.println("conact Now Button is visible");
			ElementUtil.Jclick(conactNowBtn);
		} else if (ElementUtil.isElementDisplayed(Help_me_Study_Abroad)) {
			System.out.println("Help Me Study is visible");
			ElementUtil.click(Help_me_Study_Abroad);
		}
	}

	// Get Your journey has begun txt
	public String get_Your_journey_Begun_Txt() {

		return ElementUtil.getText(Your_journey_BegunTxt);
	}

}
