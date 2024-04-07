import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests extends BaseTest {

    @Test
    @DisplayName("Задание 1. Проверка чекбоксов")
    public void checkBoxesTest(){
        homePage.clickCheckBoxesLink()
                .clickCheckBoxA()
                .check()
                .checkBoxAIsVisible()
                .checkBoxAChecked();
    }

    @Test
    @DisplayName("Задание 2. Проверка dropdown")
    public void dropDownTest(){
        int itemNumber=1;
        homePage.clickDropdownLink()
                .selectOptions(itemNumber)
                .check();

                //.dropdownCheckText(String.format("Option %s", itemNumber));
        Selenide.sleep(5000);

    }

}
