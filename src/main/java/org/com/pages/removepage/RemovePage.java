package org.com.pages.removepage;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;

public class RemovePage {

    private WebDriverWait wait;
    private WebElement element;


    By elementRemoveBackpack = By.id("remove-sauce-labs-backpack");
    By elementRemoveBikeLight = By.id("remove-sauce-labs-bike-light");
    By elementRemoveBoltTshirt = By.id("remove-sauce-labs-bolt-t-shirt");
    By elementRemoveFleeceJacket = By.id ("remove-sauce-labs-fleece-jacket");
    By elementRemoveBabyTshirt = By.id("remove-sauce-labs-onesie");
    By elementRemoveLongTshirt = By.id("remove-test.allthethings()-t-shirt-(red)");

    By titleRemoveBackPack = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]");



    public void removeBackPack () {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementRemoveBackpack));

            element.click();

            System.out.println("tombol dapat di klik");

        } catch (TimeoutException e) {
            System.out.println("tombol tidak dapat di klik " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan tak terduga tombol 'remove back pack' " + e.getMessage());
        }
    }


    public void removeBikeLight () {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementRemoveBikeLight));

            element.click();

            System.out.println("Tombol dapat di click");

        } catch (TimeoutException e) {
            System.out.println("Tombol tidak dapat di click " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Tiba-tiba terjadi error " + e.getMessage());
        }
    }


    public void removeBoltTshirt () {

       try {
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementRemoveBoltTshirt));

           element.click();

           System.out.println("Tombol dapat di click");
       } catch (TimeoutException e) {
           System.out.println("Tombol tidak dapat di click " + e.getMessage());
       } catch (Exception e) {
           System.out.println("Tib-tiba terjadi error " + e.getMessage());
       }
    }


    public void removeFleceeJacket () {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementRemoveFleeceJacket));

            element.click();

            System.out.println("Tombol dapat di click");
        } catch (TimeoutException e) {
            System.out.println("Tombol tidak dapat di click");
        } catch (Exception e) {
            System.out.println("Tiba-tiba terjadi error " + e.getMessage());
        }
    }


    public void removeBabyTshirt () {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementRemoveBabyTshirt));

            element.click();

            System.out.println("Tombol dapat di click");
        } catch (TimeoutException e) {
            System.out.println("Tombol tidak dapat di click");
        } catch (Exception e) {
            System.out.println("Tiba-tiba terjadi error " + e.getMessage());
        }
    }


    public void removeLongTshirt () {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementRemoveLongTshirt));

            element.click();

            System.out.println("Tombol dapat di click");
        } catch (TimeoutException e) {
            System.out.println("Tombol tidak dapat di click " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Tiba-tiba terjadi error " + e.getMessage());
        }
    }


    public String getRemoveBackPack() {
        String text;

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(titleRemoveBackPack));
        text = element.getText();

        return text;
    }
}
