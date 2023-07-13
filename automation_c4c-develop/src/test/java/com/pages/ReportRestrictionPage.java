package com.pages;

import org.openqa.selenium.By;

import com.qa.util.ApplicationPageUtil;
import com.qa.util.ElementUtil;

public class ReportRestrictionPage {
	private By reportName=By.xpath(".//*[@data-help-id='BYtAafvV0aUEuNBwz5CnVG']/bdi");
	private By workCenter=By.xpath(".//*[@data-help-id='NPuF4qyTS4g973dE55hzm0']/bdi");
	
	
	public String getReportNameFieldLabelText() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getText(reportName);
	}
	public String getWorkCenterFieldLabelText() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getText(workCenter);
	}

}
