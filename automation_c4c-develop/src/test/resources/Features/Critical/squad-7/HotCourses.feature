Feature: Hot Courses

  @critical @hc
  Scenario Outline: Register as a new student and verify the new IC, lead create
    Given the user Login to Hot Courses as "HC_URL" in "HC" and "<TestCaseNo>"
    When Accept all cookies
    And Click help me to study abroad button
    And Enter the first name
    And Enter the second name
    And Enter the email ID
    And Save the email
    And Enter the mobile number
    And Select preferred study level
    And Select preferred study location
    And Select when do you want to study
    And Select month
    And Click the terms and policy checkboxes
    And Click speak to an expert button
    And Select counselling mode as in person counselling
    And Select nearest IDP office
    And Click skip all button
    And Click on YES button from popup
    And create a password
    Then Click on register now button

    Examples: 
      | TestCaseNo |
      | HC_0001    |

  @critical @hc2
  Scenario Outline: Register as the Existing Student in C4C and verify the new lead create
    Given the user Login to Hot Courses as "HC_URL" in "HC" and "<TestCaseNo>"
    When Accept all cookies
    Then Click on profile icon
    And Enter the email address
    And Enter the password
    And Click on login button
    And Click Search course icon
    And Search and open a course
    And Click helpme to apply button

    Examples: 
      | TestCaseNo |
      | HC_0003    |
