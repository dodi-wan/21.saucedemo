package org.com.pages.thirdpartypage;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.helper.Utility.driver;

public class PartyPage {

    private WebDriverWait wait;
    private WebElement element;


    By logoXtwitter = By.xpath("//a[contains (@href, 'https://twitter.com/saucelabs')]");
    By logoFacebook = By.xpath("//a[contains (@href, 'https://www.facebook.com/saucelabs')]");
    By logoLinkedin = By.xpath("//a[contains (@href, 'https://www.linkedin.com/company/sauce-labs/')]");

    By titleTwitter = By.xpath("//span[contains(text(),'Don’t miss what’s happening')]");

    By titleFacebook = By.xpath("//span[contains(text(),'See more from Sauce Labs')]");
    By facebookAddress = By.xpath("//span[contains(text(),'or')]");

    By joinLinkedin = By.xpath("//p[@class='windows-app-upsell__body font-sans text-sm text-color-text-secondary leading-regular']");
    By titleLinkedin = By.xpath("//p[contains(text(),'LinkedIn is better on the app')]");
    By linkedinApp = By.xpath("//a[normalize-space()='Open the app']");



    public void xTwitter () {
        driver.findElement(logoXtwitter).click();
    }


    public String validateTwitter() {
        String text= null;
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(titleTwitter));
            text = element.getText();
        } catch (TimeoutException t) {
            System.out.println("timeout " + t.getMessage());
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
        return text;
    }


    public void facebook() {
        driver.findElement(logoFacebook).click();
    }


    public String addressFacebook(){
        String text = null;
        try{
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(facebookAddress));
            text = element.getText();
        } catch (TimeoutException t) {
            System.out.println("result " + t.getMessage());
        } catch (Exception e) {
            System.out.println("result " + e.getMessage());
        }
        return text;
    }


    public String validateFacebook() {
        String text = null;
        try{
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(titleFacebook));
            text = element.getText();
        } catch (TimeoutException t) {
            System.out.println("result " + t.getMessage());
        } catch (Exception e) {
            System.out.println("result " + e.getMessage());
        }
        return text;
    }


    public void linkedin() {
        driver.findElement(logoLinkedin).click();
    }


    public boolean storeLinkedin() {

        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(joinLinkedin));
            element.getText();
        } catch (TimeoutException t) {
            System.out.println("result " + t.getMessage());
        } catch (Exception e) {
            System.out.println("result " + e.getMessage());
        }
        return true;
    }


    public boolean validateLinkedin() {

        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(titleLinkedin));
            element.getText();
        } catch (TimeoutException t) {
            System.out.println("result " + t.getMessage());
        } catch (Exception e) {
            System.out.println("result " + e.getMessage());
        }
        return true;
    }


    public boolean appLinkedin(){

        try{
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(linkedinApp));
            element.getText();
        } catch (TimeoutException t) {
            System.out.println("result " + t.getMessage());
        } catch (Exception e) {
            System.out.println("result " + e.getMessage());
        }
        return true;
    }
}
