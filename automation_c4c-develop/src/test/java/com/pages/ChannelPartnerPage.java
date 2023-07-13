package com.pages;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;
import com.qa.util.WaitsUtil;

import AppHooks.ApplicationHooks;

public class ChannelPartnerPage {

	/*********************** VGT **********************/
	IC_CreationPage icp = new IC_CreationPage();
	ApplicationPageUtil appUtil = new ApplicationPageUtil();
	OP_DocumentsPage uploadDoc = new OP_DocumentsPage();
	IC_Opportunitypage opportunity = new IC_Opportunitypage();

	// Verification In Progress Tab

	private By getStudentID = By
			.xpath(".//bdi[text()='Student ID']/parent::span/parent::span/parent::div/following-sibling::div/span");
	private By getName = By
			.xpath(".//bdi[text()='Name']/parent::span/parent::span/parent::div/following-sibling::div/span");
	private By getNonEnglishName = By.xpath(
			".//bdi[text()='Non English Name']/parent::span/parent::span/parent::div/following-sibling::div/span");
	private By getcreatedOn = By
			.xpath(".//bdi[text()='Created On']/parent::span/parent::span/parent::div/following-sibling::div/span");
	private By getStatus = By
			.xpath(".//bdi[text()='Status']/parent::span/parent::span/parent::div/following-sibling::div/span");

