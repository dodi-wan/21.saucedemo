package org.com.pages.bvapage;

import org.openqa.selenium.By;

import static org.com.helper.Utility.driver;

public class BvaPage {

    By shopCart = By.xpath("//span[@class='shopping_cart_badge']");


    public void clickShopCart() {
        driver.findElement(shopCart).click();
    }
}
