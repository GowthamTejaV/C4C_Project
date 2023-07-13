Feature: Channel partner

  @regression @regCpp
  Scenario: login functionality with valid credentials and Invalid credentials
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    Then SignOut to Channel Partner portel
    And User enter the Invalid credential in the Email and Pasword field and click log on
    Then Login should fail with "Sorry, we could not authenticate you. Try again." Error Message
    And User enter the Invalid EmailID and click log on
    Then Login should fail with "Sorry, we could not authenticate you. Try again." Error Message
    And User enter the Invalid password and click log on
    Then Login should fail with "Sorry, we could not authenticate you. Try again." Error Message

  @regression @regCpp
  Scenario Outline: Verify by Creating students in CPP with Valid data in Submit Student Applications Business Information
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And User Enter Student Application First Name <firstName>
    And User Enter Student Application Last Name <lastname>
    And User Enter Student Application Non English Name <non_English_Name>
    And User Enter Student Application DOB <dob>
    And User Enter Student Application Pre Destination <preDestination>
    And User Enter Student Application email
    And user click on Save button
    Then Vefiry the Students Details gets saved successfully
    And add the new Attachment File
    And Submit Student Application
    Then verify the student Application submited successfully

    Examples: 
      | firstName | lastname | non_English_Name | dob    | preDestination | email  |
      | CPP_05    | CPP_05   | CPP_05           | CPP_05 | CPP_05         | CPP_05 |
      

  @regression @regCpp
  Scenario Outline: Verify by Creating students in CPP with Valid data and invalid Data in Submit Student Applications Business Information
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And User Enter Student Application invalid First Name <InvalidfirstName>
    And User Enter Student Application Last Name <validlastname>
    And User Enter Student Application Non English Name <validnon_English_Name>
    And User Enter Student Application DOB <validdob>
    And User Enter Student Application Pre Destination <validpreDestination>
    And User Enter Student Application email
    And user click on Save button
    And Verify Save should be failed for invalid first name
    And User Enter Student Application First Name <validfirstName>
    And User Enter Student Application invalid Last Name <Invalidlastname>
    And user click on Save button
    And Verify Save should be failed for invalid last name
    And User Enter Student Application Last Name <validlastname>
    And User Enter Student Application future DOB <futureDOB>
    And user click on Save button
    And Verify the '"Date cannot be in the future"' error message should be displayed for Future DOB
    And User Enter Student Application DOB <validdob>
    And User Enter Student Application as invalid Pre Destination <invalidpreDestination>
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed for invalid preDestination
    And User Enter Student Application Pre Destination <validpreDestination>
    And User Enter Student Application invalid email <invalidemail>
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed for invalid email

    Examples: 
      | validpreDestination | validdob | validnon_English_Name | validlastname | validfirstName | futureDOB | Invalidlastname | InvalidfirstName | invalidpreDestination | invalidemail |
      | CPP_05              | CPP_05   | CPP_05                | CPP_05        | CPP_05         | CPP_06    | CPP_06          | CPP_06           | CPP_06                | CPP_06       |

  @regression @regCpp
  Scenario Outline: Verify by leaving all the fields NULL in the Business Information facet and click on save button
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And user click on Save button

  @regression @regCpp
  Scenario Outline: Verify the fields validation by NULL value in Submit Student Applications Business Information and click on save button
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And User Enter Student Application Last Name <validlastname>
    And User Enter Student Application Non English Name <validnon_English_Name>
    And User Enter Student Application DOB <validdob>
    And User Enter Student Application Pre Destination <validpreDestination>
    And User Enter Student Application email
    And Enter NULL Value in the First Name field
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Student Application First Name <validfirstName>
    And User Enter Student Application Non English Name <validnon_English_Name>
    And User Enter Student Application DOB <validdob>
    And User Enter Student Application Pre Destination <validpreDestination>
    And Enter NULL Value in the Last Name field
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Student Application First Name <validfirstName>
    And User Enter Student Application Last Name <validlastname>
    And User Enter Student Application Non English Name <validnon_English_Name>
    And User Enter Student Application Pre Destination <validpreDestination>
    And Enter NULL Value in the DOB field
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Student Application First Name <validfirstName>
    And User Enter Student Application Last Name <validlastname>
    And User Enter Student Application DOB <validdob>
    And User Enter Student Application Non English Name <validnon_English_Name>
    And Enter NULL Value in the Pre Destination field
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Student Application First Name <validfirstName>
    And User Enter Student Application Last Name <validlastname>
    And User Enter Student Application DOB <validdob>
    And User Enter Student Application Non English Name <validnon_English_Name>
    And User Enter Student Application Pre Destination <validpreDestination>
    And Enter NULL Value in the Email field
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed

    Examples: 
      | validpreDestination | validdob | validnon_English_Name | validlastname | validfirstName |
      | CPP_05              | CPP_05   | CPP_05                | CPP_05        | CPP_05         |

  @regression @regCpp
  Scenario Outline: Verify by entering valid data-> saving the record-> clicking on the Next button and Verifying by clicking the '+' button from Education History table
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And User Enter Student Application First Name <firstName>
    And User Enter Student Application Last Name <lastname>
    And User Enter Student Application Non English Name <non_English_Name>
    And User Enter Student Application DOB <dob>
    And User Enter Student Application Pre Destination <preDestination>
    And User Enter Student Application email
    And user click on Save button
    Then Vefiry the Students Details gets saved successfully
    And click on Next button CPP
    Then Verify the user is redirecting to the Education History Tab page
    And User clicks on create record Icon
    And User Enter Education History Institution Name <institutionName>
    And User Enter Education History Language of Study <languageOfStudy>
    And User Enter Education History Commencement of Study <CommencementOfStudy>
    And User Enter Education History Graduation Date <graduationDate>
    And User Enter Education History Degree Type <degreeType>
    And User Enter Education History Degree Name <degreeName>
    And User Enter Education History Study Mode <studyMode>
    And User Enter Education History Country of Study <countryOfStudy>
    And User Enter Education History Field Of Study <fieldOfStudy>
    And User Enter Education History Grade <Grade>
    And User Enter Education History Status <Status>
    And user click on Save button
    Then Verify the "Data Posted Successfully." popup message should be displayed

    Examples: 
      | firstName | lastname | non_English_Name | dob    | preDestination | email  | Status | Grade  | fieldOfStudy | countryOfStudy | studyMode | institutionName | languageOfStudy | CommencementOfStudy | graduationDate | degreeType | degreeName |
      | CPP_05    | CPP_05   | CPP_05           | CPP_05 | CPP_05         | CPP_05 | CPP_20 | CPP_20 | CPP_20       | CPP_20         | CPP_20    | CPP_20          | CPP_20          | CPP_20              | CPP_20         | CPP_20     | CPP_20     |

 @regression @regCpp
  Scenario Outline: Verify by entering Invalid data in Education History fields and click on the Save button
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And User Enter Student Application First Name <firstName>
    And User Enter Student Application Last Name <lastname>
    And User Enter Student Application Non English Name <non_English_Name>
    And User Enter Student Application DOB <dob>
    And User Enter Student Application Pre Destination <preDestination>
    And User Enter Student Application email
    And user click on Save button
    Then Vefiry the Students Details gets saved successfully
    And click on Next button CPP
    Then Verify the user is redirecting to the Education History Tab page
    And User clicks on create record Icon
    And User Enter Education History Language of Study <languageOfStudy>
    And User Enter Education History Commencement of Study <CommencementOfStudy>
    And User Enter Education History Graduation Date <graduationDate>
    And User Enter Education History Degree Type <degreeType>
    And User Enter Education History Degree Name <degreeName>
    And User Enter Education History Study Mode <studyMode>
    And User Enter Education History Country of Study <countryOfStudy>
    And User Enter Education History Field Of Study <fieldOfStudy>
    And User Enter Education History Grade <Grade>
    And User Enter Education History Status <Status>
    And User Enter the Institution Name field as Null
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Education History Institution Name <institutionName>
    And User Enter Education History Language of Study <InvalidlanguageOfStudy>
    Then User entered Invalid data in the Language of Study
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Education History Language of Study <languageOfStudy>
    And User Enter Education History Commencement of Study <InvalidCommencementOfStudy>
    Then User entered Invalid data in the Commencement of Study
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Education History Commencement of Study <CommencementOfStudy>
    And User Enter Education History Graduation Date <invalidgraduationDate>
    Then User entered Invalid data in the Graduation Date
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Education History Graduation Date <graduationDate>
    And User Enter Education History Commencement of Study <greaterDateCommencement>
    And User Enter Education History Graduation Date <lessergraduationDate>
    Then User entered Commencement of study date greater than Graduation Date
    And user click on Save button
    And Verify the 'Graduation Date should be greater than Commencement Date.' error message should be displayed for Commencement Date

    Examples: 
      | lessergraduationDate | greaterDateCommencement | invalidgraduationDate | InvalidCommencementOfStudy | InvalidlanguageOfStudy | firstName | lastname | non_English_Name | dob    | preDestination | email  | Status | Grade  | fieldOfStudy | countryOfStudy | studyMode | institutionName | languageOfStudy | CommencementOfStudy | graduationDate | degreeType | degreeName |
      | CPP_28               | CPP_28                  | CPP_25                | CPP_24                     | CPP_23                 | CPP_05    | CPP_05   | CPP_05           | CPP_05 | CPP_05         | CPP_05 | CPP_21 | CPP_21 | CPP_21       | CPP_21         | CPP_21    | CPP_21          | CPP_21          | CPP_21              | CPP_21         | CPP_21     | CPP_21     |

  @regression @regCpp
  Scenario Outline: Verify by entering valid data-> saving the record-> clicking on the Next button and Verifying by clicking the '+' button from the Employment History table
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And User Enter Student Application First Name <firstName>
    And User Enter Student Application Last Name <lastname>
    And User Enter Student Application Non English Name <non_English_Name>
    And User Enter Student Application DOB <dob>
    And User Enter Student Application Pre Destination <preDestination>
    And User Enter Student Application email
    And user click on Save button
    Then Vefiry the Students Details gets saved successfully
    And click on Next button CPP
    And click on Next button CPP
    And User clicks on create record Icon in Employement History Tab
    And User Enter Organization Name <OrganizationName>
    And User Enter Occupation Level <OccupationLevel>
    And User Enter Designation <Designation>
    And User Enter Country <Country>
    And User Enter Start Date <startDate>
    And User Enter End Date <endDate>
    And User Enter Description <Description>
    And User Enter Employment Sector <EmploymentSector>
    And User Enter Industry <Industry>
    And User Enter Eng Speaking Workplace <EngSpeakingWorkplace>
    And User Enter Paid Work <PaidWork>
    And User Enter Address <Address>
    And User Enter Part Time <PartTime>
    And User Enter PartTimeHours <PartTimehrs>
    And user click on Save button
    Then Verify the "Data Posted Successfully." popup message should be displayed

    Examples: 
      | PartTimehrs | PartTime | Address | PaidWork | EngSpeakingWorkplace | Industry | EmploymentSector | Description | endDate | startDate | Country | Designation | OccupationLevel | OrganizationName | firstName | lastname | non_English_Name | dob    | preDestination | email  |
      | CPP_44      | CPP_44   | CPP_44  | CPP_44   | CPP_44               | CPP_44   | CPP_44           | CPP_44      | CPP_44  | CPP_44    | CPP_44  | CPP_44      | CPP_44          | CPP_44           | CPP_05    | CPP_05   | CPP_05           | CPP_05 | CPP_05         | CPP_05 |

  @regression @regCpp
  Scenario Outline: Verify by entering NULL in Employment History field and valid data in other fields and click on save button
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And User Enter Student Application First Name <firstName>
    And User Enter Student Application Last Name <lastname>
    And User Enter Student Application Non English Name <non_English_Name>
    And User Enter Student Application DOB <dob>
    And User Enter Student Application Pre Destination <preDestination>
    And User Enter Student Application email
    And user click on Save button
    Then Vefiry the Students Details gets saved successfully
    And click on Next button CPP
    And click on Next button CPP
    And User clicks on create record Icon in Employement History Tab
    And User Enter Organization Name <OrganizationName>
    And User Enter Occupation Level <OccupationLevel>
    And User Enter Designation <Designation>
    And User Enter Country <Country>
    And User Enter Start Date <startDate>
    And User Enter End Date <endDate>
    And User Enter Description <Description>
    And User Enter Employment Sector <EmploymentSector>
    And User Enter Industry <Industry>
    And User Enter Eng Speaking Workplace <EngSpeakingWorkplace>
    And User Enter Paid Work <PaidWork>
    And User Enter Address <Address>
    And User Enter Part Time <PartTime>
    And User Enter PartTimeHours <PartTimehrs>
    And User Enter NULL in Organization Name Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Organization Name <OrganizationName>
    And User Enter NULL in Occupation Level Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Occupation Level <OccupationLevel>
    And User Enter NULL in Country Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Country <Country>
    And User Enter NULL in Start Date Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Start Date <startDate>
    And User Enter NULL in End Date Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter End Date <endDate>
    And User Enter NULL in Description Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Description <Description>
    And User Enter NULL in Employment Sector Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Employment Sector <EmploymentSector>
    And User Enter NULL in Industry Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Industry <Industry>
    And User Enter NULL in Eng Speaking Workplace Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Eng Speaking Workplace <EngSpeakingWorkplace>
    And User Enter NULL in Paid Work Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Paid Work <PaidWork>
    And User Enter NULL in Address Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Address <Address>
    And User Enter NULL in Part Time Field ""
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Part Time <PartTime>
    And User Enter NULL in Partime Hours Field ""
    And user click on Save button
    And '"Specify Partime hours"' Error message popup should be displayed

    Examples: 
      | PartTimehrs | PartTime | Address | PaidWork | EngSpeakingWorkplace | Industry | EmploymentSector | Description | endDate | startDate | Country | Designation | OccupationLevel | OrganizationName | firstName | lastname | non_English_Name | dob    | preDestination | email  |
      | CPP_44      | CPP_44   | CPP_44  | CPP_44   | CPP_44               | CPP_44   | CPP_44           | CPP_44      | CPP_44  | CPP_44    | CPP_44  | CPP_44      | CPP_44          | CPP_44           | CPP_05    | CPP_05   | CPP_05           | CPP_05 | CPP_05         | CPP_05 |

  @regression @regCpp
  Scenario Outline: Verify by Enter Invalid data in Employment History field and valid data in other fields and click on save button
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And User Enter Student Application First Name <firstName>
    And User Enter Student Application Last Name <lastname>
    And User Enter Student Application Non English Name <non_English_Name>
    And User Enter Student Application DOB <dob>
    And User Enter Student Application Pre Destination <preDestination>
    And User Enter Student Application email
    And user click on Save button
    Then Vefiry the Students Details gets saved successfully
    And click on Next button CPP
    And click on Next button CPP
    And User clicks on create record Icon in Employement History Tab
    And User Enter Organization Name <OrganizationName>
    And User Enter Occupation Level <OccupationLevel>
    And User Enter Designation <Designation>
    And User Enter Country <Country>
    And User Enter Start Date <startDate>
    And User Enter End Date <endDate>
    And User Enter Description <Description>
    And User Enter Employment Sector <EmploymentSector>
    And User Enter Industry <Industry>
    And User Enter Eng Speaking Workplace <EngSpeakingWorkplace>
    And User Enter Paid Work <PaidWork>
    And User Enter Address <Address>
    And User Enter Part Time <PartTime>
    And User Enter PartTimeHours <PartTimehrs>
    And User Enter Invalid data in Occupation Level Field "abcdef"
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Occupation Level <OccupationLevel>
    And User Enter Invalid data in Country Field "abcdef"
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Country <Country>
    And User Enter Invalid data in Start Date Field "abcdef"
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Start Date <startDate>
    And User Enter Invalid data in End Date Field "abcdef"
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter End Date <endDate>
    And User Enter Invalid data in Employment Sector Field "abcdef"
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Employment Sector <EmploymentSector>
    And User Enter Invalid data in Industry Field "abcdef"
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Industry <Industry>
    And User Enter Invalid data in Eng Speaking Workplace Field "abcdef"
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Eng Speaking Workplace <EngSpeakingWorkplace>
    And User Enter Invalid data in Paid Work Field "abcdef"
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter Paid Work <PaidWork>
    And User Enter Invalid data in Part Time Field "abcdef"
    And user click on Save button
    And Verify the 'Maintain all required fields.' error message should be displayed
    And Enter Part Time Field "Yes"
    Then Verify whether Part Time Hours field is enabled when Part Time is set as Yes

    Examples: 
      | PartTimehrs | PartTime | Address | PaidWork | EngSpeakingWorkplace | Industry | EmploymentSector | Description | endDate | startDate | Country | Designation | OccupationLevel | OrganizationName | firstName | lastname | non_English_Name | dob    | preDestination | email  |
      | CPP_44      | CPP_44   | CPP_44  | CPP_44   | CPP_44               | CPP_44   | CPP_44           | CPP_44      | CPP_44  | CPP_44    | CPP_44  | CPP_44      | CPP_44          | CPP_44           | CPP_05    | CPP_05   | CPP_05           | CPP_05 | CPP_05         | CPP_05 |

  @regression @regCpp
  Scenario Outline: Verify the Employment History page dropdown field
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And User Enter Student Application First Name <firstName>
    And User Enter Student Application Last Name <lastname>
    And User Enter Student Application Non English Name <non_English_Name>
    And User Enter Student Application DOB <dob>
    And User Enter Student Application Pre Destination <preDestination>
    And User Enter Student Application email
    And user click on Save button
    Then Vefiry the Students Details gets saved successfully
    And click on Next button CPP
    And click on Next button CPP
    And User clicks on create record Icon in Employement History Tab
    Then click on Employment Sector dropdown field
    And Check the Employment Sector field Dropdown variants are available
    Then click on Eng Speaking Workplace dropdown field
    And Check the Eng Speaking Workplace field Dropdown variants are available
    Then click on Paid Work dropdown field
    And Check the Paid Work field Dropdown variants are available
    Then click on Part Time dropdown field
    And Check the Part Time field Dropdown variants are available

    Examples: 
      | firstName | lastname | non_English_Name | dob    | preDestination | email  |
      | CPP_05    | CPP_05   | CPP_05           | CPP_05 | CPP_05         | CPP_05 |

  @regression @regCpp
  Scenario Outline: Attachments tab and Student Overview should be displayed in Verification in Progress Tab
    Given the user Login to Channel Partner as "CPP_USER" in "CPP"
    And Verify Login should be successful by redirecting to the CPP Home page
    And User Click on Submit Student Application tab
    And User Enter Student Application First Name <firstName>
    And User Enter Student Application Last Name <lastname>
    And User Enter Student Application Non English Name <non_English_Name>
    And User Enter Student Application DOB <dob>
    And User Enter Student Application Pre Destination <preDestination>
    And User Enter Student Application email
    And user click on Save button
    Then Vefiry the Students Details gets saved successfully
    And click on Next button CPP
    And click on Next button CPP
    And click on Next button CPP
    And User clicks on create record Icon in Attachments Tab
    Then Verif the Add new record popup should be displayed
    And User Enter NULL in Attachments Name Field ""
    And User Enter NULL in Attachments File Location Field ""
    Then Save the Attachment Record
    And Verify the 'Maintain all required fields.' error message should be displayed
    And User Enter valid data in Attachments Name Field "TestData"
    And User upload the valid document
    Then Save the Attachment Record
    Then Verify the "Data Posted Successfully." popup message should be displayed
    And Submit Student Application
    And Verify Success pop up should be displayed after submit the student application
    And User Click on Verification In Progress tab
    Then click on the Student Name in the Verification in Progress List view page
    And Student Overview should be displayed with Student ID
    And Student Overview should be displayed with Name
    And Student Overview should be displayed with Non English Name
    And Student Overview should be displayed with Created on
    And Student Overview should be displayed with Status
    Examples: 
      | firstName | lastname | non_English_Name | dob    | preDestination | email  |
      | CPP_05    | CPP_05   | CPP_05           | CPP_05 | CPP_05         | CPP_05 |
