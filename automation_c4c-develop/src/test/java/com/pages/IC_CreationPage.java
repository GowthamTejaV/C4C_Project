package com.pages;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelReader;
import com.qa.util.ExcelUtil;
import AppHooks.ApplicationHooks;

public class IC_CreationPage {

	ExcelReader exc = new ExcelReader();
	/***********************/
	String stud_Id = "";
	static String newStudent = "";
	public String HCemail;
	static String headerText = "";
	/********************************/
	
	private final String FileTestData_Path = "src\\test\\resources\\TestData\\TestData.xlsx";
    private By ICOveriViewTab=By.xpath(".//div[text()='OVERVIEW']");
	private By studentID = By.xpath(".//*[@data-help-id='omGf4PJOXqYCNsi6uDS9O0']/child::div/child::span[text()]");

	private By role = By.xpath(".//*[@data-help-id='krZIJY5K9q6ICpVMmvcBOW']//input");

	// private By counsellor =
	// By.xpath(".//*[@data-help-id='Ja4BemOm24kgUYUNA3hjFm']//input");

	private By student_Lifecycle = By.xpath(".//*[@data-help-id='VEjH6qg1M422K0qUctLzim']//input");
	// private By save =
	// By.xpath(".//*[@data-help-id='tAYD5nbDAasuFS8lNSo59W']//bdi");

	// private By duplicateValueErrorCheck = By.xpath(".//*[text()='Available
	// Actions']/following-sibling::span[text()='Potential duplicate customers were
	// found. Please save to continue. | Save failed ']");

	// IC Overview page creation elements
	private By editIC_page = By.xpath(".//*[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");

	private By lessBtn = By.xpath(".//*[@data-help-id='button-ObjectDetail-MoreOrLess']//span//bdi[text()='Less']");
	// private By mouseMoveDOM =
	// By.xpath(".//*[@data-help-id='LZ15dqHo0KAvjVcxUiPU9G']//span[contains(@class,'sapMClientInputInlineEditHidden')]");

	private By overViewPrimaryLanguage = By.xpath(".//*[@data-help-id='ca241c07973b775d7329d23bc5708c5e']//input");
	// private By
	// mouseMoveNationality=By.xpath(".//*[@data-help-id='cFO7MnjmYqE$_smiHD89oW']//span[contains(@class,'sapMClientInputInlineEditHidden')]");

	// private By
	// mouseMoveGender=By.xpath(".//*[@data-help-id='WO4naXYlD4U4jzGBmDJRGW']//span[contains(@class,'sapMClientInputInlineEditHidden')]");

	private By non_English_Name = By.xpath(".//*[@data-help-id='763a8bcd92da41fd89d53e1439546096']//input");

	// private By
	// validationAftersavingOverview=By.xpath(".//*[@data-help-id='messageBar-headerMessage'
	// and contains(text(),'Your entries have been saved')]");

	// private By
	// getDateFormat=By.xpath(".//*[@data-help-id='LZ15dqHo0KAvjVcxUiPU9G']//input");
	private static By saveButton = By.xpath(".//bdi[text()='Save']");

	/********************************************************************/
	private By cpp_communication_Details_toggleBtn = By.xpath(".//*[@data-help-id='9e871de9a55e44a5a8ca7225a015f583']");

	private By cpp_modileNumber = By.xpath(".//*[@data-help-id='_9XmP43sB4IG_Ay2YVP8qm']//input");

	private By primaryEmailID = By.xpath(".//div[@title='Primary E-Mail']//input");

	private By leadCategory = By.xpath(".//*[@data-help-id='TMItVDruGaIo5bZ$OmVaVG']");

	/******************************************************************************************************/

 	private static  By createICIcon = By.xpath(".//*[@data-help-id='6HRpLES0uK2kq5BjyIBruG']");
	private static By firtname = By.xpath(".//*[@data-help-id='M$FkKNsTA4UoZrWN67OzM0']//input");
	private static By lastName = By.xpath(".//*[@data-help-id='LWyfSsnU0q2KvNMYj1i3Xm']//input");
	public static By Loading = By.xpath("//div[contains(@class,'sapUiLocalBusyIndicatorAnimation')]");
	private static By siteID = By.xpath(".//*[@data-help-id='9096b21b4b484ab0b72169dedc6a63af']//input");
	private static By primaryEMailID = By.xpath(".//*[@data-help-id='a95695b77f134092809d2eaede6b39ed']//input");
	private static By secondaryEMailID = By.xpath(".//*[@data-help-id='893995c3586c4677a6e14334ae08d1c9']//input");
	private static By mobileNO = By.xpath(".//*[@data-help-id='pz4e_OqPjqYFwfDTuPlBGm']//input");
	private static By country_OR_region = By
			.xpath(".//*[@data-help-id='0BwPVGgcwasBctuvWpBRRG']//input[@type=\"text\"]");
	private static By howDidyouHear = By.xpath(".//*[@data-help-id='25430f7d1113203916133c41a6533ee6']//input");
	private static By primaryLang = By.xpath(".//*[@data-help-id='396ba05843629fdef382a911e712d9d1']//input");
	private static By primaryLangTrain = By.xpath(".//*[@data-help-id='ca241c07973b775d7329d23bc5708c5e']//input");

