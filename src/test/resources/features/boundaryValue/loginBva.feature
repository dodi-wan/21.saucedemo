

@test
Feature: Test BVA username and password


  Description:
    boundary value input username minimum 8 character. Expected: message error, input username less 8 character
    boundary value input username max 21 character. Expected: if input username more than 21 character
    message show "performance_glitch_user"

  @test
  Scenario Outline: BVA login username and password
    And input "<Accepted usernames are>" and "<Password for all users>"
    And click button login
    Then validate "<message>"

Examples:
      | Accepted usernames are | Password for all users | message                                                                  |
      | standard_use           | secret_sauce           | Epic sadface: Username and password do not match any user in this service|
      |performance_glitch_userr| secret_sauce           | Epic sadface: Username and password do not match any user in this service|
      | standard_user          | secret_sauc            | Epic sadface: Username and password do not match any user in this service|
      | standard_user          | secret_saucer          | Epic sadface: Username and password do not match any user in this service|
      |                        |                        | Epic sadface: Username is required                                       |
