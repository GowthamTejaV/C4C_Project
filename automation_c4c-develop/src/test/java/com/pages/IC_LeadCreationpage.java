package com.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.WaitsUtil;

public class IC_LeadCreationpage {

	private By refreshButton = By.xpath(".//button[@data-help-id='ShhKB9IH44M8cgwdZYyT4W']");
	private By switchToLeadTab = By
			.xpath(".//button[@title='extended-lead']/following-sibling::div//span[text()='Lead']");
	private By converToOpp_Page_Leadname = By.xpath(".//div[@data-help-id='v3VCALpuTKUWFn2BDe1e60']//input");
	private By converToOpp_Page_IcName = By.xpath(".//div[@data-help-id='0HgaZ7u0UKorxBUVGTh0aW']//input");
	private By converToOpp_Page_IDPOwner = By.xpath(".//div[@data-help-id='EbvjvhyioaQwVb6zuzqjlm']//input");
	private By converToOpp_Page_InstitutionName = By.xpath(".//div[@data-help-id='wix8_$Hbx4kKjp9glMVMHG']//input");
	/*****************************************************************/

	private By leadTabFromOpp = By.xpath(".//button[@title='extended-lead']");

	/******************** Filter the Lead Records *****************************/

	private By categoryFilter = By.xpath("(.//th[@data-help-id='o21QGkJVaagsOlO5l0Ol2G'])[1]");
	private By filter_search = By.xpath(".//div/input[@placeholder='Search']");

	private By qualification_level = By.xpath("(.//th[@data-help-id='3PXJ_E5Co4oWI_DL8llWJW'])[1]");

	private By statusFilter = By.xpath("(.//th[@data-help-id='Rf6FYE6chq61kgr$DT9_YG'])[1]");

	/*****************/
	private By moreBtn_OverviewPage = By.xpath("(.//*[@data-help-id='button-ObjectDetail-MoreOrLess']//span)[2]");
	private By CAP_APPLICATION_DETAILS = By
			.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'CAP APPLICATION DETAILS')]");
	private By leadOverview = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'OVERVIEW')]");
	private By leadTab = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'LEADS')]");
	// ACTIVITIES
	private By ACTIVITIES = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'ACTIVITIES')]");
	private By Task = By.xpath(".//*[@data-help-id='9nwIo$iqK4kQ5xcmYrdzRW']");
	private By history = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'HISTORY')]");
	private By LeadFromIcFlow = By.xpath(".//*[@data-sap-automation-id='uwtnY30of4U5by6QZm5IRG']");
	private By more = By.xpath(".//*[contains(@id,'moreLessButton-BDI-content')]");
	private By clickOnContract = By.xpath(
			".//*[@data-help-id='6cd78ffdc57d424cac0937f2af870e82']//span[contains(@class,'sapMClientInputInlineEditHidden')]");
	// private By
	// popupSwtch=By.xpath(".//*[@data-help-id='7fcd299168c56c81559f297cbff80c48']");
	private By cancelContract_lookup = By.xpath(".//*[@data-help-id='FA6RoXuCuaIjcTyHIqWRm0']");
	private By enterContractID = By.xpath(".//*[@data-help-id='6cd78ffdc57d424cac0937f2af870e82']//input");
	private By saveBtn = By.xpath(".//*[@data-help-id='ri5eGNT8EK_NrSYPtZASbW']");
	private By actionsDropDown = By.xpath(".//*[@data-help-id='qpXYtnTxvqo6RD$pzIlokm']");
	private By convertTo_Opportunity = By.xpath(".//*[@data-help-id='$N$SWR_60KMmpqbBhFfZkG']//bdi[text()='Convert to Opportunity']");
	private By save_and_open_moreOptionas = By.xpath(".//*[@data-help-id='mDN1yDdTJqwPwsStC_WRvW']//button[@title='More']");
	private By oppMore = By.xpath(".//*[@data-help-id='button-ObjectDetail-MoreOrLess']");
	private By saveAndOpen_btn = By.xpath(".//*[@data-help-id='54MAhVE2XaYLtOchb8CUg0']");
	private By getContractID = By.xpath(".//*[@data-help-id='16fbaeee4b5d4456932d1521fb68a963']/div[1]/span[1]");
	private By icCreateLead = By.xpath(".//*[@data-help-id='m1S0nGnm_KQS1HjwUySTz0']");

	// Overview Page with out edit
	private By getIwouldLikeToStudyIn = By
			.xpath(".//*[@data-help-id='04a2628369986dea94d5c9cc6428dc00']//div//span[text()]");
	private By studyPlanDate = By.xpath(".//*[@data-help-id='25f04711f59c5151eb7864d9433e1709']//div//span[text()]");
	private By studyLevelIPrefer = By
			.xpath(".//*[@data-help-id='5c7a8ea2abd4efd703d2feb21212493d']/following-sibling::div//span[text()]");
	private By getQualificationLevel = By.xpath(".//*[@data-help-id='Zqr5yFeb4qciNzoHu01cT0']//div//span[text()]");
	private By getcategory = By.xpath(".//*[@data-help-id='P$tTecsdUa6gjbFPbpjaGG']//div//span[text()]");
	private By getSourcetext = By.xpath(".//*[@data-help-id='K7_7LD6vDqE5DRhZh8HQhW']//div//span[text()]");
	private By getStatusText = By.xpath(".//*[@data-help-id='r$ckiqVeIKklD9BluuJ8AW']//div//span[text()]");

	/***********************/

	private By moreOptionas = By.xpath(".//*[@data-help-id='mDN1yDdTJqwPwsStC_WRvW']//button[@title='More']");

	private By saveAndOpen = By.xpath(".//*[@data-help-id='54MAhVE2XaYLtOchb8CUg0']");

	private static By aero_down = By.xpath("//button[@title='slim-arrow-down']");
	private static By lbl_leadsTab = By.xpath("//ul[@role='listbox']//li/span[contains(text(),'LEADS')]//parent::li");
	private static By lbl_leadId = By.xpath("//span[@title='Lead ID']//following::div[1]/span[1]");
	private static By btn_leadsTab = By.xpath("//div[@role='tab']//div[text()='LEADS']");

	String leadId = "";
	String newLeadId = "";

	ApplicationPageUtil appPageUtil = new ApplicationPageUtil();

	/******* Converted Opportunity Page *********/
	public void switchToLeadTabFromTask() {
		ElementUtil.click(switchToLeadTab);
	}

	public void clickOnRefreshButton() {
		ElementUtil.click(refreshButton);
	}

	public String get_converToOpp_Page_Leadname() {
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementVisible(converToOpp_Page_Leadname);
		return ElementUtil.getAttribute(converToOpp_Page_Leadname, "value");
	}

	public String get_converToOpp_Page_IcName() {
		ElementUtil.waitForPageLoad();
		return ElementUtil.getAttribute(converToOpp_Page_IcName, "value");
	}

	public String get_converToOpp_Page_IDPOwner() {
		ElementUtil.waitForPageLoad();
		return ElementUtil.getAttribute(converToOpp_Page_IDPOwner, "value");
	}

	public String get_converToOpp_Page_InstitutionName() {
		ElementUtil.waitForPageLoad();
		return ElementUtil.getAttribute(converToOpp_Page_InstitutionName, "value");
	}

	public int get_CountOf_InstitutionNameIn_converToOpp_Page() {
		return 0;
	}

