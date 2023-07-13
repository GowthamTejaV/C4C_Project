Feature: China contract pay

 @regression @demo
  Scenario Outline: Verify that only Contract Admin can create Student Contact against Individual Customer
    Given User login to the application as "CONTRACT_USER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId for contract
    Then switch to contract tab
    And click on create new contract button
    Then fill all the mandatory fields in contrcat page

    Examples: 
      | TestCaseNo |
      | IC_0011    |

 @regression @demo
  Scenario Outline: Verify that Contract admin able to Create Multiple Contract and link the Contract with Lead
    Given User login to the application as "CONTRACT_USER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId for contract
    Then switch to contract tab
    And click on create new contract button
    Then fill all the mandatory fields in contrcat page
    And Click global sync EBS option
    And Switch to leads tab
    Then Click on create lead button from IC
    And Select the category SES from dropdown
    And Select the qualification level from dropdown
    #And Select the student from student popup
    And Select the source from dropdown
    And Click save and open button
    And Click on edit button
    And Select the subcategory
    And Link first contract with lead
    And Click save button
    And Switch to student essestial tab
    And Click on add product button
    And Add a product into SES lead
    And Click save button
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID
    And Click stundent details hyperlink from opportunity
    Then switch to contract tab
    And Click on the first contract
    And Click on opportunity section in contract
    And Verify if the contract mapped with the opportunity
    And Click on contract details section
    And click on create new contract button
    Then fill all the mandatory fields in contrcat page
    And Switch to leads tab
    Then Click on create lead button from IC
    And Select the category SES from dropdown
    And Select the qualification level from dropdown
    #And Select the student from student popup
    And Select the source from dropdown
    And Click save and open button
    And Click on edit button
    And Select the subcategory
    And Link second contract with lead
    And Click save button
    And Switch to student essestial tab
    And Click on add product button
    And Add a product into SES lead
    And Click save button
    And Click on action button
    And Click convert to oppurtunity from action dropdown second
    And Click Global save and open
    And Save the opportunity ID
    And Click stundent details hyperlink from opportunity
    Then switch to contract tab
    And Click on the second contract

    #And Click on opportunity section in contract
    #And Verify if the contract mapped with the opportunity second
    Examples: 
      | TestCaseNo |
      | OP_0008    |

 @regression @demo @ch3
  Scenario Outline: Verify that Contract Admin can edit and update the Existing Contract Details
    Given User login to the application as "CONTRACT_USER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    Then switch to contract tab
    And Click on edit button
    And Click on the first contract
    And Edit the existing contract

    Examples: 
      | TestCaseNo |
      | OP_0008    |

 @regression @demo
  Scenario Outline: Verify the Contract admin able to add Down Payment details when Contract status is Selected as Payment Pending
    Given User login to the application as "CONTRACT_USER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId for contract
    Then switch to contract tab
    And click on create new contract button
    Then fill all the mandatory fields in contrcat page
    And Click global sync EBS option
    And Click finalise EBS button for contract1
    And Click on edit button
    And Click on the first contract
    And Verify if the contract ID editable
    And Click payment details tab
    And Click add row in payment details
    And Fill mandatory in payment details
    And Click save button
    And Add multiple payment details

    #Then switch to contract tab
    #And Click on edit button
    #And Click on the first contract
    Examples: 
      | TestCaseNo |
      | OP_0008    |
