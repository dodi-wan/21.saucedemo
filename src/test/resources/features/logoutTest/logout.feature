Feature: Logout Automation


  Description;
    login on homepage then logout, Expected: success login the window show products then logout and window show
    login menu

  @logout
  Scenario: login then logout
    And input "standard_user" and "secret_sauce"
    Then click button login
    And verify on homepage
    When click menu
    And click logout button
