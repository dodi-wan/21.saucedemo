package org.com.Pages;

import org.openqa.selenium.By;

import static org.com.helper.utility.driver;

public class logoutPage {


    By homepage_login = By.xpath("//div[@class='app_logo']");

    By menu = By.id("react-burger-menu-btn");

    By button_logout = By.id("logout_sidebar_link");




    public void validate_login () {
        driver.findElement(homepage_login).isDisplayed();
    }


    public void menu_bar () {
        driver.findElement(menu).click();
    }


    public void logoutButton () {
        driver.findElement(button_logout).click();
    }
}
