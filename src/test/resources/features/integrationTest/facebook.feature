
@test
Feature: Integration third party


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login

  @test
  Scenario: Test integration facebook homepage
    And click facebook logo
    Then verify homepage facebook