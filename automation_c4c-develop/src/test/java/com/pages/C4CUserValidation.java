package com.pages;

import java.text.ParseException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

public class C4CUserValidation { 
	
	
	public static By UserNameBlock = By.xpath(".//*[@id='USERNAME_BLOCK']");
    public static By UserId = By.xpath(".//*[@id='USERNAME_FIELD-inner']");
    public static By Pwd = By.xpath(".//*[@id='PASSWORD_FIELD-inner']");
    public static By SignIn = By.xpath(".//*[@id='LOGIN_LINK_CONTENT']");
    public static By Customer = By.xpath(".//*[@class='sapMPanelWrappingDiv']");
    public static By IndividualCustomers = By.xpath(".//*[contains(text(),'Individual Customers')]");

    public static By Search = By.xpath("//*[@title='Search']");
    public static By EnterSearch = By.xpath(".//*[@type='search']");
    public static By ClickSearch = By.xpath(".//*[@class='sapMBarChild sapMBtn sapMBtnBase']");
    public static By SubmitSearch = By.xpath(".//*[@title='Search']//following-sibling::div//following-sibling::div");
    public static By ClickOnUser = By.xpath(".//*[@class='sapMLnk sapMLnkMaxWidth']");
    public static By noMatchFound = By.id("__list2-nodata-text");
    
    public static By C4CDropdownlistSel = By.xpath(".//*[@class='sapUiUfdShellOvrlySearch']//following-sibling::li");

