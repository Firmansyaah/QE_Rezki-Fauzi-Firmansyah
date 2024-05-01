package starter.user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetDataPostById {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint for get data by ID")
    public String setApiEndpointByID() {
        return url + "posts" + "1";
    }

    @Step("I send a GET request to get post data by ID 1")
    public Response sendGetPostRequest() {
        return SerenityRest.given()
                .pathParam("postId", 1)
                .get("/posts/{PostId}");
    }

    @Step("I receive a response with status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response1 -> response1.statusCode(200));
    }

    @Step("the post data is returned for ID 1")
    public void verifyPostData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_DATA_POST_BY_ID_SCHEMA);

        restAssuredThat(response -> response.body( "userId", equalTo(1)));
        restAssuredThat(response -> response.body( "id", equalTo(1)));
        restAssuredThat(response -> response.body( "title", equalTo("sunt aut facere repelat provident occaecati excepturi optio reprehenderit")));
        restAssuredThat(response -> response.body( "body", equalTo("quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto")));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }

    @Step("I send a GET request to get post data by invalid ID -1")
    public Response sendGetPostRequestInvalid() {
        return SerenityRest.given()
                .pathParam("postId", -1)
                .get("/posts/{postId}");
    }

    public void sendGetPostRequestInvalid(int i) {
    }

    public void sendGetPostRequest(int i) {
    }

    public void verifyPostData(int i) {
    }
}
