package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.github.javafaker.Faker;

public class ElementUtil {

	static WebElement webElement;
	public static String identifier;
	public static String locator;
	public static String locatorDescription;
	static Faker faker = new Faker();
	private static WebDriver driver;
	static String headerMessage = "";

	private static By aero_down = By.xpath("//button[@title='slim-arrow-down']");
	private static By btn_globalCancel = By.xpath("//bdi[text()='Cancel']");
	public static By Loading = By.xpath("//div[contains(@class,'sapUiLocalBusyIndicatorAnimation')]");

	public ElementUtil(WebDriver driver) {
		this.driver = DriverFactory.getDriver();
	}
    public static void waitForElementToBeClickable(By by, int t) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(t));
            wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception e) {
           
        }
    }
	   public static void customDropList(By by, String value) {
		     waitForCertainTime(3000);
		     List < WebElement > myElements = DriverFactory.driver.findElements(by);
		     for (WebElement element: myElements) {
		       String innerhtml = element.getAttribute("data-value");
		       System.out.println("innerhtml ------------------------" + innerhtml);
		       if (innerhtml.contentEquals(value)) {
		         element.click();
		         break;
		       }
		     }
		   }

	public static void customDropListJClick(By by, String value) {
		waitForCertainTime(3000);
		List<WebElement> myElements = DriverFactory.driver.findElements(by);
		for (WebElement element : myElements) {
			String innerhtml = element.getAttribute("data-value");
			System.out.println("innerhtml ------------------------" + innerhtml);
			if (innerhtml.contentEquals(value)) {
				clickJS(element);
				break;
			}
		}
	}

	public static void ranMobileNoViet(By by, String stName, String TestData, int colu) throws IOException {
		int num1, num2, num3; // 3 numbers in area code
		int set2, set3; // sequence 2 and 3 of the phone number
		Random generator = new Random();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMyyHHmm");
		String date = simpleDateFormat.format(new Date());
		// Area code number; Will not print 8 or 9
		// num1 = generator.nextInt(7) + 1; // add 1 so there is no 0 to begin
		num2 = generator.nextInt(8); // randomize to 8 becuase 0 counts as a
		// number in the generator
		System.out.println("num2 : " + num2);
		num3 = generator.nextInt(8);
		System.out.println("num3 : " + num3);
		// Sequence two of phone number
		// the plus 100 is so there will always be a 3 digit number
		// randomize to 643 because 0 starts the first placement so if i
		// randomized up to 642 it would only go up yo 641 plus 100
		// and i used 643 so when it adds 100 it will not succeed 742
		set2 = generator.nextInt(643) + 100;
		System.out.println("set2 : " + set2);
		// Sequence 3 of numebr
		// add 1000 so there will always be 4 numbers
		// 8999 so it wont succed 9999 when the 1000 is added
		set3 = generator.nextInt(8999) + 1000;
		System.out.println("set3 : " + set3);
		System.out.println("Mobile Number : " + num2 + "" + num3 + +set2 + +set3);
		System.out.println("Mobile Number2 : " + num2 + "" + date);
		String phoneR = num2 + "" + date;
		System.out.println("Random Phone Number : " + phoneR);
		ElementUtil.type(by, phoneR);
		System.out.println("Phone R : " + phoneR);
		ElementUtil.writeTcResult(stName, TestData, colu, phoneR);
	}

	public static void ranEmailId(By by, String stName, String TestData, int colu) throws IOException {
		// String myEmailAddress = "ttpvsel" + System.nanoTime() +
		// "@yopmail.com";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
		String date = simpleDateFormat.format(new Date());
		String emailR = "ttpvt" + date + "@yopmail.com";
		ElementUtil.type(by, emailR);
		System.out.println("Email R : " + emailR);
		ElementUtil.printToReportMessage("Email : " + emailR);
		System.out.println("stName : " + stName + "TestData : " + TestData + "colu : " + colu + "emailR : " + emailR);
		ConfigReader.writeToApplicationPropertie("SESAccommodationEmail", emailR);
		//ElementUtil.writeTcResult(stName, TestData, colu, emailR);
	}

	public static boolean isElementDisplayed(By by, int t, String message) {
		boolean flag;
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
		try {
			flag = DriverFactory.getDriver().findElement(by).isDisplayed();
			// highlightElement(by);
			ElementUtil.printToReportMessage(message);
		} catch (Exception e) {
			flag = false;
		}
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
		return flag;
	}

	public static void printToReportPass(String message) {
		ExtentCucumberAdapter
				.addTestStepLog("<b style=\"color:green;\"> ------------PASS-----------" + message + "</b>");
	}

	public static void printToReportFAIL(String message) {
		ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\"> ------------FAIL-----------" + message + "</b>");
	}

	public static boolean waitForCertainTime(int sleepTime) {
		boolean returnValue = false;
		try {
			Thread.sleep(sleepTime);
			returnValue = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnValue;
	}

	public static void implicitWait(int t) {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
	}

	public static void scrolldown() {
		try {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("scroll(0,500)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printToReportInfo(String message) {
		ExtentCucumberAdapter
				.addTestStepLog("<b style=\"color:yellow;\"> ------------INFO-----------" + message + "</b>");
	}

	public static void printToReportMessage(String message) {
		ExtentCucumberAdapter.addTestStepLog("<b style=\"color:green;\"> " + message + "</b>");
	}

	public static void clickJS(WebElement element) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(80));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
		js.executeScript("arguments[0].click()", element);
	}

	public static void ranMobileNo(By by, String stName, String TestData, int colu) throws IOException {
		int num1, num2, num3; // 3 numbers in area code
		int set2, set3; // sequence 2 and 3 of the phone number
		Random generator = new Random();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMyyHHmm");
		String date = simpleDateFormat.format(new Date());
		// Area code number; Will not print 8 or 9
		num1 = generator.nextInt(7) + 1; // add 1 so there is no 0 to begin
		System.out.println("num1 : " + num1);
		num2 = generator.nextInt(8); // randomize to 8 becuase 0 counts as a
										// number in the generator
		System.out.println("num2 : " + num2);
		num3 = generator.nextInt(8);
		System.out.println("num3 : " + num3);
		// Sequence two of phone number
		// the plus 100 is so there will always be a 3 digit number
		// randomize to 643 because 0 starts the first placement so if i
		// randomized up to 642 it would only go up yo 641 plus 100
		// and i used 643 so when it adds 100 it will not succeed 742
		set2 = generator.nextInt(643) + 100;
		System.out.println("set2 : " + set2);
		// Sequence 3 of numebr
		// add 1000 so there will always be 4 numbers
		// 8999 so it wont succed 9999 when the 1000 is added
		set3 = generator.nextInt(8999) + 1000;
		System.out.println("set3 : " + set3);
		System.out.println(+num1 + "" + num2 + "" + num3 + +set2 + +set3);
		System.out.println(+num1 + "" + num2 + "" + date);
		String phoneR = +num1 + "" + num2 + "" + date;
		System.out.println("Random Phone Number : " + phoneR);
		ElementUtil.type(by, phoneR);
		System.out.println("Phone R : " + phoneR);
		//ElementUtil.writeTcResult(stName, TestData, colu, phoneR);
	}

	public static void waitForPageLoad(int t) {
		for (int i = 0; i < t; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				System.out.println("Page has not loaded yet ");
			}
			// again check page state
			if (((JavascriptExecutor) DriverFactory.getDriver()).executeScript("return document.readyState").toString()
					.equals("complete")) {
				break;
			}
		}
	}

	public static void writeTcResult(String stName, String TestData, int colu, String values) throws IOException {
		System.out.println("Came inside write Tc Result");
		String result = null;
		String workbookName = "TestData.xlsx";
		FileInputStream fis = new FileInputStream(new File("./src/test/resources/data/" + workbookName));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ss = wb.getSheet(stName);
		String vals = values;
		int itr = colu;
		Iterator<Row> rowIterator = ss.rowIterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIt = row.cellIterator();
			while (cellIt.hasNext()) {
				Cell cell = cellIt.next();
				DataFormatter formatter = new DataFormatter(Locale.US);
				String a = formatter.formatCellValue(cell);
				// System.out.println(a);
				// System.out.println(vals);
				if (a.equals(TestData)) {
					System.out.println("TestData : " + TestData);
					row.createCell(cell.getColumnIndex() + itr).setCellValue(vals);
					fis.close();
					FileOutputStream outFile = new FileOutputStream("./src/test/resources/data/TestData.xlsx");
					wb.write(outFile);
					outFile.close();
				}
			}
		}
	}

	// browser-commands
	public static String getURL() {
		String value = "";
		try {
			value = DriverFactory.getDriver().getCurrentUrl();
			return value;
		} catch (Exception e) {
			Assert.assertFalse("FAILED:- to get url: " + e.toString(), true);
			return e.toString();
		}

	}

	/**
	 * @return String
	 */
	public static String getPageTitle() {
		String value = "";
		try {
			value = DriverFactory.getDriver().getTitle();
			return value;
		} catch (Exception e) {
			Assert.assertFalse("FAILED:- to get Page Title: " + e.toString(), true);
			return e.toString();
		}
	}

	/**
	 * @return String
	 */
	public String getPageURL() {
		String value = "";
		try {
			value = DriverFactory.getDriver().getCurrentUrl();
			return value;
		} catch (Exception e) {
			Assert.assertFalse("FAILED:- to get Current Page url: " + e.toString(), true);
			return e.toString();
		}
	}

	public static void type__C(By by, String textToType) {
		try {
			DriverFactory.getDriver().findElement(by).sendKeys(textToType);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * @return String
	 */
	public String getPageSource() {
		String value = "";
		try {
			value = DriverFactory.getDriver().getPageSource();
			return value;
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to get PageSource: " + e.toString(), true);
			return e.toString();
		}
	}

	public static void close() {
		try {
			DriverFactory.getDriver().close();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to close driver: " + e.toString(), true);
		}
	}

	public static void quit() {
		try {
			DriverFactory.getDriver().quit();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to quit driver: " + e.toString(), true);
		}
	}

	/**
	 * @param url
	 */
	// navigation-commands
	public static void navigateToURL(String url) {
		try {
			DriverFactory.getDriver().navigate().to(url);
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to navigate to url: " + e.toString(), true);
		}
	}

	public static void navigateForward() {
		try {
			DriverFactory.getDriver().navigate().forward();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to navigage forward: " + e.toString(), true);
		}
	}

	public static void navigateBackward() {
		try {
			DriverFactory.getDriver().navigate().back();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to navigate back: " + e.toString(), true);
		}
	}

	public static void pageRefresh() {
		try {
			DriverFactory.getDriver().navigate().refresh();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to refresh page: " + e.toString(), true);
		}
	}

	public static void pressEnter() {
		try {
			new Actions(DriverFactory.getDriver()).sendKeys(Keys.ENTER).build().perform();
			// ExtentCucumberAdapter.addTestStepLog("scroll To Bottom Of Page");
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to scroll horizontally ", true);
		}
	}

	/**
	 * @param by
	 */
	// webelement-commands
	public static void click(By by) {
		try {

			WaitsUtil.explicit_Wait(by);

			DriverFactory.getDriver().findElement(by).click();
		} catch (StaleElementReferenceException ex) {

			DriverFactory.getDriver().findElement(by).click();
		} catch (Exception ElementClickInterceptedException) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
					DriverFactory.getDriver().findElement(by));
		}

	}

	public static void Click(By by, String value) {

		try {

			WaitsUtil.explicit_Wait(by);
			DriverFactory.getDriver().findElement(by).click();
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:brown;font-weight:bold;'>" + "Clicked on :- " + value + "</span>");
		} catch (StaleElementReferenceException ex) {
			DriverFactory.getDriver().findElement(by).click();
		} catch (Exception ElementClickInterceptedException) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
					DriverFactory.getDriver().findElement(by));
		}
	}

	public static void Type(By by, String value) throws InterruptedException, IOException {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			WaitsUtil.explicit_Wait(by);
			DriverFactory.getDriver().findElement(by).clear();
			DriverFactory.getDriver().findElement(by).sendKeys(value);
			DriverFactory.getDriver().findElement(by).sendKeys(Keys.ENTER);
			Thread.sleep(500);
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Typed text:-  " + value + "</span>");
		} catch (StaleElementReferenceException ex) {
			DriverFactory.getDriver().findElement(by).clear();
			DriverFactory.getDriver().findElement(by).sendKeys(value);
			DriverFactory.getDriver().findElement(by).sendKeys(Keys.ENTER);
			Thread.sleep(500);
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Typed text:-  " + value + "</span>");
		} catch (ElementClickInterceptedException ex) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
					DriverFactory.getDriver().findElement(by));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void TypeWithoutClear(By by, String value) throws InterruptedException, IOException {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			WaitsUtil.explicit_Wait(by);
			DriverFactory.getDriver().findElement(by).sendKeys(value);
			DriverFactory.getDriver().findElement(by).sendKeys(Keys.ENTER);
			Thread.sleep(500);
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Typed text:-  " + value + "</span>");
		} catch (StaleElementReferenceException ex) {
			DriverFactory.getDriver().findElement(by).sendKeys(value);
			DriverFactory.getDriver().findElement(by).sendKeys(Keys.ENTER);
			Thread.sleep(500);
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Typed text:-  " + value + "</span>");
		} catch (ElementClickInterceptedException ex) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
					DriverFactory.getDriver().findElement(by));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void doubleClick(By by) {
		try {

			waitForElementPresent(by);
			Actions action = new Actions(DriverFactory.getDriver());
			WebElement ele = DriverFactory.getDriver().findElement(by);
			// action.doubleClick(ele);
			action.moveToElement(ele).doubleClick().build().perform();
		} catch (StaleElementReferenceException ex) {
			Actions action = new Actions(DriverFactory.getDriver());
			WebElement ele = DriverFactory.getDriver().findElement(by);
			action.moveToElement(ele).doubleClick().build().perform();
		} catch (Exception ElementClickInterceptedException) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
					DriverFactory.getDriver().findElement(by));
		}

	}

	/**
	 * @param by
	 */
	public static void clear(By by) {
		try {

			waitForElementPresent(by);
			DriverFactory.getDriver().findElement(by).clear();
		} catch (Exception ElementClickInterceptedException) {
		}
	}

	/**
	 * @param by
	 */
	public static void selectRadioButton(By by) {
		try {
			DriverFactory.getDriver().findElement(by).click();
		} catch (Exception ElementClickInterceptedException) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
					DriverFactory.getDriver().findElement(by));
		}

	}

	/**
	 * @param by
	 */
	public static void Jclick(By by) {
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
				DriverFactory.getDriver().findElement(by));
	}

	/**
	 * @param by
	 * @param textToType
	 */
	public static void type(By by, String textToType) {
		try {
			// waitForElementPresent(by);
			// scrollToElement(by);
			// DriverFactory.getDriver().findElement(by).click();
			DriverFactory.getDriver().findElement(by).clear();
			DriverFactory.getDriver().findElement(by).clear();
			DriverFactory.getDriver().findElement(by).sendKeys(textToType);
		}catch(StaleElementReferenceException ex) {
			WaitsUtil.fluentWait(by).clear();
			WaitsUtil.fluentWait(by).sendKeys(textToType);
		}
		catch (Exception ElementNotInteractableException) {
			Assert.assertFalse("FAILED to type text:- [ " + textToType + "] to element: " + by + ": "
					+ ElementNotInteractableException.toString(), true);
		}

	}

	public static void TypeWithEnter(By by, String value) throws InterruptedException {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			WaitsUtil.explicit_Wait(by);
			DriverFactory.getDriver().findElement(by).clear();
			DriverFactory.getDriver().findElement(by).sendKeys(value);
			DriverFactory.getDriver().findElement(by).sendKeys(Keys.ENTER);
			Thread.sleep(500);
			ExtentCucumberAdapter.addTestStepLog("Value : " + value);
		} catch (StaleElementReferenceException ex) {
			DriverFactory.getDriver().findElement(by).clear();
			DriverFactory.getDriver().findElement(by).sendKeys(value);
			DriverFactory.getDriver().findElement(by).sendKeys(Keys.ENTER);
			Thread.sleep(500);
			ExtentCucumberAdapter.addTestStepLog("Value : " + value);
		} catch (ElementClickInterceptedException ex) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(by));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void TypeWithoutEnter(By by, String value) throws InterruptedException {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			WaitsUtil.explicit_Wait(by);
			DriverFactory.getDriver().findElement(by).clear();
			DriverFactory.getDriver().findElement(by).sendKeys(value);
			Thread.sleep(500);
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Typed text:-  " + value + "</span>");
		} catch (StaleElementReferenceException ex) {
			DriverFactory.getDriver().findElement(by).clear();
			DriverFactory.getDriver().findElement(by).sendKeys(value);
			Thread.sleep(500);
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:blue;font-weight:bold;'>" + "Typed text:-  " + value + "</span>");
		} catch (ElementClickInterceptedException ex) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(by));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * @param by
	 * @return String
	 */

	public static String getText(By by) {
		String value = "";
		try {
			waitForElementPresent(by);
			value = DriverFactory.getDriver().findElement(by).getText().trim();
			System.out.println("VAALUE:- " + value);
			return value;
		} catch (Exception e) {
			Assert.assertFalse("FAILED:- to Get text:- [ " + value + " from element: ]" + by + ": " + e.toString(),
					true);
			return e.toString();
		}
	}

	/**
	 * @param by
	 * @return String
	 */
	public static String getTextValue(By by) {
		String value = "";
		try {
			value = DriverFactory.getDriver().findElement(by).getText();
			System.out.println("VAALUE:- " + value);

			return value;
		} catch (Exception e) {
			Assert.assertFalse("FAILED:- to Get text:- [ " + value + " from element: ]" + by + ": " + e.toString(),
					true);
			return e.toString();
		}
	}

	/**
	 * @param by
	 * @return String
	 */
	public String getTagName(By by) {

		String value = "";
		try {
			waitForElementPresent(by);
			value = DriverFactory.getDriver().findElement(by).getTagName();
			return value;
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to get TagName:- [ " + value + " ] from element: " + by + ": " + e.toString(),
					true);
			return e.toString();
		}

	}

	/**
	 * @param by
	 * @param propertyName
	 * @return String
	 */
	public String getCssValue(By by, String propertyName) {
		String value = "";
		try {
			waitForElementPresent(by);
			value = DriverFactory.getDriver().findElement(by).getCssValue(propertyName);
			return value;
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to get CSS Value:- [ " + value + " ] from element: " + by + ": " + e.toString(),
					true);
			return e.toString();
		}

	}

	/**
	 * @param by
	 * @param propertyName
	 * @return String
	 */
	public static String getAttribute(By by, String propertyName) {
		String value = "";
		try {
			waitForElementPresent(by);
			value = DriverFactory.getDriver().findElement(by).getAttribute(propertyName);
			return value;
		} catch (Exception e) {
			Assert.assertFalse(
					"FAIL:- to get Attribute Value:- [ " + value + " ] from element: " + by + ": " + e.toString(),
					true);
			return e.toString();
		}

	}

	/**
	 * @param by
	 * @return Dimension
	 */
	public Dimension getSize(By by) {
		Dimension dimensions;
		try {
			waitForElementPresent(by);
			dimensions = DriverFactory.getDriver().findElement(by).getSize();
			return dimensions;
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to get Size from element: " + by + ": " + e.toString(), true);
			return null;
		}

	}

	/**
	 * @param by
	 * @return boolean
	 */
	public static boolean isElementDisplayed(By by) {
		boolean flag = false;
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		try {
			flag = DriverFactory.getDriver().findElement(by).isDisplayed();

		} catch (Exception e) {
			flag = false;
		}
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return flag;
	}

	/**
	 * @param by
	 * @return boolean
	 */
	public static boolean isElementEnable(By by) {
		boolean flag = false;
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			flag = DriverFactory.getDriver().findElement(by).isEnabled();

		} catch (Exception e) {
			flag = false;
		}
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return flag;
	}

	public static boolean isClicked(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(5000));
			wait.until(ExpectedConditions.elementToBeClickable(by));
			click(by);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * @param by
	 * @return boolean
	 */
	public static boolean isElementSelected(By by) {
		boolean flag;
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			flag = DriverFactory.getDriver().findElement(by).isSelected();

		} catch (Exception e) {
			flag = false;
		}
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return flag;
	}

	/**
	 * @param by
	 * @return Point
	 */
	public Point getLocation(By by) {
		Point point;
		try {
			waitForElementPresent(by);
			point = DriverFactory.getDriver().findElement(by).getLocation();
			return point;
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to get Location:-  from element: " + by + ": " + e.toString(), true);
			return null;
		}

	}

	/**
	 * @param dropdown
	 * @param dropdownValue
	 */
	public static void selectFromDropdown(By dropdown, By dropdownValue) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(50));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(dropdown));
			DriverFactory.getDriver().findElement(dropdown).click();
			Assert.assertTrue("PASS: Click dropdown:- ", true);

			wait.until(ExpectedConditions.elementToBeClickable(dropdownValue));
			DriverFactory.getDriver().findElement(dropdownValue).click();
		} catch (Exception e) {
			Assert.assertFalse(
					"FAIL:- to select value from dropdown " + dropdown + " " + dropdownValue + " " + e.toString(),
					true);
		}

	}

	/**
	 * @param by
	 * @return List<String>
	 */
	public static List<String> getDropdownText(By by) {
		List<WebElement> we = DriverFactory.getDriver().findElements(by);
		List<String> ls = new ArrayList<String>();
		for (WebElement a : we) {
			ls.add(a.getText());
		}
		return ls;
	}

	/**
	 * @param by
	 */
	public static void selectCheckbox(By by) {
		try {
			// if (!DriverFactory.getDriver().findElement(by).isSelected()) {
			DriverFactory.getDriver().findElement(by).click();
			System.out.println("select Checkbox " + by);
			// }
		} catch (ElementClickInterceptedException e) {
			try {
				((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
						DriverFactory.getDriver().findElement(by));
			} catch (Exception e1) {
				Assert.assertFalse("FAIL:- to select checkbox " + by + ": " + e1.toString(), true);
			}
		}
	}

	public static void scrollToBottomOfPage() {
		try {
			new Actions(DriverFactory.getDriver()).sendKeys(Keys.PAGE_DOWN).build().perform();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to scroll To Bottom Of Page " + ": " + e.toString(), true);
		}
	}

	public static void scrollHorizontalPage() {
		try {

			new Actions(DriverFactory.getDriver()).sendKeys(Keys.ARROW_RIGHT).build().perform();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to scroll horizontally " + ": " + e.toString(), true);
		}
	}

	/**
	 * @param by
	 */
	public static void moveMoveClick(By by) {
		try {
			new Actions(DriverFactory.getDriver()).moveToElement(DriverFactory.getDriver().findElement(by))
					.click(DriverFactory.getDriver().findElement(by));
			new Actions(DriverFactory.getDriver()).perform();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to click " + ": " + e.toString(), true);
		}
	}

	/**
	 * @param by
	 */
	public static void mouseMove(By by) {
		try {
			new Actions(DriverFactory.getDriver()).moveToElement(DriverFactory.getDriver().findElement(by));
			new Actions(DriverFactory.getDriver()).perform();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to click " + ": " + e.toString(), true);
		}
	}

	/**
	 * @param by
	 */
	public static void highlightElement(By by) {
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].style.background='yellow'",
				DriverFactory.getDriver().findElement(by));
	}

	/**
	 * @param by
	 */
	public static void jsClick(By by) {
		try {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();",
					DriverFactory.getDriver().findElement(by));
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to click " + ": " + e.toString(), true);
		}
	}

	public static void scrollToTopOfPage() {
		try {
			new Actions(DriverFactory.getDriver()).sendKeys(Keys.PAGE_UP).build().perform();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to scroll To Top Of Page" + ": " + e.toString(), true);
		}
	}

	/**
	 * @param by
	 */
	public static void waitForElementPresent(By by) {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		List<WebElement> dynamicElement = null;
		for (int i = 0; i < 60; i++) {
			dynamicElement = DriverFactory.getDriver().findElements(by);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				// System.out.println("Page has not loaded yet ");
			}
			// again check page state
			if (dynamicElement.size() != 0) {
				break;
			}
		}
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	/**
	 * @param by
	 * @return boolean
	 */
	public static boolean waitForElementPresentReturn(By by) {
		boolean flag = false;
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		List<WebElement> dynamicElement = null;
		for (int i = 0; i < 60; i++) {
			dynamicElement = DriverFactory.getDriver().findElements(by);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				// System.out.println("Page has not loaded yet ");
			}
			// again check page state
			if (dynamicElement.size() != 0) {
				flag = true;
				break;
			}
		}
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return flag;
	}

	/**
	 * @param by
	 */
	public static void waitForElementNotPresent(By by) {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		List<WebElement> dynamicElement = null;
		for (int i = 0; i < 60; i++) {
			dynamicElement = DriverFactory.getDriver().findElements(by);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				// System.out.println("Page has not loaded yet ");
			}
			// again check page state
			if (dynamicElement.size() == 0) {
				break;
			}
		}
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static void waitForPageLoad() {
		for (int i = 0; i < 60; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				System.out.println("Page has not loaded yet ");
			}
			// again check page state
			if (((JavascriptExecutor) DriverFactory.getDriver()).executeScript("return document.readyState").toString()
					.equals("complete")) {
				break;
			}
		}
	}

	/**
	 * @param by
	 */
	public static void waitForElementVisible(By by) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(50));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			Assert.assertFalse("Element is not Visible " + by + ": " + e.toString(), true);
		}
	}

	/**
	 * @param by
	 * @return boolean
	 */
	public static boolean waitForElementVisibleReturn(By by) {
		boolean flag = false;
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(60));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			flag = true;
			;
		} catch (Exception e) {
			flag = false;
		}

		return flag;
	}

	public static boolean waitForElementClickable(By by) {
		boolean flag = false;
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(60));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(by));
			flag = true;
			;
		} catch (Exception e) {
			flag = false;
		}

		return flag;
	}

	/**
	 * @param by
	 */
	public static void waitForElementInvisible(By by) {

		try {
			WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(50));
			wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(by)));

			ExtentCucumberAdapter.addTestStepLog("Element is not Visible " + by);

		} catch (Exception e) {

			Assert.assertFalse("Element is Visible " + by + ": " + e.toString(), true);

		}

	}

	/**
	 * @param by
	 */
	public static void scrollToElement(By by) {
		try {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].scrollIntoView();",
					DriverFactory.getDriver().findElement(by));
		} catch (Exception e) {
			Assert.assertFalse("Failed to scroll to webElement " + by + ": " + e.toString(), true);
		}
	}

	/**
	 * @param by
	 * @param frame
	 */
	public static void waitForFrame(By by, String frame) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(50));
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to wait for frame" + ": " + e.toString(), true);

		}
	}

	/**
	 * @param by
	 * @return int
	 */
	public static int getElementsCount(By by) {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		int size = DriverFactory.getDriver().findElements(by).size();
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return size;
	}

	/**
	 * @param length
	 * @return String
	 */
	public static String generateRandomString(int length) {
		return RandomStringUtils.randomAlphabetic(length);
	}

	/**
	 * @param length
	 * @return String
	 */
	public static String generateRandomStringWithLowercase(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz";
		String website = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		System.out.println(temp);
		website = temp;
		return website;
	}

	/**
	 * @param length
	 * @return String
	 */
	public static String generateRandomNumber(int length) {
		return RandomStringUtils.randomNumeric(length);
	}

	/**
	 * @param length
	 * @return String
	 */
	public static String generateRandomAlphaNumeric(int length) {
		return RandomStringUtils.randomAlphanumeric(length);
	}

	/**
	 * @param length
	 * @param allowdSplChrs
	 * @return String
	 */
	public String generateStringWithSplChars(int length, String allowdSplChrs) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
				"1234567890" + // numbers
				allowdSplChrs;
		return RandomStringUtils.random(length, allowedChars);
	}

	/**
	 * @param length
	 * @return String
	 */
	public static String generateEmail(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
				"1234567890"; // special
								// characters
		String email = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		System.out.println(temp);
		email = temp + "@gmail.com";
		return email;
	}

	/**
	 * @param length
	 * @return String
	 */
	public static String generateIDPEmail(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
				"1234567890" + "_"; // special
									// characters
		String email = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		email = temp + "@idp.com";
		// System.out.println("EMAIL:- " + email);

		return email;
	}

	/**
	 * @param length
	 * @return String
	 */
	public String generateUrl(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
				"1234567890" + // numbers
				"_-."; // special characters
		String url = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		url = temp.substring(0, 3) + "." + temp.substring(4, temp.length() - 4) + "."
				+ temp.substring(temp.length() - 3);
		return url;
	}

	/**
	 * @param minimumLength
	 * @param maximumLength
	 * @param includeUppercase
	 * @param includeSpecial
	 * @return String
	 */

	public static String generateAlphaNumbericString(int minimumLength, int maximumLength, boolean includeUppercase,
			boolean includeSpecial) {
		if (includeSpecial) {
			char[] password = faker.lorem().characters(minimumLength, maximumLength, includeUppercase).toCharArray();
			char[] special = new char[] { '!', '@', '#', '$', '%', '^', '&', '*' };
			for (int i = 0; i < faker.random().nextInt(minimumLength); i++) {
				password[faker.random().nextInt(password.length)] = special[faker.random().nextInt(special.length)];
			}
			return new String(password);
		} else {
			return faker.lorem().characters(minimumLength, maximumLength, includeUppercase);
		}
	}

	/**
	 * @param length
	 * @return String
	 */
	public static String generateRandomDigits(int length) {
		return faker.number().digits(length);
	}

	/**
	 * @param string
	 * @return boolean
	 */
	public static boolean isUUID(String string) {
		try {
			UUID.fromString(string);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	/**
	 * @return String
	 */
	public static String generateUUID() {
		try {
			UUID uuid = UUID.randomUUID();
			return uuid.toString();
		} catch (Exception ex) {
			return ex.toString();
		}

	}

	public static void waitTime() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param encodedPassword
	 * @return String
	 */
	public static String getPassword(String encodedPassword) {
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(encodedPassword);
			String DecodedString = new String(decodedBytes);
			return DecodedString;
		} catch (Exception e) {
			Assert.assertFalse("Failed to get Password", true);
			return null;
		}
	}

	public static void selectDDOption(By ele, By eleOption, String value) throws Exception {
		ElementUtil.click(ele);
		Thread.sleep(2000);
		ElementUtil.waitForElementVisible(eleOption);
		Thread.sleep(2000);
		List<WebElement> Options = DriverFactory.getDriver().findElements(eleOption);
		for (WebElement Option : Options) {
			if (Option.getText().trim().equalsIgnoreCase(value)) {
				Thread.sleep(1000);
				Option.click();
				break;
			}

		}

	}

	public static void Dropdown(By ele, By eleOption, String value) throws Exception {
		ElementUtil.click(ele);
		Thread.sleep(2000);
		ElementUtil.waitForElementVisible(eleOption);
		Thread.sleep(2000);
		List<WebElement> Options = DriverFactory.getDriver().findElements(eleOption);
		for (WebElement Option : Options) {
			if (Option.getText().trim().equalsIgnoreCase(value)) {
				Thread.sleep(1000);
				Option.click();
				ExtentCucumberAdapter.addTestStepLog("Clicked on :-" + value);
				break;
			}

		}

	}

	public static void comparePickList(String sheetName, String Column, By by) throws Exception {

		new ExcelUtil();
		HashMap<String, ArrayList<String>> arr = ExcelUtil.readExcel(sheetName, true);
		ArrayList<String> arrGetData = new ArrayList<String>();
		arrGetData.addAll(arr.get(Column));

		List<WebElement> overviewList = DriverFactory.getDriver().findElements(by);
		ArrayList<String> arrEle = new ArrayList<String>();
		for (WebElement getElements : overviewList) {
			if (getElements.getText() != "") {
				arrEle.add(getElements.getText());
			}

		}

		Collections.sort(arrGetData);
		System.out.println(arrGetData);
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:blue;font-weight:bold;'>" + "List to be verified :-" + "\n" + "</span>");
		ExtentCucumberAdapter.addTestStepLog("<span style='color:brown;font-weight:bold;'>" + arrGetData + "</span>");
		Collections.sort(arrEle);
		System.out.println(arrEle);
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:blue;font-weight:bold;'>" + "Picklist Values:- " + "\n" + "</span>");
		ExtentCucumberAdapter
				.addTestStepLog("<span style='color:brown;font-weight:bold;'>" + arrEle + "\n" + "</span>");

		if (arrEle.containsAll(arrGetData)) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Values present in data sheet are exist in picklist" + "</span>");
		} else {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "******************* Missing Fields ********************" + "</span>");
			arrGetData.removeAll(arrEle);
			System.out.println(arrGetData);
			ExtentCucumberAdapter
					.addTestStepLog("<span style='color:red;font-weight:bold;'>" + arrGetData + "\n" + "</span>");

		}
	}

	public static void comparePickListGetAttrib(String sheetName, String Column, By by) throws Exception {

		new ExcelUtil();
		HashMap<String, ArrayList<String>> arr = ExcelUtil.readExcel(sheetName, true);
		ArrayList<String> arrGetData = new ArrayList<String>();
		arrGetData.addAll(arr.get(Column));

		List<WebElement> overviewList = DriverFactory.getDriver().findElements(by);
		ArrayList<String> arrEle = new ArrayList<String>();

		for (WebElement getElements : overviewList) {
			arrEle.add(getElements.getAttribute("aria-label"));
		}

		Set<String> set = new HashSet<>(arrEle);
		arrEle.clear();
		arrEle.addAll(set);

		Collections.sort(arrGetData);
		System.out.println(arrGetData);
		ExtentCucumberAdapter.addTestStepLog(
				"<span style='color:red;font-weight:bold;'>" + "List to be verified :-" + "\n" + "</span>");
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + arrGetData + "</span>");
		Collections.sort(arrEle);
		System.out.println(arrEle);
		ExtentCucumberAdapter
				.addTestStepLog("<span style='color:red;font-weight:bold;'>" + "Picklist Values:- " + "\n" + "</span>");
		ExtentCucumberAdapter.addTestStepLog("<span style='color:blue;font-weight:bold;'>" + arrEle + "\n" + "</span>");

		if (arrEle.containsAll(arrGetData)) {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:green;font-weight:bold;'>"
					+ "Values present in data sheet are exist in picklist" + "</span>");
		} else {
			ExtentCucumberAdapter.addTestStepLog("<span style='color:red;font-weight:bold;'>"
					+ "******************* Missing Fields ********************" + "</span>");
			arrGetData.removeAll(arrEle);
			System.out.println(arrGetData);
			ExtentCucumberAdapter
					.addTestStepLog("<span style='color:red;font-weight:bold;'>" + arrGetData + "\n" + "</span>");
			Assertion softAssert = new Assertion();
			softAssert.assertFalse(true);

		}
	}

	public static void verifyHeaderMessage(String message) throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(2000);
		headerMessage = DriverFactory.getDriver()
				.findElement(By.xpath("//span[@data-help-id='messageBar-headerMessage']")).getText();
		System.out.println(headerMessage);
		ExtentCucumberAdapter
				.addTestStepLog("<span style='color:red;font-weight:bold;'>" + headerMessage + "\n" + "</span>");
		if (headerMessage.contains(message)) {
			System.out.println("Header message verified");
			ExtentCucumberAdapter.addTestStepLog(
					"<span style='color:red;font-weight:bold;'>" + "Header message verified" + "\n" + "</span>");
		} else {
			Assert.assertFalse(true);
		}
	}

	public static void switchToTab(String tabName) throws InterruptedException {
		ElementUtil.waitForPageLoad();
		Thread.sleep(5000);
		ElementUtil.waitForElementClickable(aero_down);
		ElementUtil.Click(aero_down, "Aerrow down button");
		try {
			WebElement ele = DriverFactory.getDriver().findElement(
					By.xpath("//ul[@role='listbox']//li/span[contains(text(),'" + tabName + "')]//parent::li"));
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].scrollIntoView();",
					DriverFactory.getDriver().findElement(By
							.xpath("//ul[@role='listbox']//li/span[contains(text(),'" + tabName + "')]//parent::li")));
			ele.click();
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to click tab " + ": " + e.toString(), true);
		}
		Thread.sleep(2000);
	}

}
