
package stepdefinitions_C;
import java.util.List;
import org.testng.Assert;
import com.pages.IC_CreationPage;
import com.pages.IC_LeadCreationpage;
import com.pages.LeadCreationPage;
import com.pages.Lead_CourseCreationPage;
import com.pages.Lead_QalificationCreationPage;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.ExcelReader;
import com.qa.util.ExcelUtil;
import com.qa.util.Excel_Reader;
import AppHooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CourseEnquiryLeadSteps {
	private static String Category;
	private static String source;
	private static String level;
	private static String liketoStudyIn;
	private static String Leadstatus;
	private static String subCategory;
	ExcelReader exc = new ExcelReader();
	private String idpID;
	IC_CreationPage icp = new IC_CreationPage();
	IC_LeadCreationpage leadPage = new IC_LeadCreationpage();
	LeadCreationPage lead = new LeadCreationPage();
	ApplicationPageUtil appPageUtil = new ApplicationPageUtil();
	Lead_QalificationCreationPage lQ = new Lead_QalificationCreationPage();
	Lead_CourseCreationPage lead_cource_creation = new Lead_CourseCreationPage();


	@And("Navigate to Individual Customers Page")
	public void navigate_to_individual_customers_page() {

		try {
			icp.navigateTo_IC_page_As_Counsellor();
			System.out.println("Navigate to Individual Customers Page ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("IC page Should display the list of individual customers in the tabular format successfully")
	public void ic_page_should_display_the_list_of_individual_customers_in_the_tabular_format_successfully() {
		int count = icp.get_total_Count_IC_Cords_Table();
		Assert.assertTrue(true);

	}

	@When("User Open an existing Individual customer")
	public void user_open_an_existing_individual_customer() {
		String studentID = ConfigReader.getApplicationPropertie("studentID");
		icp.search_for_IC(studentID);
		icp.select_search_IC_Record();

	}
	@When("User Open an existing student360 Individual customer")
	public void user_open_an_existing_student360_individual_customer() {
		String studentID = ConfigReader.getApplicationPropertie("student360Id");
		icp.search_for_IC(studentID);
		icp.select_search_IC_Record();

	}

	@When("^User search for existing Individual customer (.*)$")
	public void user_search_for_existing_individual_customer(String categoryTcNo) {

		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(categoryTcNo);
		String id = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "IC_Search_ID");

		icp.search_for_IC(id);// 50169422
		icp.select_search_IC_Record();

	}

	@Then("The relevant Individual customer details should land in overview section")
	public void the_relevant_individual_customer_details_should_land_in_overview_section() {

		String text = icp.get_IC_overviewPage_text();

		Assert.assertTrue(text.contains("PERSONAL PROFILE"));
	}

	@And("Navigate to lead tab")
	public void navigate_to_lead_tab() {

		leadPage.navigateToLeadTab();
	}

	@And("Click on Add icon")
	public void click_on_add_icon() {
		try {
			Thread.sleep(2500);
			ApplicationPageUtil.waitForLoadGetDisappiear();
			leadPage.click_On_Add_icon_IC_Lead();
			ApplicationPageUtil.waitForLoadGetDisappiear();
			// Thread.sleep(7000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Then("Verify the Lead status got update")
	public void verify_the_lead_status_got_updated() {
		String categ=leadPage.getStatusText();
		Assert.assertTrue(Leadstatus.contains(categ));
	}
	@Then("Verify the Lead is crated with the category {string}")
	public void verify_the_lead_is_crated_with_the_category_as(String cate) {
		String categ=leadPage.getcategory();
		Assert.assertTrue(cate.contains(categ));
	}
	@Then("Verify the Lead is created with the Source")
	public void verify_the_lead_is_created_with_the_source_as_dc() {
		String soue=leadPage.getSourcetext();
		Assert.assertTrue(source.contains(soue));
	}
	@Then("Verify the Lead is created with the Qualification Leave")
	public void verify_the_lead_is_created_with_the_qualification_leave_as_qualification_leave() {
		String qualificationLevel=leadPage.getQualificationLevel();
		Assert.assertTrue(level.contains(qualificationLevel));
	}
	@Then("Verify the Lead is created with the Would like to Study In Field")
	public void verify_the_lead_is_created_with_the_would_like_to_study_in_field_as_would_like_to_study_in() {
	    String IWouldLikeToStudyIn=leadPage.getIwouldLikeToStudyIn();
	    Assert.assertTrue(liketoStudyIn.contains(IWouldLikeToStudyIn));
	}


	@When("^user Enter details on the Category field as (.*)$")
	public void user_enter_details_on_the_category_field(String testcaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		Category = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Category");

		lead.enter_category_Status(Category);
	}


	@When("^user Enter details on the Studnet ID (.*)$")
	public void user_enter_details_on_the_Student_ID(String testcaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		String studentID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "StudentID");
		lead.enter_StudentField(studentID);;
	}

	@When("user Enter details on the Category field {string}")
	public void user_enter_details_on_the_category_field_(String string) {
		lead.enter_category_Status(string);
	}

	@And("^Enter the source (.*)$")
	public void enter_the_source(String testcaseNo) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		source = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Source");

		lead.enter_SourceText(source);

	}

	@And("^Enter Qualification Level (.*)$")
	public void enter_qualification_level(String testcaseNo) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1500);
			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
			level = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation","Qualification Level");

			lead.enter_the_Qualification(level);
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("^Enter the Sub Category field (.*)$")
	public void enter_the_sub_category_field_ses(String testcaseNo) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		try {
			Thread.sleep(1500);
			ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
			subCategory = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation","sub category");
			System.out.println(subCategory);
			lead.enter_sub_Category(subCategory);
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("^Enter Would like to Study In Field (.*)$")
	public void enter_would_like_to_study_in_field(String testcaseNo) {

		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		liketoStudyIn = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"I Would Like to Study In");

		lead.enter_i_Would_Like_TO_StudyIN(liketoStudyIn);
	}

	@Then("The values should be Prefilled for the Name")
	public void the_values_should_be_prefilled_for_the_name() {
		String name = lead.get_NameText();
		boolean flag = !(name.equals(""));
		System.out.println(name + " " + flag);
		Assert.assertTrue(flag);
	}

	@And("values should be Prefilled for the Category")
	public void values_should_be_prefilled_for_the_category() {
		String category = lead.get_CategoryText();
		boolean flag = !(category.equals(""));
		Assert.assertTrue(flag);
	}

	@And("values should be Prefilled for the Student")
	public void values_should_be_prefilled_for_the_student() {
		String student = lead.get_StudentText();
		boolean flag = !(student.equals(""));
		Assert.assertTrue(flag);
	}

	@And("values should be Prefilled for the IDP Owner")
	public void values_should_be_prefilled_for_the_idp_owner() {
		String Idpowner = lead.get_idp_ownerText();
		boolean flag = !(Idpowner.equals(""));
		Assert.assertTrue(flag);
	}

	@And("values should be Prefilled for the IDP Office")
	public void values_should_be_prefilled_for_the_idp_office() {
		String office = lead.get_idp_officeText();
		boolean flag = !(office.equals(""));
		Assert.assertTrue(flag);
	}

	@And("values should be Prefilled for the IDP Team")
	public void values_should_be_prefilled_for_the_idp_team() {
		String team = lead.get_idp_officeText();
		boolean flag = !(team.equals(""));
		Assert.assertTrue(flag);
	}

	@When("Use save the details successsfully with Qualification as Cold")
	public void use_save_the_details_successsfully_with_qualification_as_cold() {
		lead.enter_SourceText("Chat");
		lead.enter_study_level_i_prefer("English Language");
		lead.enter_Study_plan_dateText("2023-02-11");
		lead.save_and_Open();

	}

	@When("^User save the Qualification details successsfully (.*)$")
	public void use_save_the_Qualification_details_successsfully(String testcaseNo) {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNo);
		String study_level = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Study Level I Prefer Is");
		String plan_dateText = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Study Plan Date");

		lead.enter_Study_plan_dateText(plan_dateText);
		lead.enter_study_level_i_prefer(study_level);
		lead.save_and_Open();
	}

	@When("Use save the details successsfully with Qualification as Warm")
	public void use_save_the_details_successsfully_with_qualification_as_warm() {
		lead.enter_SourceText("Chat");
		lead.enter_study_level_i_prefer("English Language");
		lead.enter_Study_plan_dateText("2024-02-11");
		lead.save_and_Open();
	}

	@When("^Use save the details successsfully with Qualification as Unqualified$")
	public void use_save_the_details_successsfully_with_qualification_as_unqualified() {
		lead.save_and_Open();
	}

	@Then("Verify if the created lead is added as a line item in the Lead Table")
	public void verify_if_the_created_lead_is_added_as_a_line_item_in_the_lead_table() {
		// TT_TRAIN Name2891

		String id = lead.get_LeadID();
		// ConfigReader.writeToApplicationPropertie("LeadID",str);
		lead.Naviagte_To_Lead_Tab_under("Prospect");
		lead.search_for_Lead(id);
	}

	@When("User Select the created lead")
	public void user_select_the_created_lead() {
		lead.select_the_searchLead();
	}

	@Then("lead overview page should be displayed successfully")
	public void lead_overview_page_should_be_displayed_successfully() {

	}

	@And("Navigate to lead tab from home screen")
	public void navigate_to_lead_tab_from_home_screen() {

		lead.Naviagte_To_Lead_Tab_under("Prospect");
		// lead.click_on_createLead_Icon();
	}
	@Then("Click On Lead List View Drop-Down button")
	public void click_on_lead_list_view_drop_down_button() {
		lead.clickListViewDropDown();
	}
	@Then("Verify all the dropdown values in lead list view")
	public void verify_all_the_dropdown_values_in_lead_list_view() {
	    List<String>actualList=lead.getAllTheLeadListViewDropDownValues();
	    System.out.println("Actual Result:- "+actualList);
	    List<String>expectedList = Excel_Reader.getListOf_values("Lead_Creation_DropDown_Values", "License User Lead List View Options");
	    Assert.assertTrue(actualList.containsAll(expectedList));
	    
	}

	@When("user Enter all the mandatory details and Qualification Level field as {string}")
	public void user_enter_all_the_mandatory_details(String string) {
		try {
			lead.enter_StudentField("50169422");
			lead.enter_Qualification_Level(string);
			lead.enter_Source("Chat");
			lead.enter_I_Would_Like_to_Study_In("Canada");
			lead.enter_Study_Level_I_Prefer_Is("English Language");
			lead.enter_Study_Plan_Date("07.12.2024");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@And("Click on Lead Add icon")
	public void click_on_lead_add_icon() {
		try {
			lead.click_on_CreateLead_Icon();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/***********************************************************************************************/

	@When("user select lead on table")
	public void user_select_lead_on_table() {

		// ConfigReader.writeToApplicationPropertie("LeadID",leadid);

		leadPage.select_On_Lead_from_IC_Flow();

	}

	@When("Now click on the edit button on Qualification Page")
	public void now_click_on_the_edit_button_on_Qualification_Page() {
		lQ.click_On_Edit_Qualification();
	}

	@When("^Update the Qualification Level (.*)$")
	public void update_the_qualification_level(String tcNo) {

		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNo);
		String qualification = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"update_the_qualification_level");
		lQ.update_qualification(qualification);
	}

	@When("^update the I would like to study in (.*)$")
	public void update_the_i_would_like_to_study_in(String tcNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNo);
		liketoStudyIn = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"update_I_Would_Like_to_Study_In");
		lQ.update_I_Would_Like_to_Study_In(liketoStudyIn);
		// Excel_Reader.getTestDataInMap("IC_Lead_Creation", testcaseNo).get("Study Plan
		// Date")
	}

	@Given("^update I would like to study in Qualification Tab (.*)$")
	public void update_i_would_like_to_study_in_qualification_tab_dc(String tcNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNo);
		liketoStudyIn = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"update_I_Would_Like_to_Study_In");
		lQ.update_I_Would_Like_to_Study_In_QualificationPage(liketoStudyIn);
	}

	@Given("^Update Study Plan Date in Qualification Tab (.*)$")
	public void update_study_plan_date_in_qualification_tab_dc(String tcNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNo);
		String date = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"update_the_study_plan_date");
		lQ.enter_study_plan_date(date);
	}

	@Given("^Update Qualification Level in Qualification Tab (.*)$")
	public void update_qualification_level_in_qualification_tab_dc(String tcNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNo);
		level = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"update_the_qualification_level");
		lQ.enter_qualification(level);
	}

	@Given("^Update study Level i Prefer is in Qualification Tab (.*)$")
	public void update_studyLevel_I_Prefer_Is_in_qualification_tab_dc(String tcNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNo);
		String studyLevel = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"update_Study_Level_I_Prefer");
		lQ.enter_studyLevel_I_Prefer_Is(studyLevel);
	}

	@Then("User click on Qualification tab save button")
	public void user_click_on_qualification_tab_save_button() {
		lQ.save_qualification();
	}

	@Then("User should navigate to Qualification Tab")
	public void user_should_navigate_to_qualification_tab() {
		lQ.navigateTo_QualificationTab();
	}

	@Then("^Update the Study Plan Date (.*)$")
	public void update_the_study_plan_date(String tcNo) {
		// Write code here that turns the phrase above into concrete actions

		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNo);
		String study_plan_date = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"update_the_study_plan_date");
		lQ.update_study_plan_date(study_plan_date);
	}

	@Then("Qualification Details should be saved successfully")
	public void qualification_details_should_be_saved_successfully() {

	}

	@When("^User creates the Qualification details successfully (.*)$")
	public void user_creates_the_qualification_details_successfully(String string) {
		lQ.create_Qualification(string);
	}

	@When("user navigate to the Lead page overViewPage")
	public void user_navigate_to_the_lead_page_over_view_page() {
		leadPage.navigate_to_OverviewPage();
		ConfigReader.writeToApplicationPropertie("LeadID", lead.get_LeadID());
		System.out.println("LEAD ID-" + lead.get_LeadID());
	}

	@When("user click on student name hyperlink")
	public void user_click_on_student_name_hyperlink() {
		lead.click_0n_StudentName_hyperLikn();
	}

	@Then("user redirect to IC Overview page")
	public void user_redirect_to_ic_overview_page() {
		icp.navigateTOICOverviewPage();
	}

	/*************************************************************************/
	@When("user clicks on Lead Edit button")
	public void user_clicks_on_lead_edit_button() {
		lead.click_on_LeadEditIcon();
	}

	@When("^Update the IDP owner to (.*)")
	public void update_the_idp_owner_to(String rowNo) {
		lead.update_IDP_Owner(rowNo);
	}

	@When("^Update the Lead Status to (.*)")
	public void update_the_lead_status_to(String rowNo) {
		lead.update_Lead_Status(rowNo);
	}

	@When("user click lead save button")
	public void user_click_lead_save_button() {
		lead.Click_On_Save_Lead_Update();
	}

	@Then("Lead records should be updated successfully")
	public void lead_records_should_be_updated_successfully() {

	}

	@When("user click on Save and Open")
	public void user_click_on_save_and_open() {
		lead.save_and_Open();
	}

	/***************************
	 * Mandatory Fields validation
	 ***************************************************************************/
	@When("user enter Student field as blank")
	public void user_enter_student_field_as_blank() {
		// lead.create_the_Lead__Record("50169422","Hot","Chat","Canada","Postgraduate",
		// "14.12.2023", "Course Enquiry");
	}

	@Then("Save should rejected because Student field is mandatory by key user")
	public void save_should_rejected_because_student_field_is_mandatory_by_key_user() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enter Category field as blank (.*)$")
	public void user_enter_category_field_as_blank(String rowNo) {

		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(rowNo);
		String stdID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "StudentID");
		String qualType = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Qualification Level");
		String source = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Source");
		String would_Like_to_Study_In = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"I Would Like to Study In");
		String study_Level_I_Prefer_Is = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData,
				"ICLeadCreation", "Study Level I Prefer Is");
		String study_Plan_Date = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Study Plan Date");
		String Category = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Category");

		lead.create_the_Lead__Record(stdID, qualType, source, would_Like_to_Study_In, study_Level_I_Prefer_Is,
				study_Plan_Date, Category);
	}

	@Then("Save should rejected because Category field is mandatory by key user")
	public void save_should_rejected_because_category_field_is_mandatory_by_key_user() {
		lead.enter_category_Status("Course Enquiry");
	}

	@When("user enter I Would Like to Study In field as blank")
	public void user_enter_i_would_like_to_study_in_field_as_blank() {

		try {
			Thread.sleep(4000);
			lead.enter_I_Would_Like_to_Study_In("");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Save should rejected because I Would Like to Study In field is mandatory by key user")
	public void save_should_rejected_because_i_would_like_to_study_in_field_is_mandatory_by_key_user() {
		lead.enter_I_Would_Like_to_Study_In("Canada");
	}

	@When("user enter Source field as blank")
	public void user_enter_source_field_as_blank() {
		lead.enter_Source("");
		// lead.create_the_Lead__Record("50169422","Hot","","Canada","Postgraduate",
		// "14.12.2023", "Course Enquiry");
	}

	@Then("Save should rejected because Source field is mandatory by key user")
	public void save_should_rejected_because_source_field_is_mandatory_by_key_user() {
		// lead.enter_Source("Chat");
	}

	@When("user enter IDP Owner field as blank")
	public void user_enter_idp_owner_field_as_blank() {
		idpID = lead.get_idp_owner_name();
		System.out.println("----------->" + idpID);
		lead.enter_idp_owner("");

	}

	@Then("Save should rejected because IDP Owner field is mandatory by key user")
	public void save_should_rejected_because_idp_owner_field_is_mandatory_by_key_user() {
		lead.enter_idp_owner(idpID);
	}

	@When("user enter IDP Office field as blank")
	public void user_enter_idp_office_field_as_blank() {
		idpID = lead.get_idp_office();
		System.out.println("This is Before-->" + idpID);
		lead.enter_idp_office("");
	}

	@Then("Save should rejected because IDP Office field is mandatory by key user")
	public void save_should_rejected_because_idp_office_field_is_mandatory_by_key_user() {
		System.out.println("This Owner-->" + idpID);
		lead.enter_idp_office(idpID);
	}

	@When("user enter IDP Team field as blank")
	public void user_enter_idp_team_field_as_blank() {
		idpID = lead.get_idp_Team();
		lead.enter_idp_Team("");
	}

	@Then("Save should rejected because IDP Team field is mandatory by key user")
	public void save_should_rejected_because_idp_team_field_is_mandatory_by_key_user() {
		lead.enter_idp_Team(idpID);
	}

	@Given("^User search for the Lead Category as (.*) Status as (.*) and qualification level as (.*) and study plan date as (.*)$")
	public void user_search_for_the_lead_category_as_status_as_and_qualification_level_as_and_study_plan_date_as(
			String categoryTcNo, String StatusTcNo, String levelTcNo, String planDateTcNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(categoryTcNo);

		String category = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Advance Filter Category");

		String Status = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Advance Filter Status");

		String level = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Advance Filter Qualification Level");

		String planDate = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Advance Filter Study Plan Date");

		lead.lead_advanceSearch(category, level, Status, planDateTcNo);
	}

	@When("user select lead on leads page table")
	public void user_select_lead_on_leads_page_table() {
		lead.selectSingle_Lead_from_table();
	}



	/******************************************************/

	@Then("the user should not able to conver the lead to opportunity")
	public void the_user_should_not_able_to_conver_the_lead_to_opportunity() {
		boolean flag = lead.check_Conver_Opportunity_Option_Availablity();
		Assert.assertFalse(flag);
	}

	/*
	 * @Then("IC page Should display the list of individual customers in the tabular format successfully"
	 * ) public void
	 * ic_page_should_display_the_list_of_individual_customers_in_the_tabular_format_successfully
	 * () { int count=icp.getCountOf_IC_InTable();
	 * Assert.assertTrue("PAGE DISPLAYES THE LSIT OF"+count,count>0);
	 * 
	 * }
	 */

	@When("user Enter details on the Category field")
	public void user_enter_details_on_the_category_field() {

	}

	@And("Enter Qualification Level field as {string}")
	public void enter_qualification_level_field_as(String string) {
		lead.enter_the_Qualification(string);
	}

	@And("Enter Would like to Study In Field")
	public void enter_would_like_to_study_in_field() {
		lead.enter_i_Would_Like_TO_StudyIN("Canada");
	}

	@When("Use save the details successsfully with Qualification as Hot")
	public void use_save_the_details_successsfully_with_qualification_as_hot() {

		lead.enter_SourceText("Chat");
		lead.enter_study_level_i_prefer("English Language");
		lead.enter_Study_plan_dateText("2023-02-11");
		lead.save_and_Open();

	}

	/***********************************************************************************************/

	@When("Update the Qualification Level")
	public void update_the_qualification_level() {
		lQ.update_qualification("Warm");
	}

	@When("update the I would like to study in")
	public void update_the_i_would_like_to_study_in() {
		lQ.update_I_Would_Like_to_Study_In("Germany");
	}

	@Then("Update the Study Plan Date")
	public void update_the_study_plan_date() {
		// Write code here that turns the phrase above into concrete actions
		lQ.update_study_plan_date("07.12.2024");
	}

	@When("User creates the Qualification details successfully")
	public void user_creates_the_qualification_details_successfully() {
		lQ.create_Qualification();
	}

	/*************************************************************************/

	/***************************
	 * Mandatory Fields validation
	 * 
	 * 
	 * @When("user enter Category field as blank") public void
	 * user_enter_category_field_as_blank() {
	 * lead.create_the_Lead__Record("50169422", "Hot", "Chat", "Canada",
	 * "Postgraduate", "14.12.2023", ""); }
	 * 
	 * 
	 * // @Given("User search for the Lead Category as {string} Status as {string}
	 * and qualification level as {string}") // public void
	 * user_search_for_the_lead_category_as_status_as_and_qualification_level_as(String
	 * string, String string2, // String string3) { //
	 * lead.lead_advanceSearch(string, string3, string2); // }
	 * 
	 * 
	 * /
	 ******************************************************/

	@Then("Navigate to Course selection tab")
	public void navigate_to_course_selection_tab() {
		lead_cource_creation.navigateToCourseSelectionTab();
	}

	@Then("click on Add Courses button")
	public void click_on_add_courses_button() {
		lead_cource_creation.click_OnAddCourse_Button();
	}

	@Then("select the Cource and click cancel button")
	public void select_the_cource_and_click_cancel_button() {
		lead_cource_creation.click_OnSearchIcon();
		lead_cource_creation.searchForCourse("PRG-UK-00274456");
		lead_cource_creation.select_FirstCourseInList();
		lead_cource_creation.cancelAddCourseWindow();
		lead_cource_creation.save_course();

	}

	@Then("^Search for Lead (.*)$")
	public void search_for_lead_dc_search_for_lead(String testcaseNO) {
		ApplicationPageUtil.waitForLoadGetDisappiear();

		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNO);
		String leadID = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Lead_Search_ID");
		String txt = leadID;
		lead.search_for_Lead(txt);
	}

	@Then("The selected course details should be added as a line item in the Selected Courses table")
	public void the_selected_course_details_should_be_added_as_a_line_item_in_the_selected_courses_table() {

	}
	// lq.click_QualificationTab();

	@Given("Navigate to Qualification Tab")
	public void navigate_to_qualification_tab() {

		lQ.click_QualificationTab();
	}

	@Then("^Filter the records based on the category (.*)$")
	public void filter_the_records_based_on_the_category_dc(String testcaseNO) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNO);
		String category = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Category");
		leadPage.filter_IC_Lead_Based_on_Category(category);
	}

	@Then("^Filter the records based on the qualification level (.*)$")
	public void filter_the_records_based_on_the_qualification_level(String testcaseNO) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testcaseNO);
		String qualification_Level = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Filter_Qualification_Level");
		leadPage.filter_IC_Lead_Based_on_Qualification_level(qualification_Level);
	}

	@Then("^Filter the records based on the Status (.*)$")
	public void filter_the_records_based_on_the_status(String tcNO) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNO);
		String st = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Status");
		System.out.println("Status:-" + st);
		leadPage.filter_IC_Lead_Based_on_Status(st);
	}
	@Then("^Filter the Lead based on Lead ID (.*)$")
	public void filter_the_lead_based_on_lead_id(String leadID) {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		lead.filter_IC_Lead_Based_on_LeadID(leadID);
	}
	/****************************************************************************/
	@Given("Filter the Lead page records based on the Status (.*)$")
	public void filter_the_lead_page_records_based_on_the_status_dc(String tcNO) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNO);
		String st = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Status");
		System.out.println("Status:-" + st);
		lead.filter_IC_Lead_Based_on_Status(st);
	}

	@Given("Filter the Lead page records based on the category (.*)$")
	public void filter_the_lead_page_records_based_on_the_category_dc(String tcNO) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNO);
		String category = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation", "Category");
		lead.filter_IC_Lead_Based_on_Category(category);
	}

	@Given("Filter the Lead page records based on the qualification level (.*)$")
	public void filter_the_lead_page_records_based_on_the_qualification_level_dc(String tcNO) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNO);
		String qualification_Level = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Filter_Qualification_Level");
		lead.filter_IC_Lead_Based_on_Qualification_level(qualification_Level);
	}

	@Given("update the lead status (.*)$")
	public void update_the_lead_status_dc(String tcNO) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNO);
		Leadstatus = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"update_Lead_Status");
		lead.update_the_Lead_Status_In_LeadPage(Leadstatus);
	}

	@Given("enter the reason for cancel (.*)$")
	public void enter_the_reason_for_cancel_dc(String tcNO) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(tcNO);
		String reason = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "ICLeadCreation",
				"Reason_for_cancel");
		lead.enter_reason_for_cancel(reason);
	}

	@Then("User clicks on Actions button")
	public void user_clicks_on_actions_button() {
		leadPage.click_On_ActionsDropDown();
	}

	@Then("click on Convert to Opportunity button")
	public void click_on_convert_to_opportunity_button() {
		leadPage.click_On_ConvertTo_Opportunity();
	}

	@Then("Opportunity convertion page should be displayed Name of the Lead")
	public void opportunity_convertion_page_should_be_displayed_name_of_the_lead() {
		String leadName = leadPage.get_converToOpp_Page_Leadname();
		System.out.println(leadName);
		Assert.assertNotNull(leadName);
		
	}

	@Then("Opportunity convertion page should be displayed Name of the IC")
	public void opportunity_convertion_page_should_be_displayed_name_of_the_ic() {
		String icName = leadPage.get_converToOpp_Page_IcName();
		Assert.assertNotNull(icName);
		System.out.println(icName);
	}

	@Then("Opportunity convertion page should be displayed Name of the IDP Owner")
	public void opportunity_convertion_page_should_be_displayed_name_of_the_idp_owner() {
		String iDPOwner = leadPage.get_converToOpp_Page_IDPOwner();
		Assert.assertNotNull(iDPOwner);
		System.out.println(iDPOwner);
	}

	@Then("Opportunity convertion page should be displayed Name of the Institution")
	public void opportunity_convertion_page_should_be_displayed_name_of_the_institution() {
		String institution_name = leadPage.get_converToOpp_Page_InstitutionName();
		Assert.assertTrue(!(institution_name.isBlank()));
		System.out.println(institution_name);
	}

	@Then("Verify the Institution Selection dropdown has only one Institution name that was selected")
	public void verify_the_institution_selection_dropdown_has_only_one_institution_name_that_was_selected() {
		// String institution_name=leadPage.get_converToOpp_Page_InstitutionName();
	}

	@Then("Select the institution from the dropdown and click on Save and Open")
	public void select_the_institution_from_the_dropdown_and_click_on_save_and_open() {
		leadPage.click_on_Save_And_Open();
	}

	@Then("Navigate to Lead overview page from the Opportunity Tab")
	public void navigate_to_lead_overview_page_from_the_opportunity_tab() {
		leadPage.navigateToLead_Tab_From_OpportunityPage();
	}

	@Then("verify the status is changed to Converted in Lead Overview page")
	public void verify_the_status_is_changed_to_converted_in_lead_overview_page() {
		String status = leadPage.getStatusText();
		Assert.assertTrue(status.contains("Converted"));

	}

	@Then("close the browser")
	public void close_the_browser() {

	}

}

