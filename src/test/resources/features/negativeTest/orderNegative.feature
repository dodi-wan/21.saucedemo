
@test
Feature: order without product


  Background:
    And input "standard_user" and "secret_sauce"
    Then click button login
    Then verify login


@test
  Scenario Outline: Test checkout without product
  And click add to cart "Sauce Labs Backpack"
  When click shopping cart
  And click remove it
  And the checkout button  is showed, click it
  And the text First Name "uzumaki" Last Name "wahyu" Postal Code "433" is showed input it
  Then click continue button
  And click finish button
  Then the result is showed text "<message>"

  Examples:
  |                                         message                                        |
  |                               Thank you for your order!                                |
  |Your order has been dispatched, and will arrive just as fast as the pony can get there! |
  |                                 Checkout: Complete!                                    |