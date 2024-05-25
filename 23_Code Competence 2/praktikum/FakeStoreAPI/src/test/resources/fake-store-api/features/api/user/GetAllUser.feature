Feature: Get all users
  As a Admin
  I want to get all users information
  So that I can access information about all users in the system

  Scenario: As a Admin I want to get all users
    Given I set the API endpoint to retrieve all users data
    When I send a request to retrieve all users data
    And I should receive a status code of 200
    Then I should receive all users data

  Scenario: As a Admin I want to get all users with unauthorized access
    Given I set the API endpoint to retrieve all users data
    When I send a request to retrieve all users data with unauthorized access
    Then I should receive a status code of 400
    And I should receive an unauthorized error message