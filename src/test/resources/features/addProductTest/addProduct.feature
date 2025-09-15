

@test
Feature: Test Automation add product


  Positive Test add product
  click product, expected: the result on window can show shop cart 1 with circle red

  @test
  Scenario: add to cart
    And input "standard_user" and "secret_sauce"
    Then click button login
    And click product
    Then see product at shopping cart
