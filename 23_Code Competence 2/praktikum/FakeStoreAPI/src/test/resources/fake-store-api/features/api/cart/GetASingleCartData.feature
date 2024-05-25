Feature: Get a Single Cart Data
  As a user
  I want to retrieve data for a single cart
  So that I can obtain specific information about the chosen cart data.

  Scenario: Retrieve Single Cart Data Information
    Given I set the API endpoint for a single cart data
    When I send a request to retrieve single cart data
    And I should receive a status code of 200
    Then I should receive a specific single cart data


  Scenario: Attempt to Retrieve Single Cart Data with Invalid Parameters
    Given I set the API endpoint for a single cart data with invalid parameters
    When I send a request to retrieve single cart data with invalid URL
    Then I should receive a status code of 404
    And I should receive an error message