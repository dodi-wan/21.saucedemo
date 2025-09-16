

@test
Feature: Automation login negative username and password


  @test
  Scenario Outline: Test login automation use negative username and password
    And input "<Accepted usernames are>" and "<Password for all users>"
    And click button login
    Then validate "<message>"
    Examples:
      | Accepted usernames are | Password for all users | message                                                                   |
      | uzumaki sunarto        | secret_sauce           | Epic sadface: Username and password do not match any user in this service |
      | standard_user          | konoha                 | Epic sadface: Username and password do not match any user in this service |

