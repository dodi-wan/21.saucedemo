package org.com.Pages;

import org.openqa.selenium.By;

import static org.com.helper.utility.driver;

public class addProductPage {



    By back_pack = By.id("add-to-cart-sauce-labs-backpack");

    By bike_light = By.id("add-to-cart-sauce-labs-bike-light");

    By bolt_tshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    By flecee_jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");

    By baby_tshirt = By.id("add-to-cart-sauce-labs-onesie");

    By long_tshirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    By shoppping_cart = By.xpath ("//a[contains (@class, 'shopping_cart_link')]");



    public void backPack () {
        driver.findElement(back_pack).click();
    }


    public void bikeLight () {
        driver.findElement(bike_light).click();
    }


    public void tShirt () {
        driver.findElement(bolt_tshirt).click();
    }


    public void jacket () {
        driver.findElement(flecee_jacket).click();
    }


    public void babyTshirt () {
        driver.findElement(baby_tshirt).click();
    }


    public void longTshirt () {
        driver.findElement(long_tshirt).click();
    }


    public void shoppingCart() {
        driver.findElement(shoppping_cart).isSelected();
    }
}
