package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.ElementUtil;

import AppHooks.ApplicationHooks;

public class OP_ManualApplicationPage {
	private static By txt_instituteName = By.xpath("//div[@data-help-id='19be8975afcc4863d66c6934696b8985']//input");
	private static By txt_programName = By.xpath("//div[@data-help-id='341888b7ff3d41604b604bb864fde466']//input");
	private static By txt_programStartDate = By.xpath("//div[@data-help-id='012361f991589f3e3dce9ecada6f6da3']//input");
	private static By drp_reasonForManual = By.xpath("//div[@data-help-id='8cd57bb18be1071a13b7accdb43e768f']//input");
	private static By btn_save = By.xpath("//button[@data-help-id='fTMr5KSpcKYD_PKI0YkMC0']");
	private static By aleart_Ok = By.xpath(".//*[text()='OK']");

	public static void fillMandatoryManualApplication() throws InterruptedException, IOException {

		String InstituteName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ManualApplication",
				"InstituteName");
		String ProgramName = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ManualApplication",
				"ProgramName");
		String ProgramStartDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ManualApplication",
				"ProgramStartDate");
		String ReasonForManual = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ManualApplication",
				"ReasonForManual");
		ElementUtil.Type(txt_instituteName, InstituteName);
		Thread.sleep(2000);
		ElementUtil.Type(txt_programName, ProgramName);
		Thread.sleep(2000);
		ElementUtil.Type(txt_programStartDate, ProgramStartDate);
		Thread.sleep(2000);
		ElementUtil.Type(drp_reasonForManual, ReasonForManual);
		Thread.sleep(2000);
		ElementUtil.Click(btn_save, "Save button");
		Thread.sleep(2000);
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(aleart_Ok);
			Thread.sleep(8000);
			ApplicationPageUtil.waitForLoadGetDisappiear();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void switchManualApplicationTab() throws InterruptedException {

		ElementUtil.waitForPageLoad();
		ElementUtil.switchToTab("MANUAL APPLICATION");
		Thread.sleep(2000);
	}

}
