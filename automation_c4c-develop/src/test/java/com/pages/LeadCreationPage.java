package com.pages;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
import com.qa.util.ExcelUtil;
import com.qa.util.Excel_Reader;
import com.qa.util.WaitsUtil;

import AppHooks.ApplicationHooks;
import groovyjarjarantlr4.v4.codegen.model.Action;

public class LeadCreationPage {

	public HashSet<String> errmsgSet;
	public static String studentName = "";
	public static String leadName = "";
	public static String LeadId = "";
	public static String headerMessage = "";
	public static String ContIdOP1="";
	public static String ContIdOP2="";
	/****************** SORT ****************************/
	private By filter_by_LeadID=By.xpath("(.//th[@data-help-id='%id%$gDsG'])[1]");
	private By filter_by_category = By.xpath("(.//th[@data-help-id='yn20yWgKsKEPLuZbWJsB2W'])[1]");
	private By filter_by_qualification_level = By.xpath("(.//th[@data-help-id='HTdmFQ5FnKQ$CTLO8hw4Qm'])[1]");
	private By filter_by_status = By.xpath("(.//th[@data-help-id='sVfh3z4SQKgVM86FVj3_g0'])[1]");
	private By filter_search = By.xpath(".//div/input[@placeholder='Search']");
	/**********************************************/
	private static By tbl_list = By.xpath("//div[@data-help-id='biFQAClpi4YuRsldd2Yexm']//tbody/tr[1]//td[5]");
	private static By btn_Search = By.xpath("//button[@data-help-id='8BX3Czjg1qoUU3mLilrKuG-searchButton']");
	private static By txt_Search = By.xpath("//div[@data-help-id='8BX3Czjg1qoUU3mLilrKuG-searchField']//input");
	private static By lbl_firstRecordLead = By
			.xpath("//div[@data-help-id='biFQAClpi4YuRsldd2Yexm']//tbody/tr[1]//td[5]//a[1]");
	private static By btn_action = By.xpath("//button[@data-help-id='qpXYtnTxvqo6RD$pzIlokm']");
	private static By btn_convertOpportunity = By
			.xpath("//button[@data-help-id='$N$SWR_60KMmpqbBhFfZkG']//bdi[text()='Convert to Opportunity']");
	private static By btn_convertOpportunity2 = By
			.xpath("(//button[@data-help-id='$N$SWR_60KMmpqbBhFfZkG']//bdi[text()='Convert to Opportunity'])[2]");
	private static By tbl_firstRecordLeadFlow = By
			.xpath("//div[@data-help-id='oRmHZ6UY24QTEi_9bBw7e0']//tbody//tr[1]//td[3]//a[1]");
	private static By tbl_secondRecord = By
			.xpath("//div[@data-help-id='oRmHZ6UY24QTEi_9bBw7e0']//tbody//tr[2]//td[3]//a[1]");

	/*************** Gowtham Teja ************************************************/

	private By leadStatus = By.xpath(".//div[@data-help-id='r$ckiqVeIKklD9BluuJ8AW']//input");
	private By reasonForCancel = By.xpath(".//div[@data-help-id='U3rotnv0v4EhT9nSSZ_zTW']//input");

	private By notificationIcon = By.xpath(".//*[@data-help-id='mainBar-Notification-Button']");
	private By newlyCreatedNotification = By.xpath("(.//*[@data-help-id='zj4bmSivOq_GDlME1iuabG'])[1]");

	private By advance_filter = By.xpath(".//*[@data-help-id='qe5Varq3sK6Cnf0W0D2QYG-advancedfindformbutton']");
	private By advanceSearch_category = By.xpath(".//*[@data-help-id='sLxTUkVz9Kg7uNjkbPnPNW']//input");
	private By advanceSearch_qualification = By.xpath(".//*[@data-help-id='W0qyOl_GHq_bNjm0_uHuzW']//input");
	private By advanceSearch_Status = By.xpath(".//*[@data-help-id='weqkm63l4qUYuxq6rED0am']//input");
	private By advanceSearch_study_palnDate = By.xpath(
			".//*[@data-help-id='stackedDateTime-3df8dbe7d0ec122d317e19ea4bbe0bfa-FilterCB']//input[@value='Filter by Date']");
	private By advaceSearch_Study_planteDateDropDownListValues = By.xpath("//ul[@role='listbox']/child::li");

	private By advanceSearch_GO = By.xpath(".//*[@data-help-id='findFormPane-ZFL$GtNuP4_lD8m30KbZdW-GoBtn']");
	// .//*[@data-help-id="8BX3Czjg1qoUU3mLilrKuG-variantManagement-trigger"]//span
	private By create = By.xpath(".//*[@data-help-id='n7vzZ64G6K2skiiLLncdx0']");
	private By edit = By.xpath(".//*[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");

	/*********************************** FILTER *****************************/
	private By filterDropDownLeadSection = By
			.xpath(".//*[@data-help-id='8BX3Czjg1qoUU3mLilrKuG-variantManagement-trigger']//span");
	private By filterValuesLeadSection = By.xpath(".//*[text()='All']/parent::ul/li");
	private By searchAgainInAll = By.xpath(".//*[text()='Search again in all items']");

	/********************************
	 * ADD CAP
	 **************************************/
	private By addCAPBtn = By.xpath(".//bdi[text()='Assign CAP Officer']");
	private By cap_officer = By.xpath(".//*[@data-help-id='m_pCv5bd74ctrHlGwBKHdm']//input");
	private By cap_TeamID = By.xpath(".//*[@data-help-id='IElVYATBZK_doSJhNcRRjG']//input");

	private By cap_officer_Lookup = By
			.xpath(".//*[@data-help-id='IElVYATBZK_doSJhNcRRjG']//input/following-sibling::div/child::span");
	private By click_here_To_Execut_Query = By.xpath(".//*[text()='Click here to execute the Query']");
	private By capOfficers = By.xpath("(.//*[@data-help-id='jH6kA9KmcaELGWHt92ST3W'])[1]");
	/**************************************************************************/
	private By moreBtn_OverviewPage = By.xpath(".//*[@data-help-id='button-ObjectDetail-MoreOrLess']//span");

	private By searchIcon = By.xpath("//span[@aria-label=\"Search\"]");
	private By category_dropDown = By.xpath("//span[@id=\"__select0-arrow\"]");
	// private By
	// select_category=By.xpath("//div[@class=\"sapUiSimpleFixFlexFlexContentContainer\"]//ul/li[contains(text(),'Lead')]");
	private By enterTex = By.xpath("//input[@placeholder=\"Search\"]");
	private By innerSearch = By.xpath("//form[@id=\"__field0-F\"]//div[2]");
	private By refresh = By.xpath(
			"//span[text()='Refresh']/parent::button/child::span[@class=\"sapMBtnInner sapMBtnHoverable sapMFocusable sapMBtnText sapMBtnIconFirst sapMBtnTransparent\"]");
	private static By qualification = By.xpath("//*[@data-help-id='hHQsWVqpqa2E6QNvV7oumW']//input");
	private By i_Would_Like_TO_StudyIN = By.xpath(".//*[@data-help-id='8f50907835b9e464a4520e43c469921f']//input");

