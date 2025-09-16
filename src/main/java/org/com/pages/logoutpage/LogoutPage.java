package org.com.pages.logoutpage;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;

public class LogoutPage {

    private WebDriverWait wait;
    private WebElement element;


    By homepageLogin = By.xpath("//div[@class='app_logo']");

    By menu = By.id("react-burger-menu-btn");

    By buttonLogout = By.id("logout_sidebar_link");

    By elementListUsername = By.xpath("//h4[normalize-space()='Accepted usernames are:']");
    By elementPassword = By.xpath("//h4[normalize-space()='Password for all users:']");
    By elementTitle = By.xpath("(//div[@class='login_logo'])[1]");




    public void menu_bar() {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(menu));
            element.click();
            System.out.println("Tombol dapat di click");


        } catch (TimeoutException e) {
            System.out.println("Tombol tidak dapat di click " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("Terjadi error pada saat click " + e.getMessage());
            throw e;
        }
    }


    public void logoutButton() {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(buttonLogout));
            element.click();
            System.out.println("Tombol berhasil di click");

        } catch (TimeoutException e) {
            System.out.println("tombol tidak dapat di klik dan ada kesalahan " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan tak terduga saat click tombol 'logout' " + e.getMessage());
        }

    }


    public String listUser() {
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementListUsername));
        text = element.getText();

        return text;
    }


    public String listPassword() {
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementPassword));
        text = element.getText();

        return text;
    }


    public String titleSwagLabs() {
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementTitle));
        text = element.getText();

        return text;
    }
}
