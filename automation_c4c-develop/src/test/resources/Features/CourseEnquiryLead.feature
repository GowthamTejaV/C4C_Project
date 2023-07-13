Feature: Course Enquiry Lead

  @critical @CEL @TestDryRun @cri
  Scenario Outline: Enure the counsellor is able to create a new Course Enquiry Cold,Hot,Warm,Unqualified lead for existing customer in C4C from IC facet

    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
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


  #@critical @CEL
  #Scenario Outline: Verify the counsellor is able to update the lead details for the existing record
    #Given User login to the application as "Counsellor" in "TRAIN"
    #And Navigate to Individual Customers Page
    #And User navigate to IC record creation page
    #And User create new Individual Customers record successfully <IC>
    #And User navigate to the Lead page
    #When user select lead on table
    #And User should navigate to Qualification Tab
    #And User creates the Qualification details successfully <Qualification>
    #And user navigate to the Lead page overViewPage
    #And User should navigate to Qualification Tab
    #And Now click on the edit button on Qualification Page
    #And update the I would like to study in <StudyIn>
    #And Update the Qualification Level <Qualification>
    #And Update the Study Plan Date <PlanDate>
    #And User click on Qualification tab save button
    #Then Qualification Details should be saved successfully
    #And user navigate to the Lead page overViewPage
    #When user click on student name hyperlink
    #Then user redirect to IC Overview page
    #And User navigate to the Lead page
    #
    #Examples: 
      #| IC       | Qualification | StudyIn  | Qualification | PlanDate |
      #| DC-30338 | DC-30338      | DC-30338 | DC-30338      | DC-30338 |

  @critical @CEL @TestDryRun @cri
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

  @critical @CEL @TestDryRun @cri
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

  @critical @CEL13 @TestDryRun @cri
  Scenario Outline: Verify if the counsellor is able to add course to a Qualified course enquiry Lead with Qualification level Hot and convert to opportunity
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing student360 Individual customer
    And click more button
    Then Click on IC edit button
    And Update the Date of Birth field <dob>
    And Update the Gender <gender>
    And Update the Nationality <nationality>
    Then click on save IC
    And user navigate to History page
    And click on edit Icon and create English prefernece Details <TestCaseNo>
    And Navigate to lead tab
    And Click on Add icon
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter Would like to Study In Field <I Would Like to Study In>
    When User save the Qualification details successsfully <testCaseNo>
    And add the course
    And User conver the lead to opportunity
    And Navigate to Lead overview page from the Opportunity Tab
    And user navigate to the Lead page overViewPage
    And verify the status is changed to Converted in Lead Overview page
    Examples: 
      | source   | Level    | I Would Like to Study In | testCaseNo | TestCaseNo | nationality | gender | dob        | NonidpClientID |
      | DC-29609 | DC-30354 | DC-29609                 | DC-29609   | DC-35471   | Andorra     | Male   | 2002-07-04 | DC-35471       |

   @CEL11 @TestDryRun @cri
  Scenario Outline: Verify if the counsellow is not able to convert Warm Leads
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing student360 Individual customer
    And click more button
    Then Click on IC edit button
    And Update the Date of Birth field <dob>
    And Update the Gender <gender>
    And Update the Nationality <nationality>
    Then click on save IC
    And user navigate to History page
    And click on edit Icon and create English prefernece Details <TestCaseNo>
    And Navigate to lead tab
    And Click on Add icon
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter Would like to Study In Field <I Would Like to Study In>
    When User save the Qualification details successsfully <testCaseNo>
    And add the course
    And the user should not able to conver the lead to opportunity
    Examples: 
      | source   | Level    | I Would Like to Study In | testCaseNo | TestCaseNo | nationality | gender | dob        | NonidpClientID |
      | DC-29609 | DC-30359 | DC-29609                 | DC-29609   | DC-35471   | Andorra     | Male   | 2002-07-04 | DC-35471       |