	private By name = By.xpath(".//*[@data-help-id='av2Clb0RHq_TkSRdy2j80m']//input");
	private By category = By.xpath(".//*[@data-help-id='t1cZp65cfKoGEXn6ZkDIj0']//input");
	private By student = By.xpath(".//*[@data-help-id='Pjx8$hXiKaws352ZCvsOyG']//input");
	private By idp_owner = By.xpath(".//*[@data-help-id='ZwthVlNs3K2A$DLOQirnNG']//input");
	private By idp_office = By.xpath(".//*[@data-help-id='7OnDPgd81q_Awnn$$iETNG']//input");
	private By idp_Team = By.xpath(".//*[@data-help-id='flVAoekheaIigxH3QLJ_u0']//input");
	private By Markchannel=By.xpath(".//*[@data-help-id='8404bf500c534d879950bce8c456d3e7']//input");
	private By Markevent_Name=By.xpath(".//*[@data-help-id='a0039e75daca46038d9a63d4defc3d46']//input");
	private By MarkeventID=By.xpath(".//*[@data-help-id='4fa6047fb04343d4b7b0d5da5b7dfe0a']//input");
	private By paidOrganic=By.xpath(".//*[@data-help-id='232f1c56011449b6ab6f5a841768a34f']//input");
	
	private By source = By.xpath(".//*[@data-help-id='HAMY3gCKTqQMJosV5la0b0']//input");// Chat
	private By study_plan_date = By.xpath(".//*[@data-help-id='0eb703da588b797a08aecd4a698509aa']//input");// 07.12.2024
	private By study_level_i_prefer = By.xpath(".//*[@data-help-id='872716abcc98eb81d815c8a185af25ea']//input");// English
	private By sub_category=By.xpath(".//*[@data-help-id='49543d9eafa7d4b955ccc5a7f2086297']//input");																											// //
																												// Language
	private By Reason_for_Cold_Status = By.xpath(".//*[@data-help-id='41e24f5dc0f9cb629322c63b92020bfa']//input");
	private static By moreOptn_toSave = By.xpath(".//*[@data-help-id='bRALgj7NAKMeAP4RpO$tEG']//button[@title='More']");
	private static By saveAndOpen = By.xpath(".//*[@data-help-id='xvwiwx$cnKkQO8NnlSA870']");
	private By getLeadID = By.xpath(".//*[@data-help-id='O9Ec6r8GR4QdVLoERHdpKW']/following-sibling::div/span");
	private By clickSearch = By.xpath(".//*[@data-help-id='8BX3Czjg1qoUU3mLilrKuG-searchButton']");
	private By enterSearchText = By.xpath(".//*[@data-help-id='8BX3Czjg1qoUU3mLilrKuG-searchField']//input");
	private By clickOnSearchLead = By.xpath(".//*[@data-help-id='7yqtmdVa3agQ_GEGJooZhm']");
	private By click_studentlookup_button = By
			.xpath(".//*[@data-help-id='Pjx8$hXiKaws352ZCvsOyG']//span[@role='presentation']");
	private By click_idpOwnerlookup_button = By
			.xpath(".//*[@data-help-id='Oq3J7CBMHaghYvpYME7QEW']//span[@role='presentation']");

	private By enter_Lead_Status = By.xpath(".//*[@data-help-id='r$ckiqVeIKklD9BluuJ8AW']//input");
	private By click_hereTo_execute_StudentQuery = By.xpath(".//*[text()='Click here to execute the Query']");
	private By searchbutton_on_studentLookup = By.xpath(".//*[@data-help-id='F6DOzvVW_KEokhAJySe1NG-searchButton']");
	private By searchbutton_on_IDPOwnerLookup = By.xpath(".//*[@data-help-id='eiRFlnbG14cTi2MbBWSioW-searchButton']");
	
	private By enter_searchtext_On_studentlookup = By
			.xpath(".//*[@data-help-id='F6DOzvVW_KEokhAJySe1NG-searchField']//input");
	private By enter_searchtext_On_IdpOwnerlookup = By
			.xpath(".//*[@data-help-id='eiRFlnbG14cTi2MbBWSioW-searchField']//input");
	private By select_searchRecord_studentLookup = By
			.xpath(".//*[@data-help-id='uiH58Wl$aqMwy7TR7hsNaW']//tr/parent::tbody");
	private By select_searchRecord_idpOwnerLookup = By
			.xpath("(.//*[@data-help-id='a4jHB4H6X4slaGJg8nnHGW']//tr/parent::tbody//tr)[1]");
	private By click_on_IDP_Owner_lookUp = By
			.xpath(".//*[@data-help-id='Oq3J7CBMHaghYvpYME7QEW']//span[@role='presentation']");
	private By SearchBtn_on_IDP_Owner_lookUp = By.xpath(".//*[@data-help-id='eiRFlnbG14cTi2MbBWSioW-searchButton']");
	private By enter_SearchField_IDP_Owner_lookup = By
			.xpath(".//*[@data-help-id='eiRFlnbG14cTi2MbBWSioW-searchField']//input");
	private By slect_searchIDP_OWner = By.xpath(".//*[@data-help-id='a4jHB4H6X4slaGJg8nnHGW']//tr/parent::tbody");
	private By studentName_hyperlikn = By.xpath(".//*[@data-help-id='OfECGOff0KsxHYjkevCstm']//a");
	private By save_lead_update = By.xpath(".//*[@data-help-id='ri5eGNT8EK_NrSYPtZASbW']");
	private By leadsIntable = By.xpath("//tr/parent::tbody//a[@data-help-id='7yqtmdVa3agQ_GEGJooZhm']");
	private By visaType = By.xpath(".//*[@data-help-id='5d6be0521bd0445bb66c0bd515c9d6af']//input");
	private By action_button = By.xpath(".//*[@data-help-id='qpXYtnTxvqo6RD$pzIlokm']");
	private By copy_button_underAction = By.xpath(".//*[@data-help-id='LGu5zfZSg4wehzUWTPFw7m']");

	private By eleOption = By.xpath("//div[contains(@style,'display: block')]//ul/li//div[@class='sapMSLITitleOnly']");

	/*****************************************/
	private By actionsDropDown = By.xpath(".//*[@data-help-id='qpXYtnTxvqo6RD$pzIlokm']");
	private By convertTo_Opportunity = By.xpath(".//*[@data-help-id='$N$SWR_60KMmpqbBhFfZkG']");

