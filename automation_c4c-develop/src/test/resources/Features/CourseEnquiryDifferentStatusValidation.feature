Feature: Course enquiry different status validation

  @critical @differentstatusvalidation @TestDryRun @cri
  Scenario Outline: Change the Non IDP Client Institution Program Lead to an Opportunity
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <TestCaseNo>
    Then Click on IC edit button
    #And click more button
    #And Update the Date of Birth field <dob>
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
    And User conver the lead to opportunity
    And Navigate to Lead overview page from the Opportunity Tab
    And user navigate to the Lead page overViewPage

    #And verify the status is changed to Converted in Lead Overview page
    Examples: 
      | source   | Level    | I Would Like to Study In | testCaseNo | TestCaseNo | nationality | gender | dob        | NonidpClientID |
      | DC-29609 | DC-29609 | DC-29609                 | DC-29609   | DC-35471   | Andorra     | Male   | 2002-07-04 | DC-35471       |


  @differentstatusvalidation1 @TestDryRun @cri
  Scenario: Open an Opportunity and verify the Tabs and options in Opportunity page
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing Individual customer
    Then The relevant Individual customer details should land in overview section
    And Navigate to Opportunities tab
    And Filter the Opportunity based on "Course Enquiry"
    And User select the existing Opportunity record
    Then user verify the Tabs and options in Opportunity page for Course Enquiry


  @critical @differentstatusvalidation @TestDryRun @cri
  Scenario Outline: Change the Application Stage to Submitted To Institution Non IDP Direct Application
    Given User login to the application as "Counsellor" in "TRAIN"
    When Switch to Opportunity Page
    Then Search for opportunity ID
    And Select the first record from the opportunity list
    And User verify the converted lead in overview page
    Then click on opportunity Edit icon
    And Change the application stage to <Stage>
    And Enter the Institution Preference as <Preference>
    And Enter the Submission Method as <Method>
    And Enter the Service Level as <ServiceLevel>
    #And Enter the offer Received Date as <Date>
    Then Click on save button to save Opportunity Edit details
    And Verify the Application Status got Updated to "Application Submitted"

    Examples: 
      | Qualification | Stage    | Preference | Method   | ServiceLevel | Date     | NonidpClientID | TestCaseNo | His      |
      | DC-35471      | DC-35472 | DC-35472   | DC-35472 | DC-35472     | DC-35472 | DC-35471       | DC-35471   | DC-29321 |


  @critical @differentstatusvalidation @TestDryRun @cri
  Scenario Outline: Change the Application Stage to Offer Received
    Given User login to the application as "Counsellor" in "TRAIN"
    When Switch to Opportunity Page
    Then Search for opportunity ID
    And Select the first record from the opportunity list
    And User verify the converted lead in overview page
    Then click on opportunity Edit icon
    And Change the application stage to <Stage>
    And Enter the Institution Preference as <Preference>
    And Enter the Submission Method as <Method>
    And Enter the Service Level as <ServiceLevel>
    And Enter the offer Received Date as <Date>
    Then Click on save button to save Opportunity Edit details
    And Verify the Application Status got Updated to "Offer Received"

    Examples: 
      | Qualification | Stage    | Preference | Method   | ServiceLevel | Date     | NonidpClientID | TestCaseNo | His      |
      | DC-35471      | DC-35471 | DC-35472   | DC-35472 | DC-35472     | DC-35472 | DC-35471       | DC-35471   | DC-29321 |

  @critical @differentstatusvalidation @TestDryRun @cri
  Scenario Outline: Update Main Offer Item details fields and Status to Accepted
    Given User login to the application as "Counsellor" in "TRAIN"
    When Switch to Opportunity Page
    Then Search for opportunity ID
    And Select the first record from the opportunity list
    And User verify the converted lead in overview page
    Then click on opportunity Edit icon
    And Navigate to Course Selection
    And Enter Details in Course Selection page <courseSelection>
    Then Click on save button to save Opportunity Edit details
    And Verify the message should be display as "Your entries have been saved."

    Examples: 
      | courseSelection |
      | DC-29613        |

  @critical @differentstatusvalidation @TestDryRun @cri
  Scenario Outline: Change the Application Stage to Withdrawn
    Given User login to the application as "Counsellor" in "TRAIN"
    When Switch to Opportunity Page
    Then Search for opportunity ID
    And Select the first record from the opportunity list
    And User verify the converted lead in overview page
    Then click on opportunity Edit icon
    And Change the application stage to <Stage>
    And Enter the Reason for Withdrawn <reason>
    And Enter the Institution Preference as <Preference>
    And Enter the Submission Method as <Method>
    And Enter the Service Level as <ServiceLevel>
    #And Enter the offer Received Date as <Date>
    Then Click on save button to save Opportunity Edit details
    And Verify the Application Status got Updated to "Withdrawn"

    Examples: 
      | Qualification | Stage    | reason   | Preference | Method   | ServiceLevel | Date     | NonidpClientID | TestCaseNo | His      |
      | DC-35471      | DC-29616 | DC-29616 | DC-29616   | DC-29616 | DC-29616     | DC-35472 | DC-35471       | DC-35471   | DC-29321 |

  @critical @differentstatusvalidation @TestDryRun @cri
  Scenario Outline: Finalise opportunity providing Visa required as yes and Visa submitted date blank
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
    # And Change the application stage to <Stage>
    And Change the application stage as Offer Accepted by Student
    And Enter the Institution Preference as <Preference>
    And Enter the Submission Method as <Method>
    And Enter the Service Level as <ServiceLevel>
    And Enter the offer Received Date as <Date>
    And Navigate to Course Selection
    And Enter Details in Course Selection page <courseSelection>
    And Navigate to Visa Details
    And Enter Details in Visa Details page
    And Navigate to the Documents Section and Upload the Document based on size <Size>
    And categories attachment in Documents Section
    And Finalise the Opportunity
    Then Click on save button to save Opportunity Edit details
    And navigate to Opportunity Overview page
    Then click on opportunity Edit icon
    And Verify the application status got changed to Finalised

    Examples: 
      | Qualification | Stage    | Preference | Method   | ServiceLevel | Date     | NonidpClientID | TestCaseNo | His      | courseSelection | Size     |
      | DC-35471      | DC-35472 | DC-35472   | DC-35472 | DC-35472     | DC-35472 | DC-35471       | DC-35471   | DC-29321 | DC-35471        | DC-35471 |
  
  
    #@critical
    #Scenario Outline: Change the Application Stage to Submitted To Institution Non IDP Direct Application
    #Given User Login to C4C as a counsellor
    #And Navigate to Individual Customers Page
    #And User navigate to IC record creation page
    #And User create new Individual Customers record successfully <TestCaseNo>
    #And user navigate to History page
    #And click on edit Icon and create English prefernece Details <TestCaseNo>
    #And Navigate to lead tab
    #And user select lead on table
    #Then create the Qualification <TestCaseNo>
    #And add the Non IDPClient Course <NonidpClientID>
    #And User conver the lead to opportunity
    #And User verify the converted lead in overview page
    #Then click on opportunity Edit icon
    #And Change the application stage to <Stage>
    #And Enter the Institution Preference as <Preference>
    #And Enter the Submission Method as <Method>
    #And Enter the Service Level as <ServiceLevel>
    #And Enter the offer Received Date as <Date>
    #Then Click on save button to save Opportunity Edit details
    #
    #Examples: 
      #| Stage    | Preference | Method   | ServiceLevel | Size     | TestCaseNo | courseSelection | Date     | NonidpClientID |
      #| DC-35471 | DC-35471   | DC-35471 | DC-35471     | DC-35471 | DC-35471   | DC-35471        | DC-35471 | DC-35472       |
