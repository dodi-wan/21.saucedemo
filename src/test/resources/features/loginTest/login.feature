Feature: Login Automation

  @login
  Scenario Outline: login swag labs user credential
    Given url sauce demo
    And input "<Accepted usernames are>" and "<Password for all users>"
    Then click button login
    Examples:
      | Accepted usernames are       | Password for all users     |
      | standard_user                | secret_sauce               |
      | problem_user                 | secret_sauce               |
      | performance_glitch_user      | secret_sauce               |
      | error_user                   | secret_sauce               |
      | visual_user                  | secret_sauce               |


@login
  Scenario: login username has been locked
      Given url sauce demo
      And input "locked_out_user" and "secret_sauce"
      Then click button login
      Given message "Epic sadface: Sorry, this user has been locked out."
