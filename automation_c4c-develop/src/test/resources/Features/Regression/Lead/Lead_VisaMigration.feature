Feature: Visa Migration  Lead

  @Regression_P2 @RegressioVisa0 @Regressio_Visa
  Scenario Outline: Ensure the counsellor is able to create a new Visa Migration  Cold, Warm,Hot lead for existing customer in C4C from IC facet
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
    And Verify the Lead is crated with the category "Visa/Migration"
    And Verify the Lead is created with the Source
    And User should navigate to Qualification Tab
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field

    Examples: 
      | source   | Level    | I Would Like to Study In | testCaseNo | IC_ID    | Category |
      | DC-30405 | DC-30405 | DC-30405                 | DC-30405   | DC-30405 | DC-30405 |
      | DC-30406 | DC-30406 | DC-30406                 | DC-30406   | DC-30406 | DC-30406 |
      | DC-30407 | DC-30407 | DC-30407                 | DC-30407   | DC-30407 | DC-30407 |

  @Regression_P1 @RegressioVisa1 @Regressio_Visa @Regressio_Visa
  Scenario Outline: Verify the counsellor is able to a Copy an active Student Essential,active Course Enquiry,Converted Student Essential,Cancelled Student Essential,Converted Course Enquiry ,Cancelled Course Enquiry Lead and create Visa Migration Lead using copy functionality
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And User search for the Lead Category as <FilterCategory> Status as <FilterStatus> and qualification level as <FilterQualificationLevel> and study plan date as "Next Year"
    And user select lead on leads page table
    And user copy the existing lead record
    Then user Enter details on the Category field "Visa/Migration"
    And Enter the source <source>
    And update the I would like to study in <I would like to study>
    And Enter study Plan Date <StudyPlanDate>
    And Enter Qualification Level <QualificationLevel>
    And user click lead save and open button
    Then Verify if the created lead is added as a line item in the Lead Table
    When User Select the created lead
    Then lead overview page should be displayed successfully
    And Verify the Lead is crated with the category "Visa/Migration"
    And User should navigate to Qualification Tab
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field

    Examples: 
      | FilterCategory | FilterStatus | FilterQualificationLevel | QualificationLevel | lead ID  | StudyPlanDate | I would like to study | source   |
      | DC-30408       | DC-30408     | DC-30408                 | DC-30408           | DC-30408 | DC-30408      | DC-30408              | DC-30408 |
      | DC-30409       | DC-30409     | DC-30409                 | DC-30409           | DC-30409 | DC-30409      | DC-30409              | DC-30409 |
      | DC-30410       | DC-30410     | DC-30410                 | DC-30410           | DC-30410 | DC-30410      | DC-30410              | DC-30410 |
      | DC-30411       | DC-30411     | DC-30411                 | DC-30411           | DC-30411 | DC-30411      | DC-30411              | DC-30411 |
      | DC-30412       | DC-30412     | DC-30412                 | DC-30412           | DC-30412 | DC-30412      | DC-30412              | DC-30412 |
      | DC-30413       | DC-30413     | DC-30413                 | DC-30413           | DC-30413 | DC-30413      | DC-30413              | DC-30413 |

  @Regression_P1 @RegressioVisa2 @Regressio_Visa
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
    And Verify the Lead is crated with the category "Visa/Migration"
    And User should navigate to Qualification Tab
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field

    Examples: 
      | categoryType | StatusType | I would like to study | StudyPlanDate | Qualification Level | Study Level I Prefer |
      | DC-30414     | DC-30414   | DC-30414              | DC-30414      | DC-30414            | DC-30414             |

  @RegressioVisaTest2
  Scenario Outline: Verify the counsellor is able to update the IDP Owner detail for the existing Lead record
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <IC>
    And User navigate to the Lead page
    When user select lead on table
    And user clicks on Lead Edit button
    And Update the IDP owner to <IDP_Owner_ID>
    And values should be Prefilled for the Student
    And values should be Prefilled for the IDP Owner
    And values should be Prefilled for the IDP Office
    And values should be Prefilled for the IDP Team
    And user click lead save button
    Then Lead records should be updated successfully

    Examples: 
      | IC       | IDP_Owner_ID |
      | DC-30339 | DC-30339     |

  @Regression_CE4 @RegressioVisa4 @Regressio_Visa
  Scenario Outline: Verify the counsellor is able to update the qualification level of lead from Cold to Hot, Cold to Warm, Hot to Cold,Hot to Warm
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the Status <StatusType>
    And Filter the records based on the category <categoryType>
    And Filter the records based on the qualification level <filterqualificationLevel>
    And user select lead on table
    And Click on Edit button in Lead page
    Then User should navigate to Qualification Tab
    And update I would like to study in Qualification Tab <I would like to study>
    And Update Study Plan Date in Qualification Tab <StudyPlanDate>
    And Update study Level i Prefer is in Qualification Tab <Study Level I Prefer>
    And Update Qualification Level in Qualification Tab <Qualification Level>
    And User click on Qualification tab save button
    Then Qualification Details should be saved successfully
    And Verify the Lead is created with the Qualification Leave
    And Verify the Lead is created with the Would like to Study In Field
    And user navigate to the Lead page overViewPage
    When user click on student name hyperlink
    Then user redirect to IC Overview page
    And User navigate to the Lead page

    Examples: 
      | filterqualificationLevel | categoryType | StatusType | I would like to study | StudyPlanDate | Qualification Level | Study Level I Prefer |
      | DC-30416                 | DC-30416     | DC-30416   | DC-30416              | DC-30416      | DC-30416            | DC-30416             |
      | DC-30417                 | DC-30417     | DC-30417   | DC-30417              | DC-30417      | DC-30417            | DC-30417             |
      | DC-30418                 | DC-30418     | DC-30418   | DC-30418              | DC-30418      | DC-30418            | DC-30418             |
      | DC-30419                 | DC-30419     | DC-30419   | DC-30419              | DC-30419      | DC-30419            | DC-30419             |

  @Regression_CE6 @RegressioVisa5 @Regressio_Visa
  Scenario Outline: Verify the counsellor is able to update the Lead status to Cancel and No Response for Visa/Migration Lead
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the category <categoryType>
    And Filter the records based on the Status <StatusType>
    And user select lead on table
    And Click on Edit button in Lead page
    And update the lead status <lead status>
    And enter the reason for cancel <reason for cancel>
    And User click on Qualification tab save button
    Then Qualification Details should be saved successfully
    And Verify the Lead status got update
    When user click on student name hyperlink
    Then user redirect to IC Overview page

    Examples: 
      | StatusType | lead status | reason for cancel | categoryType |
      | DC-30420   | DC-30420    | DC-30420          | DC-30420     |
      | DC-30421   | DC-30421    | DC-30421          | DC-30421     |
      | DC-30422   | DC-30422    | DC-30422          | DC-30422     |

  @RegressioVisa6 @Regressio_Visa
  Scenario Outline: Verify the counsellor is able to update details for Cancelled Leads
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the category <categoryType>
    And Filter the records based on the Status <StatusType>
    And user select lead on table
    And Click on Edit button in Lead page
    Then User should navigate to Qualification Tab
    And update I would like to study in Qualification Tab <I would like to study>
    And Update Study Plan Date in Qualification Tab <StudyPlanDate>
    And Update study Level i Prefer is in Qualification Tab <Study Level I Prefer>
    And User click on Qualification tab save button
    Then Qualification Details should be saved successfully
    And Verify the Lead is created with the Would like to Study In Field
    And user navigate to the Lead page overViewPage
    When user click on student name hyperlink
    Then user redirect to IC Overview page
    And User navigate to the Lead page

    Examples: 
      | StatusType | lead status | categoryType | I would like to study | StudyPlanDate | Qualification Level | Study Level I Prefer |
      | DC-30423   | DC-30423    | DC-30423     | DC-30416              | DC-30416      | DC-30416            | DC-30416             |

  @RegressioVisa7
  Scenario Outline: Verify the counsellor is not able to update details for Converted Leads
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the category <categoryType>
    And Filter the records based on the Status <StatusType>
    And user select lead on table
    And Click on Edit button in Lead page
    
    
 @Regression_CE12 @RegressioVisa9 @Regressio_Visa
  Scenario: Verify the picklist value validation on creation of new Lead in course Enquiry
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And Click on Lead Add icon
    Then Click on Qualification Level DropDown and confirm all the picklist values are displayed
    And Click on Category DropDown and confirm all the picklist values are displayed
    And Click on Source DropDown and confirm all the picklist values are displayed
    And Click on I would like to study in DropDown and confirm all the picklist values are displayed
    
    @RegressioVisa8
  Scenario Outline: Convert the EVS lead record into opportunity as a Counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the Status <StatusType>
    And Filter the records based on the category <categoryType>
    And Filter the records based on the qualification level <filterqualificationLevel>
    And user select lead on table
    And add the course
    And User clicks on Actions button
    Then click on Convert to Opportunity button
    And Opportunity convertion page should be displayed Name of the Lead
    And Opportunity convertion page should be displayed Name of the IC
    And Opportunity convertion page should be displayed Name of the IDP Owner
    And Opportunity convertion page should be displayed Name of the Institution
    And Select the institution from the dropdown and click on Save and Open
    And Navigate to Lead overview page from the Opportunity Tab
    And user navigate to the Lead page overViewPage
    And verify the status is changed to Converted in Lead Overview page

    Examples: 
      | filterqualificationLevel | categoryType | StatusType |
      | DC-30427                 | DC-30427    | DC-30427  |
