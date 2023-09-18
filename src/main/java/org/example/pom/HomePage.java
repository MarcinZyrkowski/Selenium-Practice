package org.example.pom;

import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.CSS, using = "a[href='/checkboxes']")
    public WebElement checkboxes;


    @SneakyThrows
    public void openHomePage() {
        webDriver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);
    }

    @SneakyThrows
    public void clickOnCheckBoxes() {
        checkboxes.click();
        Thread.sleep(1000);
    }

}
