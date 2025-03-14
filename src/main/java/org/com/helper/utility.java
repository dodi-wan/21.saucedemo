package org.com.helper;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class utility {

    public static WebDriver driver;


    public static void run_driver () {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox"); //merupakan bukan versi beta atau no bug
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origin=*");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void close_driver () {
        if (driver !=null) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
        driver.quit();
        driver = null;
            }
        }
    }
}
