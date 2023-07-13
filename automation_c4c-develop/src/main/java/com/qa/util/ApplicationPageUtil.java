package com.qa.util;

import java.io.IOException;
import java.time.Duration;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class ApplicationPageUtil {

	private By unlock_object = By.xpath(".//bdi[text()='Yes']");
	private By errorMsgCancel = By.xpath(
			"(.//*[@data-help-id='messageBar-headerMessage']/following-sibling::span[@role=\"presentation\"])[2]");

	private By global_SearchIcon = By.xpath(".//*[@data-help-id='mainBar-Search-Button']");
	private By global_SearchText = By.xpath(".//*[@placeholder='Search']");

	private By selectTheGlobalSearchRecord = By.xpath(".//*[@class='card-title']");

	/*******************************************************************************/

	public static WebElement lbl_TabTitle;
	private static By username = By.xpath("//input[@id='USERNAME_FIELD-inner']");
	private static By password = By.xpath(".//input[@placeholder='Password']");
	private static By password2 = By.xpath(".//input[@placeholder]");
	private static By signIn = By.xpath("//button[@type=\"submit\"]");
	private static By hamburgerMenu = By.xpath(".//*[@data-help-id='mainBar-Hamburger-Button']");
	private By eleOption = By.xpath("//div[contains(@style,'display: block')]//ul/li//div[@class='sapMSLITitleOnly']");
	private By dropDownValueIsselected = By.xpath(
			"//div[contains(@style,'display: block')]//ul/li//div[@class='sapMSLITitleOnly']/parent::div/parent::div/preceding-sibling::div[@aria-checked='true']");
	private static By lbl_drpList = By.xpath("//div[@role='dialog' and contains(@style,'visibility: visible')]");
	private static By aero_down = By.xpath("//button[@title='slim-arrow-down']");

	/****************************************/

	// IC_CreationPage ic=new IC_CreationPage(DriverFactory.getDriver());

	// Global Search
	public void global_Search(String txt) {

		try {
			ElementUtil.click(global_SearchIcon);
			typeWithEnt(global_SearchText, txt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// click on global search record
	public void click_On_GlobalSearchRecord() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(selectTheGlobalSearchRecord);
		// IC_CreationPage ic=new IC_CreationPage();
		// ic.more_button_On_IC_OverviewPage();
	}

	// Unlock object

	public void click_Yes_Button_to_Unlock_Object_If_Visible() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(15));

			if (DriverFactory.getDriver().findElement(unlock_object).isDisplayed()) {
				DriverFactory.getDriver().findElement(unlock_object).click();
			}

			if (DriverFactory.getDriver().findElement(errorMsgCancel).isDisplayed()) {
				DriverFactory.getDriver().findElement(errorMsgCancel).click();
			}
		} catch (Exception ex) {

		}

	}

	// navigate and login to the C4C Licensee User
	public void loginTotheApplicatio_C4C_Licensee_User(String user_name, String pass_word, String url) {

		try {
			// ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.navigateToURL(url);
			String psw = decryption(pass_word);
			ElementUtil.type(username, user_name);
			ElementUtil.type(password, psw);
			System.out.println("PSW:-"+psw);
			ElementUtil.click(signIn);
		} catch (Exception e) {

			Assert.assertFalse(true, "FAILED:- to login: " + e.toString());
		}
	}

	public void type_KeysEnter(By by, String txt) {
		try {
			ElementUtil.type(by, txt);
			DriverFactory.getDriver().findElement(by).sendKeys(Keys.ENTER);
		} catch (StaleElementReferenceException ex) {
			// DriverFactory.getDriver().findElement(by).
			ElementUtil.type(by, txt);
			DriverFactory.getDriver().findElement(by).sendKeys(Keys.ENTER);
		}
	}

	// This function is used to click and enter the input to the field

	/*
	 * WebDriver driv = driver; ApplicationPageUtil.waitForLoadGetDisappiear();
	 * WebElement element = driv.findElement(by); WaitsUtil.explicit_Wait(element);
	 * try { element.clear(); } catch (StaleElementReferenceException e) { try {
	 * element.clear(); } catch (StaleElementReferenceException ex) {
	 * element.clear(); } } catch (Exception ex) {
	 * System.out.println(ex.getMessage()); } try { element.sendKeys(value); } catch
	 * (StaleElementReferenceException e) { element.sendKeys(value); }
	 * 
	 * try { element.sendKeys(Keys.ENTER); } catch (StaleElementReferenceException
	 * e) { element.sendKeys(Keys.ENTER); } catch (ElementClickInterceptedException
	 * ex) { ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
	 * driver.findElement(by)); } catch (Exception ex) {
	 * System.out.println(ex.getMessage()); }
	 */

	/*****************************************************************************************/
	public static HashMap<String, String> data = null;

