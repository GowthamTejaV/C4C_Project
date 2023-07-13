package com.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class Lead_CapApplicationDetailsPage {
	private By getCourseStatus = By.xpath("(.//*[@title='Not Started'])[1]");
	private By enterTextCourse = By.xpath(
			"(.//input[@type='text']/following-sibling::div//span[@role='presentation']/ancestor::td/following-sibling::td)[1]");
	private By enterTextInstitution = By.xpath(
			"(.//input[@type='text']/following-sibling::div//span[@role='presentation']/ancestor::td/following-sibling::td)[2]");
	private By addRow = By.xpath(".//*[@data-help-id='EDz_lefgPaUNQ93JocyW20']//bdi[text()='Add Row']");
	private By selectedCourses_LookUp = By
			.xpath(".//input[@type='text']/following-sibling::div//span[@role='presentation']");
	private By selectCourse = By.xpath(".//*[@data-help-id='OvD$PvKnOqEG$Vqbc8_xnW']");
	private By saveCourses = By.xpath(".//*[text()='Save']");

	private By getAvailableID = By
			.xpath(".//span/parent::div//parent::div[@data-help-id='if7MQIqmi4AL1JLGZkAvPW']/div/span[text()]");
	private By getCourse = By
			.xpath(".//span/parent::div//parent::div[@data-help-id='1zBGM6TE$KwZ4OTvuAxxY0']/div/span[text()]");
	private By getInstitution = By
			.xpath(".//span/parent::div//parent::div[@data-help-id='hFGSwmDjgq_qgxrvhwYACW']/div/span[text()]");
	private By getInstitutionPreference = By
			.xpath(".//span/parent::div//parent::div[@data-help-id='Nv0u1GiPbqYz6dMfnUG72G']/div/span[text()]");

	private By taskLeadID = By.xpath(".//span[@data-help-id='objectDetail-Header-Name']");

	public String getCourseStatus() {
		return ElementUtil.getAttribute(getCourseStatus, "title");
	}

	public void enterTextInCourse(String course) {
		System.out.println("course" + course);
		Actions act = new Actions(DriverFactory.getDriver());
		act.click(DriverFactory.getDriver().findElement(enterTextCourse)).click().sendKeys(course).build().perform();
		// ApplicationPageUtil.typeWithEnt(enterTextCourse, course);
	}

	public void enterTextInInstitution(String institution) {
		System.out.println("institution" + institution);
		Actions act = new Actions(DriverFactory.getDriver());
		act.click(DriverFactory.getDriver().findElement(enterTextInstitution)).click().sendKeys(institution).build()
				.perform();
		// ApplicationPageUtil.typeWithEnt(enterTextInstitution, institution);
	}

	public String getLeadID_fromTaskTab() {
		String leadID = ElementUtil.getText(taskLeadID);
		int x = leadID.lastIndexOf(")");
		int y = leadID.indexOf("(") + 1;

		String taskLeadID = leadID.substring(y, x);
		System.out.println(taskLeadID);

		return taskLeadID;
	}

	// get course text which was selected
	public HashMap<String, List<String>> get_All_CapApplication_Added_Courses() {

		HashMap<String, List<String>> coursevalues = new HashMap<String, List<String>>();
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			int size = DriverFactory.getDriver().findElements(getAvailableID).size();

			for (int i = 1; i <= size; i++) {
				ApplicationPageUtil.waitForLoadGetDisappiear();
				Thread.sleep(2300);
				String availableID = DriverFactory.getDriver().findElement(By.xpath(
						"(.//span/parent::div//parent::div[@data-help-id='if7MQIqmi4AL1JLGZkAvPW']/div/span[text()])["
								+ i + "]"))
						.getText();
				String Course = DriverFactory.getDriver().findElement(By.xpath(
						"(.//span/parent::div//parent::div[@data-help-id='1zBGM6TE$KwZ4OTvuAxxY0']/div/span[text()])["
								+ i + "]"))
						.getText();
				String institution = DriverFactory.getDriver().findElement(By.xpath(
						"(.//span/parent::div//parent::div[@data-help-id='hFGSwmDjgq_qgxrvhwYACW']/div/span[text()])["
								+ i + "]"))
						.getText();
				String institutionPreference = DriverFactory.getDriver().findElement(By.xpath(
						"(.//span/parent::div//parent::div[@data-help-id='Nv0u1GiPbqYz6dMfnUG72G']/div/span[text()])["
								+ i + "]"))
						.getText();

				if (!coursevalues.containsKey(availableID)) {
					coursevalues.put(availableID, new ArrayList<String>());
				}
				coursevalues.get(availableID).add(Course);
				coursevalues.get(availableID).add(institution);
				coursevalues.get(availableID).add(institutionPreference);
				// System.out.println(availableID+"---
				// "+Course+"----"+institution+"----"+institutionPreference);
			}
			System.out.println(coursevalues);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return coursevalues;
	}

	// Add rows in the page
	public void addRows(int rows) {
		for (int i = 1; i <= rows; i++) {

			try {
				ApplicationPageUtil.waitForLoadGetDisappiear();
				Thread.sleep(3000);
				ElementUtil.click(addRow);
			} catch (StaleElementReferenceException ex) {
				ElementUtil.click(addRow);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// Select the random coursed in page
	public void select_RandomCourses(int rows) {

		for (int i = 1; i <= rows; i++) {
			try {
				ApplicationPageUtil.waitForLoadGetDisappiear();
				Thread.sleep(3000);
				DriverFactory.getDriver().findElement(By.xpath(
						"(.//input[@type='text']/following-sibling::div//span[@role='presentation'])[" + i + "]"))
						.click();
				ApplicationPageUtil.waitForLoadGetDisappiear();
				Thread.sleep(3000);
				DriverFactory.getDriver()
						.findElement(By.xpath("(.//*[@data-help-id='OvD$PvKnOqEG$Vqbc8_xnW'])[" + i + "]")).click();

			} catch (StaleElementReferenceException ex) {
				DriverFactory.getDriver().findElement(By.xpath(
						"(.//input[@type='text']/following-sibling::div//span[@role='presentation'])[" + i + "]"))
						.click();
				ApplicationPageUtil.waitForLoadGetDisappiear();
				DriverFactory.getDriver()
						.findElement(By.xpath("(.//*[@data-help-id='OvD$PvKnOqEG$Vqbc8_xnW'])[" + i + "]")).click();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	}

	public void seletcTheSingleCourse(int i) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3000);
			DriverFactory.getDriver()
					.findElement(By.xpath(
							"(.//input[@type='text']/following-sibling::div//span[@role='presentation'])[" + i + "]"))
					.click();
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3000);
			DriverFactory.getDriver().findElement(By.xpath("(.//*[@data-help-id='OvD$PvKnOqEG$Vqbc8_xnW'])[1]"))
					.click();

		} catch (StaleElementReferenceException ex) {
			DriverFactory.getDriver()
					.findElement(By.xpath(
							"(.//input[@type='text']/following-sibling::div//span[@role='presentation'])[" + i + "]"))
					.click();
			ApplicationPageUtil.waitForLoadGetDisappiear();
			DriverFactory.getDriver().findElement(By.xpath("(.//*[@data-help-id='OvD$PvKnOqEG$Vqbc8_xnW'])[1]"))
					.click();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void seletcCourseBasedOnTheRow(int row, int course) {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3000);
			ElementUtil.click(addRow);
			DriverFactory.getDriver()
					.findElement(By.xpath(
							"(.//input[@type='text']/following-sibling::div//span[@role='presentation'])[" + row + "]"))
					.click();
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3000);
			DriverFactory.getDriver()
					.findElement(By.xpath("(.//*[@data-help-id='OvD$PvKnOqEG$Vqbc8_xnW'])[" + course + "]")).click();

		} catch (StaleElementReferenceException ex) {
			DriverFactory.getDriver()
					.findElement(By.xpath(
							"(.//input[@type='text']/following-sibling::div//span[@role='presentation'])[" + row + "]"))
					.click();
			ApplicationPageUtil.waitForLoadGetDisappiear();
			DriverFactory.getDriver()
					.findElement(By.xpath("(.//*[@data-help-id='OvD$PvKnOqEG$Vqbc8_xnW'])[" + course + "]")).click();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// Save the Courses after selecting
	public void saveCourse_Button() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		ElementUtil.click(saveCourses);
	}

	// Set the course priority
	public void setCoursePriority(int rows) {
		String institutePreference[] = { "1st Preference", "2nd Preference", "3rd Preference" };
		for (int i = 0; i < rows; i++) {
			try {
				ApplicationPageUtil.waitForLoadGetDisappiear();
				Thread.sleep(3000);
				DriverFactory.getDriver().findElement(By.xpath("(.//input[@type=\"text\"])[" + (1 + i) * 5 + "]"))
						.sendKeys(institutePreference[i]);

			} catch (StaleElementReferenceException ex) {
				DriverFactory.getDriver().findElement(By.xpath("(.//input[@type=\"text\"])[" + (1 + i) * 5 + "]"))
						.sendKeys(institutePreference[i]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	// Set the course priority
	public void setFirtPreferencePriority(int rows) {
		// String institutePreference[] = { "1st Preference", "2nd Preference", "3rd
		// Preference" };
		for (int i = 0; i < rows; i++) {
			try {
				ApplicationPageUtil.waitForLoadGetDisappiear();
				Thread.sleep(3000);
				DriverFactory.getDriver().findElement(By.xpath("(.//input[@type=\"text\"])[" + (1 + i) * 5 + "]"))
						.clear();
				DriverFactory.getDriver().findElement(By.xpath("(.//input[@type=\"text\"])[" + (1 + i) * 5 + "]"))
						.sendKeys("1st Preference");

			} catch (StaleElementReferenceException ex) {
				DriverFactory.getDriver().findElement(By.xpath("(.//input[@type=\"text\"])[" + (1 + i) * 5 + "]"))
						.clear();
				DriverFactory.getDriver().findElement(By.xpath("(.//input[@type=\"text\"])[" + (1 + i) * 5 + "]"))
						.sendKeys("1st Preference");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
