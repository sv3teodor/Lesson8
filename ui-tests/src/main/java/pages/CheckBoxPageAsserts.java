package pages;

import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Condition.visible;

public class CheckBoxPageAsserts  extends AbstractAssert<CheckBoxPageAsserts,CheckBoxesPage> {


        protected CheckBoxPageAsserts(CheckBoxesPage actual) {
            super(actual, CheckBoxPageAsserts.class);
        }

        public static CheckBoxPageAsserts assertThat(CheckBoxesPage actual) {
            return new CheckBoxPageAsserts(actual);
        }

        public CheckBoxesPage page(){ return actual;}

    @Step("Проверка видимости чекбокса A")
    public CheckBoxPageAsserts checkBoxAIsVisible(){
        actual.checkBoxA.should(visible);
        return this;
    }

    @Step("Проверка видимости чекбокса B")
    public CheckBoxPageAsserts checkBoxBIsVisible(){
        actual.checkBoxB.should(visible);
        return this;
    }


    @Step("Проверка аттрибута checked чекбокса A")
    public CheckBoxPageAsserts checkBoxAChecked(){
        Assertions.assertThat(actual.checkBoxA.getAttribute("checked"))
                .as("Чекбокс  не выбран")
                .isEqualTo("true");
        return this;
    }

    @Step("Проверка аттрибута checked чекбокса B")
    public CheckBoxPageAsserts checkBoxBChecked(){
        Assertions.assertThat(actual.checkBoxA.getAttribute("checked"))
                .as("Чекбокс  не выбран")
                .isEqualTo("true");
        return this;
    }


}
