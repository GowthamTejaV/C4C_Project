Feature: Application for AU (Non IDPD ) Destination

  #@critical @Au
  #Scenario: Open an Opportunity and verify the Tabs and options in Opportunity page
  #Given User login to the application as "Counsellor" in "TRAIN"
  #And Navigate to Individual Customers Page
  #Then IC page Should display the list of individual customers in the tabular format successfully
  #When User Open an existing Individual customer
  #Then The relevant Individual customer details should land in overview section
  #And Navigate to Opportunities tab
  #And Filter the Opportunity based on "Course Enquiry"
  #And User select the existing Opportunity record
  #Then user verify the Tabs and options in Opportunity page for Course Enquiry
  
  
  @critical @cri @AuTest
  Scenario Outline: Change the Application Stage to Submitted To Institution Non IDP Direct Application
  
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <TestCaseNo>
    And user navigate to History page
    And click on edit Icon and create English prefernece Details <TestCaseNo>
    And Navigate to lead tab
    And user select lead on table
    Then create the Qualification <Qualification>
    And add the Non IDPClient Course <NonidpClientID>
    And User conver the lead to opportunity
    And User verify the converted lead in overview page
    Then click on opportunity Edit icon
    And Change the application stage to <Stage>
    And Enter the Institution Preference as <Preference>
    And Enter the Submission Method as <Method>
    And Enter the Service Level as <ServiceLevel>
    #And Enter the offer Received Date as <Date>
    Then Click on save button to save Opportunity Edit details

    Examples: 
      | Qualification | Stage    | Preference | Method   | ServiceLevel | Date     | NonidpClientID | TestCaseNo | His      |
      | DC-35471      | DC-35472 | DC-35472   | DC-35472 | DC-35472     | DC-35472 | DC-35471       | DC-35471   | DC-29321 |

  @critical @cri1 @AuTest
  Scenario Outline: Change the Application Stage to Offer Received
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <TestCaseNo>
    And user navigate to History page
    And click on edit Icon and create English prefernece Details <TestCaseNo>
    And Navigate to lead tab
    And user select lead on table
    Then create the Qualification <Qualification>
    And add the Non IDPClient Course <NonidpClientID>
    And User conver the lead to opportunity
    And User verify the converted lead in overview page
    Then click on opportunity Edit icon
    And Change the application stage to <Stage>
    And Enter the Institution Preference as <Preference>
    And Enter the offer Received Date as <Date>
    And Enter the Submission Method as <Method>
    And Enter the Service Level as <ServiceLevel>
    Then Click on save button to save Opportunity Edit details
    Then click on opportunity Edit icon
    And verfiy Probability fields got updated to "60"
    And verfiy Opportunity Status fields got updated to "In Progress"

    Examples: 
      | Qualification | Stage    | Preference | Method   | ServiceLevel | Date     | NonidpClientID | TestCaseNo | His      |
      | DC-35471      | DC-35471 | DC-35472   | DC-35472 | DC-35472     | DC-35472 | DC-35471       | DC-35471   | DC-29321 |

  @critical @AuTest @TestDryRun @cri12
  Scenario Outline: Verify whether the user is able to add an AU course (non-IDPD) in the lead and convert the lead in to the opportunity
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
    And add the Non IDPClient Course <NonidpClientID>
    And User clicks on Actions button
    Then click on Convert to Opportunity button
    And Opportunity convertion page should be displayed Name of the Lead
    And Opportunity convertion page should be displayed Name of the IC
    And Opportunity convertion page should be displayed Name of the IDP Owner
    And Opportunity convertion page should be displayed Name of the Institution
    And Select the institution from the dropdown and click on Save and Open
    And Navigate to Lead overview page from the Opportunity Tab
    And user navigate to the Lead page overViewPage

    #And verify the status is changed to Converted in Lead Overview page
    Examples: 
      | source  | Level   | I Would Like to Study In | testCaseNo | TestCaseNo | nationality | gender | dob        | NonidpClientID |
      | AU-TC01 | AU-TC01 | AU-TC01                  | AU-TC01    | DC-35471   | Andorra     | Male   | 2002-07-04 | DC-35471       |
