package pages;

import org.assertj.core.api.AbstractAssert;

public class DisappearingElementsPageAsserts extends AbstractAssert<DisappearingElementsPageAsserts,DisappearingElementsPage> {

    protected DisappearingElementsPageAsserts(DisappearingElementsPage actual) {
        super(actual, DisappearingElementsPage.class);
    }

    public static DisappearingElementsPageAsserts assertThat(DisappearingElementsPage actual) {
        return new DisappearingElementsPageAsserts(actual);
    }

    public DisappearingElementsPage page() { return actual;}
}
