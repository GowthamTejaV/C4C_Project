package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

import AppHooks.ApplicationHooks;

public class IC_CounsellorsPage {
	
	public static int beforeDel;
	private static By btn_addCounsellors=By.xpath("//button[@data-help-id='T6zza$ERhaQ9KJO1fHaHdm']");
	private static By drp_partyRole=By.xpath("//div[@data-help-id='UHURPond0qwqTxTEmos7em']//input");
	private static By btn_namePopup=By.xpath("(//div[@data-help-id='t0qwYL2jxaovsTO1yFo9Om']//input//following::div/span)[1]");
	private static By btn_tblDate=By.xpath("//div[@data-help-id='PxGeDyL7tqE6azc_bflpV0']//tbody//tr[1]//td[3]");
	private static By btn_addIdpTeam=By.xpath("//button[@data-help-id='button-ListModification-Add']");
	private static By btn_deleteCounsellor=By.xpath("//div[@data-help-id='ubEtWHL0y4_sklMhWNLqpm']//tbody//tr[1]//td[8]//span");
	
	public static void switchToCounsellorsTab() throws InterruptedException 
	{
		ElementUtil.switchToTab("COUNSELLOR");
	}
	public static void clickAddButtonCounsellors() throws InterruptedException 
	{
		ElementUtil.Click(btn_addCounsellors, "Add counsellor button");
		Thread.sleep(2000);
	}
	public static void fillMandateCounsellor() throws InterruptedException, IOException 
	{
		String PartyRole = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Counsellor","PartyRole");
		
		ElementUtil.Type(drp_partyRole, PartyRole);
		Thread.sleep(2000);
		ElementUtil.Click(btn_namePopup, "Counsellor name popup");
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(btn_tblDate);
		Thread.sleep(2000);
		ElementUtil.Click(btn_tblDate, "Counsellor name table");
		Thread.sleep(2000);
		ElementUtil.Click(btn_addIdpTeam,"Add counsellor button");
		Thread.sleep(2000);
		List <WebElement> counsList=DriverFactory.getDriver().findElements(By.xpath("//div[@data-help-id='ubEtWHL0y4_sklMhWNLqpm']//tbody//tr"));
		beforeDel=counsList.size();
	}
	public static void deleteCounsellors() throws InterruptedException
	{
	
		List <WebElement> counsList=DriverFactory.getDriver().findElements(By.xpath("//div[@data-help-id='ubEtWHL0y4_sklMhWNLqpm']//tbody//tr"));
		System.out.println("Before delete"+counsList.size());
		beforeDel=counsList.size();
		ExtentCucumberAdapter
		.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + "Before delete"+counsList.size()+ "</span>");
		ElementUtil.Click(btn_deleteCounsellor,"Delete counsellor button");
		Thread.sleep(2000);
		
		List <WebElement> counsList1=DriverFactory.getDriver().findElements(By.xpath("//div[@data-help-id='ubEtWHL0y4_sklMhWNLqpm']//tbody//tr"));
		System.out.println("After delete"+counsList1.size());
		ExtentCucumberAdapter
		.addTestStepLog("<span style='color:blue;font-weight:bold;'>" +"After delete"+counsList1.size()+ "</span>");
	}
	public static void swithcToOverviewTab() throws InterruptedException 
	{
		ElementUtil.switchToTab("OVERVIEW");
	}
	public static void verifyOverviewPageIDP() 
	{
		List <WebElement> idpCount=DriverFactory.getDriver().findElements(By.xpath("//div[@data-help-id='95KL1Dm0tKE5xSI699jpz0']//tbody//tr"));
		int counsCount=idpCount.size();
		System.out.println("Number of counsellors in IDP team table "+idpCount.size());
		ExtentCucumberAdapter
		.addTestStepLog("<span style='color:blue;font-weight:bold;'>" +"Number of counsellors in IDP team table "+idpCount.size()+ "</span>");
	
		if(counsCount==beforeDel) 
		{
			System.out.println(counsCount);
			System.out.println("Number of counsellors in IDP team table matched with counsellors tab count ");
			ExtentCucumberAdapter
			.addTestStepLog("<span style='color:green;font-weight:bold;'>" +"Number of counsellors in IDP team table matched with counsellors tab count "+ "</span>");
		}else
		{
			Assert.assertFalse(true);
		}
	}
}
