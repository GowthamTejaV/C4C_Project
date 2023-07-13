package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class IC_NotesPage {
	private static By aero_down = By.xpath("//button[@title='slim-arrow-down']");
	private static By lbl_notesTab = By.xpath("//ul[@role='listbox']//li/span[contains(text(),'NOTES')]//parent::li");
	private static By saveButton = By.xpath(".//bdi[text()='Save']");
	private static By btn_textArea = By.xpath("//div[@data-help-id='bCT8CGRYMaMXXD2LIjYf00']//textarea");
	private static By btn_textAreaEdit = By.xpath("//div[@data-help-id='$0rx27A7mKk4T6xMVJXy$m']//textarea");
	private static By li_Notes = By.xpath("//div[@data-help-id='QAhY8MoV84EVkFPW_gN5t0']//ul//li");
	private static By btn_editNote = By
			.xpath("//div[@data-help-id='QAhY8MoV84EVkFPW_gN5t0']//ul//li[1]//span[text()='edit']/..");
	private static By btn_deleteNote = By
			.xpath("//div[@data-help-id='QAhY8MoV84EVkFPW_gN5t0']//ul//li[1]//span[text()='Delete']/..");
	private static By btn_okEditNote = By.xpath("//bdi[text()='OK']");
	private static By lbl_verifyEdit = By.xpath(
			"(//div[@data-help-id='bCT8CGRYMaMXXD2LIjYf00']//ul//li[1]//div[@class='sapMPanelExpandablePart']//span)[1]");
	private static By btn_delete = By.xpath("//bdi[text()='Delete']");
	private static By btn_collapseAll = By.xpath("//bdi[text()='Collapse All']");
	private static By btn_expandAll = By.xpath("//bdi[text()='Expand All']");

	public static void switchToNotesTab() throws InterruptedException {
//		ElementUtil.waitForPageLoad();
//		Thread.sleep(5000);
//		ElementUtil.waitForElementClickable(aero_down);
//		ElementUtil.click(aero_down);
//		ElementUtil.scrollToElement(lbl_notesTab);
//		ElementUtil.click(lbl_notesTab);
//		Thread.sleep(2000);

		ElementUtil.switchToTab("NOTES");
	}

	public static void verifyNotes() throws InterruptedException, IOException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.click(btn_textArea);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.doubleClick(btn_textArea);
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		ElementUtil.Type(btn_textArea, "This is a test note");
		Thread.sleep(2000);
		ElementUtil.Click(saveButton, "Save notes button");
		Thread.sleep(2000);
		ElementUtil.verifyHeaderMessage("Your entries have been saved");
		Thread.sleep(2000);

	}

	public static void enterparaNote() throws InterruptedException, IOException, AWTException {

		
		for (int i = 1; i <= 2; i++) {
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			ElementUtil.doubleClick(btn_textArea);
			Thread.sleep(2000);
			ElementUtil.doubleClick(btn_textArea);
			ElementUtil.waitForPageLoad();
			Thread.sleep(2000);
			for (int j = 1; j <= 10; j++) {
				ElementUtil.TypeWithoutClear(btn_textArea, "This is a test note " + j);
				Thread.sleep(1000);
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}

			ElementUtil.Click(saveButton, "Save notes button");
			Thread.sleep(2000);
			ElementUtil.verifyHeaderMessage("Your entries have been saved");
			Thread.sleep(2000);
		}

	}

	public static void clickCollapseAll() throws InterruptedException {
		ElementUtil.Click(btn_collapseAll, "CollapseAll button");
		Thread.sleep(2000);
		try 
		{
			ElementUtil.Click(btn_collapseAll, "CollapseAll button");
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			Thread.sleep(2000);
		}
	}

	public static void clickExpandAll() throws InterruptedException {
		try {
			ElementUtil.Click(btn_expandAll, "ExpandAll button");
			Thread.sleep(2000);
		} catch (Exception e) {
			ElementUtil.Click(btn_collapseAll, "CollapseAll button");
			Thread.sleep(2000);
			ElementUtil.Click(btn_expandAll, "ExpandAll button");
			Thread.sleep(2000);
		}
	}

	public static void verifyEditDeleteNotes() throws InterruptedException, IOException {
		// edit note
		ElementUtil.Click(btn_editNote, "Edit Note button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_textAreaEdit, " Edit Text area");
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		String editNote = "This is a edited test note";
		ElementUtil.Type(btn_textAreaEdit, editNote);
		Thread.sleep(2000);
		ElementUtil.Click(btn_okEditNote, "Ok button in edit note");
		Thread.sleep(2000);
		ElementUtil.waitForPageLoad();
		ElementUtil.Click(saveButton, "Save notes button");
		Thread.sleep(2000);
		String verifyEdited = DriverFactory.getDriver().findElement(lbl_verifyEdit).getText();
		if (verifyEdited.equals(editNote)) {
			System.out.println("Edited notes updated");
			ExtentCucumberAdapter
					.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + "Edited notes updated" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
		ElementUtil.verifyHeaderMessage("Your entries have been saved");
		Thread.sleep(2000);

		// delete
		List<WebElement> noteList = DriverFactory.getDriver().findElements(li_Notes);
		int noteCount = noteList.size();
		System.out.println("Number of notes before delete is : " + noteCount);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "Number of notes before delete is : " + noteCount + "</span>");

		ElementUtil.Click(btn_deleteNote, "Delete Note button");
		Thread.sleep(2000);
		ElementUtil.Click(btn_delete, "Delete Confirmation button");
		Thread.sleep(2000);

		List<WebElement> noteList1 = DriverFactory.getDriver().findElements(li_Notes);
		int noteCount1 = noteList1.size();
		System.out.println("Number of notes after delete is : " + noteCount1);
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>"
				+ "Number of notes after delete is : " + noteCount1 + "</span>");

	}

}
