package com.pages;

import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;

public class DashboardReportsPage {  
	ApplicationPageUtil appPage = new ApplicationPageUtil();

	// navigate to Dashboard page
	public void navigateTo_DashboardPage() {
		appPage.clickTab_underCategory("Analysis", "Dashboard");
	}

	// navigate to Reports page
	public void navigateTo_ReportsPage() {
		appPage.clickTab_underCategory("Analysis", "Reports");
	}

}
