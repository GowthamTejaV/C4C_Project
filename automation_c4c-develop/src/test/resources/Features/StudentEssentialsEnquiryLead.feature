Feature: Student Essential Enquiry Lead

  @critical @SE_CR @TestDryRun @cri
  Scenario Outline: Ensure the counsellor is able to create a new Student Essential Cold lead and Warm lead for existing customer in C4C from IC facet
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Click on Add icon
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

    Examples: 
      | source   | Level    | I Would Like to Study In | Category | testCaseNo |
      | DC-29277 | DC-29277 | DC-29277                 | DC-29277 | DC-29277   |
      | DC-29278 | DC-29278 | DC-29278                 | DC-29278 | DC-29278   |

  @critical @SE_CR @TestDryRun @cri
  Scenario Outline: : Verify the counsellor is able to a Copy a Converted Course Enquiry Lead and create Student Essential Lead using copy functionality

    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And User search for the Lead Category as <Category> Status as <Status> and qualification level as <level> and study plan date as <Date>
    And user select lead on leads page table
    And user copy the existing lead record
    Then user Enter details on the Category field "Student Essentials"
    And Enter study Plan Date <StudyPlanDate>
    And user click lead save and open button
    Then New Student Essentials Lead should be created successfully

    Examples: 
      | Category | Status | level | Date | StudyPlanDate |
      | DC-29280 |        |       |      | DC-29280      |

  #@SES_11 @SE_CR
  #Scenario Outline: Verify the counsellor is able to update the lead details for the existing Student Essentials record
    #Given User Login to C4C as a counsellor
    #And Navigate to Individual Customers Page
    #Then IC page Should display the list of individual customers in the tabular format successfully
    #When User Open an existing Individual customer
    #Then The relevant Individual customer details should land in overview section
    #And Navigate to lead tab
    #And User open the "Student Essentials" record on IC Lead Page
    #And user select IC lead from leads page table
    #And User should navigate to Qualification Tab
    #And Now click on the edit button on Qualification Page
    #And Enter the source <source>
    #And update the I would like to study in <I would like to study>
    #And Update the Qualification Level <QualificatioLevel>
    #And Update the Study Plan Date <Study Plan Date>
    #And User click on Qualification tab save button
    #Then Qualification Details should be saved successfully
    #And user navigate to the Lead page overViewPage
    #When user click on student name hyperlink
    #Then user redirect to IC Overview page
    #And User navigate to the Lead page
    #
    #Examples: 
      #| source | I would like to study | QualificatioLevel | Study Plan Date |        |
      #| SES-01 | SES-01                | SES-01            | SES-01          | SES-01 |

  Scenario Outline: Verify the counsellor is able to update the IDP Owner detail for the existing Lead record
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And Click on Lead Add icon
    And Create Unqualified SES lead record
    And user clicks on Lead Edit button
    And Update the IDP owner to <IDP_Owner_ID>
    And user click lead save button
    Then Lead records should be updated successfully

    Examples: 
      | IDP_Owner_ID |
      | SES-04       |

  @critical @SE_CR @TestDryRun @cri
  Scenario Outline: Verify the counsellor is able to update the Lead status to Qualified
     Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And Click on Lead Add icon
    And Create Unqualified SES lead record
    And user clicks on Lead Edit button
    And Update the Lead Status to <Status>
    And user click lead save button
    Then Lead records should be updated successfully

    Examples: 
      | Status   |
      | DC-30361 |

  @critical @SE_CR @TestDryRun @cri
  Scenario Outline: Verify if counsellor is able to add Package and convert to opportunity
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Click on Add icon
    When user Enter details on the Category field as <Category>
    And Enter the source <source>
    And Enter Qualification Level <Level>
    #And Enter Would like to Study In Field <country>
    When User save the Qualification details successsfully <testCaseNo>
    And user clicks on Lead Edit button
    And Enter the Sub Category field <subCategory>
    And user click lead save button
    And user naviga to "STUDENT ESSENTIAL" tab
    And User clicks on the Add SE button
    And user clicks on the Product Category ID Lookup
    And user search for the "china" package and select the package from the list
    Then User clicks on the Product lookup field
    And Select the Produc from the list
    And User add the Product to SE record
    Then save the SE successfully
    And User conver the lead to opportunity
    And User verify the converted lead in overview page

    Examples: 
      | source | Level  | country | testCaseNo | Category | subCategory |
      | SES-02 | SES-02 | SES-02  | SES-02     | SES-02   | SES-02      |

  @critical @SE_CR @TestDryRun @cri
  Scenario Outline: Verify if the counsellor is able to Remove a Product for a Student Essentials Lead
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Click on Add icon
    When user Enter details on the Category field as <Category>
    And Enter the source <source>
    And Enter Qualification Level <Level>
    #And Enter Would like to Study In Field <country>
    When User save the Qualification details successsfully <testCaseNo>
    And user naviga to "STUDENT ESSENTIAL" tab
    And User clicks on the Add SE button
    And user clicks on the Product Category ID Lookup
    And user search for the "china" package and select the package from the list
    Then User clicks on the Product lookup field
    And Select the Produc from the list
    And User add the Product to SE record
    Then save the SE successfully
    And Remove the Products
    Then save the SE successfully

    Examples: 
      | source | Level  | country | testCaseNo | Category |
      | SES-03 | SES-03 | SES-03  | SES-03     | SES-03   |

  @critical @SE_CR @TestDryRun @cri
  Scenario Outline: Ensure the field validation on creation of new Lead in Student Essential
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And Click on Lead Add icon
    When user Enter details on the Category field as <Category>
    And user click on Save and Open
    Then IDP Office mandatory field error message should be display as "Save rejected because field (IDP Office) is defined as mandatory by key user."
    #And I Would Like to Study In mandatory field error message should be display as "Save rejected because field (I Would Like to Study In) is defined as mandatory by key user."
    And IDP Team mandatory field error message should be display as "Save rejected because field (IDP Team) is defined as mandatory by key user."
    And Source mandatory field error message should be display as "Save rejected because field (Source) is defined as mandatory by key user."
    And IDP Owner mandatory field error message should be display as "Save rejected because field (IDP Owner) is defined as mandatory by key user."
    And Qualification Level mandatory field error message should be display as "Save rejected because field (Qualification Level) is defined as mandatory by key user."

    Examples: 
      | Category |
      | SES-03   |
