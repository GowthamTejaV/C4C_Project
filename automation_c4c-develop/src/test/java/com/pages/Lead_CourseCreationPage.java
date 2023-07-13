package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ElementUtil;
import com.qa.util.WaitsUtil;

public class Lead_CourseCreationPage {
	private By deleteCourseIcon = By.xpath(".//span[@data-help-id='vj52C2fWh4sNXo6wRIz$OW']");
	private By totalCourses = By.xpath(".//span[@data-help-id='Bcjcv_D7CqYvwYb8yMG2KW-variantManagement-count']//bdi");
	private By course_SelectionTab = By
			.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'COURSE SELECTION')]");
	private By addCourseBtn = By.xpath(".//*[@data-help-id='sow6_816a4EQYTEM_HPQ00']");
	private By clickOnSearchBtn = By.xpath(".//*[@data-help-id='vPCZpGIoqqo7EG0TXqd3Jm-searchButton']");
	private By enterSearchTxt = By.xpath("(.//*[@placeholder='Search'])[2]");
	private By enterSearchTxt2 = By.xpath("(.//*[@placeholder='Search'])[1]");
	private By selectFirstCourse = By.xpath(".//*[@data-help-id='UnMT1A6N64M0x8fZw59CYm']");
	private By save_Course = By.xpath(".//*[@data-help-id='ri5eGNT8EK_NrSYPtZASbW']");
	private By cancelCourseWindow = By.xpath(".//*[@data-help-id='xcesVfDOf4cC2njepdYD_W']");

	private By IDPClientFilter = By.xpath(".//*[@title='IDP Client']/parent::th");
	private By IDPClientFilterText = By.xpath("(.//*[@role='textbox'])");

	private By SelectedCourses = By.xpath(".//*[@data-help-id='Bcjcv_D7CqYvwYb8yMG2KW-variantManagement-title']//bdi");

	/***********************************************************************/



	public void click_DeleteCurseIcon() {
		ElementUtil.waitForPageLoad();
		ElementUtil.scrollToElement(deleteCourseIcon);
		ElementUtil.click(deleteCourseIcon);
	}

	// Get total courses
	public int getTodtalCourses() {
		ElementUtil.waitForPageLoad();
		String txt = ElementUtil.getText(totalCourses);
		String countTxt = txt.replace("(", "").replace(")", "");
		return Integer.valueOf(countTxt);

	}

	// filter based on the IDPClient on the Course Creation page

	public void filter_Based_On_IDPClient_Course(String searchtxt) {

		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3300);
			ElementUtil.scrollToElement(IDPClientFilter);
			ElementUtil.click(IDPClientFilter);
			ApplicationPageUtil.typeWithEnt(IDPClientFilterText, searchtxt);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectIDPCourse(String txt) {
		try {
			navigateToCourseSelectionTab();
			click_OnAddCourse_Button();
			click_OnSearchIcon();
			searchForCourse(txt);
			select_FirstCourseInList();
			cancelAddCourseWindow();
			Thread.sleep(4300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void navigateToCourseSelectionTab() {
		try {
			ElementUtil.waitForPageLoad();
			ElementUtil.scrollToElement(course_SelectionTab);
			ElementUtil.click(course_SelectionTab);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void click_OnAddCourse_Button() {

		try {
			Thread.sleep(4400);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.click(addCourseBtn);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void click_OnSearchIcon() {

		try {
			Thread.sleep(7000);
			ApplicationPageUtil.waitForLoadGetDisappiear();

			ElementUtil.click(clickOnSearchBtn);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void searchForCourse(String txt) {
		try {
			Thread.sleep(2500);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			Thread.sleep(3500);

			try {
				if (ElementUtil.isElementDisplayed(enterSearchTxt)) {
					ApplicationPageUtil.typeWithEnt(enterSearchTxt, txt);
				} else {
					ApplicationPageUtil.typeWithEnt(enterSearchTxt2, txt);
				}
			} catch (Exception ex) {
			}
			Thread.sleep(2500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void select_FirstCourseInList() {

		ElementUtil.waitForPageLoad();
		try {
			ElementUtil.waitForPageLoad();
			ElementUtil.click(selectFirstCourse);
			Thread.sleep(1500);
			ElementUtil.click(selectFirstCourse);
			ElementUtil.click(cancelCourseWindow);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void save_course() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();

			if (ElementUtil.isElementDisplayed(save_Course)) {
				ElementUtil.click(save_Course);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

		public void cancelAddCourseWindow() {
			try {
			ElementUtil.waitForPageLoad();
			    Thread.sleep(1200);
				if(ElementUtil.isElementDisplayed(cancelCourseWindow)) {
					ElementUtil.click(cancelCourseWindow);
				}
				
			} catch (Exception e) {
				
			}

		}
		
		public String getSelectedCoursesText() {
			
			try {
				ApplicationPageUtil.waitForLoadGetDisappiear();
				return ElementUtil.getTextValue(SelectedCourses);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "";
			}
			
		}
//Selected Courses
}
