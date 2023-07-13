package com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class IC_MarkettingPermisionPage {

	public static String text = "";
	private static By btn_optIn = By
			.xpath("(//div[@data-help-id='BjEAWra$wK23GPIO$POjC0']//tbody//tr[1]//td[5]//span)[1]");
	private static By btn_optOut = By
			.xpath("(//div[@data-help-id='BjEAWra$wK23GPIO$POjC0']//tbody//tr[1]//td[5]//span)[2]");
	private static By btn_undefined = By
			.xpath("(//div[@data-help-id='BjEAWra$wK23GPIO$POjC0']//tbody//tr[1]//td[5]//span)[3]");
	private static By lbl_text = By
			.xpath("(//div[@data-help-id='BjEAWra$wK23GPIO$POjC0']//tbody//tr[1]//td[3]//span)[1]");

	public static void switchToMarkettingPermission() throws InterruptedException {
		ElementUtil.switchToTab("MARKETING PERMISSIONS");
	}

	public static void clickOptInSection() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_optIn, "Opt-in button ");
		Thread.sleep(2000);
		text = DriverFactory.getDriver().findElement(lbl_text).getText();
		if (text.equals("Opt-In")) {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Current status :" + text + "\n" + "</span>");
		} else {
			Assert.assertFalse(true);
		}

	}

	public static void clickOptOutSection() throws InterruptedException {
		ElementUtil.Click(btn_optOut, "Opt-out button ");
		Thread.sleep(2000);
		text = DriverFactory.getDriver().findElement(lbl_text).getText();
		if (text.equals("Opt-Out")) {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Current status :" + text + "\n" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void clickUndefinedSection() throws InterruptedException {
		ElementUtil.Click(btn_undefined, "Undefined button ");
		Thread.sleep(2000);
		text = DriverFactory.getDriver().findElement(lbl_text).getText();
		if (text.equals("Undefined")) {
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Current status :" + text + "\n" + "</span>");
		} else {
			Assert.assertFalse(true);
		}

	}
}
