

@test
Feature: filter container product


  Description;
  feature filter product, Expected: can sort filter price product

  @test
  Scenario: Test Filter price low to high
    And input "standard_user" and "secret_sauce"
    Then click button login
    And click filter product
    And click price (low to high)
    Then validate filter price (low to high)

