package starter.user.cart;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateACard {

    private static String url = "https://fakestoreapi.com/carts/7";
    private static String invalidUrl = "https://fakestoreapi.com/carts/-9/invalid";

    private JSONObject requestBody;

    @Step("I set the API endpoint for update a specific cart data")
    public String setAPIUpdatedCartData() {
        return url;
    }

    @Step("I set the invalid API endpoint for update a specific cart data")
    public String setInvalidAPIUpdatedCartData() {
        return invalidUrl;
    }

    @Step("I send a request to update cart data")
    public void sendRequestUpdateCartData() {
        requestBody = new JSONObject();
        requestBody.put("userId", 3);
        requestBody.put("date", "2019-12-10");

        JSONArray productsArray = new JSONArray();
        JSONObject product = new JSONObject();
        product.put("productId", 1);
        product.put("quantity", 3);
        productsArray.put(product);

        requestBody.put("products", productsArray);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setAPIUpdatedCartData());
    }

    @Step("I send a request to update cart data with invalid endpoint")
    public void sendRequestUpdateCartDataWithInvalidEndpoint() {
        requestBody = new JSONObject();
        requestBody.put("userId", 3);
        requestBody.put("date", "2019-12-10");

        JSONArray productsArray = new JSONArray();
        JSONObject product = new JSONObject();
        product.put("productId", 1);
        product.put("quantity", 3);
        productsArray.put(product);

        requestBody.put("products", productsArray);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setInvalidAPIUpdatedCartData());
    }

    @Step("I should get the data cart that I updated")
    public void receiveDataCartUpdated() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_CART_DATA_SCHEMA);

        restAssuredThat(response -> response.body("id", Matchers.equalTo(7)));
        restAssuredThat(response -> response.body("userId", Matchers.equalTo(3)));
        restAssuredThat(response -> response.body("date", Matchers.equalTo("2019-12-10")));
        restAssuredThat(response -> response.body("products[0].productId", Matchers.equalTo(1)));
        restAssuredThat(response -> response.body("products[0].quantity", Matchers.equalTo(3)));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("I should receive a status code of 404")
    public void verifyStatusCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I should receive an update error message")
    public void receiveUpdateErrorMessage() {
        restAssuredThat(response -> response.body("message", Matchers.notNullValue()));
    }
}
