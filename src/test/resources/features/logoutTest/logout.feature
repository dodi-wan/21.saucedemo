Feature: Logout Automation

  @logout
  Scenario: login then logout
    Given url sauce demo
    And input "standard_user" and "secret_sauce"
    Then click button login
    And verify on homepage
    When click menu
    And click logout button
