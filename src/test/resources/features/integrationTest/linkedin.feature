

@test
Feature: Integration third party


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login


  @test
  Scenario: Test integration Linkedin homepage
    When click linkedin logo
    Then validate homepage linkedin
