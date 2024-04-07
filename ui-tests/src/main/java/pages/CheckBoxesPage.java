package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckBoxesPage {

    SelenideElement checkBoxA = $x("//*[@id=\"checkboxes\"]/input[1]");
    SelenideElement checkBoxB = $x("//*[@id=\"checkboxes\"]/input[2]");

    @Step("Проверка страницы CheckBox")
    public CheckBoxPageAsserts check() {
        return CheckBoxPageAsserts.assertThat(this);
    }

    @Step("Клик по чекбоксу А")
    public CheckBoxesPage clickCheckBoxA() {
        checkBoxA.should(visible).click();
        return this;
    }

    @Step("Клик по чекбоксу B")
    public CheckBoxesPage clickCheckBoxB() {
        checkBoxB.should(visible).click();
        return this;
    }


}
