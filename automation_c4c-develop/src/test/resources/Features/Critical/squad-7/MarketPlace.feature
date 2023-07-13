Feature: Market place - OIP lead

  @critical @mm
  Scenario Outline: Verify OIP Leads
     Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId
    #Then get the student id
    #And Search for a record
    #Then Select first record from table
    And Switch to offer in principles tab
    And Click the edit button in OIP
    And Select the student qualification country
    And Fill all the details from academic admission test section OIP
    And Fill all the details from english language admission test section OIP
    And Fill all the details from admission test admission test section OIP
    And Submit student qualification details
    And Click get direction button from OIP course suggestion
    And Select start date for the course choosen
    And accept all the terms and conditions
    And Submit OIP course
    And Switch to leads tab
    And Verify OIP lead is created
    And Switch to offer in principles tab
    And Click on verify button from selected OIP course
    And Final verificatin of OIP course

    Examples: 
      | TestCaseNo |
      | OIP_0001   |
