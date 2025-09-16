

@test
Feature: Test Automation remove add cart product


  Description: Feature add product & remove
  1. can click feature add product, expected: text "Add to cart" will be change "Remove"
  2. can click feature can remove, expected: text "Remove" will be change "Add to cart"


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login


  @test
  Scenario: Remove product cart
    And click product
    Then click remove product
    Then validate has been remove
