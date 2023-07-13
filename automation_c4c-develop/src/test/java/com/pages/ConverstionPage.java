package com.pages;

import org.openqa.selenium.By;

import com.qa.util.ElementUtil;

public class ConverstionPage {
	private static By aero_down = By.xpath("//button[@title='slim-arrow-down']");
	private static By lbl_ConversionTab = By
			.xpath("//ul[@role='listbox']//li/span[contains(text(),'CONVERSION')]//parent::li");
	private static By lbl_firstRecord = By.xpath("//div[@data-help-id='ow74rdLEIaYihODxS27KJm']//tbody/tr/td[2]/div/a");

	public void switchToConversionTab() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.click(aero_down);
		Thread.sleep(3000);
		ElementUtil.scrollToElement(lbl_ConversionTab);
		ElementUtil.click(lbl_ConversionTab);
	}

	public void selectFirstRecord() throws InterruptedException {
		ElementUtil.waitForElementClickable(lbl_firstRecord);
		Thread.sleep(5000);
		ElementUtil.doubleClick(lbl_firstRecord);
	}

}
