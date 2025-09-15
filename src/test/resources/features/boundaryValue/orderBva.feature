

@test
Feature: BVA no input profile customer First Name Last Name and postal code

@test
Scenario Outline: Test BVA no input profile customer First Name Last Name and postal code
And input "standard_user" and "secret_sauce"
Then click button login
And click add to cart "Sauce Labs Backpack"
When click shopping cart
And the checkout button  is showed, click it
And the text First Name "" Last Name "" Postal Code "" is showed input it
And click continue button
Then validate BVA "<message>"

  Examples:
  |           message             |
  | Error: First Name is required |