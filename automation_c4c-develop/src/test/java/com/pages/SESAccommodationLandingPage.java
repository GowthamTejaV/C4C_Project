package com.pages;
import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
import com.qa.util.WaitsUtil;


public class SESAccommodationLandingPage {
    
    public static By accommodationPod = By.xpath("//h5//a[contains(@href,'student-essentials/accommodations/')]");
    public static By studentEssentialPod = By.xpath("//*[contains(@class,'ga4SesMegaMenuCTA')]");
    public static By accommodationLink = By.xpath("//*[contains(@class,'ga4SesAccommodation')]");
    public static By accomHeader = By.xpath("//*[contains(@class,'insti_hmdl')]");
    public static By accomDestCountry = By.xpath("//*[contains(@class,'dstn')]");
    public static By stayPeriod = By.id("isUnderEighteenDiv");
    public static By australiaCoun = By.xpath("//*[@id=\"sesDestinationCountry\"]/option[2]");
    public static By canadaCoun = By.xpath("//*[@id=\"sesDestinationCountry\"]/option[3]");
    public static By unitedKingCoun = By.xpath("//*[@id=\"sesDestinationCountry\"]/option[4]");
    public static By underEighteenYes = By.xpath(".//*[@id='yes']");
    public static By underEighteenNo = By.xpath("//*[@id='no']");
    public static By sesInstitutionName = By.id("sesInstitutionName");
   // public static By institutionOptions = By.xpath(".//*[@id='institutionOptions']//following-sibling::div//ul//li[1]");
    public static By institutionOptions = By.xpath("//ul[@class='cmps_nme']/li[2]");
  
    public static By campName = By.id("campName");
    public static By searchAccommBtn = By.id("submitAccomButton");
    public static By propertyListsCount = By.xpath("//*[@class='container__full content-top clearfix stud_ess_comp accom_srvs ']/p");
    public static By propertyLists = By.xpath("//*[@class='prty_list']");
    public static By proceedToBook = By.xpath("//*[@class='pr_to btn-grn-grad ses-emailformtrigger']");
    public static By emailSES = By.id("sesEmail");
    public static By nxtBtn = By.xpath("//*[@class='btn btn-default']");
    public static By termsAndCond = By.xpath(".//*[@id='sesTermsandConditionsAcceptance']//following-sibling::label");
    public static By contEmail = By.xpath(".//*[@id='sesContactMethodAcceptance']//following-sibling::label");
    public static By mktPref = By.xpath(".//*[@id='sesMarketingPreferenceAcceptance']//following-sibling::label");
    public static By noAccommServices = By.xpath("//*[contains(@class,'prty_list')]//div/h2");
    public static By termsAndConditionSES = By.xpath("//input[@id='sesTermsandConditionsAcceptance']");
    public static By methodAcceptanceSES = By.xpath("//input[@id='sesContactMethodAcceptance']");
    public static By preferenceAcceptanceSES = By.xpath("//input[@id='sesMarketingPreferenceAcceptance']");
    public static By popUpHeaderDis = By.xpath("//*[contains(@class,'modal-content shrt-lbox')]");
    public static By firstProperty = By.xpath("//*[contains(@class,'acm_lis_slide')]/ul/li[1]");
    public static By mapSESAccom = By.xpath("//*[contains(@class,'mp_view')]/a");
    public static By pptyAmnetiesCarousel = By.id("propertyAmnetiesCarousel");
    public static By firstProductLogo = By.xpath("//*[contains(@class,'acm_lis_slide')]/ul/li[1]//img[@alt=\"logo\"]");
    public static By propertyAmenitiesCarousel = By.xpath("//*[contains(@id,'propertyAmnetiesCarousel')]");
    public static By proceedToBookMapView = By.xpath("//button[contains(@class,'pr_to btn-grn-grad sitebtn map_cta')]");
    public static By firstPropertyMapView = By.xpath(" //*[@id=\"propertyList\"]/div[1]/div[1]/div[3]/h5");
    public static By universityTitle = By.xpath(" //*[@id=\"propertyList\"]/div[1]/div[1]/div[3]/h5");
    public static By accommToolTipMap = By.xpath("//*[contains(@class,'acm_tooltip')]/h2");
    public static By filterButton = By.xpath("//*[contains(@class,'fil_cntr')]");
    public static By accommodationTypeFil = By.xpath(".//*[@class='filtr_shmr filter-subjectFilterFacet']/ul[1]/li[1]");
    public static By accommodationUnivFil = By.xpath(".//input[@id='sesInstitutionNameFilter']");
    public static By accommRoomTypeFil = By.xpath("//*[contains(@class,'filtr_shmr filter-city')]//ul[1]//li//label[1]");
    public static By propUniverNames = By.xpath("//*[contains(@class,'prp_lg_cntr')]/div/h5");
    public static By studentAprtmt = By.xpath("//*[@id=\"collapse-subjectFilterFacet\"]/ul/li[1]");
    public static By applyFiltersBtn = By.id("submitAccomFilterButton");
    public static By headFilters = By.xpath("//*[@id=\"collapse-subjectFilterFacet\"]/ul[1]/li[1]");
    public static By roomTypesAccomm = By.xpath("//*[@id=\"otherFilters\"]/div[1]/h3");
    public static By roomTypeStudio = By.xpath("//*[@id=\"otherFilters\"]/div[1]/div/ul/li[1]/label");
    public static By livigArrangeType = By.xpath("//*[@id=\"otherFilters\"]/div[2]/h3");
    public static By livingArrangeTypeSingle = By.xpath("//*[@id=\"otherFilters\"]/div[2]/div/ul/li[1]/label");
    public static By institutionNameFil = By.id("sesInstitutionNameFilter");
    public static By institutionSearchClick = By.xpath(".//*[contains(@id,'institutionOptionsFilter')]/div");
    public static By collegeCampus = By.xpath("//*[@id=\"collapse-campus\"]//ul[1]/li[1]/input");
    public static By campusNameField = By.xpath("//*[contains(@id,'cmpsNameDiv')]/h3");
    public static By institutionAccommField = By.id("sesInstitutionCodeDiv");
    public static By proceedToBookOne = By.xpath("//*[contains(@class,'sitebtn grnbtn ses-emailformtrigger')]/span");
    public static By proceedTobookList = By.cssSelector("div.prc_book button");
    public static By phoneNoSES = By.id("sesPhoneNo");
    public static By nearestIDPOfficeCli = By.xpath("//*[@id='officeName']//parent::div[1]//parent::div[1]");
	public static By nearestIDPOffice = By.xpath("//*[@id='officeName']//following-sibling::div//following-sibling::div[@class='menu transition visible']/child::div");
    public static By firstNameSES = By.id("sesFirstName");
    public static By emailId = By.xpath(".//*[@id='sesEmail']");
    
