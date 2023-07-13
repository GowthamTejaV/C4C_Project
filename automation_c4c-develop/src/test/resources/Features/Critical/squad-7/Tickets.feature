Feature: Email

  @critical @h2
  Scenario Outline: Create a new ticket and attach document and save
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When User navigates to ticket Menu
    Then Change the view selection to All Tickets
    And Click on the status header
    And search for open status records
    And Click on the interation type
    And Search for Email interation type
    And Select the first record from the tickets table
    And Verify the status if Open
    And Click on the edit record button in tickets overview page
    And Select the assigned to from the assign dropdown
    And Save the record
    And Verify the status field auto update to in-progress
    And Navigate to Documents tab in tickets page
    And upload the required document email
    And Save the record
    And Navigate to interactions tab in tickets page
    #And Click on the reply all button from email interation tab
    #And Click on the Send email button
    #And Verify the email is sent
    #And Navigate to overview page in tickets menu
    #And Verify the status is changed to completed
    And Click New button in interaction tab
    And Click edit from address button
    And Select a relevent channel
    And Enter the email content
    And Click on the Send email button
    And Verify the email is sent
    And Navigate to overview page in tickets menu
    And Verify the status is changed to completed

    Examples: 
      | TestCaseNo  |
      | Ticket_0001 |

  @critical @h2
  Scenario Outline: Create a new ticket from menu
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When User navigates to ticket Menu
    Then Click create new ticket icon
    And Fill the all required fields in new ticket creation page
    And Click save and open
    And Verify the status field auto update to in-progress
    And Navigate to interactions tab in tickets page
    And Click New button in interaction tab
    And Click edit from address button
    And Select a relevent channel
    #And Enter the email content
    And Click on the Send email button
    And Verify the email is sent
    And Navigate to overview page in tickets menu

    #And Verify the status is changed to completed
    Examples: 
      | TestCaseNo  |
      | Ticket_0002 |

  @critical
  Scenario Outline: Create a new ticket from gmail
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When User navigates to ticket Menu
    Then Send an email to the admin for creating new ticket
    And Save the sent email address

    Examples: 
      | TestCaseNo  |
      | Ticket_0003 |

  Scenario Outline: Verify and other flow of tickets
    Given User login to the application as "Counsellor" in "TRAIN" and "<TestCaseNo>"
    When User navigates to ticket Menu
    Then Change the view selection to All Tickets
    And Click search the email record
    And Select the first record from the tickets table
    And Verify the status if Open
    And Click on the edit record button in tickets overview page
    And Select the assigned to from the assign dropdown
    And Save the record
    And Verify the status field auto update to in-progress
    And Navigate to Documents tab in tickets page
    And upload the required document
    And Save the record
    And Navigate to interactions tab in tickets page
    And Click on the reply all button from email interation tab
    And Click on the Send email button
    And Verify the email is sent
    And Navigate to overview page in tickets menu
    And Verify the status is changed to completed

    Examples: 
      | TestCaseNo  |
      | Ticket_0004 |
