package pages;

import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Condition.text;

public class DropdownPageAsserts extends AbstractAssert<DropdownPageAsserts,DropdownPage> {

    protected DropdownPageAsserts(DropdownPage actual) {
        super(actual, DropdownPage.class);
    }

    public static DropdownPageAsserts assertThat(DropdownPage actual) {
        return new DropdownPageAsserts(actual);
    }

    public DropdownPage page() {return actual;}

    @Step("Проверка текста dropdown")
    public DropdownPageAsserts dropdownCheckText(String expectedText){
        actual.dropDown.shouldHave(text(expectedText));
        return this;
    }


}
