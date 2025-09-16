
@test
Feature: Integration third party

  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login

  @test
  Scenario: Test integration Facebook homepage
    And click facebook logo
    Then verify homepage facebook