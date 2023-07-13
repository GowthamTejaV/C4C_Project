Feature: CRT

  @regression @CTRReg1
  Scenario: Verify the tabs for the account as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Accounts tab
    And user open any one of the accounts
    Then Verify the INSTITUTION INFO TAB in the account workspace
    And Verify the US CANADA APP DATA TAB in the account workspace
    And Verify the CAMPUS TAB in the account workspace
    And Verify the WEB LINKS Tab in the account workspace
    And Verify the CONTACTS Tab in the account workspace
    And Verify the RELATIONSHIPS TAB in the account workspace
    And Verify the Addresses TAB in the account workspace
    And Verify the salesData TAB in the account workspace
    And Verify the DOCUMENTS TAB in the account workspace
    And Verify the NOTES TAB in the account workspace
    And Verify the CHANGES Tab in the account workspace
    And Verify the Help Tab in the account workspace

  @regression @CTRReg2
  Scenario: Verify the tabs for the account as a counsellor
    #Given User Login to C4C as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Accounts tab
    And user open any one of the accounts
    Then Verify the INSTITUTION INFO TAB in the account workspace
    And Verify the US CANADA APP DATA TAB in the account workspace
    And Verify the CAMPUS TAB in the account workspace
    And Verify the WEB LINKS Tab in the account workspace
    And Verify the CONTACTS Tab in the account workspace
    And Verify the RELATIONSHIPS TAB in the account workspace
    And Verify the CHANGES Tab in the account workspace

  @regression @CTRReg3
  Scenario: Verify the tabs for the contacts as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Contacts tab
    And user open any one of the Contacts
    Then Verify the ADDRESSES tab in the Contacts workspace
    And Verify the FEED tab in the Contacts workspace
    And Verify the MARKETING PERMISSIONS tab in the Contacts workspace
    And Verify the NOTES tab in the Contacts workspace
    And Verify the ACTIVITIES tab in the Contacts workspace

  @regression @CTRReg9
  Scenario: Verify the tabs for the contacts as a AR role
    #Given User Login to C4C as a Account Receivable
    Given User login to the application as "AR" in "UAT"
    And user navigate to the Contacts tab
    And user open any one of the Contacts as AR
    Then Verify the ADDRESSES tab in the Contacts workspace
    And Verify the FEED tab in the Contacts workspace
    And Verify the MARKETING PERMISSIONS tab in the Contacts workspace
    And Verify the NOTES tab in the Contacts workspace
    And Verify the ACTIVITIES tab in the Contacts workspace
    And Verify the TICKETS tab in the Contacts workspace as counsellor
    And Verify the LEADS tab in the Contacts workspace as counsellor
    And Verify the OPPORTUNITY tab in the Contacts workspace as counsellor
    And Verify the SALES QUOTES tab in the Contacts workspace as counsellor
    And Verify the CAMPAIGNS tab in the Contacts workspace as counsellor
    And Verify the MARKETING INTERACTIONS tab in the Contacts workspace as counsellor
    And Verify the TARGET GROUPS tab in the Contacts workspace as counsellor

  @regression @CTRReg4
  Scenario: Verify the tabs for the contacts as a counsellor
    #Given User Login to C4C as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Contacts tab
    And user open any one of the Contacts
    Then Verify the ADDRESSES tab in the Contacts workspace
    And Verify the FEED tab in the Contacts workspace
    And Verify the TICKETS tab in the Contacts workspace as counsellor

  @regression @CTRReg5
  Scenario: Verify the account list view as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Accounts tab
    Then Verify the tabs in the account List View as Client Relation role

  @regression @CTRReg6
  Scenario: Verify the account list view as Counsellor
    #Given User Login to C4C as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Accounts tab
    Then Verify the tabs in the account List View as counsellor

  @regression @CTRReg7
  Scenario: Verify the contact list view as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Contacts tab
    Then Verify the tabs in the contact List View

  @regression @CTRReg9
  Scenario: Verify the contact list view as a AR role
    #Given User Login to C4C as a Account Receivable
    Given User login to the application as "AR" in "UAT"
    And user navigate to the Contacts tab
    Then Verify the tabs in the contact List View as AR role

  @regression @CTRReg8
  Scenario: Verify the contact list view as Counsellor
    #Given User Login to C4C as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Contacts tab
    Then Verify the tabs in the contact List View as counsellor

  @regression @CTRReg8
  Scenario: Verify the account filter view as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Accounts tab
    And user clicks on account advance filter Icon
    Then Verify the fields in Account Filter View

  @regression @CTRReg8
  Scenario: Verify the contact filter view as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Contacts tab
    And user clicks on contact advance filter Icon
    Then Verify the fields in contact Filter View

  @regression @CTRReg8
  Scenario: Verify the account overview as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Accounts tab
    And user open any one of the accounts
    Then Verify the Overview Fields in Accounts

  @regression @CTRReg9
  Scenario: Verify the account overview as Account Receivable Role
    #Given User Login to C4C as a Account Receivable
    Given User login to the application as "AR" in "UAT"
    And user navigate to the Accounts tab
    And user open any one of the accounts
    Then Verify the Overview Fields in Accounts as AR role

  @regression @CTRReg8
  Scenario: Verify the account overview as a Counsellor
    #Given User Login to C4C as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Accounts tab
    And user open any one of the accounts
    Then Verify the Overview Fields in Accounts as a Counsellor

  @regression @CTRReg8
  Scenario: Verify the contact overview as a Client Relation role
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Contacts tab
    And user open any one of the Contacts
    Then Verify the Overview Fields in Contacts

  @regression @CTRReg9
  Scenario: Verify the contact overview as a AR
    #Given User Login to C4C as a Account Receivable
    Given User login to the application as "AR" in "UAT"
    And user navigate to the Contacts tab
    And user open any one of the Contacts as AR
    Then Verify the Overview Fields in Contacts

  @regression @CTRReg8
  Scenario: Verify the contact overview as a Counsellor
    #Given User Login to C4C as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Contacts tab
    And user open any one of the Contacts
    Then Verify the Overview Fields in Contacts as a Counsellor

  @regression @CTRReg88
  Scenario Outline: Verify the CRT user able to create the account
    #Given User Login to C4C as a client relation role
    Given User login to the application as "CRT" in "TRAIN"
    And user navigate to the Accounts tab
    And click on Add Icon in order to create new account
    And Enter the account name <accountName>
    And Enter the Role name <Role>
    And Enter the WebSite name <WebSite>
    And Enter the CountryRegion name <CountryRegion>
    And Enter the City name <City>
    And Enter the State name <State>
    And Enter the Owner name <Owner>
    And Enter the AccountStatus name <AccountStatus>
    Then Save and Open the Account Record
    And Verify the Account is created with all the Data

    Examples: 
      | accountName  | Role         | WebSite      | CountryRegion | City         | State        | Owner        | AccountStatus |
      | DC_CRT-28227 | DC_CRT-28227 | DC_CRT-28227 | DC_CRT-28227  | DC_CRT-28227 | DC_CRT-28227 | DC_CRT-28227 | DC_CRT-28227  |

  @regression @CTRReg99
  Scenario Outline: Verify the AR user able to create the account
    #Given User Login to C4C as a Account Receivable
    Given User login to the application as "AR" in "UAT"
    And user navigate to the Accounts tab
    And click on Add Icon in order to create new account
    And Enter the account name <accountName>
    And Enter the Role name <Role>
    And Enter the WebSite name <WebSite>
    And Enter the CountryRegion name <CountryRegion>
    And Enter the City name <City>
    And Enter the State name <State>
    And Enter the Owner name <Owner>
    And Enter the AccountStatus name <AccountStatus>
    Then Save and Open the Account Record
    And Verify the Account is created with all the Data


    Examples: 
      | accountName  | Role         | WebSite      | CountryRegion | City         | State        | Owner        | AccountStatus |
      | DC_AR-28227 | DC_AR-28227 | DC_AR-28227 | DC_AR-28227  | DC_AR-28227 | DC_AR-28227 | DC_AR-28227 | DC_AR-28227  |

  @regression @CTRReg8
  Scenario: Verify the counsellor not able to create the account
    #Given User Login to C4C as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And user navigate to the Accounts tab
    And Verify counsellor should not be able to add or edit the Accounts
