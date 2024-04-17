Feature : Sepulsa Select Product
  As a user
  I want to Select Product
  So that I can continue payment

  Scenario: Positive Product Selection
    Given I has successfully logged in to their Sepulsa account
    When I selects a product category
    And I selects a specific product
    Then the system should display a summary page with the selected product details
    And I should be able to proceed to the payment step

  Scenario: Negative Product Selection
    Given I has successfully logged in to their Sepulsa account
    When I tries to select a product category that is not available
    Then the system should display an error message indicating that the product category is not found
    And I should not be able to proceed to select other products



