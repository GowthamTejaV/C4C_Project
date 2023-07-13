@tag
Feature: Licensee Role Functionality

  @licenseUser
  Scenario Outline: Verify IC restrictions of Licensee User
    #Given User Login to the Licensee Counsellor
    Given User login to the application as "LICENSEE_COUNSELLOR" in "UAT"
    And Navigate to Licensee Individual Customers Page
    Then Verify user should be able to view only the information of his own country or Office records in list view
    Then Click On Advance Filter Icon
    And Verify the Customer ID field is Displaying for the Licensee Counsellor
    Then Navigate to lead tab from home screen
    And Click On Lead List View Drop-Down button
    Then Verify all the dropdown values in lead list view
    And Navigate to Reports Page
    Then Verify the Reports count "18"
    Then Click On Advance Filter Icon
    And Verify the Reports field is Displaying for the Licensee Counsellor
    Then Navigate to lead tab from home screen
    And Click on Licence Lead Add icon
    And user Enter details on the Category field as <Category>
    And user Enter details on the Studnet ID <StudentID>
    And Enter the source <source>
    And Enter Qualification Level <Level>
    And Enter Would like to Study In Field <I Would Like to Study In>
    And Enter Study Plan Date <Study Plan Date>
    And Enter Study Level I Prefer <Study Level I Prefer>
    And Click On Lead Page Edit
    Then Assign the Lead ownership to any other country users <UserID>
    And Save the Lead Details
    And Verify the IDP Owner is assigned <idpOwnerName>
    #And Filter the Lead based on Lead ID "200216498"
    #And user select lead on leads page table
    #And Click On Lead Page Edit
    #And Click on Add icon
    Examples: 
      | Category | StudentID | source   | Level    | I Would Like to Study In | Study Plan Date | Study Level I Prefer | UserID   | idpOwnerName |
      | DC-30254 | DC-30254  | DC-30254 | DC-30254 | DC-30254                 | DC-30254        | DC-30254             | DC-30254 | DC-30254     |
