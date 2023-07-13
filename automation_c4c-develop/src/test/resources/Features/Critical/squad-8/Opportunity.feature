Feature: Oppurtunity

  Scenario Outline: Course Enquiry Opportunity - Create an IC with auto lead (simple)
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for Train
    And Click on save and open button
    Then Save the studentId
    Then get the student id
    And Switch to leads tab
    Then Select first record from lead table in a flow
    And Save the lead ID

    Examples: 
      | TestCaseNo |
      | OP_0001    |

   @critical @op @op
  Scenario Outline: Course Enquiry Opportunity - Create an IC with auto lead
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for Train
    #And Click on save and open button
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

    Examples: 
      | TestCaseNo |
      | OP_0002    |

   @critical @op 
  Scenario Outline: Course Enquiry Opportunity -  Lead to Opportunity
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Leads Page
    Then Search the lead record
    Then Select first record from lead table
    And Switch to qualification tab
    And Click edit qualification
    And Fill mandatory fields from qualification
    And Switch to course selection tab
    And Click on add courses button
    And Select a course from the table and close the window
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID

    Examples: 
      | TestCaseNo |
      | OP_0003    |

   @critical @op 
  Scenario Outline: Course Enquiry Opportunity - Opportunity to finalise opportunity
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Switch to Opportunity Page
    Then Search for the ID Opportunity in train
    And Select the first record from the opportunity list Train
    Then click on opportunity global Edit icon
    And Change the application stage as Offer Accepted by Student dropdown
    And Enter the Institution Preference
    And Enter the Submission Method Email
    And Enter the Service Level
    And Enter the offer Received Date Train
    And Navigate to Course Selection tab
    #And Enter Details in Course Selection page
    And Enter the Details in Course Selection page Train
    And Navigate to Visa Details tab
    And Enter Details in Visa Details tab
    And Navigate to the Documents Section and Upload the Document
    And categories attachment in Documents
    And Finalise the Opportunity
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0004    |

   @critical @op 
  Scenario Outline: Create IDP Direct Application and verify the additional Tabs and validation
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
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

   @critical @op 
  Scenario Outline: Course Enquiry Opportunity - update finalised opportunity
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Switch to Opportunity Page
    Then Search for the latest Opportunity ID
    And Select the first record from the opportunity list Train
    And Switch to course selection tab
    And Click on the update course flag
    And Update the added course
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0005    |

   @critical @op 
  Scenario Outline: Course Enquiry Opportunity - cancel finalised opportunity
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Switch to Opportunity Page
    Then Search for the latest Opportunity ID
    And Select the first record from the opportunity list Train
    And Switch to course selection tab
    And Click on the delete course button
    And Select the reason for cancel course
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0006    |

   @critical @op 
  Scenario Outline: Open an existing opportunity to update and save
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Switch to Opportunity Page
    Then Search for the latest Opportunity ID
    And Select the first record from the opportunity list Train
    And Switch to course selection tab
    And Click edit course button
    And Update the added course
    And Click on save button

    Examples: 
      | TestCaseNo |
      | OP_0009    |

   @critical @op 
  Scenario Outline: Create an Application for Other Destination (UK)
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for Train
    #And Update IC record
    And Click on save and open button
    Then Save the studentId
    Then get the student id
    And Switch to leads tab
    Then Select first record from lead table in a flow
    And Switch to qualification tab
    And Click edit qualification
    And Fill mandatory fields from qualification
    And Fill english test detail
    And Switch to course selection tab
    And Click on add courses button
    And Select a course from the table and close the window for UK destination
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID

    Examples: 
      | TestCaseNo |
      | OP_0007    |
