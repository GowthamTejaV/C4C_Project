Feature: E2E-Online Registration-ycom

  @IDPREG12  @regression
  Scenario: Registration- Creation of a new Individual Customer and lead  via Home page registration section
    Given User Launch the IDP.com url
    Then registers student details through Home page registration section by entering all mandatory fields
		And User login to the application as "Counsellor" in "UAT"
    And Search for IDP registered student from Global Search
    And Select the student record on global search result
    And Verify the new IC is created
    And Navigate to lead tab
    Then verify the Lead should be created from IDP Website "Course Enquiry"
    
    
   @IDPREG12 @regression
   Scenario: Online Registration- Creation of a new Individual Customer and lead  via search for courses section 
    Given User Launch the IDP.com url
    And  Search for the courses using the course section on top of the page
    Then registers student details through Home page registration section by entering all mandatory fields
    And User login to the application as "Counsellor" in "UAT"
    And Search for IDP registered student from Global Search
    And Select the student record on global search result
    And Verify the new IC is created
    And Navigate to lead tab
    Then verify the Lead should be created from IDP Website "Course Enquiry"
    
   @IDPREG122 @regression
   Scenario: Walk In -Creation of a new Individual Customer and lead  via find a university section
    Given User Launch the IDP.com url
    And Search for the university using the find a university on top of the page
    Then registers student details through Home page registration section by entering all mandatory fields
    And User login to the application as "Counsellor" in "UAT"
    And Search for IDP registered student from Global Search
    And Select the student record on global search result
    And Verify the new IC is created
    And Navigate to lead tab
    Then verify the Lead should be created from IDP Website "Course Enquiry"
    
   @IDPREG12 @regression
  Scenario: New student sign in to website by creating a new account and Register as the existing student
    Given User Launch the IDP.com url
    Then User should Register to the Application
    Then enter all mandatory fields and submit
    And User login to the application as "Counsellor" in "UAT"
    And Search for IDP registered student from Global Search
    And Select the student record on global search result
    And Verify the new IC is created
    And Navigate to lead tab
    Then verify the Lead should be created from IDP Website "Course Enquiry"
     Given User navigate to the IDP Website Login screen
    Given User login to the idp website
    Then enter all mandatory fields and submit
    And User login to the application as "Counsellor" in "UAT"
    And Search for IDP registered student from Global Search
    And Select the student record on global search result
    And Verify the new IC is created
    And Navigate to lead tab
    Then verify the Lead should be created from IDP Website "Course Enquiry"
    

    
    
