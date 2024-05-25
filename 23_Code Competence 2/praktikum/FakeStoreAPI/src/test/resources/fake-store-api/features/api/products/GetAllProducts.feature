Feature: Get all products
  As a user
  I want to get all data products
  So that I can view full list of the products

  Scenario: As a user I can get all data products
    Given I set the API endpoint to retrieve all data products
    When I send a request to retrieve all data products
    And I should receive a status code of 200
    Then I should receive valid data for all products

  Scenario: As a user I receive an error when sending invalid parameters
    Given I set the API endpoint to retrieve all data products with invalid Endpoint
    When I send a request to retrieve all data products with invalid endpoint
    Then I should receive a status code of 404
    And I should receive an error message