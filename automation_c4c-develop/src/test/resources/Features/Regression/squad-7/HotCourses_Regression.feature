Feature: Hot Courses

  @regression @demo 
  Scenario Outline: Verify that the New user able to submit the call back form from HC India Websites
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
    And Click submit button as online counselling
    And Click skip all button
    And Click on YES button from popup
    And create a password
    Then Click on register now button

    Examples: 
      | TestCaseNo |
      | HC_0001    |

  @regression @demo
  Scenario Outline: Verify that the C4C system update the field Country based on the Site Id updated
    Given User Login to C4C application "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then Get the Hot Courses email address
    Then Search for HC record
    Then Select first record from table
    And click more button
    And Verify the marketting permission set to YES
    And Switch to leads tab
    Then verify the data exist in leads tab
    And Open the first lead
    And Switch to online tab
    And Verify the site ID updated with the application
    And Verify the URL is updated
    And Verify the nearest IDP office is updated
    And Verify the first lead created value as Yes

    Examples: 
      | TestCaseNo |
      | HC_0002    |

  @regression @demo @dhc1
  Scenario Outline: Verify that the New user able to submit the call back form from HC India Websites with Marketing permission as No and Counselling mode as In-Person counselling
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
    And Click the terms and policy checkboxes with out marketting permission
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

  @regression @demo
  Scenario Outline: Verify that the New user able to submit the call back form from HC India Websites with Marketing permission as No and Counselling mode as In-Person counselling
    Given User Login to C4C application "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then Get the Hot Courses email address
    Then Search for HC record
    Then Select first record from table
    And click more button
    And Verify the marketting permisson field marked as No

    Examples: 
      | TestCaseNo |
      | HC_0002    |

  @regression @demo
  Scenario Outline: Verify that the New user able to submit the call back form from HC India Websites with Marketing permission as No and Counselling mode as Virtual counselling
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
    And Click the terms and policy checkboxes with out marketting permission
    And Click speak to an expert button
    And Click submit button as online counselling
    And Click skip all button
    And Click on YES button from popup
    And create a password
    Then Click on register now button

    Examples: 
      | TestCaseNo |
      | HC_0001    |

  @regression @demo
  Scenario Outline: Verify that the Existing user able to submit the call back form from HC India Websites
    Given the user Login to Hot Courses as "HC_URL" in "HC" and "<TestCaseNo>"
    When Accept all cookies
    And Click help me to study abroad button
    And Enter the first name
    And Enter the second name
    And Enter the email ID existing user
    And Enter the mobile number
    And Select preferred study level
    And Select preferred study location
    And Select when do you want to study
    And Select month
    And Click the terms and policy checkboxes
    And Click speak to an expert button
    And Click submit button as online counselling
    And Click skip all button
    And Click on YES button from popup
    And create a password
    Then Click on register now button

    Examples: 
      | TestCaseNo |
      | HC_0001    |
