

@test
Feature: filter container product


  Description;
    feature filter product, Expected: can sort filter price product and alphabet name product

  @test
  Scenario: Test Filter name A to Z
    And input "standard_user" and "secret_sauce"
    Then click button login
    And click filter product
    When see new mini window click name (A to Z)
    Then validate filter name
#    And click name (Z to A)
#    And click price (low to high)
#    Then click price (high to low)