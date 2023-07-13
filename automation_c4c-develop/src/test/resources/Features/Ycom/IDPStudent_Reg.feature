Feature: Do an enquiry from idp.com and verify the data flow to C4C for New student enquir (Verify the integration flow for New Student enquiry)

  @IDPREG @critical
  Scenario Outline: Register to the Application and submit for the student Enquiry
    Given User Launch the IDP.com url
    Then User should Register to the Application
    And User submit student Enquiry after Register <studylevel> and <course>

    Examples: 
      | studylevel    | course           |
      | Undergraduate | Computer science |

  @IDPREG @critical
  Scenario: Verify if a new IC and a Course enquiry Lead is created in c4c
    Given User login to the application as "Counsellor" in "UAT"
    And Search for IDP registered student from Global Search
    And Select the student record on global search result
    And Verify the new IC is created
    And Navigate to lead tab
    Then verify the Lead should be created from IDP Website "Course Enquiry"

  @IDPREG @critical
  Scenario Outline: Register as the existing student
    Given User navigate to the IDP Website Login screen
    Given User login to the idp website
    And User submit for the student Enquiry <studylevel> and <course>

    Examples: 
      | studylevel   | course            |
      | Postgraduate | Computer Graphics |

  @IDPREG @critical
  Scenario: Verify the Course enquiry Lead is created for the existing student
     Given User login to the application as "Counsellor" in "UAT"
    And Search for IDP registered student from Global Search
    And Select the student record on global search result
    And Navigate to lead tab
    Then verify the Lead should be created from IDP Website for existing Student

  @IDPREG @IDPREGanonymous @critical
  Scenario Outline: Register as the anonymous user
    Given User navigate to the IDP Website Login screen
    And User switch to English Language
    And Submit student Enquiry for anonymous user <studylevel> and <course>

    Examples: 
      | studylevel   | course            |
      | Postgraduate | Computer Graphics |

  @IDPREG @IDPREGanonymous @critical
  Scenario: Verify if a new IC and a Course enquiry Lead is created in c4c upon Register as the anonymous user
    Given User login to the application as "Counsellor" in "UAT"
    And Search for IDP registered student from Global Search
    And Select the student record on global search result
    And Navigate to lead tab
    Then verify the Lead should be created from IDP Website "Course Enquiry"
