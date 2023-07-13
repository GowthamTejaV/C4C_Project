Feature: Individual Customer Regression Testcases

 @regression @demo
  Scenario Outline: Ensure the counsellor is able to view the error message on creation of duplicate email adress
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for duplicate flow

    Examples: 
      | TestCaseNo |
      | ICR_0001   |

 @regression @demo
  Scenario Outline: Ensure the counsellor is able to create the new customer with  by clicking (save) option from Individual customers list view/Verify that the details filled in the IC Creation page are populated in the Overview facet
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for regression
    And Click on save button regression

    Examples: 
      | TestCaseNo |
      | IC_0001    |

 @regression @demo
  Scenario Outline: Ensure the counsellor is able to create the new customer with  by clicking (Save and open) option from Individual customers list view / Verify the default values at the IC Overview / Verify the IDP Section below the Overview facet
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for regression
    And Click on save and open button regression
    Then Save the studentId
    And Verify the default values at the IC Overview
    And Verify the IDP Section below the Overview facet

    Examples: 
      | TestCaseNo |
      | IC_0001    |

 @regression @demo
  Scenario Outline: Ensure the counsellor is able to create the new customer with  by clicking (Save and New) option from Individual customers list view
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for regression
    And Click on save and new button regression

    Examples: 
      | TestCaseNo |
      | IC_0001    |

 @regression @demo
  Scenario Outline: Verify the fields displayed in the Overview facet along with mandatory fields indication
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Verify the overview page facet fields

    Examples: 
      | TestCaseNo |
      | ICR_0004   |

 @regression @demo
  Scenario Outline: Verify the picklist items of Gender field in IC Overview
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify the picklist items of Gender field in IC Overview
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify the picklist items of the Student Lifecycle field in the IC Overview
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    #And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify the picklist items of the Student Lifecycle field in the IC Overview
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify the picklist items of Marital status field
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify the picklist items of Marital status field
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify the picklist values of Country of birth field
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify the picklist values of Country of birth field
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify the picklist values for Nationality Field
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify the picklist values for Nationality Field
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify the picklist values for Country of residency Field
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify the picklist values for Country of residency Field
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify the picklist values for Primary Language Field
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify the picklist values for Primary Language Field
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify the picklist items of Academic Title field
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify the picklist items of Academic Title field
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify the picklist values for Site ID Field in the IC Overview
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify the picklist values for Site ID Field in the IC Overview
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify the picklist values for Counselling Mode Field in the IC Overview
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify the picklist values for Counselling Mode Field in the IC Overview
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify that enabling the Show Communication details radio button displays the email id and contact number
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Verify that enabling the Show Communication details radio button displays the email id and contact number
    And Click cancel button from overview page

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify that the number of leads corresponding to the particualar IC is displayed
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to leads tab
    And Verify that the number of leads corresponding to the particualar IC is displayed
    And Verify the Column fields in the leads tab of IC

    Examples: 
      | TestCaseNo |
      | ICR_0006   |

 @regression @demo
  Scenario Outline: Verify the Create + functionality in the leads tab of IC and Verify that the number of leads corresponding to the particualar IC is displayed and Click on refresh button from leads page
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to leads tab
    #And Verify the Column fields in the leads tab of Leads_Facet
    And copy student name
    And Click on refresh button from leads page
    And Verify that the number of leads corresponding to the particualar IC is displayed
    And Click on create lead button from IC
    And Fill mandatory fields in leads page
    And Click on save button in lead tab
    And Click on refresh button from leads page
    And Verify that the number of leads corresponding to the particualar IC is displayed
    And Verify the sort functionality in the leads tab of IC
    And Click on the student name from the leads table
    #And verify if same student lead is opened
    And Verify that clicking on the name of the IDP Owner the profile of the IDP owner is displayed

    Examples: 
      | TestCaseNo |
      | ICR_0018   |

 @regression @demo
  Scenario Outline: Verify that Individual Customer note section is displayed and is editable in the Notes tab of an IC
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to Notes tab
    And Verify that Individual Customer note section is displayed and is editable in the Notes tab of an IC
    And Verify the edit and delete functionality for IC note
    And Add paragraph in notes
    And Click collapse all button
    And Click expand all button

    #And Click on save button
    Examples: 
      | TestCaseNo |
      | ICR_0019   |

 @regression @demo
  Scenario Outline: Add Appointments to a IC and check whether the appointment is updated and displayed
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to Activities tab
    And Click new appointment button
    And Fill mandatory fields in new appointment page
    And Click on save button
    And Verify new appointment created sucessfully
    And Open an appointment from the list
    And Click on edit appointment button
    And Update date of appointment
    And Click on save button
    And Verify the updated appointment

    Examples: 
      | TestCaseNo |
      | ICR_0020   |

 @regression @demo
  Scenario Outline: Enure the counsellor is able to add the new address in a student record
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Click show communication details toggle
    And Switch to address tab
    And Click add address icon
    And Fill mandatory fields in new address page
    And Click add address button in footer
    And Click on save button
    And Switch to IC-overview tab
    And Verify that the Addresses tab is not displayed when the Show communication details radio button is turned off

    Examples: 
      | TestCaseNo |
      | ICR_0021   |

 @regression @demo
  Scenario Outline: Verify that the Addresses tab is not displayed when the Show communication details radio button is turned off
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Click on the more button in overview page
    And Click edit button in Overview page
    And Click show communication details toggle
    And Switch to address tab
    And Update the address fields
    And Click on save button

    Examples: 
      | TestCaseNo |
      | ICR_0022   |

 @regression @demo
  Scenario Outline: Ensure that counsellor is able to add an Education history with completed status in a student record
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to history tab
    And Verify education history along with add button exist
    And Verify employement history along with add button exist
    And Verify english proficiency along with add button exist
    And Verify columns are displayed in the table under Education History
    And Click on add button and enter the education history details
    And enter the status as completed
    And Click save button

    Examples: 
      | TestCaseNo |
      | ICR_0023   |

 @regression @demo
  Scenario Outline: Ensure that counsellor is able to add an Education history with currently studying status in a student record
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to history tab
    And Click on add button and enter the education history details
    And enter the status as currently studying
    And Click save button

    Examples: 
      | TestCaseNo |
      | ICR_0023   |

 @regression @demo
  Scenario Outline: Ensure that counsellor is able to add an Education history when country of study is Australia/Ensure that counsellor is able to add an Education history with discontinued status in a student record
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to history tab
    And Click on add button and enter the education history details
    And enter the status as discontinued
    And Click save button

    Examples: 
      | TestCaseNo |
      | ICR_0023   |

 @regression @demo
  Scenario Outline: Ensure that counsellor is able to add an English Proficiency in a student record
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to history tab
    And Click on add button and enter the english proficiency details
    And Verify the English proficiency picklist value field level validation
    And Fill mandatory fields of english proficiency test
    And Click save button

    Examples: 
      | TestCaseNo |
      | ICR_0023   |

 @regression @demo
  Scenario Outline: Ensure that counsellor is able to add an Employment history in a student record
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to history tab
    And Click on add button and enter the employment history details
    And Fill mandatory fields in employment history details
    And Click save button

    Examples: 
      | TestCaseNo |
      | ICR_0023   |

 @regression @demo
  Scenario Outline: Ensure that counsellor is able to add/Remove Social media details in Student Info details of a student record
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to students info tab
    And Click on add identification documents button
    And Verify the functionality of Driving licence value in the identification documents section
    And Verify the list of picklist values at Type field of identification documents section in Student info tab
    And Verify the list of picklist values at Type issuing country of identification documents section in Student info tab
    And Fill mandatory fields in identification documents
    And Click save button
    And Click on add social media accounts button
    And Verify the list of picklist values at Type field of Social media accounts section in Student info tab
    And Fill mandatory fields in social media accounts
    And Click save button
    And Click delete button from social media accounts
    And Click save button

    Examples: 
      | TestCaseNo |
      | ICR_0023   |

 @regression @demo
  Scenario Outline: Enure the counsellor is able to update the marketing permission in a student record
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to marketing permission tab
    And Ensure the counsellor is able to update by clicking opt_in button
    And Ensure the counsellor is able to update by clicking opt_out button
    And Ensure the counsellor is able to update by clicking undefined button
    And Click save button

    Examples: 
      | TestCaseNo |
      | ICR_0023   |

 @regression @demo
  Scenario Outline: Verify that the user is able to add Counsellors to the particular IC
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to counsellors tab
    And Click add counsellor button
    And Verify that the user is able to add Counsellors to the particular IC
    And Click save button
    And Switch to IC_overview tab
    And Verify that the Counsellor with check box enabled for Current field is displayed in in the IDP Section of IC Overview tab
    And Switch to counsellors tab
    And Verify the Delete functionality in the Counsellor tab
    And Click save button

    Examples: 
      | TestCaseNo |
      | ICR_0023   |
