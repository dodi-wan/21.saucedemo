

@test
Feature: Test Automation login negative & boundary


  @test
  Scenario Outline: login negative
    And input "<Accepted usernames are>" and "<Password for all users>"
    Then click button login
    Given message "<message>"
    Examples:
      | Accepted usernames are | Password for all users | message                                                                   |
      | uzumaki sunarto        | secret_sauce           | Epic sadface: Username and password do not match any user in this service |
      | standard_user          | konoha                 | Epic sadface: Username and password do not match any user in this service |

