Feature: Visa Migration Lead

  @critical @Visa @TestDryRun @cri
  Scenario Outline: Enure the counsellor is able to create a new Visa Migration Cold,Hot, Warm lead for existing customer in C4C from IC facet
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Click on Add icon
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter the Category <Category>
    And Enter the visa type <visa type>
    #And Enter Would like to Study In Field <I Would Like to Study In>
    Then The values should be Prefilled for the Name
    And values should be Prefilled for the Student
    And values should be Prefilled for the IDP Owner
    And values should be Prefilled for the IDP Office
    And values should be Prefilled for the IDP Team
    When User save the Qualification details successsfully <testCaseNo>
    Then Verify if the created lead is added as a line item in the Lead Table
    When User Select the created lead
    Then lead overview page should be displayed successfully

    Examples: 
      | source   | Level    | I Would Like to Study In | Category | visa type | testCaseNo |
      | DC-30405 | DC-30405 | DC-30405                 | DC-30405 | DC-30405  | DC-30405   |
      | DC-30406 | DC-30406 | DC-30406                 | DC-30406 | DC-30406  | DC-30406   |
      | DC-30407 | DC-30407 | DC-30407                 | DC-30407 | DC-30407  | DC-30407   |

  @critical @Visa @TestDryRun @cri
  Scenario: verify the picklist value validation on creation of new Lead in Visa migration
     Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And Click on Lead Add icon
    Then Click on Qualification Level DropDown and confirm all the picklist values are displayed
    And Click on Category DropDown and confirm all the picklist values are displayed
    And Click on Source DropDown and confirm all the picklist values are displayed
    And Click on I would like to study in DropDown and confirm all the picklist values are displayed
