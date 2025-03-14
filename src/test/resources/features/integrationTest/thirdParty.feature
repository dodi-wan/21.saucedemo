Feature: Test Automation third party social media

  Scenario: login then logout
    Given url sauce demo
    And input "standard_user" and "secret_sauce"
    Then click button login
    When see logo social media click x-twitter
    And click facebook logo
    Then click linkedin logo