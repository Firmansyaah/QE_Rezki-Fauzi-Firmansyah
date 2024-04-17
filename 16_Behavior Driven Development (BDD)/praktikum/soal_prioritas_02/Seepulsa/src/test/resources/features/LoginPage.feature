Feature: Sepulsa Login Page
  As a user
  I want to Login
  So that I can access home page

  Scenario: Successful Login with Correct Credentials (Positive)
    Given I opens the Sepulsa login page
    When I enters a valid username and password
    And I clicks the login button
    Then I should successfully login to their account

  Scenario: Login Successfully with Valid Username and Password, and Non-Sensitive Characters (Positive)
    Given I opens the Sepulsa login page
    When I enters a valid username and password, including non-sensitive characters
    And I clicks the login button
    Then I should successfully login to their account

  Scenario: Failed to Login with Wrong Username (Negative)
    Given I opens the Sepulsa login page
    When I enters wrong username
    And I enters correct password
    And I clicks the login button
    Then the system should display an error message that the username entered is invalid

  Scenario: Failed to Login with Wrong Password (Negative)
    Given I opens the Sepulsa login page
    When I enters the correct username
    And I entered wrong password
    And I clicks the login button
    Then the system should display an error message that the password entered is invalid