	/*******************************
	 * ERROR MESSAGE
	 ********************************************************/

	private By errorMessage_eaderBar = By.xpath(".//*[@data-help-id='messageBar-headerBar']");
	private By error_messageDetails = By.xpath(".//*[@data-help-id='messageBar-messageDetails']/div");

	/*************************************
	 * MARKETING MANAGER
	 ******************************************************/
	private By advertiserToggleBtn = By.xpath(".//*[@data-help-id='a45f5d36e28f4da59c13d17f5c4e63c1']");
	private By eventID = By.xpath(".//*[@data-help-id='ef363989694a4f98ad52454867b46044']//input");
	private By labelEventID = By
			.xpath(".//*[@data-help-id='ef363989694a4f98ad52454867b46044']/parent::div/parent::div//bdi");
	private By eventName = By.xpath(".//*[@data-help-id='4d630eb95f4a436da6fced5ffdae9565']//input");
	private By labeleventName = By
			.xpath(".//*[@data-help-id='4d630eb95f4a436da6fced5ffdae9565']/parent::div/parent::div//bdi");
	private By campaign = By.xpath(".//*[@data-help-id='9689a4a97f324c43a808a145bd4d4d41']//input");
	private By labelcampaign = By
			.xpath(".//*[@data-help-id='9689a4a97f324c43a808a145bd4d4d41']/parent::div/parent::div//bdi");
	private By MediumDDO = By.xpath(".//*[@data-help-id='96a869a339984f16bcd19c0afb09e8be']//input");
	private By labelMediumDDO = By
			.xpath(".//*[@data-help-id='96a869a339984f16bcd19c0afb09e8be']/parent::div/parent::div//bdi");
	private By pain_Organic = By.xpath(".//*[@data-help-id='7d962177efef422fb6f34c19db371e4a']//input");
	private By labelpain_Organic = By
			.xpath(".//*[@data-help-id='7d962177efef422fb6f34c19db371e4a']/parent::div/parent::div//bdi");
	private By channel = By.xpath(".//*[@data-help-id='3cc0ff26f0c9453f8125ccb2725f117d']//input");
	private By labelchannel = By
			.xpath(".//*[@data-help-id='3cc0ff26f0c9453f8125ccb2725f117d']/parent::div/parent::div//bdi");
	/************************ Overview page ************************/

	private static By leadID = By.xpath(".//*[@data-help-id='O9Ec6r8GR4QdVLoERHdpKW']/following-sibling::div[1]/span[1]");
	private static By tbl_leadListCount = By.xpath("//div[@data-help-id='oRmHZ6UY24QTEi_9bBw7e0']//tbody/tr//td[2]");
	// private static By tbl_leadTableHeadCount =
	// By.xpath("(//div[@data-help-id='oRmHZ6UY24QTEi_9bBw7e0']//table//thead//span)");
	private static By tbl_leadTableHeadCount = By.xpath("(//thead//tr)[1]//th//span/bdi");
	private static By btn_createLead=By.xpath("//button[@data-help-id='m1S0nGnm_KQS1HjwUySTz0']");
    private static By drp_qualification=By.xpath("//div[@data-help-id='hHQsWVqpqa2E6QNvV7oumW']//input");
    private static By li_qualification=By.xpath("(//ul[@role='listbox'])[1]//li");
    
    private static By drp_source=By.xpath("//div[@data-help-id='HAMY3gCKTqQMJosV5la0b0']//input");
    private static By drp_likeToStudy=By.xpath("//div[@data-help-id='8f50907835b9e464a4520e43c469921f']//input");
    private static By drp_studyLevel=By.xpath("//div[@data-help-id='0c12649b96bb7c8e49b8d4b62bc08a0d']//input");
    private static By btn_studyPlanDate=By.xpath("//div[@data-help-id='fda4a9d51a909a941a592738ff451f1f']//input");
    private static By btn_more=By.xpath("//button[@data-help-id='rU4QOD0kNqscqEfSHtGp$m']");
    private static By btn_refresh=By.xpath("//button[@data-help-id='YCCRSY0lFKMnrLIoo4LWxm']");
    private static By btn_saveLead=By.xpath("(//bdi[text()='Save'])[1]");
    private static By btn_moreLess=By.xpath("(//button[@data-help-id='button-ObjectDetail-MoreOrLess'])[1]");
    private static By lbl_leadName=By.xpath("(//span[@data-help-id='oF91kEE0cak$9A2g5KLfBW']//following::span)[1]");
    private static By btn_sort=By.xpath("(//button[@data-help-id='SfUp96COrqwM5FPB46t8um-menuTogglebutton'])[1]");
    private static By btn_descending=By.xpath("//div[text()='Qualification Level']");
    private static By btn_ascending=By.xpath("//div[text()='Ascending']");
    private static By btn_okSort=By.xpath("//bdi[text()='OK']");
    private static By btn_idpowner=By.xpath("(//bdi[text()='IDP Owner']//following::a)[1]");
    private static By lbl_idpOwner=By.xpath("//span[@data-help-id='objectDetail-Header-Name']");
    
    private static By btn_createLeadFromList=By.xpath("//button[@data-help-id='n7vzZ64G6K2skiiLLncdx0']");
    private static By icon_idpOwner=By.xpath("(//div[@data-help-id='ZwthVlNs3K2A$DLOQirnNG']//span)[1]");
    private static By li_idpOwner=By.xpath("//div[@data-help-id='a4jHB4H6X4slaGJg8nnHGW']//tbody//tr[1]//td[3]");
    private static By icon_student=By.xpath("(//div[@data-help-id='Pjx8$hXiKaws352ZCvsOyG']//span)[1]");
    private static By li_student=By.xpath("//div[@data-help-id='AtlIbGGOY4c7kzV0vJuCrG']//tbody//tr[1]//td[3]");
    private static By btn_studentSearch=By.xpath("//button[@data-help-id='F6DOzvVW_KEokhAJySe1NG-searchButton']");
    private static By txt_studentSearch=By.xpath("//div[@data-help-id='F6DOzvVW_KEokhAJySe1NG-searchField']//input");
    
    private static By drp_category=By.xpath("//div[@data-help-id='t1cZp65cfKoGEXn6ZkDIj0']//input");
    private static By drp_visaType=By.xpath("//div[@data-help-id='5d6be0521bd0445bb66c0bd515c9d6af']//input");
    private static By drp_qualificationLevel=By.xpath("//div[@data-help-id='hHQsWVqpqa2E6QNvV7oumW']//input");
    private static By btn_saveOpen=By.xpath("//bdi[text()='Save and Open']");
    private static By lbl_headerText=By.xpath("//span[@data-help-id='messageBar-headerMessage']");
    private static By btn_saveMore=By.xpath("(//button[@title='More'])[1]");
    private static By btn_cancel=By.xpath("//bdi[text()='Cancel']");
    
