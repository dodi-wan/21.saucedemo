

@test
Feature: filter container price product


  Description;
  feature filter product, Expected: can sort filter price product


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login


  @test
  Scenario: Test Filter price low to high
    And click filter product
    And click price (low to high)
    Then validate filter price (low to high)

