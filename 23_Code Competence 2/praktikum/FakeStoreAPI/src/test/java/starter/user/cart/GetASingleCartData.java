package starter.user.cart;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetASingleCartData {
    private static String validUrl = "https://fakestoreapi.com/carts/5";
    private static final String INVALID_PARAMS_URL = "https://fakestoreapi.com/carts/0/invalid";

    @Step("I set the API endpoint for a single cart data")
    public String setAPIEndpointSingleCart() {
        return validUrl;
    }

    @Step("I set the API endpoint for a single cart data with invalid parameters")
    public String setAPIEndpointForSingleCartDataWithInvalidParameters() {
        return INVALID_PARAMS_URL;
    }

    @Step("I send a request to retrieve single cart data")
    public void sendRequestSingleCart() {
        SerenityRest.given()
                .get(setAPIEndpointSingleCart());
    }

    @Step("I send a request to retrieve single cart data with invalid URL")
    public void sendRequestSingleCartWithInvalidUrl() {
        SerenityRest.given()
                .get(setAPIEndpointForSingleCartDataWithInvalidParameters());
    }

    @Step("I should receive a specific single cart data")
    public void receiveSingleCartData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_A_SINGLE_CART_DATA_SCHEMA);

        restAssuredThat(response -> response.body("id", Matchers.equalTo(5)));
        restAssuredThat(response -> response.body("userId", Matchers.equalTo(3)));
        restAssuredThat(response -> response.body("date", Matchers.equalTo("2020-03-01T00:00:00.000Z")));
        restAssuredThat(response -> response.body("products[0].productId", Matchers.equalTo(7)));
        restAssuredThat(response -> response.body("products[0].quantity", Matchers.equalTo(1)));
        restAssuredThat(response -> response.body("products[1].productId", Matchers.equalTo(8)));
        restAssuredThat(response -> response.body("products[1].quantity", Matchers.equalTo(1)));
        restAssuredThat(response -> response.body("__v", Matchers.equalTo(0)));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }


    @Step("I should receive an error message")
    public void receiveErrorMessage() {
        restAssuredThat(response -> response.body("message", Matchers.notNullValue()));
    }
}
