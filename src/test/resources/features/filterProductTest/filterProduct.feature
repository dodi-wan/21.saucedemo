Feature: Test Automation filter container product

  Scenario: login then logout
    Given url sauce demo
    And input "standard_user" and "secret_sauce"
    Then click button login
    And click filter product
    When see new mini window click name (A to Z)
    And click name (Z to A)
    And click price (low to high)
    Then click price (high to low)