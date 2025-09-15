

@test
Feature: filter container product


  Description;
  feature filter product, Expected: can sort filter price product

  @test
  Scenario: Test Filter price high to low
    And input "standard_user" and "secret_sauce"
    Then click button login
    And click filter product
    And click price (high to low)
    Then validate filter price (high to low)
