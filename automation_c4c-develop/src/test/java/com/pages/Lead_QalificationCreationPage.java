package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;
import com.qa.util.Excel_Reader;

import AppHooks.ApplicationHooks;

public class Lead_QalificationCreationPage {

	// private By
	// I_Would_Like_to_Study_In_click=By.xpath(".//*[@data-help-id='04a2628369986dea94d5c9cc6428dc00']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private By enter_I_Would_Like_to_Study_In = By
			.xpath(".//*[@data-help-id='04a2628369986dea94d5c9cc6428dc00']//input");
	private By update_I_Would_Like_to_Study_In = By
			.xpath(".//*[@data-help-id='8f50907835b9e464a4520e43c469921f']//input");
	private By qualificationTab = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'QUALIFICATION')]");
	// private By iPlanToStudyClick =
	// By.xpath(".//*[@data-help-id='d4ace59d9a5fe0d7b41da71ab917ec91']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private By enter_iPlanToStudy = By.xpath(".//*[@data-help-id='d4ace59d9a5fe0d7b41da71ab917ec91']//input");
	//private By study_Level_I_Prefer_Is_click = By.xpath(".//*[@data-help-id='1c81831953229eb6529dcd737a0e6007']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private By enter_study_Level_I_Prefer_Is = By.xpath(".//*[@data-help-id='1c81831953229eb6529dcd737a0e6007']//input");// Postgraduate
	//private By i_Would_Like_Information_On_click = By.xpath(".//*[@data-help-id='706d40e7ea43425bac16bd5248d34b9e']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private By enter_i_Would_Like_Information_On = By
			.xpath(".//*[@data-help-id='706d40e7ea43425bac16bd5248d34b9e']//input");// English Language Support
	// private By study_plan_date_click =
	// By.xpath(".//*[@data-help-id='25f04711f59c5151eb7864d9433e1709']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private By enter_study_plan_date = By.xpath(".//*[@data-help-id='25f04711f59c5151eb7864d9433e1709']//input");// 2024-12-02
	// private By english_Proficiency_Test_click =
	// By.xpath(".//*[@data-help-id='f65cf5852ade92da0f2836ef5562c8c8']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private By enter_english_Proficiency_Test = By
			.xpath(".//*[@data-help-id='f65cf5852ade92da0f2836ef5562c8c8']//input");// I Have Taken an IELTS Test
	// private By primary_Financial_Sources_click =
	// By.xpath(".//*[@data-help-id='6c73aa0971916cbe6600e81ce0be2129']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private By enter_primary_Financial_Sources = By
			.xpath(".//*[@data-help-id='6c73aa0971916cbe6600e81ce0be2129']//input");// Self-Funded
	// private By qualification_click =
	// By.xpath(".//*[@data-help-id='Zqr5yFeb4qciNzoHu01cT0']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	private By enterQualification = By.xpath(".//*[@data-help-id='Zqr5yFeb4qciNzoHu01cT0']//input");// Hot
	private By enterResonForCold = By.xpath(".//*[@data-help-id='d05ff5770e28db56f56503b81399c49c']//input");

	private By saveQualification = By.xpath(".//*[@data-help-id='ri5eGNT8EK_NrSYPtZASbW']");
	private By editQualificationBtn = By
			.xpath(".//*[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");