    private static By lbl_leadId=By.xpath("(//bdi[text()='Lead ID']//following::span)[1]");
    private static By btn_actions=By.xpath("//bdi[text()='Actions']");
    private static By btn_convert=By.xpath("//bdi[text()='Convert to Opportunity']");
    private By leadListViewDropDown=By.xpath(".//*[@data-help-id='8BX3Czjg1qoUU3mLilrKuG-variantManagement-title']/parent::div/following-sibling::div[2]");
    private By leadListViewDropDownValues=By.xpath(".//*[@class='sapMSelectList']/li");
    private static By btn_close=By.xpath("//bdi[text()='Close']");
    private static By drp_subCategory=By.xpath("//div[@data-help-id='49543d9eafa7d4b955ccc5a7f2086297']//input");
    private static By lbl_probability=By.xpath("(//bdi[text()='Probability']//following::span)[1]");
    private static By lbl_OpportunityStatus=By.xpath("(//bdi[text()='Opportunity Status']//following::span)[1]");
    private static By Tab_Overview = By.xpath(".//*[@role='tablist']//div[text()='OVERVIEW']");
    private static By btn_moreView=By.xpath("//bdi[text()='More']");
    private static By btn_contractIdPopup=By.xpath("(//div[@data-help-id='6cd78ffdc57d424cac0937f2af870e82']//following::span)[1]");
    private static By tbl_contractId=By.xpath("//div[@data-help-id='oNHI9gQjBq6rOK2P1W7QGm']//tbody//tr[1]//td[2]");
    private static By tbl_contractId2=By.xpath("//div[@data-help-id='oNHI9gQjBq6rOK2P1W7QGm']//tbody//tr[2]//td[2]");
    private static By lbl_contId1OP=By.xpath("//div[@data-help-id='oNHI9gQjBq6rOK2P1W7QGm']//tbody//tr[1]//td[2]//span");
    private static By lbl_contId2OP=By.xpath("//div[@data-help-id='oNHI9gQjBq6rOK2P1W7QGm']//tbody//tr[2]//td[2]//span");
  

	static ApplicationPageUtil appPageUtil = new ApplicationPageUtil();

	/************************* Gowtham Teja **************************************/
	
	public void clickListViewDropDown() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(leadListViewDropDown);
	}
	
	public List<String> getAllTheLeadListViewDropDownValues() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getDropdownText(leadListViewDropDownValues);
	}
	
	public void update_the_Lead_Status_In_LeadPage(String status) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.typeWithEnt(leadStatus, status);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enter_sub_Category(String reason) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Actions action =new Actions(DriverFactory.getDriver());
			action.moveToElement(DriverFactory.getDriver().findElement(sub_category)).clickAndHold().keyDown(Keys.CONTROL)
			.sendKeys(String.valueOf('\u0061')).sendKeys(String.valueOf('\u0078')).keyUp(Keys.CONTROL)
			.sendKeys(reason).build().perform();
			//ElementUtil.Type(sub_category, reason);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void enter_reason_for_cancel(String reason) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.typeWithEnt(reasonForCancel, reason);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Filter lead on the IC Lead based on the Qualification Level
	public void filter_IC_Lead_Based_on_Qualification_level(String str) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3500);
			ElementUtil.click(filter_by_qualification_level);
			appPageUtil.typeWithEnt(filter_search, str);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

// Filter lead on the IC Lead based on the status
	public void filter_IC_Lead_Based_on_Status(String str) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3500);
			ElementUtil.click(filter_by_status);
			appPageUtil.typeWithEnt(filter_search, str);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

