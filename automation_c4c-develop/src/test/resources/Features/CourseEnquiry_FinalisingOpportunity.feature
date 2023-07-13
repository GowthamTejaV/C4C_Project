Feature: Course Enquiry Finalising opportunity

  @critical @Finalise @TestDryRun @cri
  Scenario Outline: Verify whether the user can able to finalize an opportunity
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <TestCaseNo>
    And user navigate to History page
    And click on edit Icon and create English prefernece Details <TestCaseNo>
    And Navigate to lead tab
    And user select lead on table
    Then create the Qualification <TestCaseNo>
    And add the Non IDPClient Course <NonidpClientID>
    And User conver the lead to opportunity
    Then click on opportunity Edit icon
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

    #Online
    Examples: 
      | Preference | Method   | ServiceLevel | Date     | Size     | TestCaseNo | courseSelection | NonidpClientID |
      | DC-35471   | DC-35471 | DC-35471     | DC-35471 | DC-35471 | DC-35471   | DC-35471        | DC-35471       |
