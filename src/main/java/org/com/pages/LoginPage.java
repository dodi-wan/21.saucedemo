package org.com.pages;

import org.openqa.selenium.By;

import static org.com.helper.Utility.driver;
import static org.com.helper.Utility.run_driver;


public class LoginPage {

    By user_name = By.id("user-name");

    By pass_word = By.id("password");

    By button_login = By.id("login-button");

    By message_login (String message) {
        return By.xpath("//*[contains (text (), '" + message + "' )]");
    }




    public void userName (String username) {
        driver.findElement(user_name).sendKeys(username);
    }

    public void password (String pass) {
        driver.findElement(pass_word).sendKeys(pass);
    }

    public void buttonLogin () {
        driver.findElement(button_login).click();
    }

    public void message_button (String messageButton) {
        driver.findElement(message_login(messageButton)).isDisplayed();
    }



}