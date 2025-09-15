package org.com.pages.filterpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;

public class FilterPage {

    private WebDriverWait wait;
    private WebElement element;

    By buttonFilter= By.xpath("//select[@class='product_sort_container']");

    By sortNameAZ = By.xpath("//option[contains (@value, 'az')]");
    By aZvalidate = By.xpath("//span[contains(text(),'Name (A to Z)')]");
    By azSortValidate = By.xpath("//div[contains(text(),'Test.allTheThings() T-Shirt (Red)')]");

    By sortNameZA = By.xpath("//option[contains (@value, 'za')]");
    By zAvalidate = By.xpath("//span[contains(text(),'Name (Z to A)')]");

    By sortPriceLohi = By.xpath("//option[contains (@value, 'lohi')]");
    By loHiValidate = By.xpath("//span[contains(text(),'Price (low to high)')]");
    By loHiPrice = By.xpath("//div[@class='inventory_list']//div[1]//div[2]//div[2]//div[1]");
    By loHiLastPrice = By.xpath("//*[@id='inventory_container']/div/div[6]/div[2]/div[2]/div");

    By sortPriceHilo = By.xpath("//option[contains (@value, 'hilo')]");
    By hiLoValidate = By.xpath("//span[contains(text(),'Price (high to low)')]");




    public void filter () {
        driver.findElement(buttonFilter).click();
    }



    public void filterNameAZ () {
        driver.findElement(sortNameAZ).click();
    }



    public String validateAz() {
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(aZvalidate));
        text = element.getText();

        return text;
    }



    public String validateSortAz() {
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(azSortValidate));
        text = element.getText();

        return text;
    }



    public void filterNameZA () {
        driver.findElement(sortNameZA).click();
    }



    public String validateZa() {
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(zAvalidate));
        text = element.getText();

        return text;
    }



    public void priceLowHigh () {
        driver.findElement(sortPriceLohi).click();
    }



    public String validateLoHi() {
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(loHiValidate));
        text = element.getText();

        return text;
    }



    public String validatePriceLoHi() {
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(loHiPrice));
        text = element.getText();

        return text;
    }



    public String validateLastPriceLoHi() {
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(loHiLastPrice));
        text = element.getText();

        return text;
    }



    public void priceHighLow () {
        driver.findElement(sortPriceHilo).click();
    }



    public String getTextHiLo() {
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(hiLoValidate));
        text = element.getText();

        return text;
    }
}
