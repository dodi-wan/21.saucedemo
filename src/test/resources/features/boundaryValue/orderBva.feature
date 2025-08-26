

Feature: no input postal code

Scenario: postal code
And input "standard_user" and "secret_sauce"
Then click button login
And click add to cart "Sauce Labs Backpack"
When see product at shopping cart
And the checkout button  is showed, click it
And the text First Name Last Name Postal Code "" is showed input it
Then click continue button