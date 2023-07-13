package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class IC_SmsPage {
	public static String Message = "";
	public static String msg = "";

	private static By btn_new = By.xpath("(//bdi[text()='New']//..)[1]");
	private static By txt_newMessage = By.xpath("//div[@data-help-id='rM8thV2Yp4k22knwAg6S2W']//following::textarea");
	private static By btn_send = By.xpath("(//bdi[text()='Send']//..)[1]");
	private static By tbl_verifyText = By.xpath("//div[@data-help-id='2QUfX5cA44UT8CUSPos7Nm']//tbody//td//a");

	public static void switchToSmsTab() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.switchToTab("SMS");
		Thread.sleep(2000);

	}

	public static void click_NewButton() throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_new, "New sms button");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void Type_NewMessage() throws InterruptedException, IOException {
		Message = ElementUtil.generateRandomStringWithLowercase(10);

		ElementUtil.Type(txt_newMessage, "Test Message :" + Message);
		Thread.sleep(2000);
	}

	public static void Type_NewMessage_MultiLines() throws InterruptedException, IOException, AWTException {
		Message = ElementUtil.generateRandomStringWithLowercase(50);

		ElementUtil.TypeWithoutClear(txt_newMessage, "Test Message :" + Message);
		Thread.sleep(2000);

		DriverFactory.getDriver().findElement(txt_newMessage).sendKeys(Keys.ENTER);
		ElementUtil.TypeWithoutClear(txt_newMessage, "Test Message :" + Message);
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(txt_newMessage).sendKeys(Keys.ENTER);
		DriverFactory.getDriver().findElement(txt_newMessage).sendKeys(Keys.ENTER);
		ElementUtil.TypeWithoutClear(txt_newMessage, "Test Message :" + Message);
		Thread.sleep(2000);
	}

	public static void click_SendButton() throws InterruptedException {
		ElementUtil.Click(btn_send, "Send sms button");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
	}

	public static void verify_SentMessage() throws InterruptedException {
		List<WebElement> messageList = DriverFactory.getDriver().findElements(tbl_verifyText);
		boolean flag = false;
		for (WebElement getMessage : messageList) {
			msg = getMessage.getText();
			if (msg.contains(Message)) {
				System.out.println("Pass:" + Message);
				flag = true;

			}
		}
		if (!flag) {
			Assert.assertFalse(true, Message);
		}


	}

}
