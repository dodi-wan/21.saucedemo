

@test
Feature: filter container product


  Description;
  feature filter product, Expected: can sort filter alphabet name product


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login


  @test
  Scenario: Test Filter name Z to A
    And click filter product
    And click name (Z to A)
    Then validate filter name Z to A
