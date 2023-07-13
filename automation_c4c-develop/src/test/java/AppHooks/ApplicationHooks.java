package AppHooks;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ScreenShotUtil;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private ConfigReader configReader;
	Properties prop;
	
	static Scenario scenario=null;

	public static LinkedHashMap<String, String> readExcelData = null;

	@BeforeAll
	public static void BeforeAll() {
		readExcelData = new LinkedHashMap<String, String>();
	}

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		String headlessMode = prop.getProperty("headlessMode");
		driverFactory = new DriverFactory();
		driverFactory.init_driver(browserName, headlessMode);
	}

	@Before(order = 1)
	public void thirdRunOrder(Scenario scenario) throws IOException {

		ApplicationHooks.scenario = scenario;

	}

	public static void takeScreenshot(String value) {
		try {
			Thread.sleep(2000);
			byte[] sourcePath = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", "<span style='color:blue'>" + value + "</span>");

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@After(order = 0)
	public void quitBrowser() {
		DriverFactory.getDriver().quit();
	}

	@AfterStep
	public void tearDown(Scenario scenario) throws Throwable {
		// ScreenShotUtil.i_take_a_screenshot(scenario);
		ScreenShotUtil.i_take_a_screenshot(scenario);

	}

	public static String getFieldValue(LinkedHashMap<String, String> map, String SheetName, String fieldName) {
		try {
			String value = map.get(SheetName);
			String[] vluSplit = value.split("@@");
			HashMap<String, String> fieldMap = new HashMap<String, String>();
			for (String vlu : vluSplit) {
				fieldMap.put(vlu.split("=")[0], vlu.split("=")[1]);
			}
			return fieldMap.get(fieldName);
		} catch (Exception e) {
			return null;
		}
	}

	public static void main(String str[]) {
		String stt = "CAP - New Application - Lead ID(20222378)";

		int x = stt.lastIndexOf(")");
		int y = stt.indexOf("(") + 1;

		String syy = stt.substring(y, x);
		System.out.println(syy);

	}
}
