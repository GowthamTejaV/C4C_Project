Feature: Hot Courses

  @critical @h2
  Scenario Outline: Register as a new student and verify the new IC, First Lead as "Yes"
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then Get the Hot Courses email address
    Then Search for HC record
    Then Select first record from table
    And Switch to leads tab
    Then verify the data exist in leads tab
    And Open the first lead
    And Switch to online tab
    And Verify the first lead created value as Yes

    Examples: 
      | TestCaseNo |
      | HC_0002    |

  
  Scenario Outline: Register as the Existing Student in C4C and verify the new lead create , First Lead as "No"
    Given User login to the application as "OFFICE_MANAGER" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    Then Get the Hot Courses email address
    Then Search for HC record
    Then Select first record from table  
    And Switch to leads tab
    Then Verify the lead created multiple times 
    And Open the second lead
    And Switch to online tab
    And Verify the first lead created value as No

    Examples: 
      | TestCaseNo |
      | HC_0004    |
