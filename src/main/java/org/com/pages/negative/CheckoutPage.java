package org.com.pages.negative;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;


public class CheckoutPage {


    By remove_product = By.id("remove-sauce-labs-backpack");

    By checkout = By.id("checkout");

    By first_name = By.xpath("//input[@data-test = 'firstName']");

    By last_name = By.id("last-name");

    By postal_code = By.xpath("//input[@placeholder=\"Zip/Postal Code\"]");

    By continue_checkout = By.id("continue");

    By finish_button = By.id("finish");

    By order_finish =  By.xpath("//h2[@data-test = 'complete-header']");



    public void removeProduct(){
        driver.findElement(remove_product).click();
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


    public void firstName(){
        driver.findElement(first_name).sendKeys("uzumaki");
    }


    public void lastName() {
        driver.findElement(last_name).sendKeys("naruto");
    }


    public void postalCode(String postalcode){
        driver.findElement(postal_code).sendKeys(postalcode);
//
    }

    public void continueCheckout() {
        driver.findElement(continue_checkout).click();
    }

    public void finishButton(){
        driver.findElement(finish_button).click();
    }

    public void finishOrder(){
        driver.findElement(order_finish).isDisplayed();
    }
}
