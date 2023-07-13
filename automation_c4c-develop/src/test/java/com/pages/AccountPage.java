package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class AccountPage {
	

	public AccountPage() {
		
	} 

	ApplicationPageUtil appPage = new ApplicationPageUtil();
	IC_CreationPage icp = new IC_CreationPage();

	// Create the Account Record
	private By addIcon = By.xpath(".//*[@data-help-id='jpKk_mlVR427gdySs1Md7m']");
	private By accName = By.xpath(".//*[@data-help-id='RbF2e$Pm6aQi3LUCEQiVrG']//input");
	private By getAccName = By.xpath(".//*[@data-help-id='9769e3bedcce43af838bac1f11df696b']");
	private By accRole = By.xpath(".//*[@data-help-id='OzV6bI2C7qYjku$ewtuHzW']//input");
	private By getAccRole = By.xpath(".//*[@data-help-id='OhDQuLiTpa_uUmSMPBZFDW']//input");
	private By accWebSite = By.xpath(".//*[@data-help-id='lviwnGL8jqcTAaGPxd2xJ0']//input");
	private By getAccWebsite = By.xpath(".//*[@data-help-id='K7fn0SEr8qYZC9xvIsqgZm']//input");
	private By accCountryRegion = By.xpath(".//*[@data-help-id='PP$HWfbNyq6vDxnrzCXh3G']//input");
	private By accCity = By.xpath(".//*[@data-help-id='07eJDpEoIqMmFr1qUC_DLm']//input");
	private By accState = By.xpath(".//*[@data-help-id='LMMP46VpqKEz$cknAvPtuW']//input");
	private By accOwner = By.xpath(".//*[@data-help-id='ENn6YkrYgKQ1PX8j$a4MQG']//input");
	private By accAccountStatus = By.xpath(".//*[@data-help-id='733a7339a923b7180b1e6b8ff4ffb148']//input");

	private By moreOptn_toSave = By.xpath(".//*[@data-help-id='Kf8stUeG34wu3jw3Um6c7G']//button[@title='More']");
	private By saveAndOpen = By.xpath(".//*[@data-help-id='rSHRNsrnQ4Q4BNXz_opJUm']");

	private By selectAccount = By.xpath(".//a[@data-help-id='0ftqJyP8LaIR_zMlQN7Ckm']");
	private By INSTITUTION_INFO = By.xpath(
			".//*[@data-help-id='NAVIGATIONITEMID_0f0280c598694897ae64d96123226abd']/div[text()='INSTITUTION INFO']");

	private By US_CANADA_APP_DATA = By
			.xpath(".//*[@data-help-id='76b01b6e24381141670b01b08d937ca2']/div[text()='US/CANADA APP DATA']");
	private By CAMPUS = By
			.xpath(".//*[@data-help-id='NAVIGATIONITEMID_cb18852f4f6547b1996d3237c73f9616']/div[text()='CAMPUS']");
	private By WEB_LINKS = By
			.xpath(".//*[@data-help-id='NAVIGATIONITEMID_b86df70048544d8a95b21a22cd78a72b']/div[text()='WEB LINKS']");
	private By CONTACTS = By.xpath(".//*[@data-help-id='KXpvpFIOcKgJJ1quMzLTlG']/div[text()='CONTACTS']");

	private By accountTeam = By.xpath(".//*[@data-help-id='$XJ5RrqHzK6pyaH2E373Xm']/div[text()='Account Team']");

	private By HIERARCHY = By.xpath(".//*[@data-help-id='9Wr$ej4XHK6aQ2nMUmEBvW']/div[text()='A/C HIERARCHY']");

	private By RELATIONSHIPS = By.xpath(".//*[@data-help-id='3L6HsUXtBKQobXDwg5GZC0']/div[text()='RELATIONSHIPS']");

	private By addressesTab = By.xpath(".//*[@data-help-id='EspQv1jP3awsHMdORSr4V0']/div[text()='ADDRESSES']");
	private By salesDataTab = By.xpath(".//*[@data-help-id='JA_1ZINI04oDN1BukhwLIW']/div[text()='Sales Data']");
	private By DOCUMENTS = By.xpath(".//*[@data-help-id='B$7GfiVvvKoQ9cXXcq858m']/div[text()='DOCUMENTS']");
	private By NOTES = By.xpath(".//*[@data-help-id='JujQ59TJeKUOnrLTHMJ_ym']/div[text()='NOTES']");
	private By CHANGES = By.xpath(".//*[@data-help-id='ds9LkBOkgq6HL6gD7sD1iW']/div[text()='CHANGES']");
	private By helpTab = By
			.xpath(".//*[@data-help-id='NAVIGATIONITEMID_7c6bf2eaa60f43808e7bf236cfb6c04c']/div[text()='HELP']");

	// Account List View Tabs

	private By accountIdTab = By.xpath(".//th[@title='Account ID']");
	private By ExternalIdTab = By.xpath(".//th[@title='External ID']");
	private By NameTab = By.xpath(".//th[@title='Name']");
	private By RoleTab = By.xpath(".//th[@title='Name']/following-sibling::th[@data-help-id='9YblzNAFy46ZSu7v36wg$0']");
	private By AccountOwnerTab = By.xpath(".//th[@title='Account Owner']");
	private By AccountStatusTab = By.xpath(".//th[@title='Status']");
	private By country_region = By.xpath(".//th[@title='Country/Region']");
	private By state = By.xpath(".//th[@title='State']");
	private By city = By.xpath(".//th[@title='City']");
	private By changedOn = By.xpath(".//th[@title='Changed On']");
	private By changeBy = By.xpath("(.//*[@data-help-id='42QFgzgr5KQGWFauYlBn9G'])[1]");
	private By createdOn = By.xpath("(.//*[@data-help-id='zD8ePZ$XJacPg8vLMXAvLW'])[1]");
	private By collectionNowStatus = By.xpath("(.//*[@data-help-id='CsMhVcYBm4E384BFt2VfB0'])[1]");
	private By DestinationCountry = By.xpath("(.//*[@data-help-id='8f32fe8349847a367c2e3c23f7a2261a'])[1]");
	private By ClientSector = By.xpath("(.//*[@data-help-id='edccccb45306dad6388834649180c41b'])[1]");
	private By IDPClient = By.xpath("(.//*[@data-help-id='772a4f2d3c306d08acb99c3f1438e856'])[1]");

	// Account Advance Filter

	private By advanceFilterIcon = By.xpath(".//*[@data-help-id='fPsZIeLshaIfa09ebxN$p0-advancedfindformbutton']");
	private By adv_AccountId = By.xpath(".//*[@data-help-id='Tr6xuElxca6egAvioNpYAm']//input");
	private By adv_name = By.xpath(".//*[@data-help-id='Ypa0YRuuOKslAjuZTHa0Tm']//input");
	private By adv_role = By.xpath(".//*[@data-help-id='fZVG8JxEaaI0n6p0fk1tTW']//input");
	private By adv_Account_Status = By.xpath(".//*[@data-help-id='60d3f9f94df99b91a2710f1a47c40d16']//input");
	private By adv_Country_Region = By.xpath(".//*[@data-help-id='UTVQGfAM0qUmqZ3c88FWHW']//input");
	private By adv_State = By.xpath(".//*[@data-help-id='5brD6CEqgqENr$Jw1CKwN0']//input");
	private By adv_City = By.xpath(".//*[@data-help-id='9liavsFwXKo4loSTMa3moW']//input");
	private By adv_Account_Owner = By.xpath(".//*[@data-help-id='miuR6Juioa2KoSgsnl5qom']//input");

	private By moreBtn = By.xpath(".//*[@data-help-id='button-ObjectDetail-MoreOrLess']");
	private By accEditBtn = By.xpath(".//*[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");

	// Account Fields
	private By cancelBtn = By.xpath(".//bdi[text()='Cancel']");

	private By name = By.xpath(".//*[@data-help-id='9769e3bedcce43af838bac1f11df696b']//input");
	private By accountID = By.xpath(".//*[@data-help-id='yyerO1v2N4gMqkLnrvKXhW']/following-sibling::div//span");
	private By externalID = By.xpath(".//*[@data-help-id='7Fj9fwuPUqMW7uBoKLDGt0']/following-sibling::div//span");
	private By oscae_legacyID = By.xpath(".//*[@data-help-id='d5e56991d60c08891d6f58250f030df7']//input");
	private By parentAccountLookUP = By
			.xpath(".//*[@data-help-id='$L$ejJZWN46$75a5hqaM1m']//span[@role='presentation']");

	private By parentAccount = By.xpath(".//*[@data-help-id='$L$ejJZWN46$75a5hqaM1m']//input");
	private By contractingEntity = By.xpath(".//*[@data-help-id='07fe7a96e9337b296545238361cb310b']//input");
	private By idp_Client = By.xpath(".//*[@data-help-id='b9036460f1c5444b984997953dc35828']//input");
	private By accountOwnerLookUp = By
			.xpath(".//*[@data-help-id='cXr2$qDywKEZoP1hhDnIHG']//span[@role='presentation']");
	private By accountOwner = By.xpath(".//*[@data-help-id='cXr2$qDywKEZoP1hhDnIHG']//input");

	private By aliases = By
			.xpath(".//*[@data-help-id='5d211d7bc74b45f2b4f99f2a289a418d']/following-sibling::div//span");
	private By legalName = By.xpath(".//*[@data-help-id='SflN3ow5T4sS0zR5RFRT5W']//input");
	private By address = By.xpath(".//*[@data-help-id='lkCamUHvAKwwd7DzmDQpDG']//input");
	private By role = By.xpath(".//*[@data-help-id='OhDQuLiTpa_uUmSMPBZFDW']//input");
	private By idp_directClient = By.xpath(".//*[@data-help-id='cd38d4bc379b48c88b83fced7d04d607']");
	private By account_status = By.xpath(".//*[@title='Status']//input");
	private By destination_country = By.xpath(".//*[@data-help-id='f5be6140712f828bd28dedadbde1bb9d']//input");
	private By destinationCountryAR = By.xpath(".//*[@data-help-id='142378f8e9d5636c61643461caec388e']//input");
	private By CollectNowStatus = By.xpath(".//*[@data-help-id='ODrkH7HeBqMtqOhjqHk8F0']");
	private By university_class = By.xpath(".//*[@data-help-id='48e4e929a1e0532c7aa0d925a6b05720']//input");
	private By activated_Date = By.xpath(".//*[@data-help-id='b18952bc80d054bd4e9726a7680910fc']//input");
	private By deactivate_Date = By.xpath(".//*[@data-help-id='3adda0fa4e2d4a33fb468aefdb61bc3d']//input");
	private By deactivate_Reason = By.xpath(".//*[@data-help-id='504cd1a7e411424a5a3e4ca139392d23']//input");
	private By client_Sector = By.xpath(".//*[@data-help-id='11e6f87fe2ae563ea4d4fe8f07b961b6']//input");
	private By webSite = By
			.xpath(".//*[@data-help-id='74GHGdLj8qc8ic09VmgEzG']/following-sibling::div//div//div//input");
	private By applicatin_processingTime = By.xpath(".//*[@data-help-id='6dc998cab0d81c303b6c0e1671655fa6']//input");
	private By ebs_account_siteID = By.xpath(".//*[@data-help-id='84ca435c9999bbd047e2df673dadb1b6']//input");
	private By ebs_replication_Status = By
			.xpath(".//*[@data-help-id='215b6bd3f8cc4eda8427187d4b177785']/following-sibling::div//span");
	private By ebs_debtor_status = By.xpath(".//*[@data-help-id='54e602f3edfc88470d12d10ddf8d2c96']//input");
	private By ebs_debtor_accountStatus = By.xpath(".//*[@data-help-id='0b455e509a884e7c9671bf5f0c4de546']//input");

	// Account overview fields without edit page

	private By name_ = By.xpath(".//bdi[text()='Name']");
	private By accountID_ = By.xpath(".//bdi[text()='Account ID']");
	private By externalID_ = By.xpath(".//bdi[text()='External ID']");
	private By oscarLegacyID_ = By.xpath(".//bdi[text()='Oscar Legacy ID']");
	private By parentAccount_ = By.xpath(".//bdi[text()='Parent Account']");
	private By contractingEntity_ = By.xpath(".//bdi[text()='Contracting Entity']");
	private By IDPClient_ = By.xpath(".//bdi[text()='IDP Client']");
	private By accountOwner_ = By.xpath(".//bdi[text()='Account Owner']");
	private By aliases_ = By.xpath(".//bdi[text()='Aliases']");
	private By legalName_ = By.xpath(".//bdi[text()='Legal Name']");
	private By address_ = By.xpath(".//bdi[text()='Address']");
	private By role_ = By.xpath(".//bdi[text()='Role']");
	private By iDPDirectClient_ = By.xpath(".//bdi[text()='IDP Direct Client']");
	private By accountStatus_ = By.xpath(".//bdi[text()='Account Status']");
	private By destinationCountry_ = By.xpath(".//bdi[text()='Destination Country']");
	private By universityClass_ = By.xpath(".//bdi[text()='University Class']");
	private By activatedDate_ = By.xpath(".//bdi[text()='Activated Date']");
	private By deactivatedDate_ = By.xpath(".//bdi[text()='Deactivated Date']");
	private By deactivatedReason_ = By.xpath(".//bdi[text()='Deactivated Reason']");
	private By clientSector_ = By.xpath(".//bdi[text()='Client Sector']");
	private By webSite_ = By.xpath(".//bdi[text()='Web Site']");
	private By applicationProcessingTime_ = By.xpath(".//bdi[text()='Application Processing Time']");
	private By eBSAccountSite_ = By.xpath(".//bdi[text()='EBS Account Site ID']");
	private By eBSReplicationStatus_ = By.xpath(".//bdi[text()='EBS Replication Status']");
	private By eBSDebtorStatus_ = By.xpath(".//bdi[text()='EBS Debtor Status']");
	private By eBSDebtorAccountStatus_ = By.xpath(".//bdi[text()='EBS Debtor Account Status']");

	// cancelBtn

	public void cancel_AccountRecord() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1500);
			ElementUtil.click(cancelBtn);
			Thread.sleep(1500);
			ApplicationPageUtil.waitForLoadGetDisappiear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Save And Open

	public void saveTheAccountRecord() {
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
	}

	public void enter_account_Name(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPage.type_KeysEnter(accName, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String get_account_Name() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			return ElementUtil.getAttribute(name, "value");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}

	}

	public void enter_account_Role(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPage.type_KeysEnter(accRole, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String get_account_Role() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			return ElementUtil.getAttribute(role, "value");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}

	}

	public void enter_account_WebSite(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPage.type_KeysEnter(accWebSite, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String get_account_WebSite() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			return ElementUtil.getAttribute(webSite, "value");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}

	}

	public void enter_account_CountryRegion(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPage.type_KeysEnter(accCountryRegion, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_account_City(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPage.type_KeysEnter(accCity, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_account_State(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPage.type_KeysEnter(accState, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_account_Owner(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPage.type_KeysEnter(accOwner, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enter_account_AccountStatus(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			appPage.type_KeysEnter(accAccountStatus, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean click_On_Account_Add_icon() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			if (ElementUtil.isElementDisplayed(addIcon)) {
				Thread.sleep(3100);
				ElementUtil.click(addIcon);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return ElementUtil.isElementDisplayed(addIcon);
	}

	// is name_ displaying
	public boolean isnameDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(name_);
	}

	// is accountID_ displaying
	public boolean isaccountIDDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(accountID_);
	}

	// is externalID_ displaying
	public boolean isexternalIDDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(externalID_);
	}

	// is oscarLegacyID_ displaying
	public boolean isOscarLegacyIDDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(oscarLegacyID_);
	}

	// is parentAccount_ displaying
	public boolean isparentAccountDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(parentAccount_);
	}

	// is contractingEntity_ displaying
	public boolean iscontractingEntityDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(contractingEntity_);
	}

	// is IDPClient_ displaying
	public boolean isIDPClientDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(IDPClient_);
	}

	// is accountOwner_ displaying
	public boolean isAccountOwnerDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.isElementDisplayed(accountOwner_);
	}

	// is aliases_ displaying
	public boolean isaliasesDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(aliases_);
	}

	// is legalName_ displaying
	public boolean islegalNameDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(legalName_);
	}

	// is address_ displaying
	public boolean isaddressDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(address_);
	}

	// is role_ displaying
	public boolean isroleDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(role_);
	}

	// is iDPDirectClient_ displaying
	public boolean isIDPDirectClientDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(iDPDirectClient_);
	}

	// is accountStatus_ displaying
	public boolean isAccountStatusDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(accountStatus_);
	}

	// is destinationCountry_ displaying
	public boolean isDestinationCountryDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(destinationCountry_);
	}

	// is universityClass_ displaying
	public boolean isuniversityClassDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(universityClass_);
	}

	// is activatedDate_ displaying
	public boolean isactivatedDateDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(activatedDate_);
	}

	// is deactivatedDate_ displaying
	public boolean isdeactivatedDateDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(deactivatedDate_);
	}

	// is deactivatedReason_ displaying
	public boolean isdeactivatedReasonDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(deactivatedReason_);
	}

	// is clientSector_ displaying
	public boolean isclientSectorDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(clientSector_);
	}

	// is webSite_ displaying
	public boolean iswebSiteDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(webSite_);
	}

	// is applicationProcessingTime_ displaying
	public boolean isapplicationProcessingTimeDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(applicationProcessingTime_);
	}

	// is eBSAccountSite_ displaying
	public boolean iseBSAccountSiteDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(eBSAccountSite_);
	}

	// is eBSReplicationStatus_ displaying
	public boolean iseBSReplicationStatusDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(eBSReplicationStatus_);
	}

	// is eBSDebtorStatus_ displaying
	public boolean iseBSDebtorStatusDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(eBSDebtorStatus_);
	}

	// is eBSDebtorAccountStatus_ displaying
	public boolean iseBSDebtorAccountStatusDisplaying_() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		return ElementUtil.isElementDisplayed(eBSDebtorAccountStatus_);
	}

	// Account Overview screen Field

	// name field
	public boolean enter_name_Field(String txtname) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(name, txtname);
			return ElementUtil.isElementDisplayed(name);
		} catch (StaleElementReferenceException ex) {
			appPage.typeWithEnt(name, txtname);
			return ElementUtil.isElementDisplayed(name);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// accountID field
	public boolean enter_accountID_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(accountID, txt);
			return ElementUtil.isElementDisplayed(accountID);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(accountID, txt);
			return ElementUtil.isElementDisplayed(accountID);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// get accountID
	public String get_accountID() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.getTextValue(accountID);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.getTextValue(accountID);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return null;
		}

	}

	// is accountID displays
	public boolean isAccountID_Displayed() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.isElementDisplayed(accountID);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.isElementDisplayed(accountID);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// get externalID
	public String get_externalID() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.getTextValue(externalID);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.getTextValue(externalID);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return null;
		}

	}

	// is externalID displays
	public boolean isExternalID_Displayed() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.isElementDisplayed(externalID);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.isElementDisplayed(externalID);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// oscae_legacyID field
	public boolean enter_oscae_legacyID_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(oscae_legacyID, txt);
			return ElementUtil.isElementDisplayed(oscae_legacyID);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(oscae_legacyID, txt);
			return ElementUtil.isElementDisplayed(oscae_legacyID);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// parentAccount field
	public boolean enter_parentAccount_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(parentAccount, txt);
			return ElementUtil.isElementDisplayed(parentAccount);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(parentAccount, txt);
			return ElementUtil.isElementDisplayed(parentAccount);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// contractingEntity field
	public boolean enter_contractingEntity_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(contractingEntity, txt);
			return ElementUtil.isElementDisplayed(contractingEntity);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(contractingEntity, txt);
			return ElementUtil.isElementDisplayed(contractingEntity);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// idp_Client field
	public boolean enter_idp_Client_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(idp_Client, txt);
			return ElementUtil.isElementDisplayed(idp_Client);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(idp_Client, txt);
			return ElementUtil.isElementDisplayed(idp_Client);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// accountOwner field
	public boolean enter_accountOwner_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(accountOwner, txt);
			return ElementUtil.isElementDisplayed(accountOwner);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(accountOwner, txt);
			return ElementUtil.isElementDisplayed(accountOwner);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// get aliases
	public String get_aliases() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.getTextValue(aliases);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.getTextValue(aliases);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return null;
		}

	}

	// is aliases displays
	public boolean isAliases_Displayed() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.isElementDisplayed(aliases);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.isElementDisplayed(aliases);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// legalName field
	public boolean enter_legalName_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(legalName, txt);
			return ElementUtil.isElementDisplayed(legalName);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(legalName, txt);
			return ElementUtil.isElementDisplayed(legalName);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// address field
	public boolean enter_address_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(address, txt);
			return ElementUtil.isElementDisplayed(address);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(address, txt);
			return ElementUtil.isElementDisplayed(address);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// is address field
	public boolean is_address_Field_IsDisplaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.isElementDisplayed(address);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.isElementDisplayed(address);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// role field
	public boolean enter_role_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			try {
				Thread.sleep(2200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			appPage.type_KeysEnter(role, txt);
			return ElementUtil.isElementDisplayed(role);
		} catch (StaleElementReferenceException e) {
			appPage.type_KeysEnter(role, txt);
			return ElementUtil.isElementDisplayed(role);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// Id displaying idp_directClient field
	public boolean isIDP_directClient_Field_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.isElementDisplayed(idp_directClient);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.isElementDisplayed(idp_directClient);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// account_status field
	public boolean enter_account_status_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(account_status, txt);
			return ElementUtil.isElementDisplayed(account_status);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(account_status, txt);
			return ElementUtil.isElementDisplayed(account_status);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// destination_country field
	public boolean enter_destination_country_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(destination_country, txt);
			return ElementUtil.isElementDisplayed(destination_country);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(destination_country, txt);
			return ElementUtil.isElementDisplayed(destination_country);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// destination_country field as AR role
	public boolean enter_destination_country_Field_AR_Role(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(destinationCountryAR, txt);
			return ElementUtil.isElementDisplayed(destinationCountryAR);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(destinationCountryAR, txt);
			return ElementUtil.isElementDisplayed(destinationCountryAR);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// CollectNowStatus field as AR role
	public boolean isCollectNowStatus_Field_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {

			return ElementUtil.isElementDisplayed(CollectNowStatus);
		} catch (StaleElementReferenceException e) {

			return ElementUtil.isElementDisplayed(CollectNowStatus);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// university_class field
	public boolean enter_university_class_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(university_class, txt);
			return ElementUtil.isElementDisplayed(university_class);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(university_class, txt);
			return ElementUtil.isElementDisplayed(university_class);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// activated_Date field
	public boolean enter_activated_Date_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(activated_Date, txt);
			return ElementUtil.isElementDisplayed(activated_Date);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(activated_Date, txt);
			return ElementUtil.isElementDisplayed(activated_Date);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// deactivate_Date field
	public boolean enter_deactivate_Date_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(deactivate_Date, txt);
			return ElementUtil.isElementDisplayed(deactivate_Date);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(deactivate_Date, txt);
			return ElementUtil.isElementDisplayed(deactivate_Date);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// deactivate_Reason field
	public boolean enter_deactivate_Reason_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(deactivate_Reason, txt);
			return ElementUtil.isElementDisplayed(deactivate_Reason);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(deactivate_Reason, txt);
			return ElementUtil.isElementDisplayed(deactivate_Reason);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// client_Sector field
	public boolean enter_client_Sector_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(client_Sector, txt);
			return ElementUtil.isElementDisplayed(client_Sector);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(client_Sector, txt);
			return ElementUtil.isElementDisplayed(client_Sector);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// webSite field
	public boolean enter_webSite_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(700);
			appPage.typeWithEnt(webSite, txt);
			return ElementUtil.isElementDisplayed(webSite);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(webSite, txt);
			return ElementUtil.isElementDisplayed(webSite);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// applicatin_processingTime field
	public boolean enter_applicatin_processingTime_Field(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			appPage.typeWithEnt(applicatin_processingTime, txt);
			return ElementUtil.isElementDisplayed(applicatin_processingTime);
		} catch (StaleElementReferenceException e) {
			appPage.typeWithEnt(applicatin_processingTime, txt);
			return ElementUtil.isElementDisplayed(applicatin_processingTime);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// get ebs_account_siteID field
	public String get_ebs_account_siteID() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.getTextValue(ebs_account_siteID);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.getTextValue(ebs_account_siteID);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return null;
		}

	}

	// is_EBS_Account_siteID_Displaying field
	public boolean is_EBS_Account_siteID_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.isElementDisplayed(ebs_account_siteID);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.isElementDisplayed(ebs_account_siteID);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// get ebs_replication_Status
	public String get_ebs_replication_Status() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.getTextValue(ebs_replication_Status);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.getTextValue(ebs_replication_Status);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return null;
		}

	}

	// is ebs_replication_Status displays
	public boolean isEBS_replication_Status_Displayed() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.isElementDisplayed(ebs_replication_Status);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.isElementDisplayed(ebs_replication_Status);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// get ebs_debtor_status
	public String get_EBS_Debtor_status() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.getTextValue(ebs_debtor_status);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.getTextValue(ebs_debtor_status);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return null;
		}

	}

	// Is ebs_debtor_status displaying
	public boolean is_EBS_Debtor_status_Field_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.isElementDisplayed(ebs_debtor_status);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.isElementDisplayed(ebs_debtor_status);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// get ebs_debtor_accountStatus
	public String get_ebs_debtor_accountStatus_Field() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.getText(ebs_debtor_accountStatus);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.getText(ebs_debtor_accountStatus);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return null;
		}

	}

	// Is ebs_debtor_accountStatus Field Displaying
	public boolean is_ebs_debtor_accountStatus_Field_Displaying() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			return ElementUtil.isElementDisplayed(ebs_debtor_accountStatus);
		} catch (StaleElementReferenceException e) {
			return ElementUtil.isElementDisplayed(ebs_debtor_accountStatus);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.toString());
			return false;
		}

	}

	// Advance Filter Options
	/*******************************************************************************/

	// Click on More button

	// Click on more button
	public void click_On_MoreBtn() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(moreBtn);

	}

	// Click on account edit button
	public void click_On_EditBtn() {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ElementUtil.click(accEditBtn);

		new ApplicationPageUtil().click_Yes_Button_to_Unlock_Object_If_Visible();
	}

	// Navigate to advanceFilterIcon button
	public boolean Click_On_advanceFilterIcon() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(advanceFilterIcon);
		ElementUtil.click(advanceFilterIcon);
		return ElementUtil.isElementDisplayed(advanceFilterIcon);
	}

	// AccountId field
	public boolean enter_advance_AccountId_Field(String accId) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(adv_AccountId, accId);
		return ElementUtil.isElementDisplayed(adv_AccountId);
	}

	// advance_name field
	public boolean enter_advance_name_Field(String name) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(adv_name, name);
		return ElementUtil.isElementDisplayed(adv_name);
	}

	// advance_role field
	public boolean enter_advance_role_Field(String role) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(adv_role, role);
		return ElementUtil.isElementDisplayed(adv_role);
	}

	// Account_Status_Field field
	public boolean enter_advance_Account_Status_Field(String accStatus) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(adv_Account_Status, accStatus);
		return ElementUtil.isElementDisplayed(adv_Account_Status);
	}

	// advance_Country_Region field
	public boolean enter_advance_Country_Region_Field(String countryRegion) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(adv_Country_Region, countryRegion);
		return ElementUtil.isElementDisplayed(adv_Country_Region);
	}

	// advance_State field
	public boolean enter_advance_State_Field(String state) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(adv_State, state);
		return ElementUtil.isElementDisplayed(adv_State);
	}

	// advance_City field
	public boolean enter_advance_City_Field(String city) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(adv_City, city);
		return ElementUtil.isElementDisplayed(adv_City);
	}

	// Account_Owner field
	public boolean enter_advance_account_Owner_Field(String city) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appPage.typeWithEnt(adv_Account_Owner, city);
		return ElementUtil.isElementDisplayed(adv_Account_Owner);
	}

	/*************************************************************************************************************/


	// navigate to Account page
	public void navigateTo_AccountPage() {
		appPage.clickTab_underCategory("Customers", "Accounts");
	}

	// Select the single Account from the list
	public void select_Account_from_the_List() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		DriverFactory.getDriver().findElements(selectAccount).get(0).click();

	}

	// Navigate to INSTITUTION_INFO tab
	public boolean navigate_INSTITUTION_INFO__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(INSTITUTION_INFO);
		return ElementUtil.isElementDisplayed(INSTITUTION_INFO);
	}

	// Navigate to US_CANADA_APP_DATA tab
	public boolean navigate_US_CANADA_APP_DATA__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(US_CANADA_APP_DATA);
		return ElementUtil.isElementDisplayed(US_CANADA_APP_DATA);
	}

	// Navigate to CAMPUS tab
	public boolean navigate_CAMPUS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(CAMPUS);
		return ElementUtil.isElementDisplayed(CAMPUS);
	}

	// Navigate to WEB_LINKS tab
	public boolean navigate_WEB_LINKS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(WEB_LINKS);
		return ElementUtil.isElementDisplayed(WEB_LINKS);
	}

	// Navigate to CONTACTS tab
	public boolean navigate_CONTACTS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(CONTACTS);
		return ElementUtil.isElementDisplayed(CONTACTS);
	}

	// Navigate to Account Team tab
	public boolean navigate_Account_Team__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(accountTeam);
		return ElementUtil.isElementDisplayed(accountTeam);
	}

	// Navigate to HIERARCHY tab
	public boolean navigate_HIERARCHY__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(HIERARCHY);
		return ElementUtil.isElementDisplayed(HIERARCHY);
	}

	// Navigate to RELATIONSHIPS tab
	public boolean navigate_RELATIONSHIPS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(RELATIONSHIPS);
		return ElementUtil.isElementDisplayed(RELATIONSHIPS);
	}

	// Navigate to Addresses tab
	public boolean navigate_Addresses__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(addressesTab);
		return ElementUtil.isElementDisplayed(addressesTab);
	}

	// Navigate to salesData tab
	public boolean navigate_salesData__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(salesDataTab);
		return ElementUtil.isElementDisplayed(salesDataTab);
	}

	// Navigate to DOCUMENTS tab
	public boolean navigate_DOCUMENTS__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		
		ElementUtil.click(DOCUMENTS);
		return ElementUtil.isElementDisplayed(DOCUMENTS);
	}

	// Navigate to NOTES tab
	public boolean navigate_NOTES__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		ElementUtil.scrollToElement(NOTES);
		ElementUtil.click(NOTES);
		return ElementUtil.isElementDisplayed(NOTES);
	}

	// Navigate to CHANGES tab
	public boolean navigate_CHANGES__TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(CHANGES);
		ElementUtil.click(CHANGES);
		return ElementUtil.isElementDisplayed(CHANGES);
	}

	// Navigate to Help tab
	public boolean naviagte_Help_TAB() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		// Scroll Down using Robot class
		ElementUtil.scrollToElement(helpTab);
		ElementUtil.click(helpTab);
		return ElementUtil.isElementDisplayed(helpTab);
	}

	/** Tabs in Account List view Page **/

	// Navigate to accountId tab
	public boolean navigate_accountIdTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(accountIdTab);
		ElementUtil.click(accountIdTab);
		return ElementUtil.isElementDisplayed(accountIdTab);
	}

	// Navigate to ExternalId tab
	public boolean navigate_ExternalIdTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(ExternalIdTab);
		ElementUtil.click(ExternalIdTab);
		return ElementUtil.isElementDisplayed(ExternalIdTab);
	}

	// Navigate to Name tab
	public boolean navigate_NameTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(NameTab);
		ElementUtil.click(NameTab);
		return ElementUtil.isElementDisplayed(NameTab);
	}

	// Navigate to Role tab
	public boolean navigate_RoleTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(RoleTab);
		ElementUtil.click(RoleTab);
		return ElementUtil.isElementDisplayed(RoleTab);
	}

	// Navigate to AccountOwner tab
	public boolean navigate_AccountOwnerTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(AccountOwnerTab);
		ElementUtil.click(AccountOwnerTab);
		return ElementUtil.isElementDisplayed(AccountOwnerTab);
	}

	// Navigate to AccountStatus tab
	public boolean navigate_AccountStatusTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(AccountStatusTab);
		ElementUtil.click(AccountStatusTab);
		return ElementUtil.isElementDisplayed(AccountStatusTab);
	}

	// Navigate to country_region tab
	public boolean navigate_country_regionTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(country_region);
		ElementUtil.click(country_region);
		return ElementUtil.isElementDisplayed(country_region);
	}

	// Navigate to state tab
	public boolean navigate_StateTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(state);
		ElementUtil.click(state);
		return ElementUtil.isElementDisplayed(state);
	}

	// Navigate to city tab
	public boolean navigate_CityTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(city);
		ElementUtil.click(city);
		return ElementUtil.isElementDisplayed(city);
	}

	// Navigate to changedOn tab
	public boolean navigate_changedOnTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(changedOn);
		ElementUtil.click(changedOn);
		return ElementUtil.isElementDisplayed(changedOn);
	}

	// Navigate to changeBy tab
	public boolean navigate_changeByTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(changeBy);
		ElementUtil.click(changeBy);
		return ElementUtil.isElementDisplayed(changeBy);
	}

	// Navigate to createdOn tab
	public boolean navigate_CreatedOnTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(createdOn);
		ElementUtil.click(createdOn);
		return ElementUtil.isElementDisplayed(createdOn);
	}

	// Navigate to collectionNowStatus tab
	public boolean navigate_CollectionNowStatusTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(collectionNowStatus);
		ElementUtil.click(collectionNowStatus);
		return ElementUtil.isElementDisplayed(collectionNowStatus);
	}

	// Navigate to DestinationCountry tab
	public boolean navigate_DestinationCountryTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(DestinationCountry);
		ElementUtil.click(DestinationCountry);
		return ElementUtil.isElementDisplayed(DestinationCountry);
	}

	// Navigate to ClientSector tab
	public boolean navigate_ClientSectorTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(ClientSector);
		ElementUtil.click(ClientSector);
		return ElementUtil.isElementDisplayed(ClientSector);
	}

	// Navigate to IDPClient tab
	public boolean navigate_IDPClientTab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.scrollToElement(IDPClient);
		ElementUtil.click(IDPClient);
		return ElementUtil.isElementDisplayed(IDPClient);
	}
}
