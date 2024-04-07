import dto.request.DTOUserProfile;
import endpoints.AuthApi;
import endpoints.ProductsApi;
import org.junit.jupiter.api.*;

public class ProductTest  {
    ProductsApi productsApi;
    static DTOUserProfile DTOUserProfile;

    @BeforeAll
    public static void createUser(){
        DTOUserProfile = new DTOUserProfile("mcncn1","aaaa");
        AuthApi.userRegister(DTOUserProfile);
    }
    @BeforeEach
    public void initTest(){
        productsApi = new ProductsApi(AuthApi.userLogin(DTOUserProfile).jsonPath().getString("access_token"));
    }

    @Test
    @DisplayName("Get products")
    public void getProductsTest(){
        productsApi.getProductsList().prettyPrint();
    }

}
