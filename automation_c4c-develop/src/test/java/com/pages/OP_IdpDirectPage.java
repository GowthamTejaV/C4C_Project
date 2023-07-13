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

public class OP_IdpDirectPage {
	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	// application details
	private static By drp_existingStudent = By.xpath("//div[@data-help-id='BpqWOAXh3qQRiYXsqPDCbG']//input[1]");
	private static By drp_creditTransfer = By.xpath("//div[@data-help-id='SRpSAOoTf4w0vFgc09Zh0W']//input[1]");
	private static By drp_appFee = By.xpath("//div[@data-help-id='xeXhc0hHfqkbH6rJuFVyxm']//input[1]");
	private static By drp_oshc = By.xpath("//div[@data-help-id='HkN51HWQraE1748agcPDR0']//input[1]");

	// stremlined visa process
	private static By drp_excludedAU = By.xpath("//div[@data-help-id='3j2L8j7eg4EVWpOI34rPdm']//input[1]");
	private static By drp_relativesAU = By.xpath("//div[@data-help-id='bc4SbkBYwK28vvYk41ZlwG']//input[1]");
	private static By drp_invalidVisa = By.xpath("//div[@data-help-id='9TacNrd0nqgJ_DDN0soUz0']//input[1]");

	// pathway info
	private static By drp_pathway = By.xpath("//div[@data-help-id='lG2h$fTYbaIyPzS9nBt2k0']//input[1]");

	// english language proficiency
	private static By drp_english = By.xpath("//div[@data-help-id='d10qViTwX42tBbBrT38hGW']//input[1]");

	// uts
	private static By drp_appliedBefore = By.xpath("//div[@data-help-id='o1VFkmdDLqAH6Uf8KZFbam']//input");
	private static By txt_applicationNumber = By.xpath("//div[@data-help-id='kxPe_YMT04cs99at2tiPNG']//input");
	private static By drp_packageDetail = By.xpath("//div[@data-help-id='IdKiXqcxwKANgkjp1bPQeG']//input");
	private static By drp_additionalDetail = By.xpath("//div[@data-help-id='b5aPx2y2Y46qoZfeLmQJPW']//input");
	private static By drp_researchDetail = By.xpath("//div[@data-help-id='csytGh6fBa6O3CPgFJki8G']//input");
	private static By drp_teritaryExecution = By.xpath("//div[@data-help-id='Dm71iFimracp8asWOhrHZG']//input");
	private static By drp_reasonForApply = By.xpath("//div[@data-help-id='S9jRJF9G2KkoJsgkjutQuG']//input");
	private static By drp_hearedUST = By.xpath("//div[@data-help-id='VLbbiiesfqMxdiiWG86PJW']//input");
	private static By btn_idpDirectTab = By.xpath("//div[@role='tab']//div[text()='IDP DIRECT']");

	public void applicationDetail() throws InterruptedException, IOException {

		String ExistingStudent = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"ExistingStudent");
		String CreditTransfer = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"CreditTransfer");
		String AppFee = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "AppFee");
		String OSHC = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "OSHC");

		ElementUtil.Type(drp_existingStudent, ExistingStudent);
		Thread.sleep(2000);
		ElementUtil.Type(drp_creditTransfer, CreditTransfer);
		Thread.sleep(2000);
		ElementUtil.Type(drp_appFee, AppFee);
		Thread.sleep(2000);
		ElementUtil.Type(drp_oshc, OSHC);
		Thread.sleep(2000);
	}

//use
	public void visaProcess() throws InterruptedException, IOException {

		String ExcludedAU = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "ExcludedAU");
		String RelativesAU = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "RelativesAU");
		String InvalidVisa = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "InvalidVisa");

		ElementUtil.Type(drp_excludedAU, ExcludedAU);
		Thread.sleep(2000);
		ElementUtil.Type(drp_relativesAU, RelativesAU);
		Thread.sleep(2000);
		ElementUtil.Type(drp_invalidVisa, InvalidVisa);
		Thread.sleep(2000);
	}

//use
	public void pathway() throws InterruptedException, IOException {

		String Pathway = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "Pathway");

		ElementUtil.waitForElementClickable(drp_pathway);
		Thread.sleep(2000);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.Type(drp_pathway, Pathway);
		Thread.sleep(2000);
	}

//use
	public void englishProficiency() throws InterruptedException, IOException {

		String English = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "English");

		ElementUtil.waitForElementClickable(drp_english);
		Thread.sleep(2000);
		ElementUtil.Type(drp_english, English);
		Thread.sleep(2000);
	}

//use
	public void SwitchIDPdirectTab() throws InterruptedException {
		try {
			Actions action = new Actions(DriverFactory.getDriver());
			WebElement ele = DriverFactory.getDriver().findElement(btn_idpDirectTab);
			action.moveToElement(ele).click().build().perform();

		} catch (Exception e) {
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			ElementUtil.switchToTab("IDP DIRECT");
			Thread.sleep(2000);
		}
	}

	public static void UTSuniverityIDP() throws InterruptedException, IOException {
		String ExistingStudent = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"ExistingStudent");
		String CreditTransfer = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"CreditTransfer");
		String AppFee = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "AppFee");
		String OSHC = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "OSHC");
		String English = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "English");
		String AppliedBefore = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"AppliedBefore");
		String ApplicationNumber = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"ApplicationNumber");
		String PackageDetail = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"PackageDetail");
		String ResearchDetail = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"ResearchDetail");
		String ApplyResearch = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"ApplyResearch");
		String TeritoryExecution = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"TeritoryExecution");
		String ReasonForApply = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect",
				"ReasonForApply");
		String HowHeared = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "IDPDirect", "HowHeared");

		ElementUtil.Type(drp_existingStudent, ExistingStudent);
		Thread.sleep(2000);
		ElementUtil.Type(drp_creditTransfer, CreditTransfer);
		Thread.sleep(2000);
		ElementUtil.Type(drp_appFee, AppFee);
		Thread.sleep(2000);
		ElementUtil.Type(drp_oshc, OSHC);
		Thread.sleep(2000);
		ElementUtil.Type(drp_english, English);
		Thread.sleep(2000);
		ElementUtil.Type(drp_appliedBefore, AppliedBefore);
		Thread.sleep(2000);
		ElementUtil.Type(txt_applicationNumber, ApplicationNumber);
		Thread.sleep(2000);
		ElementUtil.Type(drp_packageDetail, PackageDetail);
		Thread.sleep(2000);
		ElementUtil.Type(drp_researchDetail, ResearchDetail);
		Thread.sleep(2000);
		ElementUtil.Type(drp_additionalDetail, ApplyResearch);
		Thread.sleep(2000);
		ElementUtil.Type(drp_teritaryExecution, TeritoryExecution);
		Thread.sleep(2000);
		ElementUtil.Type(drp_reasonForApply, ReasonForApply);
		Thread.sleep(2000);
		ElementUtil.Type(drp_hearedUST, HowHeared);
		Thread.sleep(2000);
	}
}
