package com.pages;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;

public class OP_VisaDetailsPage {

	private By visaRequired_DropDown = By.xpath(".//*[@data-help-id='e64900e52353c7f839a48b210f5dd5c3']//input");// Yes
	private By visaDecision = By.xpath(".//*[@data-help-id='a05809bb3c09855933f245c29a3e3d38']//input");
	private By visLodgementDate = By.xpath(".//*[@data-help-id='accb2f88a71b514fc3650741051eaebe']//input");
	private By visApproveDate = By.xpath(".//*[@data-help-id='d1a3de3b1f0684e34c1ff363104ff082']//input");
	private By visaDecisionDate = By.xpath(".//*[@data-help-id='d0e8b803a43bb6c4d883b3a39a5cf758']//input");

	private By visaAssessmentLevel_DropDown = By.xpath(".//*[@data-help-id='f028aecba71ce333af2cf7821a292b54']//input");// 2
	private By save_visa_Details = By
			.xpath(".//*[@data-help-id='fTMr5KSpcKYD_PKI0YkMC0']/descendant::bdi[text()='Save']");
	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	// Select the visaRequired value from the drop down
	// use

	public OP_VisaDetailsPage enterVisaRequired(String visaRequired) {
		if (!visaRequired.equals("") && visaRequired != null) {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			try {
				System.out.println("VisaRequired " + ElementUtil.isElementDisplayed(visaRequired_DropDown));
				Thread.sleep(2000);
				if (ElementUtil.isElementDisplayed(visaRequired_DropDown)) {
					ElementUtil.type(visaRequired_DropDown, visaRequired);
					DriverFactory.getDriver().findElement(visaRequired_DropDown).sendKeys(Keys.END);
				}
			} catch (Exception ex) {

			}
		}
		return this;
	}

	public OP_VisaDetailsPage enterVisaLodgementDate(String visaLodgementDate) {
		if (!visaLodgementDate.equals("") && visaLodgementDate != null) {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			try {
				System.out.println("visLodgementDate " + ElementUtil.isElementDisplayed(visLodgementDate));
				Thread.sleep(2000);
				if (ElementUtil.isElementDisplayed(visLodgementDate)) {
					ElementUtil.type(visLodgementDate, visaLodgementDate);
				}
			} catch (Exception ex) {

			}
		}
		return this;
	}

	public OP_VisaDetailsPage enterVisaDecision(String decision) {
		if (!decision.equals("") && decision != null) {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			try {
				System.out.println("visaDecision " + ElementUtil.isElementDisplayed(visaDecision));
				Thread.sleep(2000);
				if (ElementUtil.isElementDisplayed(visaDecision)) {
					ElementUtil.type(visaDecision, decision);
				}
			} catch (Exception ex) {

			}
		}
		return this;
	}

	public OP_VisaDetailsPage enterVisApproveDate(String approveDate) {
		if (!approveDate.equals("") && approveDate != null) {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			try {
				System.out.println("approveDate " + ElementUtil.isElementDisplayed(visApproveDate));
				Thread.sleep(2000);
				if (ElementUtil.isElementDisplayed(visApproveDate)) {
					ElementUtil.type(visApproveDate, approveDate);
				}
			} catch (Exception ex) {

			}
		}
		return this;
	}

	public OP_VisaDetailsPage enterVisaDecisionDate(String decisionDate) {
		if (!decisionDate.equals("") && decisionDate != null) {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			try {
				System.out.println("DecisionDate " + ElementUtil.isElementDisplayed(visaDecisionDate));
				Thread.sleep(2000);
				if (ElementUtil.isElementDisplayed(visaDecisionDate)) {
					ElementUtil.type(visaDecisionDate, decisionDate);
				}
			} catch (Exception ex) {

			}
		}
		return this;
	}

	public void select_visaRequired_From_DropDown() throws InterruptedException, IOException {

		String VisaRequired = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "VisaDetails",
				"VisaRequired");

		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(visaRequired_DropDown);
		Thread.sleep(2000);
		ElementUtil.Type(visaRequired_DropDown, VisaRequired);
	}

	// Select the visaAssessmentLevel value from the drop down
	public void select_visaAssessmentLevel_DropDown() throws InterruptedException, IOException {
		String AssesmentLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "VisaDetails",
				"AssesmentLevel");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(visaAssessmentLevel_DropDown);
		Thread.sleep(2000);
		ElementUtil.Type(visaAssessmentLevel_DropDown, AssesmentLevel);
	}

	public void click_On_Save_VisaDetails(String txt) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(save_visa_Details);
	}

	public void entert_VisaDetails(String txt, String txt1) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			System.out.println("VisaRequired " + ElementUtil.isElementDisplayed(visaRequired_DropDown));
			Thread.sleep(2000);
			if (ElementUtil.isElementDisplayed(visaRequired_DropDown)) {
				ElementUtil.type(visaRequired_DropDown, txt);
			}

		} catch (Exception ex) {

		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			if (ElementUtil.isElementDisplayed(visaAssessmentLevel_DropDown)) {
				ElementUtil.type(visaAssessmentLevel_DropDown, txt1);
			}

		} catch (Exception ex) {

		}

	}

}
