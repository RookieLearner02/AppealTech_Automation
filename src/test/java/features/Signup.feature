Feature: New user joining the EzMed AppealTech platform

  @SignupUser
  Scenario Outline: Create a new user in the EzMed AppealTech platform
    Given user is in the signup page
    When user is able to add the firstname in First Name field
    And enter the <FirstName>
    When user is able to add the lastname in the Last Name field
    And enter the <LastName>
    When user is able to add the email in the Email field
    And enter the <Email>
    When user is able to add the phone number in the Phone Number field
    And enter the <PhoneNumber>
    When user is able to add the password in the Password field
    And enter the <Password>
    When user is able to add the same password in the Confirm Password field
    And enter the <ConfirmPassword>
    Then user proceeds to click the signup button
    And user confirm the details

    Examples:
      | FirstName  | LastName | Email | PhoneNumber | Password | ConfirmPassword |
      | Srisha B | Joshi | email@template.com | 9500050000 | Test@123 | Test@1234 |