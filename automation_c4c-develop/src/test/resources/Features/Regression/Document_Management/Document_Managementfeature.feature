Feature: Verify upload document with image/pdf with student comments via IDP Live App

  @regression @DMSF
  Scenario Outline: Verify upload document with image/pdf and select the document categrory
    as other than Passport or IELTS by counsellor in the Document Management tab

    #Given User Login to C4C as a counsellor in UAT
    Given User login to the application as "Counsellor" in "UAT"
    When Navigate to Individual Customer Page
    And User navigate to IC record creation page
    And User create new Individual Customers record successfully <TestCaseNo>
    #-------------------------------------------------
    And Switch to history tab
    And click on edit Icon and create English prefernece Details <TestCaseNo>
    And Navigate to lead tab
    And user select lead on table
    Then create the Qualification <TestCaseNo>
    And add the course
    And User conver the lead to opportunity
    And Navigate to Individual Customers Page
    Then IC page Should display the list of individual customers in the tabular format successfully
    When User Open an existing Individual customer
    #----------------
    And Navigate to document management tab
    And Upload document on Document management <docname>
    And Select the category and document type as <category> and <documentType>
    And User click on the Confirm and Upload
    Then User verify the status is Verified
    And User Navigate into the Histrocial Document tab
    And Verified document should displayed

    Examples: 
      | docname             | category | documentType                              | status   | TestCaseNo | courseSelection |
      | AcademicTranscripts | Academic | Academic Transcripts or Course Completion | Verified | DC-35471   | DC-35471        |

  @regression @DMSF2
  Scenario Outline: Verify document is attached  against opportunity once it is verified.
    Given User login to the application as "Counsellor" in "UAT"
    When Navigate to Individual Customer Page
    And Search for a record using studentID
    #When User Open an existing Individual customer
    Then Select first record from table
    And Navigate to document management tab
    And Upload document on Document management <docname>
    And Select the category and document type as <category> and <documentType>
    And User click on the Confirm and Upload
    Then User verify the status is Verified
    And User Switch to Opportunity Page
    Then User Open the Opportunity
    And Navigate to Documnet Tab
    Then user move to available to attach section
    And Verified document should displayed in Document Tab

    Examples: 
      | testcaseNo | docname             | category | documentType                              |
      |   50248905 | AcademicTranscripts | Academic | Academic Transcripts or Course Completion |

  @regression @DMSF
  Scenario Outline: Verify by uploading passport document with firstname, lastname, Date of birth,
    Nationality and other details via Document management tab

    Given User login to the application as "Counsellor" in "UAT"
    When Navigate to Individual Customer Page
    And Search for a record using studentID
    #When User Open an existing Individual customer
    Then Select first record from table
    And Navigate to document management tab
    And Upload document on Document management <docname>
    And Select the category and document type as <category> and <documentType>
    And User click on the Confirm and Upload
    And User click on review SignOff button
    And User Enter the expiry Date
    Then User click on DMS next button
    And Click on the Verified option from the Decision picklist
    Then User clicks on Confirm Send Button
    And User verify the document reviewed successfully
    Then User verify the status is Verified
    And User Navigate into the Histrocial Document tab
    And Verified document should displayed

    Examples: 
      | testcaseNo | docname  | category           | documentType | status   |
      |   50248905 | Passport | Personal documents | Passport     | Verified |

  @regression @DMSF
  Scenario Outline: Verify Dowload functionality.
    Given User login to the application as "Counsellor" in "UAT"
    When Navigate to Individual Customer Page
    And Search for a record using studentID
    Then Select first record from table
    And Navigate to document management tab
    And User click on review SignOff button
    Then User select the uploaded file
    And User clicks on the Dowload icon in review SignOff page

    Examples: 
      | testcaseNo | docname1 | category           | documentType |
      |   50248905 | Passport | Personal documents | Passport     |

  @regression @DMSF
  Scenario Outline: Verify delete functionality.
    Given User login to the application as "Counsellor" in "UAT"
    When Navigate to Individual Customer Page
    And Search for a record using studentID
    Then Select first record from table
    And Navigate to document management tab
    And User click on review SignOff button
    Then User select the uploaded file
    And User clicks on the delete icon in review SignOff page

    Examples: 
      | testcaseNo | docname1 | category           | documentType | status   |
      |   50248905 | Passport | Personal documents | Passport     | Verified |

  @regression @DMSF
  Scenario Outline: Verify IELTS extract data are displayed. and Verify autoverification functionality
    Given User login to the application as "Counsellor" in "UAT"
    When Navigate to Individual Customer Page
    And Search for a record using studentID
    Then Select first record from table
    And Navigate to document management tab
    And Upload document on Document management <docname>
    And Select the category and document type as <category> and <documentType>
    And User click on the Confirm and Upload
    And User click on review SignOff button
    Then Verify the extract data are displayed for IELTS extract

    Examples: 
      | testcaseNo | docname   | category     | documentType               |
      |   50248905 | IELTSTEST | Test Results | English Test Results IELTS |

  @regression @DMSF
  Scenario Outline: Verify Passport extract data are displayed. and Verify autoverification functionality
    Given User login to the application as "Counsellor" in "UAT"
    When Navigate to Individual Customer Page
    And Search for a record using studentID
    Then Select first record from table
    And Navigate to document management tab
    And Upload document on Document management <docname>
    And Select the category and document type as <category> and <documentType>
    And User click on the Confirm and Upload
    And User click on review SignOff button
    Then Verify the extract data are displayed for Passport extract

    Examples: 
      | testcaseNo | docname  | category           | documentType |
      |   50248905 | Passport | Personal documents | Passport     |

  @regression @DMSF
  Scenario Outline: Verify the merged file
    Given User login to the application as "Counsellor" in "UAT"
    When Navigate to Individual Customer Page
    And Search for a record using studentID
    Then Select first record from table
    And Navigate to document management tab
    And Upload document on Document management <docname>
    Then Group the selected Document
    And Select the category and document type as <category> and <documentType>
    And User click on the Confirm and Upload
    And User click on review SignOff button
    And User Enter the expiry Date
    Then User click on DMS next button
    And Click on the Verified option from the Decision picklist
    Then User clicks on Confirm Send Button
    And Verify the document successfully reviewed

    Examples: 
      | testcaseNo | docname                          | category           | documentType |
      |   50181859 | "Passport" "AcademicTranscripts" | Personal documents | Passport     |
