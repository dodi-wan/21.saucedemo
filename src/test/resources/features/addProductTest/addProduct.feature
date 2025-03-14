Feature: Test Automation add product

  Scenario: add to cart
    Given url sauce demo
    And input "standard_user" and "secret_sauce"
    Then click button login
    And click product
    When see product at shopping cart
