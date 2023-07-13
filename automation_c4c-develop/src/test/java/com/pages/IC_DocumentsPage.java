package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;

public class IC_DocumentsPage {
	private static By docTab = By.xpath(".//*[@data-help-id='NAVIGATIONITEMID_66f9e4ba78cf427282057551c3eb46f7']");
	private static By btn_upload = By.xpath("//div[text()='browse ']");
	private static By fm_fileUpload = By.xpath(".//*[@name='__page3-iframe']");
//	private static By btn_upload2 = By.xpath("//button[@class='btn btn-primary']");
	private static By chk_selectAll = By
			.xpath("//span[text()='Select all']//preceding::span[@class='mat-checkbox-inner-container']");
	private static By chk_uploadedFile = By.xpath("//span[text()='AcademicTranscriptsor']");
	private static By drp_selectCategory = By.xpath("//span[text()='Select category']");
	private static By drp_Category = By.xpath("//div[@role='listbox']//mat-option[2]");
	private static By drp_docType = By.xpath("//span[text()='Select document type']");
	private static By btn_uploadSubmit = By.xpath("//div[@class='upldbtn_sbmit']//button[text()='Confirm & upload']");
	private static By txt_loader = By.xpath("//div[@class='tbwrp']//following::div[1]//p[text()='Loading...']");
	private static By btn_close = By.xpath("//button[text()='Close']");
//	private static By btn_reupload = By.xpath("//span[text()='file_upload ']//input[1]");
//	private static By btn_reupload2 = By.xpath("//span[text()='file_upload ']");
//	private static By aero_down = By.xpath("//button[@title='slim-arrow-down']");
//	private static By lbl_DocTab = By.xpath("//ul[@role='listbox']//li/span[contains(text(),'DOCUMENTS')]//parent::li");
//	private static By lbl_DocManageTab = By
//			.xpath("//ul[@role='listbox']//li/span[contains(text(),'DOCUMENT MANAGEMENT')]//parent::li");
//	private static By btn_Passport = By.xpath("//input[@title='Passport']");
//	private static By btn_check = By.xpath("//input[@type='checkbox' and @aria-checked='false']");
//	private static By btn_check2=By.xpath("//button[text()=' check ']");

	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	public void switchDocumentsTab() throws InterruptedException {
		ElementUtil.switchToTab("DOCUMENTS");
	}

	public void navigateToDMtab() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(docTab);
	}

//use
	public void switchDocumentsManageTab() throws InterruptedException {
		
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.scrollToElement(docTab);
			ElementUtil.click(docTab);
	}

	public WebElement getEle() {
		WebElement ele = DriverFactory.getDriver().findElement(fm_fileUpload);
		return ele;
	}
	// use

	public void uploadDocument() throws InterruptedException, AWTException, IOException {

		Thread.sleep(2000);
		DriverFactory.getDriver().switchTo().frame(0);
		Thread.sleep(2000);
		DriverFactory.getDriver().switchTo().frame("dms-frame");
		Thread.sleep(5000);

		String path = System.getProperty("user.dir");
		String PropertyFileName = path + "//src//test//resources//Data//TestFiles//AcademicTranscriptsor.pdf";
//
//		try {
//			DriverFactory.getDriver().switchTo().frame("__page2-iframe");
//		} catch (Exception e) {
//			DriverFactory.getDriver().switchTo().frame("__page3-iframe");
//		}

		// StringSelection s = new StringSelection("C:\\Users\\gowtham.teja\\OneDrive -
		// IDP Education
		// Ltd\\Documents\\Documentmanagement\\AcademicTranscriptsor.pdf");
//		StringSelection s = new StringSelection(PropertyFileName);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//		Thread.sleep(5000);
//
//		ElementUtil.click(btn_upload);
//		Thread.sleep(5000);
//
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		Thread.sleep(2000);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);

		// String filepath = path + "\\src\\test\\resources\\Data\\TestFiles\\Doc1.pdf";
		DriverFactory.getDriver().findElement(By.xpath("//input[@id='file']")).sendKeys(PropertyFileName);

		ElementUtil.waitForElementClickable(chk_selectAll);
		ElementUtil.click(chk_selectAll);
		Thread.sleep(2000);
		ElementUtil.click(chk_uploadedFile);
		Thread.sleep(2000);
		ElementUtil.scrollToElement(drp_selectCategory);
		Thread.sleep(2000);
		ElementUtil.click(drp_selectCategory);
		Thread.sleep(2000);
		ElementUtil.click(drp_Category);
		Thread.sleep(2000);
		ElementUtil.click(drp_docType);
		Thread.sleep(2000);
		ElementUtil.click(drp_Category);
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(btn_uploadSubmit);
		ElementUtil.click(btn_uploadSubmit);
		Thread.sleep(2000);
		ElementUtil.waitForElementNotPresent(txt_loader);
		ElementUtil.waitForElementClickable(btn_close);
		Thread.sleep(2000);
		ElementUtil.click(btn_close);
		Thread.sleep(2000);
		ElementUtil.waitForElementNotPresent(txt_loader);

	}

}
