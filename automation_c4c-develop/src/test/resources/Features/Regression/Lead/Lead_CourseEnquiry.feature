Feature: Course Enquiry Lead

  @Regression_CE @Regression
  Scenario Outline: Enure the counsellor is able to create a new Course Enquiry Cold,Hot,Warm,Unqualified lead for existing customer in C4C from IC facet
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User search for existing Individual customer <IC_ID>
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
      | source   | Level    | I Would Like to Study In | testCaseNo | IC_ID    |
      | DC-30328 | DC-30328 | DC-30328                 | DC-30328   | DC-30328 |
      | DC-30329 | DC-30329 | DC-30329                 | DC-30329   | DC-30329 |
      | DC-30330 | DC-30330 | DC-30330                 | DC-30330   | DC-30330 |
      | DC-30331 | DC-30331 | DC-30331                 | DC-30331   | DC-30331 |

  @Regression_CE1 @Regression
  Scenario Outline: Verify the counsellor is able to a Copy an Active Student Essential Lead and create Course enquiry Lead using copy functionality
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And User search for the Lead Category as <Category> Status as <Status> and qualification level as <QualificationLevel> and study plan date as "Next Year"
    And user select lead on leads page table
    And user copy the existing lead record
    Then user Enter details on the Category field "Course Enquiry"
    And Enter study Plan Date <StudyPlanDate>
    And user click lead save and open button

    Examples: 
      | Category | Status   | QualificationLevel | lead ID  | StudyPlanDate | I would like to study |
      | DC-30332 | DC-30332 | DC-30332           | DC-30332 | DC-30332      | DC-30332              |

  @Regression_CE1 @Regression
  Scenario Outline: Verify the counsellor is able to a Copy an Active Visa migration Lead and create Course enquiry Lead using copy functionality
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And User search for the Lead Category as <Category> Status as <Status> and qualification level as <QualificationLevel> and study plan date as "Next Year"
    And user select lead on leads page table
    And user copy the existing lead record
    Then user Enter details on the Category field "Course Enquiry"
    And update the I would like to study in <I would like to study>
    And Enter study Plan Date <StudyPlanDate>
    And user click lead save and open button

    #Then New Student Essentials Lead should be created successfully
    Examples: 
      | Category | Status   | QualificationLevel | lead ID  | StudyPlanDate | I would like to study |
      | DC-30333 | DC-30333 | DC-30333           | DC-30333 | DC-30333      | DC-30333              |

  @Regression_C @Regression
  Scenario Outline: Verify the counsellor is able to a Copy a Converted & Cancel Student Essential AND Visa migration, Lead and create Course enquiry Lead using copy functionality
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And User search for the Lead Category as <Category> Status as <Status> and qualification level as <QualificationLevel> and study plan date as "Next Year"
    And user select lead on leads page table
    And user copy the existing lead record
    Then user Enter details on the Category field "Course Enquiry"
    And update the I would like to study in <I would like to study>
    And Enter study Plan Date <StudyPlanDate>
    And user click lead save and open button

    #Then New Student Essentials Lead should be created successfully
    Examples: 
      | Category | Status   | QualificationLevel | lead ID  | StudyPlanDate | I would like to study |
      | DC-30334 | DC-30334 | DC-30334           | DC-30334 | DC-30334      | DC-30334              |
      | DC-30335 | DC-30335 | DC-30335           | DC-30335 | DC-30335      | DC-30335              |
      | DC-30336 | DC-30336 | DC-30336           | DC-30336 | DC-30336      | DC-30336              |
      | DC-30337 | DC-30337 | DC-30337           | DC-30337 | DC-30337      | DC-30337              |

  @Regression_C @Regression
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
    Then Qualification Details should be saved successfully
    And user navigate to the Lead page overViewPage
    When user click on student name hyperlink
    Then user redirect to IC Overview page
    And User navigate to the Lead page

    Examples: 
      | categoryType | StatusType | I would like to study | StudyPlanDate | Qualification Level | Study Level I Prefer |
      | DC-30338     | DC-30338   | DC-30338              | DC-30338      | DC-30338            | DC-30338             |

  @Regression_C1 @Regression
  Scenario Outline: Verify the counsellor is able to update the IDP Owner detail for the existing Lead record
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <IC>
    And User navigate to the Lead page
    When user select lead on table
    And user clicks on Lead Edit button
    And Update the IDP owner to <IDP_Owner_ID>
    And user click lead save button
    Then Lead records should be updated successfully

    Examples: 
      | IC       | IDP_Owner_ID |
      | DC-30339 | DC-30339     |

  @Regression_CE4 @Regression
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
    And user navigate to the Lead page overViewPage
    When user click on student name hyperlink
    Then user redirect to IC Overview page
    And User navigate to the Lead page

    Examples: 
      | filterqualificationLevel | categoryType | StatusType | I would like to study | StudyPlanDate | Qualification Level | Study Level I Prefer |
      | DC-30341                 | DC-30341     | DC-30341   | DC-30341              | DC-30341      | DC-30341            | DC-30341             |
      | DC-30340                 | DC-30340     | DC-30340   | DC-30340              | DC-30340      | DC-30340            | DC-30340             |
      | DC-30342                 | DC-30342     | DC-30342   | DC-30342              | DC-30342      | DC-30342            | DC-30342             |
      | DC-30343                 | DC-30343     | DC-30343   | DC-30343              | DC-30343      | DC-30343            | DC-30343             |

  @Regression_CE5 @Regression
  Scenario Outline: Verify the counsellor is able to update the qualification level of lead from Unqualified to Hot, Unqualified to Warm, Unqualified to Cold
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And Filter the Lead page records based on the Status <StatusType>
    And Filter the Lead page records based on the category <categoryType>
    And Filter the Lead page records based on the qualification level <filterqualificationLevel>
    And user select lead on leads page table
    And user clicks on Lead Edit button
    Then User should navigate to Qualification Tab
    And update I would like to study in Qualification Tab <I would like to study>
    And Update Study Plan Date in Qualification Tab <StudyPlanDate>
    And Update study Level i Prefer is in Qualification Tab <Study Level I Prefer>
    And Update Qualification Level in Qualification Tab <Qualification Level>
    And User click on Qualification tab save button
    Then Qualification Details should be saved successfully
    And user navigate to the Lead page overViewPage
    When user click on student name hyperlink
    Then user redirect to IC Overview page

    Examples: 
      | filterqualificationLevel | categoryType | StatusType | I would like to study | StudyPlanDate | Qualification Level | Study Level I Prefer |
      | DC-30344                 | DC-30344     | DC-30344   | DC-30344              | DC-30344      | DC-30344            | DC-30344             |
      | DC-30345                 | DC-30345     | DC-30345   | DC-30345              | DC-30345      | DC-30345            | DC-30345             |
      | DC-30346                 | DC-30346     | DC-30346   | DC-30346              | DC-30346      | DC-30346            | DC-30346             |

  @Regression_CE6 @Regression
  Scenario Outline: Verify the counsellor is able to update the Lead status to Cancel
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the Status <StatusType>
    And user select lead on table
    And Click on Edit button in Lead page
    And update the lead status <lead status>
    And enter the reason for cancel <reason for cancel>
    And User click on Qualification tab save button
    Then Qualification Details should be saved successfully
    When user click on student name hyperlink
    Then user redirect to IC Overview page

    Examples: 
      | StatusType | lead status | reason for cancel |
      | DC-30347   | DC-30347    | DC-30347          |

  @Regression_CE7 @Regression
  Scenario Outline: Verify the counsellor is able to update the Lead status to No Response
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the Status <StatusType>
    And user select lead on table
    And Click on Edit button in Lead page
    And update the lead status <lead status>
    And User click on Qualification tab save button
    Then Qualification Details should be saved successfully
    When user click on student name hyperlink
    Then user redirect to IC Overview page

    Examples: 
      | StatusType | lead status |
      | DC-30348   | DC-30348    |

  @Regression_CE8 @Regression
  Scenario Outline: Verify the counsellor is able to update the Lead status to Qualified
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the Status <StatusType>
    And user select lead on table
    And Click on Edit button in Lead page
    And update the lead status <lead status>
    And User click on Qualification tab save button
    Then Qualification Details should be saved successfully
    When user click on student name hyperlink
    Then user redirect to IC Overview page

    Examples: 
      | StatusType | lead status |
      | DC-30349   | DC-30349    |

  @Regression_CE9
  Scenario Outline: Verify the counsellor is able to update details for Cancelled Leads
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the Status <StatusType>
    And user select lead on table
    And Click on Edit button in Lead page

    Examples: 
      | StatusType | lead status |
      | DC-30350   | DC-30350    |

  @Regression_CE10
  Scenario Outline: Verify the counsellor is not able to update details for Converted Leads
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the Status <StatusType>
    And user select lead on table
    And Click on Edit button in Lead page

    Examples: 
      | StatusType | lead status |
      | DC-30351   | DC-30351    |

  @Regression_CE11 @Regression
  Scenario Outline: Ensure the field validation on creation of new Lead in Course enquiry
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And Click on Lead Add icon
    And user click on Save and Open
    Then IDP Office mandatory field error message should be display as "Save rejected because field (IDP Office) is defined as mandatory by key user."
    And I Would Like to Study In mandatory field error message should be display as "Save rejected because field (I Would Like to Study In) is defined as mandatory by key user."
    And IDP Team mandatory field error message should be display as "Save rejected because field (IDP Team) is defined as mandatory by key user."
    And Source mandatory field error message should be display as "Save rejected because field (Source) is defined as mandatory by key user."
    And IDP Owner mandatory field error message should be display as "Save rejected because field (IDP Owner) is defined as mandatory by key user."
    And Qualification Level mandatory field error message should be display as "Save rejected because field (Qualification Level) is defined as mandatory by key user."
    And Enter Qualification Level <Level_Hot>
    And user click on Save and Open
    And Study Plan Date mandatory field error message should be display as "Save rejected because field (Study Plan Date) is defined as mandatory by key user."
    And Study Level I Prefer Is mandatory field error message should be display as "Save rejected because field (Study Level I Prefer Is) is defined as mandatory by key user."
    And Enter Qualification Level <Level_Warm>
    And user click on Save and Open
    And Study Plan Date mandatory field error message should be display as "Save rejected because field (Study Plan Date) is defined as mandatory by key user."
    And Study Level I Prefer Is mandatory field error message should be display as "Save rejected because field (Study Level I Prefer Is) is defined as mandatory by key user."
    And Enter Qualification Level <Level_Cold>
    And user click on Save and Open
    And Study Plan Date mandatory field error message should not be display as "Save rejected because field (Study Plan Date) is defined as mandatory by key user."
    And Study Level I Prefer Is mandatory field error message should not be display as "Save rejected because field (Study Level I Prefer Is) is defined as mandatory by key user."

    Examples: 
      | Level_Hot    | Level_Warm    | Level_Cold    |
      | CE-30352-Hot | CE-30352-Warm | CE-30352-Cold |

  @Regression_CE12 @Regression
  Scenario: Verify the picklist value validation on creation of new Lead in course Enquiry
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to lead tab from home screen
    And Click on Lead Add icon
    Then Click on Qualification Level DropDown and confirm all the picklist values are displayed
    And Click on Category DropDown and confirm all the picklist values are displayed
    And Click on Source DropDown and confirm all the picklist values are displayed
    And Click on I would like to study in DropDown and confirm all the picklist values are displayed

  @Regression_P @Regression
  Scenario Outline: Verify if the counsellor is able to add course to a Qualified course enquiry Lead with Qualification level Hot and convert to opportunity
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
      | DC-30354                 | DC-30354     | DC-30354   |

  @Regression_P @Regression
  Scenario Outline: Verify if the counsellor is able to Remove a course for a course enquiry Lead
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
    And Verify the list of courses should be displayed in the Selected Courses table
    Then User should click on Detele Course Icon for Selected Course
    And Verify the course should be deleted

    Examples: 
      | filterqualificationLevel | categoryType | StatusType |
      | DC-30355                 | DC-30355     | DC-30355   |			
      
      
      
      
  @Regression_P @Regression
  Scenario Outline: Verify if the counsellor is able to Remove a course for a course enquiry Lead
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to lead tab
    And Filter the records based on the Status <StatusType>
    And Filter the records based on the category <categoryType>
    And Filter the records based on the qualification level <filterqualificationLevel>
    And user select lead on table
    And Verify the list of courses should be displayed in the Selected Courses table
    And add the course
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
      | DC-30355                 | DC-30355     | DC-30355   |
      