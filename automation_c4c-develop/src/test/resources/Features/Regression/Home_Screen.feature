Feature: Home Screen

  @regression @HomScreen
  Scenario: Verify whether the student is able to view the header in the home page
    #Given User Login to C4C as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And Verify whether the student is able to view the header in the home page
    And Verify the header sections are clickable and redirects to the said pages
    Then Click on header sections HamburgerMenu
    And Verify the side menu section is opened successfully
    Then Click on header sections Search button
    And Verify the search menu page is opened successfully
    And Click on search menu close button
    Then Click on header sections productivity button
    And Verify the productivity menu is opened successfully
    Then Click on header sections Notification button
    And Verify the Notification menu is opened successfully
    Then Click on header sections User menu button
    And Verify the User menu is opened successfully

  @regression @HomScreen
  Scenario: Verify the LOGO link in the header section redirects to home screen across the browsed screens of the sites
    #Given User Login to C4C as a counsellor
    Given User login to the application as "Counsellor" in "TRAIN"
    And Navigate to Individual Customers Page
    Then Click on LOGO link in the header section
    And Verify the user should redirects to home screen
    And user navigate to the Accounts tab
    Then Click on LOGO link in the header section
    And Verify the user should redirects to home screen
    And user navigate to the Contacts tab
    Then Click on LOGO link in the header section
    And Verify the user should redirects to home screen
    Then Click on header sections Search button
    And Verify the search menu page is opened successfully
    And Verify all the items are present in the search menu page
    And Verify the Advanced Option is displaying on the search menu page
    And Verify the All Items Option is displaying on the search menu page
    And Verify the All My Items Option is displaying on the search menu page
    And Verify the Search Input Field is displaying on the search menu page
    And Verify the all Categorys Filter option is displaying on the search menu page
    Then Click on allCategorys Filter Option
    And Verify all Categorys options are displaying on the search menu page
    And Click on My Items option is Search Menu page
    Then Verify the Search Result Text message should be displayed
    And Verify No match found message should be displayed
    And Verify the clear button should be displayed
    Then Click on clear button and verify the Search Result text should not be shown
    And Click on search menu close button
    And Verify the user should redirects to home screen
    And user navigate to the Accounts tab
    And user open any one of the accounts
    Then Click on LOGO link in the header section
    And user navigate to the Contacts tab
    And user open any one of the Contacts
    Then Click on LOGO link in the header section
    And Navigate to lead tab from home screen
    Then Click on LOGO link in the header section
    And Click on header sections productivity button
    And Verify all the items in productivity page
    And Click on header sections Notification button
    And Verify the Notification menu is opened successfully
    And Verify all the items in Notification page
    Then Click on header sections User menu button
    And Verify all the items in User menu page
    Then Click on LOGO link in the header section
    Then Click on creat button
    And Verify all the items in create prompt
    And Close the create prompt
    Then Click on personalize button
    And Verify the page should be changed to Edit mode
    Then Click on cancel button in personalize Screen
    Then Click on refresh button
    And Verify the page should be loaded successfully
    Then Click on personalize button
    And Click on add group button
    And Verify the Enter Group Name field is visible
    Then Click on Add Card button
    And Verify Cards prompt is diaplaying
    And Verify all the items are displaying in Cards prompt screen
    Then click on the Reports tab in cards prompt 
    And Verify the user should navigate to the report section
    Then Click on Tools tab in cards prompt
    And Verify the user should navigate to the Tools section
    Then Click on Filters tab in cards prompt
    And Verify the user should navigate to the Filters section
    Then Click on Custom tab in cards prompt
    And Verify the user should navigate to the Custom section
    Then Click on cancel button in personalize Screen
    And User click on Deleted Group button
    And Verify the added group should be deleted
    Then Click on cancel button in personalize Screen
    
    
    
