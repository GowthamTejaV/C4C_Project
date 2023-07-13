Feature: Opportunity - SES

  @regression @demo @ses
  Scenario Outline: Create and IC and add the Additional SES information and the Sudent Info details
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields for Train
    And Click on save and open button
    Then Save the studentId
    And Switch to leads tab
    Then Click on create lead button from IC
    And Select the category from dropdown
    And Select the qualification level from dropdown
    And Select the student from student popup
    And Select the source from dropdown
    And Click save and open button
    And Click on edit button
    And Select the subcategory
    And Click save button
    And Switch to student essestial tab
    And Click on add product button
    And Add a product into SES lead
    And Click save button
    And Click on action button
    And Click convert to oppurtunity from action dropdown
    And Click Global save and open
    And Save the opportunity ID
    And Switch to student essestials tab
    And Click on edit button
    And Enter the mandatory fields
    And Click save button
    And Switch to overview page leads
    And Click on more view button
    And Verify the status changes

    Examples: 
      | TestCaseNo |
      | OP_0008    |
