
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  @testScenario
 Scenario Outline: Verify when the IC and Lead Details in Student360
    Given User login to the application as "Counsellor" in "UAT"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record "DC-35471"
