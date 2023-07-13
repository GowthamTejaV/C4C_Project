package com.pages;

import org.openqa.selenium.By;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.ElementUtil;

public class LicenseeRestrictionsPage {
	private By myCountryIndividTxt=By.xpath(".//*[@data-help-id='84Sh85MdXqATzcr8MNvrsG-variantManagement-title']");
	private By reportsCount = By.xpath(".//div[@data-help-id='XGVXg2OG5q2X7cgOthZhHW-variantManagement-count']//span");
	private By reportsIcon = By.xpath(".//button[@data-help-id='XGVXg2OG5q2X7cgOthZhHW-variantManagement-trigger']");
    private By licenceLeadEditBtn=By.xpath(".//button[@title='Edit']");
    private By licenLeadAddBtn=By.xpath(".//*[@data-help-id='n7vzZ64G6K2skiiLLncdx0']");
    private By studyPlanDate=By.xpath(".//*[@data-help-id='fda4a9d51a909a941a592738ff451f1f']//input");
    private By srudyLevelIPrefer=By.xpath(".//*[@data-help-id='0c12649b96bb7c8e49b8d4b62bc08a0d']//input");
    private By idp_owner = By.xpath(".//*[@data-help-id='Oq3J7CBMHaghYvpYME7QEW']//input");
    private By moreBtn=By.xpath("(//button[@data-help-id='button-ObjectDetail-MoreOrLess'])[1]");
    private By getIdpOwnerName=By.xpath(".//span/following-sibling::a[@data-help-id='Oq3J7CBMHaghYvpYME7QEW']");
    
    public String getIdpOwnerName() {
    	ApplicationPageUtil.waitForLoadGetDisappiear();
    	return ElementUtil.getTextValue(getIdpOwnerName);
    }
    public void clickOnLicenceLeadEditButton() {
    	ApplicationPageUtil.waitForLoadGetDisappiear();
    	ElementUtil.click(licenceLeadEditBtn);
    }
    public void clickOnLicenceLeadAddBtn() {
    	ApplicationPageUtil.waitForLoadGetDisappiear();
    	ElementUtil.click(licenLeadAddBtn);
    }
    
    
	public boolean validateReportsCount(String count) {
		String txt = ElementUtil.getTextValue(reportsCount);
		return txt.equals("(" + count + ")");
	}

	public void selectThe_ReportListValue(String value) {
		ElementUtil.click(reportsIcon);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(By.xpath(".//ul[@role='listbox']//li[text()='" + value + "']"));
	}

	public boolean validateReportsViewsCount(String count) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		selectThe_ReportListValue("Report Views");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String txt = ElementUtil.getTextValue(reportsCount);

		return txt.contains(count);
	}
	public String getMyCutomerIndividualCustomerTxt() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getTextValue(myCountryIndividTxt);
	}
	
	public void enter_Study_plan_dateText(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ApplicationPageUtil.typeWithEnt(studyPlanDate, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void enter_studyLevelIPrefer(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.TypeWithEnter(srudyLevelIPrefer, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void enter_IDP_Owner(String text) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ApplicationPageUtil.typeWithEnt(idp_owner, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickOnMoreButton() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(moreBtn);
	}
	//srudyLevelIPrefer

}
