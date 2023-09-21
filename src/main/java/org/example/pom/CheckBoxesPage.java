package org.example.pom;

import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class CheckBoxesPage extends BasePage {

    @FindBy(how = How.CSS, using = "input:nth-child(1)")
    public WebElement firstCheckbox;

    @SneakyThrows
    public void clickCheckboxOne() {
        firstCheckbox.click();
        Thread.sleep(1000);
    }

}
