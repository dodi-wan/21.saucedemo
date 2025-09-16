

@test
Feature: Test Automation add product


  Description:
  Positive Test add product
  click product, expected: the result on window can show shop cart 1 with circle red


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login

  @test
  Scenario: Test add to cart
    And click product
    Then see product at shopping cart
