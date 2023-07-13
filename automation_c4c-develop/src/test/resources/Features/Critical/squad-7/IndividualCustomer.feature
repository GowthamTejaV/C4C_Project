Feature: Individual Customer

  @critical @ic
  Scenario Outline: Verify That the user is able to create IC successfully and Check the fields in Creation Page and IC Workspace
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId

    Examples: 
      | TestCaseNo |
      | IC_0001    |

  @critical @ic
  Scenario Outline: Check the Auto Lead Creation when new IC is created
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to leads tab
    Then verify the data exist in leads tab

    Examples: 
      | TestCaseNo |
      | IC_0002    |

  @critical @ic
  Scenario Outline: Verify by Selecting Site ID and Country region are auto selected and Mobile number code is also updated
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create IC icon
    Then Enter the site ID
    And verify if country region field is selected
    Then mobile number code is auto populated against the site id

    Examples: 
      | TestCaseNo |
      | IC_0003    |

  @critical @ic
  Scenario Outline: Open an Existing Test Individual Customer and update student data
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And click more button
    Then Click edit button
    And fill the required fields
    Then click on save IC

    Examples: 
      | TestCaseNo |
      | IC_0004    |

  @critical @ic
  Scenario Outline: Add Academic Details and Employment details
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to history tab
    Then Click on add education history button
    And fill the all mandatory fields in education history tab
    Then Click on add employment history button
    And fill the all mandatory fields in employment history tab
    Then click on save history button
    And click add english proficiency data
    Then click on save history button

    Examples: 
      | TestCaseNo |
      | IC_0005    |

  @critical @ic @abc
  Scenario Outline: Attach Documents in Individual Customer
     Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to document management tab
    And Upload required document

    Examples: 
      | TestCaseNo |
      | IC_0006    |

  @critical @ic
  Scenario Outline: Create student with Referral Scenario Outlines
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields

    Examples: 
      | TestCaseNo |
      | IC_0007    |

  @critical @ic 
  Scenario Outline: Create IC with Office Manager
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields others
    And Click on save and open button

    Examples: 
      | TestCaseNo |
      | IC_0008    |

  @critical @ic2 
  Scenario Outline: Create IC with Regional Manager
    Given User login to the application as "REGIONAL_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields others
    And Click on save and open button

    Examples: 
      | TestCaseNo |
      | IC_0009    |

  @critical @ic @op
  Scenario Outline: Create IC with Country Director
    Given User login to the application as "COUNTRY_DIRECTOR" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields others
    And Click on save and open button

    Examples: 
      | TestCaseNo |
      | IC_0010    |

  @critical @ic
  Scenario Outline: Contract Admin Role: Create New Contract in Individual Customer and sync with ebs
    Given User login to the application as "CONTRACT_USER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId for contract
    Then switch to contract tab
    And click on create new contract button
    Then fill all the mandatory fields in contrcat page
    And User navigate to the Lead page

    Examples: 
      | TestCaseNo |
      | OP_0008    |

  @critical @ic
  Scenario Outline: Open an existing contract and check user is able to edit
    Given User login to the application as "CONTRACT_USER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id for contract
    And Search for a record
    Then Select first record from table
    Then switch to contract tab
    And Click on edit button
    And Click on the first contract
    And Edit the existing contract

    Examples: 
      | TestCaseNo |
      | OP_0008    |
