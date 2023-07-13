package stepdefinitions_C;

import org.testng.Assert;

import com.pages.DashboardReportsPage;
import com.pages.LicenseeRestrictionsPage;
import com.pages.ReportRestrictionPage;
import com.qa.util.ApplicationPageUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ReportRestrictionsSteps {
	ApplicationPageUtil appPage = new ApplicationPageUtil();
	DashboardReportsPage repo = new DashboardReportsPage();
	LicenseeRestrictionsPage licenseeRest = new LicenseeRestrictionsPage();
	ReportRestrictionPage report=new ReportRestrictionPage();

	@Given("Navigate to Reports Page")
	public void navigate_to_reports_page() {
		repo.navigateTo_ReportsPage();

	}
	@Then("Verify the Reports field is Displaying for the Licensee Counsellor")
	public void verify_the_reports_field_is_displaying_for_the_licensee_counsellor() {
		String actualReportName=report.getReportNameFieldLabelText();
		String actualWorkCenterName=report.getWorkCenterFieldLabelText();
		Assert.assertTrue(actualReportName.equals("Report Name"));
		Assert.assertTrue(actualWorkCenterName.equals("Work Center"));
	}

	@Then("^Verify the Reports count (.*)$")
	public void verify_the_reports_count(String count) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		licenseeRest.validateReportsCount(count);
	}

	@Then("Verify the Reports views count")
	public void verify_the_reports_views_count() {
		
		licenseeRest.validateReportsViewsCount("17");
	}
}
