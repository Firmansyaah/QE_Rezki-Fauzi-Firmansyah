Feature: Retrieve 5 Product Results
  As a user,
  I want to retrieve only 5 product results
  So that I can easily browse through a limited set of products.

  Scenario: Retrieve Product Data with a Limit of 5 Results
    Given I set the API endpoint to fetch user data limited to 5 products
    When I request to fetch user data limited to 5 products
    And I should receive a status code of 200
    Then I should receive valid data containing only 5 products

  Scenario: Retrieve Product Data with Invalid Endpoint
    Given I set an invalid API endpoint to fetch user data
    When I request to fetch user data from invalid endpoint
    Then I should receive a status code of 404
    And I should receive an error message