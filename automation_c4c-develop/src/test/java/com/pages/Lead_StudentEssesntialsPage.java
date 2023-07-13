package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.ElementUtil;

import AppHooks.ApplicationHooks;

public class Lead_StudentEssesntialsPage {
	private static By btn_addProduct = By.xpath("//button[@data-help-id='oq88oj7g04IT2Bu2sw9G7m']");
	private static By btn_productCategoryPopup = By
			.xpath("(//div[@data-help-id='$AZL3I2ie46oZLEgRt6FaW']//following::span)[1]");
	private static By tbl_productCategory = By
			.xpath("//div[@data-help-id='8AdWUuop0K6MU2rO$YigW0']//tbody//tr[1]//td[2]");
	private static By btn_productPopup = By
			.xpath("(//div[@data-help-id='7aohD8JFBKAqytHgrDgoY0']//following::span)[1]");
	private static By tbl_product = By.xpath("//div[@data-help-id='vfLXnJyFoqkm9oOYMr_aVW']//tbody//tr[1]//td[2]");
	private static By btn_addProductbutton = By.xpath("(//bdi[text()='Add'])[1]");
	private static By btn_searchProductCategory = By
			.xpath("//button[@data-help-id='i5tmlgYaI46_krLLMhiaMG-searchButton']");
	private static By txt_searchProductCateogry = By
			.xpath("//div[@data-help-id='i5tmlgYaI46_krLLMhiaMG-searchButtonPopOver']//input");
	private static By btn_searchProduct = By.xpath("//button[@data-help-id='_woXkUGK8qgYAO2SXr1JgG-searchButton']");
	private static By txt_searchProduct = By.xpath("//div[@data-help-id='_woXkUGK8qgYAO2SXr1JgG-searchField']//input");
	private static By drp_productStatus = By.xpath("//div[@data-help-id='NnuGPtoAgqw5Icrpbj$_t0']//input");
	private static By txt_paymentAmount = By.xpath("//div[@data-help-id='u4cySRGCMKgJ3lxRnWQLuG']//input");
	private static By txt_paymentType = By.xpath("//div[@data-help-id='AqdrE8pbH4IksCMlSpMl3G']//input");
	private static By Tab_StudentEssesntial = By.xpath(".//*[@role='tablist']//div[text()='STUDENT ESSENTIAL']");
	private static By Tab_StudentEssesntials = By.xpath(".//*[@role='tablist']//div[text()='STUDENT ESSENTIALS']");
	public static void switchToStudentEssesntial() throws InterruptedException {
		// ElementUtil.switchToTab("STUDENT ESSENTIAL");
		try 
		{
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.scrollToElement(Tab_StudentEssesntial);
			ElementUtil.Click(Tab_StudentEssesntial, "Student Essesntial Tab");
		}catch(Exception e) 
		{
			ElementUtil.switchToTab("STUDENT ESSENTIAL");
		}
		
	}
	public static void switchToStudentEssesntials() throws InterruptedException {
		// ElementUtil.switchToTab("STUDENT ESSENTIAL");
		try 
		{
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.scrollToElement(Tab_StudentEssesntials);
			ElementUtil.Click(Tab_StudentEssesntials, "Student Essesntials Tab");
		}catch(Exception e) 
		{
			ElementUtil.switchToTab("STUDENT ESSENTIALS");
		}
		
	}

	public static void addProductbutton() throws InterruptedException, IOException {
		ElementUtil.Click(btn_addProduct, "Add product button");
		Thread.sleep(2000);
	}

	public static void addProduct() throws InterruptedException, IOException {
		String ProductCategorySearch = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads",
				"ProductCategorySearch");
		String ProductSearch = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "ProductSearch");

		ElementUtil.Click(btn_productCategoryPopup, "Product category popup");
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(tbl_productCategory);
		Thread.sleep(2000);
		ElementUtil.Click(btn_searchProductCategory, "Search Product category button");
		Thread.sleep(2000);
		ElementUtil.Type(txt_searchProductCateogry, ProductCategorySearch);
		Thread.sleep(2000);
		ElementUtil.Click(tbl_productCategory, "Product category data");
		Thread.sleep(2000);

		ElementUtil.Click(btn_productPopup, "Product popup");
		Thread.sleep(2000);
		ElementUtil.waitForElementClickable(tbl_product);
		Thread.sleep(2000);
		ElementUtil.Click(btn_searchProduct, "Search Product button");
		Thread.sleep(2000);
		ElementUtil.Type(txt_searchProduct, ProductSearch);
		Thread.sleep(2000);
		ElementUtil.Click(tbl_product, "Product data");
		Thread.sleep(2000);

		ElementUtil.Click(btn_addProductbutton, "Product button");
		Thread.sleep(2000);
	}

	public static void enterMandatoryFields() throws InterruptedException, IOException {
		String ProductStatus = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "ProductStatus");
		String PaymentAmount = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "PaymentAmount");
		String PaymentType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Leads", "PaymentType");

		ElementUtil.Type(drp_productStatus, ProductStatus);
		Thread.sleep(2000);
		ElementUtil.Type(txt_paymentAmount, PaymentAmount);
		Thread.sleep(2000);
		ElementUtil.Type(txt_paymentType, PaymentType);
		Thread.sleep(2000);

	}

}
