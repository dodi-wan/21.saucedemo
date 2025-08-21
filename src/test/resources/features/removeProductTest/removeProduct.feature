Feature: Test Automation remove add cart product


  Description: Feature add product & remove
  1. can click feature add product, expected: text "Add to cart" will be change "Remove"
  2. can click feature can remove, expected: text "Remove" will be change "Add to cart"

  Scenario: Remove product cart
    And input "standard_user" and "secret_sauce"
    Then click button login
    And click product
    Then click remove product
    When see product at shopping cart
