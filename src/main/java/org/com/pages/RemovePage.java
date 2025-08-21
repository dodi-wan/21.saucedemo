package org.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;

public class RemovePage {


    By removeBack_pack = By.id("remove-sauce-labs-backpack");

    By removeBike_light = By.id("remove-sauce-labs-bike-light");

    By removeBolt_tshirt = By.id("remove-sauce-labs-bolt-t-shirt");

    By remove_flecee_jacket = By.id ("remove-sauce-labs-fleece-jacket");

    By remove_baby_tshirt = By.id("remove-sauce-labs-onesie");

    By remove_long_tshirt = By.id("remove-test.allthethings()-t-shirt-(red)");





    public void removeBackPack () {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(removeBack_pack));

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
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(removeBike_light));

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
           WebElement element = wait.until(ExpectedConditions.elementToBeClickable(removeBolt_tshirt));

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
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(remove_flecee_jacket));

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
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(remove_baby_tshirt));

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
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(remove_long_tshirt));

            element.click();

            System.out.println("Tombol dapat di click");
        } catch (TimeoutException e) {
            System.out.println("Tombol tidak dapat di click " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Tiba-tiba terjadi error " + e.getMessage());
        }
    }
}
