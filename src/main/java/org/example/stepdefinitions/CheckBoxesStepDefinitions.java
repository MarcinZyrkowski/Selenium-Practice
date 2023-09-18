package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import org.example.pom.CheckBoxesPage;

public class CheckBoxesStepDefinitions {

    public CheckBoxesPage checkBoxesPage = new CheckBoxesPage();

    @And("Click on checkbox nr one")
    public void clickOnCheckboxes() {
        checkBoxesPage.clickCheckboxOne();
    }

}
