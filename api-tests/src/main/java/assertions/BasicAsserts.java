package assertions;

import io.restassured.response.Response;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class BasicAsserts extends AbstractAssert<BasicAsserts, Response> {
    public BasicAsserts(Response actual) {
        super(actual, BasicAsserts.class);
    }

    public static BasicAsserts assertThat(Response actual) {
        return new BasicAsserts(actual);
    }

    public BasicAsserts statusCodeIsEqual(int expectedCode) {
        Assertions.assertThat(actual.getStatusCode())
                .as("Код ответа не равен" + expectedCode)
                .isEqualTo(expectedCode);
        return this;
    }

    public BasicAsserts responseFieldIsEqual(String filedName, String fieldValue) {
        Assertions.assertThat(actual.jsonPath().getString(filedName))
                .as("Поле %s не равно %s".formatted(filedName, fieldValue))
                .isEqualTo(fieldValue);
        return this;
    }


}
