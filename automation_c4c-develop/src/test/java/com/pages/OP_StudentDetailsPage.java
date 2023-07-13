package com.pages;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;

public class OP_StudentDetailsPage {
	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	// personal details
	private static By drp_salutation = By.xpath("//div[@data-help-id='up$262ts6KoeifY_QrqjZW']//input[1]");
	private static By drp_gender = By.xpath("//div[@data-help-id='vmGrs3hy_KI$x8ag$I1f1m']//input[1]");

	// permanent address
	private static By txt_street = By.xpath("//div[@data-help-id='iM1EonFbrqUWpXgLKpetP0']//input[1]");
	private static By txt_city = By.xpath("//div[@data-help-id='b7h6koyaC4kME_IuS6C9Fm']//input[1]");
	private static By drp_state = By.xpath("//div[@data-help-id='sWEibfPJl4_X807OjKtTgG']//input[1]");
	private static By txt_postCode_gender = By.xpath("//div[@data-help-id='iMs1utWoLaI9wQbUjG7kIG']//input[1]");

	// correspondance address
	private static By drp_corresAddress = By.xpath("//div[@data-help-id='wme8g4VknqgP1YKaqNii7G']//input[1]");

	// passport
	private static By drp_countryPassport = By.xpath("//div[@data-help-id='d4m06hJ3u4_4dalr_MMjzG']//input[1]");
	private static By drp_countryCitizen = By.xpath("//div[@data-help-id='5VjLXQu2jKQz7avBDvSrXm']//input[1]");
	private static By drp_countryBirth = By.xpath("//div[@data-help-id='T9oAyscq$4_14o0SHjBdF0']//input[1]");
	private static By drp_visaRefuseFamily = By.xpath("//div[@data-help-id='4cxIanb67a62PEmy_BEjZG']//input[1]");
	private static By drp_VisaRefusedCountry_=By.xpath(".//*[@data-help-id='zLLAihAAwKopkSuzZUTAdG']//input");
	private static By visa_RefusedDate=By.xpath(".//*[@data-help-id='lDujjL$JHK2unfMfljw440']//input");
	private static By visa_refusedReason=By.xpath(".//*[@data-help-id='$Xz84T_CAK6lKrZx$6p$7W']//input");
	private static By visa_canceledReason=By.xpath(".//*[@data-help-id='9KXAUk_mqaAa1QmMW_h1bW']//input");
	private static By drp_visaCancelled = By.xpath("//div[@data-help-id='cxtfnj4kaasWgC2KX2Q0SG']//input[1]");
	private static By drp_protectionVisa = By.xpath("//div[@data-help-id='Fj1134$VeqQ9ISPR4mQ3R0']//input[1]");
	private static By btn_studentDetailsTab = By.xpath("//div[@role='tab']//div[text()='STUDENT DETAILS']");

	// finanacial

	private static By drp_primaryFinance = By.xpath("//div[@data-help-id='z4DxRSFSLqsVaIJytfbNhW']//input[1]");

	// disablity
	private static By drp_disabilityAssist = By.xpath("//div[@data-help-id='1Lvs71L6$aIB6veI98qSV0']//input[1]");

	// use
	public void personalDetails() throws InterruptedException, IOException {
		String Salutation = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"Salutation");
		String Gender = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails", "Gender");

		Thread.sleep(5000);
		ElementUtil.Type(drp_salutation, Salutation);
		Thread.sleep(2000);
		ElementUtil.Type(drp_gender, Gender);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();

	}

//use
	public void permanentAddressDetails() throws InterruptedException, IOException {
		String Street = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails", "Street");
		String City = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails", "City");
		String State = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails", "State");
		String Postcode = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails", "Postcode");

		ElementUtil.Type(txt_street, Street);
		Thread.sleep(2000);
		ElementUtil.Type(txt_city, City);
		Thread.sleep(2000);
		ElementUtil.Type(drp_state, State);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		Thread.sleep(5000);
		ElementUtil.Type(txt_postCode_gender, Postcode);
		Thread.sleep(2000);
		ElementUtil.Type(txt_postCode_gender, Postcode);
		Thread.sleep(2000);
	}