//	public ApplicationPageUtil(WebDriver driver) {
//		this.driver = DriverFactory.getDriver();
//	}

	public void SelectDropDownChechBox(By by, String str) {
		click_on_Action(by);
		ApplicationPageUtil.waitForLoadGetDisappiear();
		List<WebElement> wbele = DriverFactory.getDriver().findElements(eleOption);
		for (WebElement ele : wbele) {
			String sr = ele.getText().trim();
			if (sr.equals(str)) {
				ele.click();
				break;
			}
		}
	}

	public void click_on_Action(By by) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(by);
	}

	public static void waitForLoadGetDisappiear() {
		ElementUtil.waitForElementNotPresent(By.xpath("//div[@role='progressbar']"));

	}

	private By getElementOfTab_BY_Text(String entertext) {
		By tabname = By.xpath("//div[@id='__layout10']//a[text()='" + entertext + "']");
		return tabname;
	}

	// this method is used to get the xpath of element for drop down name based on
	// text as a input
	public static By getDropdownElement(String entertext) {

		By dropdown_element = By.xpath("//span[@title='" + entertext + "']");
		return dropdown_element;
	}

	// this method is used to get the xpath of element under the drop down based on
	// text as a input
	public static By getValueFromDropDown(String enterTab_name) {
		By dropdown_element = By.xpath("//a[@title='" + enterTab_name + "']");
		return dropdown_element;
		// div[@id='__layout10']//a[text()='Individual Customers']
	}

	// this method is used to click on hamburger menu in the Home Screen

	public static void clickOn_Hamburgermenu() {
		try {
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			// Thread.sleep(4200);
			ElementUtil.click(hamburgerMenu);
			// WebElement hamburgMenu = driver.findElement(hamburgerMenu);
			// hamburgMenu.click();
		} catch (Exception e) {
			Assert.assertFalse(true, "FAILED:- to Click on the Hamburgermenu: " + e.toString());
		}
	}

	// this method is used to click the tab under category in hamburger menu
	public void clickTab_underCategory(String category, String tabname) {
		try {
			// ApplicationPageUtil.waitForLoadGetDisappiear();
			clickOn_Hamburgermenu();
			// select the drop down
			WebElement dropdown_value = DriverFactory.getDriver().findElement(getDropdownElement(category));
			JavascriptExecutor js3 = (JavascriptExecutor) DriverFactory.getDriver();
			js3.executeScript("arguments[0].click()", dropdown_value);
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			// select the drop down value
			WebElement dropdown_value1 = DriverFactory.getDriver().findElement(getValueFromDropDown(tabname));
			JavascriptExecutor js4 = (JavascriptExecutor) DriverFactory.getDriver();
			js4.executeScript("arguments[0].click()", dropdown_value1);
			Thread.sleep(5000);
		} catch (Exception e) {
			Assert.assertFalse(true, "FAILED:-to Click on the tab under category:" + e.toString());
		}

	}

	// this method is used to click tab under the hamburger menu
	public void clickOntheTab(String tabname) {
		try {
			ElementUtil.waitForPageLoad();
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement ele =DriverFactory.getDriver().findElement(getElementOfTab_BY_Text(tabname));
			JavascriptExecutor js1 = (JavascriptExecutor)DriverFactory.getDriver();
			js1.executeScript("arguments[0].click()", ele);
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		} catch (Exception e) {
			Assert.assertFalse(true, "FAILED:- to Click on the tab: " + e.toString());

		}

	}

	// navigate and login to the C4C Application
	public void loginTotheApplicatio_C4C(String user_name, String pass_word, String url) {

		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.navigateToURL(url);
			Thread.sleep(4000);
			String psw = decryption(pass_word);
			ElementUtil.type(username, user_name);
			ElementUtil.type(password, psw);
			ElementUtil.click(signIn);
		} catch (Exception e) {
			Assert.assertFalse(true, "FAILED:- to login: " + e.toString());
		}
	}

	// This function is used to click and enter the input to the field
	public static void typeWithEnt(By by, String value) {
		try {
			WebDriver driv = DriverFactory.getDriver();
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(2500);
			WaitsUtil.explicit_Wait(by);
			WebElement element = driv.findElement(by);
			element.click();
			element.clear();
			element.sendKeys(value);
			element.sendKeys(Keys.ENTER);
		} catch (ElementClickInterceptedException ex) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", DriverFactory.getDriver().findElement(by));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}


	public void selectDropdown(By by, String value) throws InterruptedException {
		try {
			WebDriver driv = DriverFactory.getDriver();
			WebElement element = driv.findElement(by);
			ElementUtil.scrollToElement(by);
			element.clear();
			Thread.sleep(2000);
			element.sendKeys(value);
			ElementUtil.waitForElementPresent(lbl_drpList);
			Thread.sleep(2000);
			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ENTER);
		} catch (StaleElementReferenceException ex) {
			WebDriver driv = DriverFactory.getDriver();
			WebElement element = driv.findElement(by);
			element.clear();
			element.sendKeys(value);
			Thread.sleep(2000);
			ElementUtil.waitForElementPresent(lbl_drpList);
			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ENTER);
		}
	}

	// This function is used to click and enter the date on mouse over fields
	public void enterdata_OnMousehoverField(By mouseOverElement, By dataInputElement, String txt) {
		ElementUtil.waitForPageLoad();
		ElementUtil.waitForElementPresent(mouseOverElement);
		ElementUtil.scrollToElement(mouseOverElement);
		new Actions(DriverFactory.getDriver()).moveToElement(DriverFactory.getDriver().findElement(mouseOverElement)).click().build().perform();
		typeWithEnt(dataInputElement, txt);
	}

	public void selectDDOption(By ele, String value) {
		try {

			ElementUtil.click(ele);
			Thread.sleep(2000);
			Actions act = new Actions(DriverFactory.getDriver());
			// ApplicationPageUtil.waitForLoadGetDisappiear();
			List<WebElement> Options = DriverFactory.getDriver().findElements(eleOption);
			for (WebElement Option : Options) {
				if (Option.getText().equals(value)) {
					DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

					act.doubleClick(Option).build().perform();
					break;
				}
			}
		} catch (Exception ex) {

			Assert.assertFalse(true,
					"FAILED to type text:- [ " + value + "] to element: " + ele + ": " + ex.toString());
		}
	}

	public void selectDDChkBoxOption(By ele, String value) throws Exception {
		try {
			// ElementUtil.scrollToElement(ele);
			Thread.sleep(4500);
			// ElementUtil.waitForElementClickable(ele);
			ElementUtil.click(ele);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(1500);
			if (ElementUtil.isElementDisplayed(dropDownValueIsselected)) {
				ElementUtil.waitForElementClickable(dropDownValueIsselected);
				DriverFactory.getDriver().findElement(dropDownValueIsselected).click();
			}
			// List<WebElement> Options = DriverFactory.getDriver().findElements(eleOption);
			Thread.sleep(1500);
			type_KeysEnter(ele, value);
			/*
			 * for (WebElement Option : Options) { if (Option.getText().equals(value)) {
			 * Option.click(); break; } }
			 */
		} catch (Exception ex) {

			Assert.assertFalse(true,
					"FAILED to type text:- [ " + value + "] to element: " + ele + ": " + ex.toString());
		}

	}

	public void typeThenEnter(By by, String value) throws InterruptedException {
		ElementUtil.click(by);
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(by).sendKeys(value);
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(by).sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
	}

	public void typeThenClick(By by, String value, By label) throws InterruptedException {
		Actions act = new Actions(DriverFactory.getDriver());
		ElementUtil.click(by);
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(by).sendKeys(value);
		Thread.sleep(2000);
		act.doubleClick(DriverFactory.getDriver().findElement(label)).build().perform();

	}

	public void switch_Tab(String tabName) throws InterruptedException {

		// ElementUtil.click(aero_down);
		Thread.sleep(1000);
		lbl_TabTitle = DriverFactory.getDriver().findElement(
				By.xpath("//ul[@role='listbox']//li/span[contains(text(),'" + tabName + "')]//parent::li"));
		// ElementUtil.scrollToElement(lbl_TabTitle);

		lbl_TabTitle.click();
		Thread.sleep(2000);
	}

	public static String decryption(String psw) {

		Base64.Decoder decoder = Base64.getMimeDecoder();

		String pStr = new String(decoder.decode(psw));

		return pStr;
	}

	public static void loginTotheApplication_C4C(String user_name, String pass_word, String url) {
		try {
			// ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.navigateToURL(url);

			String psw = decryption(pass_word);
			try {
				ElementUtil.type(username, user_name);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ElementUtil.type(password, psw);
			ElementUtil.click(signIn);
		} catch (Exception e) {
			Assert.assertFalse(true, "FAILED:- to login: " + e.toString());
		}
	}
	public void takeScreenshot(String FileName) throws IOException {
		// Creating instance of File
		Shutterbug.shootPage(DriverFactory.getDriver(), Capture.FULL_SCROLL, 1000, true)
				.save("C:\\Users\\uvaraj.uthamaraj\\git\\automation_c4c_new\\ExtentReports\\screenshots\\" + FileName
						+ ".png");
	}

}
