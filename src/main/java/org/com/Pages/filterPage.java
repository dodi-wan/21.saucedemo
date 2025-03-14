package org.com.Pages;

import org.openqa.selenium.By;

import static org.com.helper.utility.driver;

public class filterPage {

    By buttonFilter= By.xpath("//select[@class='product_sort_container']");

    By sortName_AZ = By.xpath("//option[contains (@value, 'az')]");

    By sortName_ZA = By.xpath("//option[contains (@value, 'za')]");

    By sortPrice_lohi = By.xpath("//option[contains (@value, 'lohi')]");

    By sortPrice_hilo = By.xpath("//option[contains (@value, 'hilo')]");



    public void filter () {
        driver.findElement(buttonFilter).click();
    }


    public void filterNameAZ () {
        driver.findElement(sortName_AZ).click();
    }


    public void filterNameZA () {
        driver.findElement(sortName_ZA).click();
    }


    public void priceHighLow () {
        driver.findElement(sortPrice_lohi).click();
    }


    public void priceLowHigh () {
        driver.findElement(sortPrice_hilo).click();
    }
}