//statusFilter

	// Filter lead on the IC Lead based on the Qualification Level
	public void filter_IC_Lead_Based_on_Qualification_level(String str) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1200);
			ElementUtil.click(qualification_level);
			appPageUtil.typeWithEnt(filter_search, str);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Filter lead on the IC Lead based on the status
	public void filter_IC_Lead_Based_on_Status(String str) {
		try {
			ElementUtil.waitForPageLoad();
			ElementUtil.click(statusFilter);
			appPageUtil.typeWithEnt(filter_search, str);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Filter lead on the IC Lead based on the category
	public void filter_IC_Lead_Based_on_Category(String str) {
		try {
			ElementUtil.waitForPageLoad();
			ElementUtil.click(categoryFilter);
			appPageUtil.typeWithEnt(filter_search, str);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// navigate to the Lead tab
	public void HistoryTab() {
		try {
			Thread.sleep(1200);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			//ElementUtil.scrollToElement(history);
			ElementUtil.click(history);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// select Lead from the IC Flow
	public void select_On_Lead_from_IC_Flow() {

		try {
			ElementUtil.waitForPageLoad();
			Thread.sleep(2200);
			ElementUtil.click(LeadFromIcFlow);

			ApplicationPageUtil.waitForLoadGetDisappiear();
			try {
				if (ElementUtil.isElementDisplayed(more)) {
					ElementUtil.click(more);
				}
				ElementUtil.scrollToTopOfPage();
			} catch (Exception ex) {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// select single IC Lead from the table
	public void selectSingle_IC_Lead_from_table() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			WaitsUtil.explicit_Wait(LeadFromIcFlow);
			DriverFactory.getDriver().findElements(LeadFromIcFlow).get(1).click();
		} catch (StaleElementReferenceException ex) {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			WaitsUtil.explicit_Wait(LeadFromIcFlow);
			DriverFactory.getDriver().findElements(LeadFromIcFlow).get(1).click();
		}
	}

	// get Source text from Lead Overview page
	public String getSourcetext() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getTextValue(getSourcetext);
	}

	// get QualificationLevele text from Lead Overview page
	public String getQualificationLevel() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getTextValue(getQualificationLevel);
	}

	// get IwouldLikeToStudyIn text from Lead Overview page
	public String getIwouldLikeToStudyIn() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getTextValue(getIwouldLikeToStudyIn);
	}

	// get studyPlanDate text from Lead Overview page
	public String getstudyPlanDate() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getTextValue(studyPlanDate);
	}

	// get studyLevelIPrefer text from Lead Overview page
	public String getstudyLevelIPrefer() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getTextValue(studyLevelIPrefer);
	}

	// get category text from Lead Overview page
	public String getcategory() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getTextValue(getcategory);
	}
	// getcategory

	// get Status text from Lead Overview page
	public String getStatusText() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ElementUtil.getTextValue(getStatusText);
	}

	// Add icon to create IC Lead
	public void click_On_Add_icon_IC_Lead() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(3100);
			ElementUtil.click(icCreateLead);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public void navigate_to_OverviewPage() {
		ElementUtil.waitForPageLoad();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(leadOverview);
		ElementUtil.click(leadOverview);
	}

	public void clickingOn_LookUp_Field(By mouseOverElement) {
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementPresent(mouseOverElement);
		ElementUtil.scrollToElement(mouseOverElement);
		new Actions(DriverFactory.getDriver()).moveToElement(DriverFactory.getDriver().findElement(mouseOverElement)).click().build().perform();

	}

	/***************************************************************************************************/
	public void navigateToLeadTab() {
		ElementUtil.waitForPageLoad();
		try {
			ElementUtil.scrollToElement(leadTab);
			ElementUtil.click(leadTab);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickOnLeads() {
		ElementUtil.waitForPageLoad();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(LeadFromIcFlow);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		ElementUtil.click(more);
	}

	public void clickOnContractField_and_mapContractToLead() {
		ElementUtil.waitForPageLoad();
		clickingOn_LookUp_Field(clickOnContract);
		ElementUtil.waitForPageLoad();
		ElementUtil.click(cancelContract_lookup);
		appPageUtil.typeWithEnt(enterContractID, ConfigReader.getApplicationPropertie("ContractID"));
		ElementUtil.click(saveBtn);
	}

	public void convert_Lead_To_Opportunity() {

		try {
			Thread.sleep(3000);
			ElementUtil.waitForPageLoad();
			ElementUtil.click(actionsDropDown);
			ElementUtil.waitForPageLoad();
			Thread.sleep(2400);
			ElementUtil.click(convertTo_Opportunity);
			ElementUtil.waitForPageLoad();
			ElementUtil.click(moreOptionas);
			Thread.sleep(2500);
			ElementUtil.click(saveAndOpen);
			Thread.sleep(3000);
			ElementUtil.click(oppMore);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// click on Actions button
	public void click_On_ActionsDropDown() {
		ElementUtil.waitForPageLoad();
		ElementUtil.click(actionsDropDown);
	}

	// Click on Convert to Opportunity
	public void click_On_ConvertTo_Opportunity() {
		ElementUtil.waitForPageLoad();
		try {
			Thread.sleep(2300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(convertTo_Opportunity);
	}

	public void click_on_Save_And_Open() {
		try {
			ElementUtil.waitForPageLoad();
			ElementUtil.click(moreOptionas);
			ElementUtil.click(saveAndOpen);
			Thread.sleep(3000);
			ElementUtil.click(oppMore);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// navigate to Lead tab from opportunity
	public void navigateToLead_Tab_From_OpportunityPage() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(leadTabFromOpp);
	}

	// use
	public void switchLeadsTab() throws InterruptedException {
		try 
		{
			ElementUtil.waitForPageLoad();
			ElementUtil.scrollToElement(btn_leadsTab);
			Thread.sleep(5000);
			ElementUtil.Click(btn_leadsTab, "Leads tab");
			Thread.sleep(2000);
			
		}catch(Exception e) 
		{
			ElementUtil.waitForElementClickable(aero_down);
			Thread.sleep(2000);
			ElementUtil.click(aero_down);
			ElementUtil.scrollToElement(lbl_leadsTab);
			ElementUtil.click(lbl_leadsTab);
			Thread.sleep(2000);
			ElementUtil.waitForPageLoad();
		}
		

	}

	public String get_ContractID_From_Opportunity() {

		ElementUtil.waitForPageLoad();
		return ElementUtil.getTextValue(getContractID);
	}

	public void click_On_create_IC_Lead_Record() {
		ElementUtil.click(icCreateLead);
	}

//use
	public void saveLeadId() {
		leadId = DriverFactory.getDriver().findElement(lbl_leadId).getText();
		ConfigReader.writeToApplicationPropertie("LeadID", leadId);
		ExtentCucumberAdapter
				.addTestStepLog("<span style='color:green;font-weight:bold;'>" + "Lead Id:" + leadId + "</span>");
	}

	public void putLeadId() {
		newLeadId = ConfigReader.getApplicationPropertie("LeadID");
	}

//navigate to the CAP_APPLICATION_DETAILS tab
	public void cap_Application_DetailsTab() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			// ElementUtil.scrollToElement(CAP_APPLICATION_DETAILS);
			ElementUtil.click(CAP_APPLICATION_DETAILS);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// navigate to the ACTIVITIES tab
	public void navigateTo_ACTIVITIES_Tab() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.scrollToElement(ACTIVITIES);
			ElementUtil.click(ACTIVITIES);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Select
	public void open_the_Task() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.scrollToElement(Task);
		ElementUtil.click(Task);
	}

}
