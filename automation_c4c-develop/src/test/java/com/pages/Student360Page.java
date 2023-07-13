package com.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class Student360Page {
	
	private By appliedStage=By.xpath(".//span[text()='Applied']/parent::li[contains(@class,'active')]");
	private By oipNotIssuedCount=By.xpath(".//p[text()='Not Issued']/following-sibling::p");
	private By oipIssuedCount=By.xpath(".//p[text()='Issued']/following-sibling::p");
    private By student360Tab=By.xpath(".//div[@data-help-id='53b9d449c00eaa17e4ab5c8e2d8f1bf6']//div[text()='STUDENT 360']");
	private By peronalDetailsHeading=By.xpath(".//span[text()='PERSONAL DETAILS']");
	private By idpLiveTabSection=By.xpath(".//span[text()='IDP Live App']");
	private By courseLeadTabSection=By.xpath(".//span[text()='COURSE LEADS']");
	private By interactionTabSection=By.xpath(".//span[text()='INTERACTIONS']");
	private By preferenceTabSection=By.xpath(".//span[text()='PREFERENCE']");
	private By educationHistory=By.xpath(".//span[text()='EDUCATION HISTORY']");
	private By coursefavoritsTabSection=By.xpath(".//span[text()='COURSE FAVOURITES']");
	private By offerInPrincipleTabSection=By.xpath(".//span[text()='OFFER IN PRINCIPLE']");
	private By contactPoinTabSection=By.xpath(".//span[text()='CONTACT POINTS']");
	private By totalApplicationTabSection=By.xpath(".//span[text()='TOTAL APPLICATION']");
	private By visaTabSection=By.xpath(".//span[text()='VISA']");
	
	private By filterICleadBasedONQualification=By.xpath("(.//th[@data-help-id='3PXJ_E5Co4oWI_DL8llWJW'])[1]");
	private By filter_search = By.xpath(".//div/input[@placeholder='Search']");
	private By getNotesCount=By.xpath(".//*[@data-help-id='QAhY8MoV84EVkFPW_gN5t0']//ul//li");
	private By hotLeadTxt=By.xpath(".//li[normalize-space(text())='HOT LEAD']");
	private By studyLevelTxt=By.xpath(".//span[text()='Study level']/parent::li//ul//span//mat-icon[text()]/parent::span[text()]");
	private By educationHistoryCount=By.xpath(".//*[@data-help-id='4Au6dInX0qMZAKTbU_gX3W-variantManagement-count']//bdi");
	private By employmentProficiencyCount=By.xpath(".//*[@data-help-id='Fp4kLdQ92asQbb_Na5zsY0-variantManagement-count']//bdi");
	
	private By getFavouritesRECourse=By.xpath(".//tbody[@role='rowgroup']//tr//td//span[text()='Course']/parent::td[text()]");
	IC_LeadCreationpage icLead=new IC_LeadCreationpage();
	public String get_OIP_NotIssuedCount() {
		return ElementUtil.getText(oipNotIssuedCount);
	}
	
	public String get_OIP_IssuedCount() {
		return ElementUtil.getText(oipIssuedCount);
	}
	
	
	public String getFavouritesREcourse() {
		
		return ElementUtil.getTextValue(getFavouritesRECourse);
	}
	
	public boolean isAppliedStage() {
		return ElementUtil.isElementDisplayed(appliedStage);
	}
	
	
	//Personal Details Heading
		public boolean isPersonalDetailsHeadingVisible() {
			ElementUtil.waitForElementVisible(peronalDetailsHeading);
			if(ElementUtil.isElementDisplayed(peronalDetailsHeading)) {
				return true;
			}else {
				return false;
			}
			
		}
		//IDPLiveTab Heading
		public boolean isIDPLiveTabSectionHeadingVisible() {
			ElementUtil.waitForElementVisible(idpLiveTabSection);
			if(ElementUtil.isElementDisplayed(idpLiveTabSection)) {
				return true;
			}else {
				return false;
			}
			
		}
		
		//courseLeadTabSection Heading
		public boolean iscourseLeadTabSectionVisible() {
			ElementUtil.waitForElementVisible(courseLeadTabSection);
			if(ElementUtil.isElementDisplayed(courseLeadTabSection)) {
				return true;
			}else {
				return false;
			}
			
		}
	
		//interactionTabSection Heading
		public boolean isinteractionTabSectionVisible() {
			ElementUtil.waitForElementVisible(interactionTabSection);
			if(ElementUtil.isElementDisplayed(interactionTabSection)) {
				return true;
			}else {
				return false;
			}
			
		}
		//preferenceTabSection Heading
		public boolean ispreferenceTabSectionVisible() {
			ElementUtil.waitForElementVisible(preferenceTabSection);
			if(ElementUtil.isElementDisplayed(preferenceTabSection)) {
				return true;
			}else {
				return false;
			}
			
		}
		//educationHistory Heading
		public boolean iseducationHistoryVisible() {
			ElementUtil.waitForElementVisible(educationHistory);
			if(ElementUtil.isElementDisplayed(educationHistory)) {
				return true;
			}else {
				return false;
			}
			
		}
		
		//coursefavoritsTabSection Heading
		public boolean iscoursefavoritsTabSectionVisible() {
			ElementUtil.waitForElementVisible(coursefavoritsTabSection);
			if(ElementUtil.isElementDisplayed(coursefavoritsTabSection)) {
				return true;
			}else {
				return false;
			}
			
		}
		//offerInPrincipleTabSection Heading
		public boolean isofferInPrincipleTabSectionVisible() {
			ElementUtil.waitForElementVisible(offerInPrincipleTabSection);
			if(ElementUtil.isElementDisplayed(offerInPrincipleTabSection)) {
				return true;
			}else {
				return false;
			}
			
		}
		
		//contactPoinTabSection Heading
		public boolean iscontactPoinTabSectionVisible() {
			ElementUtil.waitForElementVisible(contactPoinTabSection);
			if(ElementUtil.isElementDisplayed(contactPoinTabSection)) {
				return true;
			}else {
				return false;
			}
			
		}
		//totalApplicationTabSection Heading
		public boolean istotalApplicationTabSectionVisible() {
			ElementUtil.waitForElementVisible(totalApplicationTabSection);
			if(ElementUtil.isElementDisplayed(totalApplicationTabSection)) {
				return true;
			}else {
				return false;
			}
			
		}		
		//visaTabSection Heading
		public boolean isvisaTabSectionVisible() {
			ElementUtil.waitForElementVisible(visaTabSection);
			if(ElementUtil.isElementDisplayed(visaTabSection)) {
				return true;
			}else {
				return false;
			}
		}
			
			
	public String getEducationHistoryCount() {
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getTextValue(educationHistoryCount).replace("(","").replace(")","");
	}
	
	public String getEmploymentProficiencyCount() {
		return ElementUtil.getTextValue(employmentProficiencyCount).replace("(","").replace(")","");
	}
	
	//CAMPAIGNS
	//EDUCATION HISTORY
	//INTERACTIONS
	//COURSE LEADS
	//PERSONAL DETAILS
	//OFFER IN PRINCIPLE -->(Total Count)
	// Get the personal Details Field value by field name
	public String getFieldvalue_ByFieldlabel(String fieldlabelname) {
		return ElementUtil.getText(By.xpath(".//li//span[normalize-space(text())='"+fieldlabelname+"']/following-sibling::span")).trim();	
	}
	
	//navigate to student360 Tab
	public void navigateToStudent360Tab() {
		ElementUtil.waitForPageLoad();
		try {
			//ElementUtil.scrollToElement(student360Tab);
			ElementUtil.click(student360Tab);
			ElementUtil.waitForPageLoad();
			Thread.sleep(7000);
			//ElementUtil.waitForElementPresent(By.xpath(".//iframe[contains(@name,'page2')]"));
			DriverFactory.getDriver().switchTo().frame(DriverFactory.getDriver().findElement(By.xpath(".//div[@data-help-id='00163eb8-a395-1edc-82b2-9aa0ab1cd94f']//iframe")));
			DriverFactory.getDriver().switchTo().frame(DriverFactory.getDriver().findElement(By.xpath(".//iframe[contains(@id,'svc')]")));
			System.out.println("USER LANDED ON PERSONAL DETAILS SECTION "+isPersonalDetailsHeadingVisible());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void filter_IC_Lead_Based_on_Qualification_level(String str) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3500);
			ElementUtil.click(filterICleadBasedONQualification);
			ApplicationPageUtil.typeWithEnt(filter_search, str);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isHotLeadTextDisplaying() {
		return ElementUtil.isElementDisplayed(hotLeadTxt);
	}
	
	public int getNotesCount() {
		return DriverFactory.getDriver().findElements(getNotesCount).size();
	}
	
	public String getDateInPlanToStudySectionFormat(String planDate) {
		 System.out.println("Paln Date Expected:-"+planDate);
		  
	     try {
	    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
			Date date = formatter.parse(planDate);
			return date.toString().split(" ")[1]+" "+date.toString().split(" ")[date.toString().split(" ").length-1];
			
		} catch (ParseException e) {
			return null;
		} 
	}
	
	public String getStudyLevelText() {
		return ElementUtil.getText(studyLevelTxt).trim();
	}

}
