Feature: Notification

  @critical @Notif @TestDryRun @cri
  Scenario Outline: Verify Lead Assignment Email and C4C Notification
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <TestCaseNo>
    And Navigate to lead tab
    And user select lead on table
    Then user clicks on Notification Icon
    And New notification message should displayed for newly created Lead

    Examples: 
      | TestCaseNo |
      | DC-35425   |
