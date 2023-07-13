Feature: CAP Assignment Rules

  @regression @CapReg
  Scenario Outline: Verify whether an error message is thrown when the user clicks Assign CAP officer button without adding a course in CAP Application Details tab
    created task

    Given User login to the application as "CAP" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <TestCaseNo>
    And Navigate to lead tab
    And Click on Add icon
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter Would like to Study In Field <I Would Like to Study In>
    Then The values should be Prefilled for the Name
    And values should be Prefilled for the Category
    And values should be Prefilled for the Student
    And values should be Prefilled for the IDP Owner
    And values should be Prefilled for the IDP Office
    And values should be Prefilled for the IDP Team
    When User save the Qualification details successsfully <testCaseNo>
    And navigate to Cap Application Details
    And Click on Assign CAP Officer
    Then Verify the 'The action cant be completed. Add at least one course in the CAP Application Details Section.' error message should be thrown
    And Click on Add Rows in Cap Application Details
    Then User add two courses with the same AVA id
    And Save the Lead Details
    Then Verify the 'This action cannot be completed because Availability ID already exists' error message should be thrown
    And Enter same institution preferences for all the courses
    And Save the Lead Details
    Then Verify the 'Please select a different preference if the same preference already exists.' error message should be thrown

    Examples: 
      | source   | Level    | I Would Like to Study In | Course ID | category | testCaseNo |TestCaseNo|
      | DC-41700 | DC-41700 | DC-41700                 | DC-41700  | DC-41700 | DC-41700   |DC-35471 |

  @regression @CapReg
  Scenario Outline: Verify whether the course added in the lead is the same as the course in the newly created task
    Given User login to the application as "CAP" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Click on Add icon
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter Would like to Study In Field <I Would Like to Study In>
    When User save the Qualification details successsfully <testCaseNo>
    And navigate to Cap Application Details
    And Click on Add Rows in Cap Application Details
    Then Selected Courses in Cap Application Details
    And Save the Lead Details
    And Get all the Courses in Cap Application Details
    And Navigate to the Lead Overview Page
    And user clicks on Lead Edit button
    And Select the CAP Team ID
    And Click on Assign CAP Officer
    And Save the Lead Details
    Then navigate to Activities tab
    And Select the Task in Activities page
    And navigate to task CAP Application Details
    Then Verify course added in the lead in the newly created task
    And Verify whether the first added course is considered as the primary course
    And Verify the primary lead id is updated in the lead id column of the task
    And Switch to lead in which CAP Officer is already assigned
    And navigate to Cap Application Details
    Then Selected Courses in Cap Application Details where officer is already assigned to the lead
    And Save the Lead Details
    Then Verify the 'Your action couldnt be completed at this stage since the lead has already beenn assigned to a CAP Officer.' error message should be thrown
    And Click cancel button from overview page
    And User clicks on Actions button
    And Verify whether the Copy lead option is disabled when the lead is assigned to the CAP officer

    Examples: 
      | source   | Level    | I Would Like to Study In | Course ID | category | testCaseNo |
      | DC-41700 | DC-41700 | DC-41700                 | DC-41700  | DC-41700 | DC-41700   |

  @regression @CapReg
  Scenario Outline: Verify whether the user can save the entries without adding the course and institution in the row in the lead
    Given User login to the application as "CAP" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Click on Add icon
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter Would like to Study In Field <I Would Like to Study In>
    When User save the Qualification details successsfully <testCaseNo>
    And navigate to Cap Application Details
    And Click on Add Rows in Cap Application Details
    And Enter the institution preference "3"
    And Save the Lead Details
    Then Verify the 'Please enter the Course.' and 'Please enter the Institution.' error message should be thrown
    And Click cancel button from overview page
    And Click on Add Rows in Cap Application Details "1"
    Then Enter the text in the course column "Manual Course"
    And Enter the text in the institution column "Manual Institution"
    And Enter the institution preference "1"
    And Save the Lead Details
    Then Verify the 'Your entries have been saved.' error message should be thrown

    Examples: 
      | source   | Level    | I Would Like to Study In | Course ID | category | testCaseNo |
      | DC-41700 | DC-41700 | DC-41700                 | DC-41700  | DC-41700 | DC-41700   |

  @regression @CapReg
  Scenario Outline: Verify whether the default value of the Course Status column is Not Started  for all courses in the CAP Application Task
    Given User login to the application as "CAP" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Click on Add icon
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter Would like to Study In Field <I Would Like to Study In>
    When User save the Qualification details successsfully <testCaseNo>
    And navigate to Cap Application Details
    And Click on Add Rows in Cap Application Details
    Then Selected Courses in Cap Application Details
    And Save the Lead Details
    And Get all the Courses in Cap Application Details
    And Navigate to the Lead Overview Page
    And user clicks on Lead Edit button
    And Select the CAP Team ID
    And Click on Assign CAP Officer
    And Save the Lead Details
    Then navigate to Activities tab
    And Select the Task in Activities page
    And navigate to task CAP Application Details
    And Verify whether the default value of the Course Status column is "Not Started"

    Examples: 
      | source   | Level    | I Would Like to Study In | Course ID | category | testCaseNo |
      | DC-41700 | DC-41700 | DC-41700                 | DC-41700  | DC-41700 | DC-41700   |


