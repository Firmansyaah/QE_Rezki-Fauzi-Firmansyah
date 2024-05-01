Feature: Retrieving Post Data by ID
  As a user
  I want to retrieve post data by ID
  So that I can view specific posts

  Scenario: Successfully retrieve post data by ID
    Given  I set API endpoint for get data by ID
    When I send a GET request to get post data by ID 1
    Then I receive a response with status code 200
    And the post data is returned for ID 1

  Scenario: Unable to retrieve post data due to invalid ID
    Given  I set API endpoint for get data by ID
    When I send a GET request to get post data by invalid ID -1
    Then I receive a response with status code 404
