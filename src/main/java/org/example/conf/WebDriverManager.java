package org.example.conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeWebDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
