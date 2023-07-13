Feature: Channel partner

  @critical @CPP @TestDryRun @cri
  Scenario Outline: Verify whether Student is getting created through CPP
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    #And User login to the application as "CPP_USER" in "CPP"
    And User Click on Submit Student Application tab
    And User enter student information <testcaseNO>
    And user click on Save button
    Then Vefiry the Students Details gets saved successfully
    And add the new Attachment File
    And Submit Student Application
    Then verify the student Application submited successfully

    Examples: 
      | testcaseNO |
      | DC-29319   |

  @critical @CPP @TestDryRun @cri
  Scenario Outline: Verify whether the Student created through CPP is able to convert
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open the Student Created on Channel Partner portal
    Then The relevant Individual customer details should land in overview section
    And Verify the Student created through CPP in C4C is same
    Then user clicks on Edit button in IC overview page
    And user Enter the Nationality Field <Nationality>
    And user Enter the Primary Language Field <PrimaryLanguage>
    And user Enter the Gender Field <Gender>
    And user Enter the modile number for cpp student
    Then Save the IC Record
    And user navigate to History page
    And click on edit Icon and create English prefernece Details <TestCaseNo>
    And Navigate to lead tab
    And user select lead on table
    Then Verify the Automatic lead is created for the student created via the CPP
    And navigate to Qualification tab
    And Click on Edit button in Lead page
    And Use save the Qualification details for CPP Student
    And add the course
    Then User conver the lead to opportunity
    And User verify the CPP converted lead in overview page

    Examples: 
      | Nationality | PrimaryLanguage | Gender   | TestCaseNo |
      | DC-29321    | DC-29321        | DC-29321 | DC-29321   |

  @critical @CPP @TestDryRun @cri
  Scenario: Verify whether converted Student in CPP
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And User Click on Applications In Process tab
    Then User verify the converted opportunity ID in CPP