	// get StudentID
	public String getStudentID_From_VerificationInProgressTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getText(getStudentID);
	}

	public boolean isStudentID_From_VerificationInProgressTabisVisble() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.isElementDisplayed(getStudentID);
	}

	// get Name
	public String getName_From_VerificationInProgressTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getText(getName);
	}

	// isName displaying
	public boolean isName_From_VerificationInProgressTabisVisible() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.isElementDisplayed(getName);
	}

	// get Non EnglishName
	public boolean isNonEnglishName_From_VerificationInProgressTabisVisible() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.isElementDisplayed(getNonEnglishName);

	}

	// is created On field is visible
	public boolean isCreatedIsVisible() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.isElementDisplayed(getcreatedOn);
	}

	// is Status field is visible
	public boolean isStatusIsVisible() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.isElementDisplayed(getStatus);
	}

	// get Status
	public String getStatus_From_VerificationInProgressTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getText(getStatus);
	}

	// Employee History Tab

	private By organizationName = By.xpath(".//input[contains(@id,'idOrgName')]");
	private By occupationLevel = By.xpath(".//input[contains(@id,'idOccupation')]");
	private By designation = By.xpath(".//input[contains(@id,'idDesg')]");
	private By country = By.xpath(".//input[contains(@id,'idEmpCountry')]");
	private By startdate = By.xpath(".//input[contains(@id,'isEmpStartDate')]");
	private By endDate = By.xpath(".//input[contains(@id,'isEmpEndtDate')]");
	private By description = By.xpath(".//input[contains(@id,'iddescription')]");
	private By employMentSection = By.xpath(".//input[contains(@id,'idEmpSector')]");
	private By employMentDropDownBtn = By.xpath(".//input[contains(@id,'idEmpSector')]/following-sibling::div");
	private By industry = By.xpath(".//input[contains(@id,'idIndustry')]");
	private By eng_speaking_wrkplance = By.xpath(".//input[contains(@id,'idEngSpeaking')]");
	private By engSpeakingWrkplanceDropDownBtn = By
			.xpath(".//input[contains(@id,'idEngSpeaking')]/following-sibling::div");
	private By paidWrk = By.xpath(".//input[contains(@id,'idPaidWork')]");
	private By paidWrkDropDownBtn = By.xpath(".//input[contains(@id,'idPaidWork')]/following-sibling::div");
	private By address = By.xpath(".//input[contains(@id,'idaddress')]");
	private By partTime = By.xpath(".//input[contains(@id,'idParttime')]");
	private By partTimeDropDownBtn = By.xpath(".//input[contains(@id,'idParttime')]/following-sibling::div");
	private By partTimeHrs = By.xpath(".//input[contains(@id,'idParttimeHrs')]");

	private By getEmploymentSectorvalues = By
			.xpath(".//ul[contains(@id,'idEmpSector')]/li/descendant-or-self::div/div/div");
	private By getengSpeakingWrkplanceDropDownValues = By
			.xpath(".//ul[contains(@id,'idEngSpeaking')]/li/descendant-or-self::div/div/div");
	private By getidPaidWorkDropDownValues = By
			.xpath(".//ul[contains(@id,'idPaidWork')]/li/descendant-or-self::div/div/div");
	private By getpartTimeDropDownValues = By
			.xpath(".//ul[contains(@id,'idParttime')]/li/descendant-or-self::div/div/div");
	// Attachment popup text
	private By getAttachmentPopupTxt = By.xpath(".//span[text()='Add New Record']");
	// Education History Tab

	private By addNewRecordBtn_EducationHst = By.xpath(".//*[contains(@data-sap-ui,'idAddIcon_Edu')]");
	private By addNewRecordBtn_EemploymentHst = By.xpath(".//*[contains(@data-sap-ui,'idAddIcon_Emp')]");
	private By addNewRecordBtn_attachments = By.xpath(".//*[contains(@data-sap-ui,'idAddIcon_attachments')]");

	private By instuteName = By.xpath(".//input[contains(@id,'InstuteName')]");
	private By LanguageOfStudy = By.xpath(".//input[contains(@id,'idLang')]");
	private By commencementOfStudy = By.xpath(".//input[contains(@id,'idStudyDate')]");
	private By graduationDate = By.xpath(".//input[contains(@id,'idGardDate')]");
	private By degreeType = By.xpath(".//input[contains(@id,'idDegreeType')]");
	private By degreeName = By.xpath(".//input[contains(@id,'idDegreeName')]");
	private By StudyMode = By.xpath(".//input[contains(@id,'idStudyMode')]");
	private By CountryofStudy = By.xpath(".//input[contains(@id,'idStudyCountry')]");
	private By fieldofstudy = By.xpath(".//input[contains(@id,'idFieldodstudy')]");
	private By grade = By.xpath(".//input[contains(@id,'idgrade')]");
	private By status = By.xpath(".//input[contains(@id,'idStatus')]");

	private By createSuccussPopup_edu_hist = By.xpath(".//span[text()='Data Posted Successfully.']");
	private By specifyPartimehrsPopup = By.xpath(".//span[text()='\"Specify Partime hours\"']");

	private By generatTab_homeScreen = By.xpath(".//div[text()='General']");
	private By profileIcon = By.xpath(".//span[contains(@title,'Profile of')]");
	private By signOut = By.xpath(".//div[contains(text(),'Sign Out')]");
	private By signOut_confirmPopup = By.xpath(".//bdi[contains(text(),'OK')]");
	private By signInAgain = By.xpath(".//a[text()='Sign in again']");
	private By getInvalidLoginErrorMessage = By
			.xpath(".//span[text()='Sorry, we could not authenticate you. Try again.']");

	private By verificationInProgresStudentnamelink = By
			.xpath("(.//tr[contains(@id,'c4cTable')]/child::td/following-sibling::td)[2]");

	private By user_name = By.xpath(".//*[@id='j_username']");
	private By passwor = By.xpath(".//*[@id='j_password']");
	private By logOnButton = By.xpath(".//div[text()='Log On']");
	private By Submit_Student_Application_tab = By.xpath(".//span[text()='Submit Student Application']");
	private By educationHistory = By.xpath(".//span[text()='Education History']");
	private By applications_InProcess_tab = By.xpath(".//*[text()='Applications In Process']");
	private By verificationInProgress = By.xpath(".//*[text()='Verification In Progress']");
	private By firstname = By.xpath(".//div/descendant::input[contains(@id, 'firstName')]");
	private By lastname = By.xpath(".//div/descendant::input[contains(@id, 'lastName')]");
	private By non_English_Name = By.xpath(".//div/descendant::input[contains(@id, 'nonEnglishName')]");
	private By dob = By.xpath(".//div/descendant::input[contains(@id, 'idDateofBirth')]");
	private By preferred_Destination = By.xpath(".//div/descendant::input[contains(@id, 'idDestCountry')]");
	private By email = By.xpath(".//div/descendant::input[contains(@id, 'idEmailID')]");
	private By closeBttn_popup = By.xpath(".//*[text()='Close']");

	private By saveButton = By.xpath(".//*[text()='Save']");
	private By saveShoulbeFails_firstname = By.xpath(".//div[text()='Name Contains illegal Characters.']");
	private By saveShoulbeFails_lastname = By.xpath(".//div[text()='Last Name Contains illegal Characters.']");
	private By futureDOB_errorMsg = By.xpath(".//span[text()='\"Date cannot be in the future\"']");
	private By cacelDOBerrorPopu = By.xpath(".//bdi[text()='Close']");
	private By requiredfields_errorMsg = By.xpath(".//div[text()='Maintain all required fields.']");
	private By errorMsg_cmntDate_grt = By
			.xpath(".//div[text()='Graduation Date should be greater than Commencement Date.']");

	private By nextButton = By.xpath(".//*[text()='Next']");

	private By add_newFileIcon = By.xpath(".//*[@title='Add new file']");

	private By filename = By.xpath(".//input[contains(@id,'idDocName')]");

	private By fileBrowseBtn = By.xpath(".//bdi[text()='Browse...']");

	private By saveUploadDoc = By.xpath(".//bdi[text()='Save']");

	private By submitbutton = By.xpath(".//*[text()='Submit']");

	private By successPopup = By.xpath(".//span[text()='SUCCESS']");
	private By getSuccesspopupTextafterSumbit = By.xpath(
			".//span[contains(text(),\"Application Submitted Successfully.To Upload additional documents please goto 'Verification in Progress Application' in the Landing Dashboard.\")]");
	private By successPopup_OK = By.xpath(".//*[text()='OK']");

	private By studentID = By.xpath(".//input[contains(@id, 'idStudentID')]");

	public HashSet<String> getPickListvaluesfrom_EmploymentHistoryPage(String eleTxt) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HashSet<String> values = new HashSet<String>();
		List<WebElement> wbele = DriverFactory.getDriver()
				.findElements(By.xpath(".//ul[contains(@id,'" + eleTxt + "')]/li/descendant-or-self::div/div/div"));
		for (WebElement ele : wbele) {
			String str = ele.getText().trim();
			values.add(str.trim());
		}
		return values;
	}

	// get the success pop up text after creating the record successfully in
	// education history
	public String get_Success_popup_text_Eudcation_history_record() {
		String txt;
		txt = ElementUtil.getText(createSuccussPopup_edu_hist);
		click_On_CloseButton_On_Success_popup();
		return txt;
	}

	// get the specify Partime hours popup text
	public String get_specifyPartimehours_text() {
		String txt;
		txt = ElementUtil.getText(specifyPartimehrsPopup);
		click_On_CloseButton_On_Success_popup();
		return txt;
	}

	// getAttachment popup text
	public String getAttachmentPopupTxt_text() {
		String txt;
		txt = ElementUtil.getText(getAttachmentPopupTxt);
		return txt;
	}

	//

	// Verify the General tab is displaying
	public boolean isGenrealTab_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.isElementDisplayed(generatTab_homeScreen);

	}

	// Verify the educationHistory tab is displaying
	public boolean iseducationHistoryTab_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.isElementDisplayed(educationHistory);

	}

	// get the future data error message
	public String getFutureDOB_ErrorMessage() {
		String str;
		ApplicationPageUtil.waitForLoadGetDisappiear();
		str = ElementUtil.getText(futureDOB_errorMsg);
		ElementUtil.click(cacelDOBerrorPopu);
		return str;

	}

	// click on StudentNameLink in verificationInProgres
	public void click_on_StudentNameLinkInverificationInProgres() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(verificationInProgresStudentnamelink);
	}

	// get the preDestination error message
	public String getrequiredfields_errorMsg_ErrorMessage() {
		return ElementUtil.getText(requiredfields_errorMsg);
	}

	// get the cmntDate_grt error message
	public String getGraduationDategreater_thanCommencementDatefields_errorMsg_ErrorMessage() {
		return ElementUtil.getText(errorMsg_cmntDate_grt);
	}
	// preDestination_errorMsg

	// SignOut from the application
	public void signOutFromTheApplication() {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ElementUtil.click(profileIcon);
		ElementUtil.click(signOut);
		ElementUtil.click(signOut_confirmPopup);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ElementUtil.click(signInAgain);

	}
	// get the invalid login error message

	public String getInvaidLogin_errorMsg() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getText(getInvalidLoginErrorMessage);
	}

	// Login to the Channel Partner Application
	public void loginTo_Channel_Partner_Application(String role,String env) {
		Map<String,String>credData=new Login().getCredentials(role,env);
		String userName=credData.get("userid");
		String psw=credData.get("password");
		String url=credData.get("url");
		System.out.println(userName);
		System.out.println(psw);
		System.out.println(url);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ElementUtil.navigateToURL(url);
		ElementUtil.type(user_name, userName);
		String psw1 = ApplicationPageUtil.decryption(psw);
		ElementUtil.type(passwor, psw1);
		ElementUtil.click(logOnButton);
	}

	// login to the Channel partner Ported with Invalid Credentials in both emailid
	// and psw
	public void login_with_Invalid_EmailID_Psw_to_Channel_Partner_Application() {

		String username = "TestInavlidemail@gmail.com";
		String password = "TestInavidPsw@1333";
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		ElementUtil.type(user_name, username);
		ElementUtil.type(passwor, password);
		ElementUtil.click(logOnButton);
	}

	// login to the Channel partner Ported with Invalid Email ID
	public void login_with_Invalid_EmailID_to_Channel_Partner_Application() {

		String username = "TestInavlidemail@gmail.com";
		String password = "Tets@123";
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		ElementUtil.type(user_name, username);
		String psw = ApplicationPageUtil.decryption(password);
		ElementUtil.type(passwor, psw);
		ElementUtil.click(logOnButton);
	}

	// login to the Channel partner Ported with Invalid Password
	public void login_with_Invalid_Psw_to_Channel_Partner_Application() {

		String username = "abnnc.com";
		String password = "TestInavidPsw@1333";
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		ElementUtil.type(user_name, username);

		ElementUtil.type(passwor, password);
		ElementUtil.click(logOnButton);
	}

	// click on Submit Student Application

	public void click_on_Submit_Student_Application_Tab() {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ElementUtil.click(Submit_Student_Application_tab);
	}

	// click on applications_InProcess_tab

	public void click_on_Applications_InProcess_tab() {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ElementUtil.click(applications_InProcess_tab);
	}

	// click on verificationInProgress

	public void click_on_verificationInProgress_tab() {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ElementUtil.click(verificationInProgress);
	}

	//

	// Click on Save button
	public void click_On_Save_Student_Details() {
		ElementUtil.click(saveButton);
	}

	public boolean issaveShoulbeFails_firstname() {
		return ElementUtil.isElementDisplayed(saveShoulbeFails_firstname);
	}

	public boolean issaveShoulbeFails_lastname() {
		return ElementUtil.isElementDisplayed(saveShoulbeFails_lastname);
	}

	// get newly created Student ID
	public String getStudentID() {
		String str;
		try {
			if (ElementUtil.isElementDisplayed(studentID)) {

				str = ElementUtil.getAttribute(studentID, "value");
			} else {
				str = "";
			}
		} catch (Exception ex) {
			str = "";
		}
		return str;
	}

	// Click on Save button
	public void click_On_CloseButton_On_Success_popup() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ElementUtil.isElementDisplayed(closeBttn_popup)) {
			try {
				ElementUtil.click(closeBttn_popup);
				Thread.sleep(2000);
			} catch (Exception ex) {

			}
		}
	}

	// Click on Save button
	public void getStudentID_and_WriteToProperty() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		String stdID = getStudentID();
		System.out.println("Student ID:-" + stdID);
		ConfigReader.writeToApplicationPropertie("CppStudentID", stdID);
		System.out.println("STUDENT ID:--" + ConfigReader.getApplicationPropertie("CppStudentID"));
	}

	// click on next Button
	public void click_On_NextButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(nextButton);
	}

	// click on submit Button
	public void click_On_SubmitButton() {
		ElementUtil.click(submitbutton);
	}

	// get success pop up txt
	public String get_SuccessPopUpText() {
		WaitsUtil.explicit_Wait(successPopup);
		return ElementUtil.getText(successPopup);
	}

	// get success pop up txt
	public String getSuccesspopupTextafterSumbit() {
		WaitsUtil.explicit_Wait(getSuccesspopupTextafterSumbit);
		return ElementUtil.getText(getSuccesspopupTextafterSumbit);
	}

	// click on OK Button in success pop up
	public void click_OK_Button_On_SuccessPopup() {
		ElementUtil.click(successPopup_OK);
	}

	// verify the user is navigated to Education History Tab by clicking on next
	// button

	public void enter_AttcahmentName(String str) {
		ElementUtil.type(filename, str);
	}

	public void save_AttachmentNewRecord() {
		ElementUtil.click(saveUploadDoc);
	}

	// Click on add a new file Icon
	public void addNew_AttachmentFile() {
	  ElementUtil.click(nextButton);
	  ElementUtil.click(nextButton);
	  ElementUtil.click(nextButton);
	  ElementUtil.click(add_newFileIcon);
	  ElementUtil.type(filename, "TestDataFile");
	  //ElementUtil.click(fileBrowseBtn);
	  try {
	    Thread.sleep(2800);
	  } catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	  }
	  String path = System.getProperty("user.dir");
	  String filepath = path + "//src//test//resources//Data//TestFiles//Doc" + 1 + ".pdf";
	  //uploadDoc.uploadFileWithRobot(filepath);
	  DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']")).sendKeys(filepath);
	  ApplicationPageUtil.waitForLoadGetDisappiear();
	  ElementUtil.click(saveUploadDoc);
	  click_On_CloseButton_On_Success_popup();
	}

	public void uploadDocumnet() {
		//ElementUtil.click(fileBrowseBtn);
		String path = System.getProperty("user.dir");
		String filepath = path + "//src//test//resources//Data//TestFiles//Doc" + 1 + ".pdf";
		DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']")).sendKeys(filepath);
		//.uploadFileWithRobot(filepath);
	}

	// Enter all the student information
	public void enter_Student_Application(String testCaseNo) {

		// String FnamePrefix = "TTTRAINVGT";
		// String Fname = ElementUtil.generateRandomString(5);
		// String Lname = ElementUtil.generateRandomString(5);
		String emailtxt = ElementUtil.generateEmail(7);

		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String fname = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"firstname");
		String lname = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"lastname");
		String nonEnglishName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"non_English_Name");
		String DOB = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData", "DOB");
		String pre_Destination = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"ChannelPartnerTestData", "Preferred_Destination");

		ApplicationPageUtil.typeWithEnt(firstname, fname);
		ApplicationPageUtil.typeWithEnt(lastname, lname);
		ApplicationPageUtil.typeWithEnt(non_English_Name, nonEnglishName);
		ApplicationPageUtil.typeWithEnt(dob, DOB);
		ApplicationPageUtil.typeWithEnt(preferred_Destination, pre_Destination);
		ApplicationPageUtil.typeWithEnt(email, emailtxt);
		// Excel_Reader.getTestDataInMap("ChannelPartner",testCaseNo).get("email")

	}

	public void enter_Firdtname(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String fname = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"firstname");
		ApplicationPageUtil.typeWithEnt(firstname, fname);

	}

	public void enter_DOB_as_null() {

		ApplicationPageUtil.typeWithEnt(dob, "");

	}

	public void enter_PreDestination_as_null() {

		//ApplicationPageUtil.typeWithEnt(preferred_Destination, "");
        ElementUtil.clear(preferred_Destination);
	}

	public void enter_lastname_as_null() {

		ApplicationPageUtil.typeWithEnt(lastname, "");

	}

	public void enter_Firdtname_as_null() {

		ApplicationPageUtil.typeWithEnt(firstname, "");

	}

	public void enter_email_as_null() {

		ApplicationPageUtil.typeWithEnt(email, "");

	}

	public void enter_lastname(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String lname = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"lastname");
		ApplicationPageUtil.typeWithEnt(lastname, lname);

	}

	public void enter_non_English_Name(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String nonEnglishName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"non_English_Name");
		ApplicationPageUtil.typeWithEnt(non_English_Name, nonEnglishName);

	}

	public void enter_dob(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String DOB = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData", "DOB");
		ApplicationPageUtil.typeWithEnt(dob, DOB);

	}

	public void enter_pre_Destination(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String pre_Destination = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"ChannelPartnerTestData", "Preferred_Destination");
		ApplicationPageUtil.typeWithEnt(preferred_Destination, pre_Destination);

	}

	public void enter_email(String testCaseNo) {
		// String emailtxt = ElementUtil.generateEmail(7);
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String emailtxt = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"email");
		ApplicationPageUtil.typeWithEnt(email, emailtxt);

	}

	public void enter_email() {
		String emailtxt = ElementUtil.generateEmail(7);
		// ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		// String emailtxt =
		// ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
		// "ChannelPartnerTestData","email");
		ApplicationPageUtil.typeWithEnt(email, emailtxt);

	}

	// check the converted opportunity ID in CPP
	public boolean convertedOpportuntyID_In_CPP(String id) {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return ElementUtil.isElementDisplayed(By.xpath(".//bdi[text()='" + id + "']"));

	}

	// Education History Tab Fields

	public void addNewRecord_In_EducationHistory() {
		try {
			ElementUtil.waitForElementClickable(addNewRecordBtn_EducationHst);
			Thread.sleep(2000);
			ElementUtil.click(addNewRecordBtn_EducationHst);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addNewRecord_In_employementHistory() {
		try {
			ElementUtil.waitForElementClickable(addNewRecordBtn_EemploymentHst);
			Thread.sleep(2000);
			ElementUtil.click(addNewRecordBtn_EemploymentHst);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addNewRecord_In_addNewRecordBtn_attachments() {
		try {
			ElementUtil.waitForElementClickable(addNewRecordBtn_attachments);
			Thread.sleep(2000);
			ElementUtil.click(addNewRecordBtn_attachments);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_instuteName(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String InstitutionName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"ChannelPartnerTestData", "Institution Name");
		ApplicationPageUtil.typeWithEnt(instuteName, InstitutionName);

	}

	public void enter_LanguageOfStudy(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String languageOfStudy = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"ChannelPartnerTestData", "Language of Study");
		ApplicationPageUtil.typeWithEnt(LanguageOfStudy, languageOfStudy);

	}

	public void enter_CommencementOfStudy(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String cos = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"Commencement of Study");
		ApplicationPageUtil.typeWithEnt(commencementOfStudy, cos);

	}

	public void enter_GraduationDate(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String grdnDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"Graduation Date");
		ApplicationPageUtil.typeWithEnt(graduationDate, grdnDate);

	}

	public void enter_degreeType(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String grdnType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"Degree Type");
		ApplicationPageUtil.typeWithEnt(degreeType, grdnType);

	}

	public void enter_degreeName(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String dgrName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"Degree Name");
		ApplicationPageUtil.typeWithEnt(degreeName, dgrName);

	}

	public void enter_StudyMode(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String stdyMode = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"Study Mode");
		ApplicationPageUtil.typeWithEnt(StudyMode, stdyMode);

	}

	public void enter_CountryofStudy(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String cntyofStudy = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"Country of Study");
		ApplicationPageUtil.typeWithEnt(CountryofStudy, cntyofStudy);

	}

	public void enter_fieldofstudy(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String fldofStudy = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData",
				"Field Of Study");
		ApplicationPageUtil.typeWithEnt(fieldofstudy, fldofStudy);

	}

	public void enter_Grade(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String grd = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData", "Grade");
		ApplicationPageUtil.typeWithEnt(grade, grd);

	}

	public void enter_status(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String sts = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartnerTestData", "Status");
		ApplicationPageUtil.typeWithEnt(status, sts);

	}

	// Employment History records

	public void enter_organizationName(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String orgname = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartneremployHistory",
				"Organization Name");
		System.out.println(orgname);
		ElementUtil.type(organizationName, orgname);

	}

	public void enter_Null_InorganizationName(String str) {

		ElementUtil.type(organizationName, str);

	}

	public void enter_occupationLevel(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String occupatnLevl = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"ChannelPartneremployHistory", "Occupation Level");
		System.out.println(occupatnLevl);
		ElementUtil.type(occupationLevel, occupatnLevl);

	}

	public void enter_NulloccupationLevel(String str) {

		ElementUtil.type(occupationLevel, str);

	}

	public void enter_designation(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String dstntion = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartneremployHistory",
				"Designation");
		System.out.println(dstntion);
		ElementUtil.type(designation, dstntion);

	}

	public void enter_country(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String cntry = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartneremployHistory",
				"Country");
		System.out.println(cntry);
		ElementUtil.type(country, cntry);

	}

	public void enter_Nullcountry(String str) {

		ElementUtil.type(country, str);

	}

	public void enter_startdate(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String strtDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartneremployHistory",
				"Start Date");
		System.out.println(strtDate);
		ElementUtil.type(startdate, strtDate);

	}

	public void enter_Nullstartdate(String str) {

		ElementUtil.type(startdate, str);

	}

	public void enter_endDate(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String enddate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartneremployHistory",
				"End Date");
		ElementUtil.type(endDate, enddate);

	}

	public void enter_NullendDate(String str) {

		ElementUtil.type(endDate, str);

	}

	public void enter_description(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String descrptn = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartneremployHistory",
				"Description");
		ElementUtil.type(description, descrptn);

	}

	public void enter_Nulldescription(String str) {

		ElementUtil.type(description, str);

	}

	public void enter_employMentSection(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String emplymntsec = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"ChannelPartneremployHistory", "Employment Section");
		ElementUtil.type(employMentSection, emplymntsec);
	}

	public void enter_NullemployMentSection(String str) {

		ElementUtil.type(employMentSection, str);

	}

	// dropdown button click
	public void click_employMentDropDownBtn() {
		ElementUtil.click(employMentDropDownBtn);
	}

	// dropdown button click
	public void click_engSpeakingWrkplanceDropDownBtn() {
		ElementUtil.click(engSpeakingWrkplanceDropDownBtn);
	}

	// dropdown button click
	public void click_paidWrkDropDownBtn() {
		ElementUtil.click(paidWrkDropDownBtn);
	}

	// dropdown button click
	public void click_partTimeDropDownBtn() {
		ElementUtil.click(partTimeDropDownBtn);
	}

	public void enter_industry(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String indsrty = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartneremployHistory",
				"Industry");
		ElementUtil.type(industry, indsrty);

	}

	public void enter_Nullindustry(String str) {

		ElementUtil.type(industry, str);

	}

	public void enter_eng_speaking_wrkplance(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String enfSpkngWkplnc = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"ChannelPartneremployHistory", "Eng speaking Workplance");
		ElementUtil.type(eng_speaking_wrkplance, enfSpkngWkplnc);

	}

	public void enter_Nulleng_speaking_wrkplance(String str) {

		ElementUtil.type(eng_speaking_wrkplance, str);

	}

	public void enter_paidWrk(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String pidwrk = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartneremployHistory",
				"Paid Work");
		ElementUtil.type(paidWrk, pidwrk);

	}

	public void enter_NullpaidWrk(String str) {

		ElementUtil.type(paidWrk, str);

	}

	public void enter_address(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String adrs = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartneremployHistory",
				"Address");
		ElementUtil.type(address, adrs);

	}

	public void enter_Nulladdress(String str) {

		ElementUtil.type(address, str);

	}

	public void enter_partTime(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String prtTime = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ChannelPartneremployHistory",
				"Part Time");
		ElementUtil.type(partTime, prtTime);

	}

	public void enter_nullpartTime(String str) {

		ElementUtil.type(partTime, str);

	}

	public void enter_partTimeHours(String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		String prttimehrs = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"ChannelPartneremployHistory", "Part Time Hours");
		ElementUtil.type(partTimeHrs, prttimehrs);

	}

	public void enter_NullpartTimeHours(String str) {

		ElementUtil.type(partTimeHrs, str);

	}

	public boolean ispartTimeHoursFiledEnabled() {
		return ElementUtil.isElementEnable(partTimeHrs);

	}
	
}
