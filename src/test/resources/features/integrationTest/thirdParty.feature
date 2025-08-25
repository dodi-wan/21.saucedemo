

@test
Feature: Test Automation third party social media


  Description;
   social media can through link, Expected: click logo  social media the result window changed social media

  @test
  Scenario: login then logout
    And input "standard_user" and "secret_sauce"
    Then click button login
    When see logo social media click x-twitter
    And click facebook logo
    Then click linkedin logo