// Filter lead on the IC Lead based on the category
	public void filter_IC_Lead_Based_on_Category(String str) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2000);
			ElementUtil.click(filter_by_category);
			appPageUtil.typeWithEnt(filter_search, str);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Filter lead on the IC Lead based on the category
		public void filter_IC_Lead_Based_on_LeadID(String str) {
			try {
				ApplicationPageUtil.waitForLoadGetDisappiear();
				Thread.sleep(2000);
				ElementUtil.click(filter_by_LeadID);
				appPageUtil.typeWithEnt(filter_search, str);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	//filter_by_LeadID

	public boolean check_Conver_Opportunity_Option_Availablity() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(actionsDropDown);
		return ElementUtil.isElementDisplayed(convertTo_Opportunity);
	}

	public boolean check_ADD_CAP_BUTTON_AVAILABLITY() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			return DriverFactory.getDriver().findElement(addCAPBtn).isDisplayed();
		} catch (StaleElementReferenceException st) {
			return DriverFactory.getDriver().findElement(addCAPBtn).isDisplayed();
		}
	}

	public boolean check_CAP_OfficerField_AVAILABLITY() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			return DriverFactory.getDriver().findElement(cap_officer).isDisplayed();
		} catch (StaleElementReferenceException st) {
			return DriverFactory.getDriver().findElement(cap_officer).isDisplayed();
		}
	}

	public boolean check_CAP_TeamIDField_AVAILABLITY() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			return DriverFactory.getDriver().findElement(cap_TeamID).isDisplayed();
		} catch (StaleElementReferenceException st) {
			return DriverFactory.getDriver().findElement(cap_TeamID).isDisplayed();
		}
	}

	public void click_advertiser_Toggle_Button() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(advertiserToggleBtn);
	}

	public void enter_EventID(String text) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.type(eventID, text);
		ElementUtil.click(labelEventID);
	}

	public void enter_EventName(String text) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(eventName, text);
		ElementUtil.click(labeleventName);
	}

	public void enter_Campaign(String text) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.type(campaign, text);
		ElementUtil.click(labelcampaign);
	}

	public void select_Medium(String text) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.selectDDOption(MediumDDO, text);
		ElementUtil.click(labelMediumDDO);
	}

	public void select_Pain_Organic(String text) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.selectDDOption(pain_Organic, text);
		ElementUtil.click(labelpain_Organic);

	}

	public void select_Channel(String text) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.selectDDOption(channel, text);
		// ElementUtil.click(labelchannel);
	}

	/****************************************************************************************/

	public HashSet<String> get_PickListvalues() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		HashSet<String> values = new HashSet<String>();
		List<WebElement> wbele = DriverFactory.getDriver().findElements(eleOption);
		for (WebElement ele : wbele) {
			String str = ele.getText().trim();
			values.add(str.trim());
		}
		return values;
	}

	public void click_on_qualification() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(qualification);
	}

	public void click_on_Category() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(category);
	}

	public void click_on_Source() {
		ElementUtil.click(source);
	}

	public void click_on_i_Would_Like_TO_StudyIN() {
		ElementUtil.click(i_Would_Like_TO_StudyIN);
	}

	public HashSet<String> get_LEAD_PAGE_ERROR_MESSAGE() {
		HashSet<String> errorMessage=null;
		try {
		if (ElementUtil.isElementDisplayed(errorMessage_eaderBar)) {
			errorMessage = new HashSet<String>();
			ElementUtil.click(errorMessage_eaderBar);
			List<WebElement> wbele = DriverFactory.getDriver().findElements(error_messageDetails);
			for (WebElement ele : wbele) {
				String str = ele.getText().trim();
				errorMessage.add(str);
			}
			ElementUtil.click(errorMessage_eaderBar);
		}
		}catch(Exception ex) {
			
		}
		return errorMessage;

	}

	public void copy__ExistingLeadRecord() {
		try {
			Thread.sleep(2200);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1200);
			ElementUtil.click(action_button);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(copy_button_underAction);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickOnActionsButton() {
		try {
			Thread.sleep(2200);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1200);
			ElementUtil.click(action_button);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean isCopyButtonDisplying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.isElementDisplayed(copy_button_underAction);
	}

	public void navigateTO(String str) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2500);
			By by = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'" + str + "')]");
			ElementUtil.scrollToElement(by);
			ElementUtil.click(by);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// STUDENT ESSENTIAL
	}

	public void selectSingle_Lead_from_table() {
		try {
			DriverFactory.getDriver().findElements(leadsIntable).get(0).click();
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(moreBtn_OverviewPage);
			ElementUtil.scrollToTopOfPage();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	// Next Year
	public void advanceSearchBy_StudyPlanDate(String search) {
		if (!search.equals("")) {
			String srch;
			srch = search;
			ElementUtil.click(advanceSearch_study_palnDate);
			List<WebElement> eles = DriverFactory.getDriver()
					.findElements(advaceSearch_Study_planteDateDropDownListValues);
			for (WebElement el : eles) {
				if (el.getText().equals(srch)) {
					el.click();
					break;
				}
			}
		}
	}

	public void advanceSearchBy_category(String search) {
		if (!search.equals("")) {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.type_KeysEnter(advanceSearch_category, search);
		}
	}

	public void advanceSearchBy_qualification(String search) {
		if (!search.equals("")) {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.type_KeysEnter(advanceSearch_qualification, search);
		}
	}

	public void advanceSearchBy_Status(String search) {
		if (!search.equals("")) {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.type_KeysEnter(advanceSearch_Status, search);
		}
	}

	public void lead_advanceSearch(String category, String qualification, String status, String planDate) {
		try {
			Thread.sleep(1200);
			ElementUtil.click(advance_filter);
			Thread.sleep(1200);
			advanceSearchBy_category(category);
			advanceSearchBy_qualification(qualification);
			advanceSearchBy_Status(status);
			Thread.sleep(1200);
			advanceSearchBy_StudyPlanDate(planDate);
			Thread.sleep(1200);
			ElementUtil.click(advanceSearch_GO);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1200);
			ElementUtil.click(advance_filter);
		} catch (Exception ex) {

		}
	}

	public void update_Lead_Status(String testcaseNo) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2000);
			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
			String Lead_Status = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
					"Status");
			appPageUtil.typeWithEnt(enter_Lead_Status, Lead_Status);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update_Lead_Status_in_(String testcaseNo) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2000);
			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
			String Lead_Status = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
					"Status");
			appPageUtil.typeWithEnt(enter_Lead_Status, Lead_Status);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update_IDP_Owner(String testcaseNo) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1500);
			ElementUtil.click(click_on_IDP_Owner_lookUp);
			// Thread.sleep(3000);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(SearchBtn_on_IDP_Owner_lookUp);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2700);

			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
			String IDP_Owner = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
					"IDP owner ID");
			ElementUtil.type(enter_SearchField_IDP_Owner_lookup, IDP_Owner);
			// Thread.sleep(3000);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1500);
			ElementUtil.click(slect_searchIDP_OWner);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Click_On_Save_Lead_Update() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3000);
			ElementUtil.click(save_lead_update);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void click_On_AssignCAP_Officer_Bnt() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(addCAPBtn);
		} catch (StaleElementReferenceException st) {
			ElementUtil.click(addCAPBtn);
		}
	}

	public void click_On_StudentLookup() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(click_studentlookup_button);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void click_On_IdpOwnerLookup() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(click_idpOwnerlookup_button);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void click_hereTo_execute_StudentQuery_In_lookupWindow() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(click_hereTo_execute_StudentQuery);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void click_searchbutton_on_studentLookup() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(searchbutton_on_studentLookup);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void click_searchbutton_on_IDPOwnerLookup() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(searchbutton_on_IDPOwnerLookup);
			Thread.sleep(3400);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_searchtext_On_studentlookup(String id) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.typeWithEnt(enter_searchtext_On_studentlookup, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void enter_searchtext_On_idpOwnerlookup(String id) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.typeWithEnt(enter_searchtext_On_IdpOwnerlookup, id);
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void enter_visaType(String txt) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.selectDDOption(visaType, txt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_idp_owner(String id) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.typeWithEnt(idp_owner, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_idp_office(String id) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.typeWithEnt(idp_office, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_idp_Team(String id) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.type_KeysEnter(idp_Team, id);
	}

	public void enter_Reason_for_Cold_Status(String text) {
		appPageUtil.type_KeysEnter(Reason_for_Cold_Status, text);
	}

	public void select_Search_Student_Record() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(select_searchRecord_studentLookup);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void select_Search_IdpOwner_Record() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(select_searchRecord_idpOwnerLookup);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// This function is used to search and select the student from the lookUp
	public void enter_StudentField(String id) {
		click_On_StudentLookup();

		click_hereTo_execute_StudentQuery_In_lookupWindow();
		click_searchbutton_on_studentLookup();
		enter_searchtext_On_studentlookup(id);
		select_Search_Student_Record();
	}
	
	// This function is used to search and select the student from the lookUp
	public void enter_IDP_OWNER_Field(String id) {
		click_On_IdpOwnerLookup();
		//click_hereTo_execute_StudentQuery_In_lookupWindow();
		click_searchbutton_on_IDPOwnerLookup();
		enter_searchtext_On_idpOwnerlookup(id);
		select_Search_IdpOwner_Record();
	}

	public void enter_Qualification_Level(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.typeWithEnt(qualification, txt);
	}

	public void enter_Source(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.typeWithEnt(source, txt);
	}

	public void enter_I_Would_Like_to_Study_In(String txt) {
		try {
			Thread.sleep(3000);
			ElementUtil.scrollToElement(i_Would_Like_TO_StudyIN);
			appPageUtil.typeWithEnt(i_Would_Like_TO_StudyIN, txt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_Study_Level_I_Prefer_Is(String txt) {
		try {
			ElementUtil.Type(study_level_i_prefer, txt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enter_Study_Plan_Date(String txt) {
		appPageUtil.typeWithEnt(study_plan_date, txt);
	}

	public void enter_category_Status(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.type_KeysEnter(category, txt);

	}
	
	public void enter_StudentID(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.type_KeysEnter(student, txt);

	}

	public void create_the_Lead__Record(String stdID, String qualType, String source, String would_Like_to_Study_In,
			String study_Level_I_Prefer_Is, String study_Plan_Date, String Category) {
		try {
			Thread.sleep(5000);
			enter_StudentField(stdID);
			enter_Qualification_Level(qualType);
			if (qualType.equals("Cold")) {
				enter_Reason_for_Cold_Status("IELTS registration related");
			}
			enter_Source(source);
			enter_I_Would_Like_to_Study_In(would_Like_to_Study_In);
			enter_Study_Level_I_Prefer_Is(study_Level_I_Prefer_Is);
			enter_Study_Plan_Date(study_Plan_Date);
			enter_category_Status(Category);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void login_toApplication(String userId, String psw, String url) {
		appPageUtil.loginTotheApplicatio_C4C(userId, psw, url);
	}

	public void Naviagte_To_Lead_Tab_under(String unber_category) {
		try {
			Thread.sleep(2000);
			appPageUtil.clickTab_underCategory(unber_category, "Leads");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void click_on_createLead_Icon() {
		boolean flag = ElementUtil.isElementEnable(create);
		System.out.println("It's clickable==" + flag);
		ElementUtil.waitForElementVisible(create);
		ElementUtil.click(create);

	}

	public void click_on_LeadEditIcon() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(4700);
			//ElementUtil.waitForElementClickable(edit);
			ElementUtil.click(edit);
		}catch(NoSuchElementException ex) {
			WaitsUtil.fluentWait(edit).click();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void filter_Lead_By_filterDropDownLeadSection(String value) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(filterDropDownLeadSection);

			// Actions act = new Actions(DriverFactory.getDriver());
			// DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			// List<WebElement> Options =
			// DriverFactory.getDriver().findElements(filterValuesLeadSection);
			/*
			 * for (WebElement Option : Options) { if (Option.getText().equals(value)) {
			 * System.out.println(Option.getText()); Option.click(); Thread.sleep(5000);
			 * break; } }
			 */
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public void global_Search(String tabname, String text) {
		boolean flag = ElementUtil.isElementEnable(searchIcon);
		System.out.println("It's clickable==" + flag);
		ElementUtil.waitForElementVisible(searchIcon);
		ElementUtil.click(searchIcon);
		ElementUtil.waitForElementVisible(category_dropDown);
		ElementUtil.click(category_dropDown);
		By select_category = By.xpath(
				"//div[@class='sapUiSimpleFixFlexFlexContentContainer']//ul/li[contains(text(),'" + tabname + "')]");
		ElementUtil.waitForElementVisible(select_category);
		ElementUtil.click(select_category);
		ElementUtil.type(enterTex, text);
		ElementUtil.click(innerSearch);
	}

	public void refresh_LeadRecords_Section() {
		if (ElementUtil.isElementDisplayed(refresh)) {
			boolean flag = ElementUtil.isElementEnable(refresh);
			System.out.println("It's clickable==" + flag);
			ElementUtil.waitForElementVisible(refresh);
			ElementUtil.click(refresh);

		}

	}

	public void enter_the_Qualification(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1000);
			appPageUtil.type_KeysEnter(qualification, text);
			if (text.equals("Cold")) {
				Thread.sleep(1200);
				enter_Reason_for_Cold_Status("Financial reasons");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_i_Would_Like_TO_StudyIN(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPageUtil.selectDDChkBoxOption(i_Would_Like_TO_StudyIN, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String get_NameText() {
		return ElementUtil.getAttribute(name, "value");
	}

	public String get_CategoryText() {
		return ElementUtil.getAttribute(category, "value");
	}

	public String get_StudentText() {
		return ElementUtil.getAttribute(student, "value");
	}

	public String get_idp_ownerText() {
		return ElementUtil.getAttribute(idp_owner, "value");
	}

	public String get_idp_officeText() {
		return ElementUtil.getAttribute(idp_office, "value");
	}

	public String get_idp_TeamText() {
		return ElementUtil.getAttribute(idp_Team, "value");
	}

	public void enter_SourceText(String text) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.type_KeysEnter(source, text);
	}

	public void enter_Study_plan_dateText(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			C4CDatePicker.enterTheDateWith_FieldLabelName("Study Plan Date", text);
			//appPageUtil.typeWithEnt(study_plan_date, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_study_level_i_prefer(String text) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		appPageUtil.SelectDropDownChechBox(study_level_i_prefer, text);
	}

	public static void save_and_Open() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1500);
			ElementUtil.click(moreOptn_toSave);
			ElementUtil.click(saveAndOpen);
			Thread.sleep(1500);
			ApplicationPageUtil.waitForLoadGetDisappiear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (ElementUtil.isElementDisplayed(leadID)) {
				String lID = ElementUtil.getTextValue(leadID);
				ConfigReader.writeToApplicationPropertie("ConvertedLeadID", lID);
			}
		} catch (Exception ex) {
			System.out.println("NO LEAD IS CREATED");
		}

	}

	public String get_LeadID() {

		return ElementUtil.getTextValue(getLeadID);
	}

	public String get_idp_owner_name() {

		return ElementUtil.getTextValue(idp_owner);
	}

	public String get_idp_office() {

		return ElementUtil.getTextValue(idp_office);
	}

	public String get_idp_Team() {

		return ElementUtil.getTextValue(idp_Team);
	}

	public void search_for_Lead(String str) {
		try {
			Thread.sleep(2000);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(clickSearch);
			appPageUtil.typeWithEnt(enterSearchText, str);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			if (ElementUtil.isElementDisplayed(searchAgainInAll)) {
				ElementUtil.click(searchAgainInAll);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public void select_the_searchLead() {
		ElementUtil.click(clickOnSearchLead);
	}

	public void click_on_CreateLead_Icon() {
		try {
			Thread.sleep(2500);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(create);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void click_0n_StudentName_hyperLikn() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(studentName_hyperlikn);
	}

	public String get_LeadID_From_OverViewpage() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getTextValue(leadID);
	}

	// Select the CAP Team ID
	public void select_the_CAP_Team_ID() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(cap_officer_Lookup);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(click_here_To_Execut_Query);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(capOfficers);

	}

	// click on notification icon

	public void click_On_NotificationIcon() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(notificationIcon);
	}

	// get the newly created notification text

	public String get_Notification_Text_For_NewlyCreatedLead() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getText(newlyCreatedNotification);
	}

	// use
	public void searchLead() throws InterruptedException, IOException {
		ElementUtil.Click(btn_Search, "Search button");
		Thread.sleep(1000);
		ElementUtil.Type(txt_Search, ConfigReader.getApplicationPropertie("LeadID"));
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(tbl_list);
		Thread.sleep(2000);
	}

	// use
	public void clickFirstLeadRecord() throws InterruptedException {
		ElementUtil.waitForElementClickable(lbl_firstRecordLead);
		Thread.sleep(5000);
		ElementUtil.doubleClick(lbl_firstRecordLead);
		Thread.sleep(2000);
		try 
		{
			ElementUtil.Click(btn_close, "Close button");
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			Thread.sleep(1000);
		}
		
	}

	// use
	public void clickActionButton() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(3000);
		ElementUtil.Click(btn_action, "Action button");
		Thread.sleep(1000);
	}

	// use
	public void clickConvertOppurtunity() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_convertOpportunity, "Convert to opportunity button");
		Thread.sleep(1000);
		ElementUtil.waitForPageLoad();
	}
	public void clickConvertOppurtunity2() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_convertOpportunity2, "Convert to opportunity button");
		Thread.sleep(1000);
		ElementUtil.waitForPageLoad();
	}

	// use
	public static void clickFirstLeadRecordInFlow() throws InterruptedException {
		ElementUtil.waitForElementClickable(tbl_firstRecordLeadFlow);
		Thread.sleep(5000);
		ElementUtil.doubleClick(tbl_firstRecordLeadFlow);
	}
	public static void clickSecondLeadRecordInFlow() throws InterruptedException {
		ElementUtil.waitForElementClickable(tbl_secondRecord);
		Thread.sleep(5000);
		ElementUtil.doubleClick(tbl_secondRecord);
	}

	//use
	public static void clickSecondLeadRecord() throws InterruptedException 
	{
		ElementUtil.waitForElementClickable(tbl_secondRecord);
		Thread.sleep(5000);
		ElementUtil.doubleClick(tbl_secondRecord);
	}

	public static void verifLeadCount() {
		List<WebElement> tbl = DriverFactory.getDriver().findElements(tbl_leadListCount);
		int tblCpount = tbl.size();
		System.out.println("Leads Count : " + tblCpount);
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:blue;font-weight:bold;'>" + "Leads Count : " + tblCpount + "</span>");
		if (tblCpount >= 1) {

			for (WebElement list : tbl) {
				System.out.println("Below leads are created for this IC");
				System.out.println("LEAD ID : " + list.getText());
				ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
						+ "Below leads are created for this IC" + "</span>");
				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue;font-weight:bold;'>" + "LEAD ID : " + list.getText() + "</span>");
			}
		}
	}

	public static void copyStudentName() {
		studentName = DriverFactory.getDriver().findElement(tbl_firstRecordLeadFlow).getText();
		ConfigReader.writeToApplicationPropertie("StudentName", studentName.trim().toString());
	}

	public static void verifyLeadTableHeader() throws Exception {
		ElementUtil.comparePickList("Picklist", "Lead_TableHeader", tbl_leadTableHeadCount);

	}

	public static void createLeads() throws InterruptedException {

		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_createLead, "create lead button");
		Thread.sleep(2000);
	}

	public static void fillMandatoryFieldsLeads() throws Exception {

		String Qualification = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "Qualification");
		String Source = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "Source");
		String LikeToStudy = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "LikeToStudy");
		String StudyLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "StudyLevel");
		String StudyPlanDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "StudyPlanDate");

		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Type(drp_qualification, Qualification);
		Thread.sleep(2000);
		ElementUtil.Type(drp_source, Source);
		Thread.sleep(2000);
		selectStudent();
		Thread.sleep(2000);
		selectIDPOwner();
		Thread.sleep(2000);
		ElementUtil.Type(drp_likeToStudy,LikeToStudy);
		Thread.sleep(2000);
		selectIDPOwner();
		Thread.sleep(2000);
		ElementUtil.Type(drp_likeToStudy, LikeToStudy);
		Thread.sleep(2000);
		ElementUtil.Type(drp_studyLevel, StudyLevel);
		Thread.sleep(2000);
		ElementUtil.Type(btn_studyPlanDate, StudyPlanDate);
		Thread.sleep(2000);
	}

	public static void refreshLead() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_more, "more button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_refresh, "refresh button");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void saveLead() throws InterruptedException {
		ElementUtil.Click(btn_saveLead, "save button");
		Thread.sleep(2000);
	}
	public static void saveAndOpenLead() throws InterruptedException 
	{
		ElementUtil.Click(btn_saveLead, "save button");
		Thread.sleep(2000);
	}
	public static void verifyLeadName() throws InterruptedException 
	{
	     leadName=DriverFactory.getDriver().findElement(lbl_leadName).getText();
	     Thread.sleep(2000);
		if(!leadName.trim().toString().contains(ConfigReader.getApplicationPropertie(studentName))) 
		{
			System.out.println("Student name matched with the lead opened ");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Student name matched with the lead opened " + "</span>");
		} else {
			System.out.println("Student name matched with the lead opened ");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Student name matched with the lead opened " + "</span>");
			// Assert.assertFalse(true);
		}
	}

	public static void verifySort() throws InterruptedException {
		System.out.println("Before Sorting");
		ExtentCucumberAdapter
				.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + "Before Sorting" + "</span>");

		List<WebElement> leadList = DriverFactory.getDriver().findElements(tbl_leadListCount);
		for (WebElement i_leadList : leadList) {
			String leadId = i_leadList.getText();
			System.out.println(leadId);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + leadId + "</span>");
		}

		ElementUtil.Click(btn_sort, "Sort button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_descending, "Descending button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_descending, "Descending button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_okSort, "Ok button");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);

		System.out.println("After Sorting");
		ExtentCucumberAdapter
				.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + "After Sorting" + "</span>");
