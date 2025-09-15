package org.com.pages.addpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;

public class AddProductPage {

    private WebDriverWait wait;
    private WebElement element;


    By elementBackPack = By.id("add-to-cart-sauce-labs-backpack");
    By elementBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By elementBoltTshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By elementFleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By elementBabyTshirt = By.id("add-to-cart-sauce-labs-onesie");
    By elementLongTshirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By elementShoppingCart = By.xpath ("//span[contains(text(),'')]");

    By elementRemove = By.xpath("//button[contains(text(),'Remove')]");



    public void backPack () {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        element = wait.until(ExpectedConditions.elementToBeClickable(elementBackPack));

        element.click();
    }


    public void bikeLight () {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        element = wait.until(ExpectedConditions.elementToBeClickable(elementBikeLight));

        element.click();
    }


    public void tShirt () {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        element = wait.until(ExpectedConditions.elementToBeClickable(elementBoltTshirt));

        element.click();
    }


    public void jacket () {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        element = wait.until(ExpectedConditions.elementToBeClickable(elementFleeceJacket));

        element.click();
    }


    public void babyTshirt () {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        element = wait.until(ExpectedConditions.elementToBeClickable(elementBabyTshirt));

        element.click();
    }


    public void longTshirt () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLongTshirt));

        element.click();

    }


    public String shoppingCart() {
        String text;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementShoppingCart));
        text = element.getText();

        return text;
    }



    public String validateRemove() {
        String text;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementRemove));
        text = element.getText();

        return text;
    }
}
