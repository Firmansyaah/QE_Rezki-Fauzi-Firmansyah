package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.annotations.Step;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {

    private static String correctUrl = "https://fakestoreapi.com/auth/login";
    private static String wrongUrl = "https://fakestoreapi.com/auth/login/invalid";

    @Step("I set API endpoint for user login")
    public String setApiEndpointLogin() {
        return correctUrl;
    }

    @Step("I set the wrong API endpoint for user login")
    public String setWrongApiEndpointForUserLogin() {
        return wrongUrl;
    }

    @Step("I send a POST request to login with valid data")
    public void sendLoginRequestWithValidData() {
            JSONObject requestBody = new JSONObject();
            requestBody.put("username", "mor_2314");
            requestBody.put("password", "83r5^_");

            SerenityRest.given()
                    .header("Content-Type", "application/json")
                    .body(requestBody.toString())
                    .post(setApiEndpointLogin());
        }
    @Step("I send a POST request to login with valid data invalid endpoint")
    public void sendLoginRequestWithValidDataInvalidEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "83r5^_");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setWrongApiEndpointForUserLogin());
    }
    @Step("I receive status code login 200")
    public void receiveStatusCodeLogin200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive a token in the response")
    public void receiveTokenInResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.LOGIN_SCHEMA);

        restAssuredThat(response -> response.body("token", Matchers.notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I receive status code login 404")
    public void receiveStatusCodeLogin404() {
        restAssuredThat(response -> response.statusCode(404));
    }


}
