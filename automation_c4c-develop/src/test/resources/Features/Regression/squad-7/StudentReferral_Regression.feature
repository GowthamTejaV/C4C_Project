Feature: Student Referral

  @regression @demo
  Scenario Outline: Verify if when there are  tags - User will not be able to save the Student record with   the Referred by field empty
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on edit button
    And Select the reffered by counsellor
    And Click on save button
    And Verify header message for referred by
    And Click cancel button from overview page
    And Click on edit button
    And Select referral counsellor ID
    And Click on save button
    And Verify header message for referral counsellor ID
    And Click cancel button from overview page
    And Click on edit button
    And Fill all referral fields
    And Click on save button
    And Verify header message for referral

    Examples: 
      | TestCaseNo |
      | IC_0007    |
