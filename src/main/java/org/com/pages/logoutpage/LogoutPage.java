package org.com.pages.logoutpage;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;

public class LogoutPage {


    By homepage_login = By.xpath("//div[@class='app_logo']");

    By menu = By.id("react-burger-menu-btn");

    By button_logout = By.id("logout_sidebar_link");




    public void validate_login () {
        driver.findElement(homepage_login).isDisplayed();
    }


    public void menu_bar () {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(menu));
//            wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));

            element.click();
            System.out.println("Tombol dapat di click");


        } catch (TimeoutException e){
            System.out.println("Tombol tidak dapat di click " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("Terjadi error pada saat click "+ e.getMessage());
            throw e;
        }
    }


    public void logoutButton () {

        try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(button_logout));

        element.click();

        System.out.println("Tombol berhasil di click");

    } catch (TimeoutException e) {
            System.out.println("tombol tidak dapat di klik dan ada kesalahan " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Terjadi kesalahan tak terduga saat click tombol 'logout' " + e.getMessage());
        }

    }
}
