package stepdefinitions_C;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;

import com.pages.C4CUserValidation;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ExcelUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class C4CUserEnquiryValidation {
	
	C4CUserValidation c4CUserValidation = new C4CUserValidation(); 
	
    @When("I search the email in the search field {string}")
    public void search_the_email_in_the_search_field(String sheetName) throws EncryptedDocumentException, IOException, InterruptedException {
        try {
         
              String email = ConfigReader.getApplicationPropertie("SESAccommodationEmail");
              
              c4CUserValidation.searchUserC4C("112", email);
            
        }
        	catch (UnhandledAlertException f) {
			    try {
			        Alert alert = DriverFactory.getDriver().switchTo().alert();
			        String alertText = alert.getText();
			        System.out.println("Alert data: " + alertText);
			        alert.accept();
			    } catch (NoAlertPresentException e) {
			        e.printStackTrace();
			    }
		}
        }
    
	
    @Then("I verify the first and last name of the student in C4C for {string}")
    public void verify_the_first_and_last_name_of_the_student_in_C4C(String sheetName) {
        try {
           
        	 String ftName = ConfigReader.getApplicationPropertie("firstNameSESAcc");
             String ltName = ConfigReader.getApplicationPropertie("lastNameSESAcc");
             c4CUserValidation.checkFirstNameAndLastNameInC4C(ftName,ltName);
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Then("I verify the Site ID {string} in overview page")
    public void verify_the_site_ID(String siteID) {
        try {
        	c4CUserValidation.checkSiteInC4CCanda(siteID);
        	System.out.println("siteID : " + siteID);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Then("I verify the Site ID in overview page")
    public void verify_the_site_ID() {
        try {
        	c4CUserValidation.checkSiteInC4C();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Then("I verify the marketing acceptance field {string} in overview page")
    public void verify_the_marketing_acceptance(String regMarketingAccept) {
        try {
        	c4CUserValidation.checkMarketingAcceptanceInC4C(regMarketingAccept);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Then("I validate the Registered Online field {string} in overview page")
    public void verify_the_registered_online(String regFlag) {
        try {
        	c4CUserValidation.checkRegisteredOnlineInC4C(regFlag);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Then("I verify the contact me by field {string} in overview page")
    public void validate_the_contact_me_by(String contactBy) {
        try {
        	c4CUserValidation.checkContactMeInC4C(contactBy);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Then("I validate the Preference Mod Counselling in overview page {string}")
    public void validate_the_preference_mod_counselling(String sheetName) {
        try {
            LinkedList<List<String>> iterationCount = ExcelUtil.iterationCount("TestData.xlsx", sheetName);
            for (List<String> data : iterationCount) {
              Map<String, String> map = new LinkedHashMap<String, String>();
              for (int n = 0; n < ExcelUtil.columnCount; n++) {
                map.put(ExcelUtil.header.get(n), data.get(n));
              }
              String testDataId = map.get("TestDataId");
              String prefModCoun = map.get("PrefModCoun");
              c4CUserValidation.checkPrefCounsellingModeInC4C(testDataId,  prefModCoun);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @And("I click leads Menu in the C4C")
    public void click_leads_menu_in_the_C4C() {
    	 try {
         	c4CUserValidation.checkLeadMenuInC4C();
         	c4CUserValidation.clickLeadsTab();
         }catch(Exception e) {
             e.printStackTrace();
         }
    }

    
    @Then("I verify the Leads Overview Values in C4C like FirstName, LastName and fetch lead ID and verify the {string}, {string}, {string} for {string}")
    public void verify_the_leads_overview_values_in_c4c(String expLeadCategory, String expLeadSource, String expLeadStatus, String sheetName) {
    	try {
    		
              String testDataId = "12";
              String regFirstName = ConfigReader.getApplicationPropertie("firstNameSESAcc");
              String regLastName = ConfigReader.getApplicationPropertie("lastNameSESAcc");
    		c4CUserValidation.verifyLeadsMenuValuesC4C(testDataId,regFirstName,regLastName,expLeadCategory,expLeadSource, expLeadStatus);
            
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
//    
//   
    
    @Then("I verify the leads qualification Level values {string} {string}")
    public void verify_the_leads_qualification_level_values(String sheetName,  String type ) {
    	try {
    		LinkedList<List<String>> iterationCount = ExcelUtil.iterationCount("TestData.xlsx", sheetName);
            for (List<String> data : iterationCount) {
              Map<String, String> map = new LinkedHashMap<String, String>();
              for (int n = 0; n < ExcelUtil.columnCount; n++) {
                map.put(ExcelUtil.header.get(n), data.get(n));
              }
              String testDataId = map.get("TestDataId");
              String pfStudyAbCnty = map.get("ProviderCountry");
              String whenToStudy = map.get("WhenToStudy");
              String qualificationLevel = map.get("LeadQualLevel");
              c4CUserValidation.verifyQualificationLeadsValuesC4C(testDataId, pfStudyAbCnty,  whenToStudy,qualificationLevel,type);
            }
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Then("I verify the leads Online Level Values {string}")
    public void verify_the_leads_online_level_values(String sheetName) {
    	try {
    		LinkedList<List<String>> iterationCount = ExcelUtil.iterationCount("TestData.xlsx", sheetName);
            for (List<String> data : iterationCount) {
              Map<String, String> map = new LinkedHashMap<String, String>();
              for (int n = 0; n < ExcelUtil.columnCount; n++) {
                map.put(ExcelUtil.header.get(n), data.get(n));
              }
              String onlineYouHear = map.get("HowDidYouHear");
              String onlineFirstLead = map.get("FirstLead");
              String prefModCoun = map.get("PrefModCoun");
              String onlineSiteID = map.get("OnlineSiteID");
              c4CUserValidation.verifyOnlineLeadsValuesInC4C(onlineYouHear, onlineFirstLead, prefModCoun,onlineSiteID);
            }
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    
    @When("I enter into Offer in Principle field in C4C")
    public void enter_into_offer_in_principle_field_in_C4C() {
    	try {
    		c4CUserValidation.clickOfferInPrinciple();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Then("I verify the study mode {string} and Study status {string} final grade achieved in C4C {string}")
    public void verify_the_study_mode(String studyMode, String studyStatus, String finalGrade) {
    	try {
    		c4CUserValidation.checkStudyModeOIP(studyMode);
    		c4CUserValidation.checkStudyStatusOIP(studyStatus);
    		c4CUserValidation.checkFinalGradeAchievedOIP(finalGrade);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Then("I verify the Duration in C4C with OIP {string}")
    public void verify_the_duration_in_C4C_with_oip(String expectedVal) {
    	try {
    		c4CUserValidation.checkDurationOIP(expectedVal);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
  

	@Then("I verify then Study Country {string} and Study Language {string} and Institution Name {string}")
	public void verify_then_study_country_and_study_language_and_institution_name(String country, String studyLang, String institName) {
		try {
			c4CUserValidation.checkStudyCountry(country);
			c4CUserValidation.checkStudyLanguage(studyLang);
			c4CUserValidation.checkInstitutionName(institName);
		}catch(Exception e) {
			e.printStackTrace();;
		}
	}
	
	@Then("I verify the honours degree {string} and qualification title {string} and Credit Transfer {string}")
	public void verify_the_honours_degree_and_qualification_title_and_credit_transfer(String honoursDegree, String qualTitle, String creditTrans) {
		try {
			c4CUserValidation.checkHonoursDegree(honoursDegree);
			c4CUserValidation.checkQualificationTitle(qualTitle);
			c4CUserValidation.checkCreditTransfer(creditTrans);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("I verify the fail Units in C4C {string}, English Test Type {string}")
	public void verify_the_fail_units_in_C4C(String failunits, String englishTestType) {
		try {
			c4CUserValidation.checkFailUnits(failunits);
			c4CUserValidation.checkEnglishTestType(englishTestType);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("I verify the admission test type {string}")
	public void verify_the_admission_test_type(String expected) {
		try {
			c4CUserValidation.checkAdmissionTestType(expected);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("I verify the Student Essentials Values {string}")
	public void verify_the_student_essentials_values(String sheetName) {
		try {
			 LinkedList<List<String>> iterationCount = ExcelUtil.iterationCount("TestData.xlsx", sheetName);
	            for (List<String> data : iterationCount) {
	              Map<String, String> map = new LinkedHashMap<String, String>();
	              for (int n = 0; n < ExcelUtil.columnCount; n++) {
	                map.put(ExcelUtil.header.get(n), data.get(n));
	              }
	              String providerProduct = map.get("ProviderProduct");
			c4CUserValidation.clickStudentEssentialsMenu();
			c4CUserValidation.checkStudentEssentials(providerProduct);
	            }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

    
    

 }
