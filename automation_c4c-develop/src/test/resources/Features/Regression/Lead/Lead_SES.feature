Feature: SES Lead

  @Regression_P2 @RegressioSES
  Scenario Outline: Ensure the counsellor is able to create a new Student Essential Cold, Warm lead for existing customer in C4C from IC facet
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User search for existing Individual customer <IC_ID>
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Click on Add icon
    When user Enter details on the Category field as <Category>
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter Would like to Study In Field <I Would Like to Study In>
    Then The values should be Prefilled for the Name
    And values should be Prefilled for the Category
    And values should be Prefilled for the Student
    And values should be Prefilled for the IDP Owner
    And values should be Prefilled for the IDP Office
    And values should be Prefilled for the IDP Team
    When User save the Qualification details successsfully <testCaseNo>
    Then Verify if the created lead is added as a line item in the Lead Table
    When User Select the created lead
    Then lead overview page should be displayed successfully
    And Verify the Lead is crated with the category "Student Essentials"
    And Verify the Lead is created with the Source
    And User should navigate to Qualification Tab
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field

    Examples: 
      | source   | Level    | I Would Like to Study In | testCaseNo | IC_ID    | Category |
      | DC-29277 | DC-29277 | DC-29277                 | DC-29277   | DC-29277 | DC-29277 |
      | DC-29278 | DC-29278 | DC-29278                 | DC-29278   | DC-29278 | DC-29278 |

  @Regression_P1 @RegressioSES
  Scenario Outline: Verify the counsellor is able to a Copy an active Visa Migration Lead and create Student Essential Lead using copy functionality
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And User search for the Lead Category as <FilterCategory> Status as <FilterStatus> and qualification level as <FilterQualificationLevel> and study plan date as "Next Year"
    And user select lead on leads page table
    And user copy the existing lead record
    Then user Enter details on the Category field "Student Essentials"
    And Enter the source <source>
    And update the I would like to study in <I would like to study>
    And Enter study Plan Date <StudyPlanDate>
    And Enter Qualification Level <QualificationLevel>
    And user click lead save and open button
    Then Verify if the created lead is added as a line item in the Lead Table
    When User Select the created lead
    Then lead overview page should be displayed successfully
    And Verify the Lead is crated with the category "Student Essentials"
    And User should navigate to Qualification Tab
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field

    Examples: 
      | FilterCategory | FilterStatus | FilterQualificationLevel | QualificationLevel | lead ID  | StudyPlanDate | I would like to study | source   |
      | DC-29279       | DC-29279     | DC-29279                 | DC-29279           | DC-29279 | DC-29279      | DC-29279              | DC-29279 |

  @Regression_P1 @RegressioSES
  Scenario Outline: Verify the counsellor is able to a Copy a Converted Course Enquiry Lead and create Student Essential Lead using copy functionality
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And User search for the Lead Category as <FilterCategory> Status as <FilterStatus> and qualification level as <FilterQualificationLevel> and study plan date as "Next Year"
    And user select lead on leads page table
    And user copy the existing lead record
    Then user Enter details on the Category field "Student Essentials"
    And Enter the source <source>
    And update the I would like to study in <I would like to study>
    And Enter study Plan Date <StudyPlanDate>
    And Enter Qualification Level <QualificationLevel>
    And user click lead save and open button
    Then Verify if the created lead is added as a line item in the Lead Table
    When User Select the created lead
    Then lead overview page should be displayed successfully
    And Verify the Lead is crated with the category "Student Essentials"
    And User should navigate to Qualification Tab
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field

    Examples: 
      | FilterCategory | FilterStatus | FilterQualificationLevel | QualificationLevel | lead ID  | StudyPlanDate | I would like to study | source   |
      | DC-29280       | DC-29280     | DC-29280                 | DC-29280           | DC-29280 | DC-29280      | DC-29280              | DC-29280 |

  @Regression_P1 @RegressioSES
  Scenario Outline: verify the counsellor is able to a Copy a Cancelled Course Enquiry Lead and create Student Essential Lead using copy functionality
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And User search for the Lead Category as <FilterCategory> Status as <FilterStatus> and qualification level as <FilterQualificationLevel> and study plan date as "Next Year"
    And user select lead on leads page table
    And user copy the existing lead record
    Then user Enter details on the Category field "Student Essentials"
    And Enter the source <source>
    And update the I would like to study in <I would like to study>
    And Enter study Plan Date <StudyPlanDate>
    And Enter Qualification Level <QualificationLevel>
    And user click lead save and open button
    Then Verify if the created lead is added as a line item in the Lead Table
    When User Select the created lead
    Then lead overview page should be displayed successfully
    And Verify the Lead is crated with the category "Student Essentials"
    And User should navigate to Qualification Tab
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field

    Examples: 
      | FilterCategory | FilterStatus | FilterQualificationLevel | QualificationLevel | lead ID  | StudyPlanDate | I would like to study | source   |
      | DC-29281       | DC-29281     | DC-29281                 | DC-29281           | DC-29281 | DC-29281      | DC-29281              | DC-29281 |

  @Regression_P1 @RegressioSES
  Scenario Outline: Verify the counsellor is able to a Copy a Converted Visa Migration Lead and create Student Essential Lead using copy functionality
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And User search for the Lead Category as <FilterCategory> Status as <FilterStatus> and qualification level as <FilterQualificationLevel> and study plan date as "Next Year"
    And user select lead on leads page table
    And user copy the existing lead record
    Then user Enter details on the Category field "Student Essentials"
    And Enter the source <source>
    And update the I would like to study in <I would like to study>
    And Enter study Plan Date <StudyPlanDate>
    And Enter Qualification Level <QualificationLevel>
    And user click lead save and open button
    Then Verify if the created lead is added as a line item in the Lead Table
    When User Select the created lead
    Then lead overview page should be displayed successfully
    And Verify the Lead is crated with the category "Student Essentials"
    And User should navigate to Qualification Tab
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field

    Examples: 
      | FilterCategory | FilterStatus | FilterQualificationLevel | QualificationLevel | lead ID  | StudyPlanDate | I would like to study | source   |
      | DC-29282       | DC-29282     | DC-29282                 | DC-29282           | DC-29282 | DC-29282      | DC-29282              | DC-29282 |

  @Regression_P1 @RegressioSES
  Scenario Outline: Verify the counsellor is able to a Copy a Converted Visa Migration Lead and create Student Essential Lead using copy functionality
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And User search for the Lead Category as <FilterCategory> Status as <FilterStatus> and qualification level as <FilterQualificationLevel> and study plan date as "Next Year"
    And user select lead on leads page table
    And user copy the existing lead record
    Then user Enter details on the Category field "Student Essentials"
    And Enter the source <source>
    And update the I would like to study in <I would like to study>
    And Enter study Plan Date <StudyPlanDate>
    And Enter Qualification Level <QualificationLevel>
    And user click lead save and open button
    Then Verify if the created lead is added as a line item in the Lead Table
    When User Select the created lead
    Then lead overview page should be displayed successfully
    And Verify the Lead is crated with the category "Student Essentials"
    And User should navigate to Qualification Tab
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field

    Examples: 
      | FilterCategory | FilterStatus | FilterQualificationLevel | QualificationLevel | lead ID  | StudyPlanDate | I would like to study | source   |
      | DC-29283       | DC-29283     | DC-29283                 | DC-29283           | DC-29283 | DC-29282      | DC-29283              | DC-29283 |

  @Regression_P1 @Regression
  Scenario Outline: Verify the counsellor is able to update the lead details for the existing record
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the Status <StatusType>
    And Filter the records based on the category <categoryType>
    And user select lead on table
    And Click on Edit button in Lead page
    Then User should navigate to Qualification Tab
    And update I would like to study in Qualification Tab <I would like to study>
    And Update Study Plan Date in Qualification Tab <StudyPlanDate>
    And Update Qualification Level in Qualification Tab <Qualification Level>
    And Update study Level i Prefer is in Qualification Tab <Study Level I Prefer>
    And User click on Qualification tab save button
    And user navigate to the Lead page overViewPage
    Then Verify if the created lead is added as a line item in the Lead Table
    When User Select the created lead
    Then lead overview page should be displayed successfully
    And Verify the Lead is crated with the category "Student Essentials"
    And User should navigate to Qualification Tab
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field

    Examples: 
      | categoryType | StatusType | I would like to study | StudyPlanDate | Qualification Level | Study Level I Prefer |
      | DC-29284     | DC-29284   | DC-29284              | DC-29284      | DC-29284            | DC-29284             |
      
   @Regression__1
  Scenario Outline: Verify the counsellor is able to update the IDP Owner detail for the existing Lead record
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <IC>
    And User navigate to the Lead page
    When user select lead on table
    And user clicks on Lead Edit button
    And Update the IDP owner to <IDP_Owner_ID>
     #And values should be Prefilled for the Student
    #And values should be Prefilled for the IDP Owner
    #And values should be Prefilled for the IDP Office
    #And values should be Prefilled for the IDP Team
    And user click lead save button
    Then Lead records should be updated successfully

    Examples: 
      | IC       | IDP_Owner_ID |
      | DC-30339 | DC-30339     |
