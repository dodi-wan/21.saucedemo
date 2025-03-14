Feature: Test Automation remove add cart product

  Scenario: Remove product cart
    Given url sauce demo
    And input "standard_user" and "secret_sauce"
    Then click button login
    And click product
    Then click remove product
    When see product at shopping cart
