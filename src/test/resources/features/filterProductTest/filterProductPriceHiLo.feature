

@test
Feature: filter container price product


  Description;
  feature filter product, Expected: can sort filter price product


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login


  @test
  Scenario: Test Filter price high to low
    And click filter product
    And click price (high to low)
    Then validate filter price (high to low)
