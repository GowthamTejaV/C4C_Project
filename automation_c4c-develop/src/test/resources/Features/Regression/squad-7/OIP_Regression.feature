Feature: OIP and In-Office

  @regression @demo
  Scenario Outline: Trigger the OIP course from Recommendation Engine tab
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId
    #Then get the student id
    #And Search for a record
    #Then Select first record from table
    And Switch to recommendation engline tab
    And Enter the study level in RE
    And Enter the intake date in RE
    And Enter the subject keyword in RE
    And Enter the destination in RE
    And Enable offer in principles course toggle
    And Click on search filters button in RE
    And Click get direction button from RE courses
    And Select start date for the course choosen
    And Fill all the details from academic admission test section RE
    And Fill all the details from english language admission test section RE
    And Fill all the details from admission test admission test section RE
    And Submit student qualification details
    And accept all the terms and conditions RE
    And Submit OIP course
    And Switch to leads tab
    And Verify OIP lead is created
    And Switch to offer in principles tab
    And Click on verify button from selected OIP course
    And Final verificatin of OIP course
    And Switch to leads tab
    And Open the OIP lead from lead list
    And Click on action button
    And Click convert to oppurtunity from action dropdown

    Examples: 
      | TestCaseNo |
      | OIPR_0001  |

  @regression @demo
  Scenario Outline: Trigger the OIP same course from Recommendation Engine tab
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to recommendation engline tab
    And Click on get decision button

    Examples: 
      | TestCaseNo |
      | OIPR_0001  |

  @regression @demo
  Scenario Outline: Update the qualification details in CRE and verified the changes happen in Latest qualification details
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to offer in principles tab
    And Click the edit button in OIP
    And Select the student qualification country
    And Edit academic admission test section
    And Fill all the details from academic admission test section from edit view
    And Submit student qualification details
    And Verifiy the updated detils

    Examples: 
      | TestCaseNo |
      | OIPR_0003  |

  @regression @demo
  Scenario Outline: Trigger the OIP course from OIP tab
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
    And Switch to leads tab
    Then Select second record from lead table
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open

    #And Save the opportunity ID
    Examples: 
      | TestCaseNo |
      | OIP_0001   |

  @regression @demo
  Scenario Outline: Trigger the OIP same course from OIP tab
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to offer in principles tab
    And Click on get decision button OIP

    Examples: 
      | TestCaseNo |
      | OIP_0001   |