	private static By iWould_LikeToStudy_In = By.xpath("//bdi[text()='I Would Like to Study In']//following::input[1]");
	private static By tbl_IcList = By.xpath("(//table//tr//td[4])[1]");
	private static By dropDownMore = By.xpath(".//*[@data-help-id='tAYD5nbDAasuFS8lNSo59W']//button[@title='More']");
	private static By btn_globalSaveOpenMore = By.xpath("(//button[@title='More'])[1]");
	private static By btn_globalSaveOpen = By.xpath("//bdi[text()='Save and Open']");
	private static By saveAndOpen = By
			.xpath(".//*[@data-help-id='z31_P8NjLqIyUQUYKpPBlm']//bdi[text()='Save and Open']");
	private static By btn_saveNew = By.xpath("//bdi[text()='Save and New']");
	private static By btn_SaveNewIC = By.xpath("//button[@id='buttontAYD5nbDAasuFS8lNSo59W_259-button']");
	private static By ic_creationSuccessfullyValidation = By.xpath("//span[text()='PERSONAL PROFILE']");
	private static By btn_editIC = By
			.xpath("//button[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");
	// IC Overview page creation elements
	private static By moreBtn = By.xpath("(//button[@data-help-id='button-ObjectDetail-MoreOrLess']//bdi[text()='More'])[1]");
	private static By mouseMoveDOM = By.xpath(
			".//*[@data-help-id='LZ15dqHo0KAvjVcxUiPU9G']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private static By enter_DOB_YYYY_MM_DD = By.xpath(".//*[@data-help-id='LZ15dqHo0KAvjVcxUiPU9G']//input");
	private static By mouseMoveNationality = By.xpath(
			".//*[@data-help-id='cFO7MnjmYqE$_smiHD89oW']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private static By enterNationality = By.xpath(".//*[@data-help-id='cFO7MnjmYqE$_smiHD89oW']//input");
	private static By financialSource=By.xpath(".//div[@data-help-id='27826851672eaa10a625688e25885f62']//input");
	private By countryOfResidency = By.xpath(".//*[@data-help-id='5746c9d6918f414b952d62e8a88de099']//input[@type='text']");
	private By countryOfBirth = By.xpath(".//*[@data-help-id='d5fa4b7b5ab44c96883833877dd48ed8']//input[@type='text']");

	private static By mouseMoveGender = By.xpath(
			".//*[@data-help-id='WO4naXYlD4U4jzGBmDJRGW']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private static By enterGender = By.xpath(".//*[@data-help-id='WO4naXYlD4U4jzGBmDJRGW']//input");
	private static By overviewSave = By.xpath(".//*[@data-help-id='vdzW3flmW4UJwvWwOsvUTm']");
	private static By slectICfromtableList = By.xpath(".//*[@data-sap-automation-id='FGP51GSw94wwqDSHEoSdTG']/following-sibling::a");
	private static By icsIntable = By.xpath(".//*[@data-sap-automation-id='FGP51GSw94wwqDSHEoSdTG'][1]");
	private static By IcTabel_headingTitle = By
			.xpath(".//*[@data-sap-automation-id='LJ97fhPT9KgQm21vzM7gBG-variantManagement-title']");
	private static By Ic_overview_page = By
			.xpath(".//*[@data-sap-automation-id='ndM5oe43hqcjMtmgmAREyG']//span[text()='PERSONAL PROFILE']");
	private static By Clikcsearch = By.xpath(".//*[@data-sap-automation-id='LJ97fhPT9KgQm21vzM7gBG-searchButton']");
	private static By enterSearch = By.xpath(".//*[@data-help-id='LJ97fhPT9KgQm21vzM7gBG-searchField']//input");
	private static By lbl_studentId = By.xpath("//div[@data-help-id='omGf4PJOXqYCNsi6uDS9O0']/div[1]/span[1]");
	private static By lbl_firstRecordIC = By
			.xpath("//div[@data-help-id='k6Y275RD64MbUKeQ0OKEs0']//tbody/tr[1]//td[4]/div[1]/a[1]");
	public static String FnamePrefix = "";

	// public static String Fname = FnamePrefix + "Auto" +
	// ElementUtil.generateRandomString(6);
	public static String Lname = "Student" + ElementUtil.generateRandomNumber(3);

	public static String modNo = ElementUtil.generateRandomNumber(10);
	public static String updatedmodNo = modNo.replace(modNo.substring(0, 3), "999");
	// public static String lbl_StudentName = FnamePrefix + Fname;
	public String lbl_Name;
	private static By btn_Sort = By.xpath("//button[@data-help-id='LJ97fhPT9KgQm21vzM7gBG-menuTogglebutton']");
	private static By btn_CreatedOn = By
			.xpath(".//input[@type='radio']//following::div[contains(text(),'Created on')]");
	private static By btn_Descending = By
			.xpath(".//input[@type='radio']//following::div[contains(text(),'Descending')]");
	private static By btn_SortOk = By
			.xpath("//span[@id='panevariantLJ97fhPT9KgQm21vzM7gBG_9-tableOptionsDialog-acceptbutton-content']");

	// update IC
	private static By txt_title = By.xpath("//div[@data-help-id='wJmeQHi$PqUXrQPv4XYAim']//input");
	private static By txt_maritalStatus = By.xpath("//div[@data-help-id='J4XmxS0Oha2OdoZAwL8NBW']//input");
	private static By txt_countryBirth = By.xpath("//div[@data-help-id='d5fa4b7b5ab44c96883833877dd48ed8']//input");
	private static By txt_countryResident = By.xpath("//div[@data-help-id='5746c9d6918f414b952d62e8a88de099']//input");
	private static By btn_SaveIC = By.xpath("//button[@data-help-id='vdzW3flmW4UJwvWwOsvUTm']");
	private static By btn_SaveICRegression = By.xpath("(//bdi[text()='Save'])[1]");

	// referel scenario

	private static By icon_referedBy = By
			.xpath("//span[@title='Referred by']//following::div[@class='sapMInputBaseIconContainer'][1]/span");
	private static By tbl_referedByData = By
			.xpath("//div[@data-help-id='G3ws9fm8F4M0zWzfo$hp1G']//table[1]//following::td[3]");
	private static By icon_referralCounsellor = By
			.xpath("//span[@title='Referral Counsellor']//following::div[@class='sapMInputBaseIconContainer'][1]/span");
	private static By tbl_referralCounsellorData = By
			.xpath("//div[@data-help-id='a4jHB4H6X4slaGJg8nnHGW']//table[1]//following::td[3]");
	private static By tbl_leadList = By.xpath("//div[@data-help-id='oRmHZ6UY24QTEi_9bBw7e0']//tbody/tr");
	private static By lbl_messageHeader = By.xpath("//span[@data-help-id='messageBar-headerMessage']");
	private static By lbl_name = By.xpath("//div[@data-help-id='9vv8UdjjWaAfbLOPaOjRGG']");
	private static By lbl_siteID = By.xpath("((//bdi[text()='Site ID']//following::div)[1]//span)[1]");
	private static By lbl_howHear = By.xpath("((//bdi[text()='How did you Hear?']//following::div)[1]//span)[1]");
	private static By lbl_primaryLang = By.xpath("((//bdi[text()='Primary Language']//following::div)[1]//span)[1]");

	private static By drp_studentLifecycle = By.xpath("//div[@data-help-id='WthaFTWqW4E9ji6KewjEdm']//input");
	private static By drp_GenderOverview = By.xpath("//div[@data-help-id='WO4naXYlD4U4jzGBmDJRGW']");
	private static By drp_MaritalOverview = By.xpath("//div[@data-help-id='J4XmxS0Oha2OdoZAwL8NBW']");
	private static By drp_countryBirthOverview = By.xpath("//div[@data-help-id='d5fa4b7b5ab44c96883833877dd48ed8']");
	private static By drp_Nationality = By.xpath("//div[@data-help-id='cFO7MnjmYqE$_smiHD89oW']");
	private static By drp_countryResidentOverview = By.xpath("//div[@data-help-id='5746c9d6918f414b952d62e8a88de099']");
	private static By drp_languageOverview = By.xpath("//div[@data-help-id='ca241c07973b775d7329d23bc5708c5e']");
	private static By drp_AcademicOverview = By.xpath("//div[@data-help-id='ozcPRLDjc4kaeFNRcGASnm']");
	private static By drp_siteIdOverview = By.xpath("//div[@data-help-id='5e90f35a815646568bff5bbc09900623']");
	private static By drp_counsellingOverview = By.xpath("//div[@data-help-id='6d76444ad64f0f8a10a3b093090dd015']");

	private static By li_picklistOverview = By.xpath("(//ul[@role='listbox'])[1]//li//div[@class='sapMSLITitleOnly']");

	private static By btn_globalEdit = By.xpath("//button[@title='Edit']");
	private static By btn_globalCancel = By.xpath("//bdi[text()='Cancel']");
	private static By btn_lockObject = By.xpath("//bdi[text()='Yes']");

	private static By lbl_personType = By.xpath("(//div[@data-help-id='QE76wD6w74gSqsbidYbEF0']//span)[1]");
	private static By lbl_studentID = By.xpath("(//div[@data-help-id='omGf4PJOXqYCNsi6uDS9O0']//span)[1]");
	private static By lbl_studentLifecycle = By.xpath("(//div[@data-help-id='WthaFTWqW4E9ji6KewjEdm']//span)[1]");
	private static By lbl_gender = By.xpath("(//div[@data-help-id='WO4naXYlD4U4jzGBmDJRGW']//span)[1]");
	private static By lbl_createdBy = By.xpath("(//div[@data-help-id='1S78UfSPZq_vW9WXSxkaPm']//a)[1]");
	private static By lbl_contactMe = By.xpath("(//div[@data-help-id='1bb9b60c2fa4d9d004f4b6d4a5347ad7']//span)[1]");
	private static By lbl_createdOn = By.xpath("(//div[@data-help-id='dcb7c060a78a12339bf3d7e3f22162d2']//span)[1]");

	private static By lbl_IDPsection = By.xpath("(//div[@title='Select View']//bdi)[2]");
	private static By btn_showCommunication = By.xpath("//div[@data-help-id='9e871de9a55e44a5a8ca7225a015f583']");
	private static By lbl_showCommunication = By
			.xpath("(//span[@data-help-id='dc62eaec4cdb4692942a74f4d21d7692']//following::input)");

	private static By list_overviewFacetIC = By.xpath("(//div[@data-help-id='nE9CoZJI$qoDkiHA7N7PBm']//bdi)");

	private static By btn_showCommunicationDetail = By
			.xpath("//bdi[text()='Show communication Details']//following::div[@title='Show communication Details']");
	private static By txt_mobileNumber = By.xpath("//div[@data-help-id='_9XmP43sB4IG_Ay2YVP8qm']//input");
	private static By btn_refferedBypopup = By
			.xpath("(//div[@data-help-id='2d8QNDMIuKAvoZP4Ffc2oW']//following::span)[1]");
	private static By tbl_reffredByData2 = By
			.xpath("//div[@data-help-id='G3ws9fm8F4M0zWzfo$hp1G']//tbody//tr[1]//td[2]");
	private static By btn_referralCounsellorPopup = By
			.xpath("(//div[@data-help-id='386WAZOFrq6pgsr8hA62SG']//following::span)[1]");
	private static By tbl_refferalCounsellordata = By
			.xpath("//div[@data-help-id='a4jHB4H6X4slaGJg8nnHGW']//tbody//tr[1]//td[2]");
	private By advanceFilter=By.xpath(".//span[text()='Advanced Search']/preceding-sibling::span/span");
	private By customerID=By.xpath(".//*[@data-help-id='7mIuh4sN942W9fcuxJmzkG']/bdi");
	private static By btn_firstLead=By.xpath("//div[@data-help-id='3nKWypX2Tqc0dFB$SLmbrG']//tbody//tr[1]//td[3]//a");
	private static By drp_gender=By.xpath("//div[@data-help-id='WO4naXYlD4U4jzGBmDJRGW']//input");
	private static By txt_dob=By.xpath("//div[@data-help-id='LZ15dqHo0KAvjVcxUiPU9G']//input");
	private static By drp_nationality=By.xpath("//div[@data-help-id='cFO7MnjmYqE$_smiHD89oW']//input");
	

	static String r_firstName = "";
	static String r_lastName = "";
	static String r_siteID = "";
	static String r_country = "";
	static String r_howDidHear = "";
	static String r_primaryLanguage = "";

	ApplicationPageUtil appUtil = new ApplicationPageUtil();
	static ApplicationPageUtil appPageUtil = new ApplicationPageUtil();
	LeadCreationPage lead = new LeadCreationPage();
	
	public void navigateTOICOverviewPage() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		
		ElementUtil.click(ICOveriViewTab);
	}
	public void clickIc_advanceFilterIcon() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(advanceFilter);
	}

	public String getCustomerIDtext() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getText(customerID);
	}

