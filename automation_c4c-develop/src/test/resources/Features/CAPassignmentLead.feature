Feature: CAP Assignment Rules

  @critical @CAPRUL @TestDryRun @cri
  Scenario Outline: Verify whether the course added in the lead is the same as the course in the newly
    created task

    #Given the user Login to C4C as a cap user
    Given User login to the application as "CAP" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <TestCaseNo>
    And user navigate to History page
    And click on edit Icon and create English prefernece Details <TestCaseNo>
    And Navigate to lead tab
    And Click on Add icon
    And Enter the source <source>
    And Enter Qualification Level <Level>
    #And Enter the Category as  <category>
    And Enter Would like to Study In Field <I Would Like to Study In>
    When User save the Qualification details successsfully <testCaseNo>
    And navigate to Cap Application Details
    And Click on Add Rows in Cap Application Details
    Then Selected Courses in Cap Application Details
    And Save the Lead Details
    And Get all the Courses in Cap Application Details
    #And add the course for Cap Application Details <Course ID>
    And Navigate to the Lead Overview Page
    And user clicks on Lead Edit button
    And Select the CAP Team ID
    And Click on Assign CAP Officer
    And Save the Lead Details
    Then navigate to Activities tab
    And Select the Task in Activities page
    And navigate to task CAP Application Details
    Then Verify course added in the lead in the newly created task

    Examples: 
      | source   | Level    | I Would Like to Study In | Course ID | category | testCaseNo | TestCaseNo |
      | DC-41700 | DC-41700 | DC-41700                 | DC-41700  | DC-41700 | DC-41700   | DC-35471   |
