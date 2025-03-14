package org.com.Pages;

import org.openqa.selenium.By;

import static org.com.helper.utility.driver;

public class removePage {


    By removeBack_pack = By.id("remove-sauce-labs-backpack");

    By removeBike_light = By.id("remove-sauce-labs-bike-light");

    By removeBolt_tshirt = By.id("remove-sauce-labs-bolt-t-shirt");

    By remove_flecee_jacket = By.id ("remove-sauce-labs-fleece-jacket");

    By remove_baby_tshirt = By.id("remove-sauce-labs-onesie");

    By remove_long_tshirt = By.id("remove-test.allthethings()-t-shirt-(red)");





    public void removeBackPack () {
        driver.findElement(removeBack_pack).click();
    }


    public void removeBikeLight () {
        driver.findElement(removeBike_light).click();
    }


    public void removeBoltTshirt () {
        driver.findElement(removeBolt_tshirt).click();
    }


    public void removeFleceeJacket () {
        driver.findElement(remove_flecee_jacket).click();
    }


    public void removeBabyTshirt () {
        driver.findElement(remove_baby_tshirt).click();
    }


    public void removeLongTshirt () {
        driver.findElement(remove_long_tshirt).click();
    }
}
