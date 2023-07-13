package idpWebsiteSteps;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.pages.SESAccommodationLandingPage;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SESAccommodationLandingPageSteps {
	
    
    SESAccommodationLandingPage sESAccommodationLandingPage = new SESAccommodationLandingPage();
    
    public static void launchStudentEssentials() {
    	String urls;
    	  try {
    	    String envi =ConfigReader.getApplicationPropertie("environment").toLowerCase();
    	    String country =new  ConfigReader().init_prop().getProperty("country").toLowerCase();
    	    System.out.println("envi :::::::::::::::::" + envi);
    	    if (country.equalsIgnoreCase("vietnam")) {
    	      if (envi.equalsIgnoreCase("UAT")) {
    	        urls = "https://www-" + envi + ".idp.com/" + country + "/student-essentials/?geoip=14.0.16.1";
    	        DriverFactory.getDriver().get(urls);
    	      } else if (envi.equalsIgnoreCase("live")) {
    	        urls = "https://www.idp.com/" + country + "/student-essentials/?geoip=14.0.16.1";
    	        DriverFactory.getDriver().get(urls);
    	      }
    	    } else {
    	      if (envi.equalsIgnoreCase("UAT")) {
    	        urls = "https://www-" + envi + ".idp.com/" + country + "/student-essentials/";
    	        DriverFactory.getDriver().get(urls);
    	      } else if (envi.equalsIgnoreCase("live")) {
    	        urls = "https://www.idp.com/" + country + "/student-essentials/";
    	        DriverFactory.getDriver().get(urls);
    	      }
    	    }
    	  } catch (Exception e) {
    	    e.printStackTrace();
    	  }
    	}
    
    @Given("I navigate to Student Essentials page")
    public void navigate_to_student_essentials_page() {
        try {
        	launchStudentEssentials();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @When("I click on the Accommodation page")
    public void click_on_the_accommodation_page() {
        try {
            sESAccommodationLandingPage.enterToAccommodationLink();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Then("I verify the accommodation header in landing page")
    public void verify_the_accommodation_header_in_landing_page() {
        try {
            sESAccommodationLandingPage.checkAccommHeader();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @When("I select the country {string} from the destination and verify stay period as {string}")
    public void select_the_country_from_the_destination(String country, String stayPeriodBool) {
        try {
            System.out.println("Country name " + country);
            sESAccommodationLandingPage.selectCountry(country, stayPeriodBool);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Then("I select the country from the destination and verify stay period")
    public void select_the_country_destination_and_verify_stay_period(DataTable country) {
        try {
            List<Map<String, String>> searchList = country.asMaps();
            for (int i = 0; i < searchList.size(); i++) {
              String search = searchList.get(i).get("country");
            sESAccommodationLandingPage.selectCountry(search,null);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
   
    
    @And("I search for the university {string} in Accommodation")
    public void search_for_the_university_in_accommodation(String univName) {
        try {
            sESAccommodationLandingPage.selectInstitutionName(univName);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @And("I click search button in the Accommodation landing page")
    public void click_search_button_in_the_accommodation_landing_page() {
        try {
            sESAccommodationLandingPage.clickSearchButton();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    @When("I click provider product {string} from the properties")
    public void click_provider_product_from_the_properties(String provProduct) {
      try {
        sESAccommodationLandingPage.enterIntoProviderProduct(provProduct);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    @Then("I verify properties are displayed for the searched university")
    public void verify_properties() {
    	try {
    		sESAccommodationLandingPage.verifyProperties();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    @Then("I verify properties are displayed for the searched university in the search page")
    public void verify_properties_are_displayed_for_the_searched_university() {
        try {
            sESAccommodationLandingPage.verifyPropertyInSearchPage();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
//    @When("I click provider product {string} from the properties")
//    public void click_provider_product_from_the_properties(String provProduct) {
//        try {
//            sESAccommodationLandingPage.enterIntoProviderProduct(provProduct);
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    @And("I enter the email id to fill the enquiry form {string}")
    public void enter_the_email_id_to_fill_the_enquiry_form(String sheetName) {
        try {
            LinkedList<List<String>> iterationCount = ExcelUtil.iterationCount("TestData.xlsx", sheetName);
            for (List<String> data : iterationCount) {
              Map<String, String> map = new LinkedHashMap<String, String>();
              for (int n = 0; n < ExcelUtil.columnCount; n++) {
                map.put(ExcelUtil.header.get(n), data.get(n));
              }
              System.out.println("MAP VALUE:- " + map);
              String testDataId = map.get("TestDataId");
              String firstName = map.get("FirstName");
              String lastName = map.get("LastName");
              String nearestIDPOff = map.get("NearestIDPOff");
            sESAccommodationLandingPage.fillEnquiryFormSESAccomm(firstName, lastName,testDataId,sheetName,nearestIDPOff);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Then("I verify the SES Accommodation is successfully enquired")
    public void verify_the_ses_accommodation_is_successfully_enquired() {
    	try {
    		sESAccommodationLandingPage.validateAccommodationEnquiry();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @And("I agree the terms and privacy policy of SES")
    public void agree_the_terms_and_privacy_policy_of_SES() {
        try {
            sESAccommodationLandingPage.selectTermsAndPrivacyPolicy();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Then("I click Proceed to Book Accommodation SES")
    public void click_proceed_to_book_accommodation_ses() {
    	try {
    		sESAccommodationLandingPage.clickProceedToBookBtn();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Then("I click the Map View button and verify the tool tip")
    public void click_the_map_view_button_and_verify_the_tool_tip() {
    	try {
    		sESAccommodationLandingPage.clickMapView();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @And("I click the Filters button in the search page")
    public void click_the_filters_button_in_the_search_page() {
    	try {
    		sESAccommodationLandingPage.clickFilterButton();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}

    }
    
    @And("I select Accommodation Type in the Filters section")
    public void select_accommodation_type_in_the_filters_section() {
    	try {
    		sESAccommodationLandingPage.applyFiltersAccommType();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @And("I select Room Types in the Filters Section")
    public void select_room_types_in_the_filters_section() {
    	try {
    		sESAccommodationLandingPage.applyFilterRoomTypes();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @And("I select Living Arrangement Types in the Filters Section")
    public void select_living_arrangement_types_in_the_filters_section() {
    	try {
    		sESAccommodationLandingPage.livingArrangementType();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    
    @And("I fill the required fields in the enquiry form {string}")
    public void fill_the_required_fields_in_the_enquiry_form(String sheetName) {
        try {
//        	LinkedList<List<String>> iterationCount = ExcelUtil.iterationCount("TestData.xlsx", sheetName);
//            for (List<String> data : iterationCount) {
//              Map<String, String> map = new LinkedHashMap<String, String>();
//              for (int n = 0; n < ExcelUtil.columnCount; n++) {
//                map.put(ExcelUtil.header.get(n), data.get(n));
//              }
//              System.out.println("MAP VALUE:- " + map);
        	String random=ElementUtil.generateRandomString(3);
              String firstNameSESAcc = "FirstNameSES"+random;
              String lastNameSESAcc = "LastNameSES";
              String testDataId = "TestDataId";
              String nearestIDPOff = "Chennai";
              ConfigReader.writeToApplicationPropertie("firstNameSESAcc", firstNameSESAcc);
              ConfigReader.writeToApplicationPropertie("lastNameSESAcc", lastNameSESAcc);
           
        	sESAccommodationLandingPage.fillEnquiryFormSESAccomm(firstNameSESAcc,lastNameSESAcc,testDataId, sheetName,nearestIDPOff);
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @And("I select alternate university in the search page and verify in landing page")
    public void select_alternate_university_in_the_search_page() {
    	try {
    		LinkedList<List<String>> iterationCount = ExcelUtil.iterationCount("TestData.xlsx", "SESAccommodation");
            for (List<String> data : iterationCount) {
              Map<String, String> map = new LinkedHashMap<String, String>();
              for (int n = 0; n < ExcelUtil.columnCount; n++) {
                map.put(ExcelUtil.header.get(n), data.get(n));
              }
              System.out.println("MAP VALUE:- " + map);
              String enterUniversity = map.get("NewUniversity");
    		sESAccommodationLandingPage.enterUniversityFilter(enterUniversity);
            }
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Then("I verify the student apartment properties are filtered properly")
    public void verify_the_home_stay_properties_are_filtered_properly() {
    	try {
    		sESAccommodationLandingPage.verifyStudentApartmentBtn();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Then("I verify the home stay properties are filtered properly")
    public void verify_the_home_stay_property_filtered_properly() {
    	try {
    		sESAccommodationLandingPage.verifyHomeStayBtn();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Given("I Launch the IDP.com url")
    public void launch_the_url() {
    	String urls;
      try {
          urls = "https://www-uat.idp.com/india/";
          DriverFactory.getDriver().get(urls);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    
}
