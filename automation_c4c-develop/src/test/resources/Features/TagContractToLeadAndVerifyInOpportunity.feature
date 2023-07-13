Feature: Tag a Contract to Lead and verify it in the Opportunity

  @critical @TagContractToLead1 @crTl 
  Scenario Outline: Create new Ic,Contract records and tag contract to lead record and observe it in Opportunity
    Given User login to the application as "CONTRACT_USER" in "TRAIN"
    And Use Should be able to log in to C4C as a contract admin user successfully
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <TestNo>
    And user navigate to History page
    And click on edit Icon and create English prefernece Details <TestNo>
    And user navigate to the contract creation page
    And User create new contract record <TestNo>
    And User navigate to the Lead page
    And User tag the Contract to Lead
    Then create the Qualification <TestNo>
    And add the course
    And User conver the lead to opportunity
    Then User Verify the contract ID at the opportunity level
    #----------------------------------------------------------

    Examples: 
      | TestNo   |
      | DC-35471 |
