package pages;

import org.assertj.core.api.AbstractAssert;

public class InputsPageAsserts extends AbstractAssert<InputsPageAsserts,InputsPage> {

    protected InputsPageAsserts(InputsPage actual) {
        super(actual, DropdownPage.class);
    }

    public static InputsPageAsserts assertThat(InputsPage actual) {
        return new InputsPageAsserts(actual);
    }

    public InputsPage page() { return actual;}
}
