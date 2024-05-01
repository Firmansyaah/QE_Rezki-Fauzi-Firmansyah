package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import  static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class  GetAllDataPost {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint for get all data post")
    public String setApiEndpoint() {
        return url + "posts";
    }

    @Step("I send a request to get all data post")
    public void sendGetAllPostRequest() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for all data post")
    public void receiveValidAllDataPost() {
      //TODO: JSON Schema for validation
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_DATA_POST_SCHEMA);


        restAssuredThat(response -> response.body("'userId'", notNullValue()));
        restAssuredThat(response -> response.body("'id'", notNullValue()));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }

    @Step("I receive status code 500")
    public void receiveStatusCode500() { restAssuredThat(response -> response.statusCode(500)); }

    @Step("I receive an error message 'Internal Server Error'")
    public void receiveErrorMessageInternalServerError() {
        restAssuredThat(response -> response.body("'error'", equalTo("Internal Server Error")));}
}