    public static By lastNameSES = By.id("sesLastName");
    public static By proceedBtnSub = By.xpath("//*[@id=\"idpSesEnquiryForm\"]/button[1]");
    public static By proceedToBookMap = By.xpath("//*[@id=\"propertyPod-1\"]/div[3]/div[2]/div[2]/button");
    
    public static By studentApartmentBtn = By.xpath("//input[contains(@id,'stuApartmentRadio')]");
    public static By homeStayBtn = By.xpath("//input[contains(@id,'hmstbtn')]");
    
    public static By nearestIDPoffice = By.xpath("//*[@id='officeName']//following-sibling::div//following-sibling::div[@class='menu transition visible']/child::div");
    
    public static String[] propertyCount;
    		
    
    /**
     * This method is used to click student essential pod
     */
    public void clickStudentEssentialPod() {
        try {
        	Thread.sleep(500);
            ElementUtil.click(studentEssentialPod);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is used to enter into accommodation link
     */
    public void enterToAccommodationLink() {
        try {
        	Boolean bnkpodAvail = ElementUtil.isElementDisplayed(accommodationPod,20, "Accommodation Pod");
			if (bnkpodAvail == true) {
				System.out.println("Accommodation POD is displaying");
				Boolean bnkpodAvailCli = ElementUtil.isElementDisplayed(accommodationPod, 25, "Banking Pod");
				if (bnkpodAvailCli == true) {
					ElementUtil.printToReportPass("Banking Pod AVailable");
					ElementUtil.click(accommodationPod);
				}
			}else {
				ElementUtil.printToReportFAIL("Banking Pod Not enabled");
			}
			ElementUtil.waitForCertainTime(2000);
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is used to  check accommodation header
     */
    public void checkAccommHeader() {
        try {
            ElementUtil.isElementDisplayed(accomHeader, 20, "Accommodation Header");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is used to select country
     */
    public void selectCountry(String country, String stayPeriodB) {
        try {
            if(country.equalsIgnoreCase("Australia")) {
                ElementUtil.click(australiaCoun);
                Boolean isStayPeriodus = ElementUtil.isElementDisplayed(stayPeriod, 2, "Stay Period");
                 if(isStayPeriodus) {
                	 if(stayPeriodB.equalsIgnoreCase("yes")) {
                		 ElementUtil.click(underEighteenYes);
                	 }else {
                		 ElementUtil.click(underEighteenNo);
                	 }
                 }else {
                   ExtentCucumberAdapter.addTestStepLog("<b style=\"color:red;\">-----------FAIL----------- : Country not selected " + "</b>");	
              }
            }else if(country.equalsIgnoreCase("Canada")) {
                ElementUtil.click(canadaCoun);
                Boolean isStayPeriod = ElementUtil.isElementDisplayed(stayPeriod, 1, "Stay Period for Canada");
                if(isStayPeriod==false) {
                    System.out.println("Yes it is not available");
                   assertTrue(true);
                }else {
                    System.err.println("It is available");
                }
            }else if(country.equalsIgnoreCase("United Kingdom")) {
                ElementUtil.click(unitedKingCoun);
                Boolean isStayPeriodUK = ElementUtil.isElementDisplayed(stayPeriod, 1, "Stay Period for UK");
                if(isStayPeriodUK==false) {
                    System.out.println("Yes it is not available");
                   assertTrue(true);
                }else {
                    System.err.println("It is available");
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
   /**
    * This method is used to select Institution name
    * @param univName
    */
    public void selectInstitutionName(String univName) {
        try {
            ElementUtil.click(sesInstitutionName);
            ElementUtil.type(sesInstitutionName, univName);
            ElementUtil.implicitWait(800);
            try {
            	WaitsUtil.explicit_Wait(institutionOptions).click();
            }catch(StaleElementReferenceException ex) {
            	DriverFactory.getDriver().findElement(institutionOptions).click();
            }
            ElementUtil.implicitWait(1000);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is used to click search button
     */
    public void clickSearchButton() {
        try {
            ElementUtil.waitForCertainTime(500);
            ElementUtil.click(searchAccommBtn);
            ElementUtil.waitForCertainTime(1500);
            }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is used to verify the entire property lists
     */
    public void verifyProperties() {
    	try {
    		ElementUtil.scrolldown();
    		Boolean getNoAccommService = ElementUtil.isElementDisplayed(noAccommServices, 10, "No Accommodation Services");
        	String getPropertyCountAfterList = ElementUtil.getText(propertyListsCount);
        	System.out.println("getPropertyCountAfterList : " + getPropertyCountAfterList);
        	String[] splitPropertyCount = getPropertyCountAfterList.split(" ");
        	System.out.println("splitPropertyCount ::::" + splitPropertyCount);
        	String propertyNoString = splitPropertyCount[0];
        	int i=Integer.parseInt(propertyNoString); 
            System.out.println("i : " + i);
            if(i>0) {
            	ElementUtil.printToReportInfo("PROPERTIES ARE AVAILABLE");
            }else if(getNoAccommService==true) {
            	ElementUtil.printToReportInfo("NO ACCOMMODATION SERVICES FOUND FOR SELECTED FILTERS");
            }
            
			/*
			 * if() { assertTrue(true);
			 * ElementUtil.printToReportPass("PROPERTY LISTS AVAILABLE"); }else
			 * if(getNoAccommService==true){ ElementUtil.
			 * printToReportInfo("NO ACCOMMODATION SERVICES FOUND FOR SELECTED FILTERS");
			 * assertTrue(true);
			 */
           
        	
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    /**
     * This method is used to verify properties is listed after search
     */
    public void verifyPropertyInSearchPage() {
        try {
           Boolean getPropertyLists = ElementUtil.isElementDisplayed(propertyLists, 10, "Property Lists");
           if(getPropertyLists==true) {
        	   Boolean firstPropertyLists = ElementUtil.isElementDisplayed(firstProperty, 10, "First Property");
        	     if(firstPropertyLists==true) {
        	    	 Boolean firstLogo = ElementUtil.isElementDisplayed(firstProductLogo, 5, "First PRoduct Logo");
        	    	 if(firstLogo==true) {
        	    		 assertTrue(true);
        	    	 }else {
        	    		 System.err.println();
        	    	 }
        	    	 Boolean propertyAmenities = ElementUtil.isElementDisplayed(propertyAmenitiesCarousel, 2, "Property Amenities Carousel");
        	    	 if(propertyAmenities) {
        	    	 String getAmenities  = ElementUtil.getText(propertyAmenitiesCarousel);
        	    	 if(getAmenities.contains("Study")||getAmenities.contains("Cinema-room")||getAmenities.contains("Gym")
        	    			|| getAmenities.contains("Laundry")|| getAmenities.contains("furnished") || getAmenities.contains("Wifi")) {
        	    		 assertTrue(true);
        	    		 ElementUtil.printToReportMessage("Amenities ----- " + getAmenities);
        	    	 }else {
        	    		 ElementUtil.printToReportInfo("NO AMENITIES FOR THIS PROVIDER");
        	    	 }
        	    	 }
        	     }
           }else {
               System.err.println();
           }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is used to click into the provider product
     * @param provProduct
     */
    public void enterIntoProviderProduct(String provProduct) {
        try {
        	ElementUtil.waitForCertainTime(1500);
        	ElementUtil.scrolldown(); 
        	System.out.println("ProviderProduct : " + provProduct); 
        	String tabxpath = "//*[contains(@class,'items_cntrs')]//h6/a[contains(@href,'"+provProduct+"')]";
        	WebElement elment = DriverFactory.getDriver().findElement(By.xpath(tabxpath));
        	System.out.println("Provider Names : " + elment.getText());
        	String storeHeaderTit = elment.getText().toLowerCase();
        	ElementUtil.scrolldown();
        	if(storeHeaderTit.contains(provProduct.toLowerCase())) {
        		 ElementUtil.clickJS(elment); 
				  ElementUtil.waitForCertainTime(2000);
				  ElementUtil.jsClick(proceedToBookOne);
        	//	ElementUtil.jsClick(proceedTobookList);
				ElementUtil.printToReportPass("CLICKED PROVIDER PRODUCT");
				ElementUtil.waitForCertainTime(1500);
        	}
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
//    
//  
//
//
//	/**
//     * This method is used to fill the enquiry form in the SES accomm
//     * @param firstName
//     * @param lastName
//     * @param testDataId
//	 * @throws IOException 
//	 * @throws InterruptedException 
//     */
    public void fillEnquiryFormSESAccomm(String firstName, String lastName, String testDataId, String sheetName, String nearestIDPOff) throws IOException, InterruptedException {
    	try {
    		ElementUtil.ranEmailId(SESMoneyTransfer.emailId, "SESAccommodation", testDataId, 3);
			ElementUtil.click(SESMoneyTransfer.nextBtn);
    		DriverFactory.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    		ElementUtil.type(firstNameSES, firstName);
    		ElementUtil.type(lastNameSES, lastName);
    		ElementUtil.ranMobileNo(phoneNoSES,sheetName, testDataId, 6);
    		ConfigReader config = new ConfigReader();
//        	Properties prop = config.read_properties();
//            String country = prop.getProperty("country").toLowerCase();
//			if(country.equalsIgnoreCase("vietnam")) {
//				ElementUtil.ranMobileNoViet(phoneNoSES, sheetName, testDataId, 6);
//			}
			Boolean nearestIDP = ElementUtil.isElementDisplayed(CanadaImmigrationServices.nearestIDPOfficeCli, 8, "Nearest IDP Office");
			if(nearestIDP) {
				ElementUtil.click(CanadaImmigrationServices.nearestIDPOfficeCli);
				ElementUtil.customDropList(CanadaImmigrationServices.nearestIDPOffice, nearestIDPOff);
			}else {
				ElementUtil.printToReportMessage("Nearest IDP Office Field is not available here");
			}
			ElementUtil.click(contEmail);
    		ElementUtil.click(mktPref);
    		ElementUtil.click(termsAndCond);
    		ElementUtil.click(proceedBtnSub);
    		Thread.sleep(2000);
    	}catch(FileNotFoundException e) {
			Assert.fail();
			e.printStackTrace();
		}
    }
    

	/**
	 * This method is used to validate the user Enquiry in SES Banking
	 * @param testDataId
	 */
	public void validateAccommodationEnquiry() {
		try {
			String pageUrl = ElementUtil.getURL();
			String a[] = pageUrl.split("/");
			System.out.println(a[2]); 
			if (a[2].equalsIgnoreCase("www.scape.com.au")) {
				ElementUtil.printToReportPass("ACCOMMODATION USER ENQUIRY SUCCESS");
			} else if (a[2].equalsIgnoreCase("www.switchliving.com.au")) {
				ElementUtil.printToReportPass("ACCOMMODATION USER ENQUIRY SUCCESS");
			} else {
				ElementUtil.printToReportFAIL("ACCOMMODATION USER ENQUIRY UNSUCCESS");
				Assert.fail();
			}
			ElementUtil.waitForCertainTime(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
    
    
    /**
     * This method is used to fill email ID
     * @param emailSesAccomm
     */
    public void enterEmailIDAccomm(int TestDataId,String sheetName) {
        try {
        	ElementUtil.waitForElementInvisible(emailSES);
      //  	ElementUtil.ranEmailId(emailSES, sheetName, TestDataId, 3);
            ElementUtil.click(nxtBtn);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
   
    /**
     * This method is used to select terms and privacy policy
     */
    public void selectTermsAndPrivacyPolicy() {
        try {
            Boolean checkPopUpHeaderTerms = ElementUtil.isElementDisplayed(popUpHeaderDis, 10, "Popup Header");
            if(checkPopUpHeaderTerms==true) {
            	ElementUtil.click(contEmail);
            	ElementUtil.click(mktPref);
            	ElementUtil.click(termsAndCond);
                ElementUtil.click(nxtBtn);
            }else {
                System.err.println("Terms and Condition Popup not present");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is used to click map view
     * @param sesEmail
     */
   public void clickMapView() {
	   try {
		   Boolean checkMapView = ElementUtil.isElementDisplayed(mapSESAccom, 10, "Map SES Accommodation");
		   if(checkMapView) {
			   ElementUtil.click(mapSESAccom);
			   ElementUtil.waitForCertainTime(500);
			   ElementUtil.click(firstPropertyMapView);
			   String getUnivTitle = ElementUtil.getText(universityTitle);
			   String getAccommToolTip = ElementUtil.getText(firstPropertyMapView);
			   if(getUnivTitle.equalsIgnoreCase(getAccommToolTip)) {
				   assertTrue(true);
			   }else {
				   System.err.println("Map - University not displayed in tool  tip");
			   }
		   }
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
    
   /**
    * This method is used to click Filter Button after university search
    */
   public void clickFilterButton() {
	   try {
		   ElementUtil.click(filterButton);
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
    
  
   /**
    * This method is used to apply filters in accommodation type in filter search page
    */
   public void applyFiltersAccommType() {
	   try {
		   Boolean headAccommType = ElementUtil.isElementDisplayed(headFilters, 10, "Head Filters");
		   if(headAccommType) {
			   ElementUtil.click(studentAprtmt);
		   }
			/*
			 * ElementUtil.click(applyFiltersBtn);
			 * if(ElementUtil.isElementDisplayed(propertyLists, 0)) { assertTrue(true);
			 * }else { System.err.println(); }
			 */
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   /**
    * This method is used to check room type in filter search page
    */
   public void applyFilterRoomTypes() {
	   try {
		   Thread.sleep(500);
		   Boolean headRoomType = ElementUtil.isElementDisplayed(roomTypesAccomm, 10, "Room Types Accommodation");
		   if(headRoomType) {
			   System.out.println("Accommodation Type is available");
			   ElementUtil.click(roomTypeStudio);
		   }
			/*
			 * ElementUtil.click(applyFiltersBtn);
			 * if(ElementUtil.isElementDisplayed(propertyLists, 0)) { assertTrue(true);
			 * }else { System.err.println(); }
			 */
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   /**
    * This method is used to click Proceed to Book Button
    */
   public void clickProceedToBookBtn() {
	   try {
		   Thread.sleep(200);
		 ElementUtil.click(proceedToBookMap);
		 Thread.sleep(2000);
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   /**
    * This method is used to verify the living arrangement type in the filter page
    */
   public void livingArrangementType() {
	   try {
		   Boolean livingArrangementType = ElementUtil.isElementDisplayed(livigArrangeType, 10, "Living Arrangement Type");
		   if(livingArrangementType) {
			   ElementUtil.click(livingArrangeTypeSingle);
		   }
		   ElementUtil.click(applyFiltersBtn);
		   if(ElementUtil.isElementDisplayed(propertyLists, 0, "Property Lists")) {
			   assertTrue(true);
		   }else {
			   System.err.println();
		   }
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   /**
    * This method is used to verify the university filter search page
    * @param enterCountry
    */
   public void enterUniversityFilter(String enterCountry) {
	   try {
		   ElementUtil.click(institutionNameFil);
		   ElementUtil.type(institutionNameFil, enterCountry);
		   Thread.sleep(1000);
		   String getUnivName = ElementUtil.getText(institutionNameFil);
		   System.out.println("Get University Name : " + getUnivName);
		   ElementUtil.click(institutionSearchClick);
		   Boolean campusField = ElementUtil.isElementDisplayed(campusNameField, 10, "Campus Name Field");
		   if(campusField) {
			   ElementUtil.click(collegeCampus);
			   assertTrue(true);
		   }else {
			   System.err.println();
		   }
		   ElementUtil.click(applyFiltersBtn);
		   Thread.sleep(1000);
		   String getUnivAccommLanPage = ElementUtil.getText(institutionAccommField);
		   if(getUnivAccommLanPage.contains(enterCountry)) {
			   System.out.println("getUnivAccommLanPage ----------- " + getUnivAccommLanPage);
			   System.out.println("enterCountry ----------- " + enterCountry);
			   assertTrue(true);
		   }else {
			   assertFalse(false);
		   }
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   /**
    * This method is used to verify the student apartment property is filtered properly
    */
   public void verifyStudentApartmentBtn() {
	   try {
		   String getPropertyCountAfterList = ElementUtil.getText(propertyListsCount);
		   propertyCount = getPropertyCountAfterList.split(" ");
	       	System.out.println("splitPropertyCount ::::" + propertyCount[0]);
	   		Boolean boolstudentApartment = ElementUtil.isElementDisplayed(studentApartmentBtn, 20, "Student Apartment");
	   		if(boolstudentApartment) {
	   			ElementUtil.click(studentApartmentBtn);
	   			ElementUtil.waitForPageLoad(20);
	   			ElementUtil.scrolldown();
	   			String getPropCountAfterStuApart = ElementUtil.getText(propertyListsCount);
	           	String[] splitgetPropCountAfterStuApart = getPropCountAfterStuApart.split(" ");
	           	System.out.println("splitPropertyCount ::::" + splitgetPropCountAfterStuApart[0]);
	           	if(propertyCount[0]==splitgetPropCountAfterStuApart[0]) {
	           		ElementUtil.printToReportFAIL("STUDENT APARTMENT PROPERTIES ARE NOT CHANGED");
	           	}else{
	           		ElementUtil.printToReportPass("STUDENT APARTMENT PROPERTIES ARE CHANGED");
	           	}
	   		}
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   
   /**
    * This method is used to verify the home stay properties are filtered properly
    */
   public void verifyHomeStayBtn() {
   	try {
   		Boolean boolHomeStay = ElementUtil.isElementDisplayed(homeStayBtn, 20, "Home Stay");
   		if(boolHomeStay) {
   			ElementUtil.click(homeStayBtn);
   			ElementUtil.waitForPageLoad(20);
   			ElementUtil.scrolldown();
   			String getPropCountAfterHomeStay = ElementUtil.getText(propertyListsCount);
           	String[] splitgetPropCountAfterHomeStay = getPropCountAfterHomeStay.split(" ");
           	System.out.println("splitPropertyCount ::::" + splitgetPropCountAfterHomeStay[0]);
           	if(propertyCount[0]==splitgetPropCountAfterHomeStay[0]) {
           		ElementUtil.printToReportFAIL("HOME STAY PROPERTIES ARE NOT CHANGED");
           	}else{
           		ElementUtil.printToReportPass("HOME STAY PROPERTIES ARE CHANGED");
           	}
   		}
   	}catch(Exception e) {
   		e.printStackTrace();
   	}
   }
   

}
