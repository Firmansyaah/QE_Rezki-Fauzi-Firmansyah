Feature: LinkedIn Home Page
As a user
I want to Home Page
So that I can  access the features


  Scenario: Viewing the LinkedIn home page (Positive)
    Given I am a logged-in user of LinkedIn
    When I navigate to the LinkedIn home page
    Then I should see the home page with the latest news and updates from my network

  Scenario: Attempting to view the LinkedIn home page without logging in (Negative)
    Given I am not logged in to LinkedIn
    When I try to navigate to the LinkedIn home page
    Then I should be redirected to the login page

  Scenario: Searching for a job with valid keyword (Positive)
    Given I am a logged-in user of LinkedIn
    When I select the "Job Search" option on the LinkedIn home page
    And I enter a valid job keyword
    And I click the "Search" button
    Then I should see a list of jobs that match my search criteria

  Scenario: Searching for a job with invalid keyword (Negative)
    Given I am a logged-in user of LinkedIn
    When I select the "Job Search" option on the LinkedIn home page
    And I enter an invalid job keyword
    And I click the "Search" button
    Then I should see a message indicating no results found

  Scenario: Searching for contacts with valid information (Positive)
    Given I am a logged-in user of LinkedIn
    When I select the "Search Contacts" option on the LinkedIn home page
    And I enter valid contact information
    And I click the "Search" button
    Then I should see a list of contacts that match my search criteria

  Scenario: Searching for contacts with invalid information (Negative)
    Given I am a logged-in user of LinkedIn
    When I select the "Search Contacts" option on the LinkedIn home page
    And I enter invalid contact information
    And I click the "Search" button
    Then I should see a message indicating no contacts found

  Scenario: Accessing LinkedIn home page with an expired session (Negative)
    Given I am a logged-in user of LinkedIn with an expired session
    When I navigate to the LinkedIn home page
    Then I should be redirected to the login page

  Scenario: Accessing LinkedIn home page with insufficient permissions (Negative)
    Given I am a logged-in user of LinkedIn with insufficient permissions
    When I navigate to the LinkedIn home page
    Then I should see an error message indicating insufficient permissions

  Scenario: Attempting to perform a search without entering any keyword (Negative)
    Given I am a logged-in user of LinkedIn
    When I select the "Job Search" option on the LinkedIn home page
    And I leave the job keyword field empty
    And I click the "Search" button
    Then I should see a message indicating the required field is empty

  Scenario: Attempting to search for contacts with an empty search field (Negative)
    Given I am a logged-in user of LinkedIn
    When I select the "Search Contacts" option on the LinkedIn home page
    And I leave the contact search field empty
    And I click the "Search" button
    Then I should see a message indicating the required field is empty



