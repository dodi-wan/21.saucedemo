package org.com.helper;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Utility {

    public static WebDriver driver;


    public static void run_driver () {
        ChromeOptions options = new ChromeOptions();

        String userDataDir = System.getProperty("java.io.tmpdir") + "/chrome-user-data-" + System.currentTimeMillis();
        options.addArguments(
                "--user-data-dir=" + userDataDir,
                "--no-sandbox", //merupakan bukan versi beta atau no bug
                "--disable-dev-shm-usage", //tujuannya agar memory di browser (chrome) tidak crash khususnya di ci/cd
                "--remote-allow-origin=*", //dapat di akses dengan mudah karena situs belajar & tidak cocok untuk production
                "--start-maximized", //tampilan window full
                "--disable-popup-blocking",
                "--disable-notification",
                "--incognito",
                "--headless-new",
                "--disable-gpu");

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    public void close_driver () {
        if (driver != null) { //statement bahwa driver tidak null
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
        driver.quit(); //setelah test selesai akan menutup driver (window)
        driver = null; //sebagai penanda driver sudah di tutup dan memutus objek webDriver
            }
        }
    }
}