	// enter the mobile number for Cpp created student in c4c

	public void enter_mobileNumber_for_CPP_CreatedStudent() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(cpp_communication_Details_toggleBtn);
		ApplicationPageUtil.typeWithEnt(cpp_modileNumber, "1088889999");
	}

	// Show communication Details toggle button
	public void show_communicationDetails_toggle_Button() {
		try {
			Thread.sleep(2700);
			// WaitsUtil.explicit_Wait(cpp_communication_Details_toggleBtn);
			ElementUtil.click(cpp_communication_Details_toggleBtn);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// get Primary Email ID
	public String get_primaryEmailID() {
		String email;
		try {
			Thread.sleep(2000);
			email = ElementUtil.getAttribute(primaryEmailID, "value");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			email = null;
			e.printStackTrace();
		}
		return email;
	}

	// get Lead category
	public String get_LeadCategory() {
		String category;
		try {
			Thread.sleep(2000);
			category = ElementUtil.getText(leadCategory);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			category = null;
			e.printStackTrace();
		}
		return category;
	}

	// IC create Icon
	public void IC_create_Icon() {
		// if(ElementUtil.waitForElementPresentReturn(createICIcon))

		ElementUtil.click(createICIcon);

	}

	// Enter IC first name
	public void enter_IC_First_Name(String fName) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			ElementUtil.Type(firtname, fName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Enter IC Last Name
	public void enter_IC_Last_Name(String lName) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			ElementUtil.Type(lastName, lName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Enter IC Last Name
	public void enter_IC_Role(String lName) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.typeWithEnt(role, lName);
	}

	// Enter IC site ID
	public void enter_IC_SiteID(String siteid) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			ElementUtil.Type(siteID, siteid);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Enter IC Primary EMail ID
	public void enter_IC_primaryEMailID(String pEMailID) {
		// if(ElementUtil.waitForElementPresentReturn(primaryEMailID))
		try {
			ElementUtil.Type(primaryEMailID, pEMailID);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Enter IC Secondary EMail ID
	synchronized public void enter_IC_SecondaryEMailID(String sEMailID) {

		appPageUtil.typeWithEnt(secondaryEMailID, sEMailID);
	}

	// Enter IC Mobile
	public void enter_IC_Mobile(String mobile) {

		ElementUtil.type(mobileNO, mobile);
	}

	// Enter IC Secondary country_OR_region
	public void enter_IC_country_OR_region(String countryRegion) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.typeWithEnt(country_OR_region, countryRegion);
	}

	// Enter IC Secondary Student life cycle
	public void enter_IC_student_Lifecycle(String studentLcycle) {
		appPageUtil.type_KeysEnter(student_Lifecycle, studentLcycle);
	}

	// Enter IC How did you hear
	public void enter_IC_How_Did_you_Hear(String howDYouHear) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.typeWithEnt(howDidyouHear, howDYouHear);
	}

	// Enter IC Primary Language
	public void enter_IC_Primary_Language(String pLanguage) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			ElementUtil.Type(primaryLang, pLanguage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Enter IC i Would like to Study
	public void enter_IC_iWould_LikeToStudy_In(String iWrkToStudy) {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		try {
			ElementUtil.Type(iWould_LikeToStudy_In, iWrkToStudy);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Enter IC non_English_Name
	public void enetr_IC_non_English_Name(String noe_English) {
		try {
			ElementUtil.Type(non_English_Name, noe_English);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*************************************
	 * Action Functions
	 *****************************************************************/
	// Save and Open the IC Record
	public void saveAndOpen_IC_record() {
		try {
			ElementUtil.click(dropDownMore);
			ElementUtil.click(saveAndOpen);
			Thread.sleep(2000);
			Set<String> errSet = lead.get_LEAD_PAGE_ERROR_MESSAGE();
			 if(errSet !=null) {
			   if(errSet.contains("Potential duplicate customers were found. Please save to continue."));{
				   ElementUtil.click(dropDownMore);
				   ElementUtil.click(saveAndOpen);
			   }
			 }
			// ElementUtil.getText(ic_creationSuccessfullyValidation);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}



	// Search for IC Record
	public void search_for_IC(String testcaseNo) {
		try {
			ElementUtil.waitForPageLoad();
			ElementUtil.click(Clikcsearch);
			ElementUtil.waitForPageLoad();
			appPageUtil.typeWithEnt(enterSearch, testcaseNo);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	// select first IC Record
	public void select_First_IC_from_ICtable() {
		List<WebElement> ele = DriverFactory.getDriver().findElements(slectICfromtableList);
		ele.get(0).click();
	}

	// Select search ic record
	public void select_search_IC_Record() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(slectICfromtableList);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/****************************************************************************************************************/

	// navigate to IC Page as a Counsellor
	public void navigateTo_IC_page_As_Counsellor() {
		appPageUtil.clickTab_underCategory("Customers", "Individual Customers");
	}

	// Get total records in IC Page
	public int get_total_Count_IC_Cords_Table() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getElementsCount(icsIntable);

	}

	// get StudentID
	public String getStudentID() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getText(studentID);
	}

	// Login to the application
	public void login_toApplication(String userID, String psw, String url) {
		appPageUtil.loginTotheApplicatio_C4C(userID, psw, url);
	}

	/*
	 * public void enterdata_OnMouseOverField(By mouseOverElement,By
	 * dataInputElement,String txt ) {
	 * ApplicationPageUtil.waitForLoadGetDisappiear();
	 * if(ElementUtil.waitForElementVisibleReturn(dataInputElement)) {
	 * ElementUtil.scrollToElement(mouseOverElement); new
	 * Actions(driver).moveToElement(driver.findElement(mouseOverElement)).click().
	 * build().perform(); appPageUtil.typeWithEnt(dataInputElement, txt); }
	 * 
	 * }
	 */

	// enterdata_OnMouseOverField
	// 2012-12-15

// **************************************OverView page Fields*************************************************************/

	// edit the IC Overview Page
	public void click_On_Edit_IC_Record() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(editIC_page);
		new ApplicationPageUtil().click_Yes_Button_to_Unlock_Object_If_Visible();

	}

	// enter IC overview date of birth
	public void enter_IC_Overview_Date_of_Birth(String dob) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		appPageUtil.type_KeysEnter(enter_DOB_YYYY_MM_DD, dob);
	}

	// Enter IC overview Nationality
	public void enter_IC_overview_Nationality(String nationality) {
		try {
			Thread.sleep(2000);
			ElementUtil.Type(enterNationality, nationality);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Enter IC overview financialSource
	public void enter_IC_overview_financialSource(String fin) {
		try {
			Thread.sleep(2000);
			if(ElementUtil.isElementDisplayed(financialSource)) {
				ElementUtil.Type(financialSource, fin);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	// Enter IC overview countryOfResidency
	public void enter_IC_countryOfResidency(String residency) {
		try {
			ElementUtil.Type(countryOfResidency, residency);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Enter IC overview countryOfBirth
	public void enter_IC_countryOfBirth(String residency) {
		try {
			ElementUtil.Type(countryOfBirth, residency);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Enter IC overview Primary Language
	public void enter_IC_overview_PrimaryLanguage(String primaryLanguage) {
		try {
			ElementUtil.Type(overViewPrimaryLanguage, primaryLanguage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Enter IC overview Gender
	public void enter_IC_overview_Gender(String gender) {
		try {
			Thread.sleep(2000);
			ElementUtil.Type(enterGender, gender);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	// Save the IC
	public void IC_SaveButton() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(saveButton);
	}

	// Save IC overview Save
	public void ic_overview_Save() {
		// if(ElementUtil.waitForElementPresentReturn(overviewSave))
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(overviewSave);
	}

	// more button on overview page
	public void more_button_On_IC_OverviewPage() {
		// if(ElementUtil.waitForElementPresentReturn(moreBtn))
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(moreBtn);
	}

	// Less button on overview page
	public void less_button_On_IC_OverviewPage() {
		// if(ElementUtil.waitForElementPresentReturn(lessBtn))
		ElementUtil.click(lessBtn);
	}

	/****************************************************************************************************************/

	// Create the IC record
	public void createIndividual_Customers(String testcaseNo) {

		try {
			String FnamePrefix = "TT_TRAIN_VGT_";
			String Fname = ElementUtil.generateRandomString(5);
			String Lname = ElementUtil.generateRandomString(5);
			String Pemail = ElementUtil.generateEmail(7);
			String Semail = ElementUtil.generateEmail(7);
			// String modNo = ElementUtil.generateRandomNumber(10);
			// String updatedmodNo = modNo.replace(modNo.substring(0, 3), "999");
			System.out.println("Test case ID" + testcaseNo);
			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
			Thread.sleep(2500);
			String mobileNo = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData", "Mobile");
			System.out.println(mobileNo);
			String country_Region = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData",
					"Country/Region");
			String howDidYouHear = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData",
					"HowDidYouHear");
			String primaryLanguage = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData",
					"PrimaryLanguage");
			String i_Would_Like_toStudyIn = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData",
					"I Would Like to Study In");
			String gender = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData", "Gender");
			String PrimaryLanguage = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData",
					"PrimaryLanguage");
			String Nationality = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData",
					"Nationality");
			String DOB = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData", "Date of Birth");
			String siteID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData", "SiteID");
			
			String financial=ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICTestData", "financial");
			System.out.println(DOB);
			
			Thread.sleep(6500);

			enter_IC_First_Name(FnamePrefix + Fname);

			enter_IC_Last_Name(Lname);

			// enter_IC_Role("Student");

			enter_IC_SiteID(siteID);

			enter_IC_primaryEMailID(FnamePrefix + Pemail);

			enter_IC_SecondaryEMailID(FnamePrefix + Semail);

			enter_IC_Mobile("+91"+mobileNo);

			enter_IC_country_OR_region(country_Region);

			enter_IC_How_Did_you_Hear(howDidYouHear);
			Thread.sleep(4000);
			enter_IC_Primary_Language(primaryLanguage);
			Thread.sleep(4000);
			enter_IC_iWould_LikeToStudy_In(i_Would_Like_toStudyIn);// I Would Like to Study In
			Thread.sleep(1500);
			saveAndOpen_IC_record();
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(7500);
			System.out.println("Saved Record");
			click_On_Edit_IC_Record();
			Thread.sleep(3000);
			more_button_On_IC_OverviewPage();
			Thread.sleep(2500);
			enter_IC_overview_Gender(gender);
			Thread.sleep(2000);
			C4CDatePicker.enterTheDateWith_FieldLabelName("Date of Birth",DOB);
			//enter_IC_Overview_Date_of_Birth(DOB);// 1996-12-08
			Thread.sleep(1000);
			enetr_IC_non_English_Name(PrimaryLanguage);
			Thread.sleep(2000);
			enter_IC_overview_Nationality(Nationality);
			Thread.sleep(3500);
			enter_IC_overview_financialSource(financial);
			ic_overview_Save();
			Thread.sleep(4500);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			String studentID=getStudentID();
			ConfigReader.writeToApplicationPropertie("student360Id",studentID);
			ConfigReader.writeToApplicationPropertie("studentID",studentID);
             
		} catch (Exception ex) {
			System.out.println("ERROR--" + ex.getMessage());
		}

	}

	/****************************************************************************************/

//	public IC_CreationPage(WebDriver driver) {
//		IC_CreationPage.driver = driver;
//	}

	public static void enterdata_OnMouseOverField(By mouseOverElement, By dataInputElement, String txt)
			throws InterruptedException, IOException {
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementPresent(mouseOverElement);
		ElementUtil.scrollToElement(mouseOverElement);
		new Actions(DriverFactory.getDriver()).moveToElement(DriverFactory.getDriver().findElement(mouseOverElement)).click().build().perform();
		ElementUtil.Type(dataInputElement, txt);
	}

	// enterdata_OnMouseOverField

	public int getCountOf_IC_InTable() {

		return ElementUtil.getElementsCount(icsIntable);
	}

	public static void saveAndOpen_record() throws InterruptedException {

		ElementUtil.Click(dropDownMore, "More dropdown");
		ElementUtil.Click(saveAndOpen, "Save and open button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(6000);
	}

	public static void validateDuplicateSave() throws InterruptedException {
		for (int i = 1; i <= 3; i++) {
			ElementUtil.Click(dropDownMore, "More dropdown");
			ElementUtil.Click(saveAndOpen, "Save and open button");
			Thread.sleep(3000);
			ElementUtil.waitForPageLoad();
			ElementUtil.waitForElementClickable(dropDownMore);
		}
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		headerText = DriverFactory.getDriver().findElement(lbl_messageHeader).getText();
		if (headerText.contains("same e-mail address already exists")) {
			ExtentCucumberAdapter
					.addTestStepLog("<span style='color:green;font-weight:bold;'>" + headerText + "</span>");
			System.out.println(headerText);
		}
	}

//use
	public static void globalSaveOpen() {

		try {

			ElementUtil.click(btn_globalSaveOpenMore);
			ElementUtil.click(btn_globalSaveOpen);
		} catch (Exception ex) {
			ElementUtil.click(btn_globalSaveOpenMore);
			ElementUtil.click(btn_globalSaveOpen);
		}
	}

//***************************************************************************************************/

	public void navigateTo_IC_page() {

		appPageUtil.clickTab_underCategory("Customers", "Individual Customers");
		ElementUtil.waitForElementNotPresent(Loading);
	}
	
	

	public void naviagteTo_IC_creationPage() {
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementPresent(createICIcon);
		ElementUtil.click(createICIcon);
	}

//use
	public static void createIC() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementPresent(createICIcon);
		Thread.sleep(2000);
		ElementUtil.Click(createICIcon, "Create icon");
		Thread.sleep(1000);
		ElementUtil.waitForElementNotPresent(Loading);
		ElementUtil.waitForPageLoad();
	}

	// use
	public static void enterSiteID() throws InterruptedException, IOException {
		String SiteID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "SiteID");

		ElementUtil.Type(siteID, SiteID);
		Thread.sleep(5000);
		ElementUtil.waitForElementClickable(country_OR_region);
	}

	public void updateIC() throws InterruptedException, IOException {

		String Title = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Title");
		String MaritalStatus = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"MaritalStatus");
		String Nationality = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Nationality");

		ElementUtil.Type(txt_title, Title);
		Thread.sleep(1000);
		ElementUtil.Type(txt_maritalStatus, MaritalStatus);
		Thread.sleep(1000);
		ElementUtil.Type(txt_countryBirth, Nationality);
		Thread.sleep(1000);
		ElementUtil.Type(txt_countryResident, Nationality);
		Thread.sleep(1000);

	}

	// use
	public static void verifyCountryRegion() {
		if (DriverFactory.getDriver().findElement(country_OR_region).getText() != null) {
			System.out.println("Country and region is auto selected against the site id");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Country and region is auto selected against the site id" + "</span>");
		} else {
			System.out.println("Country and region is not populated");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "Country and region is auto selected against the site id" + "</span>");
		}
	}
	// use

	public static void verifyMobileCode() throws InterruptedException, IOException {

		String Mobile = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Mobile");
		String HowDidYouHear = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"HowDidYouHear");

		ElementUtil.Type(mobileNO, Mobile);
		Thread.sleep(5000);
		ElementUtil.Type(howDidyouHear, HowDidYouHear);
		Thread.sleep(3000);
		String mobNumber = DriverFactory.getDriver().findElement(mobileNO).getAttribute("value");
		Thread.sleep(5000);
		if (mobNumber.contains("+91")) {
			System.out.println("mobile number code is auto populated against the site id");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "mobile number code is auto populated against the site id" + "</span>");
		} else {
			System.out.println("mobile number code is not auto populated");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "mobile number code is not auto populated" + "</span>");
		}
	}

	// use
	public static void createIndividual_Customer(String type) throws IOException, InterruptedException {

		String SiteID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "SiteID");
		String Mobile = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Mobile");
		String Country = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Country");
		String HowDidYouHear = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"HowDidYouHear");
		String PrimaryLanguage = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"PrimaryLanguage");
		String IWouldLikeToStudyIn = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"IndividualCustomer", "IWouldLikeToStudyIn");
		String Gender = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Gender");
		String DOB = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "DOB");
		String Nationality = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Nationality");
		String PrimaryEmail = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"PrimaryEmail");
		String SecondaryEmail = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"SecondaryEmail");

		FnamePrefix = "automation" + ElementUtil.generateRandomNumber(8);
		String Pemail = FnamePrefix + "@yopmail.com";
		String Semail = FnamePrefix + "@yopmail.com";

		ElementUtil.waitForElementNotPresent(Loading);
		ElementUtil.Type(firtname, FnamePrefix);
		Thread.sleep(2000);
		ElementUtil.Type(lastName, Lname);
		Thread.sleep(2000);
		ElementUtil.Type(siteID, SiteID);
		Thread.sleep(2000);

		if (type.equals("General")) {
			ElementUtil.Type(primaryEMailID, Pemail);
			Thread.sleep(2000);
			ElementUtil.Type(secondaryEMailID, Semail);
			Thread.sleep(2000);

		} else if (type.equals("Duplicate")) {
			ElementUtil.Type(primaryEMailID, PrimaryEmail);
			Thread.sleep(2000);
			ElementUtil.Type(secondaryEMailID, SecondaryEmail);
			Thread.sleep(2000);
		}

		ElementUtil.Type(mobileNO, Mobile);
		Thread.sleep(2000);
		ElementUtil.Type(country_OR_region, Country);
		Thread.sleep(2000);
		ElementUtil.Type(howDidyouHear, HowDidYouHear);
		Thread.sleep(2000);
		ElementUtil.Type(primaryLang, PrimaryLanguage);
		Thread.sleep(2000);
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(1000);
		ElementUtil.waitForElementClickable(iWould_LikeToStudy_In);
		Thread.sleep(2000);
		ElementUtil.Type(iWould_LikeToStudy_In, IWouldLikeToStudyIn);
		Thread.sleep(2000);
		if (type.equals("Duplicate")) {
			validateDuplicateSave();
		} else {

			saveAndOpen_record();
			Thread.sleep(2000);
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			try {
				headerText = DriverFactory.getDriver().findElement(lbl_messageHeader).getText();
				if (headerText.contains("Potential duplicate")) {
					ExtentCucumberAdapter
							.addTestStepLog("<span style='color:green;font-weight:bold;'>" + headerText + "</span>");
					System.out.println(headerText);
					saveAndOpen_record();
					Thread.sleep(3000);
					ElementUtil.waitForPageLoad();
					Thread.sleep(2000);
					ElementUtil.Click(moreBtn, "More button");
					Thread.sleep(3000);
					ElementUtil.Click(btn_editIC, "Edit button");
					Thread.sleep(2000);
					ElementUtil.Type(drp_gender, Gender);
					Thread.sleep(2000);
					ElementUtil.Type(txt_dob, DOB);
					Thread.sleep(2000);
					ElementUtil.Type(drp_nationality, Nationality);
					Thread.sleep(2000);
					
//					ElementUtil.scrollToElement(mouseMoveGender);
//					Thread.sleep(2000);
//					enterdata_OnMouseOverField(mouseMoveGender, enterGender, Gender);
//					Thread.sleep(2000);
//					enterdata_OnMouseOverField(mouseMoveDOM, enter_DOB_YYYY_MM_DD, DOB);
//					Thread.sleep(2000);
//					enterdata_OnMouseOverField(mouseMoveNationality, enterNationality, Nationality);
//					Thread.sleep(3000);
					ElementUtil.Click(overviewSave, "Overview save");
					ElementUtil.waitForPageLoad();
				}
			} catch (Exception ee) {
				ElementUtil.Click(moreBtn, "More button");
				Thread.sleep(3000);
				ElementUtil.Click(btn_editIC, "Edit button");
				Thread.sleep(2000);
				ElementUtil.Type(drp_gender, Gender);
				Thread.sleep(2000);
				ElementUtil.Type(txt_dob, DOB);
				Thread.sleep(2000);
				ElementUtil.Type(drp_nationality, Nationality);
				Thread.sleep(2000);
//				ElementUtil.scrollToElement(mouseMoveGender);
//				Thread.sleep(2000);
//				enterdata_OnMouseOverField(mouseMoveGender, enterGender, Gender);
//				Thread.sleep(2000);
//				enterdata_OnMouseOverField(mouseMoveDOM, enter_DOB_YYYY_MM_DD, DOB);
//				Thread.sleep(2000);
//				enterdata_OnMouseOverField(mouseMoveNationality, enterNationality, Nationality);
//				Thread.sleep(3000);
				ElementUtil.Click(overviewSave, "Overview save");
				ElementUtil.waitForPageLoad();
			}

		}

	}
	public static void IndividualCustomer_others() throws InterruptedException, IOException 
	{
		String SiteID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "SiteID");
		String Mobile = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Mobile");
		String Country = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Country");
		String HowDidYouHear = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"HowDidYouHear");
		String PrimaryLanguage = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"PrimaryLanguage");
		String IWouldLikeToStudyIn = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"IndividualCustomer", "IWouldLikeToStudyIn");
		String Gender = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Gender");
		String DOB = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "DOB");
		String Nationality = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Nationality");
		String PrimaryEmail = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"PrimaryEmail");
		String SecondaryEmail = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"SecondaryEmail");

		FnamePrefix = "automation" + ElementUtil.generateRandomNumber(8);
		String Pemail = FnamePrefix + "@yopmail.com";
		String Semail = FnamePrefix + "@yopmail.com";

		ElementUtil.waitForElementNotPresent(Loading);
		ElementUtil.Type(firtname, FnamePrefix);
		Thread.sleep(2000);
		ElementUtil.Type(lastName, Lname);
		Thread.sleep(2000);
		ElementUtil.Type(siteID, SiteID);
		Thread.sleep(2000);
		ElementUtil.Type(primaryEMailID, Pemail);
		Thread.sleep(2000);
		ElementUtil.Type(secondaryEMailID, Semail);
		Thread.sleep(2000);
		ElementUtil.Type(mobileNO, Mobile);
		Thread.sleep(2000);
		ElementUtil.Type(country_OR_region, Country);
		Thread.sleep(2000);
		ElementUtil.Type(howDidyouHear, HowDidYouHear);
		Thread.sleep(2000);
		ElementUtil.Type(primaryLang, PrimaryLanguage);
		Thread.sleep(2000);
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(1000);
		ElementUtil.waitForElementClickable(iWould_LikeToStudy_In);
		Thread.sleep(2000);
		ElementUtil.Type(iWould_LikeToStudy_In, IWouldLikeToStudyIn);
		Thread.sleep(2000);
		saveAndOpen_record();
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		try {
			headerText = DriverFactory.getDriver().findElement(lbl_messageHeader).getText();
			if (headerText.contains("Potential duplicate")) {
				ExtentCucumberAdapter
						.addTestStepLog("<span style='color:green;font-weight:bold;'>" + headerText + "</span>");
				System.out.println(headerText);
				saveAndOpen_record();
				Thread.sleep(3000);
				}
			}catch(Exception e) 
			{
				Thread.sleep(3000);
			}
		
	}

	public static void IndividualCustomer_regression() throws InterruptedException, IOException {
		String SiteID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "SiteID");
		String Mobile = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Mobile");
		String Country = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Country");
		String HowDidYouHear = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"HowDidYouHear");
		String PrimaryLanguage = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"PrimaryLanguage");
		String IWouldLikeToStudyIn = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,

				"IndividualCustomer", "IWouldLikeToStudyIn");

		FnamePrefix = "automation" + ElementUtil.generateRandomNumber(8);
		String Pemail = FnamePrefix + "@yopmail.com";
		String Semail = FnamePrefix + "@yopmail.com";

		ElementUtil.waitForElementNotPresent(Loading);
		ElementUtil.Type(firtname, FnamePrefix);
		Thread.sleep(1000);
		ElementUtil.Type(lastName, Lname);
		Thread.sleep(1000);
		ElementUtil.Type(siteID, SiteID);
		Thread.sleep(1000);
		ElementUtil.Type(primaryEMailID, Pemail);
		Thread.sleep(1000);
		ElementUtil.Type(secondaryEMailID, Semail);
		Thread.sleep(1000);
		ElementUtil.Type(mobileNO, Mobile);
		Thread.sleep(1000);
		ElementUtil.Type(country_OR_region, Country);
		Thread.sleep(1000);
		ElementUtil.Type(howDidyouHear, HowDidYouHear);
		Thread.sleep(2000);
		ElementUtil.Type(primaryLang, PrimaryLanguage);
		Thread.sleep(2000);
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(1000);
		ElementUtil.waitForElementClickable(iWould_LikeToStudy_In);
		Thread.sleep(1000);
		ElementUtil.Type(iWould_LikeToStudy_In, IWouldLikeToStudyIn);
		Thread.sleep(2000);

		r_firstName = DriverFactory.getDriver().findElement(firtname).getText();
		r_lastName = DriverFactory.getDriver().findElement(lastName).getText();
		r_siteID = DriverFactory.getDriver().findElement(siteID).getText();
		r_country = DriverFactory.getDriver().findElement(country_OR_region).getText();
		r_howDidHear = DriverFactory.getDriver().findElement(howDidyouHear).getText();
		r_primaryLanguage = DriverFactory.getDriver().findElement(primaryLang).getText();

	}

	public static void saveICrecord(String SaveType) throws InterruptedException {
		if (SaveType.equals("Save")) {
			ElementUtil.Click(dropDownMore, "More dropdown");
			ElementUtil.Click(btn_SaveICRegression, "Save button");
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			try {
				headerText = DriverFactory.getDriver().findElement(lbl_messageHeader).getText();
				if (headerText.contains("Potential duplicate")) {
					saveAndOpen_record();
					Thread.sleep(3000);
					ElementUtil.waitForPageLoad();
					Thread.sleep(2000);
				}
			} catch (Exception ee) {
				ee.printStackTrace();
			}
			ElementUtil.waitForElementClickable(tbl_IcList);
			Thread.sleep(3000);

		}
		if (SaveType.equals("Save and Open")) {
			ElementUtil.Click(dropDownMore, "More dropdown");
			ElementUtil.Click(saveAndOpen, "Save and open button");
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			try {
				headerText = DriverFactory.getDriver().findElement(lbl_messageHeader).getText();
				if (headerText.contains("Potential duplicate")) {
					ExtentCucumberAdapter
							.addTestStepLog("<span style='color:green;font-weight:bold;'>" + headerText + "</span>");
					System.out.println(headerText);
					saveAndOpen_record();
					Thread.sleep(3000);
					ElementUtil.waitForPageLoad();
					Thread.sleep(2000);
				}
			} catch (Exception ee) {
				// ee.printStackTrace();
			}
			ElementUtil.Click(moreBtn, "More button");
			Thread.sleep(3000);
			ElementUtil.waitForPageLoad();

			verifyOverviewPage();
		}
		if (SaveType.equals("Save and New")) {
			ElementUtil.Click(dropDownMore, "More dropdown");
			ElementUtil.Click(btn_saveNew, "Save and Open button");
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			try {
				headerText = DriverFactory.getDriver().findElement(lbl_messageHeader).getText();
				if (headerText.contains("Potential duplicate")) {
					ExtentCucumberAdapter
							.addTestStepLog("<span style='color:green;font-weight:bold;'>" + headerText + "</span>");
					System.out.println(headerText);
					saveAndOpen_record();
					Thread.sleep(3000);
					ElementUtil.waitForPageLoad();
					Thread.sleep(2000);
				}
			} catch (Exception ee) {
				ElementUtil.waitForElementClickable(tbl_IcList);
				Thread.sleep(3000);
			}

		}
	}

	public static void verifyOverviewPage() {
		if (DriverFactory.getDriver().findElement(lbl_name).getText().contains(r_firstName)) {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:green;font-weight:bold;'>" + "FisrtName field is verified" + "</span>");
		}

		if (DriverFactory.getDriver().findElement(lbl_name).getText().contains(r_lastName)) {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:green;font-weight:bold;'>" + "LastName field is verified" + "</span>");
		}
		if (DriverFactory.getDriver().findElement(lbl_siteID).getText().contains(r_siteID)) {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:green;font-weight:bold;'>" + "SiteID field is verified" + "</span>");
		}
		if (DriverFactory.getDriver().findElement(lbl_primaryLang).getText().contains(r_primaryLanguage)) {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:green;font-weight:bold;'>" + "Primary Language field is verified" + "</span>");
		}
		if (DriverFactory.getDriver().findElement(lbl_howHear).getText().contains(r_howDidHear)) {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:green;font-weight:bold;'>" + "How did you hear field is verified" + "</span>");
		}

	}

	public static void verifyDefaultValuesOverviewPage() {
		String personType = DriverFactory.getDriver().findElement(lbl_personType).getText();
		if (personType.equals("Student")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Default value for person type field : " + personType + "</span>");
		} else {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:red;font-weight:bold;'>" + "Default value not matched : " + "</span>");
		}

		String studentID = DriverFactory.getDriver().findElement(lbl_studentID).getText();
		ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
				+ "Student Id generated sucessfully : " + studentID + "</span>");

		String studentLifecycle = DriverFactory.getDriver().findElement(lbl_studentLifecycle).getText();
		if (studentLifecycle.equals("Engage")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Default value for studentlife cycle field : " + studentLifecycle + "</span>");
		} else {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:red;font-weight:bold;'>" + "Default value not matched : " + "</span>");
		}

		String gender = DriverFactory.getDriver().findElement(lbl_gender).getText();
		if (gender.equals("Undefined")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Default value for gender field : " + gender + "</span>");
		} else {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:red;font-weight:bold;'>" + "Default value not matched : " + "</span>");
		}

		String createdBy = DriverFactory.getDriver().findElement(lbl_createdBy).getText();
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:green;font-weight:bold;'>" + "Created By : " + createdBy + "</span>");

		String contactMe = DriverFactory.getDriver().findElement(lbl_contactMe).getText();
		if (contactMe.equals("Phone,Email")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Default value for contact me field : " + contactMe + "</span>");
		} else {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:red;font-weight:bold;'>" + "Default value not matched : " + "</span>");
		}

		String createdOn = DriverFactory.getDriver().findElement(lbl_createdOn).getText();
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:green;font-weight:bold;'>" + "Created On : " + createdOn + "</span>");

	}

	public static void verifyIDPsection() {
		String idpSectionTitle = DriverFactory.getDriver().findElement(lbl_IDPsection).getText();
		if (idpSectionTitle.equals("(1)")) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "IDP section displyed sucesfully and Default row count is : " + idpSectionTitle + "</span>");
			List<WebElement> list_IDPsection1 = DriverFactory.getDriver()
					.findElements(By.xpath("(//div[@data-help-id='95KL1Dm0tKE5xSI699jpz0']//tbody//tr//td//span)"));

			for (WebElement iterate_idp1 : list_IDPsection1) {
				String idpValues1 = iterate_idp1.getText();
				ExtentCucumberAdapter
						.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + idpValues1 + "</span>");

			}
			List<WebElement> list_IDPsection2 = DriverFactory.getDriver()
					.findElements(By.xpath("(//div[@data-help-id='95KL1Dm0tKE5xSI699jpz0']//tbody//tr//td//a)"));

			for (WebElement iterate_idp2 : list_IDPsection2) {
				String idpValues2 = iterate_idp2.getText();
				ExtentCucumberAdapter
						.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + idpValues2 + "</span>");

			}
		} else {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:red;font-weight:bold;'>" + "Default value not matched : " + "</span>");
		}
	}

	public static void verifyOverviewFields() throws Exception {

		ElementUtil.comparePickList("Picklist", "IC_OverviewPage", list_overviewFacetIC);
	}

	public static void createIndividual_Customers_Train() throws IOException, InterruptedException {

		String SiteID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "SiteID");
		String Mobile = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Mobile");
		String Country = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Country");
		String HowDidYouHear = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"HowDidYouHear");
		String PrimaryLanguage = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"PrimaryLanguage");
		String IWouldLikeToStudyIn = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,

				"IndividualCustomer", "IWouldLikeToStudyIn");
		String Gender = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Gender");
		String DOB_Train = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"DOB_Train");
		String Nationality = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Nationality");

		FnamePrefix = "automation" + ElementUtil.generateRandomNumber(8);
		String Pemail = FnamePrefix + "@yopmail.com";
		String Semail = FnamePrefix + "@yopmail.com";

		ElementUtil.waitForElementNotPresent(Loading);
		ElementUtil.Type(firtname, FnamePrefix);
		Thread.sleep(1000);
		ElementUtil.Type(lastName, Lname);
		Thread.sleep(1000);
		ElementUtil.Type(siteID, SiteID);
		Thread.sleep(1000);
		ElementUtil.Type(primaryEMailID, Pemail);
		Thread.sleep(1000);
		ElementUtil.Type(secondaryEMailID, Semail);
		Thread.sleep(1000);
		ElementUtil.Type(mobileNO, Mobile);
		Thread.sleep(1000);
		ElementUtil.Type(country_OR_region, Country);
		Thread.sleep(1000);
		ElementUtil.Type(howDidyouHear, HowDidYouHear);
		Thread.sleep(3000);
		ElementUtil.Type(primaryLang, PrimaryLanguage);
		Thread.sleep(2000);
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(1000);
		ElementUtil.waitForElementClickable(iWould_LikeToStudy_In);
		Thread.sleep(1000);
		ElementUtil.Type(iWould_LikeToStudy_In, IWouldLikeToStudyIn);
		Thread.sleep(2000);
		saveAndOpen_record();
		ElementUtil.waitForPageLoad();
		Thread.sleep(3000);
		try {
			ElementUtil.waitForElementClickable(dropDownMore);
			Thread.sleep(2000);
			saveAndOpen_record();
			Thread.sleep(3000);
			ElementUtil.waitForPageLoad();
			ElementUtil.Click(moreBtn, "More button");
			Thread.sleep(3000);
			ElementUtil.Click(btn_editIC, "Edit button");
			Thread.sleep(2000);
			ElementUtil.Type(drp_gender, Gender);
			Thread.sleep(2000);
			ElementUtil.Type(txt_dob, DOB_Train);
			Thread.sleep(2000);
			ElementUtil.Type(drp_nationality, Nationality);
			Thread.sleep(2000);
//			ElementUtil.scrollToElement(mouseMoveGender);
//			Thread.sleep(2000);
//			enterdata_OnMouseOverField(mouseMoveDOM, enter_DOB_YYYY_MM_DD, DOB_Train);
//			Thread.sleep(2000);
//			enterdata_OnMouseOverField(mouseMoveGender, enterGender, Gender);
//			Thread.sleep(2000);
//			enterdata_OnMouseOverField(mouseMoveNationality, enterNationality, Nationality);
//			Thread.sleep(3000);
			ElementUtil.Click(overviewSave, "Overview save");
			ElementUtil.waitForPageLoad();
		} catch (Exception e) {
			ElementUtil.Click(moreBtn, "More button");
			Thread.sleep(3000);
			ElementUtil.Click(btn_editIC, "Edit button");
			Thread.sleep(2000);
			ElementUtil.Type(drp_gender, Gender);
			Thread.sleep(2000);
			ElementUtil.Type(txt_dob, DOB_Train);
			Thread.sleep(2000);
			ElementUtil.Type(drp_nationality, Nationality);
			Thread.sleep(2000);
//			ElementUtil.scrollToElement(mouseMoveGender);
//			Thread.sleep(2000);
//			enterdata_OnMouseOverField(mouseMoveGender, enterGender, Gender);
//			Thread.sleep(2000);
//			enterdata_OnMouseOverField(mouseMoveDOM, enter_DOB_YYYY_MM_DD, DOB_Train);
//			Thread.sleep(2000);
//			enterdata_OnMouseOverField(mouseMoveNationality, enterNationality, Nationality);
//			Thread.sleep(3000);
			ElementUtil.Click(overviewSave, "Overview save");
			ElementUtil.waitForPageLoad();
		}

	}

	public static void UpdateICRecord() throws InterruptedException, IOException {

		String Gender = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Gender");
		String DOB = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "DOB");
		String Nationality = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Nationality");

		ElementUtil.Click(moreBtn, "More button");
		Thread.sleep(3000);
		ElementUtil.scrollToElement(mouseMoveGender);
		Thread.sleep(2000);
		enterdata_OnMouseOverField(mouseMoveGender, enterGender, Gender);
		Thread.sleep(2000);
		enterdata_OnMouseOverField(mouseMoveDOM, enter_DOB_YYYY_MM_DD, DOB);
		Thread.sleep(2000);
		enterdata_OnMouseOverField(mouseMoveNationality, enterNationality, Nationality);
		Thread.sleep(3000);
		ElementUtil.Click(overviewSave, "Overview save");
		ElementUtil.waitForPageLoad();

	}

	public static void addMoreDetails() throws InterruptedException, IOException {
		String Gender = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Gender");
		String DOB = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "DOB");
		String Nationality = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Nationality");
		String PrimaryLanguage = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"PrimaryLanguage");

		ElementUtil.Click(moreBtn, "More button");
		Thread.sleep(3000);
		ElementUtil.Type(enterGender, Gender);
		Thread.sleep(2000);
//		ElementUtil.Type(enter_DOB_YYYY_MM_DD, DOB);
//		Thread.sleep(2000);
		ElementUtil.Type(enterNationality, Nationality);
		Thread.sleep(2000);
		ElementUtil.Type(primaryLangTrain, PrimaryLanguage);
		Thread.sleep(2000);
		ElementUtil.scrollToElement(btn_showCommunicationDetail);
		Thread.sleep(1000);
		ElementUtil.Click(btn_showCommunicationDetail, "Communication details button");
		Thread.sleep(2000);
		ElementUtil.Type(txt_mobileNumber, "+468456736458");
		Thread.sleep(2000);
		ElementUtil.Click(overviewSave, "Overview save");
		ElementUtil.waitForPageLoad();
	}

	public static void UpdateICRecordTrain() throws InterruptedException, IOException {

		String Gender = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer", "Gender");
		String DOB_Train = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"DOB_Train");
		String Nationality = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IndividualCustomer",
				"Nationality");

		ElementUtil.Click(moreBtn, "More button");
		Thread.sleep(3000);
		ElementUtil.Click(btn_editIC, "Edit button");
		Thread.sleep(2000);
		ElementUtil.Type(drp_gender, Gender);
		Thread.sleep(2000);
		ElementUtil.Type(txt_dob, DOB_Train);
		Thread.sleep(2000);
		ElementUtil.Type(drp_nationality, Nationality);
		Thread.sleep(2000);
//		ElementUtil.scrollToElement(mouseMoveGender);
//		Thread.sleep(2000);
//		enterdata_OnMouseOverField(mouseMoveGender, enterGender, Gender);
//		Thread.sleep(2000);
//		enterdata_OnMouseOverField(mouseMoveDOM, enter_DOB_YYYY_MM_DD, DOB_Train);
//		Thread.sleep(2000);
//		enterdata_OnMouseOverField(mouseMoveNationality, enterNationality, Nationality);
//		Thread.sleep(3000);
		ElementUtil.Click(overviewSave, "Overview save");
		ElementUtil.waitForPageLoad();

	}

	public void click_First_IC_from_ICtable() {

		List<WebElement> ele = DriverFactory.getDriver().findElements(slectICfromtableList);
		ele.get(0).click();
		ElementUtil.waitForPageLoad();
	}

	public void click_On_search_IC() {
		try {
			Thread.sleep(2000);
			ElementUtil.click(slectICfromtableList);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String get_IC_Table_HeadingText() {
		return ElementUtil.getTextValue(IcTabel_headingTitle);
	}

	public String get_IC_overviewPage_text() {
		return ElementUtil.getTextValue(Ic_overview_page);
	}

	public void getHCEmail() throws InterruptedException {
		HCemail = ConfigReader.getApplicationPropertie("HCEmail");
		Thread.sleep(1000);
	}

	// use
	public void search_for_IC() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.click(Clikcsearch);
		Thread.sleep(1000);
		ElementUtil.type(enterSearch, newStudent);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(slectICfromtableList);
	}

	// use
	public void search_for_HCemail() throws InterruptedException {
		ElementUtil.click(Clikcsearch);
		Thread.sleep(1000);
		ElementUtil.type(enterSearch, ConfigReader.getApplicationPropertie("HCEmail"));
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(slectICfromtableList);
	}

	public void sort_IC() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(btn_Sort);
		ElementUtil.click(btn_Sort);
		Thread.sleep(2000);
		ElementUtil.doubleClick(btn_CreatedOn);
		Thread.sleep(2000);
		ElementUtil.doubleClick(btn_Descending);
		Thread.sleep(2000);
		ElementUtil.click(btn_SortOk);
		Thread.sleep(3000);

	}

	// use
	public void getStudentId() {
		ElementUtil.waitForPageLoad();
		stud_Id = DriverFactory.getDriver().findElement(lbl_studentId).getText();
		ConfigReader.writeToApplicationPropertie("studentID", stud_Id);
	}

	public void getStudentIdContract() {
		ElementUtil.waitForPageLoad();
		stud_Id = DriverFactory.getDriver().findElement(lbl_studentId).getText();
		ConfigReader.writeToApplicationPropertie("studentIDContract", stud_Id);
	}

	// use
	public void putStudentId() {
		newStudent = ConfigReader.getApplicationPropertie("studentID");
	}

	public void putStudentIdContract() {
		newStudent = ConfigReader.getApplicationPropertie("studentIDContract");
	}

	public static void getCPPStudentId() {
		newStudent = ConfigReader.getApplicationPropertie("CppStudentID");
	}

	// use
	public static void clickMoreButton() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(moreBtn, "More button");
		Thread.sleep(1000);
		ElementUtil.waitForPageLoad();
	}

	// use
	public void editIC() throws InterruptedException {
		ElementUtil.Click(btn_editIC, "Edit button");
		Thread.sleep(1000);
	}
	// use

	// use

	public void saveIC() throws InterruptedException {
		ElementUtil.click(btn_SaveIC);
		Thread.sleep(1000);
	}

