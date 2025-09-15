

@test
Feature: Integration third party


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login

  @test
  Scenario: Test integration linkedin homepage
    When click linkedin logo
    Then validate homepage linkedin
