package org.com.pages;

import org.openqa.selenium.By;

import static org.com.helper.Utility.driver;

public class PartyPage {

    By logoXtwitter = By.xpath("//a[contains (@href, 'https://twitter.com/saucelabs')]");

    By logoFacebook = By.xpath("//a[contains (@href, 'https://www.facebook.com/saucelabs')]");

    By logoLinkedin = By.xpath("//a[contains (@href, 'https://www.linkedin.com/company/sauce-labs/')]");



    public void xTwitter () {
        driver.findElement(logoXtwitter).click();
    }



    public void facebook () {
        driver.findElement(logoFacebook).click();
    }


    public void linkedin () {
        driver.findElement(logoLinkedin).click();
    }
}
