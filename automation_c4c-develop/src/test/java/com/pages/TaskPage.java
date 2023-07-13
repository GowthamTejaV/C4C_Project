package com.pages;

import org.openqa.selenium.By;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.ElementUtil;

public class TaskPage {
	private By CAP_Application_Details = By
			.xpath(".//*[@dir='ltr'][@class='sapMITBText'][contains(text(),'CAP Application Details')]");

	// navigate to the CAP_Application_Details tab
	public void navigateTo_CAP_Application_Details_Tab() {
		try {
			ApplicationPageUtil.waitForLoadGetDisappiear();
			ElementUtil.scrollToElement(CAP_Application_Details);
			ElementUtil.click(CAP_Application_Details);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
