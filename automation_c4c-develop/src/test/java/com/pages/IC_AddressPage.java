package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

import AppHooks.ApplicationHooks;

public class IC_AddressPage {

	private static By btn_addAddress = By.xpath("//bdi[text()='Add']");
	private static By drp_country = By.xpath("(//bdi[text()='Country/Region']//following::input)[1]");
	private static By txt_houseNo = By.xpath("(//bdi[text()='House Number']//following::input)[1]");
	private static By txt_street = By.xpath("(//bdi[text()='Street']//following::input)[1]");
	private static By txt_city = By.xpath("(//bdi[text()='City']//following::input)[1]");
	private static By txt_state = By.xpath("(//bdi[text()='State']//following::input)[1]");
	private static By txt_postalCode = By.xpath("(//bdi[text()='Postal Code']//following::input)[1]");
	private static By txt_phone = By.xpath("(//bdi[text()='Phone']//following::input)[1]");
	private static By txt_fax = By.xpath("(//bdi[text()='Country/Region']//following::input)[1]");
	private static By btn_addAddressFooter = By.xpath("//button[@data-help-id='button-ListModification-Add']");
	private static By btn_edit = By
			.xpath("//button[@data-help-id='button-CLIENT_GENERATED_ThingAction_DisplayEditToggle']");
	private static By btn_showCommunication = By.xpath("//div[@data-help-id='9e871de9a55e44a5a8ca7225a015f583']");

	public static void switchToAddressTab() throws InterruptedException {
		ElementUtil.switchToTab("ADDRESSES");
	}

	public static void switchToOverviewTab() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.switchToTab("OVERVIEW");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void clickAddAddress() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_addAddress, "New address button");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void fillMandatoryFieldsAddress() throws InterruptedException, IOException {
		String Country = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Address", "Country");
		String HouseNo = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Address", "HouseNo");
		String Street = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Address", "Street");
		String City = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Address", "City");
		String State = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Address", "State");
		String PostalCode = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Address", "PostalCode");
		String Phone = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Address", "Phone");
		String Fax = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Address", "Fax");

		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Type(drp_country, Country);
		Thread.sleep(2000);
		ElementUtil.Type(txt_houseNo, HouseNo);
		Thread.sleep(2000);
		ElementUtil.Type(txt_street, Street);
		Thread.sleep(2000);
		ElementUtil.Type(txt_city, City);
		Thread.sleep(2000);
		ElementUtil.Type(txt_state, State);
		Thread.sleep(2000);
		ElementUtil.Type(txt_postalCode, PostalCode);
		Thread.sleep(2000);
		ElementUtil.Type(txt_phone, Phone);
		Thread.sleep(2000);
//		ElementUtil.Type(txt_fax,Fax);
//		Thread.sleep(2000);
	}

	public static void addAddressFooter() throws InterruptedException {
		ElementUtil.Click(btn_addAddressFooter, "Address button in footer");
		Thread.sleep(2000);
	}

	public static void clickEdit() throws InterruptedException {
		ElementUtil.Click(btn_edit, "Edit button");
		Thread.sleep(2000);
	}

	public static void verifyAddressTab() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		boolean showToggle = DriverFactory.getDriver().findElement(btn_showCommunication).isSelected();
		if (showToggle == false) {
			System.out.println("Show communication Toggle not enabled");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Show communication Toggle not enabled" + "</span>");
			try {
				// ElementUtil.switchToTab("ADDRESSES");
				System.out.println("Address tab not enabled");
				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue;font-weight:bold;'>" + "Address tab not enabled" + "</span>");
			} catch (Exception e) {
				System.out.println("Address tab not enabled");
				ExtentCucumberAdapter.addTestStepLog(
						"<span style='color:blue;font-weight:bold;'>" + "Address tab not enabled" + "</span>");
			}
		} else {
			System.out.println("Show communication Toggle already enabled");
			ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
					+ "Show communication Toggle already enabled" + "</span>");
		}

	}
}