//use
	public void corrresAddressDetails() throws InterruptedException, IOException {

		String CorresAddress = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"CorresAddress");

		ElementUtil.Type(drp_corresAddress, CorresAddress);
		Thread.sleep(2000);
	}

//use
	public void passportDetails() throws InterruptedException, IOException {

		String CountryPassport = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"CountryPassport");

		String CountryCitizen = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"CountryCitizen");

		String CountryBirth = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"CountryBirth");

		String VisaRefused = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"VisaRefused");//div[@data-help-id='cxtfnj4kaasWgC2KX2Q0SG']//input
		
		String visaRefusedCountry = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"VisaRefusedCountry");
		System.out.println("Visa Refused Country:-"+visaRefusedCountry);
		String visaRefusedDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"VisaRefusedDate");
		System.out.println("Visa Refused Date:-"+visaRefusedDate);
		String VisaCancel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"VisaCancel");
		String visaCanceledReason = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"VisaCancelledReason");
		String visaRefusedReason = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"VisaRefusedReason");

		String VisaProtected = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"VisaProtected");

		ElementUtil.Type(drp_countryPassport, CountryPassport);
		Thread.sleep(2000);
		ElementUtil.Type(drp_countryCitizen, CountryCitizen);
		Thread.sleep(2000);
		ElementUtil.Type(drp_countryBirth, CountryBirth);
		Thread.sleep(2000);
		ElementUtil.Type(drp_visaRefuseFamily, VisaRefused);
		Thread.sleep(2000);
		if(ElementUtil.isElementDisplayed(drp_VisaRefusedCountry_)) {
			ElementUtil.Type(drp_VisaRefusedCountry_, visaRefusedCountry);
			Thread.sleep(2000);
		}
		
		if(ElementUtil.isElementDisplayed(visa_RefusedDate)) {
			ElementUtil.Type(visa_RefusedDate, visaRefusedDate);
			Thread.sleep(2000);
		}
		
		if(ElementUtil.isElementDisplayed(visa_refusedReason)) {
			ElementUtil.Type(visa_refusedReason, visaRefusedReason);
			Thread.sleep(2000);
		}
		System.out.println("Visa Refused Reason:-"+visaRefusedReason);
		ElementUtil.Type(drp_visaCancelled, VisaCancel);
		Thread.sleep(2000);
		
		if(ElementUtil.isElementDisplayed(visa_canceledReason)) {
			ElementUtil.Type(visa_canceledReason, visaCanceledReason);
			Thread.sleep(2000);
		}
		System.out.println("Visa Canceled Reason:-"+visaCanceledReason);
		ElementUtil.Type(drp_protectionVisa, VisaProtected);
		Thread.sleep(2000);
	}

//use
	public void financeDetails() throws InterruptedException, IOException {

		String Primaryfinance = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"Primaryfinance");

		ElementUtil.Type(drp_primaryFinance, Primaryfinance);
		Thread.sleep(2000);
	}

//use
	public void disabilityDetails() throws InterruptedException, IOException {

		String Disability = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "StudentDetails",
				"Disability");
		ElementUtil.Type(drp_disabilityAssist, Disability);
		Thread.sleep(2000);
	}

	// use
	public void SwitchStudentDetailsTab() throws InterruptedException {
		try {
			Actions action = new Actions(DriverFactory.getDriver());
			WebElement ele = DriverFactory.getDriver().findElement(btn_studentDetailsTab);
			action.moveToElement(ele).click().build().perform();

		} catch (Exception e) {
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			ElementUtil.switchToTab("STUDENT DETAILS");
			Thread.sleep(2000);
		}
		
	}
}
