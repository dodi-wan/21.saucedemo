package org.com.pages.addpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;

public class AddProductPage {



    By back_pack = By.id("add-to-cart-sauce-labs-backpack");

    By bike_light = By.id("add-to-cart-sauce-labs-bike-light");

    By bolt_tshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    By flecee_jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");

    By baby_tshirt = By.id("add-to-cart-sauce-labs-onesie");

    By long_tshirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    By shoppping_cart = By.xpath ("//a[contains (@class, 'shopping_cart_link')]");



    public void backPack () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(back_pack));

        element.click();
    }


    public void bikeLight () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(bike_light));

        element.click();
    }


    public void tShirt () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(bolt_tshirt));

        element.click();
    }


    public void jacket () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(flecee_jacket));

        element.click();
    }


    public void babyTshirt () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(baby_tshirt));

        element.click();
    }


    public void longTshirt () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(long_tshirt));

        element.click();

    }


    public void shoppingCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(shoppping_cart));

        element.click();
    }
}
