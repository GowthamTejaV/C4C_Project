package stepdefinitions_C;

import java.util.List;
import java.util.Set;
import org.testng.Assert;
import com.pages.LeadCreationPage;
import com.qa.util.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.ExcelUtil;
import com.qa.util.Excel_Reader;

import AppHooks.ApplicationHooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VisaMigrationLeadSteps {
	LeadCreationPage lead = new LeadCreationPage();
	ExcelReader exc = new ExcelReader();

	@Then("^Enter the Category (.*)$")
	public void enter_the_category_as(String testcaseNo) {

        ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		String category = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Category");
       
		lead.enter_category_Status(category);
	}

	@Then("^Enter the visa type (.*)$")
	public void enter_the_visa_type_as(String testcaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		String visaType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Visa Type");
		lead.enter_visaType(visaType);
	}

	@Given("Click on Qualification Level DropDown and confirm all the picklist values are displayed")
	public void click_on_qualification_level_drop_down_and_confirm_all_the_picklist_values_are_displayed() {
		List<String> str = Excel_Reader.getListOf_values("Lead_Creation_DropDown_Values", "Qualification Level");
		System.out.println("From table:-" + str);
		lead.click_on_qualification();
		Set<String> st = lead.get_PickListvalues();
		System.out.println("From Page:-" + st);
		Assert.assertTrue(str.containsAll(st));
	}

	@Then("Click on Category DropDown and confirm all the picklist values are displayed")
	public void click_on_category_drop_down_and_confirm_all_the_picklist_values_are_displayed() {
		List<String> str = Excel_Reader.getListOf_values("Lead_Creation_DropDown_Values", "Category");
		System.out.println("From table:-" + str);
		lead.click_on_Category();
		Set<String> st = lead.get_PickListvalues();
		System.out.println("From Page:-" + st);
		Assert.assertTrue(str.containsAll(st));
	}

	@Then("Click on Source DropDown and confirm all the picklist values are displayed")
	public void click_on_source_drop_down_and_confirm_all_the_picklist_values_are_displayed() {
		List<String> str = Excel_Reader.getListOf_values("Lead_Creation_DropDown_Values", "Source");
		System.out.println("From table:-" + str);
		lead.click_on_Source();
		Set<String> st = lead.get_PickListvalues();
		System.out.println("From Page:-" + st);
		Assert.assertTrue(str.containsAll(st));
	}

	@Then("Click on I would like to study in DropDown and confirm all the picklist values are displayed")
	public void click_on_i_would_like_to_study_in_drop_down_and_confirm_all_the_picklist_values_are_displayed() {
		List<String> str = Excel_Reader.getListOf_values("Lead_Creation_DropDown_Values", "I Would Like to Study In");
		System.out.println("From table:-" + str);
		lead.click_on_i_Would_Like_TO_StudyIN();
		Set<String> st = lead.get_PickListvalues();
		System.out.println(str.containsAll(st));
		System.out.println("From Page:-" + st);
		Assert.assertTrue(str.containsAll(st));
	}
}
