package assertions;

import dto.request.DTOProducts;
import io.restassured.response.Response;
import org.assertj.core.api.AbstractAssert;

import static org.apache.http.HttpStatus.SC_OK;

public class ProductsAssert extends AbstractAssert<ProductsAssert, Response> {
    public ProductsAssert(Response actual){
        super(actual,ProductsAssert.class);
    }

    public static ProductsAssert assertThat(Response actual) {
        return new ProductsAssert(actual);
    }

    public ProductsAssert getProductResponse(DTOProducts DTOProducts) {
        BasicAsserts.assertThat(actual)
                .statusCodeIsEqual(SC_OK);
   //TODO

        return this;
    }


}
