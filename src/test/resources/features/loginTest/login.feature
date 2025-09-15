

@test
Feature: Login Automation


  Description;
    Login with credential list on saucedemo; Expected: username standard_user, problem_user, performance_glitch_user,
    error_user, visual_user can login and locked_out_user cannot login

  @test
  Scenario Outline: login swag labs user credential
    Given input "<Accepted usernames are>" and "<Password for all users>"
    And click button login
    Then verify login
    Examples:
      | Accepted usernames are       | Password for all users     |
      | standard_user                | secret_sauce               |
      | problem_user                 | secret_sauce               |
      | performance_glitch_user      | secret_sauce               |
      | error_user                   | secret_sauce               |
      | visual_user                  | secret_sauce               |


  @test
  Scenario: login username has been locked

    Given input "locked_out_user" and "secret_sauce"
    And click button login
    Then message "Epic sadface: Sorry, this user has been locked out."
