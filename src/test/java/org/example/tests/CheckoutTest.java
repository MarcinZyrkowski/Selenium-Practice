package org.example.tests;

import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {

        homePage.clickOnCheckBoxes();
        checkBoxesPage.clickCheckboxOne();

    }

}
