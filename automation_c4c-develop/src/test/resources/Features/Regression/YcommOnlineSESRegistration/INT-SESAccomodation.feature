@Reg
Feature: E2E-Ycomm Online SES

  @Accommodationss123 @FY23_SP7  @regression
  Scenario: Ensure New Students submits as SES Enquiry for the product (Accomodation) and ensure that the new student and Lead created in C4C with proper category, product and office assignment
    Given User Launch the IDP.com url
    And User switch to English Language
    And User clicks on Student Essential tab
    #Given I navigate to Student Essentials page
    When I click on the Accommodation page
    Then I verify the accommodation header in landing page
    When I select the country "Australia" from the destination and verify stay period as "yes"
    And I search for the university 'The University of New South Wales' in Accommodation
    And I click search button in the Accommodation landing page
  #  Then I verify properties are displayed for the searched university
    When I click provider product 'scape' from the properties
    And I fill the required fields in the enquiry form "SESAccommodation"
    Then I verify the SES Accommodation is successfully enquired
    Given User login to the application as "Counsellor" in "UAT"
    When I search the email in the search field "SESAccommodation"
    Then I verify the first and last name of the student in C4C for "SESAccommodation"
    #Then I verify the Site ID in overview page
    Then I verify the marketing acceptance field "Yes" in overview page
    Then I validate the Registered Online field "no" in overview page
    Then I verify the contact me by field "Phone,Email" in overview page
    And I click leads Menu in the C4C
    Then I verify the Leads Overview Values in C4C like FirstName, LastName and fetch lead ID and verify the "Student Essentials", "Online Enquiry", "Qualified" for "SESAccommodation"
    #Then I verify the leads qualification Level values "SESAccommodation" "SES"
    #Then I verify the leads Online Level Values "SESAccommodation"
    #Then I verify the Student Essentials Values "SESAccommodation"
   
    
     @Accommodations @FY23_SP7 @SPSEAL-3228 
  Scenario: Verify that user can verify the Accommodation with the Switch Provider
    Given I navigate to Student Essentials page
    When I click on the Accommodation page
    Then I verify the accommodation header in landing page
    When I select the country 'Australia' from the destination and verify stay period as "no"
    And I search for the university 'Victoria University' in Accommodation
    And I click search button in the Accommodation landing page
    When I click provider product 'switch' from the properties
    And I enter the email id to fill the enquiry form "SESAccommodation"
    And I fill the required fields in the enquiry form "SESAccommodation"
    Then I verify the SES Accommodation is successfully enquired
    Given User login to the application as "Counsellor" in "UAT"
    When I search the email in the search field "SESAccommodation"
    Then I verify the first and last name of the student in C4C for "SESAccommodation"
    Then I verify the Site ID "india" in overview page
    Then I verify the marketing acceptance field "Yes" in overview page
    Then I validate the Registered Online field "no" in overview page
    Then I verify the contact me by field "Phone,Email" in overview page
    Then I validate the Preference Mod Counselling in overview page "SESAccommodation"
    And I click leads Menu in the C4C
    Then I verify the Leads Overview Values in C4C like FirstName, LastName and fetch lead ID and verify the "Student Essentials", "Online Enquiry", "Qualified" for "SESAccommodation"
    Then I verify the leads qualification Level values "SESAccommodation" "SES"
    Then I verify the leads Online Level Values "SESAccommodation"
    Then I verify the Student Essentials Values "SESAccommodation"
  
	    
	    @SPSEAL-2936 @Regression @FY23_SP7
	    Scenario: Verify that user can verify the Accommodation with the Switch Provider
    Given I navigate to Student Essentials page
    When I click on the Accommodation page
    Then I verify the accommodation header in landing page
    When I select the country 'Australia' from the destination and verify stay period as "no"
    And I search for the university 'Victoria University' in Accommodation
    And I click search button in the Accommodation landing page
    Then I verify the student apartment properties are filtered properly
    Then I verify the home stay properties are filtered properly
   
    
   @SearchPageSES @SPSEAL-348 @Regression @FY23_SP7
   Scenario: Verify that user can verify the other countries other than australia does not have stay period
     Given I navigate to Student Essentials page
     When I click on the Accommodation page
     Then I verify the accommodation header in landing page
     Then I select the country from the destination and verify stay period
        |country|
        |Canada|
        |United Kingdom|
        
   @SearchPageSES @SPSEAL-349 @Regression @FY23_SP7
   Scenario: Verify that user can verify the Properties are displayed 
    Given I navigate to Student Essentials page
    When I click on the Accommodation page
    Then I verify the accommodation header in landing page
    When I select the country "Australia" from the destination and verify stay period as "yes"
    And I search for the university 'The University of New England' in Accommodation
    And I click search button in the Accommodation landing page
    Then I verify properties are displayed for the searched university in the search page
    
    @SearchPageSESMap @SPSEAL-348 @Regression @FY23_SP7
   Scenario: Verify that user can verify the map view button and fill the enquiry
    Given I navigate to Student Essentials page
    When I click on the Accommodation page
    Then I verify the accommodation header in landing page
    When I select the country "Australia" from the destination and verify stay period as "yes"
    And I search for the university 'The University of New England' in Accommodation
    And I click search button in the Accommodation landing page
    Then I click the Map View button and verify the tool tip  
    Then I click Proceed to Book Accommodation SES 
    And I enter the email id to fill the enquiry form "SESAccommodation"
    Then I verify the SES Accommodation is successfully enquired
    
    @SearchPageSESFilter @SPSEAL-350 @Regression @FY23_SP7
   Scenario: Verify that user can verify the Amenities in the Accommodation landing page
    Given I navigate to Student Essentials page
    When I click on the Accommodation page
    Then I verify the accommodation header in landing page
    When I select the country "Australia" from the destination and verify stay period as "yes"
    And I search for the university 'The University of New England' in Accommodation
    And I click search button in the Accommodation landing page
    And I click the Filters button in the search page
    And I select Accommodation Type in the Filters section
    And I select Room Types in the Filters Section
    And I select Living Arrangement Types in the Filters Section
    And I click the Filters button in the search page
    And I select alternate university in the search page and verify in landing page
    
    

    
    
    
    
    
    
    
    
    
    
    
        
   
    
        
   
    
    
    
    
 
    
    
