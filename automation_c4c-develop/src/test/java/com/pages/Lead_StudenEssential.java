package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.WaitsUtil;

public class Lead_StudenEssential {
	private By addBtnSE = By.xpath(".//*[@data-help-id='oq88oj7g04IT2Bu2sw9G7m']");

	private By ProductCategoryIDLookup = By.xpath(
			".//*[@data-help-id='$AZL3I2ie46oZLEgRt6FaW']//span/parent::div/preceding-sibling::input/parent::div//span");

	private By searchButton_ProductCategoryIDLookup = By
			.xpath(".//*[@data-help-id='i5tmlgYaI46_krLLMhiaMG-searchButton']");

	private By searchText_ProductCategoryIDLookup = By
			.xpath(".//*[@data-help-id='i5tmlgYaI46_krLLMhiaMG-searchField']//input");

	private By selecctProductCategory = By
			.xpath(".//*[@data-help-id='i5tmlgYaI46_krLLMhiaMG-scrollContainer']//tr/parent::tbody/tr[1]");

	private By productLookup = By.xpath(
			".//*[@data-help-id='7aohD8JFBKAqytHgrDgoY0']//span/parent::div/preceding-sibling::input/parent::div//span");

	private By selectProduct = By.xpath(".//*[@data-help-id='vfLXnJyFoqkm9oOYMr_aVW']//tr/parent::tbody/tr[1]");

	private By addProduct = By.xpath(".//*[@data-help-id='button-ListModification-Add']");

	private By saveSE = By.xpath(".//*[@data-help-id='ri5eGNT8EK_NrSYPtZASbW']");
	private By selectedProducts = By.xpath(
			"//tbody//tr//div[@aria-checked='true']//div/parent::div/parent::td/parent::tr//td//span[@data-help-id='VFb_jiktsKAR0DaqR$QXk0']");

	public List<WebElement> getAllSelected_Products() {

		ApplicationPageUtil.waitForLoadGetDisappiear();
		WaitsUtil.explicit_Wait(selectedProducts);
		List<WebElement> els = DriverFactory.getDriver().findElements(selectedProducts);
		return els;
	}

	public void Remove_Selected_Product() {
		try {
			for (WebElement ele : getAllSelected_Products()) {
				Thread.sleep(2500);
				ele.click();
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void add_Button_SE() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(addBtnSE);
	}

	public void click_product_CategoryID_LookUp() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(ProductCategoryIDLookup);
	}

	public void search_for_ProductCategory(String searchText) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1200);
			ElementUtil.click(searchButton_ProductCategoryIDLookup);
			Thread.sleep(1200);
			ElementUtil.type(searchText_ProductCategoryIDLookup, searchText);
			Thread.sleep(1200);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public void select_ProductCategory() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1500);
			ElementUtil.click(selecctProductCategory);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void click_productField_Lookup() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1500);
			ElementUtil.click(productLookup);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void select_Product() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1500);
			ElementUtil.click(selectProduct);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void add_Product() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1500);
			ElementUtil.click(addProduct);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void svae_SE() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1500);
			ElementUtil.click(saveSE);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public void addproduct_To_SE() {

		add_Product();

	}

}
