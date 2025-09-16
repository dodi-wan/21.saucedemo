package org.com.pages.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;


public class LoginPage {

    private WebDriverWait wait;
    private WebElement element;

    By userName = By.id("user-name");
    By passwordUserName = By.id("password");
    By buttonLogin = By.id("login-button");

    By validateTitle = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
    By validateDesc = By.xpath("//div[contains(text(),'carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.')]");
    By validateProduct = By.xpath("//span[contains(text(),'Products')]");

    By messageLogin (String message) {
        return By.xpath("//*[contains (text (), '" + message + "' )]");
    }

    By messageValidate = By.cssSelector("h3[data-test='error']");



    public void userName (String username) {
        driver.findElement(userName).sendKeys(username);
    }



    public void password (String pass) {
        driver.findElement(passwordUserName).sendKeys(pass);
    }



    public void buttonLogin () {
        driver.findElement(buttonLogin).click();
    }



    public String validateBackPack(){
        String text;

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(validateTitle));
        text = driver.findElement(validateTitle).getText();
        return text;
    }



    public String descValidate() {
        String text;

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(validateDesc));
        text = element.getText();
        return text;
    }



    public String productValidate() {
        String text;

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(validateProduct));
        text = element.getText();
        return text;
    }



    public String messageButton (String messageButton) {
        String text;

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(messageLogin(messageButton)));
        text = element.getText();
        return text;
    }



    public String validateMessages() {
        String text;

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(messageValidate));
        text = element.getText();
        return text;
    }



    public String validateMessageBva(){
        String text;

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(messageValidate));
        text = element.getText();
        return text;
    }
}