//use
	public static boolean verifyLead() {

		List<WebElement> tbl = DriverFactory.getDriver().findElements(tbl_leadList);
		int tblCpount = tbl.size();
		if (tblCpount > 1) {
			return false;
		} else {
			return true;
		}

	}

	public void refferedByPopup() throws InterruptedException {
		ElementUtil.Click(icon_referedBy, "Refeered by icon");
		Thread.sleep(2000);
		ElementUtil.Click(tbl_referedByData, "Reffered by table data");
		Thread.sleep(2000);

	}

	public void referralCounsellorPopup() throws InterruptedException {
		ElementUtil.click(icon_referralCounsellor);
		Thread.sleep(2000);
		ElementUtil.click(tbl_referralCounsellorData);
		Thread.sleep(2000);

	}

	// use
	public void saveNewIC() throws InterruptedException {
		ElementUtil.Click(btn_SaveNewIC, "Save button");
		Thread.sleep(2000);
	}

	// use
	public void clickFirstRecordFromIC() throws InterruptedException {
		ElementUtil.waitForElementClickable(lbl_firstRecordIC);
		Thread.sleep(5000);
		ElementUtil.doubleClick(lbl_firstRecordIC);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	// use
	public boolean HCmultipleRow() {
		List<WebElement> tbl = DriverFactory.getDriver().findElements(tbl_leadList);
		int tblCpount = tbl.size();
		if (tblCpount > 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void globalEdit() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_globalEdit, "Edit button");
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(2000);
		try {
			ElementUtil.Click(btn_lockObject, "Unlock object Yes button");
			ElementUtil.waitForElementNotPresent(Loading);
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}

	public static void globalCancel() {
		try {

			ElementUtil.waitForPageLoad();
			if (ElementUtil.waitForElementVisibleReturn(btn_globalCancel))
				Thread.sleep(2000);
			ElementUtil.Click(btn_globalCancel, "Cancel button");
			ElementUtil.waitForElementNotPresent(Loading);
			Thread.sleep(2000);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void clickAllPicklistfromIC() {
		ElementUtil.Click(drp_GenderOverview, "Gender button");
		ElementUtil.Click(drp_studentLifecycle, "Student Lifecycle button");
	}

	public static void studentLifeCyclePickList() throws Exception {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_studentLifecycle);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_studentLifecycle);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IC_StudentLifecycle", li_picklistOverview);
	}

	public static void genderPicklist() throws Exception {
		ElementUtil.waitForElementClickable(drp_GenderOverview);
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_GenderOverview);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_GenderOverview);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IC_Gender", li_picklistOverview);
		// ExtentCucumberAdapter.addTestStepLog("<span
		// style='color:blue;font-weight:bold;'>"+"Gender picklist verified"+"</span>");

	}

	public static void maritalStatusPicklist() throws Exception {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_MaritalOverview);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_MaritalOverview);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IC_MaritalStatus", li_picklistOverview);
		// ExtentCucumberAdapter.addTestStepLog("<span
		// style='color:blue;font-weight:bold;'>"+"Marital Status picklist
		// verified"+"</span>");

	}

	public static void countryOfBirthPicklist() throws Exception {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_countryBirthOverview);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_countryBirthOverview);
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IC_CountryOfBirth", li_picklistOverview);
	}

	public static void nationalityPicklist() throws Exception {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_Nationality);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_Nationality);
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IC_Nationality", li_picklistOverview);
	}

	public static void countryOfResidentPicklist() throws Exception {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_countryResidentOverview);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_countryResidentOverview);
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IC_CountryOfResidency", li_picklistOverview);
	}

	public static void primaryLanguagePicklist() throws Exception {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_languageOverview);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_languageOverview);
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IC_PrimaryLanguage", li_picklistOverview);
	}

	public static void academicTitlePicklist() throws Exception {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_AcademicOverview);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_AcademicOverview);
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IC_AcademicTitle", li_picklistOverview);
	}

	public static void siteIdPicklist() throws Exception {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_siteIdOverview);
		Thread.sleep(2000);
		ElementUtil.scrollToTopOfPage();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_siteIdOverview);
		ElementUtil.waitForElementNotPresent(Loading);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IC_SiteID", li_picklistOverview);
	}

	public static void counsellingModePicklist() throws Exception {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.doubleClick(drp_counsellingOverview);
		Thread.sleep(2000);
		ElementUtil.comparePickList("Picklist", "IC_CounsellingMode", li_picklistOverview);
	}

	public static void verifyShowCommunicationDetails() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		boolean showToggle = DriverFactory.getDriver().findElement(btn_showCommunication).isSelected();
		if (showToggle == true) {
			System.out.println("Show communication Toggle already enabled");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Show communication Toggle already enabled" + "</span>");
		} else {
			ElementUtil.Click(btn_showCommunication, "Show communication toggle");
			Thread.sleep(2000);
			List<WebElement> showCommunicatinList = DriverFactory.getDriver().findElements(lbl_showCommunication);
			for (WebElement list : showCommunicatinList) {
				System.out.println(list.getAttribute("value"));
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Communication Details are: " + list.getAttribute("value") + "</span>");
			}
		}

	}

	public static void verifyRefferedBy() throws InterruptedException {
		ElementUtil.Click(btn_refferedBypopup, "Reffered by popup");
		Thread.sleep(2000);
		ElementUtil.Click(tbl_reffredByData2, "Reffered by data");
		Thread.sleep(2000);

	}

	public static void verifyHeaderRefferedBy() throws InterruptedException {
		ElementUtil.verifyHeaderMessage("Please enter ‘Referral’ and ‘Referral counsellor’ field");
		Thread.sleep(2000);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
				+ "Save failed  |  Please enter ‘Referral’ and ‘Referral counsellor’ field.  " +"</span>");
	}

	public static void verifyReferralCounselor() throws InterruptedException {
		ElementUtil.Click(btn_referralCounsellorPopup, "Refferal counsellor popup");
		Thread.sleep(2000);
		ElementUtil.Click(tbl_refferalCounsellordata, "Refferal counsellor data");
		Thread.sleep(2000);
	}

	public static void verifyHeaderRefferalCounsellor() throws InterruptedException {
		ElementUtil.verifyHeaderMessage("Please enter ‘Referral’ and ‘Referral counsellor’ field");
		Thread.sleep(2000);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
				+ "Save failed  |  Please enter ‘Referral’ and ‘Referral counsellor’ field.  " +"</span>");
	}

	public static void FillRefferalFields() throws InterruptedException {
		ElementUtil.Click(btn_refferedBypopup, "Reffered by popup");
		Thread.sleep(2000);
		ElementUtil.Click(tbl_reffredByData2, "Reffered by data");
		Thread.sleep(2000);
		ElementUtil.Click(btn_referralCounsellorPopup, "Refferal counsellor popup");
		Thread.sleep(2000);
		ElementUtil.Click(tbl_refferalCounsellordata, "Refferal counsellor data");
		Thread.sleep(2000);
	}
	public static void verifyHeaderRefferal() throws InterruptedException {
		ElementUtil.verifyHeaderMessage("Your entries have been saved");
		Thread.sleep(2000);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
				+ "Your entries have been saved.  " +"</span>");
	}
	public static void clickFirstLead() throws InterruptedException 
	{
		ElementUtil.Click(btn_firstLead, "First lead");
		Thread.sleep(2000);
	}
}
