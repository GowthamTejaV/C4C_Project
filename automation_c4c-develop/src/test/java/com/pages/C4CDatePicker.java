package com.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.WaitsUtil;

public class C4CDatePicker {


	// 2023-08-10
	/**
	 * @author gowtham.teja
	 * @param fieldLabelName
	 * @param YYY_MM_DD
	 * This method is used to select the Date from the C4C date picker
	 * 
	 * Date Format YYYY-MM-DD (Note:-Date Input format should be YYYY-MM-DD ,later it update according the application format)
	 */
	public static void enterTheDateWith_FieldLabelName(String fieldLabelName, String YYY_MM_DD) {
		
		
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			String de[] = YYY_MM_DD.split("-");
			String year = de[0];
			String month = de[1];
			String day = de[2];

			
			char st[] = day.toCharArray();
			char s = st[0];
			if (String.valueOf(s).equals("0")) {
				day = day.replace("0", "");

			}
			
			char mn[] = month.toCharArray();
			char m= mn[0];
			if (String.valueOf(m).equals("0")) {
				month = month.replace("0", "");

			}
			// Locate the date picker element
		   
			try {
			// Locate the date picker element
				WebElement datePicker = DriverFactory.getDriver().findElement(By.xpath(
					".//span[@title='" + fieldLabelName.trim() + "']/following-sibling::div//span[@title='Open Picker']"));
			// Click the date picker to open the calendar
			datePicker.click();
			}catch(ElementClickInterceptedException ex) {
				ElementUtil.scrollToElement(By.xpath(".//span[@title='" + fieldLabelName.trim() + "']/following-sibling::div//span[@title='Open Picker']"));
				ElementUtil.jsClick(By.xpath(".//span[@title='" + fieldLabelName.trim() + "']/following-sibling::div//span[@title='Open Picker']"));
			}
			Thread.sleep(1000);
			//Click in the Years button on top
			ElementUtil.click(By.xpath(".//div[contains(@style, 'block')  and @role='dialog']//button[@aria-label][3]"));
			
			//Store all the year values in list
			List<WebElement> dates = DriverFactory.getDriver().findElements(By.xpath(
							".//div[@data-sap-year-start]/parent::div/parent::div[not(@style)]/child::div/child::div[text()]"));

			//Collect the values in to SortedSet for default sorting order
			SortedSet<String> years = new TreeSet<String>();
             //Add all the value text to SortedSet collection
			for (WebElement date : dates) {
				years.add(date.getText());
			}
			
			//After Default sorting convert the SortedSet to List for the index 
			List<String> lstYears = new ArrayList<>(years);
			
			//Check whether the input year is displaying on the current picker
			if (years.contains(year)) {
				for (WebElement date : dates) {
					if (date.getText().equals(year)) {
						date.click();
						break;
					}
				}
			}
			//If the Year is not present 
			while (!years.contains(year)) {
				String yr = year;
				System.out.println(yr);
				String lyr = lstYears.get(0);
				System.out.println(lyr);
				//If year is lesser that least value 
				if (Integer.parseInt(yr) < Integer.parseInt(lyr)) {
					//click on previous button
					ElementUtil.click(By.xpath(".//div[contains(@style, 'block')and @role='dialog']//button[@aria-label='Previous']"));
					dates.clear();
					
					dates = DriverFactory.getDriver().findElements(By.xpath(
							".//div[@data-sap-year-start]/parent::div/parent::div[not(@style)]/child::div/child::div[text()]"));
					years.clear();
					for (WebElement date : dates) {
						years.add(date.getText());
					}
					lstYears = new ArrayList<>(years);

					if (years.contains(year)) {
						for (WebElement date : dates) {
							if (date.getText().equals(year)) {
								date.click();
								break;
							}
						}
					}
				}
                 ////If year is greater that least value
				if (Integer.parseInt(yr) > Integer.parseInt(lyr) - 1) {
					//click on Next button
					ElementUtil.click(By.xpath(".//div[contains(@style, 'block')and @role='dialog']//button[@aria-label='Next']"));
					dates.clear();
					dates = DriverFactory.getDriver().findElements(By.xpath(
							".//div[@data-sap-year-start]/parent::div/parent::div[not(@style)]/child::div/child::div[text()]"));
					years.clear();
					for (WebElement date : dates) {
						years.add(date.getText());
					}
					lstYears = new ArrayList<>(years);
					if (years.contains(year)) {
						for (WebElement date : dates) {
							if (date.getText().equals(year)) {
								date.click();
								break;
							}
						}
					}
				}
			}

			//Click on Month 
			Actions act = new Actions(DriverFactory.getDriver());
			act.moveToElement(DriverFactory.getDriver().findElement(By.xpath(".//div[contains(@style, 'block') and @role='dialog']//button[@aria-label][2]"))).click()
					.build().perform();
			Thread.sleep(2000);
			
			//select the month
			WaitsUtil.fluentWait(By.xpath("(.//div[contains(@style, 'block') and @role='dialog']//div[contains(@class,'sapUiCalItem') and  text()])[" + month + "]")).click();
	
            //Select the day
			Thread.sleep(2000);
			
			WaitsUtil.fluentWait((By.xpath(".//div[not(contains(@style,'hidden')) and @role='dialog']//div[not(contains(@aria-disabled,'true'))]/child::span[text()='"+ day + "']"))).click();
				
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
