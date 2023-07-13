Feature: CRT Role Based testing


  #Then Verify the tabs in the account workspace
  @critical @CRT @cri
  Scenario: Verify the tabs for the account as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Accounts tab
    And user open any one of the accounts
    Then Verify the tabs in the account workspace as counsellor

  @critical @CRT @cri
  Scenario: Verify the tabs for the contacts as a AR role
   Given User login to the application as "AR" in "UAT"
    And user navigate to the Contacts tab
    And user open any one of the Contacts as AR
    Then Verify the tabs in the Contacts workspace as counsellor
    
    @critical @CRT @cri
  Scenario: Verify the tabs for the contacts as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Contacts tab
    And user open any one of the Contacts 
    Then Verify the tabs in the contact workspace as a AR role

  @critical @CRT @cri
  Scenario: Verify the account list view as Counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Accounts tab
    Then Verify the tabs in the account List View as counsellor

  @critical @CRT @cri
  Scenario: Verify the contact list view as Counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Contacts tab
    Then Verify the tabs in the contact List View as counsellor

  @critical @CRT @cri
  Scenario: Verify the tabs for the account as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Accounts tab
    And user open any one of the accounts
