Feature: Test Automation login negative & boundary


  @login
  Scenario Outline: login negative
    And input "<Accepted usernames are>" and "<Password for all users>"
    Then click button login
    Given message ""
    Examples:
      | Accepted usernames are       | Password for all users     |
      | uzumaki sunarto              | secret_sauce               |
      | standard_user                | konoha                     |


# git init
#git add README.md
#git commit -m "first commit"
#git branch -M main
#git remote add origin https://github.com/dodi-wan/test-cicd-saucedemo-automation.git
#git push -u origin main