//	public Lead_QalificationCreationPage(WebDriver driver) {
//		this.driver = driver;
//	}

	ApplicationPageUtil appPageUtil = new ApplicationPageUtil();

	/******************************************************************************************************/

	public void create_Qualification() {
		try {
			Thread.sleep(2000);
			click_On_Edit_Qualification();
			enter_iPlanToStudy("Between 12 and 18 Months");
			enter_study_plan_date("2023-12-08");
			enter_studyLevel_I_Prefer_Is("Postgraduate");
			enter_i_WouldLike_Information_On("English Language Support");
			enter_englishProficiency_Test("I Have Taken an IELTS Test");
			enter_primary_Financial_Sources("Self-Funded");
			enter_qualification("Hot");
			save_qualification();
		} catch (Exception ex) {

		}
		ElementUtil.waitForPageLoad();
	}

	/***************** Gowtham ********************/
	public void click_On_Edit_Qualification() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(editQualificationBtn);
	}

	public void navigateTo_QualificationTab() {
		try {
			// Thread.sleep(4000);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2000);
			ElementUtil.scrollToElement(qualificationTab);
			ElementUtil.click(qualificationTab);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void click_QualificationTab() {
		try {
			Thread.sleep(3000);
			ElementUtil.scrollToElement(qualificationTab);
			ElementUtil.click(qualificationTab);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update_I_Would_Like_to_Study_In_QualificationPage(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.selectDDChkBoxOption(enter_I_Would_Like_to_Study_In, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enter_I_Would_Like_to_Study_In(String text) {
		try {
			Thread.sleep(2000);
			appPageUtil.typeWithEnt(enter_I_Would_Like_to_Study_In, text);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_iPlanToStudy(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2000);
			appPageUtil.typeWithEnt(enter_iPlanToStudy, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_studyLevel_I_Prefer_Is(String text) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPageUtil.type_KeysEnter(enter_study_Level_I_Prefer_Is, text);
	}

	public void enter_i_WouldLike_Information_On(String text) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.typeWithEnt(enter_i_Would_Like_Information_On, text);
	}

	public void enter_study_plan_date(String text) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.typeWithEnt(enter_study_plan_date, text);
	}

	public void enter_englishProficiency_Test(String text) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.typeWithEnt(enter_english_Proficiency_Test, text);
	}

	public void enter_primary_Financial_Sources(String text) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.typeWithEnt(enter_primary_Financial_Sources, text);
	}

	public void enter_qualification(String text) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.typeWithEnt(enterQualification, text);
		if (text.equals("Cold")) {

			appPageUtil.typeWithEnt(enterResonForCold,"Financial reasons");
		}
	}

	public void save_qualification() {

		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2000);
			ElementUtil.click(saveQualification);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void create_Qualification(String testcaseNo) {
		try {
			Thread.sleep(2000);
			click_On_Edit_Qualification();

			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
			String date = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
					"Study Plan Date");
			String iPlanToStudy = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
					"I Plan To Study");
			String studyLevel_i_Prefer_Is = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
					"ICLeadCreation", "Study Level I Prefer Is");
			String qualification = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
					"Qualification Level");

			System.out.println(iPlanToStudy);
			System.out.println(studyLevel_i_Prefer_Is);
			ConfigReader.writeToApplicationPropertie("iCStudyPlanDate", date);
			ConfigReader.writeToApplicationPropertie("iCStudyLevelIprefer", studyLevel_i_Prefer_Is);
			C4CDatePicker.enterTheDateWith_FieldLabelName("Study Plan Date",date);
			enter_iPlanToStudy(iPlanToStudy);
			//enter_study_plan_date(date);
			enter_studyLevel_I_Prefer_Is(studyLevel_i_Prefer_Is);
			enter_i_WouldLike_Information_On("English Language Support");
			// enter_englishProficiency_Test("IELTS");
		    //enter_primary_Financial_Sources("Self-Funded");
			enter_qualification(qualification);
			save_qualification();
		} catch (Exception ex) {

		}
		ElementUtil.waitForPageLoad();
	}

	/***********************************/

	public void update_I_Would_Like_to_Study_In(String text) {
		try {
			ElementUtil.scrollToTopOfPage();
			appPageUtil.selectDDChkBoxOption(update_I_Would_Like_to_Study_In, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update_iPlanToStudy(String text) {
		try {
			Thread.sleep(2000);
			ElementUtil.type(enter_iPlanToStudy, text);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update_studyLevel_I_Prefer_Is(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.type(enter_study_Level_I_Prefer_Is, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update_i_WouldLike_Information_On(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.type(enter_i_Would_Like_Information_On, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update_study_plan_date(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.scrollToElement(enter_study_plan_date);
			ElementUtil.type(enter_study_plan_date, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update_englishProficiency_Test(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.type(enter_english_Proficiency_Test, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update_primary_Financial_Sources(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.type(enter_primary_Financial_Sources, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update_qualification(String text) {
		try {
			ElementUtil.scrollToBottomOfPage();
			enter_qualification(text);
		} catch (StaleElementReferenceException ex) {
			enter_qualification(text);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
