Feature: Documnet management

  #@DocumnetManagement11
  #Scenario Outline: Verify Submitting application attaching Visa Document and to be sent not selected
    #Given User login to the application as "OFFICE_MANAGER" in "TRAIN"
    #And Navigate to Individual Customers Page
    #And User navigate to IC record creation page
    #And User create new Individual Customers record successfully <TestCaseNo>
    #And user navigate to History page
    #And click on edit Icon and create English prefernece Details <TestCaseNo>
    #And Navigate to lead tab
    #And user select lead on table
    #Then create the Qualification <TestCaseNo>
    #And add the course
    #And User conver the lead to opportunity
    #
    #Examples:
    #| source   | Level    | I Would Like to Study In | testCaseNo |TestCaseNo|
    #| DC-30201 | DC-30201 | DC-30201                 | DC-30201   |DC-30201|
    #Given User login to the application as "Counsellor" in "DEV"
    #And Navigate to Individual Customers Page
    #And Navigate to Opportunity Page
    #And Search for the Opportunity <oppID>
    #And User Open the Opportunity for the search ID
    #Then click on opportunity Edit icon
    #And Change the application stage as Offer Accepted by Student
    #
    #Examples: 
      #| oppID     |
      #| 300013568 |

  @critical @DocumnetManagement12
  Scenario Outline: Documnet Management File Check
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TC_KeyName>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for Train
    Then Save the studentId
    Then get the student id
    And Switch to history tab
    Then Click on add education history button
    And fill the all mandatory fields in education history tab
    Then Click on add employment history button
    And fill the all mandatory fields in employment history tab Train
    And click add english proficiency data
    Then click on save history button
    And Switch to leads tab
    Then Select first record from lead table in a flow
    And Save the lead ID
    And Switch to qualification tab
    And Click edit qualification
    And Fill mandatory fields from qualification
    And Switch to course selection tab
    And Click on add courses button
    And Select a course from the table and close the window IDP direct
    And User conver the lead to opportunity
    #And Click on action button
    #And Click convert to oppurtunity from action dropdown
    #And Click Global save and open
    #And Save the opportunity ID
    Then click on opportunity global Edit icon
    #And Change the application stage as Offer Accepted by Student dropdown
    #And Enter the Institution Preference
    #And Enter the Submission Method
    #And Enter the Service Level
    #And Enter the offer Received Date Train
    #And Navigate to Course Selection tab
    #And Enter Details in Course Selection page
    And Navigate to Visa Details tab
    And Enter Details in Visa Details tab
    And Switch to student details page
    And Enter all the required details in student details page
    And Switch to IDP direct page
    And Enter all the required details in IDP direct page
    And navigate to Opportunity Overview page
    And Change the application stage to <TC_KeyName>
    And Enter the Institution Preference as <TC_KeyName>
    And Enter the Service Level as <TC_KeyName>
    Then Click on save button to save Opportunity Edit details
    And Verify the error message should be display as "Please attach following document in attachments section : Academic Transcripts and/or Course Completion"
    And Verify the error message should be display as "Please attach following document in attachments section : Credit Exemption/Transfer/Prior Learning Related documents"
    And Verify the error message should be display as "Please attach following document in attachments section : Academic Transcripts and/or Course Completion"
    And Verify the error message should be display as "Please attach following document in attachments section : IDP Student Assessment Form (SVP)"
    And Verify the error message should be display as "Please attach following document in attachments section : Work Experience Related Documents"
    #----------------------------------
    #And Navigate to the Documents Section and Upload the Document
    #And categories attachment in Documents
    #And Finalise the Opportunity
    #And Click on save button
    Examples: 
      | TC_KeyName |
      | DMFC_0001  |
