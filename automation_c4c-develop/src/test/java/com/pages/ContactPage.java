package com.pages;

import org.openqa.selenium.By;

import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class ContactPage {
	ApplicationPageUtil appPage = new ApplicationPageUtil();

	private By filterBtn = By.xpath(".//*[@data-help-id='k9kY$3OVbqoOCH6CMRU0SG-variantManagement-trigger']");
	private By filterAll = By.xpath(".//*[@role='listbox']//li[text()='All']");
	private By ADDRESSES = By.xpath(".//*[@data-help-id='y4W7vL7xyq_lIoyKsk$gP0']//div[text()='ADDRESSES']");
	private By FEED = By.xpath(".//*[@data-help-id='ugnL6nRqz4Qmp5G0KNVVAG']//div[text()='FEED']");
	private By MARKETING_PERMISSIONS = By
			.xpath(".//*[@data-help-id='3fSQ5CSfeKklAcLvtt4690']//div[text()='MARKETING PERMISSIONS']");
	private By NOTES = By.xpath(".//*[@data-help-id='1zygSWplOaM9yBO_LdCCgG']//div[text()='NOTES']");
	private By ACTIVITIES = By.xpath(".//*[@data-help-id='GaZ8QK_wV4kBsO1UQUl4wG']//div[text()='ACTIVITIES']");
	private By TICKETS = By.xpath(".//*[@data-help-id='LXSjznWkBqItVYxDG2ItGm']//div[text()='TICKETS']");
	private By LEADS = By.xpath(".//*[@data-help-id='LpPx7xGxOKk6I3qd5I0IGG']//div[text()='LEADS']");
	private By OPPORTUNITY = By.xpath(".//*[@data-help-id='2jbisKrjSK2g3VFZM6mjam']//div[text()='OPPORTUNITIES']");
	private By SALES_QUOTES = By.xpath(".//*[@data-help-id='JQXb0iGni4EW1$frB45P1m']//div[text()='SALES QUOTES']");
	private By CAMPAIGNS = By.xpath(".//*[@data-help-id='FAjsDg0q44QsEeQd86FOiW']//div[text()='CAMPAIGNS']");
	private By MARKETING_INTERACTIONS = By
			.xpath(".//*[@data-help-id='aCzCs3THbKkEnWVUwz60kG']//div[text()='MARKETING INTERACTIONS']");
	private By TARGET_GROUPS = By.xpath(".//*[@data-help-id='iKGaL_BtiKEHAxDlkYqQIW']//div[text()='TARGET GROUPS']");

	private By selectContacts_AR = By.xpath(".//*[@data-help-id='jQBHQpaAnaobfKsjvPCoOG']/child::div/child::a");
	private By selectContacts_counsellor = By.xpath(".//a[@data-help-id='jQBHQpaAnaobfKsjvPCoOG']");

	// Contact View List Tabs

	private By NameTab = By.xpath(".//th[@title='Name']");
	private By FirstNameTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='CnAWSfpkKqsEmNwkWAsc1G']"); // FirstName"
	private By LastNameTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='W6hRLG3APKA00Xnp98SD_m']"); // LastName
	private By AccountTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='hiyCmr3zcqopiMu42b8Qfm']"); // Account
	private By JobTitleTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='pkQya5nyGaMRsLzTF_Zms0']"); // JobTitle
	private By PrimaryRoleTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='b06d83d33d44e5f94bf543fc04229c29']"); // PrimaryRole
	private By SecondaryRoleTab = By.xpath(
			".//th[@title='Name']/following-sibling::th[@data-help-id='9753acfb3db839c010c97d874a30b608' or @title='Secondary Role']"); // SecondaryRole
	private By PhoneTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='sGmweylfxaAwvBx4bztuT0']"); // Phone
	private By MobileTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='fNTmGnTijqcb3cy3vHecdW']"); // Mobile
	private By EmailTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='o6ItX5Y$9Kw68aqxnXJqfG']"); // Email
	private By StatusTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='WI2rYh14Vqw50WO2bgjvJW']"); // Status
	private By Country_RegionTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='TJo64ZFI24oUA34Ebkcqk0']"); // Country_Region
	private By ContactIDTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='_8rpH_k_cKg_WUWB4ag6DG']"); // ContactID
	private By CreatedOnTab = By
			.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='3ilBMgq7Pak7KLYkVCYkMW']"); // CreatedOn

	// Advance Filter Fields
	private By advance_Filter_Icon = By.xpath(".//*[@data-help-id='inwyMEHGeKILB7ShsIiXM0-advancedfindformbutton']");
	private By advance_ContactID = By.xpath(".//*[@data-help-id='sIHC8pw9gK_uhG_mdD7NuG']//input");
	private By advance_FirstName = By.xpath(".//*[@data-help-id='9gO$ZkIY_4AdiDTk$2Mvtm']//input");
	private By advance_LastName = By.xpath(".//*[@data-help-id='XsdGVAigFqwYbpMMVU6_$W']//input");
	private By advance_Account = By.xpath(".//*[@data-help-id='L9dp44ysfK2OiA4Acmz9j0']//input");
	private By advance_email = By.xpath(".//*[@data-help-id='kNA8L5jxm4UydGuLXDEVBW']//input");
	private By advance_City = By.xpath(".//*[@data-help-id='jGFFb8eXfaYzkspgr0KpgW']//input");
	private By advance_postal_code = By.xpath(".//*[@data-help-id='H2ZAwy5dCKoZ9dEvoTXk2G']//input");
	private By advance_State = By.xpath(".//*[@data-help-id='kP6yeLz6Ja2SX_5__lfLq0']//input");
	private By advance_Country_Region = By.xpath(".//*[@data-help-id='bbHwwYoZw4UGS3iBnYywNm']//input");
	private By advance_PrimaryRole = By.xpath(".//*[@data-help-id='484ee9d8bc71ff4ea889382859d3ce8c']//input");

	private By moreBtn = By.xpath(".//*[@data-help-id='button-ObjectDetail-MoreOrLess']");
	private By edit = By.xpath(".//*[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");

	// Contact Overview page

	private By contactID = By.xpath(".//*[@data-help-id='MbqGWI3lQK_qSrvwTksJj0']/following-sibling::div//span");
	private By status = By.xpath(".//*[@data-help-id='BSP9EnWuQqg1b8F0J7Xv9G']/following-sibling::div//span");
	private By name = By.xpath(".//*[@data-help-id='4I6ht4Sej4_OB8I3kM4qAG']//input");
	private By title = By.xpath(".//*[@data-help-id='4yzc9Pdro4QP1ycoO$OLNG']//input");
	private By account = By.xpath(".//*[@data-help-id='gWWEtTP3M4QDRs_oGUpw_G']//input");
	private By job_title = By.xpath(".//*[@data-help-id='1LqkXzmRt4MV0hbkkczfWG']//input");
	private By business_address = By.xpath(".//*[@data-help-id='phu_keysl4M6GsujqiibL0']//input");
	private By phone = By.xpath(".//*[@data-help-id='UUfno7SXmKUA_8PrzOaY2G']//input");
	private By mobile = By.xpath(".//*[@data-help-id='oezjQTreZ4g3lEySjzHpTm']//input");
	private By email = By.xpath(".//*[@data-help-id='GUppUhRwa4s6FpiIM7zIRm']//input");
	private By primaryRole = By.xpath(".//*[@data-help-id='0f881fa05f5409cef6bc02f529241661']//input");
	private By secondaryRole = By.xpath(".//*[@data-help-id='afef0f6db61f458a7735de934be39d29']//input");
	private By region = By.xpath(".//*[@data-help-id='8c99f813c3722b2a230673a074252164']//input");

	// Contact Overview page without clicking on Edit button

	private By contactID_ = By.xpath(".//bdi[text()='Contact ID']");
	private By status_ = By.xpath(".//bdi[text()='Status']");
	private By name_ = By.xpath(".//bdi[text()='Name']");
	private By title_ = By.xpath(".//bdi[text()='Title']");
	private By account_ = By.xpath(".//bdi[text()='Account']");
	private By job_title_ = By.xpath(".//bdi[text()='Job Title']");
	private By business_address_ = By.xpath(".//bdi[text()='Business Address']");
	private By phone_ = By.xpath("(.//bdi[text()='Phone'])[1]");
	private By mobile_ = By.xpath("(.//bdi[text()='Mobile'])[1]");
	private By email_ = By.xpath("(.//bdi[text()='E-Mail'])[1]");
	private By primaryRole_ = By.xpath("(.//bdi[text()='Primary Role'])[1]");
	private By secondaryRole_ = By.xpath("(.//bdi[text()='Secondary Role'])[1]");
	private By region_ = By.xpath("(.//bdi[text()='Region'])[1]");

	// Overview fields without edit

	// is contactID_ displaying
	public boolean iscontactidDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(contactID_);
	}

	// is status_ displaying
	public boolean isStatusDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(status_);
	}

	// is name_ displaying
	public boolean isNameDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(name_);
	}

	// is title_ displaying
	public boolean isTitleDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(title_);
	}

	// is account_ displaying
	public boolean isAccountDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(account_);
	}

	// is job_title_ displaying
	public boolean isJobTitleDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(job_title_);
	}

	// is business_address_ displaying
	public boolean isBusinessAddressDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(business_address_);
	}

	// is phone_ displaying
	public boolean isPhoneDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(phone_);
	}

	// is mobile_ displaying
	public boolean isMobileDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(mobile_);
	}

	// is email_ displaying
	public boolean isEmailDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(email_);
	}

	// is primaryRole_ displaying
	public boolean isPrimaryRoleDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(primaryRole_);
	}

	// is secondaryRole_ displaying
	public boolean isSecondaryRoleDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(secondaryRole_);
	}

	// is region_ displaying
	public boolean isRegionDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(region_);
	}

	// Overview More button
	public void click_On_more_Button() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(moreBtn);

	}

	// Overview Edit button
	public void click_On_Edit_Button() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(edit);

		new ApplicationPageUtil().click_Yes_Button_to_Unlock_Object_If_Visible();
	}

	/**************************
	 * Contact Overview page
	 *******************************/
	// get contactID
	public String get_contactID() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.getText(contactID);
	}

	// is contactID displaying
	public boolean is_contactID_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(contactID);
	}

	// get status
	public String get_status() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.getText(status);
	}

	// is status displaying
	public boolean is_status_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ElementUtil.isElementDisplayed(status);
	}

	// get name
	public String get_name() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.getText(name);
	}

	// is name displaying
	public boolean is_name_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(name);
	}

	// enter title field
	public boolean enter_title(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		appPage.typeWithEnt(title, txt);
		return ElementUtil.isElementDisplayed(title);
	}

	// enter account field
	public boolean enter_account(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ElementUtil.isElementEnable(account)) {
			appPage.typeWithEnt(account, txt);
		}
		return ElementUtil.isElementDisplayed(account);
	}

	// enter job_title field
	public boolean enter_job_title(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ElementUtil.isElementEnable(job_title)) {
			appPage.typeWithEnt(job_title, txt);
		}

		return ElementUtil.isElementDisplayed(job_title);
	}

	// get business_address
	public String get_business_address() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.getText(business_address);
	}

	// Is business_address field displaying
	public boolean is_business_address_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ElementUtil.isElementDisplayed(business_address);
	}

	// enter phone field
	public boolean enter_phoneNumber(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ElementUtil.isElementEnable(phone)) {
			appPage.typeWithEnt(phone, txt);
		}

		return ElementUtil.isElementDisplayed(phone);
	}

	// enter mobile field
	public boolean enter_mobileNumber(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ElementUtil.isElementEnable(mobile)) {
			appPage.typeWithEnt(mobile, txt);
		}
		return ElementUtil.isElementDisplayed(mobile);
	}

	// enter email field
	public boolean enter_email(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ElementUtil.isElementEnable(email)) {
			appPage.typeWithEnt(email, txt);
		}
		return ElementUtil.isElementDisplayed(email);
	}

	// enter primaryRole field
	public boolean enter_primaryRole(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ElementUtil.isElementEnable(primaryRole)) {
			appPage.type_KeysEnter(primaryRole, txt);
		}

		return ElementUtil.isElementDisplayed(primaryRole);
	}

	// enter secondaryRole field
	public boolean enter_secondaryRole(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ElementUtil.isElementEnable(secondaryRole)) {
			appPage.typeWithEnt(secondaryRole, txt);
		}
		return ElementUtil.isElementDisplayed(secondaryRole);
	}

	// enter region field
	public boolean enter_region(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ElementUtil.isElementEnable(region)) {
			appPage.typeWithEnt(region, txt);
		}
		return ElementUtil.isElementDisplayed(region);
	}

	// Advance Filter Fields Methods

	// advance_Filter_Icon button
	public boolean Click_advance_Filter_Icon() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(advance_Filter_Icon);
		ElementUtil.click(advance_Filter_Icon);
		return ElementUtil.isElementDisplayed(advance_Filter_Icon);
	}

	// enter advance_ContactID field
	public boolean enter_advance_ContactID(String contactID) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		appPage.typeWithEnt(advance_ContactID, contactID);
		return ElementUtil.isElementDisplayed(advance_ContactID);
	}

	// enter advance_FirstName field
	public boolean enter_advance_FirstName(String firstName) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(advance_FirstName, firstName);
		return ElementUtil.isElementDisplayed(advance_FirstName);
	}

	// enter advance_LastName field
	public boolean enter_advance_LastName(String lastName) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(advance_LastName, lastName);
		return ElementUtil.isElementDisplayed(advance_LastName);
	}

	// enter advance_Account field
	public boolean enter_advance_Account(String account) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(advance_Account, account);
		return ElementUtil.isElementDisplayed(advance_Account);
	}

	// enter advance_email field
	public boolean enter_advance_email(String email) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(advance_email, email);
		return ElementUtil.isElementDisplayed(advance_email);
	}

	// enter advance_City field
	public boolean enter_advance_City(String city) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(advance_City, city);
		return ElementUtil.isElementDisplayed(advance_City);
	}

	// enter advance_postal_code field
	public boolean enter_advance_postal_code(String postal_code) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(advance_postal_code, postal_code);
		return ElementUtil.isElementDisplayed(advance_postal_code);
	}

	// enter advance_State field
	public boolean enter_advance_State(String state) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(advance_State, state);
		return ElementUtil.isElementDisplayed(advance_State);
	}

	// enter advance_Country_Region field
	public boolean enter_advance_Country_Region(String country_region) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(advance_Country_Region, country_region);
		return ElementUtil.isElementDisplayed(advance_Country_Region);
	}

	// enter advance_PrimaryRole field
	public boolean enter_advance_PrimaryRole(String primaryRole) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(advance_PrimaryRole, primaryRole);
		return ElementUtil.isElementDisplayed(advance_PrimaryRole);
	}

	// List View Tabs

	// Navigate to Name tab
	public boolean navigate_NameTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(NameTab);
		ElementUtil.click(NameTab);
		return ElementUtil.isElementDisplayed(NameTab);
	}

	// Navigate to FirstNameTab
	public boolean navigate_FirstNameTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(FirstNameTab);
		ElementUtil.click(FirstNameTab);
		return ElementUtil.isElementDisplayed(FirstNameTab);
	}

	// Navigate to LastNameTab
	public boolean navigate_LastNameTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(LastNameTab);
		ElementUtil.click(LastNameTab);
		return ElementUtil.isElementDisplayed(LastNameTab);
	}

	// Navigate to AccountTab
	public boolean navigate_AccountTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(AccountTab);
		ElementUtil.click(AccountTab);
		return ElementUtil.isElementDisplayed(AccountTab);
	}

	// Navigate to JobTitleTab
	public boolean navigate_JobTitleTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(JobTitleTab);
		ElementUtil.click(JobTitleTab);
		return ElementUtil.isElementDisplayed(JobTitleTab);
	}

	// Navigate to PrimaryRoleTab
	public boolean navigate_PrimaryRoleTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(PrimaryRoleTab);
		ElementUtil.click(PrimaryRoleTab);
		return ElementUtil.isElementDisplayed(PrimaryRoleTab);
	}

	// Navigate to SecondaryRoleTab
	public boolean navigate_SecondaryRoleTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(SecondaryRoleTab);
		ElementUtil.click(SecondaryRoleTab);
		return ElementUtil.isElementDisplayed(SecondaryRoleTab);
	}

	// Navigate to PhoneTab
	public boolean navigate_PhoneTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(PhoneTab);
		ElementUtil.click(PhoneTab);
		return ElementUtil.isElementDisplayed(PhoneTab);
	}

	// Navigate to MobileTab
	public boolean navigate_MobileTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(MobileTab);
		ElementUtil.click(MobileTab);
		return ElementUtil.isElementDisplayed(MobileTab);
	}

	// Navigate to EmailTab
	public boolean navigate_EmailTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(EmailTab);
		ElementUtil.click(EmailTab);
		return ElementUtil.isElementDisplayed(EmailTab);
	}

	// Navigate to StatusTab
	public boolean navigate_StatusTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(StatusTab);
		ElementUtil.click(StatusTab);
		return ElementUtil.isElementDisplayed(StatusTab);
	}

	// Navigate to Country_RegionTab
	public boolean navigate_Country_RegionTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(Country_RegionTab);
		ElementUtil.click(Country_RegionTab);
		return ElementUtil.isElementDisplayed(Country_RegionTab);
	}

	// Navigate to ContactIDTab
	public boolean navigate_ContactIDTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(ContactIDTab);
		ElementUtil.click(ContactIDTab);
		return ElementUtil.isElementDisplayed(ContactIDTab);
	}

	// Navigate to CreatedOnTab
	public boolean navigate_CreatedOnTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(CreatedOnTab);
		ElementUtil.click(CreatedOnTab);
		return ElementUtil.isElementDisplayed(CreatedOnTab);
	}

	/******************************************************************************************************/

	// Navigate to ADDRESSES tab
	public boolean navigate_ADDRESSES__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(ADDRESSES);
		ElementUtil.click(ADDRESSES);
		return ElementUtil.isElementDisplayed(ADDRESSES);
	}

	// Navigate to FEED tab
	public boolean navigate_FEED__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(FEED);
		ElementUtil.click(FEED);
		return ElementUtil.isElementDisplayed(FEED);
	}

	// Navigate to TICKETS tab
	public boolean navigate_TICKETS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(TICKETS);
		ElementUtil.click(TICKETS);
		return ElementUtil.isElementDisplayed(TICKETS);
	}

	// Navigate to MARKETING_PERMISSIONS tab
	public boolean navigate_MARKETING_PERMISSIONS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(MARKETING_PERMISSIONS);
		ElementUtil.click(MARKETING_PERMISSIONS);
		return ElementUtil.isElementDisplayed(MARKETING_PERMISSIONS);
	}

	// Navigate to NOTES tab
	public boolean navigate_NOTES__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(NOTES);
		ElementUtil.click(NOTES);
		return ElementUtil.isElementDisplayed(NOTES);
	}

	// Navigate to ACTIVITIES tab
	public boolean navigate_ACTIVITIES__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(ACTIVITIES);
		ElementUtil.click(ACTIVITIES);
		return ElementUtil.isElementDisplayed(ACTIVITIES);
	}

	// Navigate to LEADS tab
	public boolean navigate_LEADS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(LEADS);
		ElementUtil.click(LEADS);
		return ElementUtil.isElementDisplayed(LEADS);
	}

	// Navigate to OPPORTUNITY tab
	public boolean navigate_OPPORTUNITY__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(OPPORTUNITY);
		ElementUtil.click(OPPORTUNITY);
		return ElementUtil.isElementDisplayed(OPPORTUNITY);
	}

	// Navigate to SALES_QUOTES tab
	public boolean navigate_SALES_QUOTES__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(SALES_QUOTES);
		ElementUtil.click(SALES_QUOTES);
		return ElementUtil.isElementDisplayed(SALES_QUOTES);
	}

	// Navigate to CAMPAIGNS tab
	public boolean navigate_CAMPAIGNS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(CAMPAIGNS);
		ElementUtil.click(CAMPAIGNS);
		return ElementUtil.isElementDisplayed(CAMPAIGNS);
	}

	// Navigate to MARKETING_INTERACTIONS tab
	public boolean navigate_MARKETING_INTERACTIONS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(MARKETING_INTERACTIONS);
		ElementUtil.click(MARKETING_INTERACTIONS);
		return ElementUtil.isElementDisplayed(MARKETING_INTERACTIONS);
	}

	// Navigate to TARGET_GROUPS tab
	public boolean navigate_TARGET_GROUPS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(TARGET_GROUPS);
		ElementUtil.click(TARGET_GROUPS);
		return ElementUtil.isElementDisplayed(TARGET_GROUPS);
	}

	// Filter All Contacts
	public void filter_All_the_Contacts() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(filterBtn);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(filterAll);
	}

	// Select the single Contacts from the list
	public void select_Contacts_from_the_List_As_AR() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		DriverFactory.getDriver().findElements(selectContacts_AR).get(0).click();

	}

	// Select the single Contacts from the list as counsellor
	public void select_Contacts_from_the_List_As_counsellor() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		DriverFactory.getDriver().findElements(selectContacts_counsellor).get(0).click();

	}

	// navigate to Contacts page
	public void navigateTo_Contacts() {
		appPage.clickTab_underCategory("Customers", "Contacts");
	}
}
