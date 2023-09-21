package org.example.tests;

import org.example.pom.CheckBoxesPage;
import org.example.pom.HomePage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected WebDriver driver;

    @Autowired
    protected HomePage homePage;

    @Autowired
    protected CheckBoxesPage checkBoxesPage;

    @BeforeTest
    protected void setupWebDriver(){
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @BeforeClass(alwaysRun = true)
    @BeforeSuite(alwaysRun = true)
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
        super.springTestContextPrepareTestInstance();
    }

}
