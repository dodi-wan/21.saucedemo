

@test
Feature: Test Automation third party social media


  Description;
   social media can through link, Expected: click logo  social media the result window changed social media

  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login


  @test
  Scenario: test Third Party
    When see logo social media click x-twitter
    Then verify homepage twitter
