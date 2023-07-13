Feature: SMS functionality

  @regression @demo 
  Scenario Outline: Verify C4C user is able to send SMS in English language
 Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId
    #Then get the student id
    #And Search for a record
    #Then Select first record from table
    And Switch to SMS tab
    And Click on new button in sms page
    And Type new text message
    And Click on send button
    And Verify the message present in the sent list

    Examples: 
      | TestCaseNo |
      | OIPR_0001  |

  @regression @demo
  Scenario Outline: Verify C4C user is able to send SMS which contains multiple lines of text English language
 Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId
    #Then get the student id
    #And Search for a record
    #Then Select first record from table
    And Switch to SMS tab
    And Click on new button in sms page
    And Type new text message multiple lines
    And Click on send button
    And Verify the message present in the sent list

    Examples: 
      | TestCaseNo |
      | OIPR_0001  |

  @regression @demo
  Scenario Outline: Verify an user shall be able to send SMS to the mobile number inputted to an existing IC with MP as Opt Out
 Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId
    #Then get the student id
    #And Search for a record
    #Then Select first record from table
    And Switch to marketing permission tab
    And Verify SMS set to optout
    And Switch to SMS tab
    And Click on new button in sms page
    And Type new text message multiple lines
    And Click on send button
    And Verify the message present in the sent list

    Examples: 
      | TestCaseNo |
      | OIPR_0001  |

  @regression @demo
  Scenario Outline: Check whether the user is able to send SMS for the student having phone number code for diffrent countries
 Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId
    #Then get the student id
    #And Search for a record
    #Then Select first record from table
    And Switch to SMS tab
    And Click on new button in sms page
    And Type new text message
    And Click on send button
    And Verify the message present in the sent list

    Examples: 
      | TestCaseNo |
      | SMS_0004   |
      | SMS_0005   |
      | SMS_0006   |
      | SMS_0007   |
      | SMS_0008   |
      | SMS_0009   |
      | SMS_0010   |
      | SMS_0011   |
      | SMS_0012   |

  @regression @chr
  Scenario Outline: Create student using channel partner portal
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
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

  @regression @demo
  Scenario Outline: Verify an user shall be able to send SMS to the mobile number inputted to an IC created through Channel Partner Portal
    Given User login to the application as "OFFICE_MANAGER" in "TRAIN" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then get the channel partner student id
    And Search for a record
    Then Select first record from table
    Then Click edit button
    And Fill the required fields add more details
    And Switch to SMS tab
    And Click on new button in sms page
    And Type new text message
    And Click on send button
    And Verify the message present in the sent list

    Examples: 
      | TestCaseNo |
      | SMS_0005   |
      
