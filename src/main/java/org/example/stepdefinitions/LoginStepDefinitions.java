package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pom.HomePage;

public class LoginStepDefinitions {

    public HomePage homePage = new HomePage();

    @Given("Open homepage")
    public void openHomepage() {
        homePage.openHomePage();
    }

    @And("Click on checkboxes")
    public void clickOnCheckboxes() {
        homePage.clickOnCheckBoxes();
    }

}
