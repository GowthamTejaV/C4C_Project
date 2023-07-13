Feature: CRT Functionality

  @critical @CRT @cri
  Scenario: Verify the tabs for the account as a Client Relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Accounts tab
    And user open any one of the accounts
    Then Verify the tabs in the account workspace

  @critical @CRT @cri
  Scenario: Verify the tabs for the contacts as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Contacts tab
    And user open any one of the Contacts
    Then Verify the tabs in the Contacts workspace

  @critical @CRT @cri
  Scenario: Verify the account list view as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Accounts tab
    Then Verify the tabs in the account List View as Client Relation role

  @critical @CRT @cri
  Scenario: Verify the contact list view as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Contacts tab
    Then Verify the tabs in the contact List View

  @critical @CRT @cri
  Scenario: Verify the account filter view as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Accounts tab
    And user clicks on account advance filter Icon
    Then Verify the fields in Account Filter View

  @critical @CRT @cri
  Scenario: Verify the contact filter view as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Contacts tab
    And user clicks on contact advance filter Icon
    Then Verify the fields in contact Filter View

  @critical @CRT @cri
  Scenario: Verify the account overview as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Accounts tab
    And user open any one of the accounts
    Then Verify the Overview Fields in Accounts

  @critical @CRT @cri
  Scenario: Verify the contact overview as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Contacts tab
    And user open any one of the Contacts
    Then Verify the Overview Fields in Contacts
