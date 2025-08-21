Feature: Test Negative Automation

  Description: Negative test login without credential data
    1. login no input user, expected: show message "Epic sadface: Username is required"
    2. System cannot process order without product, expected: cannot checkout order


  Scenario: login username
    And input "" and ""
    Then click button login
    Given message "Epic sadface: Username is required"



    Scenario: delete item checkout product
      And input "standard_user" and "secret_sauce"
      Then click button login
      And click add to cart "Sauce Labs Backpack"
      And click shop cart
      And click remove it
      And the checkout button  is showed, click it
      And the text First Name Last Name Postal Code "433" is showed input it
      Then click continue button
      And click finish button
      Then the result is showed text "Thank you for your order!"






