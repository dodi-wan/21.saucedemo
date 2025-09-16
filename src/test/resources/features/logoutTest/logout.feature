

@test
Feature: Logout Automation


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login


  @test
  Scenario: login then logout
    When click menu
    And click logout button
    Then Verify already logout
