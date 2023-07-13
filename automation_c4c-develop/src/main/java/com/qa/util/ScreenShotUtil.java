package com.qa.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.Scenario;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShotUtil {

	// File filetest = Paths.get(".").toAbsolutePath().normalize().toFile();
	public static String fileName = "C:\\Users\\uvaraj.uthamaraj\\OneDrive - IDP Education Ltd\\Desktop\\PROJECT-C4C\\automation_c4c\\src\\test\\resources\\screenshots\\srg1.png";

	public static void i_take_a_screenshot(Scenario scenario) throws Throwable {
		ElementUtil.waitForPageLoad();
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			File filetest = Paths.get(".").toAbsolutePath().normalize().toFile();
			// String fileName = filetest + "\\test-output\\" + screenshotName + ".png";

			byte[] sourcePath = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to take screenshot: " + e.toString(), true);
		}

	}

	public static void i_take_a_screenshot_using_Shutterbug(Scenario scenario) throws Throwable {
		try {
			
			//Screenshot screenshot=new AShot().takeScreenshot(DriverFactory.getDriver());
			Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(DriverFactory.getDriver());
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			File filetest = Paths.get(".").toAbsolutePath().normalize().toFile();
			String fileName = filetest + "\\test-output\\" + screenshotName + ".png";

			//BufferedImage bi = Shutterbug.shootPage(DriverFactory.getDriver(), Capture.FULL_SCROLL, 800, true)
					//.getImage();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			//ImageIO.write(screenshot.getImage(),"PNG",new File(fileName));
			ImageIO.write(screenshot.getImage(), "png", baos);

			byte[] bytes = baos.toByteArray();
			scenario.attach(bytes, "image/png", fileName);
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to take screenshot: " + e.toString(), true);
		}
	}

	public static void i_take_a_screenshot_using_Shutterbug_ifFailed(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				String screenshotName = scenario.getName().replaceAll(" ", "_");
				File filetest = Paths.get(".").toAbsolutePath().normalize().toFile();
				String fileName = filetest + "\\test-output\\" + screenshotName + ".png";

				BufferedImage bi = Shutterbug.shootPage(DriverFactory.getDriver(), Capture.FULL_SCROLL, 500, true)
						.getImage();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ImageIO.write(bi, "png", baos);

				byte[] bytes = baos.toByteArray();
				scenario.attach(bytes, "image/png", fileName);
			}
		} catch (Exception e) {
			Assert.assertFalse("FAIL:- to take screenshot: " + e.toString(), true);
		}
	}

	public static void screenShot(Scenario scenario) throws IOException {

		// Capturing the screenshot

		File f = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(fileName));

		ExtentCucumberAdapter.getCurrentStep().addScreenCaptureFromPath(fileName);
		ExtentCucumberAdapter.addTestStepLog(fileName);
		// ExtentCucumberAdapter.addTestStepLog(ExtentCucumberAdapter.getCurrentScenario().toString());

		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(fileName, "Screenshot taken here");
		// screenshot copied from buffer is saved at the mentioned path.
		byte[] sourcePath = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", fileName);
		System.out.println("The Screenshot is captured.");
	}

}
