Feature: Verify whether the user can convert a qualified hot lead into an opportunity

  @critical @coverLead @TestDryRun @cri
  Scenario Outline: Verify if counsellor is able to convert to opportunity
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <TestCaseNo>
    And user navigate to History page
    And click on edit Icon and create English prefernece Details <TestCaseNo>
    And Navigate to lead tab
    And Click on Add icon
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter Would like to Study In Field <I Would Like to Study In>
    When User save the Qualification details successsfully <testCaseNo>
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
      | source   | Level    | I Would Like to Study In | testCaseNo |TestCaseNo|
      | DC-35453 | DC-35453 | DC-35453                 | DC-35453   |DC-35471 |
