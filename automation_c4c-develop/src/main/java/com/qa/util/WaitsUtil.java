package com.qa.util;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitsUtil {
	// Fluent Wait
	public static WebElement fluentWait(By by) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverFactory.getDriver()).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(500)).ignoring(ElementNotInteractableException.class).ignoring(ElementClickInterceptedException.class)
				.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if (driver.findElement(by).isEnabled()) {
					System.out.println("The Element is enabled");
				}else {
					System.out.println("The Element is Not enabled");
				}
				return driver.findElement(by);

			}
		});
		return foo;
	}

	// Explicit wait
	public static WebElement explicit_Wait(By by) {
		WebDriverWait wait = (new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(7),
				Duration.ofMillis(500)));
		return wait.until(ExpectedConditions.elementToBeClickable(by));

	}

	public static void explicit_Wait(WebElement ele) {
		WebDriverWait wait = (new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(7),
				Duration.ofMillis(500)));
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}

	public static void Wait_For_ElementNotVisible(By by) {
		if (DriverFactory.getDriver().findElement(by).isDisplayed()) {
			WebDriverWait wait = (new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(12),
					Duration.ofMillis(500)));
			wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(by)));
		}
	}

}
