package org.example.pom;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BasePage {

    @Autowired
    protected WebDriver webDriver;

    @PostConstruct
    private void init() {
        PageFactory.initElements(webDriver, this);
    }

}
