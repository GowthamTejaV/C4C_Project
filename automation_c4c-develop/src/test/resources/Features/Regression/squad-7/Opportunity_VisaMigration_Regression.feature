Feature: Visa Migration

  @regression @demov
  Scenario Outline: Verify That the user is able to create IC successfully and Check the fields in Creation Page and IC Workspace
     Given User login to the application as "MARA_AGENT" in "UAT" and "<TestCaseNo>"
    When Navigate to Individual Customer Page
    And Click on create icon and select Individual customer
    Then Verify by entering all the mandatory fields
    And Click on save and open button
    Then Save the studentId

    Examples: 
      | TestCaseNo |
      | IC_0001    |

  @regression @demov
  Scenario Outline: Verify that when converting the Lead without Visa Type filled with status HOT ,error is thrown for Mara Agent in AU
    Given User login to the application as "MARA_AGENT" in "UAT" and "<TestCaseNo>"
    Then Click on the profile icon
    And Click on the profile name hyperlink
    And Click on more button from profile
    And Click on edit profile button
    And Select mara agent location as australia
    And Click save button
    When Navigate to Leads Page
    Then Click create new lead button
    And Select the category from dropdown
    And Select the qualification level from dropdown
    And Select the student from student popup
    And Select the source from dropdown
    And Click save and open button
    And Verify if visa type mandatory error displayed

    Examples: 
      | TestCaseNo |
      | Visa_0001  |

  @regression @demov
  Scenario Outline: Verify that when converting the Lead without Visa Type filled with status HOT ,error is not thrown for Mara Agent in India
    Given User login to the application as "MARA_AGENT" in "UAT" and "<TestCaseNo>"
    Then Click on the profile icon
    And Click on the profile name hyperlink
    And Click on more button from profile
    And Click on edit profile button
    And Select mara agent location as india
    And Click save button
    When Navigate to Leads Page
    Then Click create new lead button
    And Select the category from dropdown
    And Select the visa type from dropdown
    And Select the qualification level from dropdown
    And Select the student from student popup
    And Select the source from dropdown
    And Click save and open button
    And Save Lead ID
    And Click on actions button
    And Click on convert to opportunity button
    And Click save and open button
    And Save the opportunity ID

    Examples: 
      | TestCaseNo |
      | Visa_0001  |

  @regression @demov
  Scenario Outline: Verify that the Visa Type value from the Lead is populated to the opportunity and becomes non editable
    Given User login to the application as "MARA_AGENT" in "UAT" and "<TestCaseNo>"
    When Switch to Opportunity Page
    Then Search for opportunity ID
    And Select the first record from the opportunity list
    And Switch to opportunity EVS VISA tab
    Then click on opportunity global Edit icon
    #And Unlock the object
    And Verify visa type fields is non editable
    And Verify that the calendar is displayed for all date fields in the EVS VISA page
    And Veirfy the toggle buttons in the EVS VISA page
    And Verify that date option is available for Date of payment field
    And Verify that the Amount paid field contains a text box

    Examples: 
      | TestCaseNo |
      | Visa_0001  |

  @regression @demov
  Scenario Outline: Verify that the Visa Type value from the Lead is populated to the opportunity and becomes non editable
    Given User login to the application as "MARA_AGENT" in "UAT" and "<TestCaseNo>"
    When Switch to Opportunity Page
    Then Search for opportunity ID
    And Select the first record from the opportunity list
    And Verify the opportunity tabs picklist
    And Switch to opportunity EVS VISA tab
    Then click on opportunity global Edit icon
    And Verify the visa assesment level picklist
    And Verify the visa submission channel picklist
    And Verify the visa application fee picklist
    And Verify the passport issuing country picklist
    And Verify the payment details picklist
    And Verify the visa payment type picklist

    Examples: 
      | TestCaseNo |
      | Visa_0001  |

  @regression @demov
  Scenario Outline: Verify the different status and probability percentage in Visa Opportunity Overview facet
    Given User login to the application as "MARA_AGENT" in "UAT" and "<TestCaseNo>"
    When Switch to Opportunity Page
    Then Search for opportunity ID
    And Select the first record from the opportunity list
    And Verify the application status as application preparation
    Then click on opportunity global Edit icon
    And Change the Application status to Application Submitted
    Then click on opportunity global Edit icon
    And Change the Application status to Withdrawn
    Then click on opportunity global Edit icon
    And Change the Application status to Visa Rejected
    Then click on opportunity global Edit icon
    And Change the Application status to Acknowledged Info Pending
    Then click on opportunity global Edit icon
    And Change the Application status to Review Skills Assess only
    Then click on opportunity global Edit icon
    And Change the Application status to Visa Approved

    Examples: 
      | TestCaseNo |
      | Visa_0001  |

  @regression @demov
  Scenario Outline: Verify that the AU Manager is not able to edit the contents of EVS tab of Visa opportunity
    Given User login to the application as "AU_MANAGER" in "UAT" and "<TestCaseNo>"
    When Switch to Opportunity Page with no listing
    And Change the opportunity list filter to all opportunity
    Then Search for opportunity ID
    And Select the first record from the opportunity list
    And Switch to opportunity EVS VISA tab
    Then click on opportunity global Edit icon
    And Verify visa type fields is non editable

    Examples: 
      | TestCaseNo |
      | Visa_0001  |
