package com.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;

public class LoginPage {

	public static DriverFactory driverFactory;
	public static WebDriver driver;

	public static By username = By.xpath("//input[@id='USERNAME_FIELD-inner']");
	public static By password = By.xpath("//input[@id='PASSWORD_FIELD-inner']");
	public static By signIn = By.xpath("//button/span[text()='Sign In']");
	public static By Loading = By.xpath("//div[contains(@class,'sapUiLocalBusyIndicatorAnimation')]");
	public static By btn_GlobalAdd = By.xpath("//button[@data-help-id='globalCreateButton']");
	public static HashMap<String, String> data = new HashMap<String, String>();

	public static void initExcel() throws IOException {

	}

//use
	public static List<String> encryption(String emain, String psw) {
		List<String> enlst = new LinkedList<String>();
		Base64.Encoder encoder = Base64.getMimeEncoder();
		String message = emain;
		String ps = psw;
		String eStr = encoder.encodeToString(message.getBytes());
		String pStr = encoder.encodeToString(ps.getBytes());
		// System.out.println("Encoded MIME message: " + eStr + " " + pStr);
		enlst.add(eStr);
		enlst.add(ps);
		return enlst;
	}

//use
	public static List<String> decryption(List<String> enlst) {
		List<String> delst = new LinkedList<String>();
		Base64.Decoder decoder = Base64.getMimeDecoder();
		String eStr = new String(decoder.decode(enlst.get(0)));
		String pStr = new String(decoder.decode(enlst.get(1)));
		// System.out.println("Decoded message: " + eStr + "  " + pStr);
		delst.add(eStr);
		delst.add(pStr);
		return delst;
	}

	// use
	public static void loginTotheApplication(String Url, String Username, String Password) throws IOException {

		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.navigateToURL(Url);
			ExtentCucumberAdapter.addTestStepLog("Url has been entered :" + Url);
			List<String> encrypList;
			encrypList = encryption(Username, Password);
			List<String> loginCrd = decryption(encrypList);
			try {
				ExtentCucumberAdapter.addTestStepLog("Username has been entered");
				ElementUtil.type(username, loginCrd.get(0));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ExtentCucumberAdapter.addTestStepLog("Password has been entered");
			ElementUtil.type(password, loginCrd.get(1));
			ApplicationHooks.takeScreenshot("Login Page");
			ElementUtil.Click(signIn, "Signin Button");
			ExtentCucumberAdapter.addTestStepLog("Clicked the button");
		} catch (Exception e) {

			Assert.assertFalse(true, "FAILED:- to login: " + e.toString());
		}
	}

	public static void waitForLoadGetDisappiear() {
		ElementUtil.waitForElementNotPresent(By.xpath("//div[@role='progressbar']"));

	}

	// use
	public static void navigateToPage(String category, String tabname) throws InterruptedException {
		try {
			// waitForLoadGetDisappiear();
			Thread.sleep(5000);
			ApplicationPageUtil.clickOn_Hamburgermenu();
			Thread.sleep(1000);
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			// select the drop down
			WebElement dropdown_value = DriverFactory.getDriver()
					.findElement(ApplicationPageUtil.getDropdownElement(category));
			JavascriptExecutor js3 = (JavascriptExecutor) DriverFactory.getDriver();
			js3.executeScript("arguments[0].click()", dropdown_value);
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(1000);

			// select the drop down value
			WebElement dropdown_value1 = DriverFactory.getDriver()
					.findElement(ApplicationPageUtil.getValueFromDropDown(tabname));
			JavascriptExecutor js4 = (JavascriptExecutor) DriverFactory.getDriver();
			js4.executeScript("arguments[0].click()", dropdown_value1);
			Thread.sleep(5000);
			ElementUtil.waitForPageLoad();
		} catch (Exception e) {
			// Assert.assertFalse("FAILED:- to Click on the tab under category: " +
			// e.toString(), true);
			ApplicationPageUtil.clickOn_Hamburgermenu();
			Thread.sleep(1000);
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			// select the drop down
			WebElement dropdown_value = DriverFactory.getDriver()
					.findElement(ApplicationPageUtil.getDropdownElement(category));
			JavascriptExecutor js3 = (JavascriptExecutor) DriverFactory.getDriver();
			js3.executeScript("arguments[0].click()", dropdown_value);
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(1000);

			// select the drop down value
			WebElement dropdown_value1 = DriverFactory.getDriver()
					.findElement(ApplicationPageUtil.getValueFromDropDown(tabname));
			JavascriptExecutor js4 = (JavascriptExecutor) DriverFactory.getDriver();
			js4.executeScript("arguments[0].click()", dropdown_value1);
			Thread.sleep(5000);
			ElementUtil.waitForPageLoad();
		}

	}

}
