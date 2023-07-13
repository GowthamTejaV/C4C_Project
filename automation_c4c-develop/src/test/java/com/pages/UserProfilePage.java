package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.qa.util.ElementUtil;

public class UserProfilePage {

	private static By btn_userProfile = By.xpath("//div[@data-help-id='mainBar-UserMenu-Button']");
	private static By btn_userProfileHyperlink = By.xpath("//div[@role='dialog']//header//a");
	private static By btn_MoreExapand = By.xpath("(//bdi[text()='More'])[1]");
	private static By btn_edit = By.xpath("//button[@title='Edit']");
	private static By drp_country = By.xpath("//div[@data-help-id='TOJWKX07Q4ooitd$nZQwKW']//input");

	public static void clickUserProfile() throws InterruptedException {

		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_userProfile, "User profile icon");
		Thread.sleep(2000);
	}


	public static void clickUserProfileLink() throws InterruptedException {

		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_userProfileHyperlink, "User profile hyperlink");
		Thread.sleep(2000);
	}
	public static void clickMore() throws InterruptedException {

		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Click(btn_MoreExapand, "More expand button");
		Thread.sleep(2000);
	}

	public static void clickEdit() throws InterruptedException {
		ElementUtil.Click(btn_edit, "Edit button");
		Thread.sleep(2000);
	}

	public static void selectCountry(String countryName) throws InterruptedException, IOException {
		if (countryName.equals("Australia")) {
			ElementUtil.Type(drp_country, "AU - Australia");
			Thread.sleep(2000);
		} else if (countryName.equals("India")) {
			ElementUtil.Type(drp_country, "IN - India");
			Thread.sleep(2000);
		}

	}

}
