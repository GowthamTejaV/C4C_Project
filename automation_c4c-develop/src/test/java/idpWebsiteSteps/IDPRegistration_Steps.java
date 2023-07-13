package idpWebsiteSteps;

import org.testng.Assert;

import com.idpWebsite.IDP_RegistrationPage;
import com.idpWebsite.IDP_WebSite_SES;
import com.pages.IC_CreationPage;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class IDPRegistration_Steps {
	static String path = System.getProperty("user.dir");
	private static String PropertyFileName = path + "/src/test/resources/Config/config.properties";

	IDP_RegistrationPage idpReg = new IDP_RegistrationPage();
	IC_CreationPage ic = new IC_CreationPage();
	IDP_WebSite_SES idp_ses = new IDP_WebSite_SES();
	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	@Given("User login to the idp website")
	public void user_login_to_the_idp_website() {
		// idpReg.switch_To_English_Language();
		String email = ConfigReader.getApplicationPropertie("IDP_STUDENT");
		System.out.println(email);

		String d_ppsw = "VGVzdEAxMjM=";
		String psw = ApplicationPageUtil.decryption(d_ppsw);
		idpReg.login_to_IDP_Website(email, psw);
	}

	@Then("verify the Lead should be created from IDP Website {string}")
	public void verify_the_lead_should_be_created_from_idp_website(String string) {
		// new
		// ApplicationPageUtil(DriverFactory.getDriver()).click_Yes_Button_to_Unlock_Object_If_Visible();
		String str = idpReg.get_Lead_Count();
		Assert.assertTrue(str.equals("1"), "Lead is not added");
		String category = idp_ses.getLeadCategoryText();
		System.out.println(category);
		Assert.assertTrue(category.contains(string), "Lead is not careated with " + string);
		//idp_ses.closeTheEditPage();
	}

	@Then("verify the Lead should be created from IDP Website for existing Student")
	public void verify_the_lead_should_be_created_from_idp_website_for_the_Existing_student() {
		// new
		// ApplicationPageUtil(DriverFactory.getDriver()).click_Yes_Button_to_Unlock_Object_If_Visible();
		String str = idpReg.get_Lead_Count();
		Assert.assertTrue(str.equals("2"), "Lead is not added");
	}

	@Given("User Launch the IDP.com url")
	public void User_launch_the_url() {
		try {
			String envi = ConfigReader.getProp("environment", PropertyFileName).toLowerCase();
			if (envi.equalsIgnoreCase("UAT")) {
				String country = ConfigReader.getProp("country", PropertyFileName).toLowerCase();
				String urls = "https://www-" + envi + ".idp.com/" + country + "/?lang=en";
				DriverFactory.getDriver().get(urls);
			} else if (envi.equalsIgnoreCase("live")) {
				String country = ConfigReader.getProp("country", PropertyFileName).toLowerCase();
				String urls = "https://www.idp.com/" + country + "/";
				DriverFactory.getDriver().get(urls);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//

	@Given("User navigate to the IDP Website Login screen")
	public void User_navigate_to_the_IDP_Website_Login_screen() {
		try {
			DriverFactory.getDriver().navigate().to("https://www-uat.idp.com/middleeast/user-signin/?lang=en");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Given("User switch to English Language")
	public void user_switch_to_english_language() {
		// idpReg.switch_To_English_Language();
	}

	@Then("User should Register to the Application")
	public void User_should_Register_to_application() {
		// idpReg.switch_To_English_Language();
		idpReg.registerFor_Student();

	}
	@Then("enter all mandatory fields and submit")
	public void enter_all_mandatory_fields() {
		idpReg.submit_For_studentEnquiry();
	}

	@Then("^User submit for the student Enquiry (.*) and (.*)$")
	public void User_submit_for_the_student_Enquiry(String studylevel, String course) {
		idpReg.searchFor_The_findCourses(studylevel, course);
		idpReg.submit_For_studentEnquiry();
		System.out.println(idpReg.get_Your_journey_Begun_Txt());
	}
	
	@Then("^User submit student Enquiry after Register (.*) and (.*)$")
	public void User_submit_student_Enquiry_after_Register(String studylevel, String course) {
		idpReg.searchFor_The_findCourses(studylevel, course);
		idpReg.registr_submit_For_studentEnquiry();
		System.out.println(idpReg.get_Your_journey_Begun_Txt());
	}
	

	@Given("^Submit student Enquiry for anonymous user (.*) and (.*)$")
	public void submit_student_enquiry_for_anonymous_user(String studylevel, String course) {
		idpReg.searchFor_The_findCourses(studylevel, course);
		idpReg.submit_studentEnquiry_For_AnonymousUser();

	}

	@Given("Search for IDP registered student from Global Search")
	public void search_for_idp_registered_student_from_global_search() {
		ic.navigateTo_IC_page_As_Counsellor();
		System.out.println("Navigate to Individual Customers Page ");
		String email = ConfigReader.getApplicationPropertie("IDP_STUDENT");
		ic.search_for_IC(email);

		// appUtil.global_Search(email);
	}

	@Given("Select the student record on global search result")
	public void select_the_student_record_on_global_search_result() {
		ic.select_search_IC_Record();
	}

	@Given("Verify the new IC is created")
	public void verify_the_new_ic_is_created() {
		ic.click_On_Edit_IC_Record();
		ic.show_communicationDetails_toggle_Button();
		String expectedEmail = ic.get_primaryEmailID();
		String actualEmail = ConfigReader.getApplicationPropertie("IDP_STUDENT");
		Assert.assertTrue(actualEmail.equals(expectedEmail), "Lead is not added");

	}


	// IDP.CoM SES Regression Test Cases

	@Given("User should be able to access the SES Enquiry form in Ycomm")
	public void user_should_be_able_to_access_the_ses_enquiry_form_in_ycomm() {
		boolean flag = idp_ses.isstudentEssentialTabAvailable();
		Assert.assertTrue(flag);
	}

	@Then("User should able to select a Accomadation product")
	public void user_should_able_to_select_a_accomadation_product() {
		idp_ses.selectAccomadationproduct();
	}

	@Then("User should navigate to the search for the accomodation page")
	public void user_should_navigate_to_the_search_for_the_accomodation_page() {
		String pageTitle = ElementUtil.getPageTitle();
		Assert.assertEquals(pageTitle, "Accommodation Landing Page | IDP India");
	}

	@Then("User should Select the destination country")
	public void user_should_select_the_destination_country() {
		idp_ses.selectTheDestination("Australia");
	}

	@Then("User should enter an institution name")
	public void user_should_enter_an_institution_name() throws InterruptedException {
		idp_ses.enteryUniversityAndSelectAnyOneOfTheCampus("The university of New england");
	}

	@Then("The list of universities available should be displayed as institution name")
	public void the_list_of_universities_available_should_be_displayed_as_institution_name() {
		boolean flag = idp_ses.listOfCampus();
		Assert.assertTrue(flag);
	}

	@Then("User should Select the campus name")
	public void user_should_select_the_campus_name() throws InterruptedException {
		idp_ses.select_the_campus_name("Armidale");
	}

	@Then("Verify list of campus should be displayed based on the selected university")
	public void verify_list_of_campus_should_be_displayed_based_on_the_selected_university() {
		String actualResult = idp_ses.getEnterdInstitutionNameText();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, "The University of New England (Armidale)");
	}

	@Then("select will you be under eighteen during your stay radio button")
	public void select_will_you_be_under_during_your_stay_radio_button() {
		idp_ses.selectUnunder_eighteen_RaiodButton();
	}

	@Then("Click on accommodation Search Button")
	public void click_on_accommodation_search_button() {
		idp_ses.clickOnSESSearchButton();
	}

	@Then("User should navigate to the page where list of options available for the accomdation")
	public void user_should_navigate_to_the_page_where_list_of_options_available_for_the_accomdation() {
		int count = idp_ses.getaccomationCount();
		Assert.assertTrue(count > 0);
	}

	@Then("User should select any one of the course")
	public void user_should_select_any_one_of_the_course() {
		idp_ses.clickONaccomationOption();
	}

	@Then("enter the SES Email address")
	public void enter_the_ses_email_address() {
		idp_ses.enterTheSESEmailID("gowthamteja987@gmail.com");
	}

	@Then("Click on SES Next Button")
	public void click_on_ses_next_button() {
		idp_ses.clickSESNextBtn();
	}

	@Then("Select the Nearest IDP Office")
	public void select_the_nearest_idp_office() {
		idp_ses.enternearestIDPOfficeDropDown("Chennai - Nungambakkam");
	}

	@Then("registers student details through Home page registration section by entering all mandatory fields")
	public void registers_student_details_through_home_page_registration_section_by_entering_all_mandatory_fields() {
		idpReg.submit_studentEnquiry_For_AnonymousUser();
	}
	@Given("Search for the courses using the course section on top of the page")
	public void search_for_the_courses_using_the_course_section_on_top_of_the_page() {
		idpReg.searchtheCourseThroughCourseSection();
	}
	
	@Given("Search for the university using the find a university on top of the page")
	public void search_for_the_university_using_the_find_a_university_on_top_of_the_page() {
		idpReg.searchUniversity();
	}


}
