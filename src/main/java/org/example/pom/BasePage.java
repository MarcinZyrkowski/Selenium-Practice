package org.example.pom;

import org.example.conf.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class BasePage {

    protected WebDriver webDriver =
        WebDriverManager.getWebDriver();

    public BasePage() {
        PageFactory.initElements(webDriver, this);
    }

    @AfterTest
    public void tearDown() {
        WebDriverManager.closeWebDriver();
    }

}
