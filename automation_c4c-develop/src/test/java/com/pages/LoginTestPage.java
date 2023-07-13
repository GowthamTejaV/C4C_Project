package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.qa.util.ElementUtil;

public class LoginTestPage {
	public static By username = By.xpath("//input[@id='USERNAME_FIELD-inner']");
	public static By password = By.xpath("//input[@id='PASSWORD_FIELD-inner']");
	public static By signIn = By.xpath("//button/span[text()='Sign In']");
	public static By Loading = By.xpath("//div[contains(@class,'sapUiLocalBusyIndicatorAnimation')]");
	public static By btn_GlobalAdd = By.xpath("//button[@data-help-id='globalCreateButton']");

	public static void launchURl(String url) throws InterruptedException {
		ElementUtil.navigateToURL(url);
		Thread.sleep(1000);
	}

	public static void enterUsername(String user_name, String pass_word) throws InterruptedException {
		ElementUtil.type(username, user_name);
		Thread.sleep(1000);
		ElementUtil.type(password, pass_word);
		Thread.sleep(1000);
	}

	public static void clickSignin() throws InterruptedException {
		ElementUtil.click(signIn);
		ElementUtil.waitForElementClickable(btn_GlobalAdd);
		Thread.sleep(5000);
	}

}
