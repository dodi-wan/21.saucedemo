Feature: Test BVA username and password


  Description:
    boundary value input username minimum 8 character. Expected: message error, input username less 8 character
    boundary value input username max 21 character. Expected: if input username less 21 character
    message show "performance_glitch_user"


  Scenario: BVA login username and password
    And input "error_use" and "secret_sauce"
    Then click button login
    Given message "Epic sadface: Username and password do not match any user in this service"


  Scenario: BVA login username and password
    And input "performance_glitch_userr" and "secret_sauce"
    Then click button login
    Given message "Epic sadface: Username and password do not match any user in this service"


  Scenario: postal code
    And input "standard_user" and "secret_sauce"
    Then click button login
    And click add to cart "Sauce Labs Backpack"
    When see product at shopping cart
    And the checkout button  is showed, click it
    And the text First Name Last Name Postal Code "" is showed input it
    Then click continue button