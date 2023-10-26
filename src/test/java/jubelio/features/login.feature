Feature: Login Page Jubelio

  @Positive
  Scenario: Success Login
    Given login page jubelio
    When input correct email
    And input correct password
    And click login button
    Then user in on dashboard page


  @Negative
  Scenario: Login by entering an empty email and password
    Given login page jubelio
    When click login button
    Then Display an error message below the email input
    And Display an error message below the password input

  @Negative
  Scenario: Login by entering an empty email
    Given login page jubelio
    When input correct password
    And click login button
    Then Display an error message below the email input

  @Negative
  Scenario: Login by entering an empty password
    Given login page jubelio
    When input correct email
    And click login button
    Then Display an error message below the password input

  @Negative
  Scenario: Login by entering an invalid email format
    Given login page jubelio
    When input invalid email format
    And input correct password
    And click login button
    Then Display an invalid email error message below the email input

  @Negative
  Scenario: Login by entering an invalid password format
    Given login page jubelio
    When input correct email
    And input invalid password less than six character
    And click login button
    Then Display an invalid password error message below the password input