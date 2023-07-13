Feature: Recommendation engine regression test case

 @regression @demo
  Scenario Outline: Verify reset button
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId
    And Switch to recommendation engline tab
    And Enter the study level in RE
    And Enter the intake date in RE
    And Enter the subject keyword in RE
    And Enter the destination in RE
    And Click reset button

    Examples: 
      | TestCaseNo |
      | RE_0001    |

 @regression @demo
  Scenario Outline: Verify search results are displayed based on the filter applied
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
    And Verify OIP course in RE
    And Shortlist the courses
    And Unshortlist the courses
    And Check IDP suggested course displayed against shortlisted courses

    Examples: 
      | TestCaseNo |
      | RE_0002    |

 @regression @demo
  Scenario Outline: Verify the shortlisted course detail with popup window
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
    #And Enable offer in principles course toggle
    And Click on search filters button in RE
    And Verify the shortlisted course detail with popup window

    Examples: 
      | TestCaseNo |
      | RE_0003    |

 @regression @demo
  Scenario Outline: Create the New OIP course from CRE by clicking the Get Decision button in the Shortlisted Course section
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
    And Fill all the details from academic admission test section OIP
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

    Examples: 
      | TestCaseNo |
      | RE_0004    |

 @regression @demo
  Scenario Outline: Verify the shortlisted course count
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
    And Verify OIP course in RE
    And Verify the shortlisted course count

    Examples: 
      | TestCaseNo |
      | RE_0005    |

 @regression @demo 
  Scenario Outline: Verify general and course feedback comments are captured in the rec_counsellor_feedback table.
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
    And Open and submit feedback1
    And Click on search filters button in RE
    And Open and submit feedback2

    Examples: 
      | TestCaseNo |
      | RE_0001    |