    public static By MoreBtn = By.xpath(".//*[contains(@id,'moreLessButton-BDI-content')]");
    public static By LessBtn = By.xpath(".//*[@class='sapMBtn sapMBtnBase sapMObjectHeaderToggleButtonClass sapMObjectHeaderExpandableButtonExpanded']");
    public static By LeadsMenu = By.xpath("//*[@id=\"navigationitemYCdZuOaf3KARrUJtyU49cm_7-text\"]");
    public static By QualificationMenu = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'QUALIFICATION')]");
    public static By OnlineMenu = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'ONLINE')]");
    
    public static By TicketMenu = By.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'TICKETS')]");
    public static By studentEssentialsMenu = By.xpath("//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'STUDENT ESSENTIAL')]");
    
    public static By TextOfEmail = By.xpath(".//*[@title='Primary E-Mail']//following-sibling::div//descendant::a");
    public static By FirtAndLastName = By.xpath(".//*[@title='Name']//following-sibling::div//descendant::span");
    public static By Mobile = By.xpath(".//*[@title='Mobile']//following-sibling::div//descendant::span");
    public static By MobileLead = By.xpath(".//*[@title='Mobile']//following-sibling::div//descendant::a");
    public static By StudentId = By.xpath(".//*[@title='Student ID']//following-sibling::div//descendant::span");
    public static By Nationality = By.xpath(".//*[@title='Nationality']//following-sibling::div//descendant::span");
    
    
    public static By showCommunicationDetails = By.id("__icon69");
    public static By togShowCommunicationDetails = By.id("checkbox9e871de9a55e44a5a8ca7225a015f583_376-switch");
    public static By emailCommunicationDetails = By.id("link15d2f160ed3b45f481456c80b43ae2e6_298-link");
    
    
    

    public static By SiteId = By.xpath(".//*[@title='Site ID']//following-sibling::div//descendant::span");
    public static By MktAcpt = By.xpath(".//*[@title='Marketing Acceptance']//following-sibling::div//descendant::span");
    public static By HowDidHear = By.xpath(".//*[@title='How did you Hear?']//following-sibling::div//descendant::span");
    public static By WalkInEl = By.xpath(".//*[@title='Walk-In']//following-sibling::div//descendant::span");
    public static By ClickLeads = By.xpath("//*[@data-sap-automation-id='uwtnY30of4U5by6QZm5IRG']");
    public static By productSESC4C = By.xpath("//*[@data-sap-automation-id='xHfT66_o4a29JqYzz7VFxG']");
    public static By offerInPrinciple = By.id("navigationitem485e4d71c3e4607c978e8cc43b736360_6-text");
    public static By LeadFirtAndLastName = By.xpath(".//*[@title='Lead Name']//following-sibling::div//descendant::span");

    public static By LeadIdpOrg = By.xpath(".//*[@title='IDP Organisation']//following-sibling::div//descendant::span");
    public static By LeadIdpOff = By
            .xpath(".//*[@title='IDP Nearest Office']//following-sibling::div//descendant::span");
    public static By LeadIdpTeam = By.xpath(".//*[@title='IDP Team']//following-sibling::div//descendant::span");
    public static By LeadCountry = By.xpath(".//*[@title='CountryRegion']//following-sibling::div//descendant::span");
    public static By LeadEmail = By.xpath(".//*[@title='E-Mail']//following-sibling::div//descendant::a");
    public static By LeadCategory = By.xpath(".//*[@title='Category']//following-sibling::div//descendant::span");

    public static By LeadSource = By.xpath(".//*[@title='Source']//following-sibling::div//descendant::span");
    public static By LeadStatus = By.xpath(".//*[@title='Status']//following-sibling::div//descendant::span");
    public static By QualStudyIn = By.xpath(".//*[@title='I Would Like to Study In']//following-sibling::div//descendant::span");
    
    public static By QualStudyLevel = By.xpath(".//*[@title='My Preferred Study Level Is']//following-sibling::div//descendant::span");
    public static By QualPrefLang = By.xpath(".//*[@title='Preferred Language']//following-sibling::div//descendant::span");
    public static By QualLevel = By.xpath(".//*[@title='Qualification']//following-sibling::div//descendant::span");
 
    public static By QualFormType = By.xpath(".//*[@title='Form Type']//following-sibling::div//descendant::span");
    public static By OnlineSiteID = By.xpath(".//*[@title='Source Site ID']//following-sibling::div//descendant::span");
    public static By OnlineYouHear = By.xpath(".//*[@title='How did you hear ?']//following-sibling::div//descendant::span");
    public static By OnlineIdpNearOff = By.xpath(".//*[@title='IDP Nearest Office']//following-sibling::div//descendant::span");
    public static By CourseName = By.xpath(".//*[@title='Course Name']//following-sibling::div//descendant::span");
    public static By IntitutionName = By.xpath(".//*[@title='Institution Info']//following-sibling::div//descendant::span");

    public static By OnlineRefUrl = By.xpath("//*[@title='Referring URL']//following-sibling::div//descendant::a");
    public static By OnlineFirstLead = By.xpath(".//*[@title='FirstLead?']//following-sibling::div//descendant::span");
    public static By TicketClick = By.xpath(".//*[@class='sapMListTblCell sapMSize-small']//div//a");
    public static By TicketArrowClick = By.xpath(".//*[@class='sapMITBArrowScroll sapMITBArrowScrollRightInLine sapMITBArrowScrollRightTextOnly sapUiIcon sapUiIconMirrorInRTL']");
    public static By TicketTeam = By.xpath(".//*[@title='Team']//following-sibling::div//descendant::span");
    public static By TicketCountry = By.xpath(".//*[@title='Passport Issuing Country']//following-sibling::div//descendant::span");

    public static By TicketIntType = By.xpath(".//*[@title='Interaction Type']//following-sibling::div//descendant::span");
    public static By TicketFvisit = By.xpath(".//*[@title='First Visit']//following-sibling::div//descendant::span");
    public static By TicketIntIn = By.xpath(".//*[@title='I am interested in']//following-sibling::div//descendant::span");
    public static By TicketStatus = By.xpath(".//*[@title='Status']//following-sibling::div//descendant::span");
    public static By TicketEmail = By.xpath(".//*[@title='E-Mail']//following-sibling::div//descendant::a");
    public static By Leadempty = By.xpath(".//*[@class='sapMListTblCell sapMListTblCellNoData']");

    public static By Studydate = By.xpath(".//*[@title='Study Plan Date']//following-sibling::div//descendant::span");
    public static By Medium = By.xpath(".//*[@title='Medium']//following-sibling::div//descendant::span");
    public static By PaidOrganic = By.xpath(".//*[@title='Paid Organic']//following-sibling::div//descendant::span");
    public static By Channel = By.xpath(".//*[@title='Channel']//following-sibling::div//descendant::span");
    public static By Campaign = By.xpath(".//*[@title='Campaign']//following-sibling::div//descendant::span");
    public static By Advertiser = By.xpath(".//*[@title='Advertiser']//following-sibling::div//descendant::span");
    
    public static By Registeredonline = By.xpath(".//*[@title='Registered online']//following-sibling::div//descendant::span");
    public static By ContactMeBy = By.xpath(".//*[@title='Contact Me By']//following-sibling::div//descendant::span");
    public static By PrimaryFinancialSource = By.xpath(".//*[@title='ZKUT_ PrimFinSource']//following-sibling::div//descendant::span");
    public static By counsMode = By.xpath(".//*[@title='Counselling Mode']//following-sibling::div//descendant::span");
    public static By commDetails = By.xpath(".//*[@title='Show communication Details']//following-sibling::div//descendant::span");
    public static By commDetailsYes = By.xpath(".//*[@title='Show communication Details']//following-sibling::div//descendant::span[contains(text(),'No')]");
    
    public static By CloseStud = By.xpath(".//*[@title='Close']//span//span");
    public static By ClearSearch = By.xpath(".//*[contains(text(),'Clear')]");
    public static By ResetSearch = By.xpath(".//*[@title='Reset']");
    public static By LeadId = By.xpath(".//*[@title='Lead ID']//following-sibling::div//descendant::span");
    public static By EmailInSr = By.xpath(".//*[contains(text(),'E-Mail')]//parent::span//parent::div[@class='sapUiVltCell sapuiVltCell']//parent::div[@class='sapUiVlt sapuiVlt']//div[2]//span");

    public static By iframeTwo = By.xpath("//iframe[contains(@id,'frame')]");
    public static By studyModeOIP = By.xpath("//span[text()='Study mode']/following-sibling::span[contains(@class,'lst_val')]");
    public static By studyStatusOIP = By.xpath("//span[text()='Study status']/following-sibling::span[contains(@class,'lst_val')]");
    public static By finalGradeAchievedOIP = By.xpath("//span[text()='Final grade achieved']/following-sibling::span[contains(@class,'lst_val')]");
    public static By studyCountryOIP = By.xpath("//span[text()='Study country']/following-sibling::span[contains(@class,'lst_val')]");
    public static By durationOIP = By.xpath("//span[text()='Duration years']/following-sibling::span[contains(@class,'lst_val')]");
    public static By studyLanguage = By.xpath("//span[text()='Study language']/following-sibling::span[contains(@class,'lst_val')]");
   
    public static By honoursDegree = By.xpath("//span[text()='Is honours degree']/following-sibling::span[contains(@class,'lst_val')]");
    public static By creditTransferOIP = By.xpath("//span[text()='Requested credit transfer']/following-sibling::span[contains(@class,'lst_val')]");
    public static By failUnitsOIP = By.xpath("//span[text()='Number of backlogs or retakes']/following-sibling::span[contains(@class,'lst_val')]");
    public static By qualificationTitleOIP = By.xpath("//span[text()='Qualification title']/following-sibling::span[contains(@class,'lst_val')]");
    public static By institutionNameOIP = By.xpath("//span[text()='Institution name']/following-sibling::span[contains(@class,'lst_val')]");
    public static By academicShowMoreOIP = By.xpath("//*[contains(@class,'oip_info container')]/descendant::app-qualification-detail//div[2]//div[2]/span");
    public static By englishTestTypeOIP = By.xpath("//span[text()='English test type']/following-sibling::span[contains(@class,'lst_val')]");
    
    public static By testStatusOIP = By.xpath("//span[text()='Test status']/following-sibling::span[contains(@class,'lst_val')]");
    public static By englishLanguageShowMoreOIP = By.xpath("//*[contains(@class,'oip_info container')]/descendant::app-qualification-detail//div[3]/div/span[1]");
    public static By overallScoreOIP = By.xpath("//span[text()='Overall score']/following-sibling::span[contains(@class,'lst_val')]");
    public static By readingScoreOIP = By.xpath("//span[text()='Reading score']/following-sibling::span[contains(@class,'lst_val')]");
    public static By writingScoreOIP = By.xpath("//span[text()='Writing score']/following-sibling::span[contains(@class,'lst_val')]");
    public static By speakingScoreOIP = By.xpath("//span[text()='Speaking score']/following-sibling::span[contains(@class,'lst_val')]");
    public static By listeningScoreOIP = By.xpath("//span[text()='Listening score']/following-sibling::span[contains(@class,'lst_val')]");
    
    public static By useOfEnglishScoreOIP = By.xpath("//span[text()='Use of english score']/following-sibling::span[contains(@class,'lst_val')]");
    public static By admissionTestTypeOIP = By.xpath("//span[text()='Admission test type']/following-sibling::span[contains(@class,'lst_val')]");
    public static By testStatusAdmissionTestOIP = By.xpath("//span[text()='Test status'][2]/following-sibling::span[contains(@class,'lst_val')]");
    public static By admissionTestShowMoreOIP = By.xpath("//*[contains(@class,'oip_info container')]/descendant::app-qualification-detail//div[4]/div/span[1]");
    public static By overallScoreAdmTypeOIP = By.xpath("//span[text()='Overall score']/following-sibling::span[contains(@class,'lst_val')]");
    public static By verbalEnglishScoreOIP = By.xpath("//span[text()='Verbal english score']/following-sibling::span[contains(@class,'lst_val')]");
    
    public static By quantitativeMathScoreOIP = By.xpath("//span[text()='Quantitative math score']/following-sibling::span[contains(@class,'lst_val')]");
    public static By integratedReasoningScoreOIP = By.xpath("//span[text()='Integrated reasoning score']/following-sibling::span[contains(@class,'lst_val')]");
    public static By analyticalWritingAssessScoreOIP = By.xpath("//span[text()='Analytical writing assessment score']/following-sibling::span[contains(@class,'lst_val')]");
    public static By oipReferenceIDInTableOIP = By.xpath("//*[@id='cdk-accordion-child-1']//preceding::div/drag-scroll//table/tbody/tr/td[1]");
    public static By institutionInTableOIP = By.xpath("//*[@id='cdk-accordion-child-1']//preceding::div/drag-scroll//table/tbody/tr/td[2]");
    public static By courseInTableOIP = By.xpath("//*[@id='cdk-accordion-child-1']//preceding::div/drag-scroll//table/tbody/tr/td[3]");
    
    public static String getStudentID;
    public Boolean checkLeadAvailable; 
    public static String leadIdOne;
    public static String getReferringURL;
    public static String avalOnlineYouHear;
    public static String avalLSrc;
    public static String avalQualLevel;
    
    /**
     * This method is used to login C4C application
     */
    public void loginC4C() {
        try {
//        	ConfigReader config = new ConfigReader();
//        	Properties prop = config.read_properties();
//        	String environCon = prop.getProperty("environment").toLowerCase();
//        
            ElementUtil.click(SignIn);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is used to search the user in the C4C application
     * @param RegEmail
     * @throws InterruptedException 
     */
    public void searchUserC4C(String TestDataId, String RegEmail) throws InterruptedException {
        try {
        	
        	ElementUtil.waitForCertainTime(30000);
            ElementUtil.click(Search);
            ElementUtil.click(EnterSearch);
            Thread.sleep(15000);
            ElementUtil.type(EnterSearch, RegEmail);
            Thread.sleep(10000);
            ElementUtil.click(SubmitSearch);
            Boolean noMatchFoundB = ElementUtil.isElementDisplayed(noMatchFound, 10, "Email in C4C");
            if(noMatchFoundB==true) {
            	Assert.fail("Email not found in C4C");
            }else {
            	 ElementUtil.waitForElementToBeClickable(ClickOnUser,40);    
            	 Assert.assertTrue("Email Found in C4C", true);
            }   
            ElementUtil.printToReportMessage("Email Search Result");          
			Thread.sleep(8000);
			ElementUtil.click(ClickOnUser);
			ElementUtil.waitForElementToBeClickable(MoreBtn,40);
			Thread.sleep(10000);
		    ElementUtil.click(MoreBtn);
			Thread.sleep(10000);
			ElementUtil.printToReportMessage("Clicked More Button");
			getStudentID = ElementUtil.getText(StudentId);
			ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\"> "+ "Student ID ---------------- " + getStudentID  + "</b>");

        }catch (UnhandledAlertException f) {
		    try {
		        Alert alert = DriverFactory.getDriver().switchTo().alert();
		        String alertText = alert.getText();
		        System.out.println("Alert data: " + alertText);
		        alert.accept();
		    } catch (NoAlertPresentException e) {
		        e.printStackTrace();
		    }
	}
    }
    
    /**
     * This method is used to verify the first and last name in C4C
     * @param firstName
     * @param lastName
     */
    public void checkFirstNameAndLastNameInC4C(String firstName, String lastName) {
    	try {
    		System.out.println("firstName lastName" +  firstName + lastName);
    		String avalFtName = ElementUtil.getText(FirtAndLastName).toLowerCase();
    		String fN = firstName.toLowerCase();
    		String lN = lastName.toLowerCase();
			if (avalFtName.contains(fN)) {
				ElementUtil.printToReportMessage("First Name verify Expected Value : " + firstName);
				ElementUtil.printToReportMessage("First Name verify Actual Value : " + firstName);
				ElementUtil.highlightElement(FirtAndLastName);
				ElementUtil.printToReportPass("Verify the name field in C4C matches with the First name provided in enquiry form");
				} else {
					ElementUtil.printToReportMessage("First Name verify Expected Value : " + firstName);
					ElementUtil.printToReportMessage("First Name verify Actual Value : " + firstName);
					ElementUtil.highlightElement(FirtAndLastName);
					ElementUtil.printToReportFAIL("Verify the name field in C4C matches with the First name provided in enquiry form");
				}
			String avalLtName = ElementUtil.getText(FirtAndLastName).toLowerCase();
			if (avalLtName.contains(lN)) {
				ElementUtil.printToReportMessage("Last Name verify Expected Value : " + lastName);
				ElementUtil.printToReportMessage("Last Name verify Actual Value : " + lastName);
				ElementUtil.highlightElement(FirtAndLastName);
				ElementUtil.printToReportPass("Verify the name field in C4C matches with the Last name provided in enquiry form");
				} else {
					ElementUtil.printToReportMessage("Last Name verify Expected Value : " + lastName);
					ElementUtil.printToReportMessage("Last Name verify Actual Value : " + lastName);
					ElementUtil.highlightElement(FirtAndLastName);
					ElementUtil.printToReportFAIL("Verify the name field in C4C matches with the First name provided in enquiry form");
				}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    /**
     * This method is used to verify the site ID in C4C
     * @param expCountry
     */
	public void checkSiteInC4CCanda(String getCountry) {
		try {
			
			System.out.println("getCountry : " + getCountry);
            String expCountry = getCountry.toLowerCase();
			String avalcnty = ElementUtil.getText(SiteId);
			if (avalcnty.equalsIgnoreCase(expCountry)) {
				ElementUtil.printToReportMessage("Site Id verify Expected Value : " + expCountry);
				ElementUtil.printToReportMessage("Site Id verify Actual Value : " + avalcnty);
				ElementUtil.highlightElement(SiteId);
				ElementUtil.printToReportPass("Verify the Site id in C4C matches with expected result");
				} else {
					ElementUtil.printToReportMessage("Site Id verify Expected Value : " + expCountry);
					ElementUtil.printToReportMessage("Site Id verify Actual Value : " + avalcnty);
					ElementUtil.highlightElement(SiteId);
					ElementUtil.printToReportFAIL("Verify the Site id in C4C matches with expected result");
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
    /**
     * This method is used to verify the site ID in C4C
     * @param expCountry
     */
	public void checkSiteInC4C() {
		try {
			ConfigReader config = new ConfigReader();
//        	Properties prop = config.read_properties();
//            String expCountry = prop.getProperty("country").toLowerCase();
			String avalcnty = ElementUtil.getText(SiteId);
//			if (avalcnty.equalsIgnoreCase(expCountry)) {
//				ElementUtil.printToReportMessage("Site Id verify Expected Value : " + expCountry);
//				ElementUtil.printToReportMessage("Site Id verify Actual Value : " + avalcnty);
//				ElementUtil.highlightElement(SiteId);
//				ElementUtil.printToReportPass("Verify the Site id in C4C matches with expected result");
//				} else {
//					ElementUtil.printToReportMessage("Site Id verify Expected Value : " + expCountry);
//					ElementUtil.printToReportMessage("Site Id verify Actual Value : " + avalcnty);
//					ElementUtil.highlightElement(SiteId);
//					ElementUtil.printToReportFAIL("Verify the Site id in C4C matches with expected result");
//					}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify the marketing acceptance value in C4C
	 * @param MktingAccpt
	 */
	public void checkMarketingAcceptanceInC4C(String MktingAccpt) {
		try {
			String avalMktAcpt = ElementUtil.getText(MktAcpt);
			String evalMktAcpt = MktingAccpt.toLowerCase();
			if (avalMktAcpt.equalsIgnoreCase(evalMktAcpt)) {
				ElementUtil.printToReportMessage("Marketing Acceptance verify Expected Value : " + evalMktAcpt);
				ElementUtil.printToReportMessage("Marketing Acceptance verify Actual Value : " + avalMktAcpt);
				ElementUtil.highlightElement(MktAcpt);
				ElementUtil.printToReportPass("Verify the Marketing Acceptance in C4C matches with expected result");
				} else {
					ElementUtil.printToReportMessage("Marketing Acceptance verify Expected Value : " + evalMktAcpt);
					ElementUtil.printToReportMessage("Marketing Acceptance verify Actual Value : " + avalMktAcpt);
					ElementUtil.highlightElement(MktAcpt);
					ElementUtil.printToReportFAIL("Verify the Marketing Acceptance in C4C matches with expected result");
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify the registered online in C4C
	 * @param eregOnline
	 */
	public void checkRegisteredOnlineInC4C(String eregOnline) {
		try {
			String regonline = ElementUtil.getText(Registeredonline);
			String aregonline = regonline.toLowerCase();
		//	String eregonline = "no";
			ElementUtil.mouseMove(Registeredonline);
			if (aregonline.equalsIgnoreCase(eregOnline)) {
				ElementUtil.printToReportMessage("Marketing Acceptance verify Expected Value : " + eregOnline);
				ElementUtil.printToReportMessage("Marketing Acceptance verify Actual Value : " + aregonline);
				ElementUtil.highlightElement(Registeredonline);
				ElementUtil.printToReportPass("Verify the Registred Online in C4C matches with expected result");
				} else {
					ElementUtil.printToReportMessage("Registred online verify Expected Value : " + eregOnline);
					ElementUtil.printToReportMessage("Registred online verify Actual Value : " + aregonline);
					ElementUtil.highlightElement(Registeredonline);
					ElementUtil.printToReportFAIL("Verify the Registred Online in C4C matches with expected result");}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check contact me field in C4C
	 * @param phoneEmail
	 */
	public void checkContactMeInC4C(String phoneEmail) {
		try {
			String ContactMeby = ElementUtil.getText(ContactMeBy);
			String aContactMeBy = ContactMeby.toLowerCase();
		//	String eContactMeBy = "Phone,Email";
			String eContactMeByval = phoneEmail.toLowerCase();
			ElementUtil.mouseMove(ContactMeBy);
			if (aContactMeBy.equalsIgnoreCase(eContactMeByval)) {
				ElementUtil.printToReportMessage("ContactMeBy verify Expected Value : " + eContactMeByval);
				ElementUtil.printToReportMessage("ContactMeBy verify Actual Value : " + aContactMeBy);
				ElementUtil.highlightElement(ContactMeBy);
				ElementUtil.printToReportPass("Verify the ContactMeBy in C4C matches with expected result");
				} else {
				ExtentCucumberAdapter.addTestStepLog("ContactMeBy verify Expected Value : " + eContactMeByval);
				ExtentCucumberAdapter.addTestStepLog("ContactMeBy verify Actual Value : " + aContactMeBy);	
				ElementUtil.highlightElement(ContactMeBy);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + "Verify the Walk-In in C4C matches with expected result");	
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify the preferred counselling mode in C4C
	 * @param TestDataId
	 * @param prefCounsellingMode
	 */
	public void checkPrefCounsellingModeInC4C(String TestDataId, String prefCounsellingMode) {
		try {
				String evalCounMod1 = prefCounsellingMode.toLowerCase();
				System.out.println("evalCounMod1 : " + evalCounMod1);
				String counModTex1 = ElementUtil.getText(counsMode).toLowerCase();
				ElementUtil.mouseMove(counsMode);
				if (counModTex1.contains(evalCounMod1)) {
					ExtentCucumberAdapter.addTestStepLog("Counselling Mode verify Expected Value : " + evalCounMod1);
					ExtentCucumberAdapter.addTestStepLog("Counselling Mode verify Actual Value : " + counModTex1);
					ElementUtil.highlightElement(counsMode);
					ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Verify the Counselling Mode in C4C matches with expected result");
				} else {
					ExtentCucumberAdapter.addTestStepLog("Counselling Mode verify Expected Value : " + evalCounMod1);
					ExtentCucumberAdapter.addTestStepLog("Counselling Mode verify Actual Value : " + counModTex1);	
					ElementUtil.highlightElement(counsMode);
					ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the Counselling Mode in C4C matches with expected result");	
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void clickLeadMenuInC4C() {
		try {
			String ICiD = ElementUtil.getText(StudentId);
			if (ICiD.startsWith("20")) {
				ExtentCucumberAdapter.addTestStepLog("Non IDP country student id Verify Expected Value : " + ICiD);
				ExtentCucumberAdapter.addTestStepLog("Non IDP country student id Verify Actual Value : " + ICiD);
				ElementUtil.highlightElement(StudentId);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Verify the Student ID in C4C matches with expected result");
			}else if(ICiD.startsWith("50")){
				ExtentCucumberAdapter.addTestStepLog("IDP country student id Verify Expected Value : " + ICiD);
				ExtentCucumberAdapter.addTestStepLog("IDP country student id Verify Actual Value : " + ICiD);	
				ElementUtil.highlightElement(StudentId);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Verify the Student ID in C4C matches with expected result");	
			}
			if (ICiD.startsWith("10")) {
				System.out.println("Going to inside the if block and Checked Non idp user is true");
				String emptylead = ElementUtil.getText(Leadempty);
				System.out.println("lead empty sys out" + emptylead);
				if (emptylead.equals("no data")) {
					System.out.println("Lead empty condition is passed");
					ExtentCucumberAdapter.addTestStepLog("Non IDP country Lead Verify Expected Value : " + emptylead);
					ExtentCucumberAdapter.addTestStepLog("Non IDP country Lead Verify Actual Value :: " + emptylead);
					ElementUtil.highlightElement(Leadempty);
					ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Verify the Non idp user lead not created with expected result");
				}
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Lead not Generated on Non IDP Registration :");	
				System.out.println("Non IDP user flow going to end");
			} else {
				Thread.sleep(5000);
				ElementUtil.waitForElementVisible(ClickLeads);
				Thread.sleep(5000);
				ExtentCucumberAdapter.addTestStepLog("IDP Register User Verify :- Lead Level Verification in C4C - " + " TestDataId " 
						+ "						scope:  entry: Comparing submited Value in Lead Level and C4c Logged Value Exit: C4C Lead Level Validation Successfully");					
				Boolean isPresent = ElementUtil.isElementDisplayed(ClickLeads,20, "Leads in C4C");
				if (isPresent == true) {
					clickLeadsTab();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify values in Leads Menu - OVerview
	 * @param TestDataId
	 * @param regFirstName
	 * @param regLastName
	 * @param expLeadCategory
	 * @param expLeadSource
	 * @param expLeadStatus
	 */
	public void verifyLeadsMenuValuesC4C(String TestDataId,String FirstName, String LastName,String expLeadCategory,String expLeadSource, String expLeadStatus) {
		try {
			if(checkLeadAvailable) {
				leadCheckFirstAndLastNameInC4C(FirstName, LastName, TestDataId);
				leacCategoryCheckInC4C(expLeadCategory);
				leadSourceCheckInC4C(expLeadSource);
				checkQualificationMenuInC4C(expLeadStatus);
				ElementUtil.printToReportPass("LEAD GENERATED - LEAD OVERVIEW VALUES ARE VERIFIED");	
			}else {
				ElementUtil.printToReportFAIL("LEAD NOT GENERATED");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to  verify qualification level values in Leads menu
	 * @param TestDataId
	 * @param pfStudyAbCnty
	 * @param WhenToStudy
	 * @param expPrefLang
	 */
	public void verifyQualificationLeadsValuesC4C(String TestDataId,String pfStudyAbCnty, String WhenToStudy, String expQualLevel, String type) {
		try {
			if(checkLeadAvailable) {
				clickQualificationMenu();
				preferredStudyDestinationInC4C(TestDataId, pfStudyAbCnty);
				if(type.equalsIgnoreCase("SES")) {
					System.out.println("Study Plan Date not display in SES Products");
				}else {
					checkStudyPlanDateInC4C(WhenToStudy);
				}
				checkQualificationLevelInC4C(expQualLevel);
				ElementUtil.printToReportPass("LEAD GENERATED - LEAD QUALIFICATION LEVEL VALUES ARE VERIFIED");
			}else{
				ElementUtil.printToReportFAIL("LEAD NOT GENERATED");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify  online lead  values in C4C
	 * @param onlinesitIds
	 * @param onlineYouHear
	 * @param onlineFirstLead
	 * @param prefModCoun
	 */
	public void verifyOnlineLeadsValuesInC4C(String onlineYouHear, String onlineFirstLead, String prefModCoun, String getSiteIDCountry) {
		try {
//			ConfigReader config = new ConfigReader();
//        	Properties prop = config.read_properties();
//            String getCountry = prop.getProperty("country").toLowerCase();
//            System.out.println("getCountry : " + getCountry);
//			if(checkLeadAvailable) {
//				clickOnlineMenu();
//				if(getCountry.equalsIgnoreCase("canada")) {
//					System.out.println("getCountry : " + getCountry);
//					onlineSiteIDCheckInC4CForCanadaMigrationSES(getSiteIDCountry);
//				}else {
//					onlineSiteIDCheckInC4C();
//				}
//				howDidYouHearInC4C(onlineYouHear);
//				checkOnlineFirstLeadInC4C(onlineFirstLead);
//				referringURLC4CValidation();
//			//	checkCounsellingModeInC4C(prefModCoun);
//				ElementUtil.printToReportPass("LEAD GENERATED - LEAD ONLINE LEVEL VALUES ARE VERIFIED");
//			}else{
//				ElementUtil.printToReportFAIL("LEAD NOT GENERATED");
//			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void checkICIDInC4C(String TestDataId,String regFirstName, String regLastName, String expLeadCategory, String expLeadSource, String expLeadStatus,
		  String pfStudyAbCnty, String WhenToStudy, String expPrefLang, String onlinesitIds, String evalOnlineYouHear, String evalOnlineFtLd, String prefModCoun) {
		try {
			String ICiD = ElementUtil.getText(StudentId);
			if (ICiD.startsWith("20")) {
				ExtentCucumberAdapter.addTestStepLog("Non IDP country student id Verify Expected Value : " + ICiD);
				ExtentCucumberAdapter.addTestStepLog("Non IDP country student id Verify Actual Value : " + ICiD);
				ElementUtil.highlightElement(StudentId);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Verify the Student ID in C4C matches with expected result");
			}else if(ICiD.startsWith("50")){
				ExtentCucumberAdapter.addTestStepLog("IDP country student id Verify Expected Value : " + ICiD);
				ExtentCucumberAdapter.addTestStepLog("IDP country student id Verify Actual Value : " + ICiD);	
				ElementUtil.highlightElement(StudentId);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Verify the Student ID in C4C matches with expected result");	
			}
			if (ICiD.startsWith("10")) {
				System.out.println("Going to inside the if block and Checked Non idp user is true");
				String emptylead = ElementUtil.getText(Leadempty);
				System.out.println("lead empty sys out" + emptylead);
				if (emptylead.equals("no data")) {
					System.out.println("Lead empty condition is passed");
					ExtentCucumberAdapter.addTestStepLog("Non IDP country Lead Verify Expected Value : " + emptylead);
					ExtentCucumberAdapter.addTestStepLog("Non IDP country Lead Verify Actual Value :: " + emptylead);
					ElementUtil.highlightElement(Leadempty);
					ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Verify the Non idp user lead not created with expected result");
				}
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Lead not Generated on Non IDP Registration :");	
				System.out.println("Non IDP user flow going to end");
			} else {
				Thread.sleep(5000);
				ElementUtil.waitForElementVisible(ClickLeads);
				Thread.sleep(5000);
				ExtentCucumberAdapter.addTestStepLog("IDP Register User Verify :- Lead Level Verification in C4C - " + " TestDataId " 
						+ "						scope:  entry: Comparing submited Value in Lead Level and C4c Logged Value Exit: C4C Lead Level Validation Successfully");					
				Boolean isPresent = ElementUtil.isElementDisplayed(ClickLeads,20, "Leads in C4C");
				if (isPresent == true) {
					clickLeadsTab();
					leadCheckFirstAndLastNameInC4C(regFirstName, regLastName, TestDataId);
					leacCategoryCheckInC4C(expLeadCategory);
					leadSourceCheckInC4C(expLeadSource);
					checkQualificationMenuInC4C(expLeadStatus);
					
					
				}else {
					ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + "Lead not Generated on Registration");	
					ElementUtil.writeTcResult("EnqTcStatus", TestDataId, 2, "FAIL");
				}
			}
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to click particular lead in Leads Menu
	 */
	public void clickLeadsTab() {
		try {
			ElementUtil.waitForCertainTime(4000);
			checkLeadAvailable = ElementUtil.isElementDisplayed(ClickLeads, 10, "Leads in C4C");
			if(checkLeadAvailable) {
				ElementUtil.click(ClickLeads);
				ElementUtil.waitForElementVisible(MoreBtn);
				ElementUtil.click(MoreBtn);
			}else {
				Assert.fail();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to click leads menu
	 */
	public void checkLeadMenuInC4C() {
		try {
			ElementUtil.waitForCertainTime(2000);
			ElementUtil.click(LeadsMenu);
			ElementUtil.waitForCertainTime(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to check first name and last name in C4C Leads
	 * @param regFirstName
	 * @param regLastName
	 * @param TestDataId
	 */
	public void leadCheckFirstAndLastNameInC4C(String regFirstName, String regLastName, String TestDataId) {
		try {
			String fulltName = regFirstName + " " + regLastName;
			String evalLltName = fulltName.toLowerCase();
			String avalLltName = ElementUtil.getText(LeadFirtAndLastName);
			if (avalLltName.equalsIgnoreCase(evalLltName)) {
				ExtentCucumberAdapter.addTestStepLog("Lead Name verify Expected Value : " + evalLltName);
				ExtentCucumberAdapter.addTestStepLog("Lead Name verify Actual Value : " + avalLltName);
				ElementUtil.highlightElement(LeadFirtAndLastName);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + "  Verify the Lead Name in C4C matches with the First name and Last name provided in enquiry form");
			} else {
				ExtentCucumberAdapter.addTestStepLog("IDP country student id Verify Expected Value : " + evalLltName);
				ExtentCucumberAdapter.addTestStepLog("IDP country student id Verify Actual Value : " + avalLltName);	
				ElementUtil.highlightElement(LeadFirtAndLastName);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the Lead Name in C4C matches with the First name and Last name provided in enquiry form");
				}
			leadIdOne = ElementUtil.getText(LeadId);
			//ElementUtil.writeTcResult("WriteURL", TestDataId, 5, leadIdOne);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check leads category in C4C
	 * @param expLeadCategory
	 */
	public void leacCategoryCheckInC4C(String expLeadCategory) {
		try {
			String avalLCatgy = ElementUtil.getText(LeadCategory);
		//	String evalLCatgy = "course enquiry";
			ElementUtil.mouseMove(LeadCategory);
			if (avalLCatgy.equalsIgnoreCase(expLeadCategory)) {
				ExtentCucumberAdapter.addTestStepLog("Lead Name verify Expected Value : " + expLeadCategory);
				ExtentCucumberAdapter.addTestStepLog("Lead Name verify Actual Value : " + avalLCatgy);
				ElementUtil.highlightElement(LeadCategory);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + "   Verify the Lead Category field in C4C matches with the Email address provided in enquiry form");
			} else {
				ExtentCucumberAdapter.addTestStepLog("Lead Category verify Expected Value : " + expLeadCategory);
				ExtentCucumberAdapter.addTestStepLog("Lead Category verify Actual Value : " + avalLCatgy);	
				ElementUtil.highlightElement(LeadCategory);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the Lead Category field in C4C matches with the Email address provided in enquiry form");
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check lead source in C4C
	 * @param expLeadSource
	 */
	public void leadSourceCheckInC4C(String expLeadSource) {
		try {
			avalLSrc = ElementUtil.getText(LeadSource);
		//	String evalLSrc = "online enquiry";
			ElementUtil.mouseMove(LeadSource);
			if (avalLSrc.equalsIgnoreCase(expLeadSource)) {
				ExtentCucumberAdapter.addTestStepLog("Lead Source verify Expected Value : " + expLeadSource);
				ExtentCucumberAdapter.addTestStepLog("Lead Source verify Actual Value : " + avalLSrc);
				ElementUtil.highlightElement(LeadSource);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Verify the Lead Source field in C4C matches with the Email address provided in enquiry form");
			} else {
				ExtentCucumberAdapter.addTestStepLog("Lead Source verify Expected Value : " + expLeadSource);
				ExtentCucumberAdapter.addTestStepLog("Lead Source verify Actual Value : " + avalLSrc);	
				ElementUtil.highlightElement(LeadCategory);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the Lead Source field in C4C matches with the Email address provided in enquiry form");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check  qualification  menu
	 * @param expLeadStatus
	 */
	public void checkQualificationMenuInC4C(String expLeadStatus) {
		try {
			String avalLSts = ElementUtil.getText(LeadStatus);
		//	String evalLSts = "open";
			ElementUtil.mouseMove(LeadStatus);
			if (avalLSts.equalsIgnoreCase(expLeadStatus)) {
				ExtentCucumberAdapter.addTestStepLog("Lead Status verify Expected Value : " + expLeadStatus);
				ExtentCucumberAdapter.addTestStepLog("Lead Status verify Actual Value : " + avalLSts);
				ElementUtil.highlightElement(LeadStatus);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Verify the Lead Status field in C4C matches with the Email address provided in enquiry form");
			} else {
				ExtentCucumberAdapter.addTestStepLog("Lead Status verify Expected Value : " + expLeadStatus);
				ExtentCucumberAdapter.addTestStepLog("Lead Status verify Actual Value : " + avalLSts);	
				ElementUtil.highlightElement(LeadStatus);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the Lead Status field in C4C matches with the Email address provided in enquiry form");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to click qualification menu
	 */
	public void clickQualificationMenu() {
		try {
			System.out.println("checkLeadAvailable : " + checkLeadAvailable);
			if(checkLeadAvailable) {
				ElementUtil.click(QualificationMenu);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify I would like to Study In field in Qualification Menu
	 * @param TestDataId
	 * @param pfStudyAbCnty
	 */
	public void preferredStudyDestinationInC4C(String TestDataId, String pfStudyAbCnty) {
		try {
				String evalPrStCty = pfStudyAbCnty.toLowerCase();
				String avalPrStCty = ElementUtil.getText(QualStudyIn).toLowerCase();
				ElementUtil.mouseMove(QualStudyIn);
				if (avalPrStCty.equals(evalPrStCty)) {
					ExtentCucumberAdapter.addTestStepLog("Like to Study In verify Expected Value : " + evalPrStCty);
					ExtentCucumberAdapter.addTestStepLog("Like to Study In verify Actual Value : " + avalPrStCty);
					ElementUtil.highlightElement(QualStudyIn);
					ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b>" + " Verify the 'I Would Like to Study In' in C4C matches with the Your preferred study destination provided in enquiry form");
				} else {
					ExtentCucumberAdapter.addTestStepLog("Like to Study In verify Expected Value : " + evalPrStCty);
					ExtentCucumberAdapter.addTestStepLog("Like to Study In verify Actual Value : " + avalPrStCty);	
					ElementUtil.highlightElement(QualStudyIn);
					ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the 'I Would Like to Study In' in C4C matches with the Your preferred study destination provided in enquiry form");
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify study plan date in C4C online level
	 * @param WhenToStudy
	 * @throws ParseException
	 */
	public void checkStudyPlanDateInC4C(String WhenToStudy) throws ParseException {
		try {
//			String studydate = ExcelUtil.getIdpMapDatat("Code", WhenToStudy, 1);
//			String Estudydate = studydate.toLowerCase();
//			String Astudydate = ElementUtil.getText(Studydate);
//			ElementUtil.mouseMove(Studydate);
//			if (Astudydate.equals(Estudydate)) {
//				ExtentCucumberAdapter.addTestStepLog("Study plan date verify Expected Value : " + Estudydate);
//				ExtentCucumberAdapter.addTestStepLog("Study plan date verify Actual Value : " + Astudydate);
//				ElementUtil.highlightElement(Studydate);
//				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b> + Verify the 'Study plan date' in C4C matches with the Your Study plan date provided in the form");			
//			} else {
//				ExtentCucumberAdapter.addTestStepLog("Study plan date verify Expected Value : " + Estudydate);
//				ExtentCucumberAdapter.addTestStepLog("Study plan date verify Actual Value : " + Astudydate);	
//				ElementUtil.highlightElement(Studydate);
//				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b>  + Verify the 'Study plan date' in C4C matches with the Your Study plan date provided in the form");
//				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkQualificationLevelInC4C(String expQualLevel) {
		try {
		//	String evalQulQual = "unqualified";
			avalQualLevel = ElementUtil.getText(QualLevel);
			ElementUtil.mouseMove(QualLevel);
			if (avalQualLevel.equalsIgnoreCase(expQualLevel)) {
				ExtentCucumberAdapter.addTestStepLog("Qualification Level verify Expected Value : " + expQualLevel);
				ExtentCucumberAdapter.addTestStepLog("Qualification Level verify Actual Value : " + avalQualLevel);
				ElementUtil.highlightElement(QualLevel);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b> +  Verify the Qualification  in C4C matches with expected result");			
			} else {
				ExtentCucumberAdapter.addTestStepLog("Qualification Level verify Expected Value : " + expQualLevel);
				ExtentCucumberAdapter.addTestStepLog("Qualification Level verify Actual Value : " + avalQualLevel);	
				ElementUtil.highlightElement(QualLevel);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the Qualification  in C4C matches with expected result");
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void clickOnlineMenu() {
		try {
			ElementUtil.click(OnlineMenu);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onlineSiteIDCheckInC4C() {
		try {
//			ConfigReader config = new ConfigReader();
//        	Properties prop = config.read_properties();
//            String evalOnlineSiteID = prop.getProperty("country").toLowerCase();
//			String avalOnlineSiteID = ElementUtil.getText(OnlineSiteID);
//			ElementUtil.mouseMove(OnlineSiteID);
//			if (avalOnlineSiteID.equalsIgnoreCase(evalOnlineSiteID)) {
//				ExtentCucumberAdapter.addTestStepLog("Site ID verify Expected Value : " + evalOnlineSiteID);
//				ExtentCucumberAdapter.addTestStepLog("Site ID verify Actual Value : " + avalOnlineSiteID);
//				ElementUtil.highlightElement(OnlineSiteID);
//				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b> +  Verify the Source Site ID matches with expected result");						
//			} else {
//				ExtentCucumberAdapter.addTestStepLog("Site ID verify Expected Value : " + evalOnlineSiteID);
//				ExtentCucumberAdapter.addTestStepLog("Site ID verify Actual Value : " + avalOnlineSiteID);	
//				ElementUtil.highlightElement(OnlineSiteID);
//				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the Source Site ID matches with expected result");
//				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check the online site id for canada migration SES
	 * @param siteIDCountry
	 */
	public void onlineSiteIDCheckInC4CForCanadaMigrationSES(String siteIDCountry) {
		try {
            String evalOnlineSiteID = siteIDCountry.toLowerCase();
			String avalOnlineSiteID = ElementUtil.getText(OnlineSiteID).toLowerCase();
			ElementUtil.mouseMove(OnlineSiteID);
			if (avalOnlineSiteID.equalsIgnoreCase(evalOnlineSiteID)) {
				ExtentCucumberAdapter.addTestStepLog("Site ID verify Expected Value : " + evalOnlineSiteID);
				ExtentCucumberAdapter.addTestStepLog("Site ID verify Actual Value : " + avalOnlineSiteID);
				ElementUtil.highlightElement(OnlineSiteID);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b> +  Verify the Source Site ID matches with expected result");						
			} else {
				ExtentCucumberAdapter.addTestStepLog("Site ID verify Expected Value : " + evalOnlineSiteID);
				ExtentCucumberAdapter.addTestStepLog("Site ID verify Actual Value : " + avalOnlineSiteID);	
				ElementUtil.highlightElement(OnlineSiteID);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the Source Site ID matches with expected result");
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void howDidYouHearInC4C(String evalOnlineYouHear) {
		try {
		//	String evalOnlineYouHear = "idp website";
			avalOnlineYouHear = ElementUtil.getText(OnlineYouHear);
			ElementUtil.mouseMove(OnlineYouHear);
			if (avalOnlineYouHear.equalsIgnoreCase(evalOnlineYouHear)) {
				ExtentCucumberAdapter.addTestStepLog("How did you Hear verify Expected Value : " + evalOnlineYouHear);
				ExtentCucumberAdapter.addTestStepLog("How did you Hear verify Actual Value : " + avalOnlineYouHear);
				ElementUtil.highlightElement(OnlineYouHear);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b> +  Verify the How did you Hear? in C4C matches with How did you hear about IDP? In enquiry form");						
			} else {
				ExtentCucumberAdapter.addTestStepLog("How did you Hear verify Expected Value : " + evalOnlineYouHear);
				ExtentCucumberAdapter.addTestStepLog("How did you Hear verify Actual Value : " + avalOnlineYouHear);	
				ElementUtil.highlightElement(OnlineYouHear);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the How did you Hear? in C4C matches with How did you hear about IDP? In enquiry form");
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkOnlineFirstLeadInC4C(String evalOnlineFtLd) {
		try {
		//	String evalOnlineFtLd = "yes";
			String avalOnlineFtLd = ElementUtil.getText(OnlineFirstLead);
			ElementUtil.mouseMove(OnlineFirstLead);
			if (avalOnlineFtLd.contains(evalOnlineFtLd)) {
				ExtentCucumberAdapter.addTestStepLog("FirstLead verify Expected Value : " + evalOnlineFtLd);
				ExtentCucumberAdapter.addTestStepLog("FirstLead verify Actual Value : " + avalOnlineFtLd);
				ElementUtil.highlightElement(OnlineFirstLead);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b> +  Verify the FirstLead? in C4C matches with expected result");						
			} else {
				ExtentCucumberAdapter.addTestStepLog("FirstLead verify Expected Value : " + evalOnlineFtLd);
				ExtentCucumberAdapter.addTestStepLog("FirstLeadr verify Actual Value : " + avalOnlineFtLd);	
				ElementUtil.highlightElement(OnlineFirstLead);
				ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the FirstLead? in C4C matches with expected result");
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkCounsellingModeInC4C(String prefModCoun) {
		try {
				String evalCounMod = prefModCoun.toLowerCase();
				String counModTex = ElementUtil.getText(counsMode);
				ElementUtil.mouseMove(counsMode);
				if (counModTex.contains(evalCounMod)) {
					ExtentCucumberAdapter.addTestStepLog("Counselling Mode verify Expected Value : " + evalCounMod);
					ExtentCucumberAdapter.addTestStepLog("Counselling Mode verify Actual Value : " + counModTex);
					ElementUtil.highlightElement(OnlineFirstLead);
					ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b> +  Verify the Counselling Mode in C4C matches with expected result");						
				} else {
					ExtentCucumberAdapter.addTestStepLog("Counselling Mode verify Expected Value : " + evalCounMod);
					ExtentCucumberAdapter.addTestStepLog("Counselling Mode verify Actual Value : " + counModTex);	
					ElementUtil.highlightElement(OnlineFirstLead);
					ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the Counselling Mode in C4C matches with expected result");
					}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeStud() {
		try {
			Boolean closeStu1 = ElementUtil.isElementDisplayed(CloseStud,20, "Close Stud");
			if (closeStu1 == true) {
				ElementUtil.click(CloseStud);
			}
			Boolean closeStu3 = ElementUtil.isElementDisplayed(CloseStud,20, "Close Stud");
			if (closeStu3 == true) {
				ElementUtil.click(CloseStud);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to click offer in principle
	 */
	public void clickOfferInPrinciple() {
		try {
			ElementUtil.waitForCertainTime(2000);
			ElementUtil.click(offerInPrinciple);
			ElementUtil.waitForCertainTime(20000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify study mode in OIP C4C
	 * @param expected
	 */
	public void checkStudyModeOIP(String expected) {
//		try {
//			ElementUtil.switchToIFrames(iframeTwo);
//			ElementUtil.switchToIFrames(iframeTwo);
//			System.out.println("Switched inside the frame");
//			BaseUtil.verifyValuesMatches(studyModeOIP, expected, "Study Mode verify Expected Value : ", "Study Mode verify Actual Value : ",  " Verify the Study Mode matches with expected result");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
	/**
	 * This method is used to verify study status in OIP C4C
	 * @param expected
	 */
	public void checkStudyStatusOIP(String expected) {
		try {
			//BaseUtil.verifyValuesMatches(studyStatusOIP, expected, "Study Status verify Actual Value : ", "Study Status verify Expected Value : ",  " Verify the Study Status matches with expected result");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify study status in OIP C4C
	 * @param expected
	 */
	public void checkFinalGradeAchievedOIP(String expected) {
		try {
			//BaseUtil.verifyValuesMatches(finalGradeAchievedOIP, expected, "Verify Final Grade Achieved Actual Value : ", "Verify Final Grade Achieved Expected Value : ",  " Verify the Final Grade Achieved matches with expected result");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify study country in OIP C4C
	 * @param expected
	 */
	public void checkStudyCountryOIP(String expected) {
		try {
			//BaseUtil.verifyValuesMatches(studyCountryOIP, expected, "Verify Study Country Actual Value", "Verify Study Country Expected Value", " Verify the study country matches with expected result");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify duration in OIP C4C
	 * @param expected
	 */
	public void checkDurationOIP(String expected) {
     try {
    	 String actual = ElementUtil.getText(durationOIP);
 		ElementUtil.mouseMove(durationOIP);
 		String[] arrSplit = actual.split(" ");
 		String actualAr = arrSplit[0];
 		String[] expectedDur = expected.split(" ");
 		String expectedAr = expectedDur[0];
 		if (actualAr.equalsIgnoreCase(expectedAr)) {
 			ExtentCucumberAdapter.addTestStepLog("Verify Duration Expected Value" + expectedAr);
 			ExtentCucumberAdapter.addTestStepLog("Verify Duration Actual Value" + actualAr);
 			ElementUtil.highlightElement(durationOIP);
 			ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b> +  Verify the Duration matches with expected result" );						
 		} else {
 			ExtentCucumberAdapter.addTestStepLog("Verify Duration Expected Value"  + expectedAr);
 			ExtentCucumberAdapter.addTestStepLog("Verify Duration Actual Value" + actualAr);	
 			ElementUtil.highlightElement(durationOIP);
 			ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> " + " Verify the Duration matches with expected result");
 			}
 			}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check study country OIP in C4C
	 * @param expected
	 */
	public void checkStudyCountry(String expected) {
		try {
			 String actual = ElementUtil.getText(studyCountryOIP);
		 		ElementUtil.mouseMove(studyCountryOIP);
		 		String[] arrSplit = actual.split("-");
		 		String actualAr = arrSplit[1];
		 		if (actualAr.equalsIgnoreCase(expected)) {
		 			ExtentCucumberAdapter.addTestStepLog("Verify Study Country Expected Value" + expected);
		 			ExtentCucumberAdapter.addTestStepLog("Verify Study Country Actual Value" + actualAr);
		 			ElementUtil.highlightElement(studyCountryOIP);
		 			ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b> + Verify the Study Country matches with expected result" );						
		 		} else {
		 			ExtentCucumberAdapter.addTestStepLog("Verify Study Country Expected Value"  + expected);
		 			ExtentCucumberAdapter.addTestStepLog("Verify Study Country Actual Value" + actualAr);	
		 			ElementUtil.highlightElement(studyCountryOIP);
		 			ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b> + Verify the Study Country matches with expected result");
		 			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check study language OIP in C4C
	 * @param expected
	 */
	public void checkStudyLanguage(String expected) {
		try {
			String actual = ElementUtil.getText(studyLanguage);
	 		ElementUtil.mouseMove(studyLanguage);
	 		String[] arrSplit = actual.split("-");
	 		String actualAr = arrSplit[0];
	 		if (actualAr.equalsIgnoreCase(expected)) {
	 			ExtentCucumberAdapter.addTestStepLog("Verify Study Language Expected Value" + expected);
	 			ExtentCucumberAdapter.addTestStepLog("Verify Study Language Actual Value" + actualAr);
	 			ElementUtil.highlightElement(studyLanguage);
	 			ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\">---------PASS--------</b> +  Verify the Study Language matches with expected result" );						
	 		} else {
	 			ExtentCucumberAdapter.addTestStepLog("Verify Study Language Expected Value"  + expected);
	 			ExtentCucumberAdapter.addTestStepLog("Verify Study Language Actual Value" + actualAr);	
	 			ElementUtil.highlightElement(studyLanguage);
	 			ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b>  +  Verify the Study Language matches with expected result");
	 			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check institution name OIP in C4C
	 * @param expected
	 */
	public void checkInstitutionName(String expected) {
		try {
			String actual = ElementUtil.getText(institutionNameOIP);
	 		ElementUtil.mouseMove(institutionNameOIP);
	 		String[] arrSplitI = actual.split("(");
	 		String actualI = arrSplitI[0];
	 		if (actualI.contains(expected)) {
	 			ExtentCucumberAdapter.addTestStepLog("Verify Study Country Expected Value" + expected);
	 			ExtentCucumberAdapter.addTestStepLog("Verify Study Country Actual Value" + actualI);
	 			ElementUtil.highlightElement(studyLanguage);
	 			ExtentCucumberAdapter.addTestStepLog("-----------------PASS----------- " + " Verify the Institution Name matches with expected result" );						
	 		} else {
	 			ExtentCucumberAdapter.addTestStepLog("Verify Study Country Expected Value"  + expected);
	 			ExtentCucumberAdapter.addTestStepLog("Verify Study Country Actual Value" + actualI);	
	 			ElementUtil.highlightElement(studyLanguage);
	 			ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">---------FAIL--------</b>  +  Verify the Institution Name matches with expected result");
	 		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to fetch referring url from C4C
	 */
	public void referringURLC4CValidation() {
		try {
			getReferringURL = ElementUtil.getText(OnlineRefUrl);
			ElementUtil.printToReportMessage("REFERRING URL IN C4C - ONLINE LEVEL : " + getReferringURL);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * This method is used to check honours degree OIP in C4C
	 * @param expected
	 */
	public void checkHonoursDegree(String expected) {
		try {
			//BaseUtil.verifyValuesMatches(honoursDegree, expected, "Verify Honours Degree Actual Value", "Verify Honours Degree Expected Value", " Verify the Honours Degree matches with expected result");			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check qualification title OIP in C4C
	 * @param expected
	 */
	public void checkQualificationTitle(String expected) {
		try {
			//BaseUtil.verifyValuesMatches(qualificationTitleOIP, expected, "Verify Qualification Title Actual Value", "Verify Qualification Title Expected Value", " Verify the Qualification Title matches with expected result");			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to credit transfer OIP in C4C
	 * @param expected
	 */
	public void checkCreditTransfer(String expected) {
		try {
			//BaseUtil.verifyValuesMatches(creditTransferOIP, expected, "Verify Credit Transfer Actual Value", "Verify Credit Transfer Expected Value", " Verify the Credit Transfer matches with expected result");						
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check fail units OIP in C4C
	 * @param expected
	 */
	public void checkFailUnits(String expected) {
		try {
			//BaseUtil.verifyValuesMatches(failUnitsOIP, expected, "Verify Fail Units Actual Value", "Verify Fail Units Expected Value", " Verify the Fail Units matches with expected result");									
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check English Test Type OIP in C4C
	 * @param expected
	 */
	public void checkEnglishTestType(String expected) {
		try {
			//BaseUtil.verifyValuesMatches(englishTestTypeOIP, expected, "Verify English Test Type Actual Value", "Verify English Test Type Expected Value", " Verify the English Test Type matches with expected result");												
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check admission test type OIP in C4C
	 * @param expected
	 */
	public void checkAdmissionTestType(String expected) {
		try {
			//BaseUtil.verifyValuesMatches(admissionTestTypeOIP, expected, "Verify Admission Test Type Actual Value", "Verify Admission Test Type Expected Value", " Verify the Admission Test Type matches with expected result");														
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to click student essentials menu in C4C
	 */
	public void clickStudentEssentialsMenu() {
		try {
			ElementUtil.click(studentEssentialsMenu);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to check student essentials
	 */
	public void checkStudentEssentials(String providerProduct){
		try {
			Boolean isSESProductDis = ElementUtil.isElementDisplayed(productSESC4C, 10, "SES Product");
			if(isSESProductDis) {
				String getProductSES = ElementUtil.getText(productSESC4C).toLowerCase();
				if(providerProduct.toLowerCase().contains(getProductSES)) {
					ElementUtil.printToReportMessage("Product in SES : " + getProductSES);
					ElementUtil.printToReportPass("PRODUCT AVAILABLE IN STUDENT ESSENTIALS MENU : " + getProductSES);
				}
			}else {
				ElementUtil.printToReportFAIL("PRODUCT NOT DISPLAYED IN STUDENT ESSENTIALS MENU");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

	
}
	
