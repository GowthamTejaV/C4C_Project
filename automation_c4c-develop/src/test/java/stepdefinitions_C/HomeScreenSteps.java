package stepdefinitions_C;


import java.util.List;

import org.testng.Assert;
import com.pages.HomeScreenPage;
import com.pages.IC_CreationPage;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeScreenSteps {
	HomeScreenPage homepage = new HomeScreenPage();
	ApplicationPageUtil appUtil = new ApplicationPageUtil();

	@Given("Verify whether the student is able to view the header in the home page")
	public void verify_whether_the_student_is_able_to_view_the_header_in_the_home_page() {
		homepage.isHeaderDisplaying();
	}

	@Given("Verify the header sections are clickable and redirects to the said pages")
	public void verify_the_header_sections_are_clickable_and_redirects_to_the_said_pages() {

	}

	@Then("Click on header sections HamburgerMenu")
	public void click_on_header_sections_hamburger_menu() {
		ApplicationPageUtil.clickOn_Hamburgermenu();

	}

	@Then("Verify the side menu section is opened successfully")
	public void verify_the_side_menu_section_is_opened_successfully() {
		homepage.isSideMenuHomeOptionDisplaying();
	}

	@Then("Click on header sections Search button")
	public void click_on_header_sections_search_button() {
		homepage.clickOnGlobalSearchButton();
	}

	@Then("Verify the search menu page is opened successfully")
	public void verify_the_search_menu_page_is_opened_successfully() {
		boolean flag = homepage.isAllCategorySearchFilterDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("Click on search menu close button")
	public void click_on_search_menu_close_button() {
		homepage.clickOnSearchmenuCloseButton();
	}

	@Then("Click on header sections productivity button")
	public void click_on_header_sections_productivity_button() {
		homepage.clickOnProductivity();
	}

	@Then("Verify the productivity menu is opened successfully")
	public void verify_the_productivity_menu_is_opened_successfully() {

	}

	@Then("Click on header sections Notification button")
	public void click_on_header_sections_notification_button() {
		homepage.clickOnnotification();
	}

	@Then("Verify the Notification menu is opened successfully")
	public void verify_the_notification_menu_is_opened_successfully() {

	}

	@Then("Click on header sections User menu button")
	public void click_on_header_sections_user_menu_button() {
		homepage.clickOnUserMenu();
	}

	@Then("Verify the User menu is opened successfully")
	public void verify_the_user_menu_is_opened_successfully() {

	}

	@Then("Click on LOGO link in the header section")
	public void click_on_logo_link_in_the_header_section() {
		homepage.clickOnIDPLogo();
	}

	@Then("Verify the user should redirects to home screen")
	public void verify_the_user_should_redirects_to_home_screen() {
		boolean flag = homepage.isHomePageTextIsDisplaying();
		System.out.println(flag + " Is Displaying");
		Assert.assertTrue(flag);
	}

	@Then("Verify all the items are present in the search menu page")
	public void verify_all_the_items_are_present_in_the_search_menu_page() {

	}

	@Then("Verify the Advanced Option is displaying on the search menu page")
	public void verify_the_advanced_option_is_displaying_on_the_search_menu_page() {
		boolean flag = homepage.isAdvancedOptionDisplayed();
		System.out.println(flag + " Is Displaying");
		Assert.assertTrue(flag);
	}

	@Then("Verify the All Items Option is displaying on the search menu page")
	public void verify_the_all_items_option_is_displaying_on_the_search_menu_page() {
		boolean flag = homepage.isAllitemsOptionDisplayed();
		System.out.println(flag + " Is Displaying");
		Assert.assertTrue(flag);
	}

	@Then("Verify the All My Items Option is displaying on the search menu page")
	public void verify_the_all_my_items_option_is_displaying_on_the_search_menu_page() {
		boolean flag = homepage.isMyItemsOptionDisplayed();
		System.out.println(flag + " Is Displaying");
		Assert.assertTrue(flag);
	}

	@Then("Verify the Search Input Field is displaying on the search menu page")
	public void verify_the_search_input_field_is_displaying_on_the_search_menu_page() {
		boolean flag = homepage.isSearchInputFieldDisplayed();
		System.out.println(flag + " Is Displaying");
		Assert.assertTrue(flag);
	}

	@Then("Verify the all Categorys Filter option is displaying on the search menu page")
	public void verify_the_all_categorys_filter_option_is_displaying_on_the_search_menu_page() {
		boolean flag = homepage.isAllCategorySearchFilterDisplayed();
		System.out.println(flag + " Is Displaying");
		Assert.assertTrue(flag);
	}

	@Then("Click on allCategorys Filter Option")
	public void click_on_all_categorys_filter_option() {
		homepage.clickAllCategorySearchFilter();
	}

	@Then("Verify all Categorys options are displaying on the search menu page")
	public void verify_all_categorys_options_are_displaying_on_the_search_menu_page() {
		List<String> lstStr = homepage.getAllCategorysOptions();
		System.out.println(lstStr);
	
	}
	@Given("Verify the Search Result Text message should be displayed")
	public void verify_the_message_should_be_displayed() {
		Assert.assertTrue(homepage.getsearchResultText().equals("Search Results"));
	}
	@Then("Click on My Items option is Search Menu page")
	public void click_on_my_items_option_is_search_menu_page() {
	    homepage.clickOnMyItemsOption();
	}
	@Then("Verify No match found message should be displayed")
	public void verify_no_match_found_message_should_be_displayed() {
	     String txt= homepage.getNoMatchErrorMsgText();
	     System.out.println(txt);
	      
	}
	@Then("Verify the clear button should be displayed")
	public void verify_the_clear_button_should_be_displayed() {
	 boolean flag= homepage.isclearOptionDisplaying();
	 System.out.println("Clear button is displaying"+flag);
	 Assert.assertTrue(flag);
	    
	}
	@Then("Click on clear button and verify the Search Result text should not be shown")
	public void click_on_clear_button_and_verify_the_search_result_text_should_not_be_shown() {
	    homepage.clickOnclearOption();
	    Assert.assertTrue(!homepage.IsDisplaysearchResultText());
	}
	
	@Then("Verify all the items in productivity page")
	public void verify_all_the_items_in_productivity_page() {
  
	}
	@Then("Verify all the items in Notification page")
	public void verify_all_the_items_in_notification_page() {
	
	}
	@Then("Verify all the items in User menu page")
	public void verify_all_the_items_in_user_menu_page() {
	   
	}
	@Then("Click on creat button")
	public void click_on_creat_button() {
	    homepage.clickOncreatButton();
	}
	@Then("Verify all the items in create prompt")
	public void verify_all_the_items_in_create_prompt() {
	    
	}
	@Then("Close the create prompt")
	public void close_the_create_prompt() {
	   homepage.closeTheCreateBtnPrompt();
	}
	@Then("Click on personalize button")
	public void click_on_personalize_button() {
		homepage.clickOneditButton();
	}
	@Then("Verify the page should be changed to Edit mode")
	public void verify_the_page_should_be_changed_to_edit_mode() {
	    
	}
	@Then("Click on cancel button in personalize Screen")
	public void click_on_cancel_button_in_personalize_screen() {
		IC_CreationPage.globalCancel();
	}
	@Then("User click on Deleted Group button")
	public void user_click_on_deleted_group_button() {
		homepage.clickDeletedGroupBtn();
	}
	@Then("Verify the added group should be deleted")
	public void verify_the_added_group_should_be_deleted() {
	   
	}


	@Then("Click on refresh button")
	public void click_on_refresh_button() {
		homepage.clickOnrefreshButton();
	}
	@Then("Verify the page should be loaded successfully")
	public void verify_the_page_should_be_loaded_successfully() {
	    
	}
/////////////////////
	@Then("Click on add group button")
	public void click_on_add_group_button() {
	 homepage.clickAddGroupButton();
	}
	@Then("Verify the Enter Group Name field is visible")
	public void verify_the_enter_group_name_field_is_visible() {
		boolean flag=homepage.isenterGroupNameDisplaying();
		System.out.println(flag+":- Is Displaying");
		Assert.assertTrue(flag);
	}
	@Then("Click on Add Card button")
	public void click_on_add_card_button() {
	    homepage.clickOnAddCardIcon();
	}
	@Then("Verify Cards prompt is diaplaying")
	public void verify_cards_prompt_is_diaplaying() {
		boolean flag=homepage.isCardsPromtDisplaying();
		System.out.println(flag+":- Is Displaying");
		Assert.assertTrue(flag);
	}
	@Then("Verify all the items are displaying in Cards prompt screen")
	public void verify_all_the_items_are_displaying_in_cards_prompt_screen() {
	    
	}
	@Then("click on the Reports tab in cards prompt")
	public void click_on_the_reports_tab_in_cards_prompt() {
		homepage.clickOncardsReportsTab();
	}
	@Then("Verify the user should navigate to the report section")
	public void verify_the_user_should_navigate_to_the_report_section() {
		boolean flag=homepage.isreportSecionTextDisplaying();
		System.out.println(flag+":- Is Displaying");
		Assert.assertTrue(flag);
	}
	@Then("Click on Tools tab in cards prompt")
	public void click_on_tools_tab_in_cards_prompt() {
	  homepage.clickOncardsToolsTab();
	}
	@Then("Verify the user should navigate to the Tools section")
	public void verify_the_user_should_navigate_to_the_tools_section() {
		boolean flag=homepage.istoolsSecionTextDisplaying();
		System.out.println(flag+":- Is Displaying");
		Assert.assertTrue(flag);
	}
	@Then("Click on Filters tab in cards prompt")
	public void click_on_filters_tab_in_cards_prompt() {
		homepage.clickOncardsFiltersTab();
	}
	@Then("Verify the user should navigate to the Filters section")
	public void verify_the_user_should_navigate_to_the_filters_section() {
		boolean flag=homepage.isfiltersSecionTextDisplaying();
		Assert.assertTrue(flag);
		System.out.println(flag+":- Is Displaying");
	}
	@Then("Click on Custom tab in cards prompt")
	public void click_on_custom_tab_in_cards_prompt() {
	    homepage.clickOncardsCustomTab();
	}
	@Then("Verify the user should navigate to the Custom section")
	public void verify_the_user_should_navigate_to_the_custom_section() {
		boolean flag=homepage.iscustomSecionTextDisplaying();
		Assert.assertTrue(flag);
	}

}
