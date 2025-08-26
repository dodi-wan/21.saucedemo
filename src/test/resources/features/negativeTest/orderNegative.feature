
@test
Feature: order without product



@test
Scenario: Test checkout without product
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