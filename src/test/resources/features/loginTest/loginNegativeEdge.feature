

@test
Feature: Test Automation login negative & boundary


  @test
  Scenario Outline: login negative
    And input "<Accepted usernames are>" and "<Password for all users>"
    Then click button login
    Given message ""
    Examples:
      | Accepted usernames are       | Password for all users     |
      | uzumaki sunarto              | secret_sauce               |
      | standard_user                | konoha                     |
