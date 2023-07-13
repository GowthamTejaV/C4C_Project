Feature: Activities Regression Testcases

  @regression @act
  Scenario Outline: Add Task to a IC and check whether the IC is triggered
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId
    #Then get the student id
    #And Search for a record
    #Then Select first record from table
    And Switch to Activities tab
    And Click new task button
    And Fill mandatory fields in new task section
    And Click on save button
    And Verify new task created sucessfully
    And Open an task from the list
    And Click on edit task button
    And Update fields of task
    And Click on save button
    And Verify the updated task
    And Switch to task tab

    #And Delete the task
    Examples: 
      | TestCaseNo |
      | ACT_0001   |

  @regression @act
  Scenario Outline: Add the new Phone call to the IC and check whether the phone call is created under Individual
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the student id
    And Search for a record
    Then Select first record from table
    And Switch to Activities tab
    And Click new phone call button
    And Fill mandatory fields in new phone call section
    And Click on save button
    And Verify new phone call created sucessfully
    And Open an phone call from the list
    And Click on edit phone call button
    And Update fields of phone call
    And Click on save button
    And Verify the updated phone call

    Examples: 
      | TestCaseNo |
      | ACT_0001   |

  @regression @act
  Scenario Outline: Add Appointments to a IC and check whether the appointment is updated and displayed(Lead)
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Leads Page
    And Click on create lead button from Leads
    And Fill mandatory fields in leads page
    And Click on save and open button in lead tab
    And Save the lead ID activity
    And Switch to Activities tab
    And Click new appointment button
    And Fill mandatory fields in new appointment page
    And Click on save button
    And Verify new appointment created sucessfully leads
    And Open an appointment from the list leads
    And Click on edit appointment button
    And Update date of appointment
    And Click on save button
    And Verify the updated appointment leads

    #And Delete the appointment leads
    Examples: 
      | TestCaseNo |
      | ICR_0020   |

  @regression 
  Scenario Outline: Add Task to a IC and check whether the IC is triggered(Lead)
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Leads Page
    Then get the lead id
    And Search for a lead record
    Then Select first record from lead table
    And Switch to Activities tab
    And Click new task button
    And Fill mandatory fields in new task section
    And Click on save button
    And Verify new task created sucessfully leads
    And Open an task from the list leads
    And Click on edit task button
    And Update fields of task
    And Click on save button
    And Verify the updated task
    And Switch to task tab

    #And Delete the task leads
    Examples: 
      | TestCaseNo |
      | ACT_0001   |

  @regression @act
  Scenario Outline: Add the new Phone call to the IC and check whether the phone call is created under Lead
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Leads Page
    Then get the lead id
    And Search for a lead record
    Then Select first record from lead table
    And Switch to Activities tab
    And Click new phone call button
    And Fill mandatory fields in new phone call section
    And Click on save button
    And Verify new phone call created sucessfully leads
    And Open an phone call from the list leads
    And Click on edit phone call button
    And Update fields of phone call
    And Click on save button
    And Verify the updated phone call

    Examples: 
      | TestCaseNo |
      | ACT_0001   |