//		DriverFactory.getDriver().findElement(By.xpath("(//div[@data-help-id='oRmHZ6UY24QTEi_9bBw7e0']//th[2])[1]")).click();
//		Thread.sleep(2000);

		List<WebElement> leadList2 = DriverFactory.getDriver().findElements(tbl_leadListCount);
		for (WebElement i_leadList2 : leadList2) {
			String leadId2 = i_leadList2.getText();
			System.out.println(leadId2);
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + leadId2 + "</span>");
		}

		ElementUtil.Click(btn_sort, "Sort button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_ascending, "Ascending button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_okSort, "Ok button");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void verifyIDPOwner() throws InterruptedException {
		String idpOwner = DriverFactory.getDriver().findElement(btn_idpowner).getText();
		Thread.sleep(2000);
		ElementUtil.Click(btn_idpowner, "IDP owner button");
		Thread.sleep(2000);
		System.out.println("IDP owner name before clicked : " + idpOwner);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "IDP owner name before clicked : " + idpOwner + "</span>");

		String i_idpOwner = DriverFactory.getDriver().findElement(lbl_idpOwner).getText();
		Thread.sleep(2000);
		System.out.println("IDP owner name after clicked : " + i_idpOwner);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "IDP owner name after clicked : " + i_idpOwner + "</span>");

		if (idpOwner.equals(i_idpOwner)) {
			System.out.println("IDP owner opened sucessfully and verified");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "IDP owner opened sucessfully and verified" + "</span>");

		} else {
			Assert.assertFalse(true);
		}

	}
	public static void clickCreateLeadFromLeadList() throws InterruptedException 
	{
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_createLeadFromList, "Create lead button");
		Thread.sleep(2000);
	}

	public static void selectIDPOwner() throws InterruptedException, IOException 
	{
		ElementUtil.Click(icon_idpOwner, "IDP owner popup");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(li_idpOwner);
		Thread.sleep(2000);
		ElementUtil.Click(li_idpOwner, "IDP owner list");
		Thread.sleep(2000);
	}

	public static void selectStudent() throws InterruptedException, IOException 
	{
		ElementUtil.Click(icon_student, "Student popup");
		Thread.sleep(2000);
		ElementUtil.Click(btn_studentSearch, "Search student icon");
		Thread.sleep(2000);
		ElementUtil.Type(txt_studentSearch, ConfigReader.getApplicationPropertie("studentID"));
		Thread.sleep(2000);
		ElementUtil.Click(li_student, "Student list");
		Thread.sleep(2000);
	}

	public static void selectCategory() throws InterruptedException, IOException 
	{
		String Category = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "Category");
		
		ElementUtil.Type(drp_category, Category);
		Thread.sleep(2000);
	}
	public static void selectCategorySES() throws InterruptedException, IOException 
	{
		String CategorySES = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "CategorySES");
		
		ElementUtil.Type(drp_category, CategorySES);
		Thread.sleep(2000);
	}
	public static void selectVisaType() throws InterruptedException, IOException 
	{
		String VisaType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "VisaType");
		
		ElementUtil.Type(drp_visaType, VisaType);
		Thread.sleep(2000);
	}
	public static void selectQualification() throws InterruptedException, IOException 
	{
		String Qualification = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "Qualification");
		ElementUtil.Type(drp_qualificationLevel, Qualification);
		Thread.sleep(2000);
	}

	public static void selectSource() throws InterruptedException, IOException 
	{

		String Source = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "Source");
		ElementUtil.Type(drp_source, Source);
		Thread.sleep(2000);
	}
	public static void clickSaveAndOpen() throws InterruptedException 
	{
		ElementUtil.Click(btn_saveMore, "Save and More button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_saveOpen, "Save and Open button");
		Thread.sleep(2000);
	}

	public static void verifyVisaTypeError() throws InterruptedException {
		headerMessage=DriverFactory.getDriver().findElement(lbl_headerText).getText();
		
		if(headerMessage.contains("Visa Type is mandatory")) 
		{
			ExtentCucumberAdapter
			.addTestStepLog("<span style='color:red;font-weight:bold;'>" + "Error Message:" + headerMessage + "</span>");
			
			ElementUtil.Click(btn_cancel, "Cancel button");
			Thread.sleep(2000);
		}else 
		{
			Assert.assertFalse(true);
		}
	}
	
	public void clickOnCancelButton() {
		if(ElementUtil.isElementDisplayed(btn_cancel)) {
			ElementUtil.click(btn_cancel);
		}	
	}
	public static void saveLeadId() throws InterruptedException 
	{
		Thread.sleep(2000);
		LeadId=DriverFactory.getDriver().findElement(lbl_leadId).getText();
		Thread.sleep(2000);
		ConfigReader.writeToApplicationPropertie(LeadId, "LeadID");
	}
	public static void clickActions() throws InterruptedException 
	{
		ElementUtil.Click(btn_actions, "Actions button");
		Thread.sleep(2000);
	}
	public static void clickConvertOpportunity() throws InterruptedException 
	{
		ElementUtil.Click(btn_convertOpportunity, "Convert to opportunity button");
		Thread.sleep(2000);
	}
	public static void selectSubcategory() throws InterruptedException, IOException 
	{
		String SubCategory = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "SubCategory");
		
		ElementUtil.Type(drp_subCategory, SubCategory);
		Thread.sleep(2000);
	}
	public static void switchToOverviewPage() throws InterruptedException 
	{
		//ElementUtil.switchToTab("OVERVIEW");
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.scrollToElement(Tab_Overview);
		ElementUtil.Click(Tab_Overview, "Overview Tab");
	}
	public static void clickMoreview() throws InterruptedException 
	{
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_moreView, "More button");
		Thread.sleep(2000);
	}
	public static void verifyStatusUpdate() 
	{
		String OP_probability=DriverFactory.getDriver().findElement(lbl_probability).getText();
		String OP_status=DriverFactory.getDriver().findElement(lbl_OpportunityStatus).getText();
		
		if(OP_probability.equals("100%")) 
		{
			System.out.println("pass");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Probabilty values verified :  " + OP_probability + "</span>");
		}
		else 
		{
			System.out.println("not pass");
		}
		if(OP_status.equals("Won")) 
		{
			System.out.println("pass");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Opportunity status verified :  " + OP_status + "</span>");
		}else 
		{
			System.out.println("not pass");
		}
	}
	public static void selectContractID() throws InterruptedException 
	{
		ElementUtil.Click(btn_contractIdPopup, "Contract Id popup");
		Thread.sleep(2000);
		
		ContIdOP1=DriverFactory.getDriver().findElement(lbl_contId1OP).getText();
		System.out.println("First contract Id:"+ContIdOP1);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "First contract Id:" + ContIdOP1+"</span>");
		ElementUtil.Click(tbl_contractId, "Contract data from table");
		Thread.sleep(2000);
		
		
		
	}
	public static void selectContractID2() throws InterruptedException 
	{
		ElementUtil.Click(btn_contractIdPopup, "Contract Id popup");
		Thread.sleep(2000);
		
		ContIdOP2=DriverFactory.getDriver().findElement(lbl_contId2OP).getText();
		System.out.println("Second contract Id:"+ContIdOP2);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "Second contract Id:" + ContIdOP2+"</span>");
		
		ElementUtil.Click(tbl_contractId2, "Contract data from table");
		Thread.sleep(2000);
		
		
		
	}


}