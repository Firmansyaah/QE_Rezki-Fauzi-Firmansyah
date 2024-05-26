Feature: Login
    As a user
    I want to login
    So that I can using all the feature

    Scenario: As a user I can login with valid credentials
        Given I am on the landing page
        When I click sign in button on the landing page
        And I am on the login page
        And I input valid email
        And I input valid password
        And I click login button
        And I see loading system to verify
        Then I see a confirmation message for successful login

    Scenario: As a user I cannot login with invalid credentials
        Given I am on the landing page
        When I click sign in button on the landing page
        And I am on the login page
        And I input invalid email
        And I input invalid password
        And I click login button
        And I see loading system to verify
