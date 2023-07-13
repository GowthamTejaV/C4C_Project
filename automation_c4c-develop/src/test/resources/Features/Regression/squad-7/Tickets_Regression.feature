Feature: Tickets Regression

  
  Scenario Outline: Verify - Ability of Counsellor to view newly created IC record and ticket tagged against it
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When User navigates to ticket Menu
    Then Change the view selection to All Tickets
    #And Find the ticket which user sent
    And Navigate to interactions tab in tickets page

    #And Verify the incoming message
    Examples: 
      | TestCaseNo  |
      | Ticket_0001 |
