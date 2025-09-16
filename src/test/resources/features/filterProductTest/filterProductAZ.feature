

@test
Feature: filter container alphabet product


  Description;
    feature filter product, Expected: can sort filter alphabet name product

  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login


  @test
  Scenario: Test Filter name A to Z
    And click filter product
    When see new mini window click name (A to Z)
    Then validate filter name