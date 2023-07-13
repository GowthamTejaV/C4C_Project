package com.pages;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;


import AppHooks.ApplicationHooks;


public class OP_CourseSelectionPage {

	/*****************************************
	 * Gowtham Teja
	 *******************************/

	ApplicationPageUtil appUtil = new ApplicationPageUtil();
	// 67272
	private By institutionStudentRefNumber = By.xpath(".//*[@data-help-id='AOjhRqVdfq2$l$g1OyIYJG']//input");

	// 627228
	private By annualTuitionFee = By.xpath(".//*[@data-help-id='fQoJcwjM6qE9VjBvH4U0eG']//input");

	// INR - Indian Rupee
	private By annualTuitionFee_inr = By.xpath(".//*[@data-help-id='Qwr$s9QJZawln4LEq0cxBW']//input");

	// No
	private By nested = By.xpath(".//*[@data-help-id='ijEUVbADo4c2FD0aWorCtm']//input");

	// Yes
	private static By accepted = By.xpath(".//*[@data-help-id='XuQf0nnqSqoaN1pp31MH4G']//input");

	// 23.12.2023
	private By courseStartDate = By.xpath(".//*[@data-help-id='pE692epSk4Uxu5vNLM4Ksm']//input");

	// 23.12.2024
	private By courseEndDate = By.xpath(".//*[@data-help-id='THh6OKhTBaIrEp2ljqzBRW']//input");

	// 20.12.2022
	private By coe_Approved_Date = By.xpath(".//*[@data-help-id='R3WBZJNd6a27MvdWyPtuWm']//input");

	// 20.12.2022
	private By depositPaidDate = By.xpath(".//*[@data-help-id='i$4wTc9Lka2pFfGffV3rS0']//input");

	// 62567
	private By depositPaidAmount = By.xpath(".//*[@data-help-id='$PehgxQm44sE2eCLY0PJwm']//input");

	// INR - Indian Rupee
	private By depositPaidAmount_inr = By.xpath(".//*[@data-help-id='C46sgcnTQqI6XSOuMEfFWG']//input");
	
	private By offer_Deferred=By.xpath(".//div[@data-help-id='FcewSbWNEqwhtJ1$ctzIi0']//input");

	/******************************************************
	 * Gowtham teja
	 *****************************/

	public void enterAllTheMadatoryFields_To_Finalise(String rowNo) {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(rowNo);
		String RefNumber = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelectionTestData",
				"StudentRefNumber");
		String TuitionFee = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelectionTestData",
				"TuitionFee");
		String TuitionFeeInr = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelectionTestData",
				"TuitionFee_inr");
		String accep = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelectionTestData",
				"accepted");
		String courStartDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelectionTestData",
				"courseStartDate");
		System.out.println(courStartDate);
		String courEndDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelectionTestData",
				"courseEndDate");
		System.out.println(courEndDate);
		String coeApprovedDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"CourseSelectionTestData", "coe_Approved_Date");
		String depoPaidDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelectionTestData",
				"depositPaidDate");
		String depoPaidAmount = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"CourseSelectionTestData", "depositPaidAmount");
		String depoPaidAmount_inr = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"CourseSelectionTestData", "depositPaidAmount_inr");
        String offerDeffered=ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"CourseSelectionTestData", "Offer Deffered");
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ApplicationPageUtil.typeWithEnt(institutionStudentRefNumber, RefNumber);
		
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ApplicationPageUtil.typeWithEnt(annualTuitionFee_inr, TuitionFeeInr);

		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1200);
			if (ElementUtil.isElementDisplayed(nested) && ElementUtil.isElementEnable(nested)) {
				ElementUtil.type(nested, "No");
			}
		} catch (Exception ex) {
		}
		ApplicationPageUtil.waitForLoadGetDisappiear();
		System.out.println("Tuition Fee "+TuitionFee);
		Actions action =new Actions(DriverFactory.getDriver());
		action.moveToElement(DriverFactory.getDriver().findElement(annualTuitionFee)).clickAndHold().keyDown(Keys.CONTROL)
		.sendKeys(String.valueOf('\u0061')).sendKeys(String.valueOf('\u0078')).keyUp(Keys.CONTROL)
		.sendKeys(TuitionFee).build().perform();
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ApplicationPageUtil.typeWithEnt(accepted, accep);

		ApplicationPageUtil.waitForLoadGetDisappiear();

		ApplicationPageUtil.typeWithEnt(courseStartDate, courStartDate);

		ApplicationPageUtil.waitForLoadGetDisappiear();

		ApplicationPageUtil.typeWithEnt(courseEndDate, courEndDate);

		ApplicationPageUtil.waitForLoadGetDisappiear();

		ApplicationPageUtil.typeWithEnt(coe_Approved_Date, coeApprovedDate);

		ApplicationPageUtil.waitForLoadGetDisappiear();

		ApplicationPageUtil.typeWithEnt(depositPaidDate, depoPaidDate);

		ApplicationPageUtil.waitForLoadGetDisappiear();
		ApplicationPageUtil.typeWithEnt(offer_Deferred, offerDeffered);
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action1 =new Actions(DriverFactory.getDriver());
		//ApplicationPageUtil.typeWithEnt(depositPaidAmount, depoPaidAmount);
		action1.moveToElement(DriverFactory.getDriver().findElement(depositPaidAmount)).clickAndHold().keyDown(Keys.CONTROL)
		.sendKeys(String.valueOf('\u0061')).sendKeys(String.valueOf('\u0078')).keyUp(Keys.CONTROL)
		.sendKeys(depoPaidAmount).build().perform();
		
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ApplicationPageUtil.typeWithEnt(depositPaidAmount_inr, depoPaidAmount_inr);

	}

	/******************************************************
	 * Teja
	 *****************************/

	// use
	public void enterAllTheMadatoryFields_To_Finalise() throws InterruptedException, IOException {

		String StudentRefNumber = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"StudentRefNumber");
		String AnnualFee = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"AnnualFee");
		String AnnualFeeType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"AnnualFeeType");
		String Nested = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection", "Nested");
		String Accepted = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection", "Accepted");
		String CourseStartDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"CourseStartDate");
		String CourseEndDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"CourseEndDate");
		String CourseApprovedDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"CourseApprovedDate");
		String DepositePaid = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"DepositePaid");
		String DepositeAmount = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"DepositeAmount");
		String DepositeAmountType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"DepositeAmountType");

		ApplicationPageUtil.typeWithEnt(institutionStudentRefNumber, StudentRefNumber);
		Thread.sleep(2000);
		ElementUtil.doubleClick(annualTuitionFee);
		Thread.sleep(1000);
		ApplicationPageUtil.typeWithEnt(annualTuitionFee, AnnualFee);
		Thread.sleep(2000);
		ApplicationPageUtil.typeWithEnt(annualTuitionFee_inr, AnnualFeeType);
		Thread.sleep(2000);
		appUtil.selectDDOption(nested, Nested);
		Thread.sleep(2000);
		appUtil.selectDDOption(accepted, Accepted);
		Thread.sleep(2000);
		ApplicationPageUtil.typeWithEnt(courseStartDate, CourseStartDate);
		Thread.sleep(2000);
		ApplicationPageUtil.typeWithEnt(courseEndDate, CourseEndDate);
		Thread.sleep(2000);
		ApplicationPageUtil.typeWithEnt(coe_Approved_Date, CourseApprovedDate);
		Thread.sleep(2000);
		ApplicationPageUtil.typeWithEnt(depositPaidDate, DepositePaid);
		Thread.sleep(2000);
		ElementUtil.doubleClick(depositPaidAmount);
		Thread.sleep(1000);
		ApplicationPageUtil.typeWithEnt(depositPaidAmount, DepositeAmount);
		Thread.sleep(2000);
		ApplicationPageUtil.typeWithEnt(depositPaidAmount_inr, DepositeAmountType);
		Thread.sleep(2000);

	}

	public void enterAllTheMadatoryFields_To_FinaliseTrain(String type) throws InterruptedException, IOException {

		String StudentRefNumber = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"StudentRefNumber");
		String AnnualFee = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"AnnualFee");
		String AnnualFeeType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"AnnualFeeType");
		String Nested = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection", "Nested");
		String Nested2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection", "Nested2");
		String Accepted = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection", "Accepted");
		String CourseStartDateTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"CourseStartDateTrain");
		String CourseEndDateTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"CourseEndDateTrain");
		String CourseApprovedDateTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"CourseSelection", "CourseApprovedDateTrain");
		String DepositePaidTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"DepositePaidTrain");
		String DepositeAmount = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"DepositeAmount");
		String DepositeAmountType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"DepositeAmountType");

		ElementUtil.Type(institutionStudentRefNumber, StudentRefNumber);
		Thread.sleep(2000);
		ElementUtil.doubleClick(annualTuitionFee);
		Thread.sleep(1000);
		ElementUtil.Type(annualTuitionFee, AnnualFee);
		Thread.sleep(2000);
		ElementUtil.Type(annualTuitionFee_inr, AnnualFeeType);
		Thread.sleep(2000);
		if (type.equals("No")) {
			ElementUtil.Type(nested, Nested);
			Thread.sleep(2000);
		} else if (type.equals("Yes")) {
			ElementUtil.Type(nested, Nested2);
			Thread.sleep(2000);
		}
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(accepted);
		Thread.sleep(2000);
		ElementUtil.Type(accepted, Accepted);
		Thread.sleep(2000);
		ElementUtil.Type(courseStartDate, CourseStartDateTrain);
		Thread.sleep(2000);
		ElementUtil.Type(courseEndDate, CourseEndDateTrain);
		Thread.sleep(2000);
		ElementUtil.Type(coe_Approved_Date, CourseApprovedDateTrain);
		Thread.sleep(2000);
		ElementUtil.Type(depositPaidDate, DepositePaidTrain);
		Thread.sleep(2000);
		ElementUtil.doubleClick(depositPaidAmount);
		Thread.sleep(1000);
		ElementUtil.Type(depositPaidAmount, DepositeAmount);
		Thread.sleep(2000);
		ElementUtil.Type(depositPaidAmount_inr, DepositeAmountType);
		Thread.sleep(2000);

	}

	public void enterAllTheMadatoryFields_To_FinaliseTrain_OfferAcceptanceNo()
			throws InterruptedException, IOException {

		String StudentRefNumber = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"StudentRefNumber");
		String AnnualFee = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"AnnualFee");
		String AnnualFeeType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"AnnualFeeType");
		String Nested = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection", "Nested");
		String Nested2 = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection", "Nested2");

		String CourseStartDateTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"CourseStartDateTrain");
		String CourseEndDateTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"CourseEndDateTrain");
		String CourseApprovedDateTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"CourseSelection", "CourseApprovedDateTrain");
		String DepositePaidTrain = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"DepositePaidTrain");
		String DepositeAmount = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"DepositeAmount");
		String DepositeAmountType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection",
				"DepositeAmountType");

		ElementUtil.Type(institutionStudentRefNumber, StudentRefNumber);
		Thread.sleep(2000);
		ElementUtil.doubleClick(annualTuitionFee);
		Thread.sleep(1000);
		ElementUtil.Type(annualTuitionFee, AnnualFee);
		Thread.sleep(2000);
		ElementUtil.Type(annualTuitionFee_inr, AnnualFeeType);
		Thread.sleep(2000);
		ElementUtil.Type(nested, Nested);
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementClickable(accepted);
		Thread.sleep(2000);
//		ElementUtil.Type(accepted, Accepted);
//		Thread.sleep(2000);
		ElementUtil.Type(courseStartDate, CourseStartDateTrain);
		Thread.sleep(2000);
		ElementUtil.Type(courseEndDate, CourseEndDateTrain);
		Thread.sleep(2000);
		ElementUtil.Type(coe_Approved_Date, CourseApprovedDateTrain);
		Thread.sleep(2000);
		ElementUtil.Type(depositPaidDate, DepositePaidTrain);
		Thread.sleep(2000);
		ElementUtil.doubleClick(depositPaidAmount);
		Thread.sleep(1000);
		ElementUtil.Type(depositPaidAmount, DepositeAmount);
		Thread.sleep(2000);
		ElementUtil.Type(depositPaidAmount_inr, DepositeAmountType);
		Thread.sleep(2000);

	}

	public static void offerAcceptanceYes() throws InterruptedException, IOException {
		String Accepted = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "CourseSelection", "Accepted");

		ElementUtil.Type(accepted, Accepted);
		Thread.sleep(2000);
	}

}
