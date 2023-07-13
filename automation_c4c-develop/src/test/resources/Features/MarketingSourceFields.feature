Feature: Marketing source fields

  @critical @MarketingSource @TestDryRun @cri
  Scenario Outline: Verify the marketing manager able to view extra fields and update the details
    Given User login to the application as "MARKETING_MANAGER" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Click on Add icon
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter Would like to Study In Field <I Would Like to Study In>
    And Study Level I Prefer Is <StudyLevelIPrefer>
    And Study Plan Date Is <StudyPlanDate>
    And Enter the IDP Office <IDP Office>
    And Enter the IDP Team <IDP Team>
    And user click lead save and open button
    And user clicks on Lead Edit button
    And click more button
    Then Update the values in Event ID Fields <EventID>
    And Update the value in Event Name Field <EventName>
    And Update the value in Medium Field <MediumField>
    And Update the value in Paid Organic <PaidOrganic>
    And Update the value in Channel <Channel>
    And user click lead save button
    And Verify the message should be display as "Your entries have been saved."

    Examples: 
      | IDP Team | IDP Office | EventID  | EventName | MediumField | PaidOrganic | Channel  | source   | Level    | I Would Like to Study In | StudyLevelIPrefer | StudyPlanDate |
      | DC-30361 | DC-30361   | DC-30361 | DC-30361  | DC-30361    | DC-30361    | DC-30361 | DC-30361 | DC-30361 | DC-30361                 | Postgraduate      | 24.05.2024    |
