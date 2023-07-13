Feature: Oppurtunity EBS course enquiry

  @regression @demo 
  Scenario Outline: Finalise an Standalone Opportunity - IDP Client Yes, IDP Direct Yes and APF Payable yes
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for Train
    And Click on save and open button
    Then Save the studentId
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
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID
    Then click on opportunity global Edit icon
    And Change the application stage as Offer Accepted by Student dropdown
    And Enter the Institution Preference
    And Enter the Submission Method
    And Enter the Service Level
    And Enter the offer Received Date Train
    And Navigate to Course Selection tab
    And Enter Details in Course Selection page
    And Navigate to Visa Details tab
    And Enter Details in Visa Details tab
    And Switch to student details page
    And Enter all the required details in student details page
    And Switch to IDP direct page
    And Enter all the required details in IDP direct page
    And Navigate to the Documents Section and Upload the Document
    And categories attachment in Documents
    And Finalise the Opportunity
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0008    |

  @regression @demo 
  Scenario Outline: Create student using channel partner portal
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And User Click on Submit Student Application tab
    And User enter student information <testcaseNO>
    And user click on Save button
    Then Vefiry the Students Details gets saved successfully
    And add the new Attachment File
    And Submit Student Application
    Then verify the student Application submited successfully

    Examples: 
      | testcaseNO |
      | DC-29319   |

  @regression @demo
  Scenario Outline: Finalise an Package Opportunity
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for Train
    And Click on save and open button
    Then Save the studentId
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
    And Select a course from the table and close the window nested type course NO
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID
    Then click on opportunity global Edit icon
    And Change the application stage as Offer Accepted by Student dropdown
    And Enter the Institution Preference
    And Enter the Submission Method
    And Enter the Service Level
    And Enter the offer Received Date Train
    And Navigate to Course Selection tab
    And Enter the Details in Course Selection page Train
    And Navigate to Visa Details tab
    And Enter Details in Visa Details tab
    And Switch to student details page
    And Enter all the required details in student details page
    And Switch to IDP direct page
    And Enter all the required details in IDP direct page
    And Navigate to the Documents Section and Upload the Document
    And categories attachment in Documents
    And Finalise the Opportunity
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0008    |

  @regression @demo
  Scenario Outline: Finalise an Package Opportunity nested course
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for Train
    And Click on save and open button
    Then Save the studentId
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
    And Select a course from the table and close the window nested type course YES
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID
    Then click on opportunity global Edit icon
    And Change the application stage as Offer Accepted by Student dropdown
    And Enter the Institution Preference
    And Enter the Submission Method
    And Enter the Service Level
    And Enter the offer Received Date Train
    And Navigate to Course Selection tab
    And Enter the Details in Course Selection page Train
    And Navigate to Visa Details tab
    And Enter Details in Visa Details tab
    And Switch to student details page
    And Enter all the required details in student details page
    And Switch to IDP direct page
    And Enter all the required details in IDP direct page
    And Navigate to the Documents Section and Upload the Document
    And categories attachment in Documents
    And Finalise the Opportunity
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0008    |

  @regression @demo
  Scenario Outline: Finalise and Manual - Standalone
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for Train
    And Click on save and open button
    Then Save the studentId
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
    And Select a course from the table and close the window standalone UK course
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID
    Then click on opportunity global Edit icon
    And Change the application stage as Offer Accepted by Student dropdown
    And Enter the Institution Preference
    And Enter the Submission Method Email
    And Enter the Service Level
    And Enter the offer Received Date Train
    And Navigate to Course Selection tab
    And Enter the Details in Course Selection page Train
    And Navigate to Visa Details tab
    And Enter Details in Visa Details tab
    And Switch to Manual Application page
    And Fill mandatory fields in manual application page
    And Navigate to the Documents Section and Upload the Document
    And categories attachment in Documents
    And Finalise the Opportunity
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0008    |

  @regression @demo
  Scenario Outline: Finalise an Package Opportunity - where First Offer is Not Accepted in Opportunity
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for Train
    And Click on save and open button
    Then Save the studentId
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
    And Select a course from the table and close the window nested type course NO
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID
    Then click on opportunity global Edit icon
    And Change the application stage as Offer Accepted by Student dropdown
    And Enter the Institution Preference
    And Enter the Submission Method
    And Enter the Service Level
    And Enter the offer Received Date Train
    And Navigate to Course Selection tab
    And Enter the Details in Course Selection page OfferAccepted No
    And Navigate to Visa Details tab
    And Enter Details in Visa Details tab
    And Switch to student details page
    And Enter all the required details in student details page
    And Switch to IDP direct page
    And Enter all the required details in IDP direct page
    And Navigate to the Documents Section and Upload the Document
    And Verify the header message
    And Navigate to Course Selection tab
    And Move second course to first in course list
    And Enter the Details in Course Selection page OfferAccepted No
    And Change offer accepted to YES
    And Switch to Documents tab
    And Click refresh button
    And categories attachment in Documents
    And Finalise the Opportunity
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0008    |

  @regression @demo
  Scenario Outline: Finalise an Standalone Opportunity - IDP Client No and APF Payable No - Channel partner - yes(1)
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the channel partner student id
    And Search for a record
    Then Select first record from table
    #And click more button
    Then Click edit button
    And Fill the required fields add more details
    #Then click on save IC
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
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID
    Then click on opportunity global Edit icon
    And Change the application stage as Offer Accepted by Student dropdown
    And Enter the Institution Preference
    And Enter the Submission Method
    And Enter the Service Level
    And Enter the offer Received Date Train
    And Navigate to Course Selection tab
    And Enter the Details in Course Selection page OfferAccepted No
    And Change offer accepted to YES
    And Navigate to Visa Details tab
    And Enter Details in Visa Details tab
    And Switch to student details page
    And Enter all the required details in student details page
    And Switch to IDP direct page
    And Enter all the required details in IDP direct page
    And Navigate to the Documents Section and Upload the Document
    #And Verify the header message
    #And Navigate to Course Selection tab
    #And Move second course to first in course list
    #And Change offer accepted to YES
    #And Switch to Documents tab
    #And Click refresh button
    And categories attachment in Documents
    And Finalise the Opportunity
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0008    |

  @regression @demo  @ebs
  Scenario Outline: Finalise an Standalone Opportunity - IDP Client No and APF Payable No - Channel partner - yes(2)
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the channel partner student id
    And Search for a record
    Then Select first record from table
    #And click more button
    Then Click edit button
    And Fill the required fields add more details
    #Then click on save IC
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
    And Select a course from the table and close the window IDP direct CPP
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID
    Then click on opportunity global Edit icon
    And Change the application stage as Offer Accepted by Student dropdown
    And Enter the Institution Preference
    And Enter the Submission Method
    And Enter the Service Level
    And Enter the offer Received Date Train
    And Navigate to Course Selection tab
    And Enter the Details in Course Selection page OfferAccepted No
    And Change offer accepted to YES
    And Navigate to Visa Details tab
    And Enter Details in Visa Details tab
    And Switch to student details page
    And Enter all the required details in student details page
    And Switch to IDP direct page
    And Enter all the required details in IDP direct page UST university
    And Navigate to the Documents Section and Upload the Document
    #And Verify the header message
    #And Navigate to Course Selection tab
    #And Move second course to first in course list
    #And Change offer accepted to YES
    #And Switch to Documents tab
    #And Click refresh button
    And categories attachment in Documents
    And Finalise the Opportunity
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0008    |
