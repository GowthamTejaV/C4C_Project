Feature: SES Course enquiry

  @ses_idpWebsite @critical @IDPREG
  Scenario: Title of your scenario
    Given User Launch the IDP.com url
    And User switch to English Language
    And User clicks on Student Essential tab
    And Submit the SES Course enquiry
    Then verify the Course enquiry submitted successfully

  @ses_idpWebsite @critical @IDPREG
  Scenario: Verify if a new IC and a Course enquiry Lead is created in c4c upon submitting SES Course enquiry
     Given User login to the application as "Counsellor" in "UAT"
    And Search for IDP registered student from Global Search
    And Select the student record on global search result
    And Verify the new IC is created
    Then Navigate to lead tab
    And verify the Lead should be created from IDP Website "Student Essentials"
