Feature: student360

  @Student371 @regression
  Scenario Outline: Verify when the IC and Lead Details in Student360
    Given User login to the application as "Counsellor" in "UAT"
    And Navigate to Individual Customers Page
    And User navigate to IC record creation page
    And User create new Individual Customers record "DC-35471"
    And Navigate to Student360 tab
    Then The Personal Details section should displayed
    And Varidy all the Tab Sections are available in the Engage flow
    And user redirect to IC Overview page
    Then Click on IC edit button
    #And Update the Date of Birth field <dob>
    And Update the Gender <gender>
    And Update the Nationality <nationality>
    And Update the Country Of Birth <cob>
    And Update the Country of Residency <cor>
    Then click on save IC
    #-----------------
    And Navigate to Notes tab
    Then Create the Notes
    And Get the Notes Count
    And Switch to Activities tab
    And Click new appointment button
    And Fill mandatory fields in new appointment page
    And Click on save button
    And Get the Appointment Count
    And Switch to history tab
    Then Click on add education history button
    And fill the all mandatory fields in education history tab
    And click add english proficiency data
    Then click on save history button
    And Get the Education History and Employment Proficiency Count
    And Navigate to lead tab
    And user select lead on table
    Then create the Qualification <TestCaseNo>
    And add the course
    And User conver the lead to opportunity
    Then click on opportunity Edit icon
    And Enter the Institution Preference as <Preference>
    And Enter the Submission Method as <Method>
    And Enter the Service Level as <ServiceLevel>
    Then Click on save button to save Opportunity Edit details
    And Navigate to Visa Details
    And Enter Visa Details <visaDetails>
    Then Click on save button to save Opportunity Edit details
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing student360 Individual customer
    And Navigate to lead tab
    Then Get the Count of Leads
    And Navigate to recommendation engline tab
    And Enter the study level in Recommendation EnginePage <RE>
    And Enter the intake date in RE
    And Enter the subject keyword in RE
    And Enter the destination in RE
    And Enable offer in principles course toggle
    And Click on search filters button in RE
    And Shortlist the Enabled courses from RE
    And Navigate to offer in principles tab
    And Click the edit button in OIP
    And Select the student qualification country
    And Fill all the details from academic admission test section OIP <OIP>
    And Fill all the details from english language admission test section OIP
    And Fill all the details from admission test admission test section OIP
    And Submit student qualification details
    And Click get direction button from OIP course suggestion
    And Select start date for the course choosen
    And accept all the terms and conditions
    And Submit OIP course
    And Get the OIP Status
    #-----------------------------------
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing student360 Individual customer
    #----------------------------------------
    And Navigate to Student360 tab
    Then The Personal Details section should displayed
    And Verify the OIP Status in OFFER IN PRINCIPLE section
    And Verify the Nationality field got updated in Personal Details section
    And Verify the Country of Residency field got updated in Personal Details section
    And Verify the Country Of Birth field got updated in Personal Details section
    And Verify the Total Active Leads count is same as IC Leads count
    And Verify the HOT LEAD Text should be displayed on the course lead Section
    And Verify the Notes count is same as created Notes Count in interaction Section
    And Verify the Appointments count is same as created Notes Count in interaction Section
    And Verify the Education records in EDUCATION HISTORY Section
    And Verify the English proficiency test records in EDUCATION HISTORY Section
    #And Verify the Study level in PREFERENCE Section
    And Verify the Course Favourites section
    #And Verify the Plan to study Date in PREFERENCE Section

    Examples: 
      | Stage    | Preference | Method   | ServiceLevel | OIP      | RE      | TestCaseNo | cor   | cob   | nationality | gender | dob        | level | testCaseNo | Preference | Method   | ServiceLevel | Date     | courseSelection | visaDetails |
      | DC-35472 | DC-35472   | DC-35472 | DC-35472     | OIP_0001 | RE_0002 | DC-35471   | India | India | India       | Male   | 2002-07-04 | Hot   | DC-35453   | DC-35471   | DC-35471 | DC-35471     | DC-35471 | DC-35471        | VISA-13     |

  @Student371 @regression
  Scenario Outline: Verify by submitting the Opportunity
    Given User login to the application as "Counsellor" in "UAT"
    When Switch to Opportunity Page
    Then Search for opportunity ID
    And Select the first record from the opportunity list
    And User verify the converted lead in overview page
    Then click on opportunity Edit icon
    And Change the application stage to <Stage>
    Then Click on save button to save Opportunity Edit details
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing student360 Individual customer
    And Navigate to Student360 tab
    Then The Personal Details section should displayed
    And Verify the stage should be changed to Applied
    

    Examples: 
      | Stage    |
      | DC-35472 |
