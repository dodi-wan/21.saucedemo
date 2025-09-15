package org.com.pages.orderpage;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;


public class OrderPage {

    private WebDriverWait wait;
    private WebElement element;


    By elementRemoveProduct = By.id("remove-sauce-labs-backpack");

    By checkout = By.id("checkout");

    By elementFirstName = By.xpath("//input[@data-test = 'firstName']");

    By elementLastName = By.id("last-name");

    By elementPostalCode = By.xpath("//input[@placeholder=\"Zip/Postal Code\"]");

    By elementContinueCheckout = By.id("continue");

    By elementFinishButton = By.id("finish");

    By elementOrderFinish =  By.xpath("(//h2[normalize-space()='Thank you for your order!'])[1]");
    By elementText1 = By.xpath("(//div[normalize-space()='Your order has been dispatched, and will arrive just as fast as the pony can get there!'])");
    By messageOrder (String message) {
        return By.xpath("//*[contains (text (), '" + message + "' )]");
    }



    public void removeProduct(){
        driver.findElement(elementRemoveProduct).click();
    }

    public void yourCart(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(checkout));
            element.click();

        } catch (TimeoutException e) {
            System.out.println("Tidak bisa di click " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("Di click tetapi error " + e.getMessage());
            throw e;
        }
    }


    public void firstName(String firstname){
        driver.findElement(elementFirstName).sendKeys(firstname);
    }


    public void lastName(String lastname) {
        driver.findElement(elementLastName).sendKeys(lastname);
    }


    public void postalCode(String postalcode){
        driver.findElement(elementPostalCode).sendKeys(postalcode);
    }

    public void continueCheckout() {
        driver.findElement(elementContinueCheckout).click();
    }

    public void finishButton(){
        driver.findElement(elementFinishButton).click();
    }

    public String finishOrder(String message){
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(messageOrder(message)));
        text = element.getText();

        return text;
    }


    public String finishTextOrder(String message){
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(messageOrder(message)));
        text = element.getText();

        return text;
    }
}
