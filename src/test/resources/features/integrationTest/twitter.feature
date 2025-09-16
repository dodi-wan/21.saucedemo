

@test
Feature: Test Automation third party social media


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login


  @test
  Scenario: Test integration Twitter homepage
    When see logo social media click x-twitter
    Then verify homepage